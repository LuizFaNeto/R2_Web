package com.example.R2.service;

import com.example.R2.dto.request.UsuarioRequestDTO;
import com.example.R2.dto.response.UsuarioResponseDTO;
import com.example.R2.model.Usuario;
import com.example.R2.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {
    //Atributo da service para instanciar repository
    private final UsuarioRepository usuarioRepository;

    //Construtor da classe
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    //Find All
    public List<UsuarioResponseDTO> findAll(){
        return usuarioRepository.findAll().stream().map(u ->
                new UsuarioResponseDTO(u.getId(),u.getNome(),u.getEmail(),u.getSenha(),u.isTipo(),u.getEndereco(),u.getHistoricoCompra()))
                .collect(Collectors.toList());
    }

    //Find By Id
    public UsuarioResponseDTO findById (Long id){
        Usuario usuario = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        return new UsuarioResponseDTO(usuario.getId(), usuario.getNome(), usuario.getEmail(), usuario.getSenha(), usuario.isTipo(), usuario.getEndereco(), usuario.getHistoricoCompra());
    }

    //Save
    public UsuarioResponseDTO save (UsuarioRequestDTO requestDTO){
        Usuario novoUsuario = new Usuario(null, requestDTO.getNome(), requestDTO.getEmail(), requestDTO.getSenha(), requestDTO.isTipo(), requestDTO.getEndereco(), requestDTO.getHistoricoCompra());
        Usuario usuarioSalvo = usuarioRepository.save(novoUsuario);
        return new UsuarioResponseDTO(usuarioSalvo.getId(), usuarioSalvo.getNome(), usuarioSalvo.getEmail(), usuarioSalvo.getSenha(), usuarioSalvo.isTipo(), usuarioSalvo.getEndereco(), usuarioSalvo.getHistoricoCompra());
    }

    //Update
    public UsuarioResponseDTO update(Long id, UsuarioRequestDTO requestDTO){
        Usuario usuarioExiste = usuarioRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
        usuarioExiste.setEmail(requestDTO.getEmail());
        usuarioExiste.setEndereco(requestDTO.getEndereco());
        usuarioExiste.setNome(requestDTO.getNome());
        usuarioExiste.setSenha(requestDTO.getSenha());
        usuarioExiste.setTipo(requestDTO.isTipo());
        usuarioExiste.setHistoricoCompra(requestDTO.getHistoricoCompra());
        Usuario usuarioAtualizado = usuarioRepository.update(usuarioExiste);
        return new UsuarioResponseDTO(usuarioAtualizado.getId(), usuarioAtualizado.getNome(), usuarioAtualizado.getEmail(), usuarioAtualizado.getSenha(), usuarioAtualizado.isTipo(), usuarioAtualizado.getEndereco(), usuarioAtualizado.getHistoricoCompra());
    }

    //Delete
    public void deleteById(Long id){
        usuarioRepository.deleteById(id);
    }
}

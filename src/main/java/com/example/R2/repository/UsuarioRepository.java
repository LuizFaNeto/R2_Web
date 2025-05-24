package com.example.R2.repository;

import com.example.R2.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UsuarioRepository {
    //Lista de objetos instanciados do Model
    private List<Usuario> usuarios = new ArrayList<>();

    //Incrementa o Id
    private Long nextId = 1L;

    //Find All (Read)
    public List<Usuario> findAll (){
        return usuarios;
    }

    //Find By Id
    public Optional<Usuario> findById (Long id){
        return usuarios.stream().filter(u -> u.getId().equals(id)).findFirst();
    }

    //Save (Create)
    public void save (Usuario usuario){
        usuario.setId(nextId++);
        usuarios.add(usuario);
    }

    //Update (Update)
    public void update (Usuario usuario){
        usuarios.stream().filter(u -> u.getId().equals(usuario.getId()))
                .findFirst().ifPresentOrElse(u1 -> {
                    u1.setEmail(usuario.getEmail());
                    u1.setEndereco(usuario.getEndereco());
                    u1.setNome(usuario.getNome());
                    u1.setSenha(usuario.getSenha());
                    u1.setHistoricoCompra(usuario.getHistoricoCompra());
                    u1.setTipo(usuario.isTipo());
                }, () -> {
                    throw new RuntimeException("Usuário não encontrado para atualização.");
                });


    }

    //Delete By Id (Delete)
    public void deleteById (Long id){
        usuarios.removeIf(u -> u.getId().equals(id));
    }
}

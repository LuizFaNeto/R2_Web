package com.example.R2.service;

import com.example.R2.dto.request.FotoRequestDTO;
import com.example.R2.dto.response.FotoResponseDTO;
import com.example.R2.model.Foto;
import com.example.R2.repository.FotoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FotoService {
    //Atributo da service para instanciar repository
    private final FotoRepository fotoRepository;

    //Construtor da classe
    public FotoService(FotoRepository fotoRepository) {
        this.fotoRepository = fotoRepository;
    }

    //Find All
    public List<FotoResponseDTO> findAll() {
        return fotoRepository.findAll().stream().map(f ->
                new FotoResponseDTO(f.getId(),f.getProduto(),f.getIdProduto(),f.getImagem(),f.getDescricao())
        ).collect(Collectors.toList());
    }

    //Find By Id
    public FotoResponseDTO findById(Long id) {
        Foto f = fotoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Foto não encontrada"));
        return new FotoResponseDTO(f.getId(),f.getProduto(),f.getIdProduto(),f.getImagem(),f.getDescricao());
    }

    //Save
    public FotoResponseDTO save(FotoRequestDTO requestDTO) {
        Foto fotoNova = new Foto(null, requestDTO.getProduto(), requestDTO.getIdProduto(), requestDTO.getImagem(), requestDTO.getDescricao());
        Foto fotoSalva = fotoRepository.save(fotoNova);
        return new FotoResponseDTO(fotoSalva.getId(),fotoSalva.getProduto(),fotoSalva.getIdProduto(),fotoSalva.getImagem(),fotoSalva.getDescricao());
    }

    //Update
    public FotoResponseDTO update(Long id, FotoRequestDTO requestDTO) {
        Foto fotoExiste = fotoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Foto não encontrada"));
        fotoExiste.setIdProduto(requestDTO.getIdProduto());
        fotoExiste.setProduto(requestDTO.getProduto());
        fotoExiste.setImagem(requestDTO.getImagem());
        fotoExiste.setDescricao(requestDTO.getDescricao());
        Foto fotoAtualizada = fotoRepository.update(fotoExiste);
        return new FotoResponseDTO(fotoAtualizada.getId(),fotoAtualizada.getProduto(), fotoAtualizada.getIdProduto(), fotoAtualizada.getImagem(), fotoAtualizada.getDescricao());
    }

    //Delete
    public void deleteById(Long id) {
        fotoRepository.deleteById(id);
    }
}


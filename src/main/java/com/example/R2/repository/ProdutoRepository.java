package com.example.R2.repository;

import com.example.R2.model.Produto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProdutoRepository {
    //Lista de objetos instânciados do Model
    private final List<Produto> produtos = new ArrayList<>();

    //Auto icrementa o próximo id
    private Long nextId = 1L;

    //Find All (Read)
    public List<Produto> findAll (){
        return produtos;
    }

    //Find By Id (Read)
    public Optional<Produto> findById(Long id){
        return produtos.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    //Save (Create)
    public void save(Produto produto){
        produto.setId(nextId);
        produtos.add(produto);
    }

    //Update (Update)
    public void update(Produto produto) {
        produtos.stream().filter(p -> p.getId().equals(produto.getId()))
                .findFirst().ifPresentOrElse(p1 -> {
                    p1.setCategoria(produto.getCategoria());
                    p1.setCor(produto.getCor());
                    p1.setDescricao(produto.getDescricao());
                    p1.setImagem(produto.getImagem());
                    p1.setNome(produto.getNome());
                    p1.setPreco(produto.getPreco());
                    p1.setQuantidadeEstoque(produto.getQuantidadeEstoque());
                    p1.setTamanho(produto.getTamanho());
                }, () -> { throw new RuntimeException("Produto não encontrado para atualização");
                         });
    }

    //Delete By id (Delete)
    public void deleteById(Long id){
        produtos.removeIf(p -> p.getId().equals(id));
    }
}
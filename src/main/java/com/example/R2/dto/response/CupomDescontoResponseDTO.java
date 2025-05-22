package com.example.R2.dto.response;

import java.util.Date;

public class CupomDescontoResponseDTO {
    //Atributos da classe
    private Long id;
    private String codigo;
    private String descricao;
    private Double valorDesconto;
    private Date validade;

    //Construtor para importar atributos da classe
    public CupomDescontoResponseDTO() {}

    //Contrutor completo
    public CupomDescontoResponseDTO(Long id, String codigo, String descricao, Double valorDesconto, Date validade) {
        this.id = id;
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorDesconto = valorDesconto;
        this.validade = validade;
    }

    //Getters
    public Long getId() {
        return id;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public Double getValorDesconto() {
        return valorDesconto;
    }
    public Date getValidade() {
        return validade;
    }
}

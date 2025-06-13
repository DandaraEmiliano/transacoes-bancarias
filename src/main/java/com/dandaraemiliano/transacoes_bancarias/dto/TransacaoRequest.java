package com.dandaraemiliano.transacoes_bancarias.dto;

import java.math.BigDecimal;

public class TransacaoRequest {
    private String origem;
    private String destino;
    private BigDecimal valor;

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}

package com.dandaraemiliano.transacoes_bancarias.service;

import com.dandaraemiliano.transacoes_bancarias.dto.TransacaoRequest;
import com.dandaraemiliano.transacoes_bancarias.model.Conta;
import com.dandaraemiliano.transacoes_bancarias.repository.ContaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TransacaoService {
    private final ContaRepository contaRepository;

    public TransacaoService(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    public void realizarTransferencia(TransacaoRequest request) {
        Conta origem = contaRepository.findByNumeroConta(request.getOrigem())
                .orElseThrow(() -> new RuntimeException("Conta de origem não encontrada"));

        Conta destino = contaRepository.findByNumeroConta(request.getDestino())
                .orElseThrow(() -> new RuntimeException("Conta de destino não encontrada"));

        BigDecimal valor = request.getValor();

        if (origem.getSaldo().compareTo(valor) < 0) {
            throw new RuntimeException("Saldo insuficiente na conta de origem");
        }

        origem.setSaldo(origem.getSaldo().subtract(valor));
        destino.setSaldo(destino.getSaldo().add(valor));

        contaRepository.save(origem);
        contaRepository.save(destino);
    }
}

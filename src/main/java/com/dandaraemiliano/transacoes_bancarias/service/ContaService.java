package com.dandaraemiliano.transacoes_bancarias.service;

import com.dandaraemiliano.transacoes_bancarias.model.Conta;
import com.dandaraemiliano.transacoes_bancarias.repository.ContaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {

    private final ContaRepository contaRepository;

    public ContaService(ContaRepository contaRepository) {
        this.contaRepository = contaRepository;
    }

    public Conta criarConta(Conta conta) {
        return contaRepository.save(conta);
    }

    public List<Conta> listarContas() {
        return contaRepository.findAll();
    }

    public Conta buscarPorNumero(String numeroConta) {
        return contaRepository.findByNumeroConta(numeroConta)
                .orElseThrow(() -> new RuntimeException("Conta não encontrada"));
    }

    public Conta atualizarConta(Long id, Conta conta) {
        if (!contaRepository.existsById(id)) {
            throw new RuntimeException("Conta não encontrada");
        }
        conta.setId(id);
        return contaRepository.save(conta);
    }

    public void deletarConta(Long id) {
        if (!contaRepository.existsById(id)) {
            throw new RuntimeException("Conta não encontrada");
        }
        contaRepository.deleteById(id);
    }
}

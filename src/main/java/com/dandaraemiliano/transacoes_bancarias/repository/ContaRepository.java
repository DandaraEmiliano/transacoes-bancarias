package com.dandaraemiliano.transacoes_bancarias.repository;

import com.dandaraemiliano.transacoes_bancarias.model.Conta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ContaRepository extends JpaRepository<Conta, Long> {
    Optional<Conta> findByNumeroConta(String numeroConta);
}

package com.dandaraemiliano.transacoes_bancarias.controller;

import com.dandaraemiliano.transacoes_bancarias.dto.TransacaoRequest;
import com.dandaraemiliano.transacoes_bancarias.service.TransacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    private final TransacaoService transacaoService;

    public TransacaoController(TransacaoService transacaoService) {
        this.transacaoService = transacaoService;
    }

    @PostMapping
    public ResponseEntity<String>transferir(@RequestBody TransacaoRequest request){
        transacaoService.realizarTransferencia(request);
        return ResponseEntity.ok("Transferência realizada com sucesso!");
    }

}

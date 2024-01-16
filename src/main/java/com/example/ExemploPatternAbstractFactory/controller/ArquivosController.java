package com.example.ExemploPatternAbstractFactory.controller;

import com.example.ExemploPatternAbstractFactory.factory.gerenciadorarquivos.GerenciadorArquivos;
import com.example.ExemploPatternAbstractFactory.factory.gerenciadorcomunicacaoaplicacoes.GerenciadorComunicacaoAplicacoes;
import com.example.ExemploPatternAbstractFactory.factory.servicoexterno.ServicoExternoAws;
import com.example.ExemploPatternAbstractFactory.factory.servicoexterno.ServicoExternoFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/arquivo")
public class ArquivosController {

    ServicoExternoFactory servicoExternoFactory = new ServicoExternoAws();

    GerenciadorArquivos gerenciadorArquivos = servicoExternoFactory.criarGerenciadorArquivos();

    GerenciadorComunicacaoAplicacoes gerenciadorComunicacaoAplicacoes = servicoExternoFactory.criarGerenciadorComunicacaoAplicacoes();

    @DeleteMapping("/excluir")
    public ResponseEntity<String> excluirArquivo(@RequestParam("nomeArquivo") String nomeArquivo, @RequestParam("diretorio") String diretorio) {

        gerenciadorArquivos.excluirArquivo(diretorio, nomeArquivo);

        return new ResponseEntity<>("Excluido com sucesso.", HttpStatus.OK);
    }

}

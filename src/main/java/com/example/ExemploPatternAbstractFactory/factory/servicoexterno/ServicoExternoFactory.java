package com.example.ExemploPatternAbstractFactory.factory.servicoexterno;

import com.example.ExemploPatternAbstractFactory.factory.gerenciadorarquivos.GerenciadorArquivos;
import com.example.ExemploPatternAbstractFactory.factory.gerenciadorcomunicacaoaplicacoes.GerenciadorComunicacaoAplicacoes;

public interface ServicoExternoFactory {

    GerenciadorArquivos criarGerenciadorArquivos();

    GerenciadorComunicacaoAplicacoes criarGerenciadorComunicacaoAplicacoes();
}

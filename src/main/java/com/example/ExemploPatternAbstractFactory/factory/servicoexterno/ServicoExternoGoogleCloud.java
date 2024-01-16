package com.example.ExemploPatternAbstractFactory.factory.servicoexterno;

import com.example.ExemploPatternAbstractFactory.factory.gerenciadorarquivos.GerenciadorArquivos;
import com.example.ExemploPatternAbstractFactory.factory.gerenciadorarquivos.GerenciadorArquivosGoogleCloud;
import com.example.ExemploPatternAbstractFactory.factory.gerenciadorcomunicacaoaplicacoes.GerenciadorComunicacaoAplicacoes;
import com.example.ExemploPatternAbstractFactory.factory.gerenciadorcomunicacaoaplicacoes.GerenciadorComunicacaoAplicacoesGoogleCloud;

public class ServicoExternoGoogleCloud implements ServicoExternoFactory{


    @Override
    public GerenciadorArquivos criarGerenciadorArquivos() {
        return new GerenciadorArquivosGoogleCloud();
    }

    @Override
    public GerenciadorComunicacaoAplicacoes criarGerenciadorComunicacaoAplicacoes() {
        return new GerenciadorComunicacaoAplicacoesGoogleCloud();
    }
}

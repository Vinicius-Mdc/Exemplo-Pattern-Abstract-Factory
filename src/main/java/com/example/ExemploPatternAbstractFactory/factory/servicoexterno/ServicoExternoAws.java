package com.example.ExemploPatternAbstractFactory.factory.servicoexterno;

import com.example.ExemploPatternAbstractFactory.factory.gerenciadorarquivos.GerenciadorArquivoAws;
import com.example.ExemploPatternAbstractFactory.factory.gerenciadorarquivos.GerenciadorArquivos;
import com.example.ExemploPatternAbstractFactory.factory.gerenciadorcomunicacaoaplicacoes.GerenciadorComunicacaoAplicacoes;
import com.example.ExemploPatternAbstractFactory.factory.gerenciadorcomunicacaoaplicacoes.GerenciadorComunicacaoAplicacoesAws;

public class ServicoExternoAws implements ServicoExternoFactory
{

    @Override
    public GerenciadorArquivos criarGerenciadorArquivos() {
        return new GerenciadorArquivoAws();
    }

    @Override
    public GerenciadorComunicacaoAplicacoes criarGerenciadorComunicacaoAplicacoes() {
        return new GerenciadorComunicacaoAplicacoesAws();
    }
}

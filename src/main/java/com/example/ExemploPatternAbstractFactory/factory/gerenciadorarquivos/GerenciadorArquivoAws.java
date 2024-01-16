package com.example.ExemploPatternAbstractFactory.factory.gerenciadorarquivos;

public class GerenciadorArquivoAws implements GerenciadorArquivos{
    @Override
    public void salvarArquivo(String diretorio) {

    }

    @Override
    public void excluirArquivo(String diretorio, String nomeArquivo) {
        System.out.println("Arquivo no AWS excluído com sucesso!");
    }
}

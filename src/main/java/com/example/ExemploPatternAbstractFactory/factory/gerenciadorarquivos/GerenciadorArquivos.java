package com.example.ExemploPatternAbstractFactory.factory.gerenciadorarquivos;

public interface GerenciadorArquivos {
    void salvarArquivo(String diretorio);

    void excluirArquivo(String diretorio, String nomeArquivo);
}

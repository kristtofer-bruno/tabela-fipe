package br.com.alura.tabelaFipe.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}

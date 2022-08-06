package projetodio.cadastrodecliente.service;

import projetodio.cadastrodecliente.model.Cliente;

public interface ClienteService {

    public Iterable<Cliente>buscarTodos();

    public Cliente buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    public void deletar(Long id);
}

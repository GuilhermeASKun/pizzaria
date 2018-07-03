package br.com.uds.pizzaria;

import java.util.Set;
import java.util.UUID;

public interface PizzariaService {
    Pizza criar(PizzaDTO pizzaDTO);


    Set<Pizza> listar();


    Pizza obter(UUID id);

    void remover(UUID id);

    void editar(UUID id, PizzaDTO pizzaDTO);
}

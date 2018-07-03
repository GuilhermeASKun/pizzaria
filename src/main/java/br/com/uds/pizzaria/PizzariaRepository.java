package br.com.uds.pizzaria;

import java.util.Set;
import java.util.UUID;

public interface PizzariaRepository {

    Pizza save(PizzaDTO pizzaDTO);

    Set<Pizza> findAll();


    Pizza findOne(UUID id);

    void delete(UUID id);

    void add(Pizza pizza);
}

package pizzaria;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Component
public class PizzariaRepositoryImpl implements PizzariaRepository{

    private Set<Pizza> pizzas = new HashSet();

    @Override
    public Pizza save(PizzaDTO pizzaDTO) {
        Pizza pizza = new Pizza(pizzaDTO.getMassa(), pizzaDTO.getQueijo(), pizzaDTO.getMolho(), pizzaDTO.getSabor(), pizzaDTO.getTempoDePreparo());
        pizzas.add(pizza);
        return pizza;
    }

    @Override
    public Set<Pizza> findAll() {
        return this.pizzas;
    }

    @Override
    public Pizza findOne(UUID id) {
        for(Pizza pizza: this.pizzas){
            if(pizza.getId().equals(id)){
                return pizza;
            }
        }
        return null;
    }

    @Override
    public void delete(UUID id) {
        Pizza  pizza = this.findOne(id);
        this.pizzas.remove(pizza);
    }

    @Override
    public void add(Pizza pizza) {
        this.pizzas.add(pizza);
    }

}

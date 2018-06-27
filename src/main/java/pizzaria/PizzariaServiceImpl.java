package pizzaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class PizzariaServiceImpl implements PizzariaService {

    @Autowired
    private PizzariaRepository repository;

    @Override
    public Pizza criar(PizzaDTO pizzaDTO) {
        return null;
    }

    @Override
    public Set<Pizza> listar() {
        return this.repository.findAll();

    }

    @Override
    public Pizza obter(UUID id) {
        return this.repository.findOne(id);
    }

    @Override
    public void remover(UUID id) {
        this.repository.delete(id);
    }


    @Override
        public void editar(UUID id, PizzaDTO pizzaDTO) {
        Pizza pizzaRecuperada = this.obter(id);
        remover(id);
        pizzaRecuperada.pizzaDTO(pizzaDTO.getMassa(), pizzaDTO.getQueijo(), pizzaDTO.getMolho(), pizzaDTO.getSabor(), pizzaDTO.getTempoDePreparo());
        this.repository.add(pizzaRecuperada);

    }


}

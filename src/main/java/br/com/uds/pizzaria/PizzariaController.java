package br.com.uds.pizzaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.UUID;

@RestController
@RequestMapping("/api/pizzaria")
public class PizzariaController {

    @RequestMapping(value = "/teste", method = RequestMethod.GET)
    public String teste(){
        return "retorno TEEESTE";
    }


    @Autowired
    private PizzariaService pizzariaService;

    @PostMapping
    public ResponseEntity criar(PizzaDTO pizzaDTO) {
        Pizza pizzaGravada = this.pizzariaService.criar(pizzaDTO);
        return new ResponseEntity(pizzaGravada.toString(), HttpStatus.CREATED);
    }

    //@RequestMapping(value = "/teste", method = RequestMethod.GET)
    @GetMapping
    public Set<Pizza> listar(){
        return this.pizzariaService.listar();
    }
    @GetMapping("/findBy")
    public Pizza obter(@RequestParam("id")UUID id){
        return this.pizzariaService.obter(id);
    }
    @DeleteMapping
    public ResponseEntity remover(@RequestParam("id")UUID id){
        this.pizzariaService.remover(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
    @PutMapping
    public ResponseEntity editar(@RequestParam("id")UUID id, @RequestBody PizzaDTO pizzaDTO) {
        this.pizzariaService.editar(id, pizzaDTO);
        return new ResponseEntity("Editado com Sucesso!", HttpStatus.OK);
    }


}

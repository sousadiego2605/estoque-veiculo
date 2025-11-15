package com.unifecaf.estoque_veiculos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos") // O endereço do site será localhost:8080/veiculos
public class VeiculoController {

    @Autowired
    private VeiculoRepository repository;

    // 1. CADASTRAR (POST)
    @PostMapping
    public Veiculo cadastrar(@RequestBody Veiculo veiculo) {
        System.out.println(veiculo);
        return repository.save(veiculo);
    }

    // 2. LISTAR TODOS (GET)
    @GetMapping
    public List<Veiculo> listar() {
        return repository.findAll();
    }

    // 3. ATUALIZAR (PUT)
    @PutMapping("/{id}")
    public Veiculo atualizar(@PathVariable Long id, @RequestBody Veiculo dadosAtualizados) {
        Veiculo veiculo = repository.findById(id).orElse(null);
        if (veiculo != null) {
            veiculo.setModelo(dadosAtualizados.getModelo());
            veiculo.setMarca(dadosAtualizados.getMarca());
            veiculo.setPreco(dadosAtualizados.getPreco());
            veiculo.setStatus(dadosAtualizados.getStatus());
            // Pode adicionar outros campos se quiser
            return repository.save(veiculo);
        }
        return null;
    }

    // 4. DELETAR (DELETE)
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
package br.com.fiap.fordpublisher.controller;

import br.com.fiap.fordpublisher.model.Servico;
import br.com.fiap.fordpublisher.service.ServicoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicoController {

    private final ServicoService service;

    public ServicoController(ServicoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Servico> listarTodos() {
        return service.listarTodos();
    }

    @PostMapping
    public Servico salvar(@RequestBody Servico servico) {
        return service.salvar(servico);
    }

    @GetMapping("/{id}")
    public Servico buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Servico atualizar(@PathVariable Long id, @RequestBody Servico servico) {
        return service.atualizar(id, servico);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
package br.com.cefops.cadastroapp.controller;

import br.com.cefops.cadastroapp.data.Cadastro31;
import br.com.cefops.cadastroapp.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {
    @Autowired
    CadastroRepository repository;

    @GetMapping
    public List<Cadastro31> GetAll(){
        return repository.findAll();
    }

    @PostMapping
    public Cadastro31 newCadastro(@RequestBody Cadastro31 cadastro){
        System.out.println(cadastro.getPc());

        return repository.save(cadastro);
    }

}

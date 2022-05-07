package br.com.cefops.cadastroapp.controller;

import br.com.cefops.cadastroapp.data.Cadastro31;
import br.com.cefops.cadastroapp.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;
import java.util.stream.Collectors;

@Controller

public class GraphController {
@Autowired
    CadastroRepository cadastroRepository;

    @GetMapping("/pcs")
    public String barChart(Model model)
    {
        Map<String, Integer> data = new LinkedHashMap<String, Integer>();
        List<Cadastro31> dados=cadastroRepository.findAll();
        List pcsSemFilto=new ArrayList<>();
        dados.forEach(dado ->{
            pcsSemFilto.addAll(Collections.singleton(dado.getPc()));
        });
       List dataFilter= (List) pcsSemFilto.stream().distinct().collect(Collectors.toList());

       dataFilter.forEach(pcs->{
           data.put(pcs.toString(),cadastroRepository.findByPc(pcs.toString()).size());
       });



        model.addAttribute("keySet", data.keySet());
        model.addAttribute("values", data.values());
        return "barChart";

    }

    @GetMapping("/pieChart")
    public String pieChart(Model model) {
        model.addAttribute("pass", cadastroRepository.findByStatus("ok").size());
        System.out.println(cadastroRepository.findByStatus("Falha na Aplicação").size());
        model.addAttribute("fail", 10);  model.addAttribute("fail", cadastroRepository.findByStatus("Falha na Aplicação").size());
        return "pieChart";

    }

}

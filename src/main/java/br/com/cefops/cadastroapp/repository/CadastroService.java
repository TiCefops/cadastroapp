package br.com.cefops.cadastroapp.repository;

import br.com.cefops.cadastroapp.data.Cadastro31;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroService {
    @Autowired
    CadastroRepository repository;

    public List<Cadastro31> getAll(){
        List<Cadastro31> data=repository.findAll();
        return data;
    }

    public  Long countPass(){
        List<Cadastro31> data=repository.findByStatus("ok");

        return  data.stream().count();
    }


}

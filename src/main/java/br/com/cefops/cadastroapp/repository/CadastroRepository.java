package br.com.cefops.cadastroapp.repository;


import br.com.cefops.cadastroapp.data.Cadastro31;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro31,Long> {
    List<Cadastro31> findByStatus(String status);
    List<Cadastro31> findByPc(String pc);
}

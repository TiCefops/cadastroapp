package br.com.cefops.cadastroapp.data;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;



@Getter
@Setter
@ToString
@Entity
public class Cadastro31 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String pc;
    private String nome;
    private String cpf;
    private String status;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date datadeCriacao;

}

package br.com.matheus.desafiotodolist.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String descricao;
    private boolean realizado;
    private int prioridade;

    public  Todo(String nome, String descricao, boolean realizado,
                 int prioridade){
        this.descricao = descricao;
        this.nome = nome;
        this.realizado = realizado;
        this.prioridade = prioridade;
    }

}

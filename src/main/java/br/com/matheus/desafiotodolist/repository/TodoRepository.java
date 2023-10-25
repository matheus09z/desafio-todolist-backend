package br.com.matheus.desafiotodolist.repository;

import br.com.matheus.desafiotodolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {
}

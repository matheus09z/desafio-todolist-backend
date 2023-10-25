package br.com.matheus.desafiotodolist.service;

import br.com.matheus.desafiotodolist.entity.Todo;
import br.com.matheus.desafiotodolist.repository.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoService {

    private TodoRepository repository;
    public List<Todo> create(Todo todo) {
      this.repository.save(todo);
      return list();
    }   public List<Todo> list() {
      Sort sort  = Sort.by("prioridade")
              .descending().and(Sort.by("nome")
                      .ascending());
        return this.repository.findAll(sort);

    }   public List<Todo> update(Todo todo) {
        repository.save(todo);
   return list();
    }   public List<Todo> delete(Long id) {
        repository.deleteById(id);
        return list();

    }
}

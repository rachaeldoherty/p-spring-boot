package uk.ac.belfastmet.ToDoList.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uk.ac.belfastmet.ToDoList.domain.ToDoList;

@Repository
public interface ToDoListRepository extends CrudRepository<ToDoList, Long>{

}

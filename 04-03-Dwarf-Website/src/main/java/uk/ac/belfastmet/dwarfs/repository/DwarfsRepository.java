package uk.ac.belfastmet.dwarfs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;

@Repository
public interface DwarfsRepository extends CrudRepository<Dwarf, Long>{


}

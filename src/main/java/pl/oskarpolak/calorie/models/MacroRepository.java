package pl.oskarpolak.calorie.models;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MacroRepository extends CrudRepository<MacroEntity, Integer> {
}

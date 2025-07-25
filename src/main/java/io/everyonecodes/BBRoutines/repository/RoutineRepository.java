package io.everyonecodes.BBRoutines.repository;

import io.everyonecodes.BBRoutines.model.Routine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoutineRepository extends JpaRepository<Routine, Long> {
}
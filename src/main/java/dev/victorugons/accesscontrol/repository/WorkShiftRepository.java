package dev.victorugons.accesscontrol.repository;

import dev.victorugons.accesscontrol.model.WorkShift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkShiftRepository extends JpaRepository<WorkShift, Long> {

}
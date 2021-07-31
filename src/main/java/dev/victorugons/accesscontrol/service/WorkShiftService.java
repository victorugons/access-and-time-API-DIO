package dev.victorugons.accesscontrol.service;

import dev.victorugons.accesscontrol.exception.NotFoundException;
import dev.victorugons.accesscontrol.model.WorkShift;
import dev.victorugons.accesscontrol.repository.WorkShiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkShiftService {

    private WorkShiftRepository repository;

    @Autowired
    public WorkShiftService(WorkShiftRepository repository) {
        this.repository = repository;
    }

    public WorkShift save(WorkShift workShift) {
        return repository.save(workShift);
    }

    public WorkShift update(WorkShift workShift) {
        return repository.save(workShift);
    }

    public List<WorkShift> findAll() { return repository.findAll(); }

    public WorkShift findById(long id) {
        return repository.findById(id).orElseThrow(NotFoundException::new);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }

}

package dev.victorugons.accesscontrol.controller;

import dev.victorugons.accesscontrol.model.WorkShift;
import dev.victorugons.accesscontrol.service.WorkShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/work-shift")
public class WorkShiftController {

    private WorkShiftService service;

    @Autowired
    public WorkShiftController(WorkShiftService service) {
        this.service = service;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<WorkShift> create(@RequestBody WorkShift workShift) {
        return ResponseEntity.ok(service.save(workShift));
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<WorkShift> update(@RequestBody WorkShift workShift) {
        return ResponseEntity.ok(service.update(workShift));
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<WorkShift>> findAll() {
        return  ResponseEntity.ok(service.findAll());
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<WorkShift> findById(@PathVariable long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
         service.delete(id);
         return ResponseEntity.noContent().build();
    }
}

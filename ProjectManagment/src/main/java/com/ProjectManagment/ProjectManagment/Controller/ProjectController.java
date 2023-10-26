package com.ProjectManagment.ProjectManagment.Controller;

import com.ProjectManagment.ProjectManagment.Entity.Project;
import com.ProjectManagment.ProjectManagment.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    private ProjectService projectService;


    //http://localhost:8081/project
    @PostMapping
    public ResponseEntity<Project> createProject(@RequestBody Project project) {
        Project createdProject = projectService.createProject(project);
        return ResponseEntity.ok(createdProject);
    }


    //http://localhost:8081/project
    @GetMapping
    public ResponseEntity<List<Project>> getALl(){
        List<Project> all = projectService.getAll();
        return new ResponseEntity<>(all, HttpStatus.OK);
    }

    //http://localhost:8081/project/{id}
    @GetMapping("/{projectId}")
    public ResponseEntity<Project> getProjectById(@PathVariable Long projectId) {
        Project project = projectService.getProjectById(projectId);
        if (project == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(project);
    }
}

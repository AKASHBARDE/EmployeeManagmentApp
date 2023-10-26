package com.ProjectManagment.ProjectManagment.Service;

import com.ProjectManagment.ProjectManagment.Entity.Project;

import java.util.List;

public interface ProjectService {
    Project createProject(Project project);
    Project getProjectById(Long projectId);

    List<Project> getAll();
}


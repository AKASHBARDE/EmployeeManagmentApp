package com.ProjectManagment.ProjectManagment.Service;

import com.ProjectManagment.ProjectManagment.Entity.Project;

public interface ProjectService {
    Project createProject(Project project);
    Project getProjectById(Long projectId);
}


package com.ProjectManagment.ProjectManagment.Service.impl;

import com.ProjectManagment.ProjectManagment.Entity.Project;
import com.ProjectManagment.ProjectManagment.Repository.ProjectRepository;
import com.ProjectManagment.ProjectManagment.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public Project getProjectById(Long projectId) {
        return projectRepository.findById(projectId).orElse(null);
    }
}

package com.ProjectManagment.ProjectManagment.Repository;

import com.ProjectManagment.ProjectManagment.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project , Long> {
}

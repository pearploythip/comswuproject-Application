package com.arms.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.arms.domain.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
	
	@Transactional
	List<Task> deleteByProjectId(int projectId);

}

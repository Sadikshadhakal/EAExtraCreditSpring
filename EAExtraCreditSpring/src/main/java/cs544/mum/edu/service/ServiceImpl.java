package cs544.mum.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cs544.mum.edu.dao.IProjectDAO;
import cs544.mum.edu.dao.ITaskDAO;
import cs544.mum.edu.dao.IUserDAO;
import cs544.mum.edu.domain.Project;
import cs544.mum.edu.domain.Task;
import cs544.mum.edu.domain.Users;

@Service
public class ServiceImpl implements IService{
	@Autowired
	IUserDAO userDAO;
	@Autowired
	ITaskDAO taskDAO ;
	@Autowired
	IProjectDAO projectDAO;

	public void createNewUser(Users user) {
		userDAO.save(user);
	}

	public void createNewProject(Project project) {
		projectDAO.save(project);
	}

	public void createNewTask(Task task) {
		taskDAO.save(task);
	}

	public List<Users> getAllUsers() {
		
		return userDAO.getAllUsers();
	}

	public List<Project> getAllProjects() {
		
		return projectDAO.getAllProjects();
	}
	
}

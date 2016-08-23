package cs544.mum.edu.service;

import java.util.List;

import cs544.mum.edu.domain.Project;
import cs544.mum.edu.domain.Task;
import cs544.mum.edu.domain.Users;

public interface IService {
	abstract void createNewUser(Users user);
	abstract void createNewProject(Project project);
	abstract void createNewTask(Task task);
	public List<Users>getAllUsers();
	public List<Project>getAllProjects();
}

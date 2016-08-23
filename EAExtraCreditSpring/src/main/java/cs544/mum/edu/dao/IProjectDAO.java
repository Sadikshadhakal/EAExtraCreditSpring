package cs544.mum.edu.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import cs544.mum.edu.domain.Project;

@Repository
public interface IProjectDAO extends JpaRepository<Project, Long>{
	List<Project> findByStatus(String status);
	
	@Query("From Project P")
	List<Project>getAllProjects();
	
	@Query("From Project p where p.status = :status")
	List<Project>findAllByStatus(@Param("status")String status);
	
	@Query("From Project p JOIN p.taskList t JOIN t.resourcesList r where r.id= :resourceId")
	List<Project>findAllByResources(@Param("resourceId")Long resouceId);
	
	@Query("From Project p JOIN p.addressList al where al.city= : city or al.state = :state")
	List<Project>findAllByLocation(@Param("city")String city, @Param("state") String state);
	
	@Query("From Project p where p.description like CONCAT('%', :description, '%')")
	List<Project>findAllByDescription(@Param("description")String description);
	
	@Query("from Project p JOIN p.taskList t1 where t1.volunteer <> NULL order by t1.time")
	List<Project>findAllWithVolunteerOrderByTaskTime();
}

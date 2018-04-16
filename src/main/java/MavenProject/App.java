package MavenProject;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import MavenProject.entity.Teacher;
import MavenProject.entity.TeacherDetails;

public class App {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("mysql");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		
		em.getTransaction().begin();
		
		TeacherDetails teacherDetails = new TeacherDetails();
		teacherDetails.setEmail("teacher@gmail.com");
		teacherDetails.setHobby("Programming");
		System.out.println("Teacher Id1: " + teacherDetails.getId());
		em.persist(teacherDetails);
		System.out.println("Teacher Id2: " + teacherDetails.getId());
		
		
		Teacher teacher = new Teacher();
		teacher.setFirstNam("Jon");
		teacher.setLastName("Doe");
		teacher.setAge(25);
		
		em.persist(teacher);
		
		
		
		
		
		
		em.getTransaction().commit();
		
		em.close();
		entityManagerFactory.close();
	}
}

    

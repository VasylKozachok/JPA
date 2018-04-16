package MavenProject.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student")
@NoArgsConstructor
@Getter @Setter
public class Student extends basedEntity {
	@Column(name = "full_name" , length = 800)
	private String fullName;
	
	
	private int age;
	@ManyToMany
	@JoinTable(name = "student_cource",
			joinColumns = @JoinColumn(name = "student_id"),
			inverseJoinColumns = @JoinColumn(name = "cource_id"))
	
	
	private List<Cource> cources = new ArrayList<>();
	


	
	
	
	
}

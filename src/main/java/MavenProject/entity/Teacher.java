package MavenProject.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "teacher")
@NoArgsConstructor
@Getter @Setter
public class Teacher extends basedEntity {
	
	
	
	@Column(name = "first_name")
	private String firstNam; //first_name
	
	
	@Column(name = "last_name",length = 50) // VARCHAR(50)
	private String lastName;
	
	
	@Column(name = "age")
	private int age;
	@OneToMany(mappedBy = "teacher")
	private List<Cource> cources = new ArrayList<>();
	@OneToOne
	@JoinColumn(name = "teacher_details_id")
	private TeacherDetails teacherDetails;

	
	
	
}

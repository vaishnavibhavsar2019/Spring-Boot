package alumini.managment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Data
@Table(name="student")
public class Alumini {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "sId")
	private Integer id;
	@Column(name = "sName", length = 30)
	private String name;
	@Column(name = "sPhoneNo", length = 10)
	private String phone;
	@Column(name = "sEmail", length = 30)
	private String email;
	@Column(name = "sGraduationYear", length = 10)
	private String grdYear;
	
	
	public Alumini(String name, String phone, String email, String grdYear) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.grdYear = grdYear;
	}
	
	
	
	
}

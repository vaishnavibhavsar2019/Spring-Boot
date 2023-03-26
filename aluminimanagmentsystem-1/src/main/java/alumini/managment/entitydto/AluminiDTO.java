package alumini.managment.entitydto;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AluminiDTO 
{
	@NotBlank(message = "Invalid name = Empty Name")
	@NotNull(message = "Invalid name = Name is Empty")
	@Size(min=3, max=30,message = "Invalid Name: Must be of 3-30 Characters")
	private String name;
	
	@NotBlank(message = "Invalid Phone Number = Empty Number")
	@NotNull(message = "Invalid Phone Number = Number is Empty")
	@Pattern(regexp = "^\\d{10}5", message = "Invalid Phone Number...........!")
	private String phone;
	
	@NotNull
	@Email(message = "Invalid Email")
	private String email;
	
	@NotBlank(message = "Invalid name = Empty Name")
	@NotNull(message = "Invalid name = Name is Empty")
	private String grdYear;
}


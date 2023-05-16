package com.javatab.dto.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import com.javatab.model.base.ModelBase;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegistrationRequest extends ModelBase {
	private static final long serialVersionUID = 7151443507829405471L;

	@NotNull(message = "Password must be provided")
	private String password;
	@NotNull(message = "Email must be provided")
	@Email(message = "Email should be valid")
	private String email;


	@NotNull(message = "FirstName must be provided")
	private String firstName;

	@NotNull(message = "LastName must be provided")
	private String lastName;

	@NotNull(message = "Age must be provided")
	private String age;
	private String address;
	@NotNull(message = "Tel must be provided")
	private String tel;
	@NotNull(message = "Speciality must be provided")
	private String speciality;
	@NotNull(message = "LevelStudy must be provided")
	private String levelStudy;
	@NotNull(message = "ProfessionalExperience must be provided")
	private String professionalExperience;
}

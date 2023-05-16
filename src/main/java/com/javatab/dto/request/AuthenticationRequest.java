package com.javatab.dto.request;

import com.javatab.model.base.ModelBase;
import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class AuthenticationRequest extends ModelBase {

	private static final long serialVersionUID = 7151443507829405471L;

	@NotNull(message = "Password must be provided")
	private String password;
	@Email(message = "Email id should be valid")
	private String email;

	private String device;

}

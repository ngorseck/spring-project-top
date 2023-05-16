package com.javatab.dto.request;

import javax.validation.constraints.NotNull;

import com.javatab.model.base.ModelBase;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateUserRequest extends ModelBase {

    @NotNull
    private Long id;
    @NotNull
    private String age;
    @NotNull
    private String address;
    @NotNull
    private String tel;
    @NotNull
    private String speciality;
    @NotNull
    private String levelStudy;
    @NotNull
    private String professionalExperience;

    @NotNull()
    private String firstName;

    @NotNull()
    private String lastName;
}

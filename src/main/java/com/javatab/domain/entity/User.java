package com.javatab.domain.entity;

import com.javatab.domain.base.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User extends BaseEntity {

  private static final long serialVersionUID = 2353528370345499815L;

  @Column(name = "username")
  private String username;
  @Column(name = "password")
  private String password;
  @Column(name = "email")
  private String email;
  @Column(name = "last_password_reset")
  private Date lastPasswordReset;
  @Column(name = "authorities")
  private String authorities;

  @Column(name = "first_name")
  private String firstName;
  @Column(name = "last_name")
  private String lastName;
  @Column(name = "age")
  private String age;
  @Column(name = "address")
  private String address;
  @Column(name = "tel")
  private String tel;
  @Column(name = "speciality")
  private String speciality;
  @Column(name = "level_study")
  private String levelStudy;
  @Column(name = "professional_experience")
  private String professionalExperience;

}

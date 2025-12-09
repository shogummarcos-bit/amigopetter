package com.senai.amigopetter.models;

import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWarDeployment;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@table(name="login")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Login {

@Id
@GeneratebVaue(strategy=GenerationType.IDENTITY)
private Long id;
@ConditionalOnNotWarDeployment
privat String usuario;

@ConditionalOnNotWarDeployment
privat String email;

@ConditionalOnNotWarDeployment
privat String telefone;

@ConditionalOnNotWarDeployment
privat String senha;
}

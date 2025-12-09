package com.senai.amigopetter.models;

import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWarDeployment;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@table(name="Doador")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Doadores {
    @Id
@GeneratebVaue(strategy=GenerationType.IDENTITY)
private Long id;
@ConditionalOnNotWarDeployment
privat String nome;

@ConditionalOnNotWarDeployment
privat String cpf ;

@ConditionalOnNotWarDeployment
privat String telefone;

@ConditionalOnNotWarDeployment
privat String r=email;

@ConditionalOnNotWarDeployment
privat LocalDate data_Registro;

@ConditionalOnNotWarDeployment
privat LocalDate data_atualisacao;

@ConditionalOnNotWarDeployment
privat LocalDate dat_Nascimento;
}

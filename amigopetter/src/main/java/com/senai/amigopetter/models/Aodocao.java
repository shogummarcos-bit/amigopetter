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
@table(name="adocao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Aodocao {
    @Id
@GeneratebVaue(strategy=GenerationType.IDENTITY)
private Long id;
@ConditionalOnNotWarDeployment
privat Adotantes Adotantes;

@ConditionalOnNotWarDeployment
privat Pet pet ;

@ConditionalOnNotWarDeployment
privat Doador doador ;

@ConditionalOnNotWarDeployment
privat LocalDate data_adocao
}

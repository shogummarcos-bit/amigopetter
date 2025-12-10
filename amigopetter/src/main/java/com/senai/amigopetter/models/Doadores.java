package com.senai.amigopetter.models;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Doador")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Doadores {
    @Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
@Column
private String nome;

@Column
private String cpf ;

@Column
private String telefone;

@Column
private String email;

@Column
private LocalDate data_Registro;

@Column
private LocalDate data_atualisacao;

@Column
private LocalDate dat_Nascimento;
}

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
@Table(name="adocao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Adocao {
    @Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
@Column
private Adotante adotante;

@Column
private Pets pet ;

@Column
private Doadores doador ;

@Column
private LocalDate data_adocao;
}

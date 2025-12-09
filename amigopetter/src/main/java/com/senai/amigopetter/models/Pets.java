package com.senai.amigopetter.models;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="pets")
public class Pets {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;

@Column
private String nome;

@Column
private String especie;

@Column
private String raca;

@Column
private Integer idade;

@Column
private String porte;

@Column
private String descricao;

@Column
private String vacinas;

@Column
private Boolean disponivel;

@Column
private LocalDate dataEntrada;

@Column
private LocalDate dataAdocao;
}

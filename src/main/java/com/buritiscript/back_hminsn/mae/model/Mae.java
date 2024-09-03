package com.buritiscript.back_hminsn.mae.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Setter
@Getter
public class Mae {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private LocalDate dataNascimento;
  private String cpf;
  private String numsus;
  private String nacionalidade;
  private Integer pesoMae;
  private Integer idadeGestacional;
  private LocalDate dataEntrada;
}

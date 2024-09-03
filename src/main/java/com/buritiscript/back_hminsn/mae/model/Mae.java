package com.buritiscript.back_hminsn.mae.model;

import java.time.LocalDate;

import com.buritiscript.back_hminsn.endereco.model.Endereco;
import com.buritiscript.back_hminsn.readmissao.model.Readmissao;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Setter
@Getter
@Table(name = "mae")
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

  @ManyToOne
  @JoinColumn(name = "readmissao_id")
  private Readmissao readmissao;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "endereco_id", referencedColumnName = "id")
  private Endereco endereco;
}

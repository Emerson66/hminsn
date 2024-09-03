package com.buritiscript.back_hminsn.endereco.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Setter
@Getter
@Table(name = "endereco")
public class Endereco {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String cidade;
  private String cep;
  private String logradouro;
  private String numero;
  private String bairro;
  private String Complemento;
}

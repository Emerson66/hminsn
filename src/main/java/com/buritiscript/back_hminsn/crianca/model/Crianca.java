package com.buritiscript.back_hminsn.crianca.model;

import java.time.LocalDateTime;
import java.util.Set;

import com.buritiscript.back_hminsn.mae.model.Mae;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Setter
@Getter
@Table(name = "crianca")
public class Crianca {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nome;
  private Integer pesoCrianca;
  private LocalDateTime dataNascimento;
  private String sexo;

  @OneToMany(mappedBy = "crianca")
  private Set<Mae> maes;
}

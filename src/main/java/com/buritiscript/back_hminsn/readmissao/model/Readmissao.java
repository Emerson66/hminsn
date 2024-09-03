package com.buritiscript.back_hminsn.readmissao.model;

import java.time.*;
import java.util.Set;

import com.buritiscript.back_hminsn.mae.model.Mae;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@Table(name = "readmissao")
public class Readmissao {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private LocalDateTime dataReadmissao;
  private String motivo;

  @OneToMany(mappedBy = "readmissao")
  private Set<Mae> maes;
}

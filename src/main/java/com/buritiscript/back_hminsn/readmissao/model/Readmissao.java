package com.buritiscript.back_hminsn.readmissao.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Setter
@Getter
public class Readmissao {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private LocalDateTime dataReadmissao;
  private String motivo;

}

package com.buritiscript.back_hminsn.parto.model;

import java.time.LocalDateTime;

import com.buritiscript.back_hminsn.mae.model.Mae;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Setter
@Getter
@Table(name = "mae")
public class Parto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private LocalDateTime dataParto;
  private String indicacaoParto;

  @OneToOne(mappedBy = "mae")
  private Mae mae;
}

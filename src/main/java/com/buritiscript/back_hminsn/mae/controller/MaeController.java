package com.buritiscript.back_hminsn.mae.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/maes")
public class MaeController {

  @GetMapping
  private String hellWorld() {

    return "Hello World";
  }
}

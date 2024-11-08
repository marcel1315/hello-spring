package com.marceldev.hellospring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @GetMapping("/hello")
  public String hello() {
    return "hello";
  }

  @GetMapping("/startup")
  public ResponseEntity<Void> startup() {
    return ResponseEntity.ok().build();
  }

  @GetMapping("/readiness")
  public ResponseEntity<Void> readiness() {
    return ResponseEntity.ok().build();
  }

  @GetMapping("/liveness")
  public ResponseEntity<Void> liveness() {
    return ResponseEntity.ok().build();
  }
}

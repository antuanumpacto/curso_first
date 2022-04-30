package com.antuan.first.entities;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "esposa")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Esposa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long espId;

    private String espNombre;

    private String espApellido;

    @OneToOne
    @JoinColumn(name = "per_esp_id")
    private Persona esposo;
}

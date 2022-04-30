package com.antuan.first.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "hijo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Hijos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hij_id",nullable = false)
    private Long hijId;

    @ManyToOne
    @JoinColumn(name = "padre_per_id")
    private Persona padre;

    private String hijNombre;

    private Integer hijEdad;

    private Date hijNacimiento;

}

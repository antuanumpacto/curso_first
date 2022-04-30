package com.antuan.first.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "personas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "per_id",nullable = false)
    private Long perId;

    @Column(name = "per_cedula",nullable = false,length = 10, unique = true)
    private String perCedula;

    @Column(name = "per_nombre",nullable = false,length = 100)
    private String perNombre;

    @Column(name = "per_apellido",nullable = false)
    private String perApellido;

    @Column(name = "per_edad")
    private Integer perEdad;

    @Column(name = "per_fecha_nacimiento")
    private Date perFechaNacimiento;

    @Column(name = "per_casado", columnDefinition = "BIT")
    private Boolean perCasado;

    @OneToMany(mappedBy = "padre")
    List<Hijos> hijos;

    @OneToOne(mappedBy = "esposo")
    private Esposa esposa;

}

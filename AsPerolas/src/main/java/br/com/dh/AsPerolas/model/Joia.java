package br.com.dh.AsPerolas.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor

@Entity
public class Joia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100, nullable = false)
    private String material;

    @Column(length = 5)
    private double peso;

    @Column (length = 100, nullable = false)
    private int quilates;

}

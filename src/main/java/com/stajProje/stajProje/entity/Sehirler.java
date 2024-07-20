package com.stajProje.stajProje.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Sehirler")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Sehirler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int plaka;
    private String ad;
    private int nufus;
}

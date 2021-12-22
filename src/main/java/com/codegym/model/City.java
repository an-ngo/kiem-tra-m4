package com.codegym.model;

import lombok.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;

@Entity
@Data
@CrossOrigin("*")
@Table(name = "city")
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double area;
    private int population;
    private double gdp;
    private String description;
    @ManyToOne(targetEntity = National.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "national_id")
    private National national;
}

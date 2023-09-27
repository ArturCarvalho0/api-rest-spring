package br.com.artur.apirestspring.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "vehicles")
public class VehicleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "model_name", length = 50, nullable = false)
    private String modelName;

    @Column(length = 50, nullable = false)
    private String assembler;

    @Column(name = "manufacture_year", nullable = false)
    private int manufacturerYear;

    @Column(name = "model_year", nullable = false)
    private int modelYear;
}

package com.headmaster.arm.pc.components.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "sold_goods")
@Data
public class Nomenclature {

    @Id
    private Long id;

    @Column(name = "nomenclature")
    private String name;

    private int soldQuantity;

}

package com.headmaster.arm.pc.components.service;

import com.headmaster.arm.pc.components.dao.Nomenclature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NomenclatureRepository extends JpaRepository<Nomenclature, Long> {
}

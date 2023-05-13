package com.headmaster.arm.pc.components.service;

import com.headmaster.arm.pc.components.dao.Nomenclature;
import com.headmaster.arm.pc.components.dto.NomenclatureDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NomenclatureServiceImpl implements NomenclatureService {
    private final NomenclatureRepository nomenclatureRepository;


    @Override
    public List<NomenclatureDTO> getAllNomenclatures() {
        List<Nomenclature> nomenclatures = nomenclatureRepository.findAll();
        List<NomenclatureDTO> nomenclatureDTOS = new ArrayList<>();
        for (Nomenclature nomenclature : nomenclatures) {
            NomenclatureDTO dto = new NomenclatureDTO();
            dto.setName(nomenclature.getName());
            dto.setSoldQuantity(nomenclature.getSoldQuantity());
            nomenclatureDTOS.add(dto);
        }
        return nomenclatureDTOS;
    }
}

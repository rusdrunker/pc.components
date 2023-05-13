package com.headmaster.arm.pc.components.view;

import com.headmaster.arm.pc.components.dto.NomenclatureDTO;
import com.headmaster.arm.pc.components.service.NomenclatureService;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Route("")
public class TestView extends VerticalLayout {
    NomenclatureService nomenclatureService;

    @Autowired
    public TestView(NomenclatureService nomenclatureService) {
        this.nomenclatureService = nomenclatureService;

        VerticalLayout layout = new VerticalLayout();

        List<NomenclatureDTO> nomenclatures = nomenclatureService.getAllNomenclatures();

        Grid<NomenclatureDTO> grid = new Grid<>();
        grid.setItems(nomenclatures);
        grid.addColumn(NomenclatureDTO::getName).setHeader("Name");
        grid.addColumn(NomenclatureDTO::getSoldQuantity).setHeader("Sold Quantity");

        layout.add(grid);

        add(
                new H1("Vaadin Test"),
                layout
        );
    }
}

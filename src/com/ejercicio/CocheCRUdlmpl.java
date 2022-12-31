package com.ejercicio;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.List;

public class CocheCRUdlmpl implements CocheCRUD {

    @Override
    public void save() {

    }

    @Override
    public void findAll() {

    }

    @Override
    public void delete() {

    }
    String save = "Guardando";
    String findAll = "Buscar todo";
    String delete = "Borrando";

    @Override
    public String toString() {
        return "CocheCRUdlmpl{" +
                "save='" + save + '\'' +
                ", findAll='" + findAll + '\'' +
                ", delete='" + delete + '\'' +
                '}';
    }
}

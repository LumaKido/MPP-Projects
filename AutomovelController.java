package mpp;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class AutomovelController {
    private List<Automovel> automovels = new ArrayList<>();

    //Controller para listar e gerenciar os carros

    //metodo de adicionar carros
    public void addAutomovel(Automovel automovel) {
        automovels.add(automovel);
    }
    
    //metodo de listar carros
    public void listAutomovel() {
        for (Automovel automovel : automovels) {
            JOptionPane.showMessageDialog(null, "Lista de carros:\n\n" + automovel.getDescricao());
        }
    }
}

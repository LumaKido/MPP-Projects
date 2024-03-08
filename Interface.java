package mpp;

import javax.swing.JOptionPane;

public class Interface {
    //Interface para adquirir e passar informacoes
    public static void main(String[] args) {
        AutomovelController controller = new AutomovelController();
        boolean app = true;
        while (app == true) {
            JOptionPane.showMessageDialog(null, "Bem-vindo a lista de carros!");
            int resp = Integer.parseInt(JOptionPane.showInputDialog("O que deseja fazer?\n\n" +
            "1 - Adicionar um carro\n2 - Mostrar lista de carros\n3 - Sair"));

            switch (resp) {
                case 1:
                    String marca = JOptionPane.showInputDialog("Insira as informacoes do seu carro:\n\nMarca:");
                    double preco = Double.parseDouble(JOptionPane.showInputDialog("Preco: "));
                    String placa = JOptionPane.showInputDialog("Placa:");
                    int qtdPortas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de portas:"));

                    Automovel automovel = new Carro(marca, preco, placa, qtdPortas);

                    controller.addAutomovel(automovel);
                    JOptionPane.showMessageDialog(null, "Carro cadastrado com sucessso!");
                    break;
                case 2:
                    controller.listAutomovel();
                    break;
                case 3:
                    int option = JOptionPane.showConfirmDialog(null, "Deseja sair da aplicacao?");
                    if(option == 0){
                        JOptionPane.showMessageDialog(null, "Okay, ate mais!");
                        app = false;
                    } 
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida, tente novamente.");
                    break;
            }
        }
    }
}

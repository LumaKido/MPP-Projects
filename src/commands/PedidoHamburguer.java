package commands;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class PedidoHamburguer {
    private CommandHistory history = new CommandHistory();
    private Pedido pedidoAtual;
    private List<Pedido> pedidos = new ArrayList<>();

    public void init() {
        JFrame frame = new JFrame("Pedido de Hambúrguer");
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));

        // Ingredientes
        JPanel ingredientesPanel = new JPanel();
        ingredientesPanel.setLayout(new GridLayout(0, 1));

        JCheckBox paoCheck = new JCheckBox("Pão");
        JCheckBox carneCheck = new JCheckBox("Carne");
        JCheckBox queijoCheck = new JCheckBox("Queijo");
        JCheckBox saladaCheck = new JCheckBox("Salada");

        ingredientesPanel.add(paoCheck);
        ingredientesPanel.add(carneCheck);
        ingredientesPanel.add(queijoCheck);
        ingredientesPanel.add(saladaCheck);

        content.add(ingredientesPanel);

        // Botões
        JPanel botoesPanel = new JPanel();
        botoesPanel.setLayout(new FlowLayout());

        JButton confirmarButton = new JButton("Confirmar Pedido");
        JButton verPedidosButton = new JButton("Ver Pedidos");

        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Criar um novo pedido
                pedidoAtual = new Pedido();

                // Adicionar ingredientes ao pedido
                if (paoCheck.isSelected()) pedidoAtual.adicionarIngrediente("Pão");
                if (carneCheck.isSelected()) pedidoAtual.adicionarIngrediente("Carne");
                if (queijoCheck.isSelected()) pedidoAtual.adicionarIngrediente("Queijo");
                if (saladaCheck.isSelected()) pedidoAtual.adicionarIngrediente("Salada");

                // Executar o comando para adicionar o pedido
                AdicionarPedidoCommand comando = new AdicionarPedidoCommand(pedidoAtual);
                comando.execute();

                // Salvar o pedido
                pedidos.add(pedidoAtual);

                // Resetar o pedido atual para o próximo
                pedidoAtual.resetarPedido();
            }
        });

        verPedidosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mostrar os pedidos realizados
                StringBuilder pedidosList = new StringBuilder("Pedidos realizados:\n");
                for (Pedido pedido : pedidos) {
                    pedidosList.append(pedido.getDescricao()).append("\n");
                }
                JOptionPane.showMessageDialog(frame, pedidosList.toString(), "Lista de Pedidos", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        botoesPanel.add(confirmarButton);
        botoesPanel.add(verPedidosButton);

        content.add(botoesPanel);

        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
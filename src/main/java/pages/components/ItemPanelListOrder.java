package pages.components;

import java.awt.Color;
import java.awt.Dimension;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import services.UpdateStatusOrderApi;

public class ItemPanelListOrder extends javax.swing.JPanel {

    private int id;
    private int userId;
    private String status;

    public ItemPanelListOrder(int id, int userId, String nomeItem, Double preco, String status, String ambiente) {
        initComponents();
        this.id = id;
        this.status = status;
        this.userId = userId;
        nameLabel.setText("DESCRIÇÃO: " + new String(nomeItem.getBytes(), StandardCharsets.UTF_8));
        valueLabel.setText("PREÇO: " + preco);
        statusLabel.setText("STATUS: " + new String(status.getBytes(), StandardCharsets.UTF_8));
        Border border = BorderFactory.createMatteBorder(0, 0, 10, 0, Color.WHITE);
        this.setBorder(BorderFactory.createCompoundBorder(this.getBorder(), border));
        changeStatusLabelColor();

        if ("atendimento".equals(ambiente)) {
            // Define a dimensão desejada apenas no eixo X (horizontal)
            Dimension size = this.getPreferredSize();
            size.width = 650; // Altere o tamanho horizontal conforme necessário
            size.height = 180;
            this.setPreferredSize(size);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        orderedCancelButton = new javax.swing.JButton();
        orderedCompletedButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 153, 255));
        setMaximumSize(new java.awt.Dimension(32767, 180));

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("DESCRIÇÃO: ");

        valueLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(255, 255, 255));
        valueLabel.setText("PREÇO:");

        statusLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(255, 255, 255));
        statusLabel.setText("STATUS:");

        orderedCancelButton.setBackground(new java.awt.Color(238, 99, 68));
        orderedCancelButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        orderedCancelButton.setForeground(new java.awt.Color(255, 255, 255));
        orderedCancelButton.setText("NÃO PODE SER FEITO");
        orderedCancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderedCancelButtonMouseClicked(evt);
            }
        });
        orderedCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderedCancelButtonActionPerformed(evt);
            }
        });

        orderedCompletedButton.setBackground(new java.awt.Color(47, 186, 61));
        orderedCompletedButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        orderedCompletedButton.setForeground(new java.awt.Color(255, 255, 255));
        orderedCompletedButton.setText("PEDIDO CONCLUÍDO");
        orderedCompletedButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderedCompletedButtonMouseClicked(evt);
            }
        });
        orderedCompletedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderedCompletedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(valueLabel)
                            .addComponent(statusLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(orderedCompletedButton)
                        .addGap(18, 18, 18)
                        .addComponent(orderedCancelButton)))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valueLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statusLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderedCompletedButton)
                    .addComponent(orderedCancelButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderedCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderedCancelButtonActionPerformed

    }//GEN-LAST:event_orderedCancelButtonActionPerformed

    private void orderedCompletedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderedCompletedButtonActionPerformed

    }//GEN-LAST:event_orderedCompletedButtonActionPerformed

    private void orderedCompletedButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderedCompletedButtonMouseClicked
        changeStatus("concluido");
    }//GEN-LAST:event_orderedCompletedButtonMouseClicked

    private void orderedCancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderedCancelButtonMouseClicked
        changeStatus("cancelado");
    }//GEN-LAST:event_orderedCancelButtonMouseClicked

    private void changeStatusLabelColor() {
        if ("em andamento".equalsIgnoreCase(status)) {
            Color corRGB = new Color(102, 102, 255);
            statusLabel.setVisible(true);
            statusLabel.setForeground(corRGB);
        } else if ("concluido".equalsIgnoreCase(status)) {
            Color corRGB = new Color(0, 204, 51);
            statusLabel.setVisible(true);
            statusLabel.setForeground(corRGB);
        } else {
            Color corRGB = new Color(255, 102, 102);
            statusLabel.setVisible(true);
            statusLabel.setForeground(corRGB);
        }
    }

    private void changeStatus(String status) {
        System.out.println("Clicado!");
        UpdateStatusOrderApi updateStatusOrderApi = new UpdateStatusOrderApi();
        int pedidoId = this.id;
        int usuarioId = this.userId;
        int statusCode;

        String novoStatus = status;

        try {
            statusCode = updateStatusOrderApi.atualizarStatusPedido(pedidoId, usuarioId, novoStatus);
            if (statusCode == 200) {
                statusLabel.setText("STATUS: " + new String(novoStatus.getBytes(), StandardCharsets.UTF_8));
                if (status == "concluido") {
                    statusLabel.setForeground(new Color(47, 186, 61));
                } else {
                    statusLabel.setForeground(new Color(238, 99, 68));
                }
            }
            System.out.println("Pedido atualizado com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao tentar atualizar o pedido: " + e.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton orderedCancelButton;
    private javax.swing.JButton orderedCompletedButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}

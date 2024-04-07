
package pages.components;

import java.awt.Color;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import services.CreateOrder;

public class ItemMenuPanel extends javax.swing.JPanel {
        private String descricao;
        private String status;
        private double preco;
        private int usuarioId;
    
    public ItemMenuPanel(int id, String nomeItem, double preco, String tipoPedido, int usuarioId) {
        this.descricao = nomeItem;
        this.status = "em andamento";
        this.preco = preco;
        this.usuarioId = usuarioId;
        initComponents();
        nameLabel.setText("DESCRIÇÃO: " + new String(nomeItem.getBytes(), StandardCharsets.UTF_8));
        priceLabel.setText("PREÇO: " + preco);
        statusLabel.setVisible(false);
        Border border = BorderFactory.createMatteBorder(0, 0, 10, 0, Color.WHITE);
        this.setBorder(BorderFactory.createCompoundBorder(this.getBorder(), border));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        addItemButton = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();

        setForeground(new java.awt.Color(15, 138, 193));

        jPanel1.setBackground(new java.awt.Color(15, 138, 193));
        jPanel1.setMaximumSize(new java.awt.Dimension(668, 102));
        jPanel1.setMinimumSize(new java.awt.Dimension(668, 102));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("ITEM ");

        nameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("DESCRIÇÃO: Carne assada");

        priceLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(255, 255, 255));
        priceLabel.setText("PREÇO R$: 50,00");

        addItemButton.setBackground(new java.awt.Color(255, 255, 255));
        addItemButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addItemButton.setForeground(new java.awt.Color(0, 0, 0));
        addItemButton.setText("ADICIONAR ITEM");
        addItemButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addItemButtonMouseClicked(evt);
            }
        });
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        statusLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(51, 255, 102));
        statusLabel.setText("Item adicionado com sucesso!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceLabel)
                            .addComponent(nameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(addItemButton))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
       
    }//GEN-LAST:event_addItemButtonActionPerformed

    private void addItemButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addItemButtonMouseClicked
        String descricao = this.descricao;
        String status = this.status;
        double preco = this.preco;
        int usuarioId = this.usuarioId;

        try {
            int statusCode = CreateOrder.criarPedido(descricao, status, preco, usuarioId);
            if(statusCode == 200){
                Color corRGB = new Color(51,255,102);
                statusLabel.setVisible(true);
                statusLabel.setForeground(corRGB);
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao criar o pedido: " + e.getMessage());
        }
    }//GEN-LAST:event_addItemButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}

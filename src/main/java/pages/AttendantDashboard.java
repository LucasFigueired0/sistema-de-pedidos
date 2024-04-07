package pages;

import static data.LocalUserData.getUserData;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.Timer;
import models.OrderedItem;
import models.UserData;
import pages.components.ItemPanelListOrder;
import pages.components.SelectMenu;
import services.OrderedApi;

public class AttendantDashboard extends javax.swing.JFrame {

    private int opcao = 1;
    OrderedApi api = new OrderedApi();
    UserData userData = getUserData();

    public AttendantDashboard() {
        initComponents();
        startOrderedListTimer();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        listPanelScroll = new javax.swing.JScrollPane();
        listPanel = new javax.swing.JPanel();
        updateMenuButton = new javax.swing.JButton();
        addOrderButton = new javax.swing.JButton();
        completedButton = new javax.swing.JButton();
        inProgressButton = new javax.swing.JButton();
        canceledButton = new javax.swing.JButton();
        allButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(15, 138, 193));

        titleLabel.setBackground(new java.awt.Color(255, 255, 255));
        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setToolTipText("");
        titleLabel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                titleLabelFocusGained(evt);
            }
        });
        titleLabel.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                titleLabelInputMethodTextChanged(evt);
            }
        });

        logoutButton.setBackground(new java.awt.Color(153, 255, 255));
        logoutButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(51, 153, 255));
        logoutButton.setText("<- VOLTAR");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ATENDIMENTO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titleLabel)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(logoutButton)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        listPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout listPanelLayout = new javax.swing.GroupLayout(listPanel);
        listPanel.setLayout(listPanelLayout);
        listPanelLayout.setHorizontalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
        );
        listPanelLayout.setVerticalGroup(
            listPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
        );

        listPanelScroll.setViewportView(listPanel);

        updateMenuButton.setBackground(new java.awt.Color(15, 138, 193));
        updateMenuButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        updateMenuButton.setForeground(new java.awt.Color(255, 255, 255));
        updateMenuButton.setText("ATUALIZAR CARDÁPIO");
        updateMenuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMenuButtonMouseClicked(evt);
            }
        });
        updateMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMenuButtonActionPerformed(evt);
            }
        });

        addOrderButton.setBackground(new java.awt.Color(15, 138, 193));
        addOrderButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        addOrderButton.setText("ADICIONAR PEDIDO");
        addOrderButton.setMaximumSize(new java.awt.Dimension(294, 39));
        addOrderButton.setMinimumSize(new java.awt.Dimension(294, 39));
        addOrderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addOrderButtonMouseClicked(evt);
            }
        });

        completedButton.setBackground(new java.awt.Color(0, 204, 51));
        completedButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        completedButton.setForeground(new java.awt.Color(255, 255, 255));
        completedButton.setText("CONCLUÍDO");
        completedButton.setMaximumSize(new java.awt.Dimension(294, 39));
        completedButton.setMinimumSize(new java.awt.Dimension(294, 39));
        completedButton.setPreferredSize(new java.awt.Dimension(138, 32));
        completedButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                completedButtonMouseClicked(evt);
            }
        });

        inProgressButton.setBackground(new java.awt.Color(102, 102, 255));
        inProgressButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inProgressButton.setForeground(new java.awt.Color(255, 255, 255));
        inProgressButton.setText("EM ANDAMENTO");
        inProgressButton.setMaximumSize(new java.awt.Dimension(294, 39));
        inProgressButton.setMinimumSize(new java.awt.Dimension(294, 39));
        inProgressButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inProgressButtonMouseClicked(evt);
            }
        });

        canceledButton.setBackground(new java.awt.Color(255, 102, 102));
        canceledButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        canceledButton.setForeground(new java.awt.Color(255, 255, 255));
        canceledButton.setText("CANCELADO");
        canceledButton.setMaximumSize(new java.awt.Dimension(294, 39));
        canceledButton.setMinimumSize(new java.awt.Dimension(294, 39));
        canceledButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canceledButtonMouseClicked(evt);
            }
        });

        allButton.setBackground(new java.awt.Color(15, 138, 193));
        allButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        allButton.setForeground(new java.awt.Color(255, 255, 255));
        allButton.setText("TODOS");
        allButton.setMaximumSize(new java.awt.Dimension(294, 39));
        allButton.setMinimumSize(new java.awt.Dimension(294, 39));
        allButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateMenuButton))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listPanelScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(allButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inProgressButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(completedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(canceledButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inProgressButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(allButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(completedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(canceledButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(addOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(updateMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(listPanelScroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleLabelInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_titleLabelInputMethodTextChanged

    }//GEN-LAST:event_titleLabelInputMethodTextChanged

    private void titleLabelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_titleLabelFocusGained

    }//GEN-LAST:event_titleLabelFocusGained

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed

        InitialDashboard initial = new InitialDashboard();
        this.dispose();
        initial.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void updateMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMenuButtonActionPerformed

    }//GEN-LAST:event_updateMenuButtonActionPerformed

    private void addOrderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addOrderButtonMouseClicked
        SelectMenu selectMenu = new SelectMenu();
        selectMenu.setVisible(true);
    }//GEN-LAST:event_addOrderButtonMouseClicked

    private void updateMenuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMenuButtonMouseClicked
        UpdateMenu update = new UpdateMenu(userData.getId());
        this.dispose();
        update.setVisible(true);
    }//GEN-LAST:event_updateMenuButtonMouseClicked

    private void completedButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_completedButtonMouseClicked
        this.opcao = 3;
        orderedList();
    }//GEN-LAST:event_completedButtonMouseClicked

    private void inProgressButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inProgressButtonMouseClicked
        this.opcao = 2;
        orderedList();
    }//GEN-LAST:event_inProgressButtonMouseClicked

    private void canceledButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canceledButtonMouseClicked
        this.opcao = 4;
        orderedList();
    }//GEN-LAST:event_canceledButtonMouseClicked

    private void allButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allButtonMouseClicked
        this.opcao = 1;
        orderedList();
    }//GEN-LAST:event_allButtonMouseClicked

    private void startOrderedListTimer() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                orderedList();
            }
        });
        timer.start();
    }

    private void orderedList() {
        int usuarioId = userData.getId();
        listPanel.setLayout(new BoxLayout(listPanel, BoxLayout.Y_AXIS));

        try {
            OrderedItem[] pedidos = api.listarPedidos(usuarioId);

            listPanel.removeAll();

            for (OrderedItem item : pedidos) {
                if (this.opcao == 1) {
                    JPanel newItemPanel = new ItemPanelListOrder(item.getId(), usuarioId, item.getDescricao(), item.getPreco(), item.getStatus(), "atendimento");
                    listPanel.add(newItemPanel);
                } else if (opcao == 2) {
                    if ("em andamento".equalsIgnoreCase(item.getStatus())) {
                        JPanel newItemPanel = new ItemPanelListOrder(item.getId(), usuarioId, item.getDescricao(), item.getPreco(), item.getStatus(), "atendimento");

                        listPanel.add(newItemPanel);
                    }
                } else if (opcao == 3) {
                    if ("concluido".equalsIgnoreCase(item.getStatus())) {
                        JPanel newItemPanel = new ItemPanelListOrder(item.getId(), usuarioId, item.getDescricao(), item.getPreco(), item.getStatus(), "atendimento");

                        listPanel.add(newItemPanel);
                    }
                } else {
                    if ("cancelado".equalsIgnoreCase(item.getStatus())) {
                        JPanel newItemPanel = new ItemPanelListOrder(item.getId(), usuarioId, item.getDescricao(), item.getPreco(), item.getStatus(), "atendimento");

                        listPanel.add(newItemPanel);
                    }
                }

            }

            listPanel.revalidate();
            listPanel.repaint();

            Thread.sleep(100);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrderButton;
    private javax.swing.JButton allButton;
    private javax.swing.JButton canceledButton;
    private javax.swing.JButton completedButton;
    private javax.swing.JButton inProgressButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel listPanel;
    private javax.swing.JScrollPane listPanelScroll;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateMenuButton;
    // End of variables declaration//GEN-END:variables
}

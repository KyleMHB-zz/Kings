/**
 * @author              :KyleMHB
 * Project Number       :0003 V2.0
 * Project Name         :Kings
 * Project Path         :Kings/SourcePackages/JFrameKings/GameGUI.java
 * IDE                  :NETBEANS
 * Goal of Project      - 
 * MainFile is a rule based drinking game using cards for 4+ players.
 * The Rules are read in from a rules.txt so that one can easily change the rules.
 * How the game works:
 * Players shuffle a deck of cards, place a glass between them and circle the
 * cards around the base of the glass.
 * The players then take turns picking cards, each card has its own rule associated to it.
 * Most importantly, there are 4 MainFile, each time a King is picked, 
 * the player who picked it can pour as much of his/her drink into the glass between
 * them as they wish.
 * The game ends when the fourth and final King is picked.
 * The player to pick the final King must down the glass in the center of table.
 */
package JFrameKings;

import javax.swing.JOptionPane;

public class GameGUI extends javax.swing.JFrame {


    public GameGUI() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cardPickedTA = new javax.swing.JTextArea();
        playerLabel = new javax.swing.JLabel();
        skipTurnButton = new javax.swing.JButton();
        drawCardButton1 = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        cardLogTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kings");
        setUndecorated(true);

        panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Kings by Kyle Hoffmann-Barrett"));

        cardPickedTA.setColumns(20);
        cardPickedTA.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cardPickedTA.setLineWrap(true);
        cardPickedTA.setRows(5);
        cardPickedTA.setWrapStyleWord(true);
        cardPickedTA.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cardPickedTA.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cardPickedTA.setEnabled(false);
        jScrollPane1.setViewportView(cardPickedTA);

        playerLabel.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        playerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerLabel.setText("Player 1's Turn");

        skipTurnButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        skipTurnButton.setText("Skip Turn");
        skipTurnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                skipTurnButtonMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                skipTurnButtonMousePressed(evt);
            }
        });

        drawCardButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        drawCardButton1.setText("Draw a Card");
        drawCardButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                drawCardButton1MousePressed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });

        cardLogTA.setColumns(20);
        cardLogTA.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        cardLogTA.setRows(5);
        cardLogTA.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cardLogTA.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        cardLogTA.setEnabled(false);
        jScrollPane2.setViewportView(cardLogTA);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(drawCardButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(skipTurnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(playerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 103, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(playerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(drawCardButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(skipTurnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        int sure=JOptionPane.showConfirmDialog(null, "Are you sure?");
        if (sure == 0){
        JOptionPane.showMessageDialog(null,"Bye!");
        System.exit(0);
        }
    }//GEN-LAST:event_exitButtonMouseClicked

    private void skipTurnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_skipTurnButtonMouseClicked
        

    }//GEN-LAST:event_skipTurnButtonMouseClicked

    private void skipTurnButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_skipTurnButtonMousePressed
        String skip=Kings.skipTurn();
        cardLogTA.append(skip);
        cardPickedTA.setText(skip);
        playerLabel.setText("Player "+(Kings.playerTurn)+"'s turn");
        
    }//GEN-LAST:event_skipTurnButtonMousePressed

    private void drawCardButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drawCardButton1MousePressed
        cardLogTA.append("Player "+Kings.playerTurn+" drew the "
                + JFrameKings.Kings.passCard()+"\n");
        cardPickedTA.setText(Kings.playGame());
        playerLabel.setText("Player "+(Kings.playerTurn)+"'s turn");
    }//GEN-LAST:event_drawCardButton1MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea cardLogTA;
    public javax.swing.JTextArea cardPickedTA;
    private javax.swing.JButton drawCardButton1;
    private javax.swing.JButton exitButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel;
    public javax.swing.JLabel playerLabel;
    private javax.swing.JButton skipTurnButton;
    // End of variables declaration//GEN-END:variables

}

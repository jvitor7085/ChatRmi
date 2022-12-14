/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package chat.grafico;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Vitor
 */
public class Conversa extends javax.swing.JFrame {

    Cliente cliente=new Cliente();
    /**
     * Creates new form Conversa
     */
    public Conversa() {
        initComponents();
    }
    public Conversa(String nome, int id){
        initComponents();
        cliente.setId(id);
        cliente.setNome(nome);
       lblNomeUser.setText(cliente.getNome()); 
       txtAreaConversa.append("\n----- "+cliente.getNome()+" Entrou no Chat!----- \n\n");
       txtAreaConversa.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPerfil = new javax.swing.JPanel();
        lblNomeUser = new javax.swing.JLabel();
        spaneAreaMsg = new javax.swing.JScrollPane();
        txtAreaConversa = new javax.swing.JTextArea();
        panelAreaEnvioMsg = new javax.swing.JPanel();
        txtMsg = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNomeUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNomeUser.setText("User2");

        javax.swing.GroupLayout panelPerfilLayout = new javax.swing.GroupLayout(panelPerfil);
        panelPerfil.setLayout(panelPerfilLayout);
        panelPerfilLayout.setHorizontalGroup(
            panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPerfilLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPerfilLayout.setVerticalGroup(
            panelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPerfilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        txtAreaConversa.setColumns(20);
        txtAreaConversa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAreaConversa.setRows(5);
        txtAreaConversa.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtAreaConversaComponentAdded(evt);
            }
        });
        spaneAreaMsg.setViewportView(txtAreaConversa);

        txtMsg.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                txtMsgComponentMoved(evt);
            }
        });
        txtMsg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMsgActionPerformed(evt);
            }
        });
        txtMsg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMsgKeyReleased(evt);
            }
        });

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAreaEnvioMsgLayout = new javax.swing.GroupLayout(panelAreaEnvioMsg);
        panelAreaEnvioMsg.setLayout(panelAreaEnvioMsgLayout);
        panelAreaEnvioMsgLayout.setHorizontalGroup(
            panelAreaEnvioMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAreaEnvioMsgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMsg)
                .addGap(18, 18, 18)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelAreaEnvioMsgLayout.setVerticalGroup(
            panelAreaEnvioMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAreaEnvioMsgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAreaEnvioMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(spaneAreaMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
            .addComponent(panelAreaEnvioMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spaneAreaMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelAreaEnvioMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        String mensagem=txtMsg.getText();
        txtMsg.setText("");
        //pega o texto digitado e manda para o cliente, enviar ao servidor
        cliente.mensagemEnviada(mensagem);
        //exibe a mensagem que digitamos juntamente com o nosso nome
        //txtAreaConversa.append(cliente.getNome()+": " + mensagem+"\n");
        //essa parte est?? executando direto pois o servidor ainda n??o est?? envolvido
        txtAreaConversa.append(cliente.getMensagem()+"\n");
    
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtMsgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMsgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMsgActionPerformed

    private void txtMsgComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txtMsgComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMsgComponentMoved

    private void txtAreaConversaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtAreaConversaComponentAdded
        // TODO add your handling code here:
        //txtArea
        
    }//GEN-LAST:event_txtAreaConversaComponentAdded

    private void txtMsgKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMsgKeyReleased
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { //Se quiser a tecla Enter
    JOptionPane.showMessageDialog(null,"Era para enviar");
}
    }//GEN-LAST:event_txtMsgKeyReleased

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
            java.util.logging.Logger.getLogger(Conversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JLabel lblNomeUser;
    private javax.swing.JPanel panelAreaEnvioMsg;
    private javax.swing.JPanel panelPerfil;
    private javax.swing.JScrollPane spaneAreaMsg;
    private javax.swing.JTextArea txtAreaConversa;
    private javax.swing.JTextField txtMsg;
    // End of variables declaration//GEN-END:variables
}

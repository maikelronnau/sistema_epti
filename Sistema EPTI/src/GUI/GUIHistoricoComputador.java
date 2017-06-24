
package GUI;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.HistoricoComputadorVO;
import servicos.HistoricoComputadorServicos;
import servicos.ServicosFactory;

/**
 * @author Maikel Maciel Rönnau
 * @version 1.0
 * @since 26/01/2015
 */
public class GUIHistoricoComputador extends javax.swing.JDialog {

    //Variável para receber o histórico e o ID:
    private static long idHistoricoComputador;
    private static String historicoComputador;
    private static String nomeComputador;
    
    /**
     * Creates new form GUIHistorico
     * @param parent
     * @param modal
     * @param idHistoricoComputador ID do histórico do computador
     * @param historicoComputador Histórico do computador
     * @param nomeComputador
     */
    public GUIHistoricoComputador(java.awt.Frame parent, boolean modal, long idHistoricoComputador, 
            String historicoComputador, String nomeComputador) {
        super(parent, modal);
        this.idHistoricoComputador = idHistoricoComputador;
        this.historicoComputador = historicoComputador;
        this.nomeComputador = nomeComputador;
        initComponents();
        
        //Enviando dados:
        enviarDados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtHistoricoComputador = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaHistoricoComputador = new javax.swing.JTextArea();
        jbSalvar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jtComputador = new javax.swing.JLabel();
        jtNomeComputador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Histórico computador");
        setResizable(false);

        jtHistoricoComputador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jtHistoricoComputador.setText("Histórico computador");

        jtaHistoricoComputador.setColumns(20);
        jtaHistoricoComputador.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jtaHistoricoComputador.setLineWrap(true);
        jtaHistoricoComputador.setRows(5);
        jtaHistoricoComputador.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jtaHistoricoComputador);

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/confirmar.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        jbSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbSalvarKeyPressed(evt);
            }
        });

        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cancelar.png"))); // NOI18N
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        jbSair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbSairKeyPressed(evt);
            }
        });

        jtComputador.setText("Nome do computador:");

        jtNomeComputador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtHistoricoComputador)
                        .addGap(96, 96, 96)
                        .addComponent(jtComputador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtNomeComputador, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jbSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNomeComputador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtHistoricoComputador)
                        .addComponent(jtComputador)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbSair))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /*** Métodos da classe ****************************************************/
    
    /**
     * @author Maikel Maciel Rönnau
     * @version 1.0
     * @since 27/01/2015
     */
    private void enviarDados(){
        
        //Enviando dados para a interface:
        jtNomeComputador.setText(nomeComputador);
        jtaHistoricoComputador.setText(historicoComputador);        
    }//Fecha método enviarDados.
    
    /**
     * @author Maikel Maciel Rönnau
     * @version 1.0
     * @since 26/01/2015
     */
    private void salvar(){
        
        try {
            
            //Instanciando objeto para acessar o método de atualização:
            HistoricoComputadorServicos hs = ServicosFactory.getHistoricoComputadorServicos();
            
            //Objeto para receber os dados:
            HistoricoComputadorVO his = new HistoricoComputadorVO();
            
            //Enviando dados para o objeto:
            his.setIdHistoricoComputador(idHistoricoComputador);
            his.setHistoricoComputador(jtaHistoricoComputador.getText());
            
            //Atualizando histórico:
            hs.atualizarHistorico(his);

            //Mensagem de confirmação:
            JOptionPane.showMessageDialog(
                this,
                "Histórico salvo com sucesso!",
                "Atualização concluída",
                JOptionPane.INFORMATION_MESSAGE);
            //Fim da mensagem de confirmação.
        } catch (SQLException | HeadlessException e) {
         
            //Mensagem de erro:
            JOptionPane.showMessageDialog(
                this,
                "Falha ao salvar histórico!",
                "Erro",
                JOptionPane.ERROR_MESSAGE);
            //Fim da mensagem de erro.
        }//Fecha catch.
    }//Fecha método salvarHistorico.
    
    /**
     * @author Maikel Maciel Rönnau
     * @version 1.0
     * @since 06/01/2015
     */
    private void cancelar(){
        
        //Fechando a janela:
        dispose();
    }//Fecha método cancelar.
    
    /*** Fim dos métodos da classe ********************************************/
    
    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        
        //Método salvar:
        salvar();
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbSalvarKeyPressed
        
        //Verificando se o usuário utilizou o teclado para selecionar a opção:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            salvar();
        }//Fecha if.
    }//GEN-LAST:event_jbSalvarKeyPressed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        
        //Método cancelar:
        cancelar();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbSairKeyPressed
        
        //Verificando se o usuário utilizou o teclado para selecionar a opção:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            cancelar();
        }//Fecha if.
    }//GEN-LAST:event_jbSairKeyPressed

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
            java.util.logging.Logger.getLogger(GUIHistoricoComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIHistoricoComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIHistoricoComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIHistoricoComputador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GUIHistoricoComputador dialog = new GUIHistoricoComputador(new javax.swing.JFrame(), true, 0, "", "");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jtComputador;
    private javax.swing.JLabel jtHistoricoComputador;
    private javax.swing.JLabel jtNomeComputador;
    private javax.swing.JTextArea jtaHistoricoComputador;
    // End of variables declaration//GEN-END:variables
}
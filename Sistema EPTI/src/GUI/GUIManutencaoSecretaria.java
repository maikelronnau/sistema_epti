
package GUI;

import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.PermissoesVO;
import modelo.SecretariaVO;
import servicos.SecretariaServicos;
import servicos.ServicosFactory;
import utilidades.Validacao;

/**
 * @author Maikel Maciel Rönnau
 * @version 1.0
 * @since 06/01/2015
 */
public class GUIManutencaoSecretaria extends javax.swing.JInternalFrame {

    //Instanciando objeto da classe base:
    private static SecretariaVO sec;
    
    //Instanciando objeto para receber as permissões do usuário:
    private static PermissoesVO per;
    
    /*** Construção da tabela *************************************************/
    
    //Configurando colunas da tabela:
    String[] colunas = new String[]{"Sigla", "Nome"};
    
    //Criando objeto da tabela:
    JTable tabela = new JTable();

    //Variável para receber o modelo da tabela:
    DefaultTableModel modeloTabela;
    
    /*** Fim da construção da tabela ******************************************/
    
    /**
     * Creates new form GUIManutencaoSecretaria
     * @param per Objeto com as permissões do usuário
     */
    public GUIManutencaoSecretaria(PermissoesVO per) {
        this.per = per;        
        initComponents();
        
        //Recebendo modelo da tabela:
        this.modeloTabela = (DefaultTableModel)jTableSecretaria.getModel();
        
        //Método para preencher os dados da tabela:
        preencherTabela();
        
        //Configurando as permissões:
        configurarPermissoes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbgTipoDePesquisa = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSecretaria = new javax.swing.JTable();
        jlPesquisar = new javax.swing.JLabel();
        jtPesquisar = new javax.swing.JTextField();
        jlTipoDePesquisa = new javax.swing.JLabel();
        jrPorNome = new javax.swing.JRadioButton();
        jrPorSigla = new javax.swing.JRadioButton();
        jlManutencaoSecretaria = new javax.swing.JLabel();
        jbCancelar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAtualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Manutenção de secretarias cadastradas");

        jTableSecretaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sigla", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSecretaria.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableSecretaria);
        if (jTableSecretaria.getColumnModel().getColumnCount() > 0) {
            jTableSecretaria.getColumnModel().getColumn(0).setResizable(false);
            jTableSecretaria.getColumnModel().getColumn(1).setResizable(false);
        }

        jlPesquisar.setText("Pesquisar:");

        jtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesquisarKeyReleased(evt);
            }
        });

        jlTipoDePesquisa.setText("Tipo de pesquisa:");

        jbgTipoDePesquisa.add(jrPorNome);
        jrPorNome.setSelected(true);
        jrPorNome.setText("Por nome");
        jrPorNome.setActionCommand("nomesecretaria");

        jbgTipoDePesquisa.add(jrPorSigla);
        jrPorSigla.setText("Por sigla");
        jrPorSigla.setActionCommand("siglasecretaria");

        jlManutencaoSecretaria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jlManutencaoSecretaria.setText("Manutenção secretarias");

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/cancelar.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jbCancelar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbCancelarKeyPressed(evt);
            }
        });

        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/editar.png"))); // NOI18N
        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });
        jbEditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbEditarKeyPressed(evt);
            }
        });

        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });
        jbExcluir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbExcluirKeyPressed(evt);
            }
        });

        jbAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/atualizar.png"))); // NOI18N
        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });
        jbAtualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jbAtualizarKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbAtualizar)
                        .addGap(11, 11, 11)
                        .addComponent(jbEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jbExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jbCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlManutencaoSecretaria))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlPesquisar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlTipoDePesquisa)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrPorNome)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrPorSigla))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlManutencaoSecretaria)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPesquisar)
                    .addComponent(jtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTipoDePesquisa)
                    .addComponent(jrPorNome)
                    .addComponent(jrPorSigla))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAtualizar)
                    .addComponent(jbEditar)
                    .addComponent(jbExcluir)
                    .addComponent(jbCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*** Métodos da classe ****************************************************/

    /**
     * @author Maikel Maciel Rönnau
     * @version 1.0
     * @since 14/01/2015
     */
    private void configurarPermissoes(){
        
        /*** Verificando as permissões e definindo as configurações ***********/
        
        if(per.getEditarSecretaria() == 0){
            jbEditar.setEnabled(false);
        }//Fecha if.
        
        if(per.getExcluirSecretaria() == 0){
            jbExcluir.setEnabled(false);
        }//Fecha if.
        
        /*** Fim da verificação das permissões ********************************/
    }//Fecha método configurarPermissoes.
    
    /**
     * @author Maikel Maciel Rönnau
     * @version 1.0
     * @since 01/01/2015
     */
    private void construirTabela(){

        //Configurando tabela:
        configurarTabela();
        
        //Enviando modelo da tabela:
        tabela.setModel(modeloTabela);

        //Definindo modelo na interface (inserindo dados):
        jTableSecretaria.setModel(tabela.getModel());        
    }//Fecha método construirTabela.
    
    /**
     * @author Maikel Maciel Rönnau
     * @version 1.0
     * @since 01/01/2015
     */
    private void configurarTabela(){
        
        /*** Padrão para todas as tabelas *************************************/
        
        /* Estes modificadores podem ser usados para configurar a tabela
           conforme as necessidades. Para usá-los devem ser colocados no
           construtor da classe.
        */
        //Variáveis para receberem o alinhamento dos dados das colunas:
        //DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        //DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
        //DefaultTableCellRenderer direita = new DefaultTableCellRenderer();
        
        //Definindo posição dos dados:
        //esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        //centro.setHorizontalAlignment(SwingConstants.CENTER);
        //direita.setHorizontalAlignment(SwingConstants.RIGHT);
        
        /*** Padrão para todas as tabelas *************************************/

        //Definindo tamanho das colunas:
        jTableSecretaria.getColumnModel().getColumn(0).setMaxWidth(60);
    }//Fecha método configurarTabelaSetor.
    
    /**
     * @author Maikel Maciel Rönnau
     * @version 1.0
     * @since 01/01/2015
     */
    private void preencherTabela(){
        
        try {
            
            //Removendo as linha da tabela:
            modeloTabela.setNumRows(0);
            
            //Instanciando objeto para acessar o método de busca:
            SecretariaServicos ss = ServicosFactory.getSecretariaServicos();
            
            //ArrayList para receber os dados da busca:
            ArrayList<SecretariaVO> secretaria;
            
            //Buscando secretarias:
            secretaria = ss.selecionarSecretarias();
            
            //Inserindo dados no modelo da tabela:
            secretaria.stream().forEach((secretaria1) -> {
                modeloTabela.addRow(new Object[]{
                    secretaria1,
                    secretaria1.getNomeSecretaria()
                });
            });//Fim da insersão das linhas na tabela.
            
            //Construindo tabela:
            construirTabela();
        } catch (SQLException e) {
            
            //Mensagem de erro:
            JOptionPane.showMessageDialog(
                this,
                "Falha ao montar a tabela!",
                "Erro",
                JOptionPane.ERROR_MESSAGE);
            //Fim da mensagem de erro.
            
            //Fechando janela:
            cancelar();
        }//Fecha catch.
    }//Fecha método preencherTabela.
    
    /**
     * @author Maikel Maciel Rönnau
     * @version 1.0
     * @since 07/01/2015
     */
    private void editar(){
        
        try {
            
            //Variável para receber o número da linha selecionada:
            int linha = jTableSecretaria.getSelectedRow();

            //Verificando se o usuário selecionou uma linha para edição:
            if (linha == -1) {

                //Mensagem de erro:
                JOptionPane.showMessageDialog(
                    this,
                    "Selecione uma linha para editar!",
                    "Nenhuma linha selecionada",
                    JOptionPane.INFORMATION_MESSAGE);
                //Fim da mensagem de erro.
            } else {

                //Recebendo o objeto da secretaria a ser editado:
                sec = (SecretariaVO)jTableSecretaria.getValueAt(linha, 0);
                
                //Instanciando objeto da classe GUIEditarSecretaria:
                GUIEditarSecretaria ged = new GUIEditarSecretaria(null, closable, sec);

                //Tornando a janela visível:
                ged.setVisible(true);
            }//Fecha else.
        } catch (Exception e) {

            //Mensagem de erro:
            JOptionPane.showMessageDialog(
                this,
                "Falha ao abrir a edição da secretaria!",
                "Erro",
                JOptionPane.ERROR_MESSAGE);
            //Fim da mensagem de erro.
        }//Fecha catch.
    }//Fecha método editar.
    
    /**
     * @author Maikel Maciel Rönnau
     * @version 1.0
     * @since 07/01/2015
     */
    private void excluir(){
        
        //Variável para receber o número da linha selecionada:
        int linha = jTableSecretaria.getSelectedRow();
        
        //Verificando se o usuário selecionou uma linha para edição:
        if (linha == -1) {

            //Mensagem de erro:
            JOptionPane.showMessageDialog(
                this,
                "Selecione uma linha para excluir!",
                "Nenhuma linha selecionada",
                JOptionPane.INFORMATION_MESSAGE);
            //Fim da mensagem de erro.
        } else {
            
            try {
            
                //Verificando se o usuário deseja mesmo excluir:
                int opcao = JOptionPane.showConfirmDialog(
                                this,
                                "Tem certeza que deseja excluir esta secretaria? "
                              + "Considere que seus setores e computadores também serão excluídos.",
                                "Confirmar exclusão",
                                JOptionPane.YES_NO_OPTION);
                //Fim da mensagem de confirmação.

                //Verificando a resposta do usuário:
                if(opcao == 0){
                    
                    //Recebendo o objeto da secretaria a ser excluida:
                    sec = (SecretariaVO)jTableSecretaria.getValueAt(linha, 0);
                    
                    //Instaciando obejeto para acessar o método de exclusão:
                    SecretariaServicos ss = ServicosFactory.getSecretariaServicos();
                    
                    //Executando exclusão:
                    ss.excluirSecretaria(String.valueOf(sec.getIdSecretaria()));
                }//Fecha if.
            } catch (SQLException e) {
                
                //Mensagem de erro:
                JOptionPane.showMessageDialog(
                    this,
                    "Falha ao deletar secretaria!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
                //Fim da mensagem de erro.
            }//Fecha catch.
        }//Fecha else.        
    }//Fecha método excluir.
    
    /**
     * @author Maikel Maciel Rönnau
     * @version 1.0
     * @since 07/01/2015
     */
    private void filtrar(){
        
        try {
            
            //Verificando se existe uma pesquisa a ser feita:
            if(!jtPesquisar.getText().isEmpty()){
                
                //If para verificar o tipo de pesquisa:
                if(jbgTipoDePesquisa.getSelection().getActionCommand().equals("nomesecretaria")){
                    
                    //Validando pesquisa:
                    Validacao.validarPesquisaNomeProprio(jtPesquisar.getText());
                } else {
                    
                    //Validando pesquisa:
                    Validacao.validarPesquisaSigla(jtPesquisar.getText());
                }//Fecha if.

                //Instanciando objeto para acessar o método de busca:
                SecretariaServicos ss = ServicosFactory.getSecretariaServicos();                
                
                //ArrayList para receber os dados da busca:
                ArrayList<SecretariaVO> secretaria;

                //Buscando secretarias:
                secretaria = ss.filtrarSecretaria(jbgTipoDePesquisa.getSelection().getActionCommand(), 
                        "%"+jtPesquisar.getText()+"%");
                
                //Removendo as linha da tabela:
                modeloTabela.setNumRows(0);

                //Inserindo dados no modelo da tabela:
                secretaria.stream().forEach((secretaria1) -> {
                    modeloTabela.addRow(new Object[]{
                        secretaria1,
                        secretaria1.getNomeSecretaria()
                    });
                });//Fim da insersão das linhas na tabela.

                //Construindo tabela:
                construirTabela();
            } else {
                
                //Preenchendo tabela:
                preencherTabela();
            }//Fecha else.
        } catch (SQLException e) {
            
            //Mensagem de erro:
            JOptionPane.showMessageDialog(
                this,
                "Falha ao filtrar secretaria!",
                "Erro",
                JOptionPane.ERROR_MESSAGE);
            //Fim da mensagem de erro.
        } catch (Exception e) {
            
            //Mensagem de erro:
            JOptionPane.showMessageDialog(
                this,
                "Pesquisa inválida!",
                "Erro",
                JOptionPane.WARNING_MESSAGE);
            //Fim da mensagem de erro.
            
            //Limpando campo de pesquisa:
            jtPesquisar.setText(null);
        }//Fecha catch.
    }//Fecha método filtar.
    
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
    
    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        
        //Método preencherTabela:
        preencherTabela();
    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jbAtualizarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbAtualizarKeyPressed
        
        //Verificando se o usuário utilizou o teclado para selecionar a opção:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            preencherTabela();
        }//Fecha if.
    }//GEN-LAST:event_jbAtualizarKeyPressed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        
        //Método editar:
        editar();
        preencherTabela();
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbEditarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbEditarKeyPressed
        
        //Verificando se o usuário utilizou o teclado para selecionar a opção:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            editar();
            preencherTabela();
        }//Fecha if.
    }//GEN-LAST:event_jbEditarKeyPressed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        
        //Método excluir:
        excluir();
        preencherTabela();
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbExcluirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbExcluirKeyPressed
        
        //Verificando se o usuário utilizou o teclado para selecionar a opção:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            excluir();
            preencherTabela();
        }//Fecha if.
    }//GEN-LAST:event_jbExcluirKeyPressed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        
        //Método cancelar:
        cancelar();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbCancelarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jbCancelarKeyPressed
        
        //Verificando se o usuário utilizou o teclado para selecionar a opção:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            cancelar();
        }//Fecha if.
    }//GEN-LAST:event_jbCancelarKeyPressed

    private void jtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisarKeyReleased
        
        //Método filtrar:
        filtrar();
    }//GEN-LAST:event_jtPesquisarKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSecretaria;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.ButtonGroup jbgTipoDePesquisa;
    private javax.swing.JLabel jlManutencaoSecretaria;
    private javax.swing.JLabel jlPesquisar;
    private javax.swing.JLabel jlTipoDePesquisa;
    private javax.swing.JRadioButton jrPorNome;
    private javax.swing.JRadioButton jrPorSigla;
    private javax.swing.JTextField jtPesquisar;
    // End of variables declaration//GEN-END:variables
}

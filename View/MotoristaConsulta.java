/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Model.Motorista;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcos
 */
public class MotoristaConsulta extends javax.swing.JInternalFrame {

    /**
     * Creates new form MotoristaConsulta
     */
    public MotoristaConsulta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTCpfBuscar = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTID = new javax.swing.JTextField();
        jTNOME = new javax.swing.JTextField();
        jLabelMarca = new javax.swing.JLabel();
        jLabelPLACA = new javax.swing.JLabel();
        jTCPF = new javax.swing.JTextField();
        jLabelSeguro = new javax.swing.JLabel();
        jTBAIRRO = new javax.swing.JTextField();
        jLabelCidade = new javax.swing.JLabel();
        jTENDERECO = new javax.swing.JTextField();
        jTCIDADE = new javax.swing.JTextField();
        jLabelDataIni = new javax.swing.JLabel();
        jLabelStatus = new javax.swing.JLabel();
        jTESTADO = new javax.swing.JTextField();
        jLabelStatus1 = new javax.swing.JLabel();
        jTSTATUS = new javax.swing.JTextField();
        jLabelPLACA1 = new javax.swing.JLabel();
        jTCNHNumero = new javax.swing.JTextField();
        jLabelPLACA2 = new javax.swing.JLabel();
        jTCNHCategoria = new javax.swing.JTextField();
        jLabelPLACA3 = new javax.swing.JLabel();
        jTNaturalidade = new javax.swing.JTextField();
        jLabelPLACA4 = new javax.swing.JLabel();
        jTNacionalidade = new javax.swing.JTextField();
        jLabelPLACA5 = new javax.swing.JLabel();
        jTDataNascimento = new javax.swing.JTextField();
        jBExcluir = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMotorista = new javax.swing.JTable();

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Motorista"));

        jLabel5.setText("ID");

        jTID.setEditable(false);
        jTID.setBackground(new java.awt.Color(255, 255, 204));

        jLabelMarca.setText("NOME");

        jLabelPLACA.setText("CPF");

        jLabelSeguro.setText("BAIRRO");

        jLabelCidade.setText("ENDEREÇO");

        jLabelDataIni.setText("CIDADE");

        jLabelStatus.setText("ESTADO");

        jLabelStatus1.setText("STATUS");

        jLabelPLACA1.setText("CNH Numero");

        jLabelPLACA2.setText("CNH Categoria");

        jLabelPLACA3.setText("Naturalidade");

        jLabelPLACA4.setText("Nacionalidade");

        jLabelPLACA5.setText("DATA NASC.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelSeguro)
                        .addGap(18, 18, 18)
                        .addComponent(jTBAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelDataIni)
                        .addGap(27, 27, 27)
                        .addComponent(jTCIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelStatus)
                        .addGap(18, 18, 18)
                        .addComponent(jTESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelStatus1)
                        .addGap(18, 18, 18)
                        .addComponent(jTSTATUS, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPLACA3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelPLACA4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelMarca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTNOME))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelPLACA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelPLACA1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTCNHNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelPLACA2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTCNHCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelPLACA5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMarca)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPLACA5)
                            .addComponent(jTDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTNOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPLACA)
                    .addComponent(jTCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPLACA1)
                    .addComponent(jTCNHNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPLACA2)
                    .addComponent(jTCNHCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPLACA3)
                    .addComponent(jTNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPLACA4)
                    .addComponent(jTNacionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCidade)
                    .addComponent(jTENDERECO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTBAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTCIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelDataIni))
                    .addComponent(jLabelSeguro, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTESTADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStatus))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStatus1)
                    .addComponent(jTSTATUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jLabel1.setText("CPF");

        jTableMotorista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "CPF", "DATANASC", "ENDERECO", "BAIRRO", "CIDADE", "ESTADO", "STATUS", "NATURALIDADE", "NACIONALIDADE", "CNHNUMERO", "CNH-CATEGORIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMotorista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMotoristaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMotorista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTCpfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(jBAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBSair)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTCpfBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBExcluir)
                    .addComponent(jBSair)
                    .addComponent(jBAlterar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
  public void limpar(){
        
        //Limpa a tabela
        DefaultTableModel model = (DefaultTableModel)jTableMotorista.getModel(); 
        model.setNumRows(0);
        
        //Limpando os campos de texto
        jTID.setText("");
        jTNOME.setText("");
        jTCPF.setText("");
        jTDataNascimento.setText("");
        jTENDERECO.setText("");
        jTBAIRRO.setText("");
        jTCIDADE.setText("");
        jTESTADO.setText("");
        jTSTATUS.setText("");
        
        jTNacionalidade.setText("");
        jTNaturalidade.setText("");
        jTCNHNumero.setText("");
        jTCNHCategoria.setText("");
        
        
        //Colocando o foco na text do nome artístico
        jTNOME.grabFocus();
      }
      
  
  
  
    
   
   public void carregarTabela(){
        Motorista motorista = new Motorista();
        ArrayList<Motorista> arrayDeMotorista = new ArrayList<Motorista>(); 
        
        //Chamando a busca no banco passando a data
        arrayDeMotorista = motorista.buscar(jTCpfBuscar.getText());
        
        //Apagando os dados da tabela para mostrar os novos
        limpar();
        
        DefaultTableModel model = (DefaultTableModel) jTableMotorista.getModel();
        
        //Andando na lista de tarefa e montando as linhas do TABLEMODEL
        for(int i=0; i<arrayDeMotorista.size(); i++){
            
            //Criando as colunas da linha i do TABLEMODEL
            String colunas[] = new String[13];
            colunas[0] = String.valueOf(arrayDeMotorista.get(i).getCodigo());
            colunas[1] = String.valueOf(arrayDeMotorista.get(i).getNome());
            colunas[2] = String.valueOf(arrayDeMotorista.get(i).getCpf());
            colunas[3] = String.valueOf(arrayDeMotorista.get(i).getDatanascimento());
            colunas[4] = String.valueOf(arrayDeMotorista.get(i).getEndereco());
            colunas[5] = String.valueOf(arrayDeMotorista.get(i).getBairro());
            colunas[6] = String.valueOf(arrayDeMotorista.get(i).getCidade());
            colunas[7] = String.valueOf(arrayDeMotorista.get(i).getEstado());
            colunas[8] = String.valueOf(arrayDeMotorista.get(i).getStatus());
            colunas[9] = String.valueOf(arrayDeMotorista.get(i).getNaturalidade());
            colunas[10] = String.valueOf(arrayDeMotorista.get(i).getNacionalidade());
            colunas[11] = String.valueOf(arrayDeMotorista.get(i).getCnhnumero());
            colunas[12] = String.valueOf(arrayDeMotorista.get(i).getCnhcategoria());
            
           
            //Adicionando uma linha no TABLEMODEL
            model.addRow(colunas);
        } 

        jTableMotorista.setModel(model);
    }    
    
    
    
    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        carregarTabela();
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        Motorista objMotorista = new Motorista();

        objMotorista.setCodigo(jTID.getText());
        objMotorista.setNome(jTNOME.getText());
        objMotorista.setCpf(jTCPF.getText());
        objMotorista.setDatanascimento(jTDataNascimento.getText());
        objMotorista.setEndereco(jTENDERECO.getText());
        objMotorista.setBairro(jTBAIRRO.getText());
        objMotorista.setCidade(jTCIDADE.getText());
        objMotorista.setEstado(jTESTADO.getText());
        objMotorista.setStatus(jTSTATUS.getText());
        
        objMotorista.setNaturalidade(jTNaturalidade.getText());
        objMotorista.setNacionalidade(jTNacionalidade.getText());
        objMotorista.setCnhnumero(jTCNHNumero.getText());
        objMotorista.setCnhcategoria(jTCNHCategoria.getText());
        
        objMotorista.alterar();

        jTCpfBuscar.setText(objMotorista.getCpf());
        carregarTabela();
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        Motorista objMotorista = new Motorista();
        objMotorista.setCodigo(jTID.getText());
        objMotorista.setNome(jTNOME.getText());
        objMotorista.setCpf(jTCPF.getText());
        objMotorista.setDatanascimento(jTDataNascimento.getText());
        objMotorista.setEndereco(jTENDERECO.getText());
        objMotorista.setBairro(jTBAIRRO.getText());
        objMotorista.setCidade(jTCIDADE.getText());
        objMotorista.setEstado(jTESTADO.getText());
        objMotorista.setStatus(jTSTATUS.getText());
        
        objMotorista.setNaturalidade(jTNaturalidade.getText());
        objMotorista.setNacionalidade(jTNacionalidade.getText());
        objMotorista.setCnhnumero(jTCNHNumero.getText());
        objMotorista.setCnhcategoria(jTCNHCategoria.getText());
        
        
        
        
        objMotorista.excluir();

        jTCpfBuscar.setText(objMotorista.getCpf());
        carregarTabela();
    }//GEN-LAST:event_jBExcluirActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        setVisible(isClosed);
    }//GEN-LAST:event_jBSairActionPerformed

    private void jTableMotoristaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMotoristaMouseClicked
        if (evt.getClickCount() == 1){

            jTID.setText((String)jTableMotorista.getValueAt(jTableMotorista.getSelectedRow(),0));
            jTNOME.setText((String)jTableMotorista.getValueAt(jTableMotorista.getSelectedRow(),1));
            jTCPF.setText((String)jTableMotorista.getValueAt(jTableMotorista.getSelectedRow(),2));
            jTDataNascimento.setText((String)jTableMotorista.getValueAt(jTableMotorista.getSelectedRow(),3));
            jTENDERECO.setText((String)jTableMotorista.getValueAt(jTableMotorista.getSelectedRow(),4));
            jTBAIRRO.setText((String)jTableMotorista.getValueAt(jTableMotorista.getSelectedRow(),5));
            jTCIDADE.setText((String)jTableMotorista.getValueAt(jTableMotorista.getSelectedRow(),6));
            jTESTADO.setText((String)jTableMotorista.getValueAt(jTableMotorista.getSelectedRow(),7));
            jTSTATUS.setText((String)jTableMotorista.getValueAt(jTableMotorista.getSelectedRow(),8));
            
            jTNaturalidade.setText((String)jTableMotorista.getValueAt(jTableMotorista.getSelectedRow(),9));
            jTNacionalidade.setText((String)jTableMotorista.getValueAt(jTableMotorista.getSelectedRow(),10));
            jTCNHNumero.setText((String)jTableMotorista.getValueAt(jTableMotorista.getSelectedRow(),11));
            jTCNHCategoria.setText((String)jTableMotorista.getValueAt(jTableMotorista.getSelectedRow(),12));
            


        }
    }//GEN-LAST:event_jTableMotoristaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelDataIni;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelPLACA;
    private javax.swing.JLabel jLabelPLACA1;
    private javax.swing.JLabel jLabelPLACA2;
    private javax.swing.JLabel jLabelPLACA3;
    private javax.swing.JLabel jLabelPLACA4;
    private javax.swing.JLabel jLabelPLACA5;
    private javax.swing.JLabel jLabelSeguro;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelStatus1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTBAIRRO;
    private javax.swing.JTextField jTCIDADE;
    private javax.swing.JTextField jTCNHCategoria;
    private javax.swing.JTextField jTCNHNumero;
    private javax.swing.JTextField jTCPF;
    private javax.swing.JTextField jTCpfBuscar;
    private javax.swing.JTextField jTDataNascimento;
    private javax.swing.JTextField jTENDERECO;
    private javax.swing.JTextField jTESTADO;
    private javax.swing.JTextField jTID;
    private javax.swing.JTextField jTNOME;
    private javax.swing.JTextField jTNacionalidade;
    private javax.swing.JTextField jTNaturalidade;
    private javax.swing.JTextField jTSTATUS;
    private javax.swing.JTable jTableMotorista;
    // End of variables declaration//GEN-END:variables
}

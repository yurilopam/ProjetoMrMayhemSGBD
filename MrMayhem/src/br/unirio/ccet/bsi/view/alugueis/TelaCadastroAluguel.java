/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.ccet.bsi.view.alugueis;

import br.unirio.ccet.bsi.controller.Estoque;
import br.unirio.ccet.bsi.controller.Login;
import br.unirio.ccet.bsi.persistence.dao.AluguelDAO;
import br.unirio.ccet.bsi.persistence.dao.ClienteDAO;
import br.unirio.ccet.bsi.persistence.dao.EntregaDAO;
import br.unirio.ccet.bsi.persistence.dao.ProdutoDAO;
import br.unirio.ccet.bsi.persistence.dao.impl.AluguelDAOImpl;
import br.unirio.ccet.bsi.persistence.dao.impl.ClienteDAOImpl;
import br.unirio.ccet.bsi.persistence.dao.impl.EntregaDAOImpl;
import br.unirio.ccet.bsi.persistence.dao.impl.ProdutoDAOImpl;
import br.unirio.ccet.bsi.persistence.entity.Aluguel;
import br.unirio.ccet.bsi.persistence.entity.Cliente;
import br.unirio.ccet.bsi.persistence.entity.Entrega;
import br.unirio.ccet.bsi.persistence.entity.Produto;
import br.unirio.ccet.bsi.utils.Enums;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yuri Lopam
 */
public class TelaCadastroAluguel extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastroFuncionario
     */
    public TelaCadastroAluguel() {
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

        botoesFormaDePagamento = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        campoNumeroPedido = new javax.swing.JFormattedTextField();
        campoCpfComprador = new javax.swing.JFormattedTextField();
        campoDataPedido = new javax.swing.JFormattedTextField();
        campoDataEntrega = new javax.swing.JFormattedTextField();
        campoDataDevolucao = new javax.swing.JFormattedTextField();
        campoCodigoProduto = new javax.swing.JFormattedTextField();
        campoQuantidadeProduto = new javax.swing.JFormattedTextField();
        campoTipoEntrega = new javax.swing.JComboBox<>();
        botaoEfetuarAluguel = new java.awt.Button();
        botaoAdicionarALista = new java.awt.Button();
        radioCartaoCredito = new javax.swing.JRadioButton();
        radioDinheiro = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        campoPrecoTotal = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoObservacoes = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(2, 86, 112));
        setClosable(true);
        setPreferredSize(new java.awt.Dimension(800, 580));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        try {
            campoNumeroPedido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoCpfComprador.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        campoCpfComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCpfCompradorActionPerformed(evt);
            }
        });

        try {
            campoDataPedido.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoDataEntrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoDataDevolucao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            campoCodigoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        campoQuantidadeProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        campoTipoEntrega.setModel(new DefaultComboBoxModel(Enums.MeiosDeEntrega.values()));
        campoTipoEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTipoEntregaActionPerformed(evt);
            }
        });

        botaoEfetuarAluguel.setLabel("Efetuar aluguel");
        botaoEfetuarAluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEfetuarAluguelActionPerformed(evt);
            }
        });

        botaoAdicionarALista.setLabel("Adicionar à lista");
        botaoAdicionarALista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarAListaActionPerformed(evt);
            }
        });

        botoesFormaDePagamento.add(radioCartaoCredito);
        radioCartaoCredito.setText("Cartão de crédito");
        radioCartaoCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCartaoCreditoActionPerformed(evt);
            }
        });

        botoesFormaDePagamento.add(radioDinheiro);
        radioDinheiro.setText("Dinheiro");
        radioDinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDinheiroActionPerformed(evt);
            }
        });

        campoPrecoTotal.setEditable(false);
        campoPrecoTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        campoPrecoTotal.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        campoPrecoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecoTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoPrecoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoPrecoTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Quantidade", "Valor unitário", "Valor de aluguel"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        campoObservacoes.setColumns(20);
        campoObservacoes.setRows(5);
        jScrollPane2.setViewportView(campoObservacoes);

        jLabel1.setText("Cadastrar Aluguel");

        jLabel2.setText("Código do Pedido:");

        jLabel3.setText("Preço Total: R$");

        jLabel4.setText("CPF Comprador:");

        jLabel5.setText("Código do produto:");

        jLabel6.setText("Data do Pedido:");

        jLabel7.setText("Data da Entrega:");

        jLabel8.setText("Quantidade do Produto:");

        jLabel10.setText("Observações:");

        jLabel11.setText("Forma de pagamento:");

        jLabel17.setText("Entrega:");

        jLabel9.setText("Data da Devolução:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campoNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campoCpfComprador, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTipoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campoDataDevolucao)))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoEfetuarAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(251, 251, 251)
                                .addComponent(jLabel11))
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(botaoAdicionarALista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(radioCartaoCredito)
                                .addGap(18, 18, 18)
                                .addComponent(radioDinheiro)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(campoDataPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(campoNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(campoDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(campoCpfComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(campoTipoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(campoDataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11)
                            .addComponent(campoCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(campoQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(botaoAdicionarALista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioCartaoCredito)
                        .addComponent(radioDinheiro)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoEfetuarAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEfetuarAluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEfetuarAluguelActionPerformed
        if (formularioCadastroValidado()) {
            
            Estoque estoque = new Estoque();
            estoque.controleDaQuantidadeDoProduto(jTable1);
            
            Aluguel novoAluguel = new Aluguel();
            ClienteDAO clienteDAO = new ClienteDAOImpl();
            Cliente cliente = clienteDAO.findByCpf(campoCpfComprador.getText());
            
            
            novoAluguel.setCodigoAluguel(campoNumeroPedido.getText());
            novoAluguel.setCliente(cliente);
            try {
                novoAluguel.setDataAluguel(converterStringToDate(campoDataPedido.getText()));
            } catch (ParseException ex) {
                Logger.getLogger(TelaCadastroAluguel.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                novoAluguel.setDataEntrega(converterStringToDate(campoDataEntrega.getText()));
            } catch (ParseException ex) {
                Logger.getLogger(TelaCadastroAluguel.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                novoAluguel.setDataDevolucao(converterStringToDate(campoDataDevolucao.getText()));
            } catch (ParseException ex) {
                Logger.getLogger(TelaCadastroAluguel.class.getName()).log(Level.SEVERE, null, ex);
            }
            novoAluguel.setFormaPagamento(formaDePagamentoEscolhida());
            novoAluguel.setObservacoes(campoObservacoes.getText());
            novoAluguel.setPrecoTotal(campoPrecoTotal.getText());
            novoAluguel.setVendedor(Login.getIdUsuario());
            
            configurarSituacaoAluguel(novoAluguel);
            
            AluguelDAO aluguelDAO = new AluguelDAOImpl();
            aluguelDAO.insert(novoAluguel);

            gerarEntregaDoAluguel(novoAluguel);
            JOptionPane.showMessageDialog(TelaCadastroAluguel.this, "Aluguel efetuado com sucesso!");
            resetarCampos();
        } else {
            JOptionPane.showMessageDialog(TelaCadastroAluguel.this, "Não foi possível completar a operação!");
        }
    }//GEN-LAST:event_botaoEfetuarAluguelActionPerformed

    private void gerarEntregaDoAluguel(Aluguel novoAluguel) {
        if (!campoTipoEntrega.getSelectedItem().toString().equals("EM_MAOS")) {
            ClienteDAO clienteDAO = new ClienteDAOImpl();
            Entrega novaEntrega = new Entrega();
            EntregaDAO entregaDAO = new EntregaDAOImpl();
            List<Cliente> clientes = clienteDAO.findAll();
            for (Cliente cliente : clientes) {
                if (cliente.getCpf().equals(novoAluguel.getCliente().getCpf())){
                    novaEntrega.setTipoTransacao("A");
                    novaEntrega.setCodigoPedido(novoAluguel.getCodigoAluguel()+novaEntrega.getTipoTransacao());
                    novaEntrega.setCliente(novoAluguel.getCliente());
                    novaEntrega.setDataEntrega(novoAluguel.getDataEntrega());
                    novaEntrega.setDataPedido(novoAluguel.getDataAluguel());
                    novaEntrega.setStatus((Enums.Status.PENDENTE).toString());
                    entregaDAO.insert(novaEntrega);
                }
            }
        }
    }

    private void campoTipoEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTipoEntregaActionPerformed
        if (campoTipoEntrega.getSelectedItem().toString().equals("EM_MAOS")) {
            campoDataEntrega.setEnabled(false);
            campoDataEntrega.setText(null);
            campoDataEntrega.setValue(null);
        } else {
            campoDataEntrega.setEnabled(true);
        }
    }//GEN-LAST:event_campoTipoEntregaActionPerformed

    private void campoCpfCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCpfCompradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCpfCompradorActionPerformed

    private void botaoAdicionarAListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarAListaActionPerformed
        if (campoCodigoProduto.getValue() != null && !campoCodigoProduto.getValue().toString().equals("") 
                && campoQuantidadeProduto.getValue() != null && !campoCodigoProduto.getValue().toString().equals("") ){
            DefaultTableModel dtmListaProdutos = (DefaultTableModel) jTable1.getModel();
            ProdutoDAO produtoDAO = new ProdutoDAOImpl();
            List<Produto> produtos = produtoDAO.findAll();
            for (Produto produto : produtos) {
                if (produto.getCodigo().equals(campoCodigoProduto.getText())){
                    Object[] dados = {produto.getCodigo(), produto.getNomeProduto(), campoQuantidadeProduto.getValue().toString(), 
                        produto.getValor(), valorDeAluguelFormatado(produto.getValor())};
                    dtmListaProdutos.addRow(dados);
                }
            }
            int totalDeLinhas = dtmListaProdutos.getRowCount();
            Double valorTotal = 0.0;
            for (int i = 0; i < totalDeLinhas; i++) {
                String valorDoProdutoEmString = dtmListaProdutos.getValueAt(i, 3).toString();
                String valorDoProdutoEmStringReplaced = valorDoProdutoEmString.replace(",", ".");
                String quantidadeDoProdutoEmString = dtmListaProdutos.getValueAt(i, 2).toString();
                valorTotal += Double.valueOf(valorDoProdutoEmStringReplaced) * Integer.valueOf(quantidadeDoProdutoEmString);
            }
            DecimalFormat df = new DecimalFormat("#0.00"); 
            campoPrecoTotal.setText(df.format(valorTotal/2));
        } else {
            JOptionPane.showMessageDialog(TelaCadastroAluguel.this, "Os campos Código e Quantidade do produto devem ser preenchidos.");
        }
    }//GEN-LAST:event_botaoAdicionarAListaActionPerformed

    private void radioCartaoCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCartaoCreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioCartaoCreditoActionPerformed

    private void radioDinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDinheiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioDinheiroActionPerformed

    private void campoPrecoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecoTotalActionPerformed
    }//GEN-LAST:event_campoPrecoTotalActionPerformed
   
    
    private void configurarSituacaoAluguel(Aluguel novoAluguel) {
        if (!campoDataEntrega.isEnabled()){
            novoAluguel.setSituacao((Enums.SituacoesDoAluguel.EM_DIA).toString());
        } else {
            novoAluguel.setSituacao((Enums.SituacoesDoAluguel.PENDENTE).toString());
        }
    }
    
    private String valorDeAluguelFormatado(String valor) {
        String valorReplaced = valor.replace(",", ".");
        double valorDouble = Double.valueOf(valorReplaced)/2;
        DecimalFormat df = new DecimalFormat("#0.00");
        return String.valueOf(df.format(valorDouble));
    }
    
    private boolean formularioCadastroValidado() {
        boolean formularioValidado = false;
        if(campoTipoEntrega.getSelectedItem().toString().equals("EM_MAOS")) {
            if (campoPrecoTotal.getText() != null && campoNumeroPedido.getValue() != null
                    && campoCpfComprador.getValue() != null && verificarClienteCadastrado()
                    && campoDataPedido.getValue() != null && verificarNumeroPedidoNaoConstaCadastro() && campoDataDevolucao.getValue() != null
                    && (radioCartaoCredito.isSelected() || radioDinheiro.isSelected())) {
                formularioValidado = true;
            }
        } else {
            if (campoPrecoTotal.getText() != null && campoNumeroPedido.getValue() != null
                    && campoCpfComprador.getValue() != null && verificarClienteCadastrado() 
                    && campoDataPedido.getValue() != null && campoDataEntrega.getValue() != null
                    && verificarNumeroPedidoNaoConstaCadastro() && campoDataDevolucao.getValue() != null
                    && (radioCartaoCredito.isSelected() || radioDinheiro.isSelected())) {
                formularioValidado = true;
            }
        }
        return formularioValidado;
    }

    private boolean verificarClienteCadastrado(){
        boolean validacao;
        int contadorCadastros = 0;
        ClienteDAO clienteDAO = new ClienteDAOImpl();
        List<Cliente> clientes = clienteDAO.findAll();
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(campoCpfComprador.getText()))
                contadorCadastros++;
        }
        if (contadorCadastros == 0) {
            JOptionPane.showMessageDialog(TelaCadastroAluguel.this, "Cliente não consta na base de dados.");
            validacao = false;
        } else {
            validacao = true;
        }
        return validacao;
    }
    
    private boolean verificarNumeroPedidoNaoConstaCadastro(){
        boolean validacao;
        int contadorCadastros = 0;
        AluguelDAO aluguelDAO = new AluguelDAOImpl();
        List<Aluguel> alugueis = aluguelDAO.findAll();
        for (Aluguel aluguel : alugueis) {
            if (aluguel.getCodigoAluguel().equals(campoNumeroPedido.getText())){
                contadorCadastros++;
            }
        }
        if (contadorCadastros == 0) {
            validacao = true;
        } else {
            JOptionPane.showMessageDialog(TelaCadastroAluguel.this, "Número do pedido já consta na base de dados!");
            validacao = false;
        }
        return validacao;
    }
    
    private String formaDePagamentoEscolhida() {
        if (radioCartaoCredito.isSelected()){
            return "Cartão de Crédito";
        } else {
            return "Dinheiro";
        }
    }
    
    private void resetarCampos() {
        campoNumeroPedido.setText(null);
        campoNumeroPedido.setValue(null);
        
        campoCpfComprador.setText(null);
        campoCpfComprador.setValue(null);
        
        campoDataPedido.setText(null);
        campoDataPedido.setValue(null);
        
        campoDataEntrega.setText(null);
        campoDataEntrega.setValue(null);
        
        campoDataDevolucao.setText(null);
        campoDataDevolucao.setValue(null);
        
        campoTipoEntrega.setSelectedIndex(0);
        
        campoCodigoProduto.setText(null);
        campoCodigoProduto.setValue(null);
        
        campoQuantidadeProduto.setText(null);
        campoQuantidadeProduto.setValue(null);
        
        botoesFormaDePagamento.clearSelection();
        
        campoObservacoes.setText(null);
        
        DefaultTableModel dtmListaProdutos = (DefaultTableModel) jTable1.getModel();
        dtmListaProdutos.setRowCount(0);
        
        campoPrecoTotal.setText(null);
        campoPrecoTotal.setValue(null);
               
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button botaoAdicionarALista;
    private java.awt.Button botaoEfetuarAluguel;
    private javax.swing.ButtonGroup botoesFormaDePagamento;
    private javax.swing.JFormattedTextField campoCodigoProduto;
    private javax.swing.JFormattedTextField campoCpfComprador;
    private javax.swing.JFormattedTextField campoDataDevolucao;
    private javax.swing.JFormattedTextField campoDataEntrega;
    private javax.swing.JFormattedTextField campoDataPedido;
    private javax.swing.JFormattedTextField campoNumeroPedido;
    private javax.swing.JTextArea campoObservacoes;
    private javax.swing.JFormattedTextField campoPrecoTotal;
    private javax.swing.JFormattedTextField campoQuantidadeProduto;
    private javax.swing.JComboBox<String> campoTipoEntrega;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton radioCartaoCredito;
    private javax.swing.JRadioButton radioDinheiro;
    // End of variables declaration//GEN-END:variables

    private Date converterStringToDate(String text) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date dt = sdf.parse(text);
        java.sql.Date sql = new java.sql.Date(dt.getTime());
        return sql; 
    }

}

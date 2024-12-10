package br.com.cesarschool.poo.titulos.telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.cesarschool.poo.titulos.entidades.Transacao;
import br.com.cesarschool.poo.titulos.mediators.MediatorOperacao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaOperacao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaOperacao frame = new TelaOperacao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaOperacao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 927, 714);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOperao = new JLabel("Operação");
		lblOperao.setForeground(Color.BLACK);
		lblOperao.setFont(new Font("Wide Latin", Font.PLAIN, 30));
		lblOperao.setBounds(326, 10, 260, 31);
		contentPane.add(lblOperao);
		
		JLabel lblNewLabel_1 = new JLabel("Realizar Operação:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(166, 49, 117, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAo = new JLabel("Ação(true) ou Título(false):");
		lblAo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAo.setBounds(99, 72, 209, 24);
		contentPane.add(lblAo);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(308, 77, 291, 19);
		contentPane.add(textField);
		
		JLabel lblId = new JLabel("Id Entidade Crédito:");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblId.setBounds(148, 98, 150, 24);
		contentPane.add(lblId);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(308, 103, 291, 19);
		contentPane.add(textField_1);
		
		JLabel lblIdEntidadeDbito = new JLabel("Id Entidade Débito:");
		lblIdEntidadeDbito.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIdEntidadeDbito.setBounds(158, 127, 150, 24);
		contentPane.add(lblIdEntidadeDbito);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(308, 132, 291, 19);
		contentPane.add(textField_2);
		
		JLabel lblIdAoOu = new JLabel("Id Ação ou Título:");
		lblIdAoOu.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIdAoOu.setBounds(166, 156, 150, 24);
		contentPane.add(lblIdAoOu);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(308, 161, 291, 19);
		contentPane.add(textField_3);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValor.setBounds(252, 185, 64, 24);
		contentPane.add(lblValor);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(308, 190, 291, 19);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("Realizar");
		btnNewButton.setBounds(397, 219, 111, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Gerar Extrato:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(166, 302, 117, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblId_1 = new JLabel("Id Entidade Crédito:");
		lblId_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblId_1.setBounds(148, 325, 150, 24);
		contentPane.add(lblId_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(308, 330, 291, 19);
		contentPane.add(textField_5);
		
		JButton btnGerar = new JButton("Gerar");
		btnGerar.setBounds(397, 359, 111, 31);
		contentPane.add(btnGerar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TelaMenu frame = new TelaMenu();
				frame.setVisible(true);
				dispose();
			}
		});
		btnSair.setForeground(Color.WHITE);
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSair.setBackground(new Color(128, 0, 0));
		btnSair.setBounds(387, 596, 138, 40);
		contentPane.add(btnSair);
		
		btnNewButton.addActionListener(e -> {
		    boolean ehAcao;
		    int idCredito;
		    int idDebito;
		    int idAcaoOuTitulo;
		    double valor;
		    
		    try {
		        ehAcao = Boolean.parseBoolean(textField.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Ação ou título inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    
		    try {
		        idCredito = Integer.parseInt(textField_1.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Identificador creditar inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    
		    try {
		        idDebito = Integer.parseInt(textField_2.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Identificador debitar inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    
		    try {
		        idAcaoOuTitulo = Integer.parseInt(textField_3.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Identificador ação ou título inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    
		    try {
		        valor = Double.parseDouble(textField_4.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Valor digitado inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    
		    MediatorOperacao mediatorOperacao = MediatorOperacao.getInstancia();
		    String resposta = mediatorOperacao.realizarOperacao(ehAcao, idCredito, idDebito, idAcaoOuTitulo, valor);
		    
		    if(resposta.equals("Transação adicionada com sucesso!")) {
		    	JOptionPane.showMessageDialog(this, resposta, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		    }else {
		    	JOptionPane.showMessageDialog(this, resposta, "Erro", JOptionPane.INFORMATION_MESSAGE);
		    }

		});
		
		btnGerar.addActionListener(e -> {
		    int identificador;
		    
		    try {
		        identificador = Integer.parseInt(textField_5.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Identificador inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    
		    MediatorOperacao mediatorOperacao = MediatorOperacao.getInstancia();
		    Transacao[] transacao = mediatorOperacao.gerarExtrato(identificador);
		    
		    StringBuilder mostrarTransacoes = new StringBuilder();		    
		    if (transacao != null && transacao.length > 0) {
		        for (int i = 0; i < transacao.length; i++) {
		            if (i % 2 == 0) {
		            	if(transacao[i].getAcao() == null) {
		            		mostrarTransacoes.append(transacao[i].getEntidadeCredito().getIdentificador())
		            		.append(";")
                            .append(transacao[i].getEntidadeCredito().getNome())
                            .append(";")
                            .append(transacao[i].getEntidadeCredito().isAutorizacaoAcao())
                            .append(";")
                            .append(transacao[i].getEntidadeCredito().getSaldoAcao())
                            .append(";")
                            .append(transacao[i].getEntidadeCredito().getSaldoTituloDivida())
                            .append(";")
                            .append(transacao[i].getEntidadeDebito().getIdentificador())
                            .append(";")
                            .append(transacao[i].getEntidadeDebito().getNome())
                            .append(";")
                            .append(transacao[i].getEntidadeDebito().isAutorizacaoAcao())
                            .append(";")
                            .append(transacao[i].getEntidadeDebito().getSaldoAcao())
                            .append(";")
                            .append(transacao[i].getEntidadeDebito().getSaldoTituloDivida())
                            .append(";")
                            .append("null;")
                            .append(transacao[i].getTituloDivida().getIdentificador())
                            .append(";")
                            .append(transacao[i].getTituloDivida().getNome())
                            .append(";")
                            .append(transacao[i].getTituloDivida().getDataValidade())
                            .append(";")
                            .append(transacao[i].getTituloDivida().getTaxaJuros())
                            .append(";")
                            .append(transacao[i].getValorOperacao())
                            .append(";")
                            .append(transacao[i].getDataHoraOperacao())
                            .append("\n");
		            	}else {
		            		mostrarTransacoes.append(transacao[i].getEntidadeCredito().getIdentificador())
		            		.append(";")
                            .append(transacao[i].getEntidadeCredito().getNome())
                            .append(";")
                            .append(transacao[i].getEntidadeCredito().isAutorizacaoAcao())
                            .append(";")
                            .append(transacao[i].getEntidadeCredito().getSaldoAcao())
                            .append(";")
                            .append(transacao[i].getEntidadeCredito().getSaldoTituloDivida())
                            .append(";")
                            .append(transacao[i].getEntidadeDebito().getIdentificador())
                            .append(";")
                            .append(transacao[i].getEntidadeDebito().getNome())
                            .append(";")
                            .append(transacao[i].getEntidadeDebito().isAutorizacaoAcao())
                            .append(";")
                            .append(transacao[i].getEntidadeDebito().getSaldoAcao())
                            .append(";")
                            .append(transacao[i].getEntidadeDebito().getSaldoTituloDivida())
                            .append(";")
                            .append(transacao[i].getAcao().getIdentificador())
                            .append(";")
                            .append(transacao[i].getAcao().getNome())
                            .append(";")
                            .append(transacao[i].getAcao().getDataValidade())
                            .append(";")
                            .append(transacao[i].getAcao().getValorUnitario())
                            .append(";")
                            .append("null;")
                            .append(transacao[i].getValorOperacao())
                            .append(";")
                            .append(transacao[i].getDataHoraOperacao())
                            .append("\n");
		            	}
		            }
		        }
		        
		        if (mostrarTransacoes.length() > 0) {
		            JOptionPane.showMessageDialog(this, mostrarTransacoes.toString(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		        } else {
		            JOptionPane.showMessageDialog(this, "Nenhuma transação para exibir!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
		        }
		    } else {
		        JOptionPane.showMessageDialog(this, "Transações não localizadas!", "Erro", JOptionPane.INFORMATION_MESSAGE);
		    }
		});
	}

}

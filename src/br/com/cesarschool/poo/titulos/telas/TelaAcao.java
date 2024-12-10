package br.com.cesarschool.poo.titulos.telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.cesarschool.poo.titulos.entidades.Acao;
import br.com.cesarschool.poo.titulos.mediators.MediatorAcao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.time.LocalDate;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class TelaAcao extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAcao frame = new TelaAcao();
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
	public TelaAcao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 927, 714);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAo = new JLabel("Ação");
		lblAo.setBounds(389, 10, 126, 31);
		lblAo.setForeground(Color.BLACK);
		lblAo.setFont(new Font("Wide Latin", Font.PLAIN, 30));
		contentPane.add(lblAo);
		
		JLabel lblNewLabel = new JLabel("Identificador:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(180, 76, 111, 24);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(301, 81, 291, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setBounds(228, 100, 63, 24);
		contentPane.add(lblNome);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(301, 105, 291, 19);
		contentPane.add(textField_1);
		
		JLabel lblDataDeValidade = new JLabel("Data de Validade:");
		lblDataDeValidade.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDataDeValidade.setBounds(158, 129, 133, 24);
		contentPane.add(lblDataDeValidade);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(301, 134, 291, 19);
		contentPane.add(textField_2);
		
		JLabel lblValorUnitrio = new JLabel("Valor Unitário:");
		lblValorUnitrio.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValorUnitrio.setBounds(180, 154, 111, 24);
		contentPane.add(lblValorUnitrio);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(301, 159, 291, 19);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("Incluir");
		btnNewButton.setBounds(389, 188, 111, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Incluir:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(155, 60, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Identificador:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(180, 241, 111, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNome_1 = new JLabel("Nome:");
		lblNome_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome_1.setBounds(228, 270, 63, 24);
		contentPane.add(lblNome_1);
		
		JLabel lblDataDeValidade_1 = new JLabel("Data de Validade:");
		lblDataDeValidade_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDataDeValidade_1.setBounds(158, 297, 133, 24);
		contentPane.add(lblDataDeValidade_1);
		
		JLabel lblValorUnitrio_1 = new JLabel("Valor Unitário:");
		lblValorUnitrio_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblValorUnitrio_1.setBounds(180, 326, 111, 24);
		contentPane.add(lblValorUnitrio_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(301, 246, 291, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(301, 275, 291, 19);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(301, 302, 291, 19);
		contentPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(301, 331, 291, 19);
		contentPane.add(textField_7);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(389, 360, 111, 31);
		contentPane.add(btnAlterar);
		
		JLabel lblNewLabel_1_1 = new JLabel("Alterar:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(155, 227, 55, 13);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Identificador:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1.setBounds(180, 430, 111, 24);
		contentPane.add(lblNewLabel_2_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(301, 435, 291, 19);
		contentPane.add(textField_8);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Buscar:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(155, 416, 71, 13);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(389, 464, 111, 31);
		contentPane.add(btnBuscar);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Identificador:");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2_1_1.setBounds(180, 539, 111, 24);
		contentPane.add(lblNewLabel_2_1_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(301, 544, 291, 19);
		contentPane.add(textField_9);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExcluir.setBounds(389, 573, 111, 31);
		contentPane.add(btnExcluir);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Excluir:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(155, 529, 71, 13);
		contentPane.add(lblNewLabel_1_1_1_1);
		
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
		btnSair.setBounds(712, 606, 138, 40);
		contentPane.add(btnSair);
		
		btnNewButton.addActionListener(e -> {
		    int identificador;
		    String nome = textField_1.getText();
		    LocalDate dataValidade;
		    double valorUnitario;

		    try {
		        valorUnitario = Double.parseDouble(textField_3.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Valor unitário inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    
		    try {
		        identificador = Integer.parseInt(textField.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Identificador inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    
		    try {
		        dataValidade = LocalDate.parse(textField_2.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Data de validade inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }

		    Acao novaAcao = new Acao(identificador, nome, dataValidade, valorUnitario);
		    MediatorAcao mediatorAcao = MediatorAcao.getInstanciaSingleton();
		    
		    String resposta = mediatorAcao.incluir(novaAcao);
		    
		    if(resposta == null) {
		    	JOptionPane.showMessageDialog(this, "Ação incluída com sucesso!\n", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		    }else {
		    	JOptionPane.showMessageDialog(this, resposta, "Erro", JOptionPane.INFORMATION_MESSAGE);
		    }
		});
		
		btnAlterar.addActionListener(e -> {
		    int identificador;
		    String nome = textField_5.getText();
		    LocalDate dataValidade;
		    double valorUnitario;

		    try {
		        valorUnitario = Double.parseDouble(textField_7.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Valor unitário inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    
		    try {
		        identificador = Integer.parseInt(textField_4.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Identificador inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    
		    try {
		        dataValidade = LocalDate.parse(textField_6.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Data de validade inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }

		    Acao novaAcao = new Acao(identificador, nome, dataValidade, valorUnitario);
		    MediatorAcao mediatorAcao = MediatorAcao.getInstanciaSingleton();
		    
		    String resposta = mediatorAcao.alterar(novaAcao);
		    
		    if(resposta == null) {
		    	JOptionPane.showMessageDialog(this, "Ação alterada com sucesso!\n", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		    }else {
		    	JOptionPane.showMessageDialog(this, resposta, "Erro", JOptionPane.INFORMATION_MESSAGE);
		    }

		});
		
		btnBuscar.addActionListener(e -> {
		    int identificador;
		    
		    try {
		        identificador = Integer.parseInt(textField_8.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Identificador inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    MediatorAcao mediatorAcao = MediatorAcao.getInstanciaSingleton();
		    
		    Acao acaoBusca = mediatorAcao.buscar(identificador);
		    
		    if(acaoBusca != null) {
		    	JOptionPane.showMessageDialog(this, "Busca efetuada com sucesso!\n", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		    	JOptionPane.showMessageDialog(this, acaoBusca.getIdentificador() + ";" + acaoBusca.getNome() + ";" + acaoBusca.getDataValidade() + ";" + acaoBusca.getValorUnitario(), "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		    }else {
		    	JOptionPane.showMessageDialog(this, "Erro ao tentar buscar ação!\n", "Erro", JOptionPane.INFORMATION_MESSAGE);
		    }

		});
		
		btnExcluir.addActionListener(e -> {
		    int identificador;
		    
		    try {
		        identificador = Integer.parseInt(textField_9.getText());
		    } catch (NumberFormatException ex) {
		        JOptionPane.showMessageDialog(this, "Identificador inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    MediatorAcao mediatorAcao = MediatorAcao.getInstanciaSingleton();
		    
		    String acaoExcluida = mediatorAcao.excluir(identificador);
		    
		    if(acaoExcluida == null) {
		    	JOptionPane.showMessageDialog(this, "Exclusão efetuada com sucesso!\n", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		    }else {
		    	JOptionPane.showMessageDialog(this, acaoExcluida, "Erro", JOptionPane.INFORMATION_MESSAGE);
		    }

		});
	}
}

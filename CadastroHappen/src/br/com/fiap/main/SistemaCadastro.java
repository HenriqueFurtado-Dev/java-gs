package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Contato;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.EnderecoHospital;
import br.com.fiap.beans.Hospital;
import br.com.fiap.beans.Medicacao;
import br.com.fiap.beans.Paciente;
import br.com.fiap.beans.Profissional;
import br.com.fiap.beans.ProntuarioMedico;
import br.com.fiap.beans.Responsavel;

public class SistemaCadastro {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(int j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double Double (Double j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}	
	
	public static void main(String[] args) {
		Paciente objPaciente = new Paciente();
		Responsavel objResponsavel = new Responsavel();
		Contato objContato = new Contato();
		Endereco objEndereco = new Endereco();
		Medicacao objMedicacao = new Medicacao();
		
		Hospital objHospital = new Hospital();
		EnderecoHospital objEnderecoHospital = new EnderecoHospital();
		Profissional objProfissional = new Profissional();
		ProntuarioMedico objProntuario = new ProntuarioMedico();
	}

}

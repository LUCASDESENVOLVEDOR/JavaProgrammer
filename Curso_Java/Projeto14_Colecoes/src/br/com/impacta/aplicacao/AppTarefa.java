package br.com.impacta.aplicacao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import br.com.impacta.classes.Tarefa;

public class AppTarefa {
	public static void main(String[] args) {
		
		try {
			//Data e Hora Atuais
			Date data = new  Date();
			//System.out.println(data);
			
			//Obtendo uma data do usuario.
			String sdata = JOptionPane.showInputDialog("Informe uma data (dd/mm/aaaa)");
			
			
			//Convertendo o texto para um objeto Date.
			DateFormat dt = new  SimpleDateFormat("dd/MM/yyyy");
			Date dataUser = dt.parse(sdata);
			
			//System.out.println(dataUser);
			
			//Apresentando as datas no formato brasileiro
			//System.out.println(dt.format(data));
			//System.out.println(dt.format(dataUser));	
			
					
			Tarefa t1= new Tarefa(new Date(),"Gerar Relatório", 10);
			Tarefa t2= new Tarefa(dataUser,"Imprimir recibo NF", 5);
			
			System.out.println(t1);
			System.out.println(t2);
			
			
			
			
		}  catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}

}

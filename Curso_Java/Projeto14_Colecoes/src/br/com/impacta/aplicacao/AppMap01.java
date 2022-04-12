package br.com.impacta.aplicacao;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class AppMap01 {
	public static void main(String[] args) {
		
		Map<Integer,String> nomes = new HashMap<>();
		nomes.put(123, "Lucas");
		nomes.put(784, "Igor");
		nomes.put(487, "Paula");
		nomes.put(889, "Ana");
		
		
		for (Map.Entry<Integer,String>  item:  nomes.entrySet()) {
			//System.out.println(item);
			System.out.println(item.getKey() + " - " +   item.getValue());			
		}
		
		
		int chave = Integer.parseInt(JOptionPane.showInputDialog("Informe a chave: "));
		
		if(nomes.containsKey(chave)) {
			
			JOptionPane.showMessageDialog(null, "Valor encontrado: " + nomes.get(chave));
			
		}else
		{
			JOptionPane.showMessageDialog(null, "Nenhum valor encontrado.");
		}
		
		
	}

}

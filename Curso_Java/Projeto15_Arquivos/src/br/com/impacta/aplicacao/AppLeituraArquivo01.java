package br.com.impacta.aplicacao;

import java.io.FileReader;

import javax.swing.JOptionPane;

public class AppLeituraArquivo01 {
	public static void main(String[] args) {
		
		try {
			
			//Classe FileReader
			FileReader  reader = 
    new FileReader("C:\\Users\\virtual\\Documents\\Curso_Java\\Arquivos\\nomes.txt"); 
			
			//leitura do arquivo um caractere por vez.			
			String arquivo = "";
			
			while(true) {
				
				int caractere = reader.read(); 
				System.out.println(caractere);
				
				//EOF = END OF FILE.
				if(caractere == -1)
					break;
				
				
				char ch = (char)caractere;
				arquivo += ch;				
			}
			
			
			System.out.println(arquivo);
			reader.close();	
				
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		
		
		
	}
}

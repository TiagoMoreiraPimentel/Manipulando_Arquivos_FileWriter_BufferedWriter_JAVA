package App;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {

		// cria um vetor de String com os valores setados.
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		// Armazena o caminho especificado na variavel path.
		String path = "C:\\Users\\nitro\\Desktop\\arquivo.txt";
		
		// Instancia o BufferedWriter com a variavel path que cria/recria o arquivo com os dados.
		// lembrando que para atualizar e acrescentar dados a um arquivo existente basta usar o (path, true)
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			// percorre o vetor lines, e escreve as linhas no arquivo txt criado.
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} 
		// trata a exceção se houver.
		catch (IOException e) {
			e.printStackTrace();
		}

	}
}

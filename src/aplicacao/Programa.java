package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Juridica;
import entidades.Pagamento;
import entidades.PessoaFisica;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List< Pagamento>lista = new ArrayList<Pagamento>();
		
		System.out.print("Entre com o número de contribuintes: ");
		int n = sc.nextInt();
		for (int i= 1; i <=n; i++) {
			System.out.println("Dados do Pagamento número: " + i);
			System.out.print("Pessoa fisica ou juridica(f/j)? ");
			char tipo = sc.next().charAt(0);
			System.out.print("Nome");
			String nome = sc.next();
			System.out.print("Renda Anual:");
			Double rendaAnual = sc.nextDouble();
			if(tipo == 'f') {
				System.out.print("Despesa com Saúde: ");
				Double despesaSaude = sc.nextDouble();
				PessoaFisica x = new PessoaFisica(nome, rendaAnual, despesaSaude);
				lista.add(x);
			}
			else {
				System.out.print("Número de Empregados: ");
				Integer numeroEmpregado = sc.nextInt();
				lista.add(new Juridica(nome, rendaAnual, numeroEmpregado));
			}
		}
		System.out.println();
		System.out.println("TAXA PAGAMENTOS:");		
		for( Pagamento pag : lista) {
			
			System.out.println(pag.getNome()+ ": $ " + pag.taxa());
			
		}
		System.out.println();
		double soma= 0.0;
		for( Pagamento pag : lista) {
			soma= soma + pag.taxa();
		}
		System.out.println("TOTAL DE TAXAS: " + String.format("%.2f", soma));
		sc.close();

	}

}

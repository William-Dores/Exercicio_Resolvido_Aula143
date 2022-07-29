package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutosUsado;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Produto> listProduto = new ArrayList<>();
		
		System.out.print("Entre a quantidade de produtos: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char tipo = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			if (tipo == 'i') {
				System.out.print("Taxa alfandegaria: ");
				double taxaAlfandega = sc.nextDouble();
				listProduto.add(new ProdutoImportado(nome, preco, taxaAlfandega));
			}
			if (tipo == 'u') {
				System.out.print("Data de fabricação (DD/MM/YYYY)");
				Date dataFabricacao = sdf.parse(sc.next());
				listProduto.add(new ProdutosUsado(nome, preco, dataFabricacao));
			}
			else {
				listProduto.add(new Produto(nome, preco));
			}
			
		}
		
		for (Produto prod : listProduto) {
			System.out.println(prod);
		}
		
		sc.close();
	}

}

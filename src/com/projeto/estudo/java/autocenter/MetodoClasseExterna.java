package com.projeto.estudo.java.autocenter;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class MetodoClasseExterna {
	
	public static String nomeMaiusculo(String nome) {

		String nome2 = nome.toUpperCase().charAt(0) + nome.toLowerCase().substring(1, nome.length());
		return nome2;
	}

	public static String maiusculo(String placa) {
		
		String placa2 = placa.toUpperCase();
		return placa2;
	}
	
	public static int calculaIdade(String dataNascimento) {

		SimpleDateFormat sdfData = new SimpleDateFormat("dd/MM/yyy");
		
		Date ano = new Date();
		
		try {
			ano = sdfData.parse(dataNascimento);
		} catch (ParseException e) {
			System.out.println("Formato de data inválido!");
			System.exit(1);
		} catch (Exception e) {
			System.out.println("OCORREU UM ERRO!");
			System.exit(1);
		}
		Date atual = new Date();

		SimpleDateFormat anoNascimento = new SimpleDateFormat("yyy");
		SimpleDateFormat mesNascimento = new SimpleDateFormat("MM");
		SimpleDateFormat diaNascimento = new SimpleDateFormat("dd");

		Integer anoInt = Integer.parseInt(anoNascimento.format(ano));
		Integer mesInt = Integer.parseInt(mesNascimento.format(ano));
		Integer diaInt = Integer.parseInt(diaNascimento.format(ano));
		Integer anoAtualInt = Integer.parseInt(anoNascimento.format(atual));
		Integer mesAtualInt = Integer.parseInt(mesNascimento.format(atual));
		Integer diaAtualInt = Integer.parseInt(diaNascimento.format(atual));

		int compararAno = anoAtualInt - anoInt;
		if (mesInt > mesAtualInt) {
			compararAno--;
		} else if (mesInt == mesAtualInt && diaInt > diaAtualInt) {
			compararAno--;
		}

		return compararAno;

	}

	public static void main(String[] args) throws IOException, ParseException {
		Scanner entrada = new Scanner(System.in);
		String inserirPeca;
		Integer numeroId = 1;
		String novaPeca;
		String escolha = "0";
		
		Pessoa cliente = new Pessoa();
		OrdemServico servico = new OrdemServico();
		
		cliente.setContatos(new ArrayList<>());
		cliente.setEndereco(new ArrayList<>());
		cliente.setCarro(new ArrayList<>());
		
		servico.setPecas(new ArrayList<>());
		
		
		Contato contato1 = new Contato();
//		Contato contato2 = new Contato();
		
		Endereco endereco = new Endereco();
//		Endereco endereco2 = new Endereco();
		
		CarroModelo carro = new CarroModelo();
	
//		criação de lista  direto no metodo main com a classe Pacas 		
		ArrayList<Pecas> listaPecasPrint = new ArrayList<>();
		
//		for para adicionar pecas 
//		for (int i=1; i<5; i++) {
	
		while (!escolha.equalsIgnoreCase("5")) {
			System.out.println("Digite: 1 cadastro de peça, 2 cadastro de cliente, 3 adicionar peça, 4 serviço, 5 sair");
			escolha = entrada.nextLine();			
			if ("1".equalsIgnoreCase(escolha)) {
				System.out.println("Nova Peça: S/N ");
				novaPeca = entrada.nextLine();
				while ("S".equalsIgnoreCase(novaPeca)){
					Pecas peca1 = new Pecas();
					
					System.out.println("digite nova peça: ");
					peca1.setPeca(entrada.nextLine());

					System.out.println("digite o valor: ");
					peca1.setValorUnitario(entrada.nextDouble());
					entrada.nextLine();
					
					peca1.setIdPeca(numeroId++);
					listaPecasPrint.add(peca1);
					
					System.out.println("Nova Peça: S/N ");
					novaPeca = entrada.nextLine();
				}			
			}else if ("2".equalsIgnoreCase(escolha)) {
				System.out.println("Nota: ");
			}else if ("3".equalsIgnoreCase(escolha)) {
				System.out.println("Serviço:");
			}else if ("4".equalsIgnoreCase(escolha)) {
				System.out.println("Sair:");
			}else {
				System.out.println("Opção inválida");
			}

		}
		System.out.println("Obrigado");
	
		
		System.out.println("Nova Peça: S/N ");
		novaPeca = entrada.nextLine();
		while ("S".equalsIgnoreCase(novaPeca)){
			Pecas peca1 = new Pecas();
			
			System.out.println("digite nova peça: ");
			peca1.setPeca(entrada.nextLine());

			System.out.println("digite o valor: ");
			peca1.setValorUnitario(entrada.nextDouble());
			entrada.nextLine();
			
			peca1.setIdPeca(numeroId++);
			listaPecasPrint.add(peca1);
			
			System.out.println("Nova Peça: S/N ");
			novaPeca = entrada.nextLine();
		}
	
		for(Pecas ss: listaPecasPrint) {
			
			System.out.println(ss.getIdPeca() + " " + ss.getPeca() + " " + ss.getValorUnitario());
		}
				
		System.out.println("Nome: ");
		cliente.setNome(entrada.nextLine());

		System.out.println("Sobrenome: ");
		cliente.setSobrenome(entrada.nextLine());

		System.out.println("Data de nascimento: ");
		cliente.setDataNascimento(entrada.nextLine());
		
		System.out.println("CPF: ");
		cliente.setCpf(entrada.nextLine());
		
		System.out.println("celular: ");
		contato1.setCelular(entrada.nextLine());

//		System.out.println("celular: ");  //manter comentado
//		contato2.setCelular(entrada.nextLine());  //manter comentado

		System.out.println("celular2: ");
		contato1.setCelular2(entrada.nextLine());
		
		System.out.println("E-mail: ");
		contato1.setEmail(entrada.nextLine());

		System.out.println("Contato: ");
		contato1.setContato(entrada.nextLine());

		System.out.println("Tipo de Endereço: ");
		endereco.setTipoEndereco(entrada.nextLine());
		
		System.out.println("Logradouro: ");
		endereco.setLogradouro(entrada.nextLine());

		System.out.println("Número: ");
		endereco.setNumero(entrada.nextLine());
		
		System.out.println("Complemento: ");
		endereco.setComplemento(entrada.nextLine());
	
		System.out.println("CEP: ");
		endereco.setCep(entrada.nextLine());
		
		System.out.println("Tipo de Veículo: ");
		carro.setTipo(entrada.nextLine());
		
		System.out.println("Marca: ");
		carro.setMarca(entrada.nextLine());
		
		System.out.println("Modelo: ");
		carro.setModelo(entrada.nextLine());

		System.out.println("Ano: ");
		carro.setAno(entrada.nextLine());

		System.out.println("Placa: ");
		carro.setPlaca(entrada.nextLine());
		
		System.out.println("Tipo de Serviço: ");
		servico.setTipo(entrada.nextLine());
		
		System.out.println("Foi utilizado Peça?:(S/N) ");
		inserirPeca = entrada.nextLine();

		while ("S".equalsIgnoreCase(inserirPeca)) {   // sempre que comparar um valor fixo em uma vareável colocar o valor fixo a esquerda 
			Pecas peca = new Pecas();  // Instânciar o objeto, utilizando a classe Pecas para receber as informações de peca 
			
			System.out.println("Peça Utilizada: ");
			peca.setPeca(entrada.nextLine());
			
			System.out.println("Qantidade: ");
			peca.setQuantidade(entrada.nextInt());
			entrada.nextLine();
			
			System.out.println("valor Unitário: ");
			peca.setValorUnitario(entrada.nextDouble());
			
//			System.out.println("Valor Peças");
//			peca.setValor(entrada.nextDouble());
			entrada.nextLine();
		
			servico.setValorTotal(servico.getValorTotal() + peca.getValor()); // calculo do atributo do objeto peca e atributo do objeto servico 
			
			servico.getPecas().add(peca); // populando a lista Pecas na classe servico(OrdemServico) 
						
			System.out.println("Deseja mais Peças?:(S/N) ");
			inserirPeca = entrada.nextLine();
		}		
		System.out.println("serviço executado: ");
		servico.setServico(entrada.nextLine());
		
		System.out.println("Valor de mão de obra: ");
		servico.setValorServico(entrada.nextDouble());
		
		servico.setValorTotal(servico.getValorTotal() + servico.getValorServico()); // calculo de peças, e valor de serviço 
		
//		System.out.println("Valor Total: ");
//		servico.setValorTotal(entrada.nextDouble());
		
		entrada.close();

		cliente.setIdade(calculaIdade(cliente.getDataNascimento()));

		cliente.getContatos().add(contato1);
//		cliente.getContatos().add(contato2);
	
		cliente.getEndereco().add(endereco);
//		cliente.getEndereco().add(endereco2);
		
		cliente.getCarro().add(carro);
		
		System.out.println(nomeMaiusculo(cliente.getNome()).concat(" ").concat(nomeMaiusculo(cliente.getSobrenome())));
		System.out.println("Data de Nascimento: ".concat(cliente.getDataNascimento()));
		System.out.println("Idade: " + cliente.getIdade());
		System.out.println("CPF: ".concat(cliente.getCpf()));
//		System.out.println("Celular: " + contato1.getCelular());
//		System.out.println("Celular2: " + contato1.getCelular2());
//		System.out.println("E-mail: " + contato1.getEmail());

		//	(Objeto  nomeFor : instancia.objeto()){}
		for (Contato c1 : cliente.getContatos()) {  // for para objetos 
			System.out.println("Celular: ".concat(c1.getCelular() == null?" ":c1.getCelular())); //if ternário/Operador ternário 
			System.out.println("Celular2: " + c1.getCelular2());
			System.out.println("E-mail: " + c1.getEmail());
			System.out.println("Contato: " + c1.getContato());
		}
		
		for (Endereco e1 : cliente.getEndereco()) { // for (Classe do objeto, var do for : classe e objeto de da instancia onde está indo o get
			System.out.println("Tipo de endereço: ".concat(e1.getTipoEndereco() == null?" ":e1.getTipoEndereco()));
			System.out.println("Logradouro: ".concat(e1.getLogradouro() == null?" ":e1.getLogradouro()));
			System.out.println("Número: ".concat(e1.getNumero() == null?" ":e1.getNumero()));
			System.out.println("Complemento: ".concat(e1.getComplemento() == null?" ":e1.getComplemento()));
			System.out.println("CEP: ".concat(e1.getCep() == null?" ":e1.getCep())); // Operador ternário (condição ? else:)
		}

		for (CarroModelo car1 : cliente.getCarro()) {
			System.out.println("Tipo de veículo: ".concat(nomeMaiusculo(car1.getTipo() == null?" ":car1.getTipo())));
			System.out.println("Marca: ".concat(nomeMaiusculo(car1.getMarca() == null?" ":car1.getMarca())));
			System.out.println("Modelo: ".concat(nomeMaiusculo(car1.getModelo() == null?" ":car1.getModelo())));
			System.out.println("Ano: ".concat(car1.getAno() == null?" ":car1.getAno()));
			System.out.println("Placa: ".concat(maiusculo(car1.getPlaca() == null?" ":car1.getPlaca())));
		}
		
		System.out.println("Tipo de Serviço: ".concat(servico.getTipo()));
		for (Pecas os1 : servico.getPecas()) {
			System.out.println("Peça Utilizada: ".concat(os1.getPeca()));
			System.out.println("Qantidade: " + (os1.getQuantidade()));
			System.out.println("valor Unitário: " + (os1.getValorUnitario()));
			System.out.println("Valor Peças: " + (os1.getValor()));
		}
		System.out.println("serviço executado: ".concat(servico.getServico()));
		System.out.println("Valor de mão de obra: " + (servico.getValorServico()));
		System.out.println("Valor Toal: " + servico.getValorTotal());
		
	}
}

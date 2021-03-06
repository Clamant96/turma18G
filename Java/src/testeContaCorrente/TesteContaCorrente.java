package testeContaCorrente;

import java.util.Scanner;

public class TesteContaCorrente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		String cpf= "";
		int numero = 0, contadorTalao=3;
		double valor;
		final double valorTalao = 1000.00;
		char opcao,opcao1;
		boolean ativa = true;
		
		//Conta conta = new Conta(numero,cpf);
		//Conta contaEspecial = new ContaEspecial(numero,cpf,ativa,limite);
		//Conta contaPoupanca = new ContaPoupanca();
		//Conta contaEmpresa = new ContaEmpresa();
		//Conta contaEstudantil = new ContaEstudantil();
		
		ContaCorrente contaCorrente= new ContaCorrente(numero,cpf,ativa,contadorTalao, valorTalao);
		
		//TELA 1
		System.out.println("-------------------------------------------");
		System.out.println("BANCO GEN-18 \nAQUI SEU DINHEIRO TEM VALOR!");
		System.out.println("-------------------------------------------");
		System.out.println("[1] - CONTA POUPAN�A");
		System.out.println("[2] - CONTA CORRENTE");
		System.out.println("[3] - CONTA ESPECIAL");
		System.out.println("[4] - CONTA EMPRESA");
		System.out.println("[5] - CONTA ESTUDANTIL");
		System.out.println("DIGITE O C�DIGO DA OP��O SELECIONADA: ");
		
		// SELE��O DO TIPO DE CONTA
		int tipoConta = leia.nextInt();
		
		switch (tipoConta) {
			case 2:
				
				//CASO SEJA CONTA CORRENTE
				/*for (int i = 0; i < 15; i++) {
					System.out.println();
						
				}*/
				
				do {
					System.out.println("BANCO GEN-18 \nAQUI SEU DINHEIRO TEM VALOR!");
					System.out.println("CONTA CORRENTE");
					
					System.out.print("Digite o numero da sua conta: ");
					numero = leia.nextInt();
					
					System.out.print("Insira o n�mero do CPF:");  										
			    	cpf = leia.next();
					
					System.out.println("Digite 1 - Conta Ativa  ou  2 - Conta Inativa:");  												
					opcao1 = leia.next().charAt(0);
					
					if (opcao1 == '1') {
						ativa = true;
						System.out.println("Conta ativada.");
						
					}else {
						ativa = false;
						System.out.println("Conta desativada.");
						
					}
						
					//TELA 2
					System.out.println("BANCO GEN-18 \nAQUI SEU DINHEIRO TEM VALOR!");
					System.out.println("CONTA CORRENTE");
					
					System.out.print("Saldo Atual: R$ " + contaCorrente.getSaldo());
					System.out.println();
					
					//CALCULO DO SALDO
					for (int i = 0; i < 10; i++) {	
						System.out.print("Digite o valor da opera��o: R$ ");
						valor = leia.nextDouble();
						
						System.out.print("D�bito ou cr�dito? [D/C]: ");
						opcao = leia.next().toUpperCase().charAt(0);
						
						if (opcao == 'D') {
							contaCorrente.debito(valor);
							
						}
						else if (opcao == 'C') {
							contaCorrente.credito(valor);
							
						}
						
						System.out.print("Voce deseja socilitar um talao? ");						
						System.out.println("[S] - Sim | [N] - Nao");
						opcao = leia.next().toUpperCase().charAt(0);
						
						if(opcao == 'S' && contaCorrente.getContadorTalao() > 0) {
							System.out.println("Talao de cheque solicitado!");
							contaCorrente.pediTalao();
							
						}else if(contaCorrente.getContadorTalao() == 0){
							contaCorrente.pediTalao();
							
						}else {
							System.out.println("Caso mude de ideia, volte aqui!");
							
						}
						
					}
					
					System.out.println(contaCorrente.getSaldo());
					
					//System.out.println("Valor movimentado R$: " ValorMovimentadoMetodo);
					System.out.println("Deseja continuar? [S/N]: ");
					opcao1 = leia.next().toUpperCase().charAt(0);
					
				} while (opcao1 == 'N');	
			
			break;
			
			default: 
				System.out.println("Op��o inv�lida!");
				
			break;
		
		} 
		
	leia.close();

	}

}

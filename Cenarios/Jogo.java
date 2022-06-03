package Cenarios;

import java.util.Scanner;
import java.util.Random;

public class Jogo {
	
		public static void main (String[] args) {
			
			ClearConsoleScreen.limparTela();
			
			Login.Autenticacao();
			
			Scanner sc = new Scanner (System.in);
			
			Random rand = new Random();
					
			System.out.println("\tPROJETO INTEGRADOR SENAC - AVENTURAS DE P.I.");
			System.out.println("----------------------------------------------------------------------------------------------");
			
			 try {
					
					Thread.sleep(2000);
					
				} catch (Exception e) {
					
				}
			
			System.out.println("\tSeja bem vindo aventureiro!");
			
			System.out.println("----------------------------------------------------------------------------------------------");
			
			try {
				
				Thread.sleep(2000);
				
			} catch (Exception e) {
				
			}
			
			System.out.println("Selecione uma das opções abaixo para continuar:");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("1. Instruções");
			System.out.println("2. Jogar");
			System.out.println("3. Créditos");
			System.out.println("4. Sair");
			
			int menu = 0;
			
			String opcao1 = " ";
			
			do {
				
				menu = sc.nextInt();
				
				switch (menu) {
				
				case 1:
					
					opcao1 = "\nInstruções";
					
					System.out.println("\t*INSTRUÇÕES*");
					System.out.println("----------------------------------------------------------------------------------------------");
					System.out.println("1. Aventuras de PI é um jogo-texto onde o jogador deverá derrotar os inimigos para conseguir aumentar o seu score (pontuação).");
					System.out.println("2. O jogador poderá escolher dentre três classes distintas; cada uma possui os seus pontos fortes e fracos.");
					System.out.println("3. As poções de vida regeneram os pontos de HP (pontos de vida) do jogador.");
					System.out.println("----------------------------------------------------------------------------------------------");
					System.out.println("Selecione uma das opções abaixo para continuar:");
					System.out.println("2. Jogar");
					System.out.println("3. Créditos");
					System.out.println("4. Sair");
					
					break;
				
				case 2:
					
					opcao1 = "\nJogar";
					
					System.out.println("\t*PRÓLOGO*");
					System.out.println("----------------------------------------------------------------------------------------------");
					
					try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
					
					System.out.println("A população de uma pequena cidade clama pela ajuda de alguém capaz de livrar a região de criaturas demoníacas.");
					System.out.println("----------------------------------------------------------------------------------------------");
					
                      try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
					
					System.out.println("As criaturas malignas estão vindo da antiga e abandonada masmorra.");
					System.out.println("----------------------------------------------------------------------------------------------");
					
                      try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
					
					System.out.println("Caberá ao aventureiro livrar a cidade desta terrível maldição!");
					System.out.println("----------------------------------------------------------------------------------------------");
					
                      try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
			        
					System.out.println("\t*ESCOLHA A CLASSE DO SEU PERSONAGEM*");
					System.out.println("----------------------------------------------------------------------------------------------");
					System.out.println("1. Espadachim: O espadachim possui muitos pontos de HP, porém seu dano de ataque é baixo. Poções de vida recuperam mais pontos de HP.");
					System.out.println("2. Ladino: O ladino consegue se esquivar de ataques e possui mais chances de encontrar poções de vida. Seu dano de ataque e seus pontos de vida são baixos.");
					System.out.println("3. Mago: O mago possui um dano de ataque alto, porém seus pontos de vida são baixos.");
							
			int escolhaClasse = 0;
			
			String opcaoClasse = " ";
			
			while(!(escolhaClasse==1 || escolhaClasse==2 || escolhaClasse==3)) {
				
			escolhaClasse = sc.nextInt();
				
			switch (escolhaClasse) {
			
				case 1:
					
					opcaoClasse = "\tEspadachim";
					
					System.out.println("----------------------------------------------------------------------------------------------");
					System.out.println("O aventureiro, com sua espada em punho, vasculha a entrada da masmorra até encontrar uma passagem que leva ao subsolo.\n----------------------------------------------------------------------------------------------");
                    
                      try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
						
                    System.out.println("Com bastante cautela, ele adentra o subsolo.\n----------------------------------------------------------------------------------------------");
					
                      try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
						
					System.out.println("Os infinitos degraus o levam até o desconhecido.\n----------------------------------------------------------------------------------------------");
					
                       try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
						
					System.out.println("Porém, ele percebe que algo o está seguindo.\n----------------------------------------------------------------------------------------------");
					
                      try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
						
					System.out.println("O aventureiro então acende sua tocha e se prepara para o combate!");
					
                       try {
						
						Thread.sleep(4000);
						
					} catch (Exception e) {
						
					}
                       
                   
                       try {
                    	   ClearConsoleScreen.limparTela();
                           Espadachim.ModoCombateEspadachim();
                       } catch (Exception e) {
                    	   
                    	   
                       }
                       
					break;

				case 2:
					
					opcaoClasse = "\tLadino";
					
					System.out.println("----------------------------------------------------------------------------------------------");
					System.out.println("O aventureiro, com suas adagas afiadas, vasculha a entrada do masmorra até encontrar uma passagem que leva ao subsolo.\n----------------------------------------------------------------------------------------------");
					
                      try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
                    
                    System.out.println("Com bastante cautela, ele adentra o subsolo.\n----------------------------------------------------------------------------------------------");
					
                      try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
						
					System.out.println("Os infinitos degraus o levam até o desconhecido.\n -------------------------------------------------");
						
                      try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
					
					System.out.println("Porém, ele percebe que algo o está seguindo.\n----------------------------------------------------------------------------------------------");
						
                      try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
					
					System.out.println("O aventureiro então acende sua tocha e se prepara para o combate!");
					
                      try {
						
						Thread.sleep(4000);
						
					} catch (Exception e) {
						
					}
                     
                      try {
                   	   	  ClearConsoleScreen.limparTela();
                          Ladino.ModoCombateLadino();
                      } catch (Exception e) {
                   	   
                      }
					
					break;
					
				case 3:
					
					opcaoClasse = "\tMago";
					
					System.out.println("----------------------------------------------------------------------------------------------");
					System.out.println("O aventureiro, com seu cajado em mãos, vasculha a entrada da masmorra até encontrar uma passagem que leva ao subsolo.\n----------------------------------------------------------------------------------------------");
					
                    try {
                    	Thread.sleep(3000);
                    	
                    } catch (Exception e ) {
                    	
                    }
                    
				    System.out.println("Com bastante cautela, ele adentra o subsolo.\n----------------------------------------------------------------------------------------------");
					
					 try {
	                    	Thread.sleep(3000);
	                    	
	                    } catch (Exception e ) {
	                    	
	                    }
					
					System.out.println("Os infinitos degraus o levam até o desconhecido.\n----------------------------------------------------------------------------------------------");
					
					 try {
	                    	Thread.sleep(3000);
	                    	
	                    } catch (Exception e ) {
	                    	
	                    }
					
					System.out.println("Porém, ele percebe que algo o está seguindo.\n----------------------------------------------------------------------------------------------");
					
					 try {
	                    	Thread.sleep(3000);
	                    	
	                    } catch (Exception e ) {
	                    	
	                    }
						
					System.out.println("O aventureiro então acende sua tocha e se prepara para o combate!");
					
                      try {
						
						Thread.sleep(4000);
						
					} catch (Exception e) {
						
					}
                      
                      try {
                   	   	  ClearConsoleScreen.limparTela();
                          Mago.ModoCombateMago();
                      } catch (Exception e) {
                   	   
                      }
					
					default:
						System.out.println("Insira uma opção válida!");
						
			} 
		}
			
				break;
				
				case 3:
					
					opcao1 = "\nCréditos";
					
					System.out.println("\t*CRÉDITOS*\n----------------------------------------------------------------------------------------------\nRafael Quadros de Carvalho\nLucas Damaceno\nVictor Rodrigues\nRodrigo Miguel\nNicollas Bruno");
					System.out.println("----------------------------------------------------------------------------------------------");
					System.out.println("Selecione uma das opções abaixo para continuar:");
					System.out.println("1. Instruções");
					System.out.println("2. Jogar");
					System.out.println("4. Sair");	
					
				break;
				
				case 4:
					
					opcao1 = "\nSair";
					
					System.out.println("----------------------------------------------------------------------------------------------\n\t*Até a próxima aventureiro!*\n----------------------------------------------------------------------------------------------");
					
				break;
				
				default:
					
					System.out.println("Insira uma opção válida!");
					
				} 
				
				} while (!(menu == 4));
				
			sc.close();
		
	}
}
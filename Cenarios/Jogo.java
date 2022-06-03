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
			
			System.out.println("Selecione uma das op��es abaixo para continuar:");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("1. Instru��es");
			System.out.println("2. Jogar");
			System.out.println("3. Cr�ditos");
			System.out.println("4. Sair");
			
			int menu = 0;
			
			String opcao1 = " ";
			
			do {
				
				menu = sc.nextInt();
				
				switch (menu) {
				
				case 1:
					
					opcao1 = "\nInstru��es";
					
					System.out.println("\t*INSTRU��ES*");
					System.out.println("----------------------------------------------------------------------------------------------");
					System.out.println("1. Aventuras de PI � um jogo-texto onde o jogador dever� derrotar os inimigos para conseguir aumentar o seu score (pontua��o).");
					System.out.println("2. O jogador poder� escolher dentre tr�s classes distintas; cada uma possui os seus pontos fortes e fracos.");
					System.out.println("3. As po��es de vida regeneram os pontos de HP (pontos de vida) do jogador.");
					System.out.println("----------------------------------------------------------------------------------------------");
					System.out.println("Selecione uma das op��es abaixo para continuar:");
					System.out.println("2. Jogar");
					System.out.println("3. Cr�ditos");
					System.out.println("4. Sair");
					
					break;
				
				case 2:
					
					opcao1 = "\nJogar";
					
					System.out.println("\t*PR�LOGO*");
					System.out.println("----------------------------------------------------------------------------------------------");
					
					try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
					
					System.out.println("A popula��o de uma pequena cidade clama pela ajuda de algu�m capaz de livrar a regi�o de criaturas demon�acas.");
					System.out.println("----------------------------------------------------------------------------------------------");
					
                      try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
					
					System.out.println("As criaturas malignas est�o vindo da antiga e abandonada masmorra.");
					System.out.println("----------------------------------------------------------------------------------------------");
					
                      try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
					
					System.out.println("Caber� ao aventureiro livrar a cidade desta terr�vel maldi��o!");
					System.out.println("----------------------------------------------------------------------------------------------");
					
                      try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
			        
					System.out.println("\t*ESCOLHA A CLASSE DO SEU PERSONAGEM*");
					System.out.println("----------------------------------------------------------------------------------------------");
					System.out.println("1. Espadachim: O espadachim possui muitos pontos de HP, por�m seu dano de ataque � baixo. Po��es de vida recuperam mais pontos de HP.");
					System.out.println("2. Ladino: O ladino consegue se esquivar de ataques e possui mais chances de encontrar po��es de vida. Seu dano de ataque e seus pontos de vida s�o baixos.");
					System.out.println("3. Mago: O mago possui um dano de ataque alto, por�m seus pontos de vida s�o baixos.");
							
			int escolhaClasse = 0;
			
			String opcaoClasse = " ";
			
			while(!(escolhaClasse==1 || escolhaClasse==2 || escolhaClasse==3)) {
				
			escolhaClasse = sc.nextInt();
				
			switch (escolhaClasse) {
			
				case 1:
					
					opcaoClasse = "\tEspadachim";
					
					System.out.println("----------------------------------------------------------------------------------------------");
					System.out.println("O aventureiro, com sua espada em punho, vasculha a entrada da masmorra at� encontrar uma passagem que leva ao subsolo.\n----------------------------------------------------------------------------------------------");
                    
                      try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
						
                    System.out.println("Com bastante cautela, ele adentra o subsolo.\n----------------------------------------------------------------------------------------------");
					
                      try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
						
					System.out.println("Os infinitos degraus o levam at� o desconhecido.\n----------------------------------------------------------------------------------------------");
					
                       try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
						
					System.out.println("Por�m, ele percebe que algo o est� seguindo.\n----------------------------------------------------------------------------------------------");
					
                      try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
						
					System.out.println("O aventureiro ent�o acende sua tocha e se prepara para o combate!");
					
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
					System.out.println("O aventureiro, com suas adagas afiadas, vasculha a entrada do masmorra at� encontrar uma passagem que leva ao subsolo.\n----------------------------------------------------------------------------------------------");
					
                      try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
                    
                    System.out.println("Com bastante cautela, ele adentra o subsolo.\n----------------------------------------------------------------------------------------------");
					
                      try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
						
					System.out.println("Os infinitos degraus o levam at� o desconhecido.\n -------------------------------------------------");
						
                      try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
					
					System.out.println("Por�m, ele percebe que algo o est� seguindo.\n----------------------------------------------------------------------------------------------");
						
                      try {
						
						Thread.sleep(3000);
						
					} catch (Exception e) {
						
					}
					
					System.out.println("O aventureiro ent�o acende sua tocha e se prepara para o combate!");
					
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
					System.out.println("O aventureiro, com seu cajado em m�os, vasculha a entrada da masmorra at� encontrar uma passagem que leva ao subsolo.\n----------------------------------------------------------------------------------------------");
					
                    try {
                    	Thread.sleep(3000);
                    	
                    } catch (Exception e ) {
                    	
                    }
                    
				    System.out.println("Com bastante cautela, ele adentra o subsolo.\n----------------------------------------------------------------------------------------------");
					
					 try {
	                    	Thread.sleep(3000);
	                    	
	                    } catch (Exception e ) {
	                    	
	                    }
					
					System.out.println("Os infinitos degraus o levam at� o desconhecido.\n----------------------------------------------------------------------------------------------");
					
					 try {
	                    	Thread.sleep(3000);
	                    	
	                    } catch (Exception e ) {
	                    	
	                    }
					
					System.out.println("Por�m, ele percebe que algo o est� seguindo.\n----------------------------------------------------------------------------------------------");
					
					 try {
	                    	Thread.sleep(3000);
	                    	
	                    } catch (Exception e ) {
	                    	
	                    }
						
					System.out.println("O aventureiro ent�o acende sua tocha e se prepara para o combate!");
					
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
						System.out.println("Insira uma op��o v�lida!");
						
			} 
		}
			
				break;
				
				case 3:
					
					opcao1 = "\nCr�ditos";
					
					System.out.println("\t*CR�DITOS*\n----------------------------------------------------------------------------------------------\nRafael Quadros de Carvalho\nLucas Damaceno\nVictor Rodrigues\nRodrigo Miguel\nNicollas Bruno");
					System.out.println("----------------------------------------------------------------------------------------------");
					System.out.println("Selecione uma das op��es abaixo para continuar:");
					System.out.println("1. Instru��es");
					System.out.println("2. Jogar");
					System.out.println("4. Sair");	
					
				break;
				
				case 4:
					
					opcao1 = "\nSair";
					
					System.out.println("----------------------------------------------------------------------------------------------\n\t*At� a pr�xima aventureiro!*\n----------------------------------------------------------------------------------------------");
					
				break;
				
				default:
					
					System.out.println("Insira uma op��o v�lida!");
					
				} 
				
				} while (!(menu == 4));
				
			sc.close();
		
	}
}
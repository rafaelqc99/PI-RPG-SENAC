package Cenarios;

import java.util.Scanner;
import java.util.Random;

public class Espadachim {

	public static void ModoCombateEspadachim() {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		String[] inimigos = { "Esqueleto", "Morto-vivo", "Minotauro", "Centauro", "Duende", "Goblin", "Orc" };

		int VidaMaxInimigo = 75;
		int DanoAtaqueInimigo = 25;
		int vidaJogador = 140;
		int DanoAtaqueJogador = 20;
		int pocoesVida = 3;
		int pocaoVidaReg = 30;
		int pocaoVidaChance = 50;
		int pontuacao = 0;
		boolean running = true;

		GAME:

			while (running) {

				System.out.println("--------------------------------------");

				int vidaInimigo = rand.nextInt(VidaMaxInimigo);

				String inimigo = inimigos[rand.nextInt(inimigos.length)];

				System.out.println("\t# Um " + inimigo + " apareceu! #\n");

				while (vidaInimigo > 0) {

					System.out.println("\tPontua��o: " + pontuacao + "\n\tPo��es de vida: " + pocoesVida + "\n\tSeu HP: "
							+ vidaJogador + "\n\tHP de " + inimigo + ": " + vidaInimigo
							+ "\n\tO que voc� gostaria de fazer?\n\t1. Atacar\n\t2. Beber po��o de vida\n\t3. Fugir");

					int input = sc.nextInt();

					if (input == 1) {

						int danoAtribuido = rand.nextInt(DanoAtaqueJogador);
						int danoRecebido = rand.nextInt(DanoAtaqueInimigo);

						vidaInimigo -= danoAtribuido;
						vidaJogador -= danoRecebido;

						System.out.println("\t> Voc� distribuiu um ataque de " + danoAtribuido + " de dano!");
						System.out.println("\t> Voc� recebeu um ataque de " + danoRecebido + " de dano!");

						if (vidaJogador < 1) {
							System.out.println("\t> Voc� est� muito fraco para continuar!");
							break;
						}
					} else if (input == 2) {

						if (pocoesVida > 0) {

							vidaJogador += pocaoVidaReg;
							pocoesVida--;

							System.out.println("\t> Voc� bebeu 1 po��o de vida." + "\n\t> Voc� agora tem " + vidaJogador
									+ " de HP." + "\n\t> Voc� tem " + pocoesVida + " po��es de vida.\n");
						} else {
							System.out.println("\t> Voc� n�o tem mais po��es de vida!");
						}

					} else if (input == 3) {
						System.out.println("\t> Voc� fugiu de " + inimigo + ". ");

						continue GAME;

					} else {
						System.out.println("\tInsira uma op��o v�lida.");
					}
				}

				if (vidaJogador < 1) {
					System.out.println(
							"--------------------------------------\nVoc� sai do calabou�o, enfraquecido pelo combate!");
					break;
				}

				System.out.println("--------------------------------------\n # " + inimigo + " foi derrotado! # ");

				pontuacao += 10;

				System.out.println(" # Pontua��o: " + pontuacao + " # ");
				System.out.println(" # Voc� agora tem " + vidaJogador + " de HP # ");

				if (rand.nextInt(100) < pocaoVidaChance) {

					pocoesVida++;

					System.out.println(" # O " + inimigo + " deixou cair uma po��o de vida! # \n # Voc� tem " + pocoesVida
							+ " po��es de vida! # ");
				}

				System.out.println(
						"--------------------------------------\nO que voc� gostaria de fazer agora?\n1. Continuar lutando\n2. Sair da masmorra");

				int input = sc.nextInt();

				while (!(input == 1) && !(input == 2)) {

					System.out.println("Insira uma op��o v�lida.");

					input = sc.nextInt();

				}

				if (input == 1) {

					System.out.println("Voc� continua a sua aventura.");

					if (pontuacao >= 50) {
						System.out.println("-------------------------------------------------" );
						System.out.println("O aventureiro, encontra um extenso corredor que o leva a profunda escurid�o.");

						try {
							Thread.sleep(6000);
						} catch (Exception ex) {
						}

						System.out.println("-------------------------------------------------");
						System.out.println("O aventureiro sente que uma presen�a fantasmag�rica o est� observando.");

						try {
							Thread.sleep(6000);
						} catch (Exception ex) {
						}

						System.out.println("-------------------------------------------------");
						System.out.println("Andando pelos corredores sombrios, cada vez mais estreitos, o aventureiro ent�o encontra um sal�o muito amplo, completamente escuro.");

						try {
							Thread.sleep(6000);
						} catch (Exception ex) {
						}

						System.out.println("-------------------------------------------------");
						System.out.println("O aventureiro ent�o v� uma luz oscilante que chama sua aten��o.");

						try {
							Thread.sleep(6000);
						} catch (Exception ex) {
						}

						System.out.println("-------------------------------------------------");
						System.out.println("Ao adentrar a escura sala, o aventureiro percebe a presen�a de uma criatura colossal, semelhante a uma serpente, ocupando totalmente o ambiente.");

						try {
							Thread.sleep(6000);
						} catch (Exception ex) {
						}

						System.out.println("-------------------------------------------------");
						System.out.println("O brilho de suas escamas, mesmo na completa escurid�o, � refletido atrav�s das paredes de pedra que constituem a masmorra.");

						try {
							Thread.sleep(6000);
						} catch (Exception ex) {
						}

						System.out.println("-------------------------------------------------");
						System.out.println("� poss�vel verificar tamb�m o brilho de muitas joias e pedras preciosas espalhadas pelo local.");

						try {
							Thread.sleep(6000);
						} catch (Exception ex) {
						}

						System.out.println("-------------------------------------------------");
						System.out.println("O aventureiro percebe que a cauda da criatura est� bloqueando um al�ap�o que o poderia levar a sua salva��o.");

						try {
							Thread.sleep(6000);
						} catch (Exception ex) {
						}

						System.out.println("-------------------------------------------------");
						System.out.println("A gigantesca criatura ent�o acorda de seu sono profundo e percebe a presen�a do aventureiro!");
						
						try {
							Thread.sleep(6000);
						} catch (Exception ex) {
						}

						int vidaDragao = 50;
						int DanoAtaqueDragao = 20;

						GAMEDRAGON:

							while (running) {

								System.out.println("--------------------------------------");

								while (vidaDragao > 0) {

									System.out.println("\tPontua��o: " + pontuacao + "\n\tPo��es de vida: " + pocoesVida
											+ "\n\tSeu HP: " + vidaJogador + "\n\tHP de Drag�o Negro " + ": " + vidaDragao
											+ "\n\tO que voc� gostaria de fazer?\n\t1. Atacar\n\t2. Beber po��o de vida\n\t3. Fugir");

									int inputD = sc.nextInt();

									if (inputD == 1) {

										int danoAtribuido = rand.nextInt(DanoAtaqueJogador);
										int danoRecebido = rand.nextInt(DanoAtaqueDragao);

										vidaDragao -= danoAtribuido;
										vidaJogador -= danoRecebido;

										System.out.println("\t> Voc� distribuiu um ataque de " + danoAtribuido + " de dano!");
										System.out.println("\t> Voc� recebeu um ataque de " + danoRecebido + " de dano!");

										if (vidaJogador < 1) {
											System.out.println("\t> Voc� est� muito fraco para continuar!");

											break;
										}

									} else if (inputD == 2) {

										if (pocoesVida > 0) {

											vidaJogador += pocaoVidaReg;
											pocoesVida--;

											System.out.println("\t> Voc� bebeu 1 po��o de vida." + "\n\t> Voc� agora tem "
													+ vidaJogador + " de HP." + "\n\t> Voc� tem " + pocoesVida
													+ " po��es de vida.\n");

										} else {
											System.out.println("\t> Voc� n�o tem mais po��es de vida!");
										}

									} else if (inputD == 3) {
										System.out.println("\t> Voc� fugiu do Drag�o Negro.");

										pontuacao -= 100;

										continue GAME;

									} else {
										System.out.println("\tInsira uma op��o v�lida");
									}
								}

								if (vidaJogador < 1) {

									System.out.println(
											"--------------------------------------\nVoc� sai do calabou�o, enfraquecido pelo combate!");

									break;

								}

								System.out.println("--------------------------------------\n # O Drag�o Negro foi derrotado! # ");

								pontuacao += 100;

								System.out.println("--------------------------------------"); 
								System.out.println("O vitorioso aventureiro admira todo aquele tesouro embaixo de seus p�s, por�m ele percebe que o calabou�o est� desmoronando.");


								try {
									Thread.sleep(6000);
								} catch (Exception ex) {
								}

								System.out.println("----------------------------------------------------------------------------------------------");
								System.out.println("Ap�s juntar o m�ximo de joias que conseguiu, o aventureiro corre desesperadamente para o al�ap�o.");

								try {
									Thread.sleep(6000);
								} catch (Exception ex) {
								}

								System.out.println("----------------------------------------------------------------------------------------------");
								System.out.println("Ap�s sair do calabou�o, o aventureiro � recebido com muita alegria pela popula��o da regi�o!");

								try {
									Thread.sleep(6000);
								} catch (Exception ex) {
								}

								System.out.println("----------------------------------------------------------------------------------------------");
								System.out.println("*FIM*");

								break;
							}

					} else {

						continue GAME;

					}

					break;

				} else if (input==2) {

					System.out.println("Voc� saiu da masmorra.");

					break;
				}

			}

		System.out.println("Pontua��o final: "+ pontuacao);		

		System.out.println("######################");
		System.out.println("#OBRIGADO POR JOGAR!#");
		System.out.println("######################");	

		System.out.println("Selecione uma das op��es abaixo para continuar:");
		System.out.println("1. Instru��es");
		System.out.println("2. Jogar");
		System.out.println("3. Cr�ditos");
		System.out.println("4. Sair");	


	}
}
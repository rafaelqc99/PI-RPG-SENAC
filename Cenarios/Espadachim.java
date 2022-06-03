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

					System.out.println("\tPontuação: " + pontuacao + "\n\tPoções de vida: " + pocoesVida + "\n\tSeu HP: "
							+ vidaJogador + "\n\tHP de " + inimigo + ": " + vidaInimigo
							+ "\n\tO que você gostaria de fazer?\n\t1. Atacar\n\t2. Beber poção de vida\n\t3. Fugir");

					int input = sc.nextInt();

					if (input == 1) {

						int danoAtribuido = rand.nextInt(DanoAtaqueJogador);
						int danoRecebido = rand.nextInt(DanoAtaqueInimigo);

						vidaInimigo -= danoAtribuido;
						vidaJogador -= danoRecebido;

						System.out.println("\t> Você distribuiu um ataque de " + danoAtribuido + " de dano!");
						System.out.println("\t> Você recebeu um ataque de " + danoRecebido + " de dano!");

						if (vidaJogador < 1) {
							System.out.println("\t> Você está muito fraco para continuar!");
							break;
						}
					} else if (input == 2) {

						if (pocoesVida > 0) {

							vidaJogador += pocaoVidaReg;
							pocoesVida--;

							System.out.println("\t> Você bebeu 1 poção de vida." + "\n\t> Você agora tem " + vidaJogador
									+ " de HP." + "\n\t> Você tem " + pocoesVida + " poções de vida.\n");
						} else {
							System.out.println("\t> Você não tem mais poções de vida!");
						}

					} else if (input == 3) {
						System.out.println("\t> Você fugiu de " + inimigo + ". ");

						continue GAME;

					} else {
						System.out.println("\tInsira uma opção válida.");
					}
				}

				if (vidaJogador < 1) {
					System.out.println(
							"--------------------------------------\nVocê sai do calabouço, enfraquecido pelo combate!");
					break;
				}

				System.out.println("--------------------------------------\n # " + inimigo + " foi derrotado! # ");

				pontuacao += 10;

				System.out.println(" # Pontuação: " + pontuacao + " # ");
				System.out.println(" # Você agora tem " + vidaJogador + " de HP # ");

				if (rand.nextInt(100) < pocaoVidaChance) {

					pocoesVida++;

					System.out.println(" # O " + inimigo + " deixou cair uma poção de vida! # \n # Você tem " + pocoesVida
							+ " poções de vida! # ");
				}

				System.out.println(
						"--------------------------------------\nO que você gostaria de fazer agora?\n1. Continuar lutando\n2. Sair da masmorra");

				int input = sc.nextInt();

				while (!(input == 1) && !(input == 2)) {

					System.out.println("Insira uma opção válida.");

					input = sc.nextInt();

				}

				if (input == 1) {

					System.out.println("Você continua a sua aventura.");

					if (pontuacao >= 50) {
						System.out.println("-------------------------------------------------" );
						System.out.println("O aventureiro, encontra um extenso corredor que o leva a profunda escuridão.");

						try {
							Thread.sleep(6000);
						} catch (Exception ex) {
						}

						System.out.println("-------------------------------------------------");
						System.out.println("O aventureiro sente que uma presença fantasmagórica o está observando.");

						try {
							Thread.sleep(6000);
						} catch (Exception ex) {
						}

						System.out.println("-------------------------------------------------");
						System.out.println("Andando pelos corredores sombrios, cada vez mais estreitos, o aventureiro então encontra um salão muito amplo, completamente escuro.");

						try {
							Thread.sleep(6000);
						} catch (Exception ex) {
						}

						System.out.println("-------------------------------------------------");
						System.out.println("O aventureiro então vê uma luz oscilante que chama sua atenção.");

						try {
							Thread.sleep(6000);
						} catch (Exception ex) {
						}

						System.out.println("-------------------------------------------------");
						System.out.println("Ao adentrar a escura sala, o aventureiro percebe a presença de uma criatura colossal, semelhante a uma serpente, ocupando totalmente o ambiente.");

						try {
							Thread.sleep(6000);
						} catch (Exception ex) {
						}

						System.out.println("-------------------------------------------------");
						System.out.println("O brilho de suas escamas, mesmo na completa escuridão, é refletido através das paredes de pedra que constituem a masmorra.");

						try {
							Thread.sleep(6000);
						} catch (Exception ex) {
						}

						System.out.println("-------------------------------------------------");
						System.out.println("É possível verificar também o brilho de muitas joias e pedras preciosas espalhadas pelo local.");

						try {
							Thread.sleep(6000);
						} catch (Exception ex) {
						}

						System.out.println("-------------------------------------------------");
						System.out.println("O aventureiro percebe que a cauda da criatura está bloqueando um alçapão que o poderia levar a sua salvação.");

						try {
							Thread.sleep(6000);
						} catch (Exception ex) {
						}

						System.out.println("-------------------------------------------------");
						System.out.println("A gigantesca criatura então acorda de seu sono profundo e percebe a presença do aventureiro!");
						
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

									System.out.println("\tPontuação: " + pontuacao + "\n\tPoções de vida: " + pocoesVida
											+ "\n\tSeu HP: " + vidaJogador + "\n\tHP de Dragão Negro " + ": " + vidaDragao
											+ "\n\tO que você gostaria de fazer?\n\t1. Atacar\n\t2. Beber poção de vida\n\t3. Fugir");

									int inputD = sc.nextInt();

									if (inputD == 1) {

										int danoAtribuido = rand.nextInt(DanoAtaqueJogador);
										int danoRecebido = rand.nextInt(DanoAtaqueDragao);

										vidaDragao -= danoAtribuido;
										vidaJogador -= danoRecebido;

										System.out.println("\t> Você distribuiu um ataque de " + danoAtribuido + " de dano!");
										System.out.println("\t> Você recebeu um ataque de " + danoRecebido + " de dano!");

										if (vidaJogador < 1) {
											System.out.println("\t> Você está muito fraco para continuar!");

											break;
										}

									} else if (inputD == 2) {

										if (pocoesVida > 0) {

											vidaJogador += pocaoVidaReg;
											pocoesVida--;

											System.out.println("\t> Você bebeu 1 poção de vida." + "\n\t> Você agora tem "
													+ vidaJogador + " de HP." + "\n\t> Você tem " + pocoesVida
													+ " poções de vida.\n");

										} else {
											System.out.println("\t> Você não tem mais poções de vida!");
										}

									} else if (inputD == 3) {
										System.out.println("\t> Você fugiu do Dragão Negro.");

										pontuacao -= 100;

										continue GAME;

									} else {
										System.out.println("\tInsira uma opção válida");
									}
								}

								if (vidaJogador < 1) {

									System.out.println(
											"--------------------------------------\nVocê sai do calabouço, enfraquecido pelo combate!");

									break;

								}

								System.out.println("--------------------------------------\n # O Dragão Negro foi derrotado! # ");

								pontuacao += 100;

								System.out.println("--------------------------------------"); 
								System.out.println("O vitorioso aventureiro admira todo aquele tesouro embaixo de seus pés, porém ele percebe que o calabouço está desmoronando.");


								try {
									Thread.sleep(6000);
								} catch (Exception ex) {
								}

								System.out.println("----------------------------------------------------------------------------------------------");
								System.out.println("Após juntar o máximo de joias que conseguiu, o aventureiro corre desesperadamente para o alçapão.");

								try {
									Thread.sleep(6000);
								} catch (Exception ex) {
								}

								System.out.println("----------------------------------------------------------------------------------------------");
								System.out.println("Após sair do calabouço, o aventureiro é recebido com muita alegria pela população da região!");

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

					System.out.println("Você saiu da masmorra.");

					break;
				}

			}

		System.out.println("Pontuação final: "+ pontuacao);		

		System.out.println("######################");
		System.out.println("#OBRIGADO POR JOGAR!#");
		System.out.println("######################");	

		System.out.println("Selecione uma das opções abaixo para continuar:");
		System.out.println("1. Instruções");
		System.out.println("2. Jogar");
		System.out.println("3. Créditos");
		System.out.println("4. Sair");	


	}
}
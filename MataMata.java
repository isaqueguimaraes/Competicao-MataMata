import java.util.Scanner;

public class Avaliativa {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    String[] times = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P" };

    System.out.println("---REGRAS DO JOGO---\nO número de Gols DEVE estar ENTRE 0 e 20;\nNÃO pode haver empates.\n");

    // Jogo 1 - A vs B
    System.out.print("Bem vindo à competição!\nJogo 1 - A vs B\nDigite quantos gols o time " + times[0] + " fez: ");
    int golsA = leitura.nextInt();

    System.out.print("Digite quantos gols o time " + times[1] + " fez: ");
    int golsB = leitura.nextInt();

    // Vencedor jogo 1
    String vencedorJogo1;

    if (golsA > golsB) {
      vencedorJogo1 = times[0];
    } else {
      vencedorJogo1 = times[1];
    }

    System.out.println("\nO vencedor do jogo 1 foi: " + vencedorJogo1);

    // Jogo 2 - C vs D
    // Jogo 2 - C vs D
    System.out.println("\nJogo 2 - C vs D");
    System.out.print("\nDigite quantos gols o time " + times[2] + " fez: ");
    int golsC = leitura.nextInt();

    System.out.print("Digite quantos gols o time " + times[3] + " fez: ");
    int golsD = leitura.nextInt();

    // Vencedor jogo 2
    String vencedorJogo2;

    if (golsC > golsD) {
      vencedorJogo2 = times[2];
    } else {
      vencedorJogo2 = times[3];
    }

    System.out.println("\nO vencedor do jogo 2 foi: " + vencedorJogo2);

    // Jogo 3 - E vs F
    System.out.println("\nJogo 3 - E vs F");
    System.out.print("\nDigite quantos gols o time " + times[4] + " fez: ");
    int golsE = leitura.nextInt();

    System.out.print("Digite quantos gols o time " + times[5] + " fez: ");
    int golsF = leitura.nextInt();

    // Vencedor jogo 3
    String vencedorJogo3;

    if (golsE > golsF) {
      vencedorJogo3 = times[4];
    } else {
      vencedorJogo3 = times[5];
    }

    System.out.println("\nO vencedor do jogo 3 foi: " + vencedorJogo3);

    // Jogo 4 - G vs H
    System.out.println("\nJogo 4 - G vs H");
    System.out.print("\nDigite quantos gols o time " + times[6] + " fez: ");
    int golsG = leitura.nextInt();

    System.out.print("Digite quantos gols o time " + times[7] + " fez: ");
    int golsH = leitura.nextInt();

    // Vencedor jogo 4
    String vencedorJogo4;

    if (golsG > golsH) {
      vencedorJogo4 = times[6];
    } else {
      vencedorJogo4 = times[7];
    }

    System.out.println("\nO vencedor do jogo 4 foi: " + vencedorJogo4);

    // Jogo 5 - I vs J
    System.out.println("\nJogo 5 - I vs J");
    System.out.print("\nDigite quantos gols o time " + times[8] + " fez: ");
    int golsI = leitura.nextInt();

    System.out.print("Digite quantos gols o time " + times[9] + " fez: ");
    int golsJ = leitura.nextInt();

    // Vencedor jogo 5
    String vencedorJogo5;

    if (golsI > golsJ) {
      vencedorJogo5 = times[8];
    } else {
      vencedorJogo5 = times[9];
    }

    System.out.println("\nO vencedor do jogo 5 foi: " + vencedorJogo5);

    // Jogo 6 - K vs L
    System.out.println("\nJogo 6 - K vs L");
    System.out.print("\nDigite quantos gols o time " + times[10] + " fez: ");
    int golsK = leitura.nextInt();

    System.out.print("Digite quantos gols o time " + times[11] + " fez: ");
    int golsL = leitura.nextInt();

    // Vencedor jogo 6
    String vencedorJogo6;

    if (golsK > golsL) {
      vencedorJogo6 = times[10];
    } else {
      vencedorJogo6 = times[11];
    }

    System.out.println("\nO vencedor do jogo 6 foi: " + vencedorJogo6);

    // Jogo 7 - M vs N
    System.out.println("\nJogo 7 - M vs N");
    System.out.print("\nDigite quantos gols o time " + times[12] + " fez: ");
    int golsM = leitura.nextInt();

    System.out.print("Digite quantos gols o time " + times[13] + " fez: ");
    int golsN = leitura.nextInt();

    // Vencedor jogo 7
    String vencedorJogo7;

    if (golsM > golsN) {
      vencedorJogo7 = times[12];
    } else {
      vencedorJogo7 = times[13];
    }

    System.out.println("\nO vencedor do jogo 7 foi: " + vencedorJogo7);

    // Jogo 8 - O vs P
    System.out.println("\nJogo 8 - O vs P");
    System.out.print("\nDigite quantos gols o time " + times[14] + " fez: ");
    int golsO = leitura.nextInt();

    System.out.print("Digite quantos gols o time " + times[15] + " fez: ");
    int golsP = leitura.nextInt();

    // Vencedor jogo 8
    String vencedorJogo8;

    if (golsO > golsP) {
      vencedorJogo8 = times[14];
    } else {
      vencedorJogo8 = times[15];
    }

    System.out.println("\nO vencedor do jogo 8 foi: " + vencedorJogo8);

    // Resultados Oitavas
    System.out.println("\nOs times classificados para as quartas de finais foram: \n" + vencedorJogo1);
    System.out.println(vencedorJogo2);
    System.out.println(vencedorJogo3);
    System.out.println(vencedorJogo4);
    System.out.println(vencedorJogo5);
    System.out.println(vencedorJogo6);
    System.out.println(vencedorJogo7);
    System.out.println(vencedorJogo8);

    // Quartas de finais
    System.out.println("\nVamos às quartas de finais!");

    // Jogo 9 - Vencedor Oitavas 1 vs Vencedor Oitavas 2
    System.out.println("\nJogo 9 - " + vencedorJogo1 + " vs " + vencedorJogo2);
    System.out.print("\nDigite quantos gols o time " + vencedorJogo1 + " fez: ");
    int golsVencedor1 = leitura.nextInt();

    System.out.print("Digite quantos gols o time " + vencedorJogo2 + " fez: ");
    int golsVencedor2 = leitura.nextInt();

    // Vencedor jogo 9
    String vencedorJogo9;

    if (golsVencedor1 > golsVencedor2) {
      vencedorJogo9 = vencedorJogo1;
    } else {
      vencedorJogo9 = vencedorJogo2;
    }

    System.out.println("\nO vencedor do jogo 9 foi: " + vencedorJogo9);

    // Jogo 10 - Vencedor Oitavas 3 vs Vencedor Oitavas 4
    System.out.println("\nJogo 10 - " + vencedorJogo3 + " vs " + vencedorJogo4);
    System.out.print("\nDigite quantos gols o time " + vencedorJogo3 + " fez: ");
    int golsVencedor3 = leitura.nextInt();

    System.out.print("Digite quantos gols o time " + vencedorJogo4 + " fez: ");
    int golsVencedor4 = leitura.nextInt();

    // Vencedor jogo 10
    String vencedorJogo10;

    if (golsVencedor3 > golsVencedor4) {
      vencedorJogo10 = vencedorJogo3;
    } else {
      vencedorJogo10 = vencedorJogo4;
    }

    System.out.println("\nO vencedor do jogo 10 foi: " + vencedorJogo10);

    // Jogo 11 - Vencedor Oitavas 5 vs Vencedor Oitavas 6
    System.out.println("\nJogo 11 - " + vencedorJogo5 + " vs " + vencedorJogo6);
    System.out.print("\nDigite quantos gols o time " + vencedorJogo5 + " fez: ");
    int golsVencedor5 = leitura.nextInt();

    System.out.print("Digite quantos gols o time " + vencedorJogo6 + " fez: ");
    int golsVencedor6 = leitura.nextInt();

    // Vencedor jogo 11
    String vencedorJogo11;

    if (golsVencedor5 > golsVencedor6) {
      vencedorJogo11 = vencedorJogo5;
    } else {
      vencedorJogo11 = vencedorJogo6;
    }

    System.out.println("\nO vencedor do jogo 11 foi: " + vencedorJogo11);

    // Jogo 12 - Vencedor Oitavas 7 vs Vencedor Oitavas 8
    System.out.println("\nJogo 12 - " + vencedorJogo7 + " vs " + vencedorJogo8);
    System.out.print("\nDigite quantos gols o time " + vencedorJogo7 + " fez: ");
    int golsVencedor7 = leitura.nextInt();

    System.out.print("Digite quantos gols o time " + vencedorJogo8 + " fez: ");
    int golsVencedor8 = leitura.nextInt();

    // Vencedor jogo 12
    String vencedorJogo12;

    if (golsVencedor7 > golsVencedor8) {
      vencedorJogo12 = vencedorJogo7;
    } else {
      vencedorJogo12 = vencedorJogo8;
    }

    System.out.println("\nO vencedor do jogo 12 foi: " + vencedorJogo12);

    // Resultados Quartas
    System.out.println("\nOs times classificados para as semifinais foram: \n" + vencedorJogo9);
    System.out.println(vencedorJogo10);
    System.out.println(vencedorJogo11);
    System.out.println(vencedorJogo12);

    // Semifinais
    System.out.println("\nVamos às semifinais!");

    // Jogo 13 - Vencedor Quartas 9 vs Vencedor Quartas 10
    System.out.println("\nJogo 13 - " + vencedorJogo9 + " vs " + vencedorJogo10);
    System.out.print("\nDigite quantos gols o time " + vencedorJogo9 + " fez: ");
    int golsVencedor9 = leitura.nextInt();

    System.out.print("Digite quantos gols o time " + vencedorJogo10 + " fez: ");
    int golsVencedor10 = leitura.nextInt();

    // Vencedor jogo 13
    String vencedorJogo13;

    if (golsVencedor9 > golsVencedor10) {
      vencedorJogo13 = vencedorJogo9;
    } else {
      vencedorJogo13 = vencedorJogo10;
    }

    System.out.println("\nO vencedor do jogo 13 foi: " + vencedorJogo13);

    // Jogo 14 - Vencedor Quartas 11 vs Vencedor Quartas 12
    System.out.println("\nJogo 14 - " + vencedorJogo11 + " vs " + vencedorJogo12);
    System.out.print("\nDigite quantos gols o time " + vencedorJogo11 + " fez: ");
    int golsVencedor11 = leitura.nextInt();

    System.out.print("Digite quantos gols o time " + vencedorJogo12 + " fez: ");
    int golsVencedor12 = leitura.nextInt();

    // Vencedor jogo 14
    String vencedorJogo14;

    if (golsVencedor11 > golsVencedor12) {
      vencedorJogo14 = vencedorJogo11;
    } else {
      vencedorJogo14 = vencedorJogo12;
    }

    System.out.println("\nO vencedor do jogo 14 foi: " + vencedorJogo14);

    // Resultados semifinais
    System.out.println("\nOs 2 times classificados para a grande final foram: \n" + vencedorJogo13);
    System.out.println(vencedorJogo14);

    // Final
    System.out.println("\nBem vindo à Grande Final entre os times: " + vencedorJogo13 + " e " + vencedorJogo14 + "!");
    System.out.print("\nDigite quantos gols o time " + vencedorJogo13 + " fez: ");
    int golsVencedor13 = leitura.nextInt();

    System.out.print("Digite quantos gols o time " + vencedorJogo14 + " fez: ");
    int golsVencedor14 = leitura.nextInt();

    // Vencedor Final
    String campeao;

    if (golsVencedor13 > golsVencedor14) {
      campeao = vencedorJogo13;
    } else {
      campeao = vencedorJogo14;
    }

    System.out.println("\nO grande Campeão da competição foi: " + campeao);
    System.err.println("\nParabéns " + campeao + "!");

    leitura.close();
  }
}
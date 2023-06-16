package construcaodealgoritmo10;

import java.util.Scanner;

public class AF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] planos = new String[3][4];
        String[][] aulas = new String[6][4];

        int qntdPlanos = 0;
        int[] qntdAulas = {0, 0, 0, 0, 0, 0};

        String[] nomeDias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"};
        String[] colunas = {"Nome", "Descrição", "Preço", "Professor"};

        boolean continuar = true;
        while (continuar) {
            System.out.println("Sistema de Academia 3000 PLUS EXTRA");
            System.out.println("1) Cadastrar planos");
            System.out.println("2) Cadastrar aulas");
            System.out.println("3) Exibir planos");
            System.out.println("4) Exibir aulas");
            System.out.println("5) Sair");
            String entrada = sc.nextLine();

            switch (entrada) {
                case "1":
                    // Adicionar plano

                    // Enquanto n estiver na quantidade maxima de planos
                    if (qntdPlanos < 3) {
                        // Insere uma linha nova de acordo com a quantidade já existente de planos
                        for (int i = 0; i < colunas.length; i++) {
                            System.out.printf("Insira o \"%s\" do plano: ", colunas[i]);

                            // Usa a quantidade de planos como indíce
                            planos[qntdPlanos][i] = sc.nextLine();
                        }

                        qntdPlanos++;
                    } else {
                        System.out.println("Máximo de planos atingido, melhore a versão do ERP para Sistema de Academia 4500 PLUS EXTRA RTX SOUL GOLD ");
                    }
                    break;
                case "2":
                    // Escolhe o dia da semana que será usado como indice da matriz de aulas
                    System.out.println("Escolha o dia da semana (Segunda-Sábado = 0-5):");
                    int dia = Integer.parseInt(sc.nextLine());
                    
                    // Enquanto n estiver na quantidade maxima de aulas                    
                    if (qntdAulas[dia] < 4) {
                        while (qntdAulas[dia] < 4) {
                            System.out.printf("Digite a %dª aula de %s: ", qntdAulas[dia] + 1, nomeDias[dia]);
                            // Salvando na matriz aulas na posição do dia
                            aulas[dia][qntdAulas[dia]] = sc.nextLine();

                            // Salvando quantidade de aula do dia
                            qntdAulas[dia] += 1;

                            // Perguntando se deseja adicionar mais aulas
                            System.out.println("Deseja adicionar mais uma aula? (SIM = 1, NÃO = 0)");
                            String opt = sc.nextLine();
                            if (opt.equals("0")) {
                                break;
                            }
                        }
                    } else {
                        System.out.println("Máximo de aulas no dia atingido, melhore a versão do ERP para Sistema de Academia 4500 PLUS EXTRA RTX SOUL GOLD ");
                    }
                    break;
                case "3":
                    // Passa por cada linha da matriz planos
                    for (int plano = 0; plano < qntdPlanos; plano++) {
                        System.out.printf("====== PLANO %d ======\n", plano + 1);

                        // Passa por cada coluna na linha e exibe
                        for (int i = 0; i < colunas.length; i++) {
                            System.out.printf("%s: %s\n", colunas[i], planos[plano][i]);
                        }
                        System.out.println("");
                    }

                    System.out.println("Pressione algo para continuar");
                    sc.nextLine();
                    break;
                case "4":
                    // Passa por cada linha da matriz aulas
                    for (int diaA = 0; diaA < 6; diaA++) {
                        System.out.printf("%s: ", nomeDias[diaA]);

                        // Passa por cada coluna na linha e exibe
                        for (int i = 0; i < 4; i++) {
                            if (aulas[diaA][i] != null) {
                                System.out.printf("%s ", aulas[diaA][i]);
                            }
                        }
                        System.out.println("");
                    }

                    System.out.println("Pressione algo para continuar");
                    sc.nextLine();
                    break;
                case "5":
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }

    }

}

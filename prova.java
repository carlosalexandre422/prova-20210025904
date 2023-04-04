
import java.util.Scanner;
import java.util.Arrays;

public class prova {

public static void main(String[] args) {

    //Variáveis

        int num;
        String[] chacagem = {"", "", "", "", ""};
        String checagemJuntos = new String();
        String[] nomes = {"", "", "", "", ""};
        int[] idades = {0,0,0,0,0,};
        float[] pesos = {0f,0f,0f,0f,0f};
        int[] alturas = {0,0,0,0,0};
        float[] IMC = {0,0,0,0,0};
        Scanner scn = new Scanner (System.in);
        String nomesJuntos = new String();
        String idadesJuntas = new String();
        String pesosJuntos = new String();
        String alturasJuntas = new String();
        float somaIdade = 0;
        float somaPeso = 0;
        float somaIMC = 0;
        int somaAltura = 0;
        float mediaIdades = 0;
        float mediaPesos = 0;
        float mediaIMC = 0;
        float mediaAlturas = 0;
        String abaixoDoPeso = "";
        String pesoIdeal = "";
        String levAcimaDoPeso = "";
        String obGrau1 = "";
        String obGrau2 = "";
        String obGrau3 = "";

        //Menu

        while(true){
            System.out.print("##--Teste Estrutura de Menu--##\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| [1] Cadastro das pessoas     |\n");
            System.out.print("| [2] Lista de Pessoas cadastradas|\n");
            System.out.print("| [3] Análise da média dos dados|\n");
            System.out.print("| [4] Valores do IMC          |\n");
            System.out.print("| [5] Valores das idades    |\n");
            System.out.print("| [6] Valores das alturas    |\n");
            System.out.print("| [7] Dados da pessoa        |\n");
            System.out.print("| [8] Sair       |\n");
            System.out.print("Digite uma opção: ");

            int opcao = scn.nextInt();

            if(opcao==8){
                System.out.print("\nAté logo!");
                scn.close(); 
            }

        switch (opcao) {
        case 1:
            System.out.print("\nOpção Novo Cadastro Selecionado\n");
            for(int i = 0;i<=4;i++){
                System.out.print("Insira o nome da " + (i+1) + "a pessoa: ");
                nomes[i] = scn.next();
    
                System.out.print("Insira a idade da " + (i+1) + "a pessoa: ");
                idades[i] = scn.nextInt();
                while(idades[i]<17){//Pelo menos 16 anos
                    System.out.print("Insira a idade da " + (i+1) + "a pessoa: ");
                    idades[i] = scn.nextInt();
                }
                somaIdade+=idades[i];
    
                System.out.print("Insira o peso da " + (i+1) + "a pessoa em kg: ");
                pesos[i] = scn.nextFloat();
                somaPeso+=pesos[i];
    
                System.out.print("Insira a altura da " + (i+1) + "a pessoa em cms: ");
                alturas[i] = scn.nextInt();
                somaAltura+=alturas[i];

                IMC[i] = pesos[i]/alturas[i];
            }

            mediaIdades = somaIdade/5;//Todas as médias
            mediaAlturas = somaAltura/5;
            mediaIMC = (somaIdade/somaAltura)/5;
            mediaPesos = somaPeso/5;
    
            checagemJuntos = Arrays.toString(chacagem);//Strings de todos os dados para imprimir posteriormente
            nomesJuntos = Arrays.toString(nomes);
            idadesJuntas = Arrays.toString(idades);
            pesosJuntos = Arrays.toString(pesos);
            alturasJuntas = Arrays.toString(alturas);
    
            break;

        case 2://Impressão dos funcionarios na tela
            System.out.print("\nOpção Clientes Selecionado\n");

            if(nomesJuntos.equals(checagemJuntos)){
                System.out.println("Não há nenhum funcionário cadastrado");
            } else{
                 System.out.println("Nomes dos funcionários, respectivamente: " + nomesJuntos);
            System.out.println("Idades dos funcionários, respectivamente: " + idadesJuntas);
            System.out.println("Pesos dos funcionários, respectivamente: " + pesosJuntos);
            System.out.println("Alturas dos funcionários, respectivamente: " + alturasJuntas);
            }

            break;

        case 3://impressão das médias
            System.out.print("\nOpção Produtos Selecionado\n");
                System.out.println("Média das idades: " + mediaIdades +"anos");
                System.out.println("Média dos pesos: " + mediaPesos + "kgs");
                System.out.println("Média das alturas: " + mediaAlturas + "cms");
                System.out.println("Média do IMC: " + mediaIMC);
            break;

        case 4://Impressão dos valores do IMC
            System.out.print("\nValores do IMC\n");

            for(int i = 0; i<5; i++){
                if(IMC[i]<=18.5){
                    abaixoDoPeso += nomes[i] + " ";
                } else if(IMC[i]>18.5 && IMC[i]< 24.9){
                    pesoIdeal += nomes[i] + " ";
                } else if(IMC[i]>25 && IMC[i] < 29){
                    levAcimaDoPeso += nomes[i] + " ";
                } else if(IMC[i]>30 && IMC[i] < 34.9){
                    obGrau1 += nomes[i] + " ";
                } else  if(IMC[i]>35 && IMC[i]<39.9){
                    obGrau1 += nomes[i] + " ";
                } else  if(IMC[i]>40){
                    obGrau1 += nomes[i] + " ";
                }
            }

            System.out.println("Abaixo do peso: " + abaixoDoPeso + "\nPeso ideal: " + pesoIdeal + "\nLevemente acima do peso: " + levAcimaDoPeso + "\nObesisdade grau 1: " + obGrau1 + "\nObesidade grau 2: " + obGrau2 + "\nObesidade grau 3: " +obGrau3);
            break;

        case 5:
            System.out.print("\nOpção Valores das idades Selecionado\n");//não consegui concluir
            break;

        case 6:
            System.out.print("\nOpção Valores das alturas Selecionado\n");//não consegui concluir
            break;
        case 7:
            System.out.print("\nOpção Dados da pessoa Selecionado\n");//não consegui concluir
            break;

        default:
            System.out.print("\nOpção Inválida!");
            break;

    }
}
}
}
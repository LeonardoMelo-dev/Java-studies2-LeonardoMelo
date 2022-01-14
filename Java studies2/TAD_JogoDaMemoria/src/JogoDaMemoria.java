import java.util.Scanner;

public class JogoDaMemoria
{
    public static void main(String[] args)
    {
        Scanner scanString = new Scanner(System.in);
        Pilha pilha = new Pilha();

        String letra[] = new String[20];


        System.out.print("Informe uma letra do alfabeto para iniciar o game: ");
        letra[0] = scanString.nextLine();
        pilha.insere(letra[0]);
        while (!pilha.estaCheia() && pilha.compara(letra) == 0)
        {
            pilha.insere(pilha.letraAleatoria());
            System.out.println("\n************* Você tem 3 segundos para lembrar a sequencia *************\n");
            pilha.verFila();
            new Reminder(3);
                for(int i=0; i < pilha.tamanhoPilha(); i++)
                {
                    letra[i] = scanString.nextLine();
                }
        }
    }
}

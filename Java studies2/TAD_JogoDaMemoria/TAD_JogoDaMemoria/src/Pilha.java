public class Pilha
{

    private String elementos[];
    private int topo;
    private int quant;

    public Pilha()
    {
        elementos = new String[20];
        topo -= 1; // posicao inválida do vetor
    }

    public void insere(String e)
    {
        topo++;
        elementos[topo] = e;
        quant++;
    }

    public int tamanhoPilha()
    {
        return quant;
    }

    public String puxa()
    {
        String e;
        e = elementos[topo];
        topo--;
        return e;
    }

    public boolean estaVazia()
    {
        return (topo == -1);
    }

    public boolean estaCheia()
    {
        return (topo == elementos.length-1);
    }

    public String top()
    {
        return elementos[topo];
    }

    public void verFila()
    {
        for(int i=0; i<quant;i++)
        {
            System.out.print(elementos[i]+" ");
        }
    }

    //==========================================================================================================================================================================

    public int compara(String[] letra)
    {
        for(int i=0; i<quant;i++)
        {
            if(!letra[i].equals(elementos[i]))
            {
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.println("********************* You Lose! *********************\n\n\n\n");
                System.out.println("----------- Sequencia correta -----------");
                verFila();
                int pontos = quant * 10;
                System.out.println("\n-------------- Seus pontos --------------\n"+pontos);
                return 1;
            }
        }
        return 0;
    }

    public String letraAleatoria()
    {
        String letras[] = {"A","B","C","D","E",
                           "F","G","H","I","J",
                           "K","L","M","N","O",
                           "P","Q","R","S","T",
                           "U","V","W","X","Y","Z"};

        return letras[(int)Math.round(Math.random() * 25)];
    }
}

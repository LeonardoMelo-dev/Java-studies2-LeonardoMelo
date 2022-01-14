public abstract class Fincionario implements Pessoa
{
    public String nome;
    public String CPF;
    public int idade;
    public String funcao;

    public Fincionario()
    {

    }

    public Fincionario(String nome, String CPF, int idade, String funcao)
    {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
        this.funcao = funcao;
    }

    public String getFuncao()
    {
        return funcao;
    }

    public abstract void getInfo(); //metodo abstrato

    public void setFuncao(String funcao)
    {
        this.funcao = funcao;
    }
}

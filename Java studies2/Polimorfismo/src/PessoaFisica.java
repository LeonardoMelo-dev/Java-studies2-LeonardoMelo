public class PessoaFisica extends Pessoa
{
    private long CPF;

    public PessoaFisica()
    {

    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    @Override
    public String getNome()
    {
        return "Pessoa Fisica: "+super.getNome()+"\nCPF: "+this.getCPF();
    }
}

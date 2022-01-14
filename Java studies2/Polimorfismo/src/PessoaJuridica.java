public class PessoaJuridica extends Pessoa
{
    private long CNPJ;

    public PessoaJuridica()
    {

    }

    public long getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(long CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public String getNome() {
        return "Pessoa Juridica: " + super.getNome() + "\nCNPJ: "+this.getCNPJ();
    }
}

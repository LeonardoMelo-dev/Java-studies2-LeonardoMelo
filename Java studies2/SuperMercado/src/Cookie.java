public class Cookie implements Item
{
    private String nomeIten;
    private double preco;
    private String departamento;

    public Cookie(String nomeIten, String departamento)
    {
        this.nomeIten = nomeIten;
        this.departamento = departamento;
    }

    @Override
    public String getNomeIten()
    {
        return nomeIten;
    }

    public void setNomeIten(String nomeIten)
    {
        this.nomeIten = nomeIten;
    }

    @Override
    public double getPreco()
    {
        return 0;
    }

    @Override
    public void setPreco(double preco)
    {
        this.preco = preco;
    }

    @Override
    public String getDepartamento()
    {
        return departamento;
    }
}

public class Medico {

    private String nome;
    private String CRM;
    private String matricula;
    private Endereco endereco;


    public Medico (String nome)
    {
        this.nome = nome;
    }

    public Medico (String nome, String CRM, String matricula, Endereco endereco)
    {
        this.nome = nome;
        this.CRM = CRM;
        this.matricula = matricula;
        this.endereco = endereco;
    }


    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCRM()
    {
        return CRM;
    }

    public void setCRM(String CRM)
    {
        this.CRM = CRM;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getMedico()
    {
        if(endereco == null)
        {
            return "Médico: " + getNome() + " - " + "CRM: " + getCRM();
        }
        else
        {
            return "Médico: " + getNome() + " - " + "CRM: " + getCRM() + "\nEndereco:\n" + endereco.getEndereco();
        }
    }
}

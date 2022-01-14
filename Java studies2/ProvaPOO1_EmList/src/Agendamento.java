public class Agendamento
{
    private String especialidade;
    private int dia;
    private int mes;
    private  Medico medico;

    public Agendamento(String especialidade, int dia, int mes, Medico medico) {
        this.especialidade = especialidade;
        this.dia = dia;
        this.mes = mes;
        this.medico = medico;
    }

    public String getEspecialidade()
    {
        return especialidade;
    }

    public void setEspecialidade(String especialidade)
    {
        this.especialidade = especialidade;
    }

    public int getDia()
    {
        return dia;
    }

    public void setDia(int dia)
    {
        this.dia = dia;
    }

    public int getMes()
    {
        return mes;
    }

    public void setMes(int mes)
    {
        this.mes = mes;
    }

    public Medico getMedico()
    {
        return medico;
    }

    public void setMedico(Medico medico)
    {
        this.medico = medico;
    }

    public String relatorio()
    {
        return medico.getMedico()+"\nEspecialidade do medico: "+getEspecialidade()+"\nData da consulta: "+getDia()+"/"+getMes();
    }

}


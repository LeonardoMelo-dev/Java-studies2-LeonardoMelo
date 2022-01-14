import javax.swing.JOptionPane;
import java.util.ArrayList;


public class ProvaPOO1_EmList {
    public static void main(String[] args) {

        //Medico
        String nome;
        String CRM;
        String matricula;

        //Agendamento
        String especialidade;
        int dia;
        int mes;

        //Endereço
        String CEP;
        int numero;

        //Variaveis de manipulação de classe
        int quantMedicos;
        int escolhaCadastro;
        int ok=1;
        int escolha=0;

        //contador
        int i;

        quantMedicos = Integer.parseInt(JOptionPane.showInputDialog("Quantos medicos deseja registrar?"));

        Medico medico[] = new Medico[quantMedicos];
        ArrayList<Agendamento> arrayAgendamento = new ArrayList<Agendamento>();
        ArrayList<Endereco> arryEndereco = new ArrayList<Endereco>();

        for (i=0; i<quantMedicos; i++)
        {
            escolhaCadastro = Integer.parseInt(JOptionPane.showInputDialog("Diseja fazer o cadastro simplificado? 1 p/ sim ou 2 p/ não"));
            if (escolhaCadastro == 1)
            {
                nome = JOptionPane.showInputDialog("Nome do medico: ");
                medico[i] = new Medico(nome);
            }
            else
            {
                nome = JOptionPane.showInputDialog("Entre com o nome do medico: ");
                CRM = JOptionPane.showInputDialog("Entre com o CRM do medico: ");
                matricula = JOptionPane.showInputDialog("Entre com  a matricula do medico");
                CEP = JOptionPane.showInputDialog("Entre com o cep do medico: ");
                numero = Integer.parseInt(JOptionPane.showInputDialog("Entre com o numero do medico: "));
                Endereco endereco = new Endereco(CEP, numero);
                arryEndereco.add(endereco);
                medico[i] = new Medico(nome, CRM, matricula, arryEndereco.get(i));
            }
        }

        for(i=0; i<quantMedicos; i++)
        {
            System.out.println("Digite "+i+" Para: "+medico[i].getNome());
        }

        while (ok == 1)
        {
            ok = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para realizar um agendamento e 2 fara finalizar o cadastro: "));
            if(ok == 1)
            {
                escolha = Integer.parseInt(JOptionPane.showInputDialog("Escolha um médico: "));
                especialidade = JOptionPane.showInputDialog("Digite a especialidade do medico: " + escolha);
                dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia: "));
                mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes: "));

                Agendamento agendamento = new Agendamento(especialidade, dia, mes, medico[escolha]);
                arrayAgendamento.add(agendamento);
            }
            else
            {

            }
        }

        System.out.println("Agendamentos marcados: ");
        for (i=0; i<arrayAgendamento.size(); i++)
        {
            System.out.println(arrayAgendamento.get(i).relatorio());
            System.out.println("\n\n");
        }
    }
}
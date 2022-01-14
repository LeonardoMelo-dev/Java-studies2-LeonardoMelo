public class PolimorfMain {
    public static void main(String[] args)
    {

        PessoaFisica fisica = new PessoaFisica();
        PessoaJuridica juridica = new PessoaJuridica();


        fisica.setNome("Jaime Delacerna");
        fisica.setCPF(32211333454l);
        juridica.setNome("Marcos Cruz");
        juridica.setCNPJ(63434322223l);

        System.out.println(fisica.getNome());
        System.out.println(juridica.getNome());
    }
}

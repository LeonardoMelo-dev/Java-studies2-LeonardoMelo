public class Main {
    public static void main(String[] args) {
        Registro registro1 = new Registro("3423-A22B","Hortolandia", "SP");
        Registro registro2 = new Registro("4322-233C","Campinas", "SP");
        Motocicleta motocicleta = new Motocicleta("Honda", 650, registro1);
        SUV suv = new SUV(6, 50,registro1);

        System.out.println(registro1);
        System.out.println(registro2);
        System.out.println(motocicleta);
        System.out.println(suv);
    }
}

package cat;
public class Cat {
    //Atributos
    String nome;
    String raca;
    double comprimento;
    double idade;

    //Métodos
    public void falar() {
        System.out.println(nome+" diz: Meow, Meow!");
    }
    public void comer() {
        System.out.println(nome+" foi comer sua ração");
    }
    public void fazerCarinho() {
        System.out.println(nome+" ficou feliz =-)");
    }
    public void whoIam() {
        System.out.println("Sou "+ nome+ ", da raça "+ raca+ ", tenho "+ idade+ " anos =-)");
    }
    double quantosAnosTerei(double n) {
        double maisvelho = idade+ n;
        return maisvelho;
    }
    public void banho() {
        System.out.println(nome+ " correu para longe");
    }
}

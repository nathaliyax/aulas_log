public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Maria");
        p.setIdade(25);
        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
    }
}
public class Main {
    public static void main(String[] args) {
        operacaoMedias();
    }

    private static void operacaoMedias() {
        System.out.println("**** operacaoMedias ****");
        int nota1 = 5, nota2 = 5, nota3 = 5, nota4 = 5;

        int total = nota1 + nota2 + nota3 + nota4;

        int media = total / 4;

        if (media >= 7) {
            System.out.println("Parabéns você passou");
        } else {
            System.out.println("Não foi dessa vez, refaça a tarefa");
        }

        System.out.println("Média: " + media);
    }

}
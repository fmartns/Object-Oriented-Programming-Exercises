public class ExercicioDois {
    public static void main(String[] args) {

        float menorNum = Integer.parseInt(args[0]);
        float maiorNum = Integer.parseInt(args[0]);
        float soma = 0;

        for(int i = 0; i< args.length; i++){

            if (Integer.parseInt(args[i]) < menorNum) {
                menorNum = Integer.parseInt(args[i]);
            }
            if (Integer.parseInt(args[i]) > maiorNum) {
                maiorNum = Integer.parseInt(args[i]);
            }

            soma += Integer.parseInt(args[i]);
        }

        float media = soma / args.length;

        System.out.println("Maior número: " + maiorNum);
        System.out.println("Menor número: " + menorNum);
        System.out.println("Média: " + media);

    }
}
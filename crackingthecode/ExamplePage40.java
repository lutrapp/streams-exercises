package crackingthecode;

public class ExamplePage40 {
    public static void main(String[] args) {
        // Chamada do método sum
        int result = sum(9999);
        System.out.println("Sum: " + result);
    }

    // Método para calcular a soma de números de 1 até n
    public static int sum(int n) {
        try{
            if (n <= 0) {
                return 0;
            }

        }catch (Exception e){
            System.out.println();
        }
        return n + sum(n - 1);
    }
}

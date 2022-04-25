class Fibonacci {
    public void Fibo(int until) {
        int first = 0;
        int second = 1;
        System.out.println("The Fibonacci serie is:");

        while (first < until) {
            int aux = first;
            System.out.print(first + " ");
            first = second;
            second += aux;
            // 0 1 1 2 3 5 8
        }

    }
}
package test02;

public class test02 {
    public static void main(String[] args) {
        MyLambdaFunction lambdaFunction = (int a, int b) -> a > b ? a : b;
        System.out.println(lambdaFunction.max(3,5));
    }
}

@FunctionalInterface
interface MyLambdaFunction{
    int max(int a, int b);
}

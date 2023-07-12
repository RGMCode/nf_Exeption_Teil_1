public class Main {

    public static void main(String[] args) {
        div(5, 2);
        div(1, 0);

        String[] strings = {"Hallo", "Welt", "Das", "Sind", "Exceptions"};

        ExceptionString exceptionString = new ExceptionString(strings);

        System.out.println(exceptionString.getStringByIndex(10));
    }

    public static int div(int a, int b){
        if (a < 1 || b < 1){
            return 0;
        } else {
            System.out.println(a/b);
            return (a / b);
        }
    }



}

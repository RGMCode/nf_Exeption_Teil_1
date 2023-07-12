import java.io.FileNotFoundException;

public class ExceptionString {

    private String[] strings;

    public ExceptionString(String[] strings) {
        this.strings = strings;
    }

    public String getStringByIndex(int i){
        try {
            return strings[i];
        } catch (ArrayIndexOutOfBoundsException e){
            return "Index defekt alles blöd,  der Fehler ist: " + e.getMessage();
        }

    }


    public static int div(int a, int b) throws FileNotFoundException{
        if (a < 1 || b < 1){
            throw new FileNotFoundException(); // Checked Exeption = rote unterstruche bei fehlender deklaration.
        } else {
            System.out.println(a/b);
            return (a / b);
        }
    }

}

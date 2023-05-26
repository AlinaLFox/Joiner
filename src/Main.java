import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //создаем список обьектов типа String
        Joiners<String> stringsToJoin = new Joiners<>();
        //создаем сами обьекты
        String a = "Buna ziua";
        String b = "lumea";
        //создаем новую переменную, под которой сохраним итог после склейки двух обьектов
        String unitedStrings = stringsToJoin.join(a,b);
        //выводим на консоль
        System.out.println(unitedStrings);

        ArrayList<String> arL = new ArrayList<>();
        arL.add("buna");
        arL.add("ziua,");
        arL.add("lumea");

        Joiner<String> joiner = new Joiners<String>() {
        };

        //cind metoda este statica o chemem direct
        //scriem (denumirea clasei).(metoda)()
        String result = Joiners.fold(arL, joiner);
        System.out.println(result);

    }
}
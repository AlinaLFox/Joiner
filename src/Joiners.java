import java.util.ArrayList;
// cind metoda e statica noi nu indicam tipul de date in diamante in denumirea clasei
public class Joiners <String> implements Joiner<String> {
    //Шаг2: создаем клас, который implements наш интерфейс
    //делаем override метода
    @Override
    public String join(String a, String b) {
        //в теле метода указываем, что он должен нам вернуть
        return (String) (a + " " + b);
    }

    // primul Any - tip de intrare, al doilea Any - tip de returnare
    // pentru ca valoarea default nu poate fi nula
    // nu stim primul element si nici nu sctim tipul lui, initializam pur si simplu element din prima pozitie pe index 0
    public static <Any> Any fold(ArrayList<Any> anyList, Joiner<Any> anyJoiner){
        //initializam valoare pentru contor
       Any result = anyList.get(0);
       // for obisnuit pentru parcurgerea listei anyList
        for (int i = 1; i < anyList.size(); i++){
            //если это выражение не присвоить переменной result, то просто покажет обьект с первой позиции
            result = anyJoiner.join(result, anyList.get(i));
        }
        return result;
    }
}

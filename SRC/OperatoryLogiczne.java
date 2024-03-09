//działają na wartosciach logicznych, zwracajac wartosci logiczne
public class OperatoryLogiczne {

    public static void main(String[] args) {
        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = true;
        boolean fourthValue = false;

        System.out.println(firstValue && secondValue); // operator i - zwraca true gdy dwa wyrażenia składowe = true
        System.out.println(firstValue && thirdValue);
        System.out.println(firstValue || secondValue); // operator lub - gdy chociaz jedno jest true zwraca true
        System.out.println(secondValue || fourthValue);
        System.out.println(!firstValue); // negacja - zmienia wartosc na przeciwna
        System.out.println(!secondValue);
        System.out.println(!(firstValue && secondValue));

    }
}

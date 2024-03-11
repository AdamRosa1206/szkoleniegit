import java.util.Scanner;

//Stworz 3 obiekty klasy student. Przypisz wartosci do pol Stworz tablice i dodaj studentow do tablicy
//Przejdz przez studentow w tablicy i wywolaj wszystkie 4 metody
public class StudentChecker {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.imie = "Kasia";
        student1.nazwisko = "Nowak";
        student1.nick = "KasiaN";
        student1.email = "kasian@gmail.com";
        student1.numerIndeksu = 45687;

        Student student2 = new Student();
        student2.imie = "Marek";
        student2.nazwisko = "Kowalski";
        student2.nick = "MarekK";
        student2.email = "marekk@gmail.com";
        student2.numerIndeksu = 45987;

        Student student3 = new Student();
        student3.imie = "Piotr";
        student3.nazwisko = "Kolski";
        student3.nick = "PiotrK";
        student3.email = "piotrk@gmail.com";
        student3.numerIndeksu = 77687;


        Student[] listaStudentow = new Student[3];
        listaStudentow[0] = student1;
        listaStudentow[1] = student2;
        listaStudentow[2] = student3;


        for (int i = 0; i < listaStudentow.length; i++) {
            listaStudentow[i].przedstawSie();
            listaStudentow[i].zalogujSie();
            listaStudentow[i].podajNrIndeksu();
            listaStudentow[i].podajEmail();
        }



//Klasy ktore wczesniej poznalismy
    String imie = new String("Kasie"); // Strung jest klasą
    Scanner skaner = new Scanner(System.in); // tutaj Scanner i System.in są klasami

    }


}

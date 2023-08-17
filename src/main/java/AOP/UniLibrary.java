package AOP;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    //    @Override
    public void getBook() {
        System.out.println("Ми беремо книгу з UniLibrary");
        System.out.println("--------------------------------------");
    }

    public void addBook(String person_name, Book book) {
        System.out.println("Ми додаємо книгу з UniLibrary");
        System.out.println("--------------------------------------");
    }

    public String returnBook() {
        int a = 10/0;
        System.out.println("Ми повертаємо книгу в UniLibrary");
        return "Мартин Иден";
    }

    public void returnMagazine() {
        System.out.println("Ми повертаємо журнал з UniLibrary");
        System.out.println("--------------------------------------");
    }


    public void getMagazine() {
        System.out.println("Ми беремо журнал з UniLibrary");
        System.out.println("--------------------------------------");

    }

    public void addMagazine() {
        System.out.println("Ми додаємо журнал з UniLibrary");
        System.out.println("--------------------------------------");
    }
}

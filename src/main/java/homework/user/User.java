/*Stworzyć klasę User, która ma mieć obowiązkowe pola String firstName, String lastName oraz płeć String sex (male|female).
 Oprócz tego, mają być dostępne opcjonalne pola int height, String birthDate (w formacie yyyy-MM-dd)
 oraz String[] interests (array zainteresowań). Stworzyć odpowiednie konstruktory,
 które pozwolą wprowadzić zarówno dane wymagane jak i opcjonalne. Zastanowić się jak najlepiej dodawać zainteresowania
 oraz w jaki sposób można wymusić, aby pole sex przyjęło tylko jedną z dwóch dostępnych wartości
 i czy na pewno String jest właściwym typem (podpowiedź - sprawdzić co to jest Enum).*/

package homework.user;

import java.util.Scanner;

public class User {
    public User(String firstName, String lastName, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }

    public User(String firstName, String lastName, Sex sex, int height, String birthDate, String[] interests) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.height = height;
        this.birthDate = birthDate;
        this.interests = interests;
    }

    private final String firstName;
    private final String lastName;
    private Sex sex;

    public enum Sex {
        male, female
    }

    private int height;
    private String birthDate;//yyyy-MM-dd
    private String[] interests;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight() {
        Scanner scanner = new Scanner(System.in);
        height = scanner.nextInt();
        this.height = height;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String[] getInterests() {
        return interests;
    }

    public void setInterests(String[] interests) {
        this.interests = interests;
    }
}

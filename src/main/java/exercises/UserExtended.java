package exercises;

import java.time.LocalDate;

public class UserExtended {
    private String name;
    private String lastname;
    private LocalDate dayOfBirth;

    public UserExtended(String name, String lastname, LocalDate dayOfBirth) {
        this.name = name;
        this.lastname = lastname;
        this.dayOfBirth = dayOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(LocalDate dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    @Override
    public String toString() {
        return "UserExtended{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dayOfBirth=" + dayOfBirth +
                '}';
    }
}

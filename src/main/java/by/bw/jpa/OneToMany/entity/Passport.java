package by.bw.jpa.OneToMany.entity;

import javax.persistence.*;

@Entity (name = "passport")
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(unique = true, nullable = false)
    private String number;

//    Удаляется по цепочки из обеих таблиц
//    @OneToOne(mappedBy = "passport", cascade = {CascadeType.ALL);

//  Удаляется только запись из таблицы Passport
    @OneToOne(mappedBy = "passport", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private Person person;

    public int getId() {
        return id;
    }

    public Passport() {
    }

    public Passport(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "\nPassport{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", person=" + person +
                '}';
    }
}

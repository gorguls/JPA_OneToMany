package by.bw.jpa.OneToMany.repository;

import by.bw.jpa.OneToMany.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersomRepositiry extends JpaRepository<Person, Integer> {
}

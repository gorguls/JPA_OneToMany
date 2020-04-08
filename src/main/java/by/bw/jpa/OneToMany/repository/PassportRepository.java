package by.bw.jpa.OneToMany.repository;

import by.bw.jpa.OneToMany.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<Passport, Integer> {
    Passport findByNumber(String number);
}

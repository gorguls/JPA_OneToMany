package by.bw.jpa.OneToMany;

import by.bw.jpa.OneToMany.entity.Passport;
import by.bw.jpa.OneToMany.entity.Person;
import by.bw.jpa.OneToMany.entity.Phone;
import by.bw.jpa.OneToMany.repository.PassportRepository;
import by.bw.jpa.OneToMany.repository.PersomRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class OneToManyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(OneToManyApplication.class, args);
	}

	@Autowired
	PersomRepositiry personRepository;

	@Autowired
	PassportRepository passportRepository;

	@Override
	public void run(String... args) throws Exception {
		Passport passport1 = new Passport("A111");
		Phone phone1_1 = new Phone("11111-1");
		Phone phone1_2 = new Phone("11111-2");
		Person person1 = new Person("Иванов", passport1);
		person1.setPhone(Arrays.asList(phone1_1, phone1_2));

		Passport passport2 = new Passport("B222");
		Phone phone2_1 = new Phone("22222-1");
		Phone phone2_2 = new Phone("22222-2");
		Person person2 = new Person("Петров", passport2);
		person2.setPhone(Arrays.asList(phone2_1, phone2_2));

		Passport passport3 = new Passport("С222");
		Phone phone3_1 = new Phone("33333-1");
		Phone phone3_2 = new Phone("33333-2");
		Person person3 = new Person("Сидоров", passport3);
		person3.setPhone(Arrays.asList(phone3_1, phone3_2));

		List<Person> personList = Arrays.asList(person1, person2, person3);
		personRepository.saveAll(personList);
	}
}
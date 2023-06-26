package com.example.immatriculationservice;

import com.example.immatriculationservice.entities.Proprietaire;
import com.example.immatriculationservice.entities.Vehicule;
import com.example.immatriculationservice.repositories.ProprietaireRepository;
import com.example.immatriculationservice.repositories.VehiculeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication

public class ImmatriculationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImmatriculationServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner init(ProprietaireRepository proprietaireRepository, VehiculeRepository vehiculeRepository) {
        return args -> {
            // Create owners
            Proprietaire proprietaire1 = new Proprietaire();
            proprietaire1.setName("Walid");
            proprietaire1.setBirthDate(LocalDate.of(2000, 2, 7));
            proprietaire1.setEmail("Walid@gmail.com");

            Proprietaire proprietaire2 = new Proprietaire();
            proprietaire2.setName("adam");
            proprietaire2.setBirthDate(LocalDate.of(1995, 9, 16));
            proprietaire2.setEmail("adam@gmail.com");

            Proprietaire proprietaire3 = new Proprietaire();
            proprietaire3.setName("yassine");
            proprietaire3.setBirthDate(LocalDate.of(2004, 11, 1));
            proprietaire3.setEmail("yassine@gmail.com");

            Proprietaire proprietaire4 = new Proprietaire();
            proprietaire4.setName("redouane");
            proprietaire4.setBirthDate(LocalDate.of(1990, 11, 1));
            proprietaire4.setEmail("redouane@gmail.com");

            Proprietaire proprietaire5 = new Proprietaire();
            proprietaire5.setName("halima");
            proprietaire5.setBirthDate(LocalDate.of(1985, 5, 15));
            proprietaire5.setEmail("halima@gmail.com");

            Proprietaire proprietaire6 = new Proprietaire();
            proprietaire6.setName("sandra");
            proprietaire6.setBirthDate(LocalDate.of(1992, 8, 22));
            proprietaire6.setEmail("sandra@gmail.com");

            Proprietaire proprietaire7 = new Proprietaire();
            proprietaire7.setName("fred");
            proprietaire7.setBirthDate(LocalDate.of(1978, 3, 10));
            proprietaire7.setEmail("fred@gmail.com");

            Proprietaire proprietaire8 = new Proprietaire();
            proprietaire8.setName("Safaa");
            proprietaire8.setBirthDate(LocalDate.of(1989, 12, 5));
            proprietaire8.setEmail("safaa@gmail.com");

            Proprietaire proprietaire9 = new Proprietaire();
            proprietaire9.setName("Dani");
            proprietaire9.setBirthDate(LocalDate.of(1973, 1, 25));
            proprietaire9.setEmail("dani@gmail.com");

            Proprietaire proprietaire10 = new Proprietaire();
            proprietaire10.setName("Ovia");
            proprietaire10.setBirthDate(LocalDate.of(1998, 6, 8));
            proprietaire10.setEmail("ovia@gmail.com");

            // Save owners
            proprietaireRepository.save(proprietaire1);
            proprietaireRepository.save(proprietaire2);
            proprietaireRepository.save(proprietaire3);
            proprietaireRepository.save(proprietaire4);
            proprietaireRepository.save(proprietaire5);
            proprietaireRepository.save(proprietaire6);
            proprietaireRepository.save(proprietaire7);
            proprietaireRepository.save(proprietaire8);
            proprietaireRepository.save(proprietaire9);
            proprietaireRepository.save(proprietaire10);

            // Create vehicles
            Vehicule vehicle1 = new Vehicule();
            vehicle1.setBrand("Dacia");
            vehicle1.setModel("Logan");
            vehicle1.setFiscalPower(6);
            vehicle1.setRegistrationNumber("ABC123");
            vehicle1.setProprietaire(proprietaire1);

            Vehicule vehicle2 = new Vehicule();
            vehicle2.setBrand("Jeep");
            vehicle2.setModel("sport");
            vehicle2.setFiscalPower(7);
            vehicle2.setRegistrationNumber("12AABB");
            vehicle2.setProprietaire(proprietaire2);

            Vehicule vehicle3 = new Vehicule();
            vehicle3.setBrand("bougati");
            vehicle3.setModel("classic");
            vehicle3.setFiscalPower(12);
            vehicle3.setRegistrationNumber("z20DD");
            vehicle3.setProprietaire(proprietaire4);

            Vehicule vehicle4 = new Vehicule();
            vehicle4.setBrand("Reunaut");
            vehicle4.setModel("2001");
            vehicle4.setFiscalPower(8);
            vehicle4.setRegistrationNumber("XYZ789");
            vehicle4.setProprietaire(proprietaire5);

            Vehicule vehicle5 = new Vehicule();
            vehicle5.setBrand("Mercedes");
            vehicle5.setModel("190");
            vehicle5.setFiscalPower(9);
            vehicle5.setRegistrationNumber("MNB456");
            vehicle5.setProprietaire(proprietaire6);

            Vehicule vehicle6 = new Vehicule();
            vehicle6.setBrand("Mercedes-Benz");
            vehicle6.setModel("Classe A");
            vehicle6.setFiscalPower(10);
            vehicle6.setRegistrationNumber("PQR987");
            vehicle6.setProprietaire(proprietaire7);

            Vehicule vehicle7 = new Vehicule();
            vehicle7.setBrand("Nissan");
            vehicle7.setModel("2019");
            vehicle7.setFiscalPower(7);
            vehicle7.setRegistrationNumber("LKJ321");
            vehicle7.setProprietaire(proprietaire8);

            Vehicule vehicle8 = new Vehicule();
            vehicle8.setBrand("skoda");
            vehicle8.setModel("2021");
            vehicle8.setFiscalPower(6);
            vehicle8.setRegistrationNumber("WER543");
            vehicle8.setProprietaire(proprietaire9);

            Vehicule vehicle9 = new Vehicule();
            vehicle9.setBrand("RANGE Rover");
            vehicle9.setModel("sport");
            vehicle9.setFiscalPower(6);
            vehicle9.setRegistrationNumber("ASD234");
            vehicle9.setProprietaire(proprietaire10);

            Vehicule vehicle10 = new Vehicule();
            vehicle10.setBrand("Tougan");
            vehicle10.setModel("2022");
            vehicle10.setFiscalPower(7);
            vehicle10.setRegistrationNumber("UIO890");
            vehicle10.setProprietaire(proprietaire10);

            // Save vehicles
            vehiculeRepository.save(vehicle1);
            vehiculeRepository.save(vehicle2);
            vehiculeRepository.save(vehicle3);
            vehiculeRepository.save(vehicle4);
            vehiculeRepository.save(vehicle5);
            vehiculeRepository.save(vehicle6);
            vehiculeRepository.save(vehicle7);
            vehiculeRepository.save(vehicle8);
            vehiculeRepository.save(vehicle9);
            vehiculeRepository.save(vehicle10);
        };
    }

}

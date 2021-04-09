package co.com.colombia.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        System.out.println("Hola aqui hubo un cambio y lo arreglamos");
        SpringApplication.run(MainApplication.class, args);
    }
}

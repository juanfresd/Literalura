package com.alura.literalura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiteraluraApplication.class, args);
    }
package com.alura.literalura.model;

import javax.persistence.*;

    @Entity
    public class Libro {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String titulo;

        @ManyToOne
        @JoinColumn(name = "autor_id")
        private Autor autor;

        @Column(nullable = false)
        private String idioma;

        @Column(nullable = false)
        private Integer numeroDescargas;

        // Getters y setters

    }

package com.alura.literalura.model;

import javax.persistence.*;
import java.time.LocalDate;

    @Entity
    public class Autor {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false)
        private String nombre;

        @Column(nullable = false)
        private String apellido;

        @Column(nullable = false)
        private LocalDate fechaNacimiento;

        // Getters y setters

    }

package com.alura.literalura.repository;

import com.alura.literalura.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface LibroRepository extends JpaRepository<Libro, Long> {

    }

package com.alura.literalura.repository;

import com.alura.literalura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface AutorRepository extends JpaRepository<Autor, Long> {

    }

package com.alura.literalura.service;

import com.alura.literalura.model.Autor;
import com.alura.literalura.model.Libro;
import com.alura.literalura.repository.AutorRepository;
import com.alura.literalura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

    @Service
    public class LibroService {

        @Autowired
        private LibroRepository libroRepository;

        @Autowired
        private AutorRepository autorRepository;

        public Libro buscarLibroPorTitulo(String titulo) {
            // Aquí deberías implementar la lógica para buscar el libro





}
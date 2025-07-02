package dev.heitor.CadastroDeNinjas.Ninjas;

import dev.heitor.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

// Entity transforma uma classe em uma entidade do banco de dados
// JPA = Java Persistence API
@Entity
@Table(name = "tb_ninjas")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private  int age;

    @ManyToOne // Um ninja tem uma única missão
    @JoinColumn(name = "missoes_id") // Foreing Key
    private MissoesModel mission;

    // No args constructor
    public NinjaModel() {
    }

    // Constructor
    public NinjaModel(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }
}

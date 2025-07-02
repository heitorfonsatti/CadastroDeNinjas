package dev.heitor.CadastroDeNinjas.Ninjas.Model;

import dev.heitor.CadastroDeNinjas.Missoes.Model.MissionModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity transforma uma classe em uma entidade do banco de dados
// JPA = Java Persistence API
@Entity
@Data
@Table(name = "tb_ninjas")
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private  int age;

    @ManyToOne // Um ninja tem uma única missão
    @JoinColumn(name = "missoes_id") // Foreing Key
    private MissionModel mission;

}

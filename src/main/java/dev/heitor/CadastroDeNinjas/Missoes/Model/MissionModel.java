package dev.heitor.CadastroDeNinjas.Missoes.Model;

import dev.heitor.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mission;
    private String rank;

    @OneToMany(mappedBy = "mission") // Uma missão pode ter vários ninjas
    private List<NinjaModel> ninja;

}

package dev.heitor.CadastroDeNinjas.Missoes;

import dev.heitor.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mission;
    private String rank;

    @OneToMany(mappedBy = "mission") // Uma missão pode ter vários ninjas
    private List<NinjaModel> ninja;

    public MissoesModel() {

    }

    public MissoesModel(Long id, String mission, String rank) {
        this.id = id;
        this.mission = mission;
        this.rank = rank;
    }

    public Long getId() {
        return id;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}

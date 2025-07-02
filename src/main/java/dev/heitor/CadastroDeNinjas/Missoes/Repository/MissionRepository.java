package dev.heitor.CadastroDeNinjas.Missoes.Repository;

import dev.heitor.CadastroDeNinjas.Missoes.MissionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissionRepository extends JpaRepository<MissionModel, Long> {
}

package dev.heitor.CadastroDeNinjas.Missoes.Repository;

import dev.heitor.CadastroDeNinjas.Missoes.Model.MissionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MissionRepository extends JpaRepository<MissionModel, Long> {
}

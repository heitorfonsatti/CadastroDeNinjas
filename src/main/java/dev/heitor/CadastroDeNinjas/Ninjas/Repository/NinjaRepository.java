package dev.heitor.CadastroDeNinjas.Ninjas.Repository;

import dev.heitor.CadastroDeNinjas.Ninjas.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
}

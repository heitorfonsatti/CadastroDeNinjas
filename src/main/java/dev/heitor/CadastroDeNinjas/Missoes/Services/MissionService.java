package dev.heitor.CadastroDeNinjas.Missoes.Services;

import dev.heitor.CadastroDeNinjas.Missoes.DTO.MissionRequestDTO;
import dev.heitor.CadastroDeNinjas.Missoes.DTO.MissionResponseDTO;
import dev.heitor.CadastroDeNinjas.Missoes.MissionModel;
import dev.heitor.CadastroDeNinjas.Missoes.Repository.MissionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MissionService {

    private final MissionRepository missionRepository;


    public MissionResponseDTO create(MissionRequestDTO dto) {
        MissionModel model = new MissionModel();
        model.setMission(dto.getMission());
        model.setRank(dto.getRank());

        MissionModel save = missionRepository.save(model);

        MissionResponseDTO response = new MissionResponseDTO();
        response.setId(save.getId());
        response.setMission(save.getMission());
        response.setRank(save.getRank());

        return response;
    }

    public List<MissionResponseDTO> listAll() {
        return missionRepository.findAll().stream().map(m -> {
            MissionResponseDTO dto = new MissionResponseDTO();
            dto.setId(m.getId());
            dto.setMission(m.getMission());
            dto.setRank(m.getRank());

            return dto;
        }).toList();
    }

    public MissionModel findById(Long id) {
        return missionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Missão não encontrada"));
    }

}

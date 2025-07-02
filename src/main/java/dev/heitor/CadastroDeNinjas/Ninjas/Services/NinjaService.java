package dev.heitor.CadastroDeNinjas.Ninjas.Services;

import dev.heitor.CadastroDeNinjas.Missoes.Model.MissionModel;
import dev.heitor.CadastroDeNinjas.Missoes.Services.MissionService;
import dev.heitor.CadastroDeNinjas.Ninjas.DTO.NinjaRequestDTO;
import dev.heitor.CadastroDeNinjas.Ninjas.DTO.NinjaResponseDTO;
import dev.heitor.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import dev.heitor.CadastroDeNinjas.Ninjas.Repository.NinjaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NinjaService {

    private final NinjaRepository ninjaRepository;
    private final MissionService missionService;

    public NinjaResponseDTO create(NinjaRequestDTO dto) {
        MissionModel mission = missionService.findById(dto.getId());

        NinjaModel ninja = new NinjaModel();
        ninja.setName(dto.getName());
        ninja.setEmail(dto.getEmail());
        ninja.setAge(dto.getAge());
        ninja.setMission(mission);

        NinjaModel save = ninjaRepository.save(ninja);

        NinjaResponseDTO response = new NinjaResponseDTO();
        response.setId((save.getId()));
        response.setName(save.getName());
        response.setEmail(save.getEmail());
        response.setAge(save.getAge());
        response.setMissionName(save.getMission().getMission());

        return response;
    }

    public List<NinjaResponseDTO> listAll() {
        return ninjaRepository.findAll().stream().map(n ->{
            NinjaResponseDTO dto = new NinjaResponseDTO();
            dto.setId(n.getId());
            dto.setName(n.getName());
            dto.setEmail(n.getEmail());
            dto.setAge(n.getAge());
            dto.setMissionName(n.getMission().getMission());

            return dto;
        }).toList();
    }

}

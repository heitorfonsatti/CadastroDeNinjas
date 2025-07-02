package dev.heitor.CadastroDeNinjas.Missoes.Controller;

import dev.heitor.CadastroDeNinjas.Missoes.DTO.MissionRequestDTO;
import dev.heitor.CadastroDeNinjas.Missoes.DTO.MissionResponseDTO;
import dev.heitor.CadastroDeNinjas.Missoes.Services.MissionService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mission")
@AllArgsConstructor
public class MissionController {

    private final MissionService missionService;

    @PostMapping
    public ResponseEntity<MissionResponseDTO> create(@RequestBody MissionRequestDTO dto) {
        MissionResponseDTO response = missionService.create(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public List<MissionResponseDTO> listAll() {
        return missionService.listAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<MissionResponseDTO> update(@PathVariable Long id, @RequestBody MissionRequestDTO dto) {
        MissionResponseDTO response = missionService.update(id, dto);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        missionService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

package dev.heitor.CadastroDeNinjas.Ninjas.Controller;

import dev.heitor.CadastroDeNinjas.Ninjas.DTO.NinjaRequestDTO;
import dev.heitor.CadastroDeNinjas.Ninjas.DTO.NinjaResponseDTO;
import dev.heitor.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import dev.heitor.CadastroDeNinjas.Ninjas.Repository.NinjaRepository;
import dev.heitor.CadastroDeNinjas.Ninjas.Services.NinjaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
@AllArgsConstructor
public class NinjaController {

    private final NinjaService ninjaService;

    @PostMapping
    public ResponseEntity<NinjaResponseDTO> create(@RequestBody NinjaRequestDTO dto) {
        NinjaResponseDTO response = ninjaService.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public List<NinjaResponseDTO> listAll() {
        return ninjaService.listAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<NinjaResponseDTO> update(@PathVariable Long id, @RequestBody NinjaRequestDTO dto) {
        NinjaResponseDTO response = ninjaService.update(id, dto);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        ninjaService.delete(id);
        return ResponseEntity.noContent().build();
    }

}

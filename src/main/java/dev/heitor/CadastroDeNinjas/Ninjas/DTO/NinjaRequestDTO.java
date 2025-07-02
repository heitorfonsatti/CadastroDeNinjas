package dev.heitor.CadastroDeNinjas.Ninjas.DTO;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;

@Data
public class NinjaRequestDTO {

    private String name;
    private String email;
    private int age;
    private Long missionId;
}

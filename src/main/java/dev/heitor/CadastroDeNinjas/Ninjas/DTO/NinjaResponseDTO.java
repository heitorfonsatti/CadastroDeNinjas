package dev.heitor.CadastroDeNinjas.Ninjas.DTO;

import lombok.Data;

@Data
public class NinjaResponseDTO {

    private Long id;
    private String name;
    private String email;
    private int age;
    private String missionName;
}

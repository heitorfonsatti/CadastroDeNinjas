package dev.heitor.CadastroDeNinjas.Ninjas.DTO;

import lombok.Data;

@Data
public class NinjaRequestDTO {

    private String name;
    private String email;
    private int age;
    private Long missionId;
}

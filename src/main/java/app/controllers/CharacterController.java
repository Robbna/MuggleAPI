package app.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import app.model.CharacterDTO;
import app.services.JsonService;

@RestController
public class CharacterController extends BaseController {

    private JsonService<CharacterDTO> service;

    public CharacterController() {
        service = new JsonService<CharacterDTO>();
    }

    @GetMapping("/characters")
    public List<CharacterDTO> getCharacterList() {
        return service.getList("characters.json", CharacterDTO.class);
    }
}

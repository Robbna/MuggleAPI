package app.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import app.model.SpellDTO;
import app.services.JsonService;

@RestController
public class SpellController extends BaseController {

    private JsonService<SpellDTO> service;

    public SpellController() {
        service = new JsonService<SpellDTO>();
    }

    @GetMapping("/spells")
    public List<SpellDTO> getSpellList() {
        return service.getList("spells.json", SpellDTO.class);
    }
}

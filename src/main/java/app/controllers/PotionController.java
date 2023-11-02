package app.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import app.model.PotionDTO;
import app.services.JsonService;

@RestController
public class PotionController extends BaseController {

    private JsonService<PotionDTO> service;

    public PotionController() {
        service = new JsonService<PotionDTO>();
    }

    @GetMapping("/potions")
    public List<PotionDTO> getPotionList() {
        return service.getList("potions.json", PotionDTO.class);
    }
}

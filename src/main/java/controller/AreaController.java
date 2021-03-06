package controller;

import entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.AreaService;

/**
 * Created by eugen on 4/7/17.
 */
@Controller
@RequestMapping("/area")
public class AreaController {

    @Autowired
    AreaService areaService;

    @GetMapping
    public String getAreas(Model model) {
        model.addAttribute("areas", areaService.findAll());
        return "areas"; // /jsp/areas.jsp
    }

    @GetMapping("/{id}")
    public String getArea(Model model, @PathVariable Integer id){
        model.addAttribute("area",areaService.findById(id));
        return "area";
    }

    @GetMapping("/new")
    public String newArea() {
        return "newArea";
    }

    @PostMapping
    public String createArea(Area area) {
        areaService.save(area);
        return "redirect:/area";
    }

    @GetMapping("/delete/{id}")
    public String deleteArea(@PathVariable Integer id){
        areaService.delete(id);
        return "redirect:/area";
    }
}

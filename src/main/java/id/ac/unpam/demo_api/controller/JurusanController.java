package id.ac.unpam.demo_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import id.ac.unpam.demo_api.model.Jurusan;
import id.ac.unpam.demo_api.service.JurusanService;

@RestController
@RequestMapping("/api/jurusan")
public class JurusanController {
    @Autowired
    private JurusanService jurusanService;

    @GetMapping
    public List<Jurusan> getAllJurusan() {
        return jurusanService.getAllJurusan();
    }

    @GetMapping("/{id}")
    public Jurusan getJurusanById(@PathVariable int id) {
        return jurusanService.getJurusanById(id);
    }

    @PostMapping
    public Jurusan createJurusan(@RequestBody Jurusan jurusan) {
        return jurusanService.saveJurusan(jurusan);
    }

    @PutMapping("/{id}")
    public Jurusan updateJurusan(@PathVariable int id, @RequestBody Jurusan jurusan) {
        jurusan.setId(id);
        return jurusanService.saveJurusan(jurusan);
    }

    @DeleteMapping("/{id}")
    public void deleteJurusan(@PathVariable int id) {
        jurusanService.deleteJurusan(id);
    }
}

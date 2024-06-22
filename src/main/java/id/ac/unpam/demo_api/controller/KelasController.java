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

import id.ac.unpam.demo_api.model.Kelas;
import id.ac.unpam.demo_api.service.KelasService;

@RestController
@RequestMapping("/api/kelas")
public class KelasController {
    @Autowired
    private KelasService kelasService;

    @GetMapping
    public List<Kelas> getAllKelas() {
        return kelasService.getAllKelas();
    }

    @GetMapping("/{id}")
    public Kelas getKelasById(@PathVariable int id) {
        return kelasService.getKelasById(id);
    }

    @PostMapping
    public Kelas createKelas(@RequestBody Kelas kelas) {
        return kelasService.saveKelas(kelas);
    }

    @PutMapping("/{id}")
    public Kelas updateKelas(@PathVariable int id, @RequestBody Kelas kelas) {
        kelas.setId(id);
        return kelasService.saveKelas(kelas);
    }

    @DeleteMapping("/{id}")
    public void deleteKelas(@PathVariable int id) {
        kelasService.deleteKelas(id);
    }
}

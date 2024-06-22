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

import id.ac.unpam.demo_api.model.WaliKelas;
import id.ac.unpam.demo_api.service.WaliKelasService;

@RestController
@RequestMapping("/api/wali-kelas")
public class WaliKelasController {
    @Autowired
    private WaliKelasService waliKelasService;

    @GetMapping
    public List<WaliKelas> getAllWaliKelas() {
        return waliKelasService.getAllWaliKelas();
    }

    @GetMapping("/{id}")
    public WaliKelas getWaliKelasById(@PathVariable int id) {
        return waliKelasService.getWaliKelasById(id);
    }

    @PostMapping
    public WaliKelas createWaliKelas(@RequestBody WaliKelas waliKelas) {
        return waliKelasService.saveWaliKelas(waliKelas);
    }

    @PutMapping("/{id}")
    public WaliKelas updateWaliKelas(@PathVariable int id, @RequestBody WaliKelas waliKelas) {
        waliKelas.setId(id);
        return waliKelasService.saveWaliKelas(waliKelas);
    }

    @DeleteMapping("/{id}")
    public void deleteWaliKelas(@PathVariable int id) {
        waliKelasService.deleteWaliKelas(id);
    }
}

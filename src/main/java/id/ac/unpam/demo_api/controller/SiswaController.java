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

import id.ac.unpam.demo_api.model.Siswa;
import id.ac.unpam.demo_api.service.SiswaService;

@RestController
@RequestMapping("/api/siswa")
public class SiswaController {
    @Autowired
    private SiswaService siswaService;

    @GetMapping
    public List<Siswa> getAllSiswa() {
        return siswaService.getAllSiswa();
    }

    @GetMapping("/{id}")
    public Siswa getSiswaById(@PathVariable int id) {
        return siswaService.getSiswaById(id);
    }

    @PostMapping
    public Siswa createSiswa(@RequestBody Siswa siswa) {
        return siswaService.saveSiswa(siswa);
    }

    @PutMapping("/{id}")
    public Siswa updateSiswa(@PathVariable int id, @RequestBody Siswa siswa) {
        siswa.setId(id);
        return siswaService.saveSiswa(siswa);
    }

    @DeleteMapping("/{id}")
    public void deleteSiswa(@PathVariable int id) {
        siswaService.deleteSiswa(id);
    }
}

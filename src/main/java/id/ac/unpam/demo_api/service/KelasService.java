package id.ac.unpam.demo_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.ac.unpam.demo_api.model.Kelas;
import id.ac.unpam.demo_api.repositories.KelasRepository;

@Service
public class KelasService {
    @Autowired
    private KelasRepository kelasRepository;

    public List<Kelas> getAllKelas() {
        return kelasRepository.findAll();
    }

    public Kelas getKelasById(int id) {
        return kelasRepository.findById(id).orElse(null);
    }

    public Kelas saveKelas(Kelas kelas) {
        return kelasRepository.save(kelas);
    }

    public void deleteKelas(int id) {
        kelasRepository.deleteById(id);
    }
}

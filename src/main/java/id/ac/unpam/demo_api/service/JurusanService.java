package id.ac.unpam.demo_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.ac.unpam.demo_api.model.Jurusan;
import id.ac.unpam.demo_api.repositories.JurusanRepository;

@Service
public class JurusanService {
    @Autowired
    private JurusanRepository jurusanRepository;

    public List<Jurusan> getAllJurusan() {
        return jurusanRepository.findAll();
    }

    public Jurusan getJurusanById(int id) {
        return jurusanRepository.findById(id).orElse(null);
    }

    public Jurusan saveJurusan(Jurusan jurusan) {
        return jurusanRepository.save(jurusan);
    }

    public void deleteJurusan(int id) {
        jurusanRepository.deleteById(id);
    }
}

package id.ac.unpam.demo_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.ac.unpam.demo_api.model.Siswa;
import id.ac.unpam.demo_api.repositories.SiswaRepository;

@Service
public class SiswaService {
    @Autowired
    private SiswaRepository siswaRepository;

    public List<Siswa> getAllSiswa() {
        return siswaRepository.findAll();
    }

    public Siswa getSiswaById(int id) {
        return siswaRepository.findById(id).orElse(null);
    }

    public Siswa saveSiswa(Siswa siswa) {
        return siswaRepository.save(siswa);
    }

    public void deleteSiswa(int id) {
        siswaRepository.deleteById(id);
    }
}

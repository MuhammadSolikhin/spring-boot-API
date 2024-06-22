package id.ac.unpam.demo_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.ac.unpam.demo_api.model.WaliKelas;
import id.ac.unpam.demo_api.repositories.WaliKelasRepository;

@Service
public class WaliKelasService {
    @Autowired
    private WaliKelasRepository waliKelasRepository;

    public List<WaliKelas> getAllWaliKelas() {
        return waliKelasRepository.findAll();
    }

    public WaliKelas getWaliKelasById(int id) {
        return waliKelasRepository.findById(id).orElse(null);
    }

    public WaliKelas saveWaliKelas(WaliKelas waliKelas) {
        return waliKelasRepository.save(waliKelas);
    }

    public void deleteWaliKelas(int id) {
        waliKelasRepository.deleteById(id);
    }
}

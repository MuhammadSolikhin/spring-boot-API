package id.ac.unpam.demo_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import id.ac.unpam.demo_api.model.Siswa;

public interface SiswaRepository extends JpaRepository<Siswa, Integer> {
    
}

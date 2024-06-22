package id.ac.unpam.demo_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import id.ac.unpam.demo_api.model.Kelas;

public interface KelasRepository extends JpaRepository<Kelas, Integer> {
    
}

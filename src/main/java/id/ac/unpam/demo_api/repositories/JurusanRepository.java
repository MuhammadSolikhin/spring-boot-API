package id.ac.unpam.demo_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import id.ac.unpam.demo_api.model.Jurusan;

public interface JurusanRepository extends JpaRepository<Jurusan, Integer> {
}

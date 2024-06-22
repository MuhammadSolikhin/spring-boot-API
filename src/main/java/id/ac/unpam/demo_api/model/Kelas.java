package id.ac.unpam.demo_api.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import jakarta.persistence.OneToMany;

@Data
@Entity
@Table(name = "kelas")
public class Kelas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(length = 11, nullable = false)
    @NotNull
    @NotEmpty
    private String kodeKelas;

    @Column(length = 30, nullable = false)
    @NotNull
    @NotEmpty
    private String namaKelas;

    @Column(length = 11, nullable = false)
    @NotNull
    @NotEmpty
    private String kodeWali;

    @Column(length = 11, nullable = false)
    @NotNull
    @NotEmpty
    private String kodeJurusan;

    @OneToMany(mappedBy = "kelas")
    private List<Siswa> siswaList;
}

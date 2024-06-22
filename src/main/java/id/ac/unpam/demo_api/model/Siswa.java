package id.ac.unpam.demo_api.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "siswa")
public class Siswa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(length = 15, nullable = false)
    @NotNull
    @NotEmpty
    private String nis;

    @Column(length = 10, nullable = false)
    @NotNull
    @NotEmpty
    private int idTahunAjar;

    @Column(length = 45, nullable = false)
    @NotNull
    @NotEmpty
    private String password;

    @Column(length = 10, nullable = false)
    @NotNull
    @NotEmpty
    private String status;

    @Column(length = 10, nullable = false)
    @NotNull
    @NotEmpty
    private Date tanggalLahir;

    @Lob
    @Column(nullable = false)
    @NotNull
    @NotEmpty
    private String alamat;

    @Column(length = 15, nullable = false)
    @NotNull
    @NotEmpty
    private String jenisKelamin;

    @Column(length = 15, nullable = false)
    @NotNull
    @NotEmpty
    private String agama;

    @ManyToOne
    @JoinColumn(name = "id_kelas")
    private Kelas kelas;

}

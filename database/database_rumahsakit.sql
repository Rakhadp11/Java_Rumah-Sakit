-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 28 Jun 2022 pada 14.19
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `database_rumahsakit`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `datarawatinap`
--

CREATE TABLE `datarawatinap` (
  `nama` varchar(30) NOT NULL,
  `jenis_kelamin` enum('laki-laki','perempuan') NOT NULL,
  `tempat_lahir` varchar(30) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `no_hp` int(20) NOT NULL,
  `alamat` varchar(1000) NOT NULL,
  `pilih_status_pasien` enum('PASIEN ASURANSI','PASIEN UMUM','PASIEN BPJS') NOT NULL,
  `pilih_ruang_kamar` enum('VIP 1(Kipas Angin dan TV)','VIP 2(AC dan TV)','VIP 3(AC, TV, dan Sofa)','Umum 1(Kipas Angin dan TV)','Umum 2(AC dan TV)') NOT NULL,
  `pilih_dokter_perawat` enum('dr. Budi Herdansyah','dr. Selly Wijaksana','dr. Anies Simatupang','dr. Triana Apriani') NOT NULL,
  `pilih_durasi_rawat_inap` enum('LEBIH DARI 1 HARI','LEBIH DARI 4 HAR','I LEBIH DARI 7 HARI') NOT NULL,
  `total_keseluruhan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `datarawatinap`
--

INSERT INTO `datarawatinap` (`nama`, `jenis_kelamin`, `tempat_lahir`, `tanggal_lahir`, `no_hp`, `alamat`, `pilih_status_pasien`, `pilih_ruang_kamar`, `pilih_dokter_perawat`, `pilih_durasi_rawat_inap`, `total_keseluruhan`) VALUES
('yayaya', 'perempuan', 'hayhah', '2022-06-04', 7887, 'xaaxa', 'PASIEN ASURANSI', 'VIP 2(AC dan TV)', 'dr. Selly Wijaksana', 'LEBIH DARI 1 HARI', '500000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `datarawatjalan`
--

CREATE TABLE `datarawatjalan` (
  `nama` varchar(30) NOT NULL,
  `jenis_kelamin` enum('laki-laki','perempuan') NOT NULL,
  `tempat_lahir` varchar(30) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `no_hp` int(11) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `pilih_status_pasien` enum('PASIEN ASURANSI','PASIEN UMUM','PASIEN BPJS') NOT NULL,
  `pilih_dokter` enum('dr. Budi Herdansyah','dr. Selly Wijaksana','dr. Anies Simatupang','dr. Triana Apriani') NOT NULL,
  `total_keseluruhan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `datarawatjalan`
--

INSERT INTO `datarawatjalan` (`nama`, `jenis_kelamin`, `tempat_lahir`, `tanggal_lahir`, `no_hp`, `alamat`, `pilih_status_pasien`, `pilih_dokter`, `total_keseluruhan`) VALUES
('hgsjhjka', 'laki-laki', 'gkjslkjsa', '2022-06-12', 5767878, 'ghjkll', 'PASIEN UMUM', 'dr. Budi Herdansyah', '400000.0'),
('dgjh', 'laki-laki', 'fhjjjjj', '2022-06-22', 57889, 'fghkjj', 'PASIEN ASURANSI', 'dr. Budi Herdansyah', '550000.0');

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_rekam_medis`
--

CREATE TABLE `detail_rekam_medis` (
  `no_rekam_medis` varchar(10) NOT NULL,
  `kode_obat` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `detail_rekam_medis`
--

INSERT INTO `detail_rekam_medis` (`no_rekam_medis`, `kode_obat`) VALUES
('NRM001', 'OB001'),
('NRM002', 'OB002'),
('NRM003', 'OB003'),
('NRM004', 'OB004'),
('NRM005', 'OB005');

-- --------------------------------------------------------

--
-- Struktur dari tabel `dokter`
--

CREATE TABLE `dokter` (
  `id_dokter` varchar(10) NOT NULL,
  `nama_dokter` varchar(30) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `tempat_lahir` varchar(30) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `jenis_kelamin` enum('laki-laki','perempuan') NOT NULL,
  `no_hp` varchar(15) NOT NULL,
  `spesialis` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `dokter`
--

INSERT INTO `dokter` (`id_dokter`, `nama_dokter`, `alamat`, `tempat_lahir`, `tanggal_lahir`, `jenis_kelamin`, `no_hp`, `spesialis`) VALUES
('d34', 'sadsf', 'dsfds', 'dsff', '2022-06-18', 'perempuan', '2444', 'sadfasf'),
('DO111', 'dr. Martina Yulianti', 'Jln. Leuwipanjang Kebonlega II Kompleks Muara Bandung', 'Surabaya', '1983-08-12', 'perempuan', '087612436589', 'PENYAKIT DALAM'),
('DO222', 'dr. Bernardus Dirgantoro', 'Jl. Cijawura Hilir No. 64 Bandung', 'Tangerang', '1979-12-09', 'laki-laki', '086745673409', '	OBGYN / OBSTETRI & GINEKOLOGI'),
('DO333', 'dr. Hendri Kustiyawan', 'Jl. Gedebage No.292, Cisaranten Kidul Bandung', 'Jakarta ', '1983-06-24', 'laki-laki', '089806021308', 'BEDAH ORTHOPEDI DAN TRAUMATOLO'),
('DO555', 'dr. Evi Mustikawati', 'Jl. Lombok No.6 Bandung', 'Surabaya', '1987-03-11', 'perempuan', '086500981254', 'KULIT DAN KELAMIN');

-- --------------------------------------------------------

--
-- Struktur dari tabel `obat`
--

CREATE TABLE `obat` (
  `kode_obat` varchar(10) NOT NULL,
  `nama_obat` varchar(30) NOT NULL,
  `jenis_obat` varchar(30) NOT NULL,
  `dosis` varchar(100) NOT NULL,
  `harga` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `obat`
--

INSERT INTO `obat` (`kode_obat`, `nama_obat`, `jenis_obat`, `dosis`, `harga`) VALUES
('OB001', 'Paramol', 'PARACETAMOL', '3-4 kali sehari', 'Rp 4000'),
('OB002', 'Butorphanol', 'PEREDA NYERI GOL OPIOID', '1–2 mg (1 semprotan dalam 1 lubang hidung) saat merasakan nyeri, dapat diulang setelah 3–4 jam jika ', 'Rp 25000'),
('OB003', 'Cefditoren ', 'ANTIBIOTIK', '2 kali sehari selama 14 hari', 'Rp 35000'),
('OB004', 'Doxycycline ', 'ANTIBIOTIK ', '100–300 mg per hari, selama 7–10 hari.', 'Rp 20000'),
('OB005', 'Sulfanilamide', 'ANTI JAMUR', '2 kali sehari, selama 7 hari.', 'RP 17000'),
('rdr', 'hffh', 'ghgh', '4', '44');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pasien`
--

CREATE TABLE `pasien` (
  `no_pasien` bigint(10) NOT NULL,
  `nama_pasien` varchar(30) NOT NULL,
  `jenis_kelamin` enum('laki-laki','perempuan') NOT NULL,
  `tempat_lahir` varchar(30) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `no_hp` varchar(15) NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pasien`
--

INSERT INTO `pasien` (`no_pasien`, `nama_pasien`, `jenis_kelamin`, `tempat_lahir`, `tanggal_lahir`, `no_hp`, `alamat`) VALUES
(111, 'Diki Ermawan', 'laki-laki', 'Bandung', '2002-07-16', '085643239076', '	Jl. Srigunting Raya No.1 Bandung'),
(122, 'sdd', 'laki-laki', 'sdd', '2022-06-23', '122', 'sss'),
(222, 'Raisa Agustina', 'perempuan', 'Jakarta Selatan', '1997-08-07', '087654376589', '	Jl. Taman Sari No.49 Jakarta selatan'),
(333, 'Devitri Regita Cahyani', 'perempuan', 'Surabaya', '1994-09-14', '087623987623', 'Kapas Krampung gg Buntu H Rt 02/Rw 01, Tambak rejo , Simokerto'),
(444, 'Saputra Prasetyo', 'laki-laki', 'Bandung', '1992-06-07', '087645789867', 'Jl.Simo Pomahan BaruGg.12 no.6A Bandung'),
(555, 'Riza Mustika', 'perempuan', 'Bandung', '2004-05-12', '087954321265', 'Jl.Tenggumung Baru no.167E Bandung'),
(656, 'ftgf', 'laki-laki', 'fgfgf', '2022-06-03', '777', 'hyh');

-- --------------------------------------------------------

--
-- Struktur dari tabel `perawat`
--

CREATE TABLE `perawat` (
  `id_perawat` varchar(10) NOT NULL,
  `nama_perawat` varchar(30) NOT NULL,
  `tempat_lahir` varchar(20) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `jenis_kelamin` enum('laki-laki','perempuan') NOT NULL,
  `no_hp` varchar(15) NOT NULL,
  `alamat` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `perawat`
--

INSERT INTO `perawat` (`id_perawat`, `nama_perawat`, `tempat_lahir`, `tanggal_lahir`, `jenis_kelamin`, `no_hp`, `alamat`) VALUES
('PR001', 'Mirna Lidyana', 'Surabaya', '1998-06-25', 'perempuan', '087865002122', 'Jl. Jendral A.H. Nasution No. 82 Bandung'),
('PR002', 'Richa Eviyana', 'Lampung', '1995-02-21', 'perempuan', '089056550098', 'Jl. Manisi No. 13 Bandung'),
('PR003', 'Noky Andreas', 'Aceh', '1992-04-22', 'laki-laki', '087000339878', 'Jl. KH. Wahid Hasyim No. 258 Bandung'),
('PR004', 'Lisa Efiana', 'Bekasi', '1990-02-12', 'perempuan', '089909878967', 'Jl. A H Nasution No. 14 Bandung'),
('PR005', 'Ilham Fah', 'Bandung', '1993-08-19', 'laki-laki', '089000776756', 'Jl. KH. Wahid Hasyim No. 258 Bandung');

-- --------------------------------------------------------

--
-- Struktur dari tabel `rekam_medis`
--

CREATE TABLE `rekam_medis` (
  `no_rekam_medis` varchar(10) NOT NULL,
  `no_pasien` bigint(10) NOT NULL,
  `id_dokter` varchar(10) NOT NULL,
  `id_perawat` varchar(10) NOT NULL,
  `kode_ruangan` varchar(10) NOT NULL,
  `keluhan` varchar(1000) NOT NULL,
  `nama_penyakit` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `rekam_medis`
--

INSERT INTO `rekam_medis` (`no_rekam_medis`, `no_pasien`, `id_dokter`, `id_perawat`, `kode_ruangan`, `keluhan`, `nama_penyakit`) VALUES
('NRM001', 111, 'DO111', 'PR001', 'KR001', 'hidung tersumbatt', 'Pilek'),
('NRM002', 222, 'DO222', 'PR002', 'KR002', 'Sesak Nafas', 'Asma'),
('NRM003', 333, 'DO333', 'PR003', 'KR003', 'Nyeri di bagian dada kiri', 'Serangan Jantung'),
('NRM004', 444, 'DO444', 'PR004', 'KR004', 'Sakit di perut bagian kanan dan kiri', 'Gagal ginjal');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ruangan`
--

CREATE TABLE `ruangan` (
  `kode_ruangan` varchar(10) NOT NULL,
  `nama_ruangan` varchar(30) NOT NULL,
  `kapasitas` varchar(30) NOT NULL,
  `fasilitas` varchar(200) NOT NULL,
  `jenis_kamar` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `ruangan`
--

INSERT INTO `ruangan` (`kode_ruangan`, `nama_ruangan`, `kapasitas`, `fasilitas`, `jenis_kamar`) VALUES
('KR001', 'Jenderal Soedirman', '2', 'Kipas Angin dan TV', 'VIP 1'),
('KR002', 'Pangeran Diponegoro', '3', 'AC dan Tv', 'VIP 2'),
('KR003', 'Kartini', '2', 'AC, TV, Sofa', 'VIP 3'),
('KR004', 'Pangeran Diponegoro', '4', 'Kipas Angin dan TV', 'Umum 1'),
('KR005', 'Cut Nyak Dien', '4', 'Ac dan TV', 'Umum 2');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `dokter`
--
ALTER TABLE `dokter`
  ADD PRIMARY KEY (`id_dokter`);

--
-- Indeks untuk tabel `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`kode_obat`);

--
-- Indeks untuk tabel `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`no_pasien`);

--
-- Indeks untuk tabel `perawat`
--
ALTER TABLE `perawat`
  ADD PRIMARY KEY (`id_perawat`);

--
-- Indeks untuk tabel `rekam_medis`
--
ALTER TABLE `rekam_medis`
  ADD PRIMARY KEY (`no_rekam_medis`);

--
-- Indeks untuk tabel `ruangan`
--
ALTER TABLE `ruangan`
  ADD PRIMARY KEY (`kode_ruangan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

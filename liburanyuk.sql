-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 30 Jul 2019 pada 11.48
-- Versi server: 10.1.39-MariaDB
-- Versi PHP: 7.3.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `liburanyuk`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_tempatentertaiment`
--

CREATE TABLE `t_tempatentertaiment` (
  `id_enterteiment` int(11) NOT NULL,
  `nama_tempatenter` varchar(50) NOT NULL,
  `daerahenter` varchar(50) NOT NULL,
  `photo` text NOT NULL,
  `deskripsi` text NOT NULL,
  `penilaian` int(11) NOT NULL,
  `jam` varchar(20) NOT NULL,
  `id_liburan` int(11) DEFAULT NULL,
  `id_budaya` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `t_tempatentertaiment`
--

INSERT INTO `t_tempatentertaiment` (`id_enterteiment`, `nama_tempatenter`, `daerahenter`, `photo`, `deskripsi`, `penilaian`, `jam`, `id_liburan`, `id_budaya`) VALUES
(1, 'Dufan', 'Jakarta', 'https://img.beritasatu.com/cache/beritasatu/600x350-2/1556286735.jpg', 'Dunia Fantasi atau disebut juga Dufan yang diresmi', 8, 'buka setiap hari', 1, 1),
(2, 'Braga City Walk', 'Bandung', 'https://tempatwisatadibandung.info/wp-content/uploads/2016/04/Braga-City-Walk-Bandung.jpg', 'Braga city walk adalah tempat hiburan di bandung y', 8, 'buka setiap hari', 2, 7),
(3, 'Ocean Park BSD', 'Tanggerang', 'https://www.jejakpiknik.com/wp-content/uploads/2018/06/24-kolam-arus-ocean-park-serpong-630x380.jpg', 'Pusat akuatik yang memiliki berbagai seluncur air,', 7, 'setiap hari  jam 7 ', 4, 8),
(4, 'Dufan', 'Jakarta', 'https://img.beritasatu.com/cache/beritasatu/600x350-2/1556286735.jpg', 'Dunia Fantasi atau disebut juga Dufan yang diresmi', 8, 'buka setiap hari', 5, NULL),
(5, 'Braga City Walk', 'Bandung', 'https://tempatwisatadibandung.info/wp-content/uploads/2016/04/Braga-City-Walk-Bandung.jpg', 'Braga city walk adalah tempat hiburan di bandung y', 8, 'buka setiap hari', 6, NULL),
(6, 'Ocean Park BSD', 'Tanggerang', 'https://www.jejakpiknik.com/wp-content/uploads/2018/06/24-kolam-arus-ocean-park-serpong-630x380.jpg', 'Pusat akuatik yang memiliki berbagai seluncur air,', 7, 'setiap hari  jam 7 ', 7, NULL),
(7, '', '', '', '', 0, '', 8, NULL);

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_tempatliburan`
--

CREATE TABLE `t_tempatliburan` (
  `id_liburan` int(11) NOT NULL,
  `nama_tempat` varchar(30) NOT NULL,
  `daerah` varchar(30) NOT NULL,
  `photo` text NOT NULL,
  `deskripsi` varchar(200) NOT NULL,
  `penilaian` int(11) NOT NULL,
  `jam` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `t_tempatliburan`
--

INSERT INTO `t_tempatliburan` (`id_liburan`, `nama_tempat`, `daerah`, `photo`, `deskripsi`, `penilaian`, `jam`) VALUES
(1, 'taman vanda', 'bandung', 'https://upload.wikimedia.org/wikipedia/commons/e/e7/Bandung_coa.png', 'aku suka taman vanda', 8, '7-10'),
(2, 'taman film', 'banten', 'https://images.unsplash.com/photo-1544644181-1484b3fdfc62?ixlib=rb-1.2.1&auto=format&fit=crop&w=1500&q=80', 'akusyang kamu', 9, '10'),
(4, 'Pantai Pandawa', 'Bali', 'https://unsplash.com/photos/7-eWpXR3Mik', 'Pantai Pandawa adalah salah satu kawasan wisata di area Kuta selatan, Kabupaten Badung, Bali. Pantai ini terletak di balik perbukitan dan sering disebut sebagai Pantai Rahasia (Secret Beach). Di sekit', 9, 'setiap hari buka'),
(5, 'Pantai Tanjung Lesung', 'Banten', 'https://unsplash.com/photos/KlhfsBVYK-Y', 'Pantai Tanjung Lesung adalah pantai di Kabupaten Pandeglang, Banten, ujung barat Jawa. Berjarak 160 kilometer dari ibu kota Indonesia, Jakarta, dan dapat dicapai dengan mobil atau bus umum dalam waktu', 8, 'setiap hari'),
(6, 'Tangkuban Perahu', 'Bandung', 'https://unsplash.com/photos/0O1XtuYiCOk', 'Tangkuban Parahu atau Gunung Tangkuban Perahu adalah salah satu gunung yang terletak di Provinsi Jawa Barat, Indonesia. Sekitar 20 km ke arah utara Kota Bandung, dengan rimbun pohon pinus dan hamparan', 8, 'setiap hari buka'),
(7, 'Taman Hutan Raya Ir,h,djuanda', 'Bandung', 'https://unsplash.com/photos/EHkPaxA0hAk', 'Taman Hutan Raya Ir. H. Djuanda merupakan kawasan konservasi yang terpadu antara alam sekunder dengan hutan tanaman yang terletak di Kota Bandung, Indonesia. Luasnya mencapai 590 hektare membentang da', 9, 'buka setiap hari'),
(8, 'Pantai Pandawa', 'Bali', 'https://unsplash.com/photos/7-eWpXR3Mik', 'Pantai Pandawa adalah salah satu kawasan wisata di area Kuta selatan, Kabupaten Badung, Bali. Pantai ini terletak di balik perbukitan dan sering disebut sebagai Pantai Rahasia (Secret Beach). Di sekit', 9, 'setiap hari buka'),
(9, 'Pantai Tanjung Lesung', 'Banten', 'https://unsplash.com/photos/KlhfsBVYK-Y', 'Pantai Tanjung Lesung adalah pantai di Kabupaten Pandeglang, Banten, ujung barat Jawa. Berjarak 160 kilometer dari ibu kota Indonesia, Jakarta, dan dapat dicapai dengan mobil atau bus umum dalam waktu', 8, 'setiap hari'),
(10, 'Tangkuban Perahu', 'Bandung', 'https://unsplash.com/photos/0O1XtuYiCOk', 'Tangkuban Parahu atau Gunung Tangkuban Perahu adalah salah satu gunung yang terletak di Provinsi Jawa Barat, Indonesia. Sekitar 20 km ke arah utara Kota Bandung, dengan rimbun pohon pinus dan hamparan', 8, 'setiap hari buka'),
(11, 'Taman Hutan Raya Ir,h,djuanda', 'Bandung', 'https://unsplash.com/photos/EHkPaxA0hAk', 'Taman Hutan Raya Ir. H. Djuanda merupakan kawasan konservasi yang terpadu antara alam sekunder dengan hutan tanaman yang terletak di Kota Bandung, Indonesia. Luasnya mencapai 590 hektare membentang da', 9, 'buka setiap hari');

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_tempat_budaya`
--

CREATE TABLE `t_tempat_budaya` (
  `id_budaya` int(11) NOT NULL,
  `nama_tempat` varchar(50) DEFAULT NULL,
  `daerah` varchar(50) DEFAULT NULL,
  `photo` text,
  `deskripsi` text,
  `penilaian` int(11) DEFAULT NULL,
  `jam` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `t_tempat_budaya`
--

INSERT INTO `t_tempat_budaya` (`id_budaya`, `nama_tempat`, `daerah`, `photo`, `deskripsi`, `penilaian`, `jam`) VALUES
(1, 'Baduy', 'Rangkasbitung', 'https://media.travelingyuk.com/wp-content/uploads/2017/04/Rumah-rumah-Suku-Baduy-luar-e1492508657467.jpg     ', 'Urang Kanekes, Orang Kanekes atau Orang Baduy/Badui merupakan kelompok etnis masyarakat adat suku Banten di wilayah Kabupaten Lebak, Banten. Populasi mereka sekitar 26.000 orang, dan mereka merupakan salah satu suku yang mengisolasi diri mereka dari dunia luar. Selain itu mereka juga memiliki keyakinan tabu untuk didokumentasikan, khususnya penduduk wilayah Baduy Dalam.', 8, 'buka setiap hari'),
(7, 'Dayak', 'kalimantan', 'https://mmc.tirto.id/image/otf/500x0/2016/05/20/TIRTO-Donat-antarafoto-gawai-dayak-kalbar-200516-jhw-2_ratio-16x9.JPG', 'dalah nama yang oleh penjajah diberi kepada penghuni pedalaman pulau Borneo[14] yang mendiami Pulau Kalimantan (Brunei, Malaysia yang terdiri dari Sabah dan Sarawak, serta Indonesia yang terdiri dari Kalimantan Barat, Kalimantan Timur, Kalimantan Tengah, Kalimantan Utara, dan Kalimantan Selatan). ', 8, 'buka setiap hari'),
(8, 'Asmat', 'Papua', 'https://i1.wp.com/kembangwisata.com/wp-content/uploads/2016/08/suku-asmat-papua.jpg', 'Suku Asmat adalah sebuah suku di Papua. Suku Asmat dikenal dengan hasil ukiran kayunya yang unik. Populasi suku Asmat terbagi dua yaitu mereka yang tinggal di pesisir pantai dan mereka yang tinggal di bagian pedalaman. Kedua populasi ini saling berbeda satu sama lain dalam hal dialek, cara hidup, struktur sosial dan ritual. Populasi pesisir pantai selanjutnya terbagi ke dalam dua bagian yaitu suku Bisman yang berada di antara sungai Sinesty dan sungai Nin serta suku Simai.', 9, 'buka setiap hari');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `t_tempatentertaiment`
--
ALTER TABLE `t_tempatentertaiment`
  ADD PRIMARY KEY (`id_enterteiment`),
  ADD KEY `id_budaya` (`id_budaya`),
  ADD KEY `id_liburan` (`id_liburan`);

--
-- Indeks untuk tabel `t_tempatliburan`
--
ALTER TABLE `t_tempatliburan`
  ADD PRIMARY KEY (`id_liburan`);

--
-- Indeks untuk tabel `t_tempat_budaya`
--
ALTER TABLE `t_tempat_budaya`
  ADD PRIMARY KEY (`id_budaya`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `t_tempatentertaiment`
--
ALTER TABLE `t_tempatentertaiment`
  MODIFY `id_enterteiment` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT untuk tabel `t_tempatliburan`
--
ALTER TABLE `t_tempatliburan`
  MODIFY `id_liburan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT untuk tabel `t_tempat_budaya`
--
ALTER TABLE `t_tempat_budaya`
  MODIFY `id_budaya` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `t_tempatentertaiment`
--
ALTER TABLE `t_tempatentertaiment`
  ADD CONSTRAINT `t_tempatentertaiment_ibfk_3` FOREIGN KEY (`id_budaya`) REFERENCES `t_tempat_budaya` (`id_budaya`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `t_tempatentertaiment_ibfk_4` FOREIGN KEY (`id_liburan`) REFERENCES `t_tempatliburan` (`id_liburan`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

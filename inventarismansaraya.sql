-- phpMyAdmin SQL Dump
-- version 4.6.6deb5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Mar 31, 2019 at 11:43 AM
-- Server version: 5.7.25-0ubuntu0.18.04.2
-- PHP Version: 7.2.15-0ubuntu0.18.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventarismansaraya`
--
CREATE DATABASE IF NOT EXISTS `inventarismansaraya` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `inventarismansaraya`;

-- --------------------------------------------------------

--
-- Table structure for table `detailbarang`
--

CREATE TABLE `detailbarang` (
  `kode_barang` varchar(50) NOT NULL,
  `nama_barang` varchar(50) NOT NULL,
  `sfc` varchar(25) DEFAULT NULL,
  `jumlah` int(11) NOT NULL DEFAULT '1',
  `kondisi_b` smallint(6) NOT NULL DEFAULT '0',
  `kondisi_rr` smallint(6) NOT NULL DEFAULT '0',
  `kondisi_rb` smallint(6) NOT NULL DEFAULT '0',
  `kondisi_tt` smallint(6) NOT NULL DEFAULT '0',
  `tahun_pengadaan` smallint(6) NOT NULL,
  `keterangan` varchar(25) DEFAULT NULL,
  `ruanganfk` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `detailbarang`
--

INSERT INTO `detailbarang` (`kode_barang`, `nama_barang`, `sfc`, `jumlah`, `kondisi_b`, `kondisi_rr`, `kondisi_rb`, `kondisi_tt`, `tahun_pengadaan`, `keterangan`, `ruanganfk`) VALUES
('11', 'Sikat', '', 1, 1, 0, 0, 0, 11, '', '22'),
('11111', 'Sikat', '', 1, 1, 0, 0, 0, 3000, '', '22'),
('121', 'Balon', '', 1, 1, 0, 0, 0, 2010, '', '1'),
('12121212', 'Lemari', '', 1, 1, 0, 0, 0, 2009, '', '1'),
('1222', 'Pulpen', '', 1, 0, 1, 0, 0, 2010, '', '1'),
('12221121', 'Kulkas', '', 1, 1, 0, 0, 0, 2001, '', '1'),
('231', 'Buku', '', 1, 1, 0, 0, 0, 1, '', '1'),
('2311', 'Baju', '', 1, 0, 0, 1, 0, 312, '', '1'),
('2312', 'Kursi', '', 1, 1, 0, 0, 0, 123, '', '1'),
('23123123123', 'Laptop', '', 3123, 3123, 0, 0, 0, 31231, '', '1'),
('3', 'Mouse', '3', 1, 1, 0, 0, 0, 3, '', '1'),
('31', 'Keyboard', '123', 1, 1, 0, 0, 0, 123, '', '1'),
('3112', 'Korden', '', 1, 0, 1, 0, 0, 2011, '', '1'),
('31231', 'Printer', '', 1, 1, 0, 0, 0, 123, '', '1'),
('312311', 'Balon', '', 1, 1, 0, 0, 0, 11, '', '1');

-- --------------------------------------------------------

--
-- Table structure for table `gedung`
--

CREATE TABLE `gedung` (
  `kode_gedung` varchar(7) NOT NULL,
  `nama_gedung` varchar(25) NOT NULL,
  `keterangan` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `gedung`
--

INSERT INTO `gedung` (`kode_gedung`, `nama_gedung`, `keterangan`) VALUES
('GB1A', 'Bangunan 1A', 'Lantai Atas'),
('GB1B', 'Bangunan 1B', 'Lantai Bawah'),
('GB2', 'Bangunan 2', '1 Lantai'),
('GB3', 'Bangunan 3', '1 Lantai'),
('GB4', 'Bangunan 4', '1 Lantai'),
('GB5', 'Bangunan 5', '1 Lantai'),
('GB6', 'Bangunan 6', '1 Lantai'),
('GB7', 'Bangunan 7', '1 Lantai'),
('GB8', 'Bangunan 8', '1 Lantai'),
('GBU', 'Bangunan Umum', 'umum');

-- --------------------------------------------------------

--
-- Table structure for table `ruangan`
--

CREATE TABLE `ruangan` (
  `kode_ruangan` varchar(15) NOT NULL,
  `nama_ruangan` varchar(50) NOT NULL,
  `penanggung_jawab` varchar(35) NOT NULL,
  `gedungfk` varchar(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ruangan`
--

INSERT INTO `ruangan` (`kode_ruangan`, `nama_ruangan`, `penanggung_jawab`, `gedungfk`) VALUES
('1', 'R. LAB IPA', '', 'GB2'),
('2', 'R. Tata Usaha', 'Arfani Hidayat', 'GB1A'),
('22', 'R. Guru', 'Arfani Hidayat', 'GB1A'),
('5', 'R. Band Mansa', '-', 'GB1B'),
('R11122', 'R. Kelas XII IPA 1', '-', 'GB1B'),
('R1121', 'R. UKS', '-', 'GB1A'),
('R1212', 'R. Kelas XII IPA 2', '-', 'GB1B'),
('R2121', 'R. Lab Komputer', '-', 'GB1A'),
('R2312', 'R. Radio Mansa', '-', 'GB1A'),
('R23121', 'R. Kelas IPS 1', '-', 'GB1B'),
('R2321', 'R. Kelas XII Bahasa', '-', 'GB1B'),
('R23412', 'R. LAB Bahasa', '-', 'GB2'),
('R32312', 'R. Kelas IPA 3', '-', 'GB1B'),
('R4323', 'R. Kelas Agama', '-', 'GB1A');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` varchar(5) NOT NULL DEFAULT '',
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `username`, `password`) VALUES
('', 'arfan', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `detailbarang`
--
ALTER TABLE `detailbarang`
  ADD PRIMARY KEY (`kode_barang`),
  ADD KEY `ruangan` (`ruanganfk`);

--
-- Indexes for table `gedung`
--
ALTER TABLE `gedung`
  ADD PRIMARY KEY (`kode_gedung`);

--
-- Indexes for table `ruangan`
--
ALTER TABLE `ruangan`
  ADD PRIMARY KEY (`kode_ruangan`),
  ADD KEY `gedung` (`gedungfk`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detailbarang`
--
ALTER TABLE `detailbarang`
  ADD CONSTRAINT `ruangan` FOREIGN KEY (`ruanganfk`) REFERENCES `ruangan` (`kode_ruangan`);

--
-- Constraints for table `ruangan`
--
ALTER TABLE `ruangan`
  ADD CONSTRAINT `gedung` FOREIGN KEY (`gedungfk`) REFERENCES `gedung` (`kode_gedung`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 23, 2022 at 03:42 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `multibank`
--

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `userID` int(11) NOT NULL,
  `BankName` varchar(50) NOT NULL,
  `HolderName` varchar(50) NOT NULL,
  `AccNumber` int(50) NOT NULL,
  `Pin` int(50) NOT NULL,
  `BirthDate` varchar(50) NOT NULL,
  `BirthPlace` varchar(50) NOT NULL,
  `Balance` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`userID`, `BankName`, `HolderName`, `AccNumber`, `Pin`, `BirthDate`, `BirthPlace`, `Balance`) VALUES
(1, 'UNION BANK', 'Joann Bernadez', 12345667, 415, '01/12/2001', 'Davao', 480),
(2, '3JL', 'Jaybang', 58915788, 123, '06/13/2009', 'Baganga', 15),
(3, 'lANDBANK', 'Joshua Bernadez', 58387868, 124, '08/24/08', 'Davao Oriental', 100),
(4, 'CHINABANK', 'Jan Baoc', 34461316, 456, '01/06/2001', 'Bantayan', 175);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`userID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `userID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

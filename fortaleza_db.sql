-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 24, 2019 at 05:29 AM
-- Server version: 10.1.26-MariaDB
-- PHP Version: 7.1.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `account_registration`
--

-- --------------------------------------------------------

--
-- Table structure for table `accounttable`
--

CREATE TABLE `accounttable` (
  `FIRST_NAME` text NOT NULL,
  `LAST_NAME` text NOT NULL,
  `USERNAME` varchar(50) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `accounttable`
--

INSERT INTO `accounttable` (`FIRST_NAME`, `LAST_NAME`, `USERNAME`, `PASSWORD`) VALUES
('Mark Jade', 'Fortaleza', 'jade', '38d790771231a3d77b02ddf3b2327c34'),
('louisee', 'talas', 'lablab', 'd6a9b920af25b1d240105bec4efe9c81'),
('ted', 'pahilanga', 'sensen', '2d87b78ea3d4b07b409cb2a22767213a'),
('shee', 'aycayno', 'xhiena123@yahoo.com', 'e1f1ceed45d5d67f43ad30bd094951ec'),
('ryan', 'wong', 'ran', '21232f297a57a5a743894a0e4a801fc3'),
('gar', 'garen', 'gar', '21232f297a57a5a743894a0e4a801fc3'),
('gar', 'garen', 'gar', '21232f297a57a5a743894a0e4a801fc3'),
('rayas', 'adas', 'mark', '21232f297a57a5a743894a0e4a801fc3'),
('jade', 'forth', 'mjade', '855d704991a925eafc60b311f48b31bc');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `PRODUCT_ID` int(11) NOT NULL,
  `PRODUCT_NAME` varchar(50) NOT NULL,
  `QUANTITY` int(11) NOT NULL,
  `PRICE` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`PRODUCT_ID`, `PRODUCT_NAME`, `QUANTITY`, `PRICE`) VALUES
(1, 'mik mik', 4, 1500),
(2, 'milo', 3, 9000),
(3, 'shampoo', 4, 500);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`PRODUCT_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `PRODUCT_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

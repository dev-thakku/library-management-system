-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 01, 2021 at 03:02 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_lms`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_author`
--

CREATE TABLE `tbl_author` (
  `auth_id` int(11) NOT NULL,
  `fname` varchar(255) NOT NULL,
  `lname` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_author`
--

INSERT INTO `tbl_author` (`auth_id`, `fname`, `lname`) VALUES
(2, 'R.K Narayan', ''),
(4, 'Charles', 'Babbage'),
(5, 'Robert', 'Hook'),
(6, 'J.D. Salinger', ''),
(7, 'F. Scott. Fitzgerald', ''),
(8, 'Jane Austen', ''),
(9, 'Scott Hanselman', ''),
(10, 'Jason N. Gaylord', ''),
(11, 'Pranav Rastogi', ''),
(12, 'Todd Miranda', ''),
(13, 'Christian Wenz', '');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_book`
--

CREATE TABLE `tbl_book` (
  `isbn` int(11) NOT NULL,
  `bname` varchar(255) NOT NULL,
  `category` int(11) NOT NULL,
  `author` int(11) NOT NULL,
  `publisher` int(11) NOT NULL,
  `pno` int(11) NOT NULL,
  `edition` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_book`
--

INSERT INTO `tbl_book` (`isbn`, `bname`, `category`, `author`, `publisher`, `pno`, `edition`) VALUES
(241988802, 'Franny and Zooey', 1, 6, 5, 160, 2019),
(521343119, 'Science and Reform Selected Works of Charles Babbage', 1, 4, 4, 356, 1989),
(1440623112, 'The Guide', 1, 2, 5, 224, 2006),
(1440674639, 'Malgudi Days', 1, 2, 5, 288, 2006);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_category`
--

CREATE TABLE `tbl_category` (
  `cat_id` int(11) NOT NULL,
  `category` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_category`
--

INSERT INTO `tbl_category` (`cat_id`, `category`, `status`) VALUES
(1, 'Cloud Computing', 'Active'),
(2, 'Web Programming', 'Active'),
(3, 'Object Oriented Programming', 'Active'),
(4, 'Fiction', 'Deactive');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_issuebook`
--

CREATE TABLE `tbl_issuebook` (
  `id` int(11) NOT NULL,
  `mem_id` int(11) NOT NULL,
  `isbn` int(11) NOT NULL,
  `issue_date` date NOT NULL,
  `return_date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_issuebook`
--

INSERT INTO `tbl_issuebook` (`id`, `mem_id`, `isbn`, `issue_date`, `return_date`) VALUES
(7, 1, 1440623112, '2021-06-18', '2021-08-17'),
(8, 3, 1440623112, '2021-08-17', '2021-08-17');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_member`
--

CREATE TABLE `tbl_member` (
  `mem_id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `address` text NOT NULL,
  `phone` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_member`
--

INSERT INTO `tbl_member` (`mem_id`, `name`, `address`, `phone`) VALUES
(1, 'Member 1', 'Address of,\nMember 1,\n662244', '9988774258'),
(2, 'Member 2', 'Address of,\nMember 2.\n661122', '9744874569'),
(3, 'Member 3', 'Address of,\nMember 3,\n200112', '9037558904'),
(4, 'User 5', 'some address of user 5', '12345678900');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_publisher`
--

CREATE TABLE `tbl_publisher` (
  `pub_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `address` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_publisher`
--

INSERT INTO `tbl_publisher` (`pub_id`, `name`, `phone`, `address`) VALUES
(1, 'Earlybird Books Private Limited', '9876325410', '11115-B, East Park Road, \nNew Delhi, Delhi 110005'),
(2, 'PCM', '04849875643', 'Ernakulam,\nKerala'),
(4, 'Cambridge University Press', '+168952254', 'Cambridge'),
(5, 'Penguin Publishing Group', '042856824', 'address of penguin');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_retbook`
--

CREATE TABLE `tbl_retbook` (
  `id` int(11) NOT NULL,
  `mem_id` int(11) NOT NULL,
  `mname` varchar(255) NOT NULL,
  `bname` varchar(255) NOT NULL,
  `return_date` varchar(15) NOT NULL,
  `elap` int(11) NOT NULL,
  `fine` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_retbook`
--

INSERT INTO `tbl_retbook` (`id`, `mem_id`, `mname`, `bname`, `return_date`, `elap`, `fine`) VALUES
(3, 2, 'Member 2', 'Science and Reform Selected Works of Charles Babbage', '2021-08-15', 3, 150);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_author`
--
ALTER TABLE `tbl_author`
  ADD PRIMARY KEY (`auth_id`);

--
-- Indexes for table `tbl_book`
--
ALTER TABLE `tbl_book`
  ADD PRIMARY KEY (`isbn`);

--
-- Indexes for table `tbl_category`
--
ALTER TABLE `tbl_category`
  ADD PRIMARY KEY (`cat_id`);

--
-- Indexes for table `tbl_issuebook`
--
ALTER TABLE `tbl_issuebook`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_member`
--
ALTER TABLE `tbl_member`
  ADD PRIMARY KEY (`mem_id`);

--
-- Indexes for table `tbl_publisher`
--
ALTER TABLE `tbl_publisher`
  ADD PRIMARY KEY (`pub_id`);

--
-- Indexes for table `tbl_retbook`
--
ALTER TABLE `tbl_retbook`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_author`
--
ALTER TABLE `tbl_author`
  MODIFY `auth_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `tbl_category`
--
ALTER TABLE `tbl_category`
  MODIFY `cat_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tbl_issuebook`
--
ALTER TABLE `tbl_issuebook`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `tbl_member`
--
ALTER TABLE `tbl_member`
  MODIFY `mem_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbl_publisher`
--
ALTER TABLE `tbl_publisher`
  MODIFY `pub_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tbl_retbook`
--
ALTER TABLE `tbl_retbook`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

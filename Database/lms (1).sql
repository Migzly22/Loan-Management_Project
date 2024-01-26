-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jan 26, 2024 at 02:23 PM
-- Server version: 5.7.36
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lms`
--

-- --------------------------------------------------------

--
-- Table structure for table `borrowers`
--

DROP TABLE IF EXISTS `borrowers`;
CREATE TABLE IF NOT EXISTS `borrowers` (
  `BorrowerID` int(11) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `MiddleName` varchar(225) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `LastName` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Email` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `PhoneNumber` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Address` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Classification` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `PayFrequency` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`BorrowerID`)
) ENGINE=MyISAM AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `borrowers`
--

INSERT INTO `borrowers` (`BorrowerID`, `FirstName`, `MiddleName`, `LastName`, `Email`, `PhoneNumber`, `Address`, `Classification`, `PayFrequency`) VALUES
(1, 'John', 'MID', 'Doe', 'john.doe@email.com', '123-456-7890', '123 Main St', 'Personal Loan', 'Monthly'),
(2, 'Jane', 'mid', 'Smith', 'jane.smith@email.com', '987-654-3210', '456 Oak St', 'Student Loan', 'Weekly'),
(3, 'Bob', 'mid', 'Johnson', 'bob.johnson@email.com', '555-123-7890', '789 Pine St', 'Auto Loan', 'Annual'),
(5, 'Rolly', 'Lamparas', 'Migrino', 'rolly.migrino@gmail.com', '099999999', 'Somewhere down Da St.', 'Student Loan', 'Monthly'),
(25, 'aaaaaaaaaaaa', 'bbbbbbbbbbbb', 'bbbbbbbbbbbb', 'bbbbbbbbbb', 'bbbbbbbbbb', 'bbbbbbbbb', 'Student Loan', 'Weekly'),
(24, 'qweqwe', 'qeqwe', 'aaaaa', 'aaaa', 'aaaa', 'aaa', 'Student Loan', 'Weekly'),
(23, 'qwer', 'rtyui', 'qweqwe', 'qweq', 'qweqeqwe', 'eqweqwe', 'Student Loan', 'Weekly'),
(22, 'qweqwe', 'qweqweqweq', 'eqwewq', 'eqweqweqweq', 'eqweqweqw', 'eqweqw', 'Student Loan', 'Weekly'),
(21, 'Realisz', 'Lamal', 'Ckra', 'emai@mgial.cm', '09999999', 'add st', 'Student Loan', 'Monthly'),
(20, 'qwe', 'qwe', 'qwe', 'qwe', 'qe', 'qwe', 'Student Loan', 'Weekly'),
(19, '123', '123', '123', '123', '123', '123', 'Student Loan', 'Weekly');

-- --------------------------------------------------------

--
-- Table structure for table `loanhistory`
--

DROP TABLE IF EXISTS `loanhistory`;
CREATE TABLE IF NOT EXISTS `loanhistory` (
  `LoanHistoryID` int(11) NOT NULL,
  `LoanID` int(11) DEFAULT NULL,
  `Action` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `TransactionDate` date DEFAULT NULL,
  `Description` text COLLATE utf8mb4_unicode_ci,
  PRIMARY KEY (`LoanHistoryID`),
  KEY `LoanID` (`LoanID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `loans`
--

DROP TABLE IF EXISTS `loans`;
CREATE TABLE IF NOT EXISTS `loans` (
  `LoanID` int(11) NOT NULL AUTO_INCREMENT,
  `BorrowerID` int(11) DEFAULT NULL,
  `LoanAmount` decimal(10,2) DEFAULT NULL,
  `InterestRate` decimal(5,2) DEFAULT NULL,
  `Period` int(11) DEFAULT NULL,
  `TotalCollection` decimal(11,2) NOT NULL,
  `StartDate` date DEFAULT NULL,
  `Status` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`LoanID`),
  KEY `BorrowerID` (`BorrowerID`)
) ENGINE=MyISAM AUTO_INCREMENT=116 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `loans`
--

INSERT INTO `loans` (`LoanID`, `BorrowerID`, `LoanAmount`, `InterestRate`, `Period`, `TotalCollection`, `StartDate`, `Status`) VALUES
(101, 1, '3000.00', '0.10', 12, '3600.00', '2023-11-30', 'Active'),
(102, 2, '8000.00', '0.20', 4, '9600.00', '2023-12-23', 'Active'),
(103, 3, '6000.00', '0.50', 1, '9000.00', '2022-12-30', 'Active'),
(104, 4, '5000.00', '0.50', 24, '65000.00', '2023-12-30', 'Active'),
(112, 22, '1111.00', '0.03', 12, '1510.96', '2024-01-04', 'Active'),
(111, 21, '10000.00', '0.10', 12, '22000.00', '2024-01-04', 'Active'),
(110, 20, '11111.00', '0.03', 12, '15110.96', '2024-01-04', 'Active'),
(109, 19, '12312.00', '0.03', 12, '16744.32', '2024-01-04', 'Active'),
(113, 23, '11.00', '0.03', 12, '14.96', '2024-01-04', 'Active'),
(114, 24, '1212.00', '0.03', 12, '1648.32', '2024-01-04', 'Active'),
(115, 25, '11.00', '0.03', 12, '14.96', '2024-01-04', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `loantypes`
--

DROP TABLE IF EXISTS `loantypes`;
CREATE TABLE IF NOT EXISTS `loantypes` (
  `LoanTypeID` int(11) NOT NULL,
  `TypeName` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `AnnuallyInterestRate` decimal(5,2) DEFAULT NULL,
  `MonthlyInterestRate` decimal(5,2) DEFAULT NULL,
  `WeeklyInterestRate` decimal(5,2) DEFAULT NULL,
  `MaxLoanAmount` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`LoanTypeID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `loantypes`
--

INSERT INTO `loantypes` (`LoanTypeID`, `TypeName`, `AnnuallyInterestRate`, `MonthlyInterestRate`, `WeeklyInterestRate`, `MaxLoanAmount`) VALUES
(1, 'Personal Loan', '2.40', '0.20', '0.05', '50000.00'),
(2, 'Auto Loan', '6.00', '0.50', '0.13', '100000.00'),
(3, 'Student Loan', '1.20', '0.10', '0.03', '10000.00');

-- --------------------------------------------------------

--
-- Table structure for table `payments`
--

DROP TABLE IF EXISTS `payments`;
CREATE TABLE IF NOT EXISTS `payments` (
  `PaymentID` int(11) NOT NULL AUTO_INCREMENT,
  `LoanID` int(11) DEFAULT NULL,
  `PaymentDate` date DEFAULT NULL,
  `AmountPaid` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`PaymentID`),
  KEY `LoanID` (`LoanID`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `payments`
--

INSERT INTO `payments` (`PaymentID`, `LoanID`, `PaymentDate`, `AmountPaid`) VALUES
(3, 114, '2024-01-16', '1648.32'),
(4, 115, '2024-01-16', '1.50'),
(5, 115, '2024-01-16', '1.50');

-- --------------------------------------------------------

--
-- Table structure for table `usercredentials`
--

DROP TABLE IF EXISTS `usercredentials`;
CREATE TABLE IF NOT EXISTS `usercredentials` (
  `UserID` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(225) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Username` varchar(225) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Password` varchar(225) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Access` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT 'BORROWER',
  `BorrowerID` int(11) DEFAULT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `usercredentials`
--

INSERT INTO `usercredentials` (`UserID`, `Name`, `Username`, `Password`, `Access`, `BorrowerID`) VALUES
(1, 'admin user', '13', '1212', 'ADMIN', NULL),
(2, '6', '6', '666', 'BORROWER', 1),
(3, 'Jane Smith', 'JaneSmith', 'jane.smith@email.com', 'BORROWER', 2),
(4, 'Bob Johnson', 'BobJohnson', 'bob.johnson@email.com', 'BORROWER', 3),
(7, 'Firstname Lastname', 'FirstnameLastname', 'email', 'BORROWER', 4),
(16, '123 123', '123123', '123', 'BORROWER', 19),
(17, 'qwe qwe', 'qweqwe', 'qwe', 'BORROWER', 20),
(18, 'Realisz Ckra', 'RealiszCkra', 'emai@mgial.cm', 'BORROWER', 21),
(19, 'qweqwe eqwewq', 'qweqweeqwewq', 'eqweqweqweq', 'BORROWER', 22),
(20, 'qwer qweqwe', 'qwerqweqwe', 'qweq', 'BORROWER', 23),
(21, 'qweqwe aaaaa', 'qweqweaaaaa', 'aaaa', 'BORROWER', 24),
(22, 'aaaaaaaaaaaa bbbbbbbbbbbb', 'aaaaaaaaaaaabbbbbbbbbbbb', 'bbbbbbbbbb', 'BORROWER', 25);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Dec 29, 2023 at 10:41 AM
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
  `BorrowerID` int(11) NOT NULL,
  `FirstName` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `MiddleName` varchar(225) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `LastName` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Email` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `PhoneNumber` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Address` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Classification` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `PayFrequency` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`BorrowerID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `borrowers`
--

INSERT INTO `borrowers` (`BorrowerID`, `FirstName`, `MiddleName`, `LastName`, `Email`, `PhoneNumber`, `Address`, `Classification`, `PayFrequency`) VALUES
(1, 'John', NULL, 'Doe', 'john.doe@email.com', '123-456-7890', '123 Main St', 'Employed', 'Monthly'),
(2, 'Jane', NULL, 'Smith', 'jane.smith@email.com', '987-654-3210', '456 Oak St', 'Student', 'Weekly'),
(3, 'Bob', NULL, 'Johnson', 'bob.johnson@email.com', '555-123-7890', '789 Pine St', 'Self-Employed', 'Annual');

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
  `LoanID` int(11) NOT NULL,
  `BorrowerID` int(11) DEFAULT NULL,
  `LoanTypeID` int(11) DEFAULT NULL,
  `LoanAmount` decimal(10,2) DEFAULT NULL,
  `InterestRate` decimal(5,2) DEFAULT NULL,
  `Period` int(11) DEFAULT NULL,
  `PaymentFrequency` int(11) DEFAULT NULL,
  `StartDate` date DEFAULT NULL,
  `Status` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`LoanID`),
  KEY `BorrowerID` (`BorrowerID`),
  KEY `LoanTypeID` (`LoanTypeID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `loans`
--

INSERT INTO `loans` (`LoanID`, `BorrowerID`, `LoanTypeID`, `LoanAmount`, `InterestRate`, `Period`, `PaymentFrequency`, `StartDate`, `Status`) VALUES
(101, 1, 1, '3000.00', '0.01', 12, 12, '2023-01-01', 'Active'),
(102, 2, 2, '8000.00', '0.02', 24, 4, '2023-02-15', 'Active'),
(103, 3, 3, '6000.00', '0.05', 6, 1, '2023-03-10', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `loantypes`
--

DROP TABLE IF EXISTS `loantypes`;
CREATE TABLE IF NOT EXISTS `loantypes` (
  `LoanTypeID` int(11) NOT NULL,
  `TypeName` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `AnnualInterestRate` decimal(5,2) DEFAULT NULL,
  `MonthlyInterestRate` decimal(5,2) DEFAULT NULL,
  `WeeklyInterestRate` decimal(5,2) DEFAULT NULL,
  `MaxLoanAmount` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`LoanTypeID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `loantypes`
--

INSERT INTO `loantypes` (`LoanTypeID`, `TypeName`, `AnnualInterestRate`, `MonthlyInterestRate`, `WeeklyInterestRate`, `MaxLoanAmount`) VALUES
(1, 'Personal Loan', '2.40', '0.20', '0.05', '50000.00'),
(2, 'Auto Loan', '6.00', '0.50', '0.13', '100000.00'),
(3, 'Student Loan', '1.20', '0.10', '0.03', '10000.00');

-- --------------------------------------------------------

--
-- Table structure for table `payments`
--

DROP TABLE IF EXISTS `payments`;
CREATE TABLE IF NOT EXISTS `payments` (
  `PaymentID` int(11) NOT NULL,
  `LoanID` int(11) DEFAULT NULL,
  `PaymentDate` date DEFAULT NULL,
  `AmountPaid` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`PaymentID`),
  KEY `LoanID` (`LoanID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

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
  `Access` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `BorrowerID` int(11) DEFAULT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `usercredentials`
--

INSERT INTO `usercredentials` (`UserID`, `Name`, `Username`, `Password`, `Access`, `BorrowerID`) VALUES
(1, 'Admin Admin', 'Admin', 'Admin', 'ADMIN', NULL),
(2, 'John Doe', 'JohnDoe', 'john.doe@email.com', 'BORROWER', 1),
(3, 'Jane Smith', 'JaneSmith', 'jane.smith@email.com', 'BORROWER', 2),
(4, 'Bob Johnson', 'BobJohnson', 'bob.johnson@email.com', 'BORROWER', 3);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

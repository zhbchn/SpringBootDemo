-- phpMyAdmin SQL Dump
-- version 4.6.6
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 2019-03-05 15:11:20
-- 服务器版本： 5.7.17-log
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `test`
--

-- --------------------------------------------------------

--
-- 表的结构 `readdata`
--

CREATE TABLE `readdata` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `value` varchar(50) NOT NULL,
  `stationid` int(11) NOT NULL,
  `varbarcode` varchar(50) NOT NULL,
  `productbarcode` varchar(50) NOT NULL,
  `isok` char(1) NOT NULL,
  `insertdate` date DEFAULT NULL,
  `bak` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `readdata`
--

INSERT INTO `readdata` (`id`, `name`, `value`, `stationid`, `varbarcode`, `productbarcode`, `isok`, `insertdate`, `bak`) VALUES
(1, '1#TR的压力', '54', 1, '23424234234234', '23423423423423', '1', '2018-11-22', 'hello');

-- --------------------------------------------------------

--
-- 表的结构 `users`
--

CREATE TABLE `users` (
  `uid` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `users`
--

INSERT INTO `users` (`uid`, `username`, `password`) VALUES
(1, 'admin', '123456'),
(2, 'zhaobao', '123456'),
(3, 'zhb', '111111'),
(4, 'zhb', '111111'),
(5, 'zhb', '111111'),
(6, 'zhb', '111111'),
(7, 'zhb', '111111'),
(8, 'zhb', '111111'),
(9, 'zhb', '111111'),
(10, '111', '2222'),
(11, '111', '2222'),
(12, '111aaa', '2222sss');

-- --------------------------------------------------------

--
-- 表的结构 `users_tab`
--

CREATE TABLE `users_tab` (
  `uid` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `users_tab`
--

INSERT INTO `users_tab` (`uid`, `username`, `password`) VALUES
(1, 'admin', '123456');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `readdata`
--
ALTER TABLE `readdata`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`uid`);

--
-- 在导出的表使用AUTO_INCREMENT
--

--
-- 使用表AUTO_INCREMENT `readdata`
--
ALTER TABLE `readdata`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- 使用表AUTO_INCREMENT `users`
--
ALTER TABLE `users`
  MODIFY `uid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

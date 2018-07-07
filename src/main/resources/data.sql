/*!40000 ALTER TABLE `tbl_author` DISABLE KEYS */;
INSERT INTO `tbl_author` (`seq`, `name`, `reg_date`) VALUES
	(1, 'SomeWriter', '2018-07-08 00:58:44');
/*!40000 ALTER TABLE `tbl_author` ENABLE KEYS */;

/*!40000 ALTER TABLE `tbl_member` DISABLE KEYS */;
INSERT INTO `tbl_member` (`seq`, `id`, `name`, `password`, `reg_date`, `type`) VALUES
	(1, 'testId', 'testUserName', 'testPassword', '2018-07-08 00:58:44', 'ADMIN');
/*!40000 ALTER TABLE `tbl_member` ENABLE KEYS */;

/*!40000 ALTER TABLE `tbl_tag` DISABLE KEYS */;
INSERT INTO `tbl_tag` (`seq`, `value`) VALUES
	(1, 'Java'),
	(2, 'Programming');

/*!40000 ALTER TABLE `tbl_book` DISABLE KEYS */;
INSERT INTO `tbl_book` (`archive_type`, `seq`, `description_url`, `expire_date`, `reg_date`, `title`, `author_seq`, `register_seq`) VALUES
	('SCAN', 1, NULL, NULL, '2018-07-08 00:58:44', 'Happy Java', 1, 1);
/*!40000 ALTER TABLE `tbl_book` ENABLE KEYS */;

/*!40000 ALTER TABLE `tbl_book_tags` DISABLE KEYS */;
INSERT INTO `tbl_book_tags` (`tbl_book_seq`, `tags_seq`) VALUES
	(1, 1),
	(1, 2);
/*!40000 ALTER TABLE `tbl_book_tags` ENABLE KEYS */;


/*!40000 ALTER TABLE `tbl_scan_book` DISABLE KEYS */;
INSERT INTO `tbl_scan_book` (`file_hash`, `file_name`, `path`, `size`, `seq`, `server_seq`) VALUES
	(NULL, NULL, NULL, NULL, 1, NULL);
/*!40000 ALTER TABLE `tbl_scan_book` ENABLE KEYS */;

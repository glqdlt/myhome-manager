INSERT INTO `tbl_author` (`seq`, `name`) VALUES
	(1, '로버트 마틴');
INSERT INTO `tbl_member` (`seq`, `id`, `name`, `password`,`type`) VALUES
	(1, 'admin', 'admin', 'admin1234', 'ADMIN');
INSERT INTO `tbl_tag` (`seq`, `value`) VALUES
	(1, '자바'),
	(2, '프로그래밍'),
	(3, '철학'),
	(4, '마인드');
INSERT INTO `tbl_book` (`archive_type`, `seq`, `description_url`, `expire_date`,  `title`, `author_seq`, `register_seq`) VALUES
	('S', 1, NULL, NULL, '클린 코더', 1, 1);
INSERT INTO `tbl_book_tags` (`tbl_book_seq`, `tags_seq`) VALUES
	(1, 1),
	(1, 2);
INSERT INTO `tbl_scan_book` (`file_hash`, `file_name`, `path`, `size`, `seq`, `server_seq`) VALUES
	(NULL, NULL, NULL, NULL, 1, NULL);

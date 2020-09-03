--

DROP TABLE IF EXISTS user;

CREATE TABLE user
(
	id BIGINT(20) NOT NULL COMMENT '主键ID',
	name VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
	age INT(11) NULL DEFAULT NULL COMMENT '年龄',
	email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
	PRIMARY KEY (id)
);

--
DELETE FROM user;

INSERT INTO user (id, name, age, email) VALUES
(1, 'Jone', 18, 'test1@baomidou.com'),
(2, 'Jack', 20, 'test2@baomidou.com'),
(3, 'Tom', 28, 'test3@baomidou.com'),
(4, 'Sandy', 21, 'test4@baomidou.com'),
(5, 'Billie', 24, 'test5@baomidou.com');

INSERT INTO user (id, name, age, email) VALUES
(11, 'Jone', 18, 'test1@baomidou.com'),
(22, 'Jack', 20, 'test2@baomidou.com'),
(33, 'Tom', 28, 'test3@baomidou.com'),
(44, 'Sandy', 21, 'test4@baomidou.com'),
(55, 'Billie', 24, 'test5@baomidou.com');

INSERT INTO user (id, name, age, email) VALUES
(111, 'Jone', 18, 'test1@baomidou.com'),
(222, 'Jack', 20, 'test2@baomidou.com'),
(333, 'Tom', 28, 'test3@baomidou.com'),
(444, 'Sandy', 21, 'test4@baomidou.com'),
(555, 'Billie', 24, 'test5@baomidou.com');
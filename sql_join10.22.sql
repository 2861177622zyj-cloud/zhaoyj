SELECT *FROM student
SELECT `studentNo`AS 学号,`studentName` AS 名字 FROM studsent
SELECT CONCAT ('姓名：',studentName)AS 新名字 FROM student
SELECT DISTINCT `studentNo` FROM result
-- 学号，学生姓名，科目数，分数
SELECT s.studentno,studentname,subjectno,StudentResult
FROM student s      	  -- studentno studentname 
INNER JOIN result r       -- studentno StudentResult
ON r.studentno = s.studentno;
-- 学号，学生姓名，科目名，分数
SELECT s.studentno,studentname,subjectname,StudentResult
FROM student s
INNER JOIN result r
ON r.studentno = s.studentno
INNER JOIN `subject` sub
ON sub.subjectno = r.subjectno;
-- 学员所属的年级（学号，姓名，年级名称）  student grade
SELECT  s.studentno,`studentname`,`gradename`
FROM student s
INNER JOIN grade r
ON s.`gradeid` =r.`gradeid`

-- 查询 数据库结构-1 的所有考试结果(学号 学生姓名 科目名称 成绩)
-- student(studentno，studentname) subject（subjectname） result（studentresult subjectno） 
SELECT s.studentno,s.studentname,sub.subjectname,r.studentresult
FROM student s
INNER JOIN result r
ON s.studentno = r.studentno
INNER JOIN `subject` sub
ON r.subjectno = sub.`subjectno`
WHERE subjectname = '数据库结构-1'
-- order by studentresult ASC
ORDER BY studentresult DESC


-- 分页 
-- 每页五条数据 n代表当前页，pagesize代表页面大小，
SELECT s.studentno,s.studentname,sub.subjectname,r.studentresult
FROM student s
INNER JOIN result r
ON s.studentno = r.studentno
INNER JOIN `subject` sub
ON r.subjectno = sub.`subjectno`
WHERE subjectname = '数据库结构-1'
-- order by studentresult ASC
ORDER BY studentresult DESC
-- limit (n-1)*5,5


 -- 查询 JAVA第一学年 课程成绩前10名并且分数大于80的学生信息(学号,姓名,课程名,分数)
 SELECT s.`studentno`,s.`studentname`,sub.`subjectname`,r.`studentresult`
 FROM student s
 INNER JOIN result r
 ON s.`studentno` = r.`studentno`
 INNER JOIN `subject`sub
 ON r.subjectno = sub.subjectno
 WHERE r.studentresult >80 && subjectname = 'JAVA第一学年'
 ORDER BY studentresult DESC
 LIMIT 10;
 
 -- 查询 数据库结构-1 的所有考试结果(学号,科目编号,成绩),并且成绩降序排列
 -- 子查询
 SELECT studentno,subjectno,Studentresult
 FROM result
 WHERE `subjectno` = (
	SELECT  `subjectno` FROM `subject`
	WHERE subjectname ='数据库结构-1' 
 )
 ORDER BY studentresult DESC;
 
-- 查询课程为 高等数学-2 且分数不小于80分的学生的学号和姓名

SELECT s.studentno,s.studentname
FROM student s
INNER JOIN result r
ON r.`studentno` =s.studentno
INNER JOIN `subject` sub
ON sub.`subjectno` = r.`subjectno`
WHERE `studentresult` >= 80 AND `subjectname` = '高等数学-2'

-- 子查询
SELECT s.studentno,s.studentname
FROM student s
WHERE 



-- ----常用函数
SELECT CHAR_LENGTH('Java坚持就能成功'); -- 返回字符串包含的字符数
SELECT CONCAT('我','改','程序');  -- 合并字符串,参数可以有多个 ‘我改程序’
SELECT INSERT('我在编程hello world',1,2,'为了咸鱼'); 
 -- 替换字符串,从某个位置开始替换某个长度
-- 为了咸鱼编程hello world
SELECT LOWER('subeiLY'); -- 小写
SELECT UPPER('unremittingly'); -- 大写
SELECT LEFT('hello,world',5);   -- 从左边截取
SELECT RIGHT('hello,world',5);  -- 从右边截取
SELECT REPLACE('Java坚持就能成功','坚持','努力');  -- 替换字符串 ’Java努力就能成功‘
SELECT SUBSTR('Java坚持就能成功',4,6); -- 截取字符串,开始和长度  ‘a坚持就能成’
SELECT REVERSE('Java坚持就能成功'); -- 反转
 
-- 查询姓郭的同学,改成邹
SELECT REPLACE(studentname,'郭','邹') AS 新名字
FROM student WHERE studentname LIKE '郭%';

-- 查询不同课程的平均分,最高分,最低分
-- 前提:根据不同的课程进行分组
 SELECT subjectname,AVG(studentresult) AS 平均分,MAX(StudentResult) AS 最高分,MIN(StudentResult) AS 最低分
 FROM result AS r
 INNER JOIN `subject` AS s
 ON r.subjectno = s.subjectno
 GROUP BY r.subjectno
 HAVING 平均分>80;

-- 模拟银行转账事务
CREATE DATABASE `shop`CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `shop`;

CREATE TABLE `account` (
`id` INT(11) NOT NULL AUTO_INCREMENT,
`name` VARCHAR(32) NOT NULL,
`money` DECIMAL(9,2) NOT NULL,
PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO account (`name`,`money`)
VALUES('A',2000.00),('B',10000.00);

-- 模拟转账
SET autocommit = 0; -- 关闭自动提交
START TRANSACTION;  -- 开始一个事务

UPDATE account SET money=money-500 WHERE `name`='A';
UPDATE account SET money=money+500 WHERE `name`='B';

COMMIT; -- 提交事务，持久化了！！！
# rollback; -- 回滚
SET autocommit = 1; -- 恢复自动提交
 
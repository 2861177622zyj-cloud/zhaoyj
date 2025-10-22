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
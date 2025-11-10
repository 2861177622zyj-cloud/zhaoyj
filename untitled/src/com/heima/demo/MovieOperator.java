package com.heima.demo;

import java.util.Scanner;

/**
 * ClassName: MovieOperator
 * Package: com.heima.demo
 */
public class MovieOperator {
    private Movie[] movies;//创建数组

    public MovieOperator(Movie[] movies) {//构造方法
        this.movies = movies;//赋值给成员变量
    }
// 打印所有电影
    public void printAllMovies() {
    //遍历数组
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println(m.getName()+"\t"+m.getActor()+"\t"+m.getId()+"\t"+m.getScore());
        }
    }
// 根据id查询电影
    public void searchMovieById() {
// 接收id
        System.out.println("请输入id：");
        // 创建Scanner
        Scanner sc = new Scanner(System.in);
        // 接收id
        int id = sc.nextInt();
        // 遍历数组
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            if (m.getId() == id) {
                System.out.println(m.getName()+"\t"+m.getActor()+"\t"+m.getId()+"\t"+m.getScore());
                return;
            }
        }
        System.out.println("没有找到该电影");
    }
}

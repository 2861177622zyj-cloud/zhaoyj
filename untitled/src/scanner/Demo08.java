package scanner;

/**
 * ClassName: Demo08
 * Package: scanner
 */
public class Demo08 {
    public static void main(String[] args)
    {
int[][]array=new int[][]{{1,2},{3,4}};
int sum=0;
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
            sum++;
            }
        }
        System.out.println(sum);
    }
}

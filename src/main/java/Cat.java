import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

/**
 * Created by MAMIAN on 2017/6/3.
 */
public class Cat {

    public static void main(String[] args) {
        // 将所有输入文件复制到输出流(最后一个参数)中
        Out out = new Out(args[args.length - 1]);
        for (int i = 0; i < args.length - 1; i++) {
            // 将第i个输入文件复制到输出流中
            In in = new In(args[i]);
            String s = in.readAll();
            // 打印到out文件
            out.println(s);

            in.close();

        }
        out.close();
    }
}

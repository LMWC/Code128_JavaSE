package demo10_ByteBuffer类;

import java.nio.ByteBuffer;

public class Test2_limit {
    public static void main(String[] args) {
        // 创建ByteBuffer字节缓冲数组,指定容量为10
        ByteBuffer b1 = ByteBuffer.allocate(10);

        //b1的限制: 10
        System.out.println("b1的限制: "+b1.limit());

        // 添加数据
        b1.put((byte) 10);
        b1.put((byte) 20);
        b1.put((byte) 30);

        // 修改b1的限制为3
        b1.limit(3);

        //b1的限制: 3
        System.out.println("b1的限制: "+b1.limit());

    }
}

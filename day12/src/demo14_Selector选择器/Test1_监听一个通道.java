package demo14_Selector选择器;

import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;

public class Test1_监听一个通道 {
    public static void main(String[] args) throws Exception{
        // 1.打开服务器通道
        ServerSocketChannel ssc1 = ServerSocketChannel.open();

        // 2.绑定端口号
        ssc1.bind(new InetSocketAddress(7777));

        // 3.设置非阻塞
        ssc1.configureBlocking(false);

        // 4.获取选择器
        Selector selector = Selector.open();

        // 5.把Channel注册到选择器上
        ssc1.register(selector, SelectionKey.OP_ACCEPT);

    }
}


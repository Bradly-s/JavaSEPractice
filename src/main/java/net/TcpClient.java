package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.1.4",8888);

//        给服务端发送数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("这是客户端给服务端发送的数据hello".getBytes());
        //如果在这里关流,会导致整个socket都无法使用
        // os.close();
        //仅仅关闭输出流.并写一个结束标记,对socket没有任何影响
        socket.shutdownOutput();

//        接受的服务端发送的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while((line = br.readLine())!=null){
            System.out.println("接受的服务端发送的数据：" + line);
        }

        br.close();
        outputStream.close();
        socket.close();
    }
}

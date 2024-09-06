package nested.exception.ex4;


public class NetWorkServiceV4 {
    public void sendMessage(String data)  {
        String address ="http://example.com";
        NetWorkClientV4 client = new NetWorkClientV4(address);
        client.initError(data);// 추가

        try {
            client.connect();
            client.send(data);
        }finally {
            client.disconnect();
        }

        
    }
}

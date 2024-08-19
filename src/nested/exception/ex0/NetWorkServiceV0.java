package nested.exception.ex0;

public class NetWorkServiceV0 {
    public void sendMessage(String data){
        String address ="http://example.com";
        NetWorkClientV0 client = new NetWorkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();

    }
}

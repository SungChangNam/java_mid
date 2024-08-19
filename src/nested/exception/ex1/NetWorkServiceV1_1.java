package nested.exception.ex1;



public class NetWorkServiceV1_1 {
    public void sendMessage(String data){
        String address ="http://example.com";
        NetWorkClientV1 client = new NetWorkClientV1(address);
        client.initError(data);// 추가

        client.connect();
        client.send(data);
        client.disconnect();

    }
}

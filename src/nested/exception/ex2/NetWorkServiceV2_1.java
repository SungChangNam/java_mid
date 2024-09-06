package nested.exception.ex2;




public class NetWorkServiceV2_1 {
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address ="http://example.com";
        NetWorkClientV2 client = new NetWorkClientV2(address);
        client.initError(data);// 추가

        client.connect();
        client.send(data);
        client.disconnect();

    }
}

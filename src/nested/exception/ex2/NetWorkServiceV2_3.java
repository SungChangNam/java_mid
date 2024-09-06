package nested.exception.ex2;




public class NetWorkServiceV2_3 {
    public void sendMessage(String data)  {
        String address ="http://example.com";
        NetWorkClientV2 client = new NetWorkClientV2(address);
        client.initError(data);// 추가

        try {
            client.connect();
            client.send(data);
            client.disconnect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: "+ e.getErrorCode()+e.getMessage());

        }

    }
}

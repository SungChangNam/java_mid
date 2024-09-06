package nested.exception.ex2;




public class NetWorkServiceV2_2 {
    public void sendMessage(String data)  {
        String address ="http://example.com";
        NetWorkClientV2 client = new NetWorkClientV2(address);
        client.initError(data);// 추가

        try {
            client.connect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: "+ e.getErrorCode()+e.getMessage());
            return;
        }

        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: "+ e.getErrorCode()+e.getMessage());
            return;
        }

            client.disconnect();



    }
}

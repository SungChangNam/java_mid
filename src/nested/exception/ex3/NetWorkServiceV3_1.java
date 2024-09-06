package nested.exception.ex3;


import nested.exception.ex3.exception.ConnectExceptionV3;
import nested.exception.ex3.exception.SendExceptionV3;

public class NetWorkServiceV3_1 {
    public void sendMessage(String data)  {
        String address ="http://example.com";
        NetWorkClientV3 client = new NetWorkClientV3(address);
        client.initError(data);// 추가

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소: "+e.getAddress()+", 메시지: "+ e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] 전송 데이터: "+e.getSendData() +", 메시지: "+ e.getMessage());
        } finally {
            client.disconnect();
        }


        
    }
}

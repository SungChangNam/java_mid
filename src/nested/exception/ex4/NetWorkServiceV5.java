package nested.exception.ex4;


public class NetWorkServiceV5 {
    public void sendMessage(String data)  {
        String address ="http://example.com";


        try (NetWorkClientV5 client = new NetWorkClientV5(address)){
            client.initError(data);// 추가
            client.connect();
            client.send(data);
        }catch (Exception e){
            System.out.println("[예외 확인]: " +e.getMessage());
            throw e;
        }
        
    }
}

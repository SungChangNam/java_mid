package nested.exception.ex2;




import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {
        //NetWorkServiceV2_1 networkService = new NetWorkServiceV2_1();
        //NetWorkServiceV2_2 networkService = new NetWorkServiceV2_2();
        //NetWorkServiceV2_3 networkService = new NetWorkServiceV2_3();
        //NetWorkServiceV2_4 networkService = new NetWorkServiceV2_4();
        NetWorkServiceV2_5 networkService = new NetWorkServiceV2_5();

        Scanner scanner =new Scanner(System.in);
        while (true){
            System.out.print("전송할 문자:");
            String input = scanner.nextLine();
            if (input.equals("exit")){
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");


    }
}

package nested.exception.ex3;




import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args)  {
        //NetWorkServiceV3_1 networkService= new NetWorkServiceV3_1();
        NetWorkServiceV3_2 networkService= new NetWorkServiceV3_2();

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

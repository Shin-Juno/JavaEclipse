package com.javastudy.ch07.stringclass;

public class RequestCommandProcess {

    public static String getCommand(String url) {
        int index = url.indexOf("/WebApp/");
        if (index != -1) {
            return url.substring(index + "/WebApp/".length());
        }
        return null; 
    }

    public static void main(String[] args) {
        String[] urls = {
                "http://www.localhost:8080/WebApp/joinProcess",
                "http://www.localhost:8080/WebApp/orderProcess",
                "http://www.localhost:8080/WebApp/writeMemo" };
        
        String inputUrl1 = "http://www.localhost:8080/WebApp/joinProcess";
        String resultCommand1 = getCommand(inputUrl1);
        System.out.println("입력 값 : " + inputUrl1);
        System.out.println("결과 값 : /" + resultCommand1);
        System.out.println();
        
        String inputUrl2 = "http://www.localhost:8080/WebApp/orderProcess";
        String resultCommand2 = getCommand(inputUrl2);
        System.out.println("입력 값 : " + inputUrl2);
        System.out.println("결과 값 : /" + resultCommand2);
        System.out.println();
        
        String inputUrl3 = "http://www.localhost:8080/WebApp/writeMemo";
        String resultCommand3 = getCommand(inputUrl3);
        System.out.println("입력 값 : " + inputUrl3);
        System.out.println("결과 값 : /" + resultCommand3);
        System.out.println();

        for (int i = 0; i < urls.length; i++) {
            String command = getCommand(urls[i]);  // URL에서 명령 추출
            if (command != null) {
                System.out.print("요청 명령 : /" + command + " – ");
                
                switch (command) {
                    case "joinProcess":
                        System.out.println("회원 가입 완료");
                        break;
                    case "orderProcess":
                        System.out.println("상품 주문 완료");
                        break;
                    case "writeMemo":
                        System.out.println("메모 작성 완료");
                        break;
                    default:
                        System.out.println("알 수 없는 요청");
                }
            }
        }
    }
}

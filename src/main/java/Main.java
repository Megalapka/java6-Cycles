import ru.netology.sqr.SQRService.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService serv = new SQRService();
        System.out.println(serv.SearchingSQR(100, 9801));
    }
}

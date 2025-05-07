import java.util.Calendar;

public class year {
  public static class GetYear {
    public int ano() {
      Calendar calendar = Calendar.getInstance();
      return calendar.get(Calendar.YEAR); // retorna o ano
    }
  }

  public static void main(String[] args) {
    GetYear getYearInstance = new GetYear();
    
    System.out.println("O ano é: " + getYearInstance.ano());
  }
}

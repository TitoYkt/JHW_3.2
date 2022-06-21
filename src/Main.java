public class Main {
    public static void main (String[] args){
        BmiService service = new BmiService();
        double weight = 80;
        double height = 175;
        double kg = service.calculate(weight, height);
        System.out.println("Индекс массы тела = " + kg);


    }
}

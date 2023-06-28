public class Converter {

   final void convertkm(int steps) {
        double km = steps * 75.00 / 100000;
        String kmformat = String.format("%.3f", km);
        System.out.println("Пройденная дистанция "+ kmformat +" километров.");
}

    final void convertkkal(int steps) {
        int kkal = steps * 50 / 1000;
        System.out.println("Количество сожженных килокалорий - " + kkal + " ккал.");
   }
}
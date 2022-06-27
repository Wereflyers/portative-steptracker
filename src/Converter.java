public class Converter {

   void convert(int steps){
        double km = steps*75.00/100000;
        int kkal = steps*50/1000;
        System.out.println("Пройденная дистанция "+km+" километров.");
        System.out.println("Количество сожженных килокалорий - "+kkal+" ккал.");}

}

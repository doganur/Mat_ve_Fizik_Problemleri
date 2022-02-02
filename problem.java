package MatematikVeFizikProblemleri;

public class problem {
    public static class Matematik{
        public static void daireAlan(int yaricap){
            System.out.println("dairenin Alanı " + (Math.PI*yaricap*yaricap));
        }
        public static void UcgenCevresi(int kenar1, int kenar2, int kenar3){
            System.out.println("üçgen çevresi:  " + (kenar1 + kenar2 + kenar3));
        }

    }
    public static class Fizik {
        public static void İcCarpım(Vec vec1, Vec vec2){


            int icCarpım = vec1.getI() + vec2.getI() +vec1.getJ() + vec2.getJ() + vec1.getK() + vec2.getK() ;

            System.out.println(vec1.getIsim() + " ile " + vec2.getIsim() + " in iç çarpımı = " + icCarpım);
        }

    }
    
}

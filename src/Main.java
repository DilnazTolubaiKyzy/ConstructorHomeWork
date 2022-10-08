public class Main {
    public static void main(String[] args) {
        Class class1 = new Class(4,"java",new int[]{1,3,5,7});
        for(int b : class1.getMassiv()) {
            System.out.println(b);
        }
            System.out.println(class1.getNumber());
            System.out.println(class1.getSoz());


            Class class2 = new  Class();
            class2.setNumber(4);
            class2.setSoz("java");
            class2.setMassiv(new int[]{1,4,6,7,9});
            for(int b: class2.getMassiv()){
                System.out.println(b);
            }
        System.out.println(class2.getSoz());
        System.out.println(class2.getNumber());




    }
}
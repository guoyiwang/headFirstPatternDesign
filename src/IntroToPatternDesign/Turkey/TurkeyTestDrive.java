package IntroToPatternDesign.Turkey;

public class TurkeyTestDrive {
    public static void main(String[] args){
        MallardDuck mallardduck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(mallardduck);

        for(int i=0; i<10; i++){
            System.out.println("The DuckAdapter says...");
            duckAdapter.gobble();
            duckAdapter.fly();
        }
    }
}

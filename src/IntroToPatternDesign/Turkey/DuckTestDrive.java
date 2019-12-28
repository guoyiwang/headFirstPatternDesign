package IntroToPatternDesign.Turkey;

public class DuckTestDrive {
    public static void main(String[] args){
        MallardDuck mallardduck = new MallardDuck();

        WildTurkey wildturkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildturkey);

        System.out.println("The wildturkey says...");
        wildturkey.gobble();
        wildturkey.fly();

        System.out.println("\n The MallardDuck says...");
        testDuck(mallardduck);

        System.out.println("\n The TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}

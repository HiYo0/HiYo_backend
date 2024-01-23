package 과제.과제9_팀.오승택;

public class Step1 {
    public static void main(String[] args) {

        Machine machine = new Machine();

        Americano americano = new Americano();
        VanillaLatte vanillaLatte = new VanillaLatte();

        machine.run(americano);
    }
}

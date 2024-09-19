//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();
        relogio.setHoras(7, 59 );
        relogio.incrementaMinuto();
        System.out.println(relogio.mostraHora());


    }
}
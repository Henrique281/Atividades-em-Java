public class Relogio {
    private int horas;
    private int minutes;

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutes;
    }

    public void setHoras(int horas, int minutes) {

        if(horas >= 0 && horas <= 24 && minutes >= 0 && minutes <= 59 ) {
         this.horas = horas;
         this.minutes = minutes;

        }
        else {
            System.out.println("Horario errado");

        }
    }

    public void incrementaMinuto(){

        if (minutes >= 59) {
            horas++;
            minutes = 0;


        } else {
            minutes++;

        };
    }
    public String mostraHora(){
        if(minutes == 0)
            return String.format(getHoras()+ ":"+getMinutos()+"0");
        else
            return String.format(getHoras()+ ":"+getMinutos());


    }
}

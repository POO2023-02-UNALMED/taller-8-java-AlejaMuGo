package futbol;
public class Jugador extends Futbolista{
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal){
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }
    public Jugador(){
        super();
        dorsal=7;
        golesMarcados = 289;
    }
    @Override
    public String toString(){
        return super.toString()+" con el dorsal "+ this.dorsal+". Ha marcado "+golesMarcados;
    }
    @Override
    public int compareTo(Futbolista futbolista){
        int diferenciaEdad = futbolista.getEdad()-this.getEdad();
        return Math.abs(diferenciaEdad);
    }
    @Override
    public int compareTo(Object object){
        return 0;
    }

    public short getGolesMarcados() {
        return this.golesMarcados;
    }

    public void setGolesMarcados(short golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    public byte getDorsal() {
        return this.dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
    @Override
    public boolean jugarConLasManos(){
        return false;
    }

}


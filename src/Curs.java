import java.util.HashMap;
import java.util.Map;

public class Curs  implements Avaluable{
    private final String codi;
    private  String nom;
    private Nivell nivell;

    private final Map<String,Alumne> alumnes;


    public Curs(String codi,String nom,Nivell nivell){
        this.codi=codi;
        this.nom=nom;
        this.alumnes= new HashMap<>();
        this.nivell=nivell;

    }

    public boolean matricular(Alumne alumne){
        if(!validarAlumne(alumne)){
            return false;
        }
        alumnes.put(alumne.getDni(),alumne);
        ServeiNotificacions.enviarConfirmacio(alumne,this.nom);
        return true;
    }
    @Override
    public double calcularNotaFinal(){
        return 0; //No hay variables referentes a notas
    }

    private boolean validarAlumne(Alumne alumne){
        if (alumne==null) return false;
        if(this.alumnes.containsKey((alumne.getDni()))) return false;
        return this.nivell != Nivell.AVANÇAT || alumne.getEdat() >= 16;


    }

    public String getCodi() {
        return codi;
    }
}

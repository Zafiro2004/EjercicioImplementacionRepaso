import java.util.HashMap;
import java.util.Map;

public class Curs  implements Avaluable{
    private final String codi;
    private String nom;
    private Nivell nivell;

    private final Map<String,Alumne> alumnes;


    public Curs(String codi,String nom,Nivell nivell){
        this.codi=codi;
        this.nom=nom;
        this.alumnes= new HashMap<>();
        this.nivell=nivell;

    }

}

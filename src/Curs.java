import java.util.HashMap;
import java.util.Map;

public class Curs  implements Avaluable{
    private final String codi;
    private String nom;
    private Nivell nivell;

    private final Map<String,Alumne> alumnes;
    private ServeiNotificacions serveiNotificacions; //Se podría implementar directamente en el método pero bueno
    //Aquí faltarían los instrumentos y el profesor si los quisieramos para algo

    public Curs(String codi,String nom,Nivell nivell){
        this.codi=codi;
        this.nom=nom;
        this.alumnes= new HashMap<>();

    }

}

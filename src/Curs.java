import java.util.Map;

public class Curs {
    private final String codi;
    private String nom;
    private Nivell nivell;

    private final Map<String,Alumne> alumnes;
    private ServeiNotificacions serveiNotificacions; //Se podría implementar directamente en el método pero bueno
    //Aquí faltarían los instrumentos y el profesor si los quisieramos para algo
}

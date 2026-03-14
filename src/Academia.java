import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Academia {
    private final String codi;
    private  String nom;

    private final List<Curs> cursos;
    private final List<Instrument> instruments;
    private final Map<String,Profesor> professors;

    public Academia(String codi, String nom) {
        this.codi = codi;
        this.nom = nom;
        this.cursos= new ArrayList<>();
        this.instruments= new ArrayList<>();
        this.professors= new HashMap<>();
    }
}

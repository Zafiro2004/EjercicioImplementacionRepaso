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
    //TODO
    //Añadir métodos para añadir los diferentes tipos de instrumentos,cursos y profesores

    public Instrument getInstrument(int posicio){
        if(posicio<0 || posicio>=instruments.size()) return null;
        return instruments.get(posicio);
    }
    public Profesor getProfesor(String dni){
        if(!this.professors.containsKey(dni)){
            System.out.printf("No se ha encontrado al  profesor con el dni %s",dni);
            return null;
        }
        return this.professors.get(dni);

    }
    public boolean eliminarProfessor(String dni){
        if(!this.professors.containsKey(dni)){
            System.out.printf("No se ha encontrado al  profesor con el dni %s",dni);
            return false;
        }
        this.professors.remove(dni);
        return true;
    }
}

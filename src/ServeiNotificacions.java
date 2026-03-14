public class ServeiNotificacions {
    public void enviarConfirmacio(Alumne a,String nomCurs){
        System.out.printf("""
                        Nom de l'alumne: %s
                        Nom del curs: %s
                        """,a.getNom(),nomCurs);
    }
}

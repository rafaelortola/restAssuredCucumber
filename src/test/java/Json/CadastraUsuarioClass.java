package Json;

public class CadastraUsuarioClass {

    private String nomeFinal;
    private String emailFinal;
    private String generoFinal;
    private String statusFinal;


    public String getNomeFinal() {
        return nomeFinal;
    }

    public void setNomeFinal(String nomeFinal) {
        this.nomeFinal = nomeFinal;
    }

    public String getEmailFinal() {
        return emailFinal;
    }

    public void setEmailFinal(String emailFinal) {
        this.emailFinal = emailFinal;
    }

    public String getGeneroFinal() {
        return generoFinal;
    }

    public void setGeneroFinal(String generoFinal) {
        this.generoFinal = generoFinal;
    }

    public String getStatusFinal() {
        return statusFinal;
    }

    public void setStatusFinal(String statusFinal) {
        this.statusFinal = statusFinal;
    }

    public String payloadNovoUsuario(){
        return "{\n" +
                "  \"name\": \"" + this.nomeFinal + "\",\n" +
                "  \"email\": \"" + this.emailFinal + "\",\n" +
                "  \"gender\": \"" + this.generoFinal + "\",\n" +
                "  \"status\": \"" + this.statusFinal + "\" \n" +
                "}";
    }

}

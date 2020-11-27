package cl.santotomas.formulario.entidades;

public class Usuario {


    private String nombre;
    private String apellido;
    private Integer numeroTarjeta;
    private String mesTarjeta;
    private Integer anioTarjeta;
    private Integer codigoTarjeta;
    private String calleNumero;
    private String Ciudad;
    private String Estado;
    private Integer CodigoPostal;

    public Usuario(String nombre, String apellido, Integer numeroTarjeta, String mesTarjeta, Integer anioTarjeta, Integer codigoTarjeta, String calleNumero, String ciudad, String estado, Integer codigoPostal) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroTarjeta = numeroTarjeta;
        this.mesTarjeta = mesTarjeta;
        this.anioTarjeta = anioTarjeta;
        this.codigoTarjeta = codigoTarjeta;
        this.calleNumero = calleNumero;
        Ciudad = ciudad;
        Estado = estado;
        CodigoPostal = codigoPostal;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(Integer numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getMesTarjeta() {
        return mesTarjeta;
    }

    public void setMesTarjeta(String mesTarjeta) {
        this.mesTarjeta = mesTarjeta;
    }

    public Integer getAnioTarjeta() {
        return anioTarjeta;
    }

    public void setAnioTarjeta(Integer anioTarjeta) {
        this.anioTarjeta = anioTarjeta;
    }

    public Integer getCodigoTarjeta() {
        return codigoTarjeta;
    }

    public void setCodigoTarjeta(Integer codigoTarjeta) {
        this.codigoTarjeta = codigoTarjeta;
    }

    public String getCalleNumero() {
        return calleNumero;
    }

    public void setCalleNumero(String calleNumero) {
        this.calleNumero = calleNumero;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String ciudad) {
        Ciudad = ciudad;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public Integer getCodigoPostal() {
        return CodigoPostal;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        CodigoPostal = codigoPostal;
    }
}

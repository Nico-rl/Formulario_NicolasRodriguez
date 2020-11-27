package cl.santotomas.formulario;

public class Utilidades {

    public static final String TABLA_USUARIO="usuario";
    public static final String CAMPO_NOMBRE="nombre";
    public static final String CAMPO_APELLIDO="apellido";
    public static final String CAMPO_NUMEROTARJETA="numeroTarjeta";
    public static final String CAMPO_MESTARJETA="mesTARJETA";
    public static final String CAMPO_ANIOTARJETA="anioTarjeta";
    public static final String CAMPO_CODIGOTARJETA="codigoTarjeta";
    public static final String CAMPO_CALLENUMERO="calleNumero";
    public static final String CAMPO_CIUDAD="ciudad";
    public static final String CAMPO_ESTADO="estado";
    public static final String CAMPO_CODIGOPOSTAL="codigoPostal";

    public static final String CREAR_TABLA_USUARIO="CREATE TABLE "+TABLA_USUARIO+" ("+CAMPO_NOMBRE+" TEXT, "+CAMPO_APELLIDO+" TEXT, "+CAMPO_NUMEROTARJETA+" INTEGER, "+CAMPO_MESTARJETA+" TEXT, "+CAMPO_ANIOTARJETA+" INTEGER, "+CAMPO_CODIGOTARJETA+" INTEGER, "+CAMPO_CALLENUMERO+" TEXT, "+CAMPO_CIUDAD+" TEXT, "+CAMPO_ESTADO+" TEXT, "+CAMPO_CODIGOPOSTAL+" INTEGER) ";


}

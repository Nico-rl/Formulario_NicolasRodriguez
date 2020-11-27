package cl.santotomas.formulario;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegistroUsuariosActivity extends AppCompatActivity {

    EditText campoNombre,campoApellido,campoNumeroTarjeta,campoMesTarjeta,campoAnioTarjeta,campoCodigoTarjeta,campoCalleNumero,campoCiudad,campoEstado,campoCodigoPostal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        campoNombre= (EditText) findViewById(R.id.campoNombre);
        campoApellido= (EditText) findViewById(R.id.campoApellido);
        campoNumeroTarjeta= (EditText) findViewById(R.id.campoNumeroTarjeta);
        campoMesTarjeta= (EditText) findViewById(R.id.campoMesTarjeta);
        campoAnioTarjeta= (EditText) findViewById(R.id.campoAnioTarjeta);
        campoCodigoTarjeta= (EditText) findViewById(R.id.campoCodigoTarjeta);
        campoCalleNumero= (EditText) findViewById(R.id.campoCalleNumero);
        campoCiudad= (EditText) findViewById(R.id.campoCiudad);
        campoEstado= (EditText) findViewById(R.id.campoEstado);
        campoCodigoPostal= (EditText) findViewById(R.id.campoCodigoPostal);




    }

    public void onClick(View view) {
        registrarUsuarios();

    }

    private void registrarUsuarios(){

        ConexionSQLiteHelper conn=new ConexionSQLiteHelper(this,"bd usuarios",null,1);

        SQLiteDatabase db=conn.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(Utilidades.CAMPO_NOMBRE,campoNombre.getText().toString());
        values.put(Utilidades.CAMPO_APELLIDO,campoApellido.getText().toString());
        values.put(Utilidades.CAMPO_NUMEROTARJETA,campoNumeroTarjeta.getText().toString());
        values.put(Utilidades.CAMPO_MESTARJETA,campoMesTarjeta.getText().toString());
        values.put(Utilidades.CAMPO_ANIOTARJETA,campoAnioTarjeta.getText().toString());
        values.put(Utilidades.CAMPO_CODIGOTARJETA,campoCodigoTarjeta.getText().toString());
        values.put(Utilidades.CAMPO_CALLENUMERO,campoCalleNumero.getText().toString());
        values.put(Utilidades.CAMPO_CIUDAD,campoCiudad.getText().toString());
        values.put(Utilidades.CAMPO_ESTADO,campoEstado.getText().toString());
        values.put(Utilidades.CAMPO_CODIGOPOSTAL,campoCodigoPostal.getText().toString());

   
    }





}

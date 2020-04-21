package electrolecheria.example.notesapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        final EditText etusuario = findViewById(R.id.etusuario);
        final EditText etclave = findViewById(R.id.etclave);
        Button btlogin = findViewById(R.id.btlogin);

        btlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Username = etusuario.getText().toString();
                String Password = etclave.getText().toString();
                if(Username.equals("Fernando")&& Password.equals("1234")){
                    Intent intent = new Intent(LoginActivity.this,NotesActivity.class);
                    intent.putExtra("Username",Username);
                    intent.putExtra("Password",Password);
                    startActivity(intent);

                }else{
                    Toast.makeText(LoginActivity.this,"Ingreso Incorrecto",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

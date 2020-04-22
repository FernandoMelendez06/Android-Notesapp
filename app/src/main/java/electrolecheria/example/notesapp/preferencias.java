package electrolecheria.example.notesapp;

import android.content.Context;
import android.content.SharedPreferences;

public class preferencias {
    private final String PREF_NAME = "prefs_notes"; // atributos
    private Context ctx;

    //constructor
    public preferencias(Context ctx){

        this.ctx=ctx;
    }

// metodos

    public Boolean getPref(String key){
        SharedPreferences prefs = ctx.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return prefs.getBoolean(key,false);

    }
 public void setPref(String key, Boolean value){


        SharedPreferences.Editor editor = ctx.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE).edit();
        editor.putBoolean(key,value);
        editor.apply();
 }

}

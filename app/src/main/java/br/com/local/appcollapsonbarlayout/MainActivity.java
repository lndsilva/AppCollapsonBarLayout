package br.com.local.appcollapsonbarlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView bancoId, ideaisId, adicionarId, linksId, wifiId;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bancoId = findViewById(R.id.bancoId);
        ideaisId = findViewById(R.id.ideiasId);
        adicionarId = findViewById(R.id.adicionarId);
        linksId = findViewById(R.id.linksId);
        wifiId = findViewById(R.id.wifiId);
        fab = findViewById(R.id.fab);

        //adicionando clique nos objetos

        bancoId = findViewById(R.id.bancoId);
        ideaisId = findViewById(R.id.ideiasId);
        adicionarId = findViewById(R.id.adicionarId);
        linksId = findViewById(R.id.linksId);
        wifiId = findViewById(R.id.wifiId);
        fab = findViewById(R.id.fab);

        //adicionando clique nos objetos

        bancoId.setOnClickListener(this);
        ideaisId.setOnClickListener(this);
        adicionarId.setOnClickListener(this);
        linksId.setOnClickListener(this);
        wifiId.setOnClickListener(this);
        fab.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {
            case R.id.bancoId:
                i = new Intent(getApplicationContext(), Bancos_Activity.class);
                startActivity(i);
                break;
            case R.id.ideiasId:
                i = new Intent(getApplicationContext(), Ideias_Activity.class);
                startActivity(i);
                break;
            case R.id.adicionarId:
                i = new Intent(getApplicationContext(), Adicionar_Activity.class);
                startActivity(i);
                break;
            case R.id.linksId:
                i = new Intent(getApplicationContext(), Links_Activity.class);
                startActivity(i);
                break;
            case R.id.wifiId:
                i = new Intent(getApplicationContext(), Wifi_Activity.class);
                startActivity(i);
                break;
            case R.id.fab:
                Toast.makeText(getApplicationContext(),
                        "Cliquei no FAB",
                        Toast.LENGTH_SHORT).show();
                break;
        }
    }
}

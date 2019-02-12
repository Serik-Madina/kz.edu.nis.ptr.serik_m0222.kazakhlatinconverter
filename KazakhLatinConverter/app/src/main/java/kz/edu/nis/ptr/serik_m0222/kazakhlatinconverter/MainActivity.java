package kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.Button;
import android.widget.EditText;

import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    KeyboardButtonOnClickListener keyboardButtonOnClickListener;
    BackSpaceButtonOnClickListener backSpaceButtonOnClickListener;
    AddToDictButtonOnClickListener addToDictButtonOnClickListener;

    Button button19;
    Button button18;
    Button button78;
    Button button17;
    Button button16;
    Button button14;
    Button button13;
    Button button12;
    Button button11;
    Button button38;
    Button button37;
    Button button35;
    Button button34;
    Button button33;
    Button button25;
    Button button24;
    Button button23;
    Button button22;
    Button button21;
    Button button20;
    Button button51;
    Button button50;
    Button button49;
    Button button48;
    Button button47;
    Button button46;
    Button button45;
    Button button44;
    Button button43;
    Button button42;
    Button button41;
    Button button74;
    Button button73;
    Button button72;
    Button button71;
    Button button70;
    Button button69;
    Button button68;
    Button button67;
    Button button66;
    Button button2;
    Button button76;
    Button button75;
    Button buttonAddToDict;
    EditText editText8;
    TextView textView8;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        TableLayout table = new TableLayout(this);

        table.setStretchAllColumns(true);
        table.setShrinkAllColumns(true);
        setContentView(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.string.navigation_drawer_open, kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



        editText8 = (EditText) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.editText8);
        textView8 = (TextView) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.textView8);
        keyboardButtonOnClickListener = new KeyboardButtonOnClickListener(editText8, textView8);
        backSpaceButtonOnClickListener = new BackSpaceButtonOnClickListener(editText8, textView8);
        addToDictButtonOnClickListener = new AddToDictButtonOnClickListener(this, editText8, textView8);

        editText8.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                textView8.setText(Tools.convertKazToLatin("" + editText8.getText()));
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });




        fab = (FloatingActionButton) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.fab);
        fab.setOnClickListener(new EmailButtonOnClickListener(this));

        button19 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button19);
        button19.setOnClickListener(keyboardButtonOnClickListener);

        button18 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button18);
        button18.setOnClickListener(keyboardButtonOnClickListener);

        button78 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button78);
        button78.setOnClickListener(keyboardButtonOnClickListener);

        button17 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button17);
        button17.setOnClickListener(keyboardButtonOnClickListener);

        button16 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button16);
        button16.setOnClickListener(keyboardButtonOnClickListener);

        button14 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button14);

        button14.setOnClickListener(keyboardButtonOnClickListener);

        button13 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button13);
        button13.setOnClickListener(keyboardButtonOnClickListener);

        button18.setOnClickListener(keyboardButtonOnClickListener);

        button12 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button12);
        button12.setOnClickListener(keyboardButtonOnClickListener);

        button11 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button11);

        button11.setOnClickListener(keyboardButtonOnClickListener);

        button38 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button38);
        button38.setOnClickListener(keyboardButtonOnClickListener);

        button37 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button37);
        button37.setOnClickListener(keyboardButtonOnClickListener);

        button35 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button35);
        button35.setOnClickListener(keyboardButtonOnClickListener);

        button34 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button34);
        button34.setOnClickListener(keyboardButtonOnClickListener);

        button33 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button33);
        button33.setOnClickListener(keyboardButtonOnClickListener);

        button25 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button25);
        button25.setOnClickListener(keyboardButtonOnClickListener);

        button24 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button24);
        button24.setOnClickListener(keyboardButtonOnClickListener);

        button23 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button23);
        button23.setOnClickListener(keyboardButtonOnClickListener);

        button22 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button22);
        button22.setOnClickListener(keyboardButtonOnClickListener);

        button21 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button21);
        button21.setOnClickListener(keyboardButtonOnClickListener);

        button20 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button20);
        button20.setOnClickListener(keyboardButtonOnClickListener);
        button51 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button51);
        button51.setOnClickListener(keyboardButtonOnClickListener);

        button50 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button50);
        button50.setOnClickListener(keyboardButtonOnClickListener);
        button49 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button49);
        button49.setOnClickListener(keyboardButtonOnClickListener);
        button48 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button48);
        button48.setOnClickListener(keyboardButtonOnClickListener);
        button47 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button47);
        button47.setOnClickListener(keyboardButtonOnClickListener);
        button46 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button46);
        button46.setOnClickListener(keyboardButtonOnClickListener);
        button45 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button45);
        button45.setOnClickListener(keyboardButtonOnClickListener);
        button44 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button44);
        button44.setOnClickListener(keyboardButtonOnClickListener);
        button43 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button43);
        button43.setOnClickListener(keyboardButtonOnClickListener);
        button42 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button42);
        button42.setOnClickListener(keyboardButtonOnClickListener);
        button41 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button41);
        button41.setOnClickListener(keyboardButtonOnClickListener);
        button74 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button74);
        button74.setOnClickListener(keyboardButtonOnClickListener);
        button73 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button73);
        button73.setOnClickListener(keyboardButtonOnClickListener);
        button72 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button72);
        button72.setOnClickListener(keyboardButtonOnClickListener);
        button71 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button71);
        button71.setOnClickListener(keyboardButtonOnClickListener);
        button70 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button70);
        button70.setOnClickListener(keyboardButtonOnClickListener);
        button69 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button69);
        button69.setOnClickListener(keyboardButtonOnClickListener);
        button68 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button68);
        button68.setOnClickListener(keyboardButtonOnClickListener);
        button67 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button67);
        button67.setOnClickListener(keyboardButtonOnClickListener);
        button66 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button66);
        button66.setOnClickListener(keyboardButtonOnClickListener);
        button2 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button2);
        button2.setOnClickListener(keyboardButtonOnClickListener);
        button76 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button76);
        button76.setOnClickListener(keyboardButtonOnClickListener);
        /*button75 = (Button) findViewById(R.id.button75);
        button75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText8.clearComposingText();
                textView8.clearComposingText();*/
        button75 = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.button75);
        button75.setOnClickListener(backSpaceButtonOnClickListener);

        buttonAddToDict = (Button) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.buttonAddToDict);
        buttonAddToDict.setOnClickListener(addToDictButtonOnClickListener);


    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.menu.main, menu);
        return true;
    }

   

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.nav_Latin_alphabet) {
          Intent intent = new Intent(this,Latin.class);
            startActivity(intent);
        } else if (id == kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.nav_my_words) {
            Intent intent = new Intent(this,MyWords.class);
            startActivity(intent);
            } else if (id == kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.nav_pics) {
            Intent intent = new Intent(this,Pictures.class);
            startActivity(intent);

            } else if (id == kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.nav_share) {

            try {
                Intent shareApp = new Intent(Intent.ACTION_SEND);
                shareApp.setType("text/plain");
                shareApp.putExtra(Intent.EXTRA_SUBJECT, "Latin Translator Dictionary");
                String sAux = "\nҚазақ-Латын жазбасының сілтемесі\n\n";
                sAux = sAux + "https://play.google.com/store/apps/details?id=kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter";
                shareApp.putExtra(Intent.EXTRA_TEXT, sAux);
                startActivity(Intent.createChooser(shareApp, "choose one"));
            } catch(Exception e) {
            }
        } else if (id == kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.nav_send) {
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

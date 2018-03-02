package com.lbqm.longbeachquickmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lbqm.longbeachquickmenu.database.DatabaseBeachsideMenu;
/**
 * Created by jin on 25/02/2018.
 */

public class BeachsideMenu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beachside_menu);

        DatabaseBeachsideMenu db = new DatabaseBeachsideMenu();

        // Trying to print
        System.out.println("Beachside: " + db.getMenu(0,0,0));
    }


}

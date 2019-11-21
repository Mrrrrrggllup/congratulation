package wildcodeschool.fr.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.alertButton);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                showAlertDialogButtonClicked();
            }
        });
    }

    public void showAlertDialogButtonClicked() {        // setup the alert builder
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Important messageDescription : ");
        builder.setMessage("I accept to read resources on every step!");        // add the buttons
        builder.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {        // do something like...
                Toast.makeText(MainActivity.this, "Congratulation", Toast.LENGTH_SHORT).show();;
            }
        });
        builder.setNegativeButton("Cancel", null);        // create and show the alert dialog
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
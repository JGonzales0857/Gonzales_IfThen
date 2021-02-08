package mcm.edu.ph.gonzales_ifthen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView lore = findViewById(R.id.txtLore);
        TextView outcome = findViewById(R.id.txtOutcome);

        Button decision1 = findViewById(R.id.btnDecision1);
        Button decision2 = findViewById(R.id.btnDecision2);
        decision1.setOnClickListener(this);
        decision2.setOnClickListener(this);

        lore.setText(
                "You are a MCM student enrolled in the TVL Programming strand. Though you have a lot of free "+
                "time, you also have a lot of modules to finish. You are currently watching a Youtube video on "+
                "bed."
        );

        outcome.setText(
                "At the back of your mind, you know you are procrastinating. Should you go back to work? \n \n"+
                "Decision 1: Stay in bed. \n"+
                "Decision 2: Decide to start doing your modules."
        );


    }
    @Override
    public void onClick(View view){

        TextView outcome = findViewById(R.id.txtOutcome);
        TextView lore = findViewById(R.id.txtLore);

        if(view.getId() == R.id.btnDecision1){
            lore.setText("You stay in bed and continue watching videos. You failed the "+
                        "course because you continued to procrastinate.");
        }
        else if (view.getId() == R.id.btnDecision2){
            lore.setText("You stood up and did your modules. You were able to break the habit of "+
                        "watching videos and you were able to pass this grading.");
            outcome.setText("Congratulations!");

            }
        }


}
        


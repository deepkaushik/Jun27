package edu.nyu.scps.deepali.jun27;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class DeepaliActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deepali);

        //Launch the animation after onCreate is called.
        final TextView preamble = (TextView)findViewById(R.id.preamble);
        final ViewPropertyAnimator preambleAnimator = preamble.animate();
        preambleAnimator.setStartDelay(2500L);   //milliseconds
        preambleAnimator.setDuration(1000L);
        preambleAnimator.rotationXBy(30f);
        preambleAnimator.alpha(1f);

        //Launch the fade-out animation 5 seconds after the end of the fade-in animation.
        preambleAnimator.setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                preambleAnimator.setStartDelay(5000L);
                preambleAnimator.alpha(0f);

                //Launch the logo animation 2.5 seconds after the end of the fade-out animation.
                preambleAnimator.setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        final ImageView logo = (ImageView) findViewById(R.id.logo);
                        ViewPropertyAnimator logoAnimator = logo.animate();
                        logoAnimator.setStartDelay(2500L);
                        logoAnimator.setDuration(10000L);
                        logoAnimator.setInterpolator(new DecelerateInterpolator());
                        logoAnimator.scaleX(0f).scaleY(0f);

                        //Logo appears suddenly at start of logo animation.
                        logoAnimator.setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationStart(Animator animation) {
                                logo.setAlpha(1f);
                            }
                        });

                        logoAnimator.start();
                    }
                });
            }
        });

        preambleAnimator.start();
    }



    public void onAsaClick(View view) {
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName(
                "edu.nyu.scps.asa.jun27",            //name of package
                "edu.nyu.scps.asa.jun27.AsaActivity" //name of class
        );
        intent.setComponent(componentName);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException activityNotFoundException) {
            Toast toast = Toast.makeText(this, activityNotFoundException.toString(), Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void onAbdoulayeClick(View view) {
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName(
                "edu.nyu.scps.abdoulaye.jun27",                  //name of package
                "edu.nyu.scps.abdoulaye.jun27.AbdoulayeActivity" //name of class
        );
        intent.setComponent(componentName);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException activityNotFoundException) {
            Toast toast = Toast.makeText(this, activityNotFoundException.toString(), Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void onAlrickClick(View view) {
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName(
                "edu.nyu.scps.alrick.jun27",               //name of package
                "edu.nyu.scps.alrick.jun27.AlrickActivity" //name of class
        );
        intent.setComponent(componentName);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException activityNotFoundException) {
            Toast toast = Toast.makeText(this, activityNotFoundException.toString(), Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void onDavidClick(View view) {
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName(
                "edu.nyu.scps.david.jun27",              //name of package
                "edu.nyu.scps.david.jun27.DavidActivity" //name of class
        );
        intent.setComponent(componentName);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException activityNotFoundException) {
            Toast toast = Toast.makeText(this, activityNotFoundException.toString(), Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void onDeepaliClick(View view) {
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName(
                "edu.nyu.scps.mark.jun27",                //name of package
                "edu.nyu.scps.deepali.jun27.MarkActivity" //name of class
        );
        intent.setComponent(componentName);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException activityNotFoundException) {
            Toast toast = Toast.makeText(this, activityNotFoundException.toString(), Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void onJaxonClick(View view) {
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName(
                "edu.nyu.scps.jaxon.jun27",              //name of package
                "edu.nyu.scps.jaxon.jun27.JaxonActivity" //name of class
        );
        intent.setComponent(componentName);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException activityNotFoundException) {
            Toast toast = Toast.makeText(this, activityNotFoundException.toString(), Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void onJeffreyClick(View view) {
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName(
                "edu.nyu.scps.jeffrey.jun27",                //name of package
                "edu.nyu.scps.jeffrey.jun27.JeffreyActivity" //name of class
        );
        intent.setComponent(componentName);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException activityNotFoundException) {
            Toast toast = Toast.makeText(this, activityNotFoundException.toString(), Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void onJoeyClick(View view) {
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName(
                "edu.nyu.scps.joey.jun27",             //name of package
                "edu.nyu.scps.joey.jun27.JoeyActivity" //name of class
        );
        intent.setComponent(componentName);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException activityNotFoundException) {
            Toast toast = Toast.makeText(this, activityNotFoundException.toString(), Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void onKeenenClick(View view) {
        Intent intent = new Intent();
        ComponentName componentName = new ComponentName(
                "edu.nyu.scps.keenen.jun27",               //name of package
                "edu.nyu.scps.keenen.jun27.KeenenActivity" //name of class
        );
        intent.setComponent(componentName);
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException activityNotFoundException) {
            Toast toast = Toast.makeText(this, activityNotFoundException.toString(), Toast.LENGTH_LONG);
            toast.show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_deepali, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

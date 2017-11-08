package application.justpets.dal.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    ImageView start1;
    Animation bottom;
    ImageView logoImg;
    ImageView logoNm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //logoImg = (ImageView) findViewById(R.id.logoImage);
        logoNm = (ImageView) findViewById(R.id.logoName);
        start1 = (ImageView) findViewById(R.id.start);
        bottom = AnimationUtils.loadAnimation(this,R.anim.transition);
        start1.setAnimation(bottom);



    }

    public void getStarted(View view)
    {
        Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent);
    }
}

package shreyansh.bhavsar.librettoord;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {


    ImageView bookImage,pinImage,libraryImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Hide the ActionBar
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_splash);

        bookImage = (ImageView)findViewById(R.id.bookimage);
        pinImage = (ImageView)findViewById(R.id.pinnimage);
        libraryImage = (ImageView)findViewById(R.id.libraryimage);

        bookImage.animate().alpha(1f).setDuration(1800);
        pinImage.animate().alpha(1f).translationYBy(420f).setDuration(2000);

        new android.os.Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                move();
            }
        },2000);

    }
    void move()
    {
        bookImage.animate().translationYBy(-200f).setDuration(900);
        pinImage.animate().translationYBy(-200f).setDuration(900);
        libraryImage.animate().alpha(1f).setDuration(900);

    }
}

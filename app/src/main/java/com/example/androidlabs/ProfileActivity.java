package com.example.androidlabs;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    static final int REQUEST_IMAGE_CAPTURE = 1;

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            ImageView mImageButton;
            mImageButton.setImageBitmap(imageBitmap);

        }

    }
 (ImageButton)findViewById()

    private Object findViewById() {
    }
    public static final String ACTIVITY_NAME = "PROFILE_ACTIVITY";
Log.e(ACTIVITY_NAME, ProfileActivity);
    //You will have to create a static String variable called ACTIVITY_NAME, and set it equal to the Activity’s name. In this case:


    @Override
   protected void onStop() {
        super.onStop();
        log.w(ACTIVITY_NAME, msg)
    }

    public class onClickListener() {

  }

} // end of main
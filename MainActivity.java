package com.community.rccimagecontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Bitmap> list = new ArrayList<Bitmap>();

    VideoView videoView;
    ImageView image1;

    //protected int splashTime = 3000;
    //TextView tv1;

    int timer = 0;
    int i = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       requestWindowFeature(Window.FEATURE_NO_TITLE);//remove title bar
        getSupportActionBar().hide();//remove title bar
        setContentView(R.layout.activity_main);

        /////////////////////////////////////////////////////////////////////////////////video stuff

        videoView = findViewById(R.id.videoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.join1 ;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();



        //Video Loop
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {

            @Override

            public void onPrepared(MediaPlayer mp) {
                mp.setVolume(0f,0f);
                mp.setLooping(true);

            }
        });



        ////////////////////////////////////////////////////////////////////////////////////video stuff

        image1 = findViewById(R.id.rathcoolecc1a);


      //  bitmapa = BitmapFactory.decodeResource(this.getResources(), R.drawable.a);
      //  int width = bitmapa.getWidth();
      ///  int height = bitmapa.getHeight();
      //  bitmapa = bitmapa.createScaledBitmap(bitmapa, width*(500/width), height*(500/width),false);
     //  list.add(bitmapa);

        Thread thx = new Thread() {

            @Override

            public void run() {
                createBitmap(R.drawable.a);//see if crashes with large file
                createBitmap(R.drawable.christy);//see if crashes with large file
                createBitmap(R.drawable.rathcoolecc22);//see if crashes with large file
                createBitmap(R.drawable.b);
                createBitmap(R.drawable.c);
                createBitmap(R.drawable.d);
                createBitmap(R.drawable.e);
                createBitmap(R.drawable.f);
                createBitmap(R.drawable.g);
                createBitmap(R.drawable.h);
                createBitmap(R.drawable.rathcoolecc2);
                createBitmap(R.drawable.i);
                createBitmap(R.drawable.j);
                createBitmap(R.drawable.k);
                createBitmap(R.drawable.l);
                createBitmap(R.drawable.m);
                createBitmap(R.drawable.n);
                createBitmap(R.drawable.o);
                createBitmap(R.drawable.p);
                createBitmap(R.drawable.q);
                createBitmap(R.drawable.r);

                createBitmap(R.drawable.s);
                createBitmap(R.drawable.t);
                createBitmap(R.drawable.u);
                createBitmap(R.drawable.v);
                createBitmap(R.drawable.w);
                createBitmap(R.drawable.x);
                createBitmap(R.drawable.y);
                createBitmap(R.drawable.z);
                createBitmap(R.drawable.a2);
                createBitmap(R.drawable.b2);
                createBitmap(R.drawable.c1);
                createBitmap(R.drawable.d1);
                createBitmap(R.drawable.e1);
                createBitmap(R.drawable.f1);
                createBitmap(R.drawable.g1);
                createBitmap(R.drawable.h1);
                createBitmap(R.drawable.i1);
                createBitmap(R.drawable.j1);
                createBitmap(R.drawable.k1);
                createBitmap(R.drawable.l1);


            }
        };
        thx.start();







        //tv1 =(TextView)findViewById(R.id.textView1);

        Thread th = new Thread() {

            @Override

            public void run() {

                try {

                                     while (true) {

                                         Thread.sleep(1000);

                                         timer = timer + 1;

                                         if (timer <= 10) {

                                             runOnUiThread(new Runnable() {
                                                 @Override
                                                 public void run() {


                                                     try {

                                                         //v1.setText(name[timer]);
                                                         image1.setImageBitmap(list.get(i));
                                                     } catch (Exception e) {
                                                         e.printStackTrace();
                                                     }

                                                 }
                                             });
                                             // waited += 100;
                                         }
                                         else if(timer >10){

                                             if(i<list.size()-1){
                                                 i++ ;
                                             }
                                             else {
                                                 i = 0;
                                             }

                                             timer = 0;
                                         }
                                     }


                    //for(timer = 0;timer < 7;timer++) {

                    //int waited = 0;

                   /* while (true) {

                        Thread.sleep(1000);

                        timer = timer + 1;

                        if (timer < 10) {

                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {


                                    try {

                                        //v1.setText(name[timer]);
                                        image1.setImageResource(R.drawable.a);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }

                                }
                            });
                            // waited += 100;
                        }

                        if (timer > 10 && timer < 20) {
                            runOnUiThread(new Runnable() {


                                @Override
                                public void run() {


                                    try {
                                        //v1.setText(name[timer]);
                                        image1.setImageResource(R.drawable.rathcoolecc2);

                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }

                                }
                            });

                            //waited += 100;
                        }
                        if (timer > 20 && timer < 30) {
                            runOnUiThread(new Runnable() {

                                @Override

                                public void run() {


                                    try {
                                        //v1.setText(name[timer]);
                                        image1.setImageResource(R.drawable.rathcoolecc3);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }

                            });
                            //waited += 100;
                        }
                        if (timer > 30 && timer < 40) {
                            runOnUiThread(new Runnable() {

                                @Override

                                public void run() {


                                    try {
                                        //v1.setText(name[timer]);
                                        image1.setImageResource(R.drawable.rathcoolecc4);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            });

                            //waited += 100;
                        }
                        if (timer > 40 && timer < 50) {
                            runOnUiThread(new Runnable() {

                                @Override

                                public void run() {


                                    try {
                                        //v1.setText(name[timer]);
                                        image1.setImageResource(R.drawable.rathcoolecc5);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            });

                            //waited += 100;
                        }
                        if (timer > 50 && timer < 60) {
                            runOnUiThread(new Runnable() {

                                @Override
                                public void run() {


                                    try {
                                        //v1.setText(name[timer]);
                                        image1.setImageResource(R.drawable.rathcoolecc6);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            });
                            //waited += 100;
                        }
                        if (timer > 60 && timer < 70) {
                            runOnUiThread(new Runnable() {

                                @Override
                                public void run() {


                                    try {
                                        //v1.setText(name[timer]);
                                        image1.setImageResource(R.drawable.rathcoolecc7);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            });

                            //waited += 100;
                        }
                        if (timer > 70 && timer < 80) {
                            runOnUiThread(new Runnable() {

                                @Override

                                public void run() {


                                    try {
                                        //v1.setText(name[timer]);
                                        image1.setImageResource(R.drawable.rathcoolecc8);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            });

                            //waited += 100;
                        }
                        if (timer > 80 && timer < 90) {
                            runOnUiThread(new Runnable() {

                                @Override

                                public void run() {


                                    try {
                                        //v1.setText(name[timer]);
                                        image1.setImageResource(R.drawable.rathcoolecc9);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            });

                            //waited +=100;
                        }
                        if (timer > 90 && timer < 100) {
                            runOnUiThread(new Runnable() {

                                @Override

                                public void run() {


                                    try {
                                        //v1.setText(name[timer]);
                                        image1.setImageResource(R.drawable.b);
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            });

                            //waited += 100;
                        }
                        if(timer>100){//this loops it
                            timer = 0;
                        }
                    }*/


                } catch (InterruptedException e) {
                }
            }

        };


        th.start();
    }//

    @Override

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    public void createBitmap(int id){
        Bitmap bitmap;

        // Get the dimensions of the bitmap
        BitmapFactory.Options bmOptions = new BitmapFactory.Options();
        bmOptions.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(this.getResources(), id, bmOptions);
        int photoW = bmOptions.outWidth;
        int photoH = bmOptions.outHeight;



        float scaleFactor = photoW/500;
        int scaleFFactor = (int)scaleFactor;

        // Decode the image file into a Bitmap sized smaller
        bmOptions.inJustDecodeBounds = false;
        bmOptions.inSampleSize = scaleFFactor;

        bitmap = BitmapFactory.decodeResource(this.getResources(), id, bmOptions);

        list.add(bitmap);




    }

    @Override

    public void onResume() {
        super.onResume();
        videoView.start();
    }


}

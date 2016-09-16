package com.example.cary.oucls;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends android.app.Activity {

    private ImageButton clsWeb;
    private ImageButton clsAdvisor;
    private ImageButton clsCanvas;
    private ImageButton clsWriting;
    private ImageButton clsResource;
    private ImageButton clsBlog;
    //private ImageButton clsWeb;
    private ImageButton clsFAQ;
    private ImageButton clsHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this.requestWindowFeature(android.view.Window.FEATURE_NO_TITLE);

        clsWeb = (ImageButton) findViewById(R.id.imageButClsWeb);
        clsAdvisor = (ImageButton) findViewById(R.id.imageButClsAdvisor);
        clsCanvas = (ImageButton) findViewById(R.id.imageButCanvas);
        clsWriting = (ImageButton) findViewById(R.id.imageButWriting);
        clsResource = (ImageButton) findViewById(R.id.imageButClsRecources);
        clsBlog = (ImageButton) findViewById(R.id.imageButBlog);
        //clsWeb = (ImageButton) findViewById(R.id.imageButTBA);
        clsFAQ = (ImageButton) findViewById(R.id.imageButFAQ);
        clsHelp = (ImageButton) findViewById(R.id.imageButHelp);

        clsWeb.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.ou.edu/cls.html");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        }  );

        clsAdvisor.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.ou.edu/content/cls/contact_cls/advisors.html");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        }  );

        clsAdvisor.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.ou.edu/content/cls/contact_cls/advisors.html");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        }  );

        clsCanvas.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://learn.ou.edu/transition/");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        }  );

        clsWriting.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.ou.edu/writingcenter.html");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        }  );

        clsResource.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://guides.ou.edu/cls");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        }  );

     /*   clsAdvisor.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://www.ou.edu/content/cls/contact_cls/advisors.html");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        }  );*/

        clsFAQ.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://cols.ou.edu/helpdesk/students/");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        }  );

        clsHelp.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://cols.ou.edu/helpdesk/students/");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        }  );
    }
}

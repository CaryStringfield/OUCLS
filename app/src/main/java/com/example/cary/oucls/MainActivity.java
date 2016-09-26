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
    private ImageButton clsLibrary;
    private ImageButton clsFAQ;
    private ImageButton clsHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clsWeb = (ImageButton) findViewById(R.id.imageButClsWeb);
        clsAdvisor = (ImageButton) findViewById(R.id.imageButClsAdvisor);
        clsCanvas = (ImageButton) findViewById(R.id.imageButCanvas);
        clsWriting = (ImageButton) findViewById(R.id.imageButWriting);
        clsResource = (ImageButton) findViewById(R.id.imageButClsRecources);
        clsBlog = (ImageButton) findViewById(R.id.imageButBlog);
        clsLibrary = (ImageButton) findViewById(R.id.imageButLibrary);
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
                Uri uri = Uri.parse("http://cols.ou.edu/canvas/studentresources");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        }  );

        clsBlog.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://clsblog.ou.edu");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        }  );

        clsLibrary.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://guides.ou.edu/cls");
                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        }  );

        clsFAQ.setOnClickListener(new android.view.View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("http://cols.ou.edu/canvas/faq/student.html");
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

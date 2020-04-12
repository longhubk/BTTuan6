package com.example.bttuan6;

import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class thirdActivity extends AppCompatActivity {

    List<ContactModel> contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);



        contacts = new ArrayList<>();
        contacts.add(new ContactModel("Edurila.com" , "$19 Only (First 10 spots) - Bestselling " +
                "Are you looking to Learn Web Designin..", "12:34 PM", true));
        contacts.add(new ContactModel("Kish Abad" , "Help make Campaign Monitor better Let +" +
                "us know your thoughts! No Images..", "11:22 AM", true));
        contacts.add(new ContactModel("Tuto.com" , "8h de information gratuite et les nouvea.. "+
                "Photoshop, SEO, Blender, CSS, WordPre..", "11:04 AM", true));
        contacts.add(new ContactModel("support" , "Social network suport every one to create som..+" +
                "We belive you take part in with us..", "11:01 AM", true));
        contacts.add(new ContactModel("Matt form lonic" , "The new lonic Creator is Here! + " +
                "Announcing the all new creator, building the system..", "10:45 AM", true));
        contacts.add(new ContactModel("Brach Chars" , "This branch from Ytaly since 1990! + " +
                "We sell all things in the world.", "10:16 AM", true));
        contacts.add(new ContactModel("Horo Film" , "If you feeling so sad or boring! + " +
                "You must watch our film..", "10:23 AM", true));
        contacts.add(new ContactModel("Learn Eng" , "Ecorp English is the best com + " +
                "You just have to pay very small money for this course..", "9:20 AM", true));
        contacts.add(new ContactModel("Watch TV" , "The new lonic Creator is Here! + " +
                "Announcing the all new creator, building the system..", "8:34 AM", true));
        contacts.add(new ContactModel("Internet now" , "The new lonic Creator is Here! + " +
                "Announcing the all new creator, building the system..", "7:43 AM", true));
        contacts.add(new ContactModel("Parasonic" , "The new Loundry for every family + " +
                "It is very dificult to washing your clothe", "5:04 AM", true));
        contacts.add(new ContactModel("Yamaha" , "If you do not know how to choose the moto "+
                "We will help you find your love", "4:04 AM", true));
//        LeftRightContactAdapter adapter = new LeftRightContactAdapter(contacts);
        ContactAdapter adapter = new ContactAdapter(contacts);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }
}

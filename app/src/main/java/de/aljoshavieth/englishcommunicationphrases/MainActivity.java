package de.aljoshavieth.englishcommunicationphrases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public static String[] phrases = {"What is your position?", "Well, first of all…", "I believe very strongly that…", "Sorry to interrupt you, but…", "Can I just put in here and make the point that…?", "Could I just finish what I was saying?", "You don’t mind…", "Oh, what you mean is..." , "I absolutely agree.", "I can go along with that.", "I just don’t think it´s as simple as that.", "There are several aspects of this.", "Well, yes, that’s true, however…", "Perhaps I didn’t express myself well there…", "That may be true, yes.", "Even if that is the case, …", "For instance, take…", "To illustrate this, look at…", "I’m behind you all the way here.", "Furthermore…", "Whats also important is that…", "So, as a result…", "I´d like to raise another different point here.", "We haven´t mentioned XXX yet.", "Moreover…", "I have always believed that…", "From my point of view, it´s…", "To me this seems quite ridiculous", "Have you ever thought about…?", "I´d prefer to…", "Let me make this crystal clear...", "There are a number of reasons, for example…", "You have hit the nail on the head because…", "You can’t be serious!", "You don’t expect me to accept that, do you?", "With due respect…", "What you are saying sounds good, but it isn´t!", "Let´s be serious about that, shall we?", "No one in their right mind would disagree that…", "The facts are clear, so let´s be clear about this.", "Now wait a minute.", "Is it all right for me to say something?", "You amaze me.", "As I was saying before I was so rudely interrupted…", "This may be so but – and there is a big but –", "I have said it before and i will say it again…", "There is some common ground: we both agree…", "It has become quite clear by now that…", "On this we can agree. As for the rest, let´s agree to disagree."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                phrases );
        listView.setAdapter(arrayAdapter);
    }
}

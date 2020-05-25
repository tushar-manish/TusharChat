package com.example.tusharchat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import java.util.ArrayList;

public class Chat extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerAdapter recyclerAdapter;
    private Button btn;
    private LinearLayout relativeLayout;
    private ChatArray[] chatArray = new ChatArray[30];
    private int p = 0;

    private ArrayList<ChatArray> names = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        btn = (Button) findViewById(R.id.send);

        chatArray[0] = new ChatArray(1, "hi", 1, 0);
        chatArray[1] = new ChatArray(1, "Tushar Gupta", 1, 0);
        chatArray[2] = new ChatArray(2, "hello!!", 1, 0);
        chatArray[3] = new ChatArray(1, "how are you", 1, 0);
        chatArray[4] = new ChatArray(2, "fine", 1, 0);
        chatArray[5] = new ChatArray(2, "how are you", 1, 0);
        chatArray[6] = new ChatArray(1, "fine", 1, 0);
        chatArray[7] = new ChatArray(2, "how are you spending your time in quarantine!", 1, 0);
        chatArray[8] = new ChatArray(1, "It is hard but for nation it is important", 1, 0);
        chatArray[9] = new ChatArray(2, "yes you are correct", 1, 0);
        chatArray[10] = new ChatArray(2, "it is good to listen from you that how responsible you are", 1, 0);
        chatArray[11] = new ChatArray(1, "thanks", 1, 0);
        chatArray[12] = new ChatArray(1, "you can spend this time in some innovative things", 1, 0);
        chatArray[13] = new ChatArray(2, "yes you are right", 1, 0);
        chatArray[14] = new ChatArray(2, "", 2, R.drawable.ic_surround_sound_black_24dp);
        chatArray[15] = new ChatArray(2, "i am learning music tuning", 1, 0);
        chatArray[16] = new ChatArray(1, "ooh wow", 1, 0);
        chatArray[17] = new ChatArray(2, "hahah", 1, 0);



        recyclerAdapter = new RecyclerAdapter(names);
        recyclerView.setAdapter(recyclerAdapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p < 18) {
                    names.add(chatArray[p]);
                    recyclerView.scrollToPosition(p);
                    recyclerAdapter.notifyItemInserted(p);
                    p++;
                }
            }
        });
    }
}
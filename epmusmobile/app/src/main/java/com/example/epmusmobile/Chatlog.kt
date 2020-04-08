package com.example.epmusmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.epmusmobile.R
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Item
import com.xwray.groupie.ViewHolder
import kotlinx.android.synthetic.main.activity_chatlog.*
import kotlinx.android.synthetic.main.chat_from_row.view.*
import kotlinx.android.synthetic.main.chat_from_row.view.textView
import kotlinx.android.synthetic.main.chat_to_row.view.*

class Chatlog : AppCompatActivity() {

    companion object{
        val TAG = "ChatLog"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chatlog)

        supportActionBar?.title = "Chat Log"

        setupDummyData()

        send_button_chat_log.setOnClickListener{
            Log.d(TAG, "Attemp to send message...")
        }
    }


    private fun setupDummyData(){
        val adapter = GroupAdapter<ViewHolder>()

        adapter.add(ChatFromItem("Bonjour c'est votre physio"))
        adapter.add(ChatToItem("Enfin! fait 1 semaine que j'attends"))
        adapter.add(ChatFromItem("N'oubliez pas votre rendez-vous de 10h"))
        adapter.add(ChatToItem("Désolé j'ai bosser tard ete pas entendu mon cadran..."))
        adapter.add(ChatFromItem("C'est votre évaluation qui va prendre cher"))
        adapter.add(ChatToItem("je sais et c'est justifier"))
        adapter.add(ChatFromItem("On se voit demain"))
        adapter.add(ChatToItem("Ca marche!"))

        recyclerview_chat_log.adapter = adapter
    }
}

class ChatFromItem(val text: String): Item<ViewHolder>() {
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.textView.text = text
    }
    override fun getLayout(): Int {
        return R.layout.chat_from_row
    }

}

class ChatToItem(val text: String): Item<ViewHolder>() {
    override fun bind(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemView.textView.text = text
    }
    override fun getLayout(): Int {
        return R.layout.chat_to_row
    }

}
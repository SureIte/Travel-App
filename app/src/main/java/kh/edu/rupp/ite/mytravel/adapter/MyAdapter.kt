package kh.edu.rupp.ite.mytravel.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import kh.edu.rupp.ite.mytravel.R
import kh.edu.rupp.ite.mytravel.User

class MyAdapter(private val context : Activity,private val arrayList: ArrayList<User>) : ArrayAdapter<User>(context,
        R.layout.fragment_home,arrayList) {

    @SuppressLint("MissingInflatedId")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.fragment_home,null)


        val imageView : ImageView = view.findViewById(R.id.listKohkong_pic)
        val postName : TextView = view.findViewById(R.id.textNamekohkong)
        val postAll : TextView = view.findViewById(R.id.showPost)
        val showAllPost : TextView = view.findViewById(R.id.showPostAll)


        imageView.setImageResource(arrayList[position].imageId)
        postName.text = arrayList[position].nameprovince
        postAll.text = arrayList[position].showpost
        showAllPost.text = arrayList[position].showPostAll


        return view
    }
}
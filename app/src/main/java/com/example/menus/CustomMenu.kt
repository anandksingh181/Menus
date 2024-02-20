package com.example.menus

import android.content.Context
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast

class CustomMenu {

    fun customMenu(context : Context , view : View){
         val pop = PopupMenu(context,view)
        pop.inflate(R.menu.menu)

        pop.setOnMenuItemClickListener {
            when (it!!.itemId){
                R.id.edit -> {
                    Toast.makeText(context, "clicked Edited", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.delete ->{
                    Toast.makeText(context, "clicked Deleted", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.shared ->{
                    Toast.makeText(context, "clicked Shared", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

        try {
            val fieldMenuPopUp = PopupMenu::class.java.getDeclaredField("mPopup")
            fieldMenuPopUp.isAccessible = true
            val mPopup =  fieldMenuPopUp.get(pop)
            mPopup.javaClass
                .getDeclaredField("setForceShowIcon") // Fix typo here
//                .invoke(mPopup, true)
        } catch (e: Exception) {
            // Handle the exception if needed
        } finally {
            pop.show()

        }


    }
}



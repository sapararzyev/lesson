package com.example.lesson

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment


fun AppCompatActivity.addFragment(fragment: Fragment) {
    supportFragmentManager.beginTransaction().add(R.id.conteynr, fragment).commit()
}
fun SekondFragment.replaceFragment2(fragment:Fragment) {
    requireActivity().supportFragmentManager
        .beginTransaction().replace(R.id.conteynr, fragment).commit()
}



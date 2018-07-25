package com.example.vikaslandge.fragmenttest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



          var fManager = supportFragmentManager
        var tx =fManager.beginTransaction()
        tx.add(R.id.frag1,HomeFrag())
        tx.commit()

        homebtn.setOnClickListener({

            var tx =fManager.beginTransaction()
            tx.replace(R.id.frag1,HomeFrag())
            tx.addToBackStack(null)
            tx.commit()
        })

        redbtn.setOnClickListener({

           var tx =fManager.beginTransaction()
            tx.replace(R.id.frag1,red())
            tx.addToBackStack(null)
            tx.commit()
        })
        yellowbtn.setOnClickListener({

            var tx = fManager.beginTransaction()
            tx.replace(R.id.frag1, yellow())
            tx.addToBackStack(null)
            tx.commit()
        })
        greenbtn.setOnClickListener({

            var tx =fManager.beginTransaction()
            tx.replace(R.id.frag1,green())
            tx.addToBackStack(null)
            tx.commit()
        })
        orangebtn.setOnClickListener({

            var tx =fManager.beginTransaction()
            tx.replace(R.id.frag1,orange())
            tx.addToBackStack(null)
            tx.commit()
        })


    }

}

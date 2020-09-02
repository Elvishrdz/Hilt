package com.eahm.jetpackhilt.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.eahm.jetpackhilt.R
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var message : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Getting Started
         * 1. Add the complement to the project (See build.gradle project classpath)
         * 2. Add the dependencies to the project (See build.gradle app dependencies)
         *  2.1 Add the plugins
         *  2.2 Add the support to java8
         *
         * 3. Override the Application class to use Hilt. Mandatory. (See HiltApplication.kt)
         * 4. Use the @AndroidEntryPoint annotation to specify the classes that will RECEIVE the
         *    dependencies. This android classes can receive dependencies:
         *    - Application
         *    - Activity
         *    - Fragment
         *    - View
         *    - Service
         *    - BroadcastReceiver
         *  4.1 Now to receive the dependencies uses the @Inject Annotation in the classes with
         *      the @AndroidEntryPoint annotation.
         *      - Your variables can NOT be private or a compiler error will thrown
         *
         *
         *
         */

        root.setOnClickListener{
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}
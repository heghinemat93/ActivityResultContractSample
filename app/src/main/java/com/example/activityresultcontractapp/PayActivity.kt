package com.example.activityresultcontractapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContract
import javax.xml.transform.Result

class PayActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_charge)
    }

    class PayContract : ActivityResultContract<Coffee, Payment>() {
        override fun createIntent(context: Context, input: Coffee?): Intent {
            return Intent().apply {
                putExtra("cups", input?.cups)
                putExtra("type", input?.type)
            }
        }

        override fun parseResult(resultCode: Int, intent: Intent?) = Payment(
            success = resultCode == RESULT_OK)
    }


}
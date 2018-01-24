package Vinicius.Dabadia

import android.os.Bundle

import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_confirmacao.*
import kotlinx.android.synthetic.main.activity_main.*


class activity_confirmacao : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_confirmacao)


            val bundle = getIntent().getExtras()

            tv_confirmacao.setText("Seu login é "+bundle.getString("login")+"" +
                    "\n\nSua senha é "+bundle.getString("senha"))


    }

}

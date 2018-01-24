package Vinicius.Dabadia

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_reset.setOnClickListener {

            login.setText("")
            senha.setText("")
            Toast.makeText(this@MainActivity, "Limpado do sucesso!!", Toast.LENGTH_LONG).show()
        }


        btn_logar.setOnClickListener {

            if(login.text.toString().equals("teste")&&senha.text.toString().equals("teste"))
            {
                Toast.makeText(this@MainActivity, "Login feito com sucesso!!", Toast.LENGTH_LONG).show()
                val intent = Intent(this,activity_confirmacao::class.java)
                intent.putExtra("login", login.text.toString())
                intent.putExtra("senha", senha.text.toString())
                startActivity(intent)
            }
            else
                Toast.makeText(this@MainActivity, login.text.toString(), Toast.LENGTH_LONG).show()
        }

        fta_Button.setOnClickListener{


            Toast.makeText(this@MainActivity, "Você interragiu com o Floating Button", Toast.LENGTH_LONG).show()
        }



    }


    override fun onStart() {
        Toast.makeText(this@MainActivity, "Metodo onStart", Toast.LENGTH_LONG).show()
        super.onStart()
    }

    override fun onRestart() {
        Toast.makeText(this@MainActivity, "Metodo onRestart", Toast.LENGTH_LONG).show()
        super.onRestart()
    }

    override fun onResume() {
        Toast.makeText(this@MainActivity, "Metodo onResume", Toast.LENGTH_LONG).show()
        super.onResume()
    }

    override fun onPause(){
        Toast.makeText(this@MainActivity, "Metodo onPause", Toast.LENGTH_LONG).show()
        super.onPause()
    }

    override fun onStop() {
        Toast.makeText(this@MainActivity, "Metodo OnStop", Toast.LENGTH_LONG).show()
        super.onStop()
    }


}

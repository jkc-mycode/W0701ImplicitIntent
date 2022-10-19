package kr.ac.kumoh.s20201414.w0701implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20201414.w0701implicitintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        // setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.btnHomepage.setOnClickListener{
            val uri = Uri.parse("http://www.naver.com")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        binding.btnMap.setOnClickListener{
            //val uri = Uri.parse("geo:36.145014,128.393047?z=17")
            val uri = Uri.parse("geo:0,0?z=17&q=동대구역")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        binding.btnTelephone.setOnClickListener{
            //val uri = Uri.parse("geo:36.145014,128.393047?z=17")
            val uri = Uri.parse("sms:010-6238-4253")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

    }
}
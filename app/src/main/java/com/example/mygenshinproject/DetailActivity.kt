package com.example.mygenshinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_BANNER = "Extra_banner"
        const val EXTRA_NAME ="Extra_name"
        const val EXTRA_DETAIL ="Extra_detail"
        const val EXTRA_Affilliation="Extra_affiliation"
        const val EXTRA_BASEHP="Extra_HP"
        const val EXTRA_BASEATK="Extra_ATK"
        const val EXTRA_BASEDEF="Extra_DEF"
        const val EXTRA_ELEMENT="Extra_Element"
        const val EXTRA_STORY="Extra_Story"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setTitle("Character Detail")

        val imgDataReceived: ImageView = findViewById(R.id.img_banner)
        val tvDataNameReceived: TextView = findViewById(R.id.tv_char_name)
        val tvDataDetailReceived: TextView = findViewById(R.id.tv_char_det)
        val tvDataAffiliationReceived: TextView = findViewById(R.id.tv_affiliation)
        val tvDataBaseHPReceived: TextView = findViewById(R.id.tv_baseHP)
        val tvDataBaseAtkReceived: TextView = findViewById(R.id.tv_baseATK)
        val tvDataBaseDefReceived: TextView = findViewById(R.id.tv_baseDEF)
        val tvDataElementReceived: TextView = findViewById(R.id.tv_Element)
        val tvDataStoryReceived: TextView = findViewById(R.id.tv_story)

        val banner = intent.getIntExtra(EXTRA_BANNER, 0)
        imgDataReceived.setImageResource(banner)


        val name = intent.getStringExtra(EXTRA_NAME)
        val nameText = "$name"
        tvDataNameReceived.text = nameText

        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val detailText = "$detail"
        tvDataDetailReceived.text = detailText

        val affiliation = intent.getStringExtra(EXTRA_Affilliation)
        val affiliationText = "$affiliation"
        tvDataAffiliationReceived.text = affiliationText

        val baseHP = intent.getStringExtra(EXTRA_BASEHP)
        val baseHPText = "$baseHP"
        tvDataBaseHPReceived.text = baseHPText

        val baseAtk = intent.getStringExtra(EXTRA_BASEATK)
        val baseAtkText = "$baseAtk"
        tvDataBaseAtkReceived.text = baseAtkText

        val baseDef = intent.getStringExtra(EXTRA_BASEDEF)
        val baseDefText = "$baseDef"
        tvDataBaseDefReceived.text = baseDefText

        val element = intent.getStringExtra(EXTRA_ELEMENT)
        val elementText = "$element"
        tvDataElementReceived.text = elementText

        val story = intent.getStringExtra(EXTRA_STORY)
        val storyText = "$story"
        tvDataStoryReceived.text = storyText





    }
}



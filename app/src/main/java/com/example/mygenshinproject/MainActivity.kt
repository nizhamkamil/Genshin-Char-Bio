package com.example.mygenshinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvCharacter: RecyclerView
    private var list: ArrayList<Character> = arrayListOf()

    private fun showRecyclerlist(){
        rvCharacter.layoutManager = LinearLayoutManager(this)
        val listCharacterAdapter = ListCharacterAdapter(list)
        rvCharacter.adapter = listCharacterAdapter

        listCharacterAdapter.setOnItemClickCallback(object : ListCharacterAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Character) {
                val moveIntent = Intent(this@MainActivity, DetailActivity::class.java)
                moveIntent.putExtra(DetailActivity.EXTRA_BANNER, data.banner)
                moveIntent.putExtra(DetailActivity.EXTRA_NAME, data.name)
                moveIntent.putExtra(DetailActivity.EXTRA_DETAIL, data.detail)
                moveIntent.putExtra(DetailActivity.EXTRA_Affilliation, data.affiliation)
                moveIntent.putExtra(DetailActivity.EXTRA_BASEHP, data.baseHP)
                moveIntent.putExtra(DetailActivity.EXTRA_BASEATK, data.baseAtk)
                moveIntent.putExtra(DetailActivity.EXTRA_BASEDEF, data.baseDef)
                moveIntent.putExtra(DetailActivity.EXTRA_ELEMENT, data.element)
                moveIntent.putExtra(DetailActivity.EXTRA_STORY, data.story)

                startActivity(moveIntent)
            }
        })
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int){
        when(selectedMode) {
            R.id.Home -> {
                showRecyclerlist()
            }
            R.id.About -> {
                val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(moveIntent)
            }
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvCharacter = findViewById(R.id.rv_character)
        rvCharacter.setHasFixedSize(true)
        setTitle("Genshin Library")
        list.addAll(CharacterData.CharacterData.listData)
        showRecyclerlist()
    }


}
package org.gsm.software.androidnavigationgcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import org.gsm.software.androidnavigationgcomponent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var appBarConfiguration : AppBarConfiguration

    lateinit var navController : NavController
    private val binding  by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.main = this@MainActivity
        //프래그먼트 연결 코드
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navC = navHostFragment.navController
        appBarConfiguration = AppBarConfiguration(navC.graph)
        setupActionBarWithNavController(navC,appBarConfiguration)

//        navController = Navigation.findNavController(this,R.id.fragmentContainerView)
//        NavigationUI.setupActionBarWithNavController(this,navController)

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}
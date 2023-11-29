package kh.edu.rupp.ite.mytravel.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import kh.edu.rupp.ite.mytravel.R;
import kh.edu.rupp.ite.mytravel.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setContentView(R.layout.activity_add_account);



        // button item action to fragment
        binding.bottomNavigationView.setOnItemReselectedListener(item -> {
            if (item.getItemId() ==R.id.button_home){

            }
        });
    }
}
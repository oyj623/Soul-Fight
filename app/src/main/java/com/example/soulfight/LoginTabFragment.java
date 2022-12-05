package com.example.soulfight;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class LoginTabFragment extends Fragment {

    ImageView img_user;
    ImageView img_pass;
    EditText username;
    EditText password;
    TextView forgotPass;
    Button login;
    float v=0;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstancesState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment, container, false);

        img_user = root.findViewById(R.id.imageView);
        img_pass = root.findViewById(R.id.imagePass);
        username = root.findViewById(R.id.username);
        password = root.findViewById(R.id.password);
        forgotPass = root.findViewById(R.id.forgot_pass);
        login = root.findViewById(R.id.button);

        img_user.setTranslationX(800);
        img_pass.setTranslationX(800);
        username.setTranslationX(800);
        password.setTranslationX(800);
        forgotPass.setTranslationX(800);
        login.setTranslationX(800);

        img_user.setAlpha(v);
        img_pass.setAlpha(v);
        username.setAlpha(v);
        password.setAlpha(v);
        forgotPass.setAlpha(v);
        login.setAlpha(v);

        img_user.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(250).start();
        username.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(300).start();
        img_pass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(450).start();
        password.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        forgotPass.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(500).start();
        login.animate().translationX(0).alpha(1).setDuration(800).setStartDelay(700).start();

        return root;
    }
}

package com.telran.fragmenttransaction;

import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.telran.fragmenttransaction.fragments.FragmentA;
import com.telran.fragmenttransaction.fragments.FragmentB;

public class MainActivity extends AppCompatActivity implements FragmentManager.OnBackStackChangedListener{

    FragmentManager manager;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getFragmentManager();
        resultText = (TextView) findViewById(R.id.result_txt);
        manager.addOnBackStackChangedListener(this);
    }

    public void addA(View v){
        FragmentA fragment = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragment_container,fragment,"A");
        transaction.addToBackStack("addA");
        transaction.commit();
    }

    public void removeA(View v){
        FragmentA fragment = (FragmentA) manager.findFragmentByTag("A");
        FragmentTransaction transaction = manager.beginTransaction();
        if(fragment!=null){
            transaction.remove(fragment);
            transaction.addToBackStack("removeA");
            transaction.commit();
        }else{
            Toast.makeText(this, "Fragment A was not added before", Toast.LENGTH_SHORT).show();
        }

    }

    public void replaceToA(View v){
        FragmentA fragment = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_container,fragment,"A");
        transaction.addToBackStack("replaceToA");
        transaction.commit();
    }

    public void addB(View v){
        FragmentB fragment = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.fragment_container,fragment,"B");
        transaction.addToBackStack("addB");
        transaction.commit();
    }

    public void removeB(View v){
        FragmentB fragment = (FragmentB) manager.findFragmentByTag("B");
        FragmentTransaction transaction = manager.beginTransaction();
        if(fragment!=null){
            transaction.remove(fragment);
            transaction.addToBackStack("removeB");
            transaction.commit();
        }else{
            Toast.makeText(this, "Fragment B was not added before", Toast.LENGTH_SHORT).show();
        }

    }

    public void replaceToB(View v){
        FragmentB fragment = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_container,fragment,"B");
        transaction.addToBackStack("replaceToB");
        transaction.commit();
    }

    public void attachA(View v){
        FragmentA fragment = (FragmentA) manager.findFragmentByTag("A");
        FragmentTransaction transaction = manager.beginTransaction();
        if(fragment!=null){
            transaction.attach(fragment);
            transaction.addToBackStack("attachA");
            transaction.commit();
        }
    }

    public void detachA(View v){
        FragmentA fragment = (FragmentA) manager.findFragmentByTag("A");
        FragmentTransaction transaction = manager.beginTransaction();
        if(fragment!=null){
            transaction.detach(fragment);
            transaction.addToBackStack("detachA");
            transaction.commit();
        }
    }

    public void back(View v){
        manager.popBackStack();
    }

    public void popAddB(View v){

//        manager.popBackStack("addB",FragmentManager.POP_BACK_STACK_INCLUSIVE);
        manager.popBackStack("addB",0);
    }

    @Override
    public void onBackStackChanged() {
        resultText.setText(resultText.getText()+"\n");
        resultText.setText(resultText.getText()+"Current BackStack\n");

        int count = manager.getBackStackEntryCount();

        for (int i = count-1;i>=0;i--){
            FragmentManager.BackStackEntry entry = manager.getBackStackEntryAt(i);
            resultText.setText(resultText.getText()+" "+entry.getName()+" \n");
        }

        resultText.setText(resultText.getText()+"\n");
    }
}
package com.cookandroid.week11;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentB extends Fragment {
    EditText editText;
    Button btnok;
    //FragmentBListener listener;

//    public interface FragmentBListener{
//        void onInputBSent(CharSequence input);
//    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
//        if(context instanceof FragmentBListener){
//            listener = (FragmentBListener) context;
//        }else{
//            throw new RuntimeException(context.toString()+ " must implement FragmentBListener");
//        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_b, container, false);

        editText = (EditText) v.findViewById(R.id.edit_text);
        btnok = (Button) v.findViewById(R.id.btn_ok);
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence input = editText.getText();
                //listener.onInputBSent(input);
                MainActivity mainActivity = (MainActivity)getActivity();
                mainActivity.getDataFromB(input);
            }
        });

        return v;
    }

    public void updateFragBEditText(CharSequence newText){
        editText.setText(newText);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        //listener = null;
    }
}

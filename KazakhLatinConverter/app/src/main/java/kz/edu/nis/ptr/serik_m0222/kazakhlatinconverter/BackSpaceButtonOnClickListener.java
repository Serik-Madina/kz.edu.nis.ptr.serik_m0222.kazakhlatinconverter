package kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BackSpaceButtonOnClickListener implements View.OnClickListener {
    private EditText editText;
    private TextView textView;

    public BackSpaceButtonOnClickListener(EditText editText, TextView textView)
    {
        this.editText = editText;
        this.textView = textView;
    }

    public void setEditText(EditText editText)
    {
        this.editText = editText;
    }

    public void setTextView(TextView textView)
    {
        this.textView = textView;
    }

    public void onClick(View view)
    {
        if(editText.getText().length()>0) {
            editText.setText(editText.getText().subSequence(0, editText.getText().length() - 1));
        }
        //textView.setText(textView.getText() + Tools.convertKazToLatin(buttonText));
    }
}

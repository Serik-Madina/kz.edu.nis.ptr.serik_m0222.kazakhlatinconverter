package kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class KeyboardButtonOnClickListener implements View.OnClickListener {
    private EditText editText;
    private TextView textView;

    public KeyboardButtonOnClickListener(EditText editText, TextView textView)
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
        String buttonText = "" + ((Button) view).getText();
        editText.setText(editText.getText() + buttonText);
        //textView.setText(textView.getText() + Tools.convertKazToLatin(buttonText));
    }
}

package kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AddToDictButtonOnClickListener implements View.OnClickListener {
    private Activity parentActivity;
    private EditText editText;
    private TextView textView;

    public AddToDictButtonOnClickListener(Activity parentActivity, EditText editText, TextView textView)
    {
        this.parentActivity = parentActivity;
        this.editText = editText;
        this.textView = textView;
    }

    public void setParentActivity(Activity parentActivity) {
        this.parentActivity = parentActivity;
    }

    public void onClick(View view)
    {
        Dictionary.addToDictionary(parentActivity, ""+editText.getText(), textView.getText().toString());
    }
}

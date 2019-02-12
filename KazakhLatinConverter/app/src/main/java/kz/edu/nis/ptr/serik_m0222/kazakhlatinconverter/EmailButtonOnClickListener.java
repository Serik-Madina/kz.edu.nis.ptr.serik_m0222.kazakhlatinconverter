package kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class EmailButtonOnClickListener implements View.OnClickListener {
    private Activity parentActivity;

    public EmailButtonOnClickListener(Activity parentActivity)
    {
        this.parentActivity = parentActivity;
    }

    public void setParentActivity(Activity parentActivity) {
        this.parentActivity = parentActivity;
    }

    public void onClick(View view)
    {
                        /* Create the Intent */
        final Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);

                    /* Fill it with Data */
        emailIntent.setType("plain/text");
        emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"LatinTD.2017@gmail.com"});
        emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "LatinTranslatorDictionary Feedback - Reported Bug or Requested Feature");
        emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, "");

                /* Send it off to the Activity-Chooser */
        parentActivity.startActivity(Intent.createChooser(emailIntent, "Send mail..."));
    }
}

package stengland.bear

import _root_.android.app.Activity
import _root_.android.os.Bundle
import android.content.Intent
import android.widget.TextView

class DisplayMessageActivity extends Activity {

  override def onCreate(bundle: Bundle) {
    super.onCreate(bundle)

    val intent = getIntent();
    val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

    // Create the text view
    val textView = new TextView(this);
    textView.setTextSize(40);
    textView.setText(message);

    // Set the text view as the activity layout
    setContentView(textView);
  }
}

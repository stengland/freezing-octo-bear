package stengland.bear

import _root_.android.app.Activity
import _root_.android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.EditText

object MainActivity {
  val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"
}

class MainActivity extends Activity with TypedActivity {

  override def onCreate(bundle: Bundle) {
    super.onCreate(bundle)
    setContentView(R.layout.main)

    findView(TR.textview).setText("hello, world!")
  }

  def sendMessage(view: View) {
    val intent = new Intent(this, classOf[DisplayMessageActivity])

      val edit_text = findViewById(R.id.edit_message).asInstanceOf[EditText]
      val message = edit_text.getText().toString()
      intent.putExtra(MainActivity.EXTRA_MESSAGE, message)
    startActivity(intent)
  }
}

package cn.piesat.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cn.piesat.bottomdialog.ActionSheetDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val camera = resources.getString(R.string.dialog_select_camera)
        val gallery = resources.getString(R.string.dialog_select_gallery)
        ActionSheetDialog(this)
            .builder()
            .setCancelable(true)
            .setCanceledOnTouchOutside(true)
            .addSheetItem(camera, ActionSheetDialog.SheetItemColor.Normal) {
                //                toCamera(this)
            }
            .addSheetItem(gallery, ActionSheetDialog.SheetItemColor.Normal) {
                //                toGallery(this)
            }
            .show()
    }
}

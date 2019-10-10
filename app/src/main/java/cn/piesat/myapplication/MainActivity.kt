package cn.piesat.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cn.piesat.bottomdialog.ActionSheetDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBtnDialog.setOnClickListener {
            showDialog()
        }
    }


    private fun showDialog() {
        val dialog = ActionSheetDialog(this).builder()
        dialog.setCancelable(true).setCanceledOnTouchOutside(true)
            .setTitle("多媒体选择标题")
            .addSheetItem("拍照", ActionSheetDialog.SheetItemColor.Normal) {

            }
            .addSheetItem("相册", ActionSheetDialog.SheetItemColor.Blue) {

            }
            .addSheetItem("录像",ActionSheetDialog.SheetItemColor.Red){

            }
            .show()
    }
}

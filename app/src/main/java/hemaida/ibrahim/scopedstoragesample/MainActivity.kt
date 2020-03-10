package hemaida.ibrahim.scopedstoragesample

import android.content.Intent
import android.os.Bundle
import hemaida.ibrahim.scopedstoragesample.SAF.StorageAccessFrameworkActivity
import hemaida.ibrahim.scopedstoragesample.mediastore.MediaStoreFileActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_move_media_store_file?.setOnClickListener {
            startActivity(Intent(this@MainActivity, MediaStoreFileActivity::class.java))
        }

        button_move_storage_access_framework?.setOnClickListener {
            startActivity(Intent(this@MainActivity, StorageAccessFrameworkActivity::class.java))
        }
    }
}

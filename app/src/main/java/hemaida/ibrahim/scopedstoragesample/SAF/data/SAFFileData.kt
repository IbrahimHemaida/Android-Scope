package hemaida.ibrahim.scopedstoragesample.SAF.data

import android.net.Uri

data class SAFFileData(
    val name: String,
    val type: String,
    val uri: Uri,
    val isDirectory: Boolean,
    val parentFileUri: Uri
)

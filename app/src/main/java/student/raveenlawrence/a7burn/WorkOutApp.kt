package student.raveenlawrence.a7burn

import android.app.Application

class WorkOutApp: Application() {

    val db by lazy {
        HistoryDatabase.getInstance(this)
    }
}
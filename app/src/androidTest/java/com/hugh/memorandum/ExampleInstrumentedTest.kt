package com.hugh.memorandum

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import com.hugh.memorandum.utils.TimeUtil

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.hugh.memorandum", appContext.packageName)
    }

    @Test
    fun checkTime() {
        val timeUtil = TimeUtil()
        val formatDate = timeUtil.formatDate()
        assertEquals(formatDate, "2018/6/28")
    }
}

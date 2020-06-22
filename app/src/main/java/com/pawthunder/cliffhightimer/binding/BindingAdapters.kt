package com.pawthunder.cliffhightimer.binding

import android.view.View
import android.widget.TextView
import androidx.databinding.BindingAdapter
import java.math.BigDecimal
import java.text.DecimalFormat

/**
 * Binding adapters for usage in xml code to set up element.
 */
object BindingAdapters {

    @JvmStatic
    @BindingAdapter("visibleGone")
    fun makeVisibleGone(view: View, value: Boolean) {
        view.visibility = if (value) View.VISIBLE else View.GONE
    }

    @JvmStatic
    @BindingAdapter("showNumber")
    fun showRoundedDouble(textView: TextView, value: BigDecimal?) {
        val decimalFormat = DecimalFormat("#.##")
        textView.text = decimalFormat.format(value)
    }
}

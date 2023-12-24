package net.ccbluex.liquidinstruction

import java.awt.BorderLayout
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.WindowConstants

fun main() {
    // Setup instruction frame
    val frame = JFrame("Liquidhutao | 小黑子你干嘛?")
    frame.defaultCloseOperation = WindowConstants.EXIT_ON_CLOSE
    frame.layout = BorderLayout()
    frame.isResizable = false
    frame.isAlwaysOnTop = true

    // Add instruction as label
    @Suppress("RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
    val label = JLabel(
        "                      =_=小黑子你干嘛？=_=                    \n" +
                "              =_=小黑子你干嘛？=_=                    \n" +
                " \n"
    )
    frame.add(label, BorderLayout.CENTER)
    val label1 = JLabel(
        "                      =_=小黑子你干嘛？=_=                    \n" +
                "              =_=小黑子你干嘛？=_=                    \n" +
                " \n"
    )
    frame.add(label1, BorderLayout.NORTH)

    // Pack frame
    frame.pack()

    // Set location to center of screen
    frame.setLocationRelativeTo(null)

    // Display instruction frame
    frame.isVisible = true
}
package com.example.AndroidCalculator

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import com.example.AndroidCalculator.R
import android.widget.Toast
import java.math.BigDecimal
import java.util.*

class AndroidCalculator : AppCompatActivity(), View.OnClickListener {

    lateinit var editText: EditText
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.main_item -> {
                val intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse("https://github.com/Honnne/AndroidCalculator")
                startActivity(intent)
            }
            R.id.quit_item -> finish()
        }
        return true
    }

    var flag_c = false
    var flag_r = true
    var flag_t = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)
        editText = findViewById<EditText>(R.id.edit_text)
        val button1 = findViewById<Button>(R.id.button_1)
        val button2 = findViewById<Button>(R.id.button_2)
        val button3 = findViewById<Button>(R.id.button_3)
        val button4 = findViewById<Button>(R.id.button_4)
        val button5 = findViewById<Button>(R.id.button_5)
        val button6 = findViewById<Button>(R.id.button_6)
        val button7 = findViewById<Button>(R.id.button_7)
        val button8 = findViewById<Button>(R.id.button_8)
        val button9 = findViewById<Button>(R.id.button_9)
        val button0 = findViewById<Button>(R.id.button_0)
        val button_add = findViewById<Button>(R.id.button_add)//+
        val button_sub = findViewById<Button>(R.id.button_sub)//-
        val button_mul = findViewById<Button>(R.id.button_mul)//x
        val button_div = findViewById<Button>(R.id.button_div)///
        val button_del = findViewById<Button>(R.id.button_del)//del
        val button_neg = findViewById<Button>(R.id.button_neg)//+-
        val button_equ = findViewById<Button>(R.id.button_equ)//=
        val button_pt = findViewById<Button>(R.id.button_pt)//.
        val button_pc = findViewById<Button>(R.id.button_pc)//%
        val button_fac = findViewById<Button>(R.id.button_fac)//!
        val button_c = findViewById<Button>(R.id.button_c)//c
        val button_root = findViewById<Button>(R.id.button_root)//根号
        val button_sin = findViewById<Button>(R.id.button_sin)//sin
        button0.setOnClickListener(this)
        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
        button5.setOnClickListener(this)
        button6.setOnClickListener(this)
        button7.setOnClickListener(this)
        button8.setOnClickListener(this)
        button9.setOnClickListener(this)
        button_add.setOnClickListener(this)
        button_sub.setOnClickListener(this)
        button_mul.setOnClickListener(this)
        button_div.setOnClickListener(this)
        button_del.setOnClickListener(this)
        button_neg.setOnClickListener(this)
        button_equ.setOnClickListener(this)
        button_pt.setOnClickListener(this)
        button_pc.setOnClickListener(this)
        button_fac.setOnClickListener(this)
        button_c.setOnClickListener(this)
        button_root.setOnClickListener(this)
        button_sin.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var et = editText.text.toString()
        when (v?.id) {
            R.id.button_0 -> {
                if (flag_c) {
                    et = "0"
                    flag_c = false
                    flag_r = true
                }
                if (et == "0") et = "0" else et += "0"
                editText.setText(et)
            }
            R.id.button_1 -> {
                if (flag_c) {
                    et = "0"
                    flag_c = false
                    flag_r = true
                }
                if (et == "0") et = "1" else et += "1"
                editText.setText(et)
            }
            R.id.button_2 -> {
                if (flag_c) {
                    et = "0"
                    flag_c = false
                    flag_r = true
                }
                if (et == "0") et = "2" else et += "2"
                editText.setText(et)
            }
            R.id.button_3 -> {
                if (flag_c) {
                    et = "0"
                    flag_c = false
                    flag_r = true
                }
                if (et == "0") et = "3" else et += "3"
                editText.setText(et)
            }
            R.id.button_4 -> {
                if (flag_c) {
                    et = "0"
                    flag_c = false
                    flag_r = true
                }
                if (et == "0") et = "4" else et += "4"
                editText.setText(et)
            }
            R.id.button_5 -> {
                if (flag_c) {
                    et = "0"
                    flag_c = false
                    flag_r = true
                }
                if (et == "0") et = "5" else et += "5"
                editText.setText(et)
            }
            R.id.button_6 -> {
                if (flag_c) {
                    et = "0"
                    flag_c = false
                    flag_r = true
                }
                if (et == "0") et = "6" else et += "6"
                editText.setText(et)
            }
            R.id.button_7 -> {
                if (flag_c) {
                    et = "0"
                    flag_c = false
                    flag_r = true
                }
                if (et == "0") et = "7" else et += "7"
                editText.setText(et)
            }
            R.id.button_8 -> {
                if (flag_c) {
                    et = "0"
                    flag_c = false
                    flag_r = true
                }
                if (et == "0") et = "8" else et += "8"
                editText.setText(et)
            }
            R.id.button_9 -> {
                if (flag_c) {
                    et = "0"
                    flag_c = false
                    flag_r = true
                }
                if (et == "0") et = "9" else et += "9"
                editText.setText(et)
            }
//点
            R.id.button_pt -> {
                if (flag_c) {
                    et = "0"
                    flag_r = true
                    flag_c = false
                }
                if ((et[et.length - 1] == '+' ||
                            et[et.length - 1] == '-' ||
                            et[et.length - 1] == '×' ||
                            et[et.length - 1] == '÷'
                            ) && flag_r
                ) {
                    et = et.substring(0, et.length - 1)
                    et += "."
                    flag_r = false
                    editText.setText(et)
                } else if ((et[et.length - 1] == '+' ||
                            et[et.length - 1] == '-' ||
                            et[et.length - 1] == '×' ||
                            et[et.length - 1] == '÷') && !flag_r
                ) {
                    et += "0."
                    flag_t = false
                    flag_r = false
                    editText.setText(et)
                } else if (flag_r) {
                    et += "."
                    flag_r = false
                    editText.setText(et)
                } else if (flag_t) {
                    et += "."
                    flag_r = false
                    flag_t = false
                    editText.setText(et)
                }

            }
//加法
            R.id.button_add -> if (et[et.length - 1] == '+' ||
                et[et.length - 1] == '-' ||
                et[et.length - 1] == '×' ||
                et[et.length - 1] == '÷' ||
                et[et.length - 1] == '.'
            ) {
                et = et.substring(0, et.length - 1)
                et += "+"
                flag_c = false
                flag_r = false
                flag_t = true
                editText.setText(et)
            } else {
                et += "+"
                flag_c = false
                flag_r = false
                flag_t = true
                editText.setText(et)
            }
//减法
            R.id.button_sub -> if (et[et.length - 1] == '+' ||
                et[et.length - 1] == '-' ||
                et[et.length - 1] == '×' ||
                et[et.length - 1] == '÷' ||
                et[et.length - 1] == '.'
            ) {
                et = et.substring(0, et.length - 1)
                et += "-"
                flag_c = false
                flag_r = false
                flag_t = true
                editText.setText(et)
            } else {
                et += "-"
                flag_c = false
                flag_r = false
                flag_t = true
                editText.setText(et)
            }
//乘法
            R.id.button_mul -> if (et[et.length - 1] == '+' ||
                et[et.length - 1] == '-' ||
                et[et.length - 1] == '×' ||
                et[et.length - 1] == '÷' ||
                et[et.length - 1] == '.'
            ) {
                et = et.substring(0, et.length - 1)
                et += "×"
                flag_c = false
                flag_r = false
                flag_t = true
                editText.setText(et)
            } else {
                et += "×"
                flag_c = false
                flag_r = false
                flag_t = true
                editText.setText(et)
            }
//除法
            R.id.button_div -> if (et[et.length - 1] == '+' ||
                et[et.length - 1] == '-' ||
                et[et.length - 1] == '×' ||
                et[et.length - 1] == '÷' ||
                et[et.length - 1] == '.'
            ) {
                et = et.substring(0, et.length - 1)
                et += "÷"
                flag_c = false
                flag_r = false
                flag_t = true
                editText.setText(et)
            } else {
                et += "÷"
                flag_c = false
                flag_r = false
                flag_t = true
                editText.setText(et)
            }
//删除
            R.id.button_del -> {
                if (et[et.length - 1] == '.') {
                    flag_r = true
                }
                et = if (et.length > 1) {
                    if (et.length == 2 && et[0] == '-') {
                        "0"
                    } else et.substring(0, et.length - 1)
                } else {
                    "0"
                }

                editText.setText(et)
            }
//清除
            R.id.button_c -> {
                flag_r = true
                et = "0"
                editText.setText(et)
            }
//等于
            R.id.button_equ -> if (et[et.length - 1] == '+' ||
                et[et.length - 1] == '-' ||
                et[et.length - 1] == '×' ||
                et[et.length - 1] == '÷' ||
                et[et.length - 1] == '.'
            ) {
                et = et.substring(0, et.length - 1)
                editText.setText(et)
                val res = getResult()
                editText.setText(res)
            } else {
                val res = getResult()
                if (res.contains("Infinity")) {
                    Toast.makeText(
                        this@AndroidCalculator,
                        "不能除0!",
                        Toast.LENGTH_SHORT
                    ).show()
                    editText.setText("0")
                } else if (et.contains("NaN") || res.contains("NaN")) {
                    Toast.makeText(
                        this@AndroidCalculator,
                        "这数可能没法算",
                        Toast.LENGTH_SHORT
                    ).show()
                    editText.setText("0")
                } else {
                    flag_c = true;
                    editText.setText(res)
                }
            }
//百分之
            R.id.button_pc -> if ((et.contains("+") ||
                        et.contains("-") ||
                        et.contains("×") ||
                        et.contains("÷")) &&
                !et.contains("E")
            ) {
                if (et[et.length - 1] == '+' ||
                    et[et.length - 1] == '-' ||
                    et[et.length - 1] == '×' ||
                    et[et.length - 1] == '÷'
                ) {
                    et = et.substring(0, et.length - 1)
                    editText.setText(et)
                    et = getResult()
                    if (et.contains("Infinity")) {
                        Toast.makeText(
                            this@AndroidCalculator,
                            "不能除0!",
                            Toast.LENGTH_SHORT
                        ).show()
                        editText.setText("0")
                        return
                    } else if (et.contains("NaN")) {
                        Toast.makeText(
                            this@AndroidCalculator,
                            "这数可能没法算",
                            Toast.LENGTH_SHORT
                        ).show()
                        editText.setText("0")
                        return
                    }
                    editText.setText(et)
                    var per = et.toDouble()
                    per = per / 100
                    var per1 = "" + per
                    flag_c = true
                    editText.setText(per1)
                } else {
                    et = getResult()
                    if (et.contains("Infinity")) {
                        Toast.makeText(
                            this@AndroidCalculator,
                            "不能除0!",
                            Toast.LENGTH_SHORT
                        ).show()
                        editText.setText("0")
                        return
                    } else if (et.contains("NaN")) {
                        Toast.makeText(
                            this@AndroidCalculator,
                            "这数可能没法算",
                            Toast.LENGTH_SHORT
                        ).show()
                        editText.setText("0")
                        return
                    }
                    editText.setText(et)
                    var per = et.toDouble()
                    per = per / 100
                    var per1 = "" + per
                    flag_c = true
                    editText.setText(per1)
                }
            } else if (et.contains("E-8") || et.contains("E-9")) {
                Toast.makeText(
                    this@AndroidCalculator,
                    "这数可能太小了",
                    Toast.LENGTH_SHORT
                ).show()
                editText.setText("0")
            } else {
                var per = et.toDouble()
                per = per / 100
                var per1 = per.toString()
                flag_c = true
                editText.setText(per1)
            }
//负号
            R.id.button_neg -> if (et[0] >= '0' && et[0] <= '9') {
                if (et == "0") {
                    editText.setText("0")
                } else {
                    editText.setText("-$et")
                }
            } else if (et[0] == '-') editText.setText(
                et.substring(1, et.length)
            ) else editText.setText(et)
//阶乘
            R.id.button_fac -> if (et.contains("+") ||
                et.contains("-") ||
                et.contains("×") ||
                et.contains("÷") ||
                et[et.length - 1] == '.'
            ) {
                if (et[et.length - 1] == '+' ||
                    et[et.length - 1] == '-' ||
                    et[et.length - 1] == '×' ||
                    et[et.length - 1] == '÷' ||
                    et[et.length - 1] == '.'
                ) {
                    et = et.substring(0, et.length - 1)
                    editText.setText(et)
                    et = getResult()
                    if (et.contains("Infinity")) {
                        Toast.makeText(
                            this@AndroidCalculator,
                            "不能除0!",
                            Toast.LENGTH_SHORT
                        ).show()
                        editText.setText("0")
                        return
                    } else if (et.contains("NaN")) {
                        Toast.makeText(
                            this@AndroidCalculator,
                            "这数可能没法算",
                            Toast.LENGTH_SHORT
                        ).show()
                        editText.setText("0")
                        return
                    }
                    editText.setText(et)
                } else {
                    et = getResult()
                    if (et.contains("Infinity")) {
                        Toast.makeText(
                            this@AndroidCalculator,
                            "不能除0!",
                            Toast.LENGTH_SHORT
                        ).show()
                        editText.setText("0")
                        return
                    } else if (et.contains("NaN")) {
                        Toast.makeText(
                            this@AndroidCalculator,
                            "这数可能没法算",
                            Toast.LENGTH_SHORT
                        ).show()
                        editText.setText("0")
                        return
                    }
                    editText.setText(et)
                }
                if (et.contains(".")) {
                    Toast.makeText(
                        this@AndroidCalculator,
                        "不是整数!",
                        Toast.LENGTH_SHORT
                    ).show()
                } else if (et[0] == '-') {
                    Toast.makeText(
                        this@AndroidCalculator,
                        "不是正数!",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    if (et == "0") {
                        et = "1"
                        flag_c = true
                        editText.setText(et)
                    } else {
                        val num = et.toInt().toDouble()
                        var result = 1
                        var i = 1
                        while (i <= num) {
                            result = result * i
                            i++
                        }
                        et = result.toString()
                        if (et.equals("0")) {
                            Toast.makeText(
                                this@AndroidCalculator,
                                "这数可能太大了",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else {
                            flag_c = true
                            editText.setText(et)
                        }
                    }
                }
            } else if (et.contains(".")) {
                Toast.makeText(
                    this@AndroidCalculator,
                    "不是整数!",
                    Toast.LENGTH_SHORT
                ).show()
            } else if (et[0] == '-') {
                Toast.makeText(
                    this@AndroidCalculator,
                    "不是正数!",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                val num = et.toInt().toDouble()
                var result = 1
                var i = 1
                while (i <= num) {
                    result = result * i
                    i++
                }
                et = result.toString()
                if (et.equals("0")) {
                    Toast.makeText(
                        this@AndroidCalculator,
                        "这数可能太大了",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    flag_c = true
                    editText.setText(et)
                }
            }
//开根
            R.id.button_root -> if (et.contains("+") ||
                et.contains("-") ||
                et.contains("×") ||
                et.contains("÷")
            ) {
                if (et[et.length - 1] == '+' ||
                    et[et.length - 1] == '-' ||
                    et[et.length - 1] == '×' ||
                    et[et.length - 1] == '÷'
                ) {
                    et = et.substring(0, et.length - 1)
                    editText.setText(et)
                    et = getResult()
                    if (et.contains("Infinity")) {
                        Toast.makeText(
                            this@AndroidCalculator,
                            "不能除0!",
                            Toast.LENGTH_SHORT
                        ).show()
                        editText.setText("0")
                        return
                    } else if (et.contains("NaN")) {
                        Toast.makeText(
                            this@AndroidCalculator,
                            "这数可能没法算",
                            Toast.LENGTH_SHORT
                        ).show()
                        editText.setText("0")
                        return
                    }
                    flag_c = true
                    editText.setText(et)
                } else {
                    et = getResult()
                    if (et.contains("Infinity")) {
                        Toast.makeText(
                            this@AndroidCalculator,
                            "不能除0!",
                            Toast.LENGTH_SHORT
                        ).show()
                        editText.setText("0")
                        return
                    } else if (et.contains("NaN")) {
                        Toast.makeText(
                            this@AndroidCalculator,
                            "这数可能没法算",
                            Toast.LENGTH_SHORT
                        ).show()
                        editText.setText("0")
                        return
                    }
                    flag_c = true
                    editText.setText(et)
                }
                if (et[0] == '-') {
                    Toast.makeText(
                        this@AndroidCalculator,
                        "负数没法开根!",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    et = getResult()
                    if (et.contains("Infinity")) {
                        Toast.makeText(
                            this@AndroidCalculator,
                            "不能除0!",
                            Toast.LENGTH_SHORT
                        ).show()
                        editText.setText("0")
                        return
                    } else if (et.contains("NaN")) {
                        Toast.makeText(
                            this@AndroidCalculator,
                            "这数可能没法算",
                            Toast.LENGTH_SHORT
                        ).show()
                        editText.setText("0")
                        return
                    }
                    editText.setText(et)
                    var x = et.toDouble()
                    x = Math.sqrt(x)
                    var x2 = formatResult(x)
                    flag_c = true
                    editText.setText(x2)
                }
            } else {
                var x = et.toDouble()
                x = Math.sqrt(x)
                var x2 = formatResult(x)
                flag_c = true
                editText.setText(x2)
            }
//sin
            R.id.button_sin -> {
                if (et.contains("+") ||
                    et.contains("-") ||
                    et.contains("×") ||
                    et.contains("÷")
                ) {
                    if (et[et.length - 1] == '+' ||
                        et[et.length - 1] == '-' ||
                        et[et.length - 1] == '×' ||
                        et[et.length - 1] == '÷'
                    ) {
                        et = et.substring(0, et.length - 1)
                        editText.setText(et)
                        et = getResult()
                        editText.setText(et)
                    } else {
                        et = getResult()
                        if (et.contains("Infinity")) {
                            Toast.makeText(
                                this@AndroidCalculator,
                                "不能除0!",
                                Toast.LENGTH_SHORT
                            ).show()
                            editText.setText("0")
                            return
                        } else if (et.contains("NaN")) {
                            Toast.makeText(
                                this@AndroidCalculator,
                                "这数可能没法算",
                                Toast.LENGTH_SHORT
                            ).show()
                            editText.setText("0")
                            return
                        } else
                            editText.setText(et)
                    }
                }
                var x = et.toDouble()
                x = kotlin.math.sin(kotlin.math.PI * x / 180)
                var y = formatResult(x)
                flag_c = true
                editText.setText("$y")
            }

//其他
            else -> {
                Toast.makeText(
                    this@AndroidCalculator,
                    "未知错误!",
                    Toast.LENGTH_SHORT
                )
                    .show()
            }
        }
    }


    fun formatResult(result: Double): String {
        var re = String.format("%.9f", result)
        re = re.replace("0+?$".toRegex(), "")
        re = re.replace("[.]$".toRegex(), "")
        return re
    }

    fun getResult(): String {
        val infix = editText.text.toString()
        val postfix = toPostfix(infix)
        val result = toValue(postfix)
        var re = formatResult(result)
        if (re.length > 15) re = "这数可能有点大"
        return re
    }


    fun toPostfix(infix: String): StringBuffer {
        val stack = Stack<String>()
        val postfix = StringBuffer(infix.length * 2)
        var i = 0
        while (i < infix.length) {
            var ch = infix.get(i)
            when (ch) {
                '+' -> {
                    while (!stack.isEmpty() && stack.peek() != "(")
                        postfix.append(stack.pop())
                    stack.push(ch.toString() + "")
                    i++
                }
                '-' -> if (i == 0) {
                    postfix.append(0)
                    postfix.append(" ")
                    stack.push("(")
                    stack.push(ch.toString() + "")
                    i++
                } else {
                    while (!stack.isEmpty() && stack.peek() != "(")
                        postfix.append(stack.pop())
                    stack.push(ch.toString() + "")
                    i++
                }
                '×', '÷' -> {
                    while (!stack.isEmpty() &&
                        (stack.peek() == "×" || stack.peek() == "÷")
                    )
                        postfix.append(stack.pop())
                    stack.push(ch.toString() + "")
                    i++
                }
                else -> if (i == 1 && infix.get(0) == '-') {
                    while (i < infix.length && ch >= '0' && ch <= '9' ||
                        i < infix.length && ch == '.'
                    ) {
                        postfix.append(ch)
                        i++
                        if (i < infix.length) ch = infix.get(i)
                    }
                    postfix.append(" ")
                    postfix.append('-')
                    stack.pop()
                    stack.pop()
                } else {
                    while (i < infix.length && ch >= '0' && ch <= '9' ||
                        i < infix.length && ch == '.'
                    ) {
                        postfix.append(ch)
                        i++
                        if (i < infix.length) ch = infix.get(i)
                    }
                    postfix.append(" ")
                }
            }
        }
        while (!stack.isEmpty())
            postfix.append(stack.pop())
        return postfix
    }

    fun toValue(postfix: StringBuffer): Double {
        val stack = Stack<Double>()
        var value = 0.0
        var j = 0
        var i = 0
        while (i < postfix.length) {
            j = i
            var ch = postfix.get(i)
            if (ch >= '0' && ch <= '9' || ch == '.') {
                value = 0.0
                while (ch != ' ') {
                    while (ch != ' ' && ch != '.') {
                        value = value * 10.0 + (ch - '0').toDouble()
                        j++
                        ch = postfix.get(++i)
                    }
                    if (ch != ' ' && ch == '.') ch = postfix.get(++i)
                    while (ch != ' ' && i >= j + 1) {
                        val valueBD = BigDecimal(value.toString())
                        val chBD = BigDecimal(ch - '0')
                        val nBD = BigDecimal(Math.pow(10.0, (i - j).toDouble()))
                        val temp = chBD.divide(nBD)
                        value = valueBD.add(temp).toDouble()
                        ch = postfix.get(++i)
                    }
                    stack.push(value)
                }
            } else {
                if (ch != ' ') {
                    var y: Double = stack.pop()
                    var x: Double = stack.pop()
                    value = when (ch) {
                        '+' -> x + y
                        '-' -> x - y
                        '×' -> x * y
                        '÷' -> x / y
                        else -> 0.0
                    }
                    stack.push(value)
                }
            }
            i++
        }
        return stack.pop()
    }
}
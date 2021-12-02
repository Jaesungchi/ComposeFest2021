fun main(args: Array<String>) {
    print("enter name :")
    val n: Int = readLine()!!.toInt()
    val startTag = n % 4 == 0 //true 면 O false면 X시작
    for (i in 0 until n) {
        var front = startTag //어떤거 출력할지
        var change = false //바꾸는걸 멈춰야할지
        if (n/2 > i) {
            for (j in 0 until n) {
                if (j == i) // 같은 인덱스에서부터 같은거 출력.
                    change = true
                if (n - j - 1 == i) 
                    change = false
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    print(if (startTag) "O" else "X")
                } else if (change) {
                    print(if (!front) "O" else "X")
                } else {
                    front = !front
                    print(if (front) "O" else "X")
                }
            }
        } else {
            for (j in n - 1 downTo 0) {
                if (j == i)
                    change = true
                if (n - j - 1 == i)
                    change = false
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    print(if (startTag) "O" else "X")
                } else if (change) {
                    print(if (!front) "O" else "X")
                } else {
                    front = !front
                    print(if (front) "O" else "X")
                }
            }
        }
        println()
    }
}
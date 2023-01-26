
sealed class Shape{
    class Circle(var radius: Float) : Shape()
    class Square(var length: Int) : Shape()
    class Rectangle(var length: Int, var breadth: Int) : Shape()
}

fun area(e: Shape) =
    when (e){
        is Shape.Circle -> println("Area of the Circle is ${3.142 * e.radius * e.radius}")
        is Shape.Square -> println("Area of the Square is ${e.length * e.length}")
        is Shape.Rectangle -> println("Area of the Rectangle is ${e.length * e.breadth}")
    }

fun main(){
    val circle = Shape.Circle(7.0f)
    val square = Shape.Square(7)
    val rectangle = Shape.Rectangle(8,9)

    area(circle)
    area(square)
    area(rectangle)
}


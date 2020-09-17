package LinkedList
import LinkedList.LinkedList

fun main(args: Array<String>) {
    //creando y enlazando nodos
    /*
    var node1 = Node(value = 1)
    var node2 = Node(value = 2)
    var node3 = Node(value = 3)
    node1.next = node2
    node2.next = node3
    println(node1)



    */
    /*

    head      tail
      1 -->2 --> 3
    Adding values to the list
    1. push:Add a value at the front of the list/Agrega un valor al frente de la lista/Also known as head-first insertion
    2 append : Add a value at the end of the list/agrega un valor al final de la lista
    3. insert adds a value after particular node of the list/agrega un valor despues de un nodo particular de la lista
     */
    /*push example

     */
    println("push function")
    var list = LinkedList<Int>()
    list.push(3)
    list.push(2)
    list.push(1)
    println(list)

    println("append function")
    var listA = LinkedList<Int>()
    listA.append(1)
    listA.append(2)
    listA.append(3)
    println(listA)
    var listB = LinkedList<Int>()
    listB.removeLast()
    println(listB)

}
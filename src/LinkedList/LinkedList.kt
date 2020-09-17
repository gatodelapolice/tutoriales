package LinkedList

class LinkedList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    fun isEmpty(): Boolean {
        return size ==0 //regresa V si se cumple
    }

    override fun toString(): String {
        if (isEmpty()){
            return "Lista Vacia/Empty List"

        }else{
            return head.toString()
        }

    }
    fun push(value: T){
        head = Node(value = value, next = head)
        if (tail==null){
            tail = head
        }
        size++
    }
    fun append(value:T){
        if (isEmpty()){
            push(value)
            return
        }
        tail?.next = Node(value = value)

        tail = tail?.next
        size++
    }

    fun nodeAt(index:Int) : Node<T>?{

        var currentNode = head
        var currentIndex= 0
        while (currentNode != null && currentIndex < index){
            currentNode = currentNode.next
            currentIndex++
        }
        return currentNode
    }
    fun insert(value: T, afterNode: Node<T>) : Node<T>{
        if (tail ==afterNode){
            append(value)
            return tail!!
        }
        val newNode = Node(value = value, next = afterNode.next)
        afterNode.next = newNode
        size++
        return newNode

    }
    fun pop() : T?{
        if (!isEmpty()) size--
        val result = head?.value
        head = head?.next
        if (isEmpty()){
            tail = null
        }

        return result
    }
    fun removeLast() : T?{
        val head = head?: return null

        if (head.next == null) return  pop()

        size--

        var prev = head
        var current = head

        var next = current.next
        while (next != null){
            prev = current
            current = next
            next = current.next
        }
        prev.next = null
        tail = prev
        return current.value
    }

}

/*

    head      tail
      1 -->2 --> 3
    Adding values to the list
    1. push:Add a value at the front of the list/Agrega un valor al frente de la lista/Also known as head-first insertion
    2 append : Add a value at the end of the list/agrega un valor al final de la lista
    3. insert adds a value after particular node of the list/agrega un valor despues de un nodo particular de la lista


     */
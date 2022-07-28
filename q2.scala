object q2 extends App{
    case class Shopping_item(name: String, price: Double, quantity: Int)

    def print_elements(a:Shopping_item){
        println(a.quantity+" "+a.name+" at Rs."+a.price+" each")
    }
    def vanilla_icecream(a:Shopping_item){

    }
    val item_1 = Shopping_item("vanilla ice cream",3.99,13)
    val item_2 = Shopping_item("chocolate biscuits",4,6)
    val item_3 = Shopping_item("cupcakes",7.77,7)
    val shopping_cart = (item_1,item_2,item_3)
    
    
} 
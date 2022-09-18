object Q1 extends App{
    var p1=point (1,2)
    var p2=point (2,4)
    var p4=p1+p2
   
    println("Question 01 Answer  :")
    println(p1+p2)
    println("Question 02 Answer  :")
    p1.move(3,5)
    println(p1)
    var p5=p1.distance(p2)
    println("Question 03 Answer  :")
    println(p5)
    println("Question 04 Answer  :")
    p1.invert()
    println(p1)
   

}
case class point(var x:Int,var y:Int){
    def move(dx:Int,dy:Int)=new point (this.x+dx,this.y+dy)
    def +(that:point)=point(this.x+that.x,this.y+that.y)
   // def -(that:point)=point(((this.x-that.x)*(this.x-that.x)),((this.y-that.y)*(this.y-that.y)))
     def distance(a:point):Double={
        var ele1 = this.x-a.x
        var ele2 = this.y-a.y
        var distance_2= (ele1*ele1)+(ele2*ele2)
        return scala.math.sqrt(distance_2)
        

    }
    def invert():Unit={
        var temp=this.x
        this.x=this.y
        this.y=temp
        
    }

   
   
}


import scala.io.Source
import scala.collection.mutable.ArrayBuffer
object MinMax {
def main(args:Array[String]):Unit={
var numarray=new ArrayBuffer[Int]()
printf("enter the number of elements")
val n=scala.io.StdIn.readInt()
printf("enter the elements")
for(i<-1 to n)
numarray+=scala.io.StdIn.readInt()
println(numarray)
val t=mm(numarray)
println("Maximum value is ",t._1)
println("Minimum value is ",t._2)
}
def mm(numarray:ArrayBuffer[Int]):(Int,Int)={
var mi:Int=999
	var mx:Int= -999
	for(i<-numarray)
	{
		if(i<mi)
			mi=i
		else if(i>mx)
			mx=i
	}
	(mx,mi)
}
}

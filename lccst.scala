import collection.mutable.HashMap

object lccst extends App {

//    val x = new HashMap[String,Int]()
//    def memoize(args: String, f: (Array[Int], Int, Int, Int) => Int, store: HashMap[String, Int]): Unit = {
//      if (store(args)) store(args)
//      else {
//        store(args) = f
//      }
//    }

    def contig(nums: List[Int], start: Int, end: Int, max: Int): Int = {
      var subTotal = nums.slice(start, end).sum
      if (end < nums.length+1 && !(start == 0 && end == nums.length)) {
        //moving end pt
         contig(nums, start, end+1, math.max(max, subTotal))
       } else if (start < nums.length-1) {
         //moving start
          contig(nums, start+1, start+2, max)
      } else {
        //found our goal
        math.max(max, subTotal)
      }
    }

    var ns = List(1,2,3)
    var res = contig(ns, 0, 1, 0)
    println(res == 5)

    var ns2 = List(0, 1,2,3)
    var res2 = contig(ns2, 0, 1, 0)
    println(res2 == 6)

    var ns3 = List(1, 1,1,1)
    var res3 = contig(ns3, 0, 1, 0)
    println(res3 == 3)

    var ns4 = List(1, -1,1,1)
    var res4 = contig(ns4, 0, 1, 0)
    println(res4 == 2)

    var ns5 = List(1)
    var res5 = contig(ns5, 0, 1, 0)
    println(res5 == 1)
}

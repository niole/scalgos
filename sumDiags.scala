object sumDiags extends App {
  def sumDiags(total: Int, nums: Array[Array[Int]], i: Int, step: Int): Int ={
    if (i > -1 && i < nums.length) sumDiags(total+nums(i)(i), nums, i+step, step)
    else total
  }

  var squ = Array.ofDim[Int](3,3)
  for ( i <- 0 to squ(0).length-1 toArray ) {
    for ( j <- 0 to squ(0).length-1 toArray ) {
      squ(i)(j) = i
    }
  }

  val s = sumDiags(0, squ, 0, 1) + sumDiags(0, squ, squ.length-1, -1)
  println(s)
}

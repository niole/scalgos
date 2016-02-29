object sumnums extends App {
  val A = Array(5,8,4,3)
  def sum(index: Int, nums: ArraInt], total: Int): Int = {
    if (index < nums.length) sum(index+1, nums, total + nums(index))
    else total
  }
  println(sum(0, A, 0))
}

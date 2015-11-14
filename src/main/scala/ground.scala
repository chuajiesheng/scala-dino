trait Output {
  def print(s: String) = Console.println(s)
}

class Ground extends Output {
  def show() = print("hello world")
}
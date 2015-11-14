import org.specs2._

trait MockOutput extends Output {
  var messages: Seq[String] = Seq()

  override def print(s: String) = messages = messages :+ s
}

class QuickStartSpec extends Specification {
  def is = s2"""

 Testing hw
   contains print | as ground       $e1

  """

  def ground = new Ground with MockOutput
  ground.show()
  def e1 = ground.messages should contain("|")
}
import org.slf4j.LoggerFactory

object Main extends App {
  val log = LoggerFactory.getLogger("KAFKA")

  1 to 5 foreach { i =>
    log.info(i.toString)
  }
}

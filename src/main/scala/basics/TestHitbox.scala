package basics

object TestHitbox {
   def main(args: Array[String]): Unit = {
     val hb1 = new Hitbox
     val hb2 = new Hitbox
     println(hb1.intersects(hb2))
   }
}
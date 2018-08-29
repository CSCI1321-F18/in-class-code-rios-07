package basics

class Hitbox {
  private var cx: Double = 0.0
  private var cy: Double = 0.0
  val width = 1.0
  val height = 1.0
  
 def intersects(other: Hitbox): Boolean = {
   val overlapX = (this.cx - other.cx).abs < 0.5*(width + other.width)
   val overlapY = (this.cy - other.cy).abs < 0.5*(width + other.width)
   overlapX && overlapY 
  }
}
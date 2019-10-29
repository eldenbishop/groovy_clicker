import java.awt.MouseInfo
import java.awt.Point
import java.awt.event.InputEvent

def loc = { java.awt.MouseInfo.getPointerInfo().getLocation() }

def start = loc()
def cursor = start
def robot = new java.awt.Robot()
def moveAbs = { x, y ->
    robot.mouseMove((int)x, (int)y)
    cursor = new java.awt.Point((int)x, (int)y)
}
def moveRel = { from, int xrel, int yrel -> moveAbs(from.x + xrel, from.y + yrel) }
def click = {
    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK)
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK)
}
def clickAbs = { x, y -> moveAbs(x, y); click(); }
def clickRel = { from, x, y ->
    moveRel(from, x, y)
    click()
}
def delay = { millis -> robot.delay(millis) }

if (false) {
  while (true) {    
    println(loc())
    Thread.sleep(1000)
  }
}

while(loc() == cursor) {
  delay(1000)
  clickAbs(112, 1123)
  clickAbs(669, 535)
  clickAbs(556, 967)
}

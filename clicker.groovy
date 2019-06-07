import java.awt.event.InputEvent

def robot = new java.awt.Robot()

100.times {
    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK)
    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK)
}

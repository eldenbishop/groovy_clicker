# groovy_clicker
A simple groovy script for triggering mouse clicks on OS/X (might work on windows, never tested it).

This is meant to be run in **groovyConsole** which is available in the bin dir of your groovy installation.

On Apple OS/X, simply paste this script into GroovyConsole. With the groovyConsole application in the forground, position the mouse over the area on another window you would like to click and then press command-r to run the script. Don't click the mouse on the target screen, you want groovyConsole maintain keyboard focus. On OS/X, the "clicks" will occur without giving the target window focus. Simply keep hitting command-r which will click 100 times per invocation. If you want a different number of clicks, simply change the value in the script.

If you need click another button on the target window, simply command-tab back to groovyConsole to continue using the auto-click feature. Muscle memory will make this very fast and efficient.

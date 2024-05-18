from ActionListener import ActionListener
from TimeListener import TimeListener
from EventManager import EventManager
import time

listener1 = ActionListener("l1")
listener2 = TimeListener("l2")
event_manager = EventManager([listener1, listener2])

def send_message(message):
    print("Message sent")

start_time = time.time()
while True:
    print("Choose action:\nSend message: 1\nExit: 2")
    action = input("")
    if action == "1":
        message = input("Enter a message: ")
        if message:
            send_message(message)
            event_manager.notify(0, None)
    else:
        end_time = time.time()
        elapsed_time = end_time - start_time
        event_manager.notify(1, elapsed_time)
        break

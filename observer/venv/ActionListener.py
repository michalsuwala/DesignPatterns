from Listener import Listener

class ActionListener(Listener):
    def __init__(self, name: str):
        self.name = name
    def update(self, action: int, data: str):
        if action == 0:
            #increase value in database
            print("action")
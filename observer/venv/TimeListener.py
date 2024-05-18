from Listener import Listener

class TimeListener(Listener):
    def __init__(self, name: str):
        self.name = name
    def update(self, action: int, data: str):
        if action == 1:
            #increase value in database
            print(f"Time: {data}")
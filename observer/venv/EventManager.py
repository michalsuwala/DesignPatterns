class EventManager:
    def __init__(self, listeners: list):
        self.listeners = listeners

    def notify(self, action: int, data: str):
        for listener in self.listeners:
            listener.update(action, data)
from TimeInterface import TimeInterface
from datetime import datetime
from Time import Time


class Adapter(TimeInterface):
    def __init__(self):
        time = Time()
        self.time_obj = time.get_time()

    def print_time(self, time_12h=None, period=None):
        time_24h = self.time_obj
        time_obj = datetime.strptime(time_24h, "%H:%M:%S")
        time_12h = time_obj.strftime("%I:%M:%S")
        period = time_obj.strftime("%p")
        print(f"{time_12h} {period}")


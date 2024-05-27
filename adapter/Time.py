from datetime import datetime


class Time:
    def get_time(self):
        now = datetime.now()
        return now.strftime("%H:%M:%S")

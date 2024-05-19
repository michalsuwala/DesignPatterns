class Singleton(type):
    _instances = {}
    def __call__(cls, *args, **kwargs):
        if cls not in cls._instances:
            cls._instances[cls] = super(Singleton, cls).__call__(*args, **kwargs)
        return cls._instances[cls]

class Database(metaclass=Singleton):
    def __init__(self):
        self.journey = 0

    def getJourney(self):
        return self.journey

    def nextJourney(self):
        self.journey += 1

    def addCastle(self, name, place):
        #add to database
        return "Added castle"

    def addMonument(self, subject, place):
        #add to database
        return "Added monument"


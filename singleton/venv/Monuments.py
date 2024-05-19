from Database import Database

class Monuments:
    def __init__(self):
        self.database = Database()

    def addMonument(self, name, place):
        return self.database.addMonument(name, place)

    def getJourney(self):
        return self.database.getJourney()

    def nextJourney(self):
        self.database.nextJourney()
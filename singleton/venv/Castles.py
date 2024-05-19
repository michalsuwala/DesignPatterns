from Database import Database

class Castles:
    def __init__(self):
        self.database = Database()

    def addCastle(self, name, place):
        return self.database.addCastle(name, place)

    def getJourney(self):
        return self.database.getJourney()

    def nextJourney(self):
        self.database.nextJourney()
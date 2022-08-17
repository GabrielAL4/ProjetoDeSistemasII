import abc


class Controle:
    @abc.abstractmethod
    def andar(self):
        pass

    def virar(self):
        pass

    def falar(self):
        pass

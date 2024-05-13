// ISP: Interface Segregation Principle
// Principio da Segregação de Interface
// Resumo: A classe não deveria ser forçada a depender de
// métodos que não usam

// O jeito errado
interface EmployeeWrong {
  salary(): number;

  generateCommission(): void;
}

class SellerWrong implements EmployeeWrong {
  salary(): number {
    return 1000;
  }

  generateCommission(): void {
    console.log("Generating Commissin");
  }
}

class ReceptionistWrong implements EmployeeWrong {
  salary(): number {
    return 1000;
  }

  generateCommission(): void {
    /** Problema: A classe Receptionist não têm comissão  */
  }
}

// O jeito certo
interface Employee {
  salary(): number;
}

interface Commissionable {
  generateCommission(): void;
}

class Seller implements Employee, Commissionable {
  salary(): number {
    return 1000;
  }

  generateCommission(): void {
    console.log("Generating Commission");
  }
}

class Receptionist implements Employee {
  salary(): number {
    return 1000;
  }
}

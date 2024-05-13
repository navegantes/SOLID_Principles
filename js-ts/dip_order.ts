// DIP: Dependency Inversion Principle
// Principio da inversão de dependência
// Resumo: Depender de abstrações ao invés de implementações concretas

interface Order {
  id: number;
  name: string;
}

// O jeito errado
class OrderRepositoryWrong {
  constructor() {}
  saveOrder(order: Order) {}
}

class OrderServiceWrong {
  private orderRepository: OrderRepositoryWrong;

  constructor() {
    this.orderRepository = new OrderRepositoryWrong();
  }

  processOrder(order: Order) {
    this.orderRepository.saveOrder(order);
  }
}

// O jeito certo
class OrderRepository {
  constructor() {}
  saveOrder(order: Order) {}
}

class OrderService {
  private orderRepository: OrderRepository;

  constructor(repository: OrderRepository) {
    this.orderRepository = repository;
  }

  processOrder(order: Order) {
    this.orderRepository.saveOrder(order);
  }
}

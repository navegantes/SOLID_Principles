// SRP: Single Responsability Principle
// Principio da responsabilidade única
// Resumo: Uma classe deve ter apenas um motivo para mudar
// * Um módulo deve ser responsável por um, e apenas um, ator

// O jeito errado
class TaskManagerWrong {
  constructor() {}

  connectAPI(): void {}

  createTask(): void {
    console.log("Create Task");
  }

  updateTask(): void {
    console.log("Update Task");
  }

  removeTask(): void {
    console.log("Remove Task");
  }

  sendNotification(): void {
    console.log("Send Notification");
  }

  sendReport(): void {
    console.log("Send Report");
  }
}

// O jeito certo
class APIConnector {
  constructor() {}

  connectAPI(): void {}
}

class ReportManager {
  constructor() {}

  sendReport(): void {
    console.log("Send Report");
  }
}

class Notificator {
  constructor() {}

  sendNotification(): void {
    console.log("Send Notification");
  }
}

class TaskManager {
  constructor() {}

  createTask(): void {
    console.log("Create Task");
  }

  updateTask(): void {
    console.log("Update Task");
  }

  removeTask(): void {
    console.log("Remove Task");
  }
}


// O jeito errado
class StudentWrong {
  constructor(public name: string) {}

  study(): void {
    console.log(`${this.name} is studying`);
  }

  deliverTCC() {
    /** Problema: Alunos de pós-graduação não entregam TCC */
  }
}

class PostgraduateStudent extends StudentWrong {
  study(): void {
    console.log(`${this.name} is studying and searching`);
  }
}

// O jeito certo
class Student {
  constructor(public name: string) {}

  study(): void {
    console.log(`${this.name} is studying`);
  }
}

class StudentGraduation extends Student {
  study(): void {
    console.log(`${this.name} is studying`);
  }

  deliverTCC() {}
}

class StudentPostGraduation extends Student {
  study(): void {
    console.log(`${this.name} is studying and searching`);
  }
}

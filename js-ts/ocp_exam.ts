// OCP: Open-Closed Principle
// Principio Aberto e Fechado
// Resumo: As entidades devem ser abertas para extensão
// e fechada para modificação

type ExamType = {
  type: "BLOOD" | "XRay";
};

// O jeito errado
class ExamApproveWrong {
  constructor() {}

  approveRequestExam(exam: ExamType): void {
    if (exam.type === "BLOOD") {
      if (this.verifyConditionsBlood(exam)) {
        console.log("Blood Exam Approved");
      }
    } else if (exam.type === "XRay") {
      if (this.verifyConditionsXRay(exam)) {
        console.log("XRay Exam Approved");
      }
    }
  }

  verifyConditionsBlood(exam: ExamType): boolean {
    return true;
  }

  verifyConditionsXRay(exam: ExamType): boolean {
    return false;
  }
}

// O jeito certo
interface ExamApprove {
  approveRequestExam(exam: ExamType): void;
  verifyConditionExam(exam: ExamType): boolean;
}

class BloodExamApprove implements ExamApprove {
  approveRequestExam(exam: ExamType): void {
    if (this.verifyConditionExam(exam)) {
      console.log("Blood Examp Approved");
    }
  }

  verifyConditionExam(exam: ExamType): boolean {
    return true;
  }
}

class XRayExamApprove implements ExamApprove {
  approveRequestExam(exam: ExamType): void {
    if (this.verifyConditionExam(exam)) {
      console.log("XRay Examp Approved");
    }
  }

  verifyConditionExam(exam: ExamType): boolean {
    return true;
  }
}

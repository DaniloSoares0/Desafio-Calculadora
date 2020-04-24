package br.com.codenation.calculadora;


public class CalculadoraSalario {



	public long calcularSalarioLiquido(double salarioBase) {
		
		return Math.round(this.validarSalario(salarioBase));
	}

	public  double calcularInss(double salarioBase) {


		if(salarioBase <= 1500.00) {

			return salarioBase - (salarioBase * (8.0/100.0));

		}else

			if(salarioBase >= 1500.01 && salarioBase <= 4000.00 ) {

				return salarioBase - (salarioBase * (9.0/100.0));

			}else {

				return salarioBase - (salarioBase * (11.0/100.0));

			}

	}

	public  double calcularIRRF(double salarioBase) {


		if(salarioBase <= 3000.00) {

			return salarioBase ;
			
		}else

			if(salarioBase >= 3000.01 && salarioBase <= 6000.00 ) {

				return salarioBase - (salarioBase * (7.5/100.0));

			}else {

				return salarioBase - (salarioBase * (15.00/100.0));

			}

	}

	public  double validarSalario(double salarioBase) {
		
		if(salarioBase < 1039.00) {
			
			return  0.0;
			
		}else {
			
			return this.calcularIRRF(this.calcularInss(salarioBase));

		}
		
		
	}
	
}


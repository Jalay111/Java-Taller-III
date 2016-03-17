package com.poo.exercise;

public class TeachesArithmetic {
	private double suma;
	private double resta;
	private double multiplicacion;
	private double division;
	
	
	public TeachesArithmetic(double suma, double resta, double multiplicacion, double division) {
		super();
		this.suma = suma;
		this.resta = resta;
		this.multiplicacion = multiplicacion;
		this.division = division;
	}


	public double getSuma(int nume1, int deno1, int nume2, int deno2) {
		if( nume1 !=0 && deno1 != 0 && nume2 !=0 && deno2 !=0){
			if(deno1 == deno2){
				suma = ( nume1 + nume2 ) / deno1;
			}else{
				suma = ( (nume1 * deno2 )+(nume2 * deno1) ) / (deno1 * deno2) ;
			}
		}
		return suma;
	}
	
	public double getResta(int nume1, int deno1, int nume2, int deno2) {
		if( nume1 !=0 && deno1 != 0 && nume2 !=0 && deno2 !=0){
			if(deno1 == deno2){
				resta = ( nume1 - nume2 ) / deno1;
			}else{
				resta = ( (nume1 * deno2 )-(nume2 * deno1) ) / (deno1 * deno2) ;
			}
		}
	
		return resta;
	}

	public double getMultiplicacion(int nume1, int deno1, int nume2, int deno2) {
		if( nume1 !=0 && deno1 != 0 && nume2 !=0 && deno2 !=0){
			multiplicacion = ( (nume1 * nume2 )/( deno2 * deno1) );
		}
		return multiplicacion;
	}

	public double getDivision(int nume1, int deno1, int nume2, int deno2) {
		if( nume1 !=0 && deno1 != 0 && nume2 !=0 && deno2 !=0){
			division = ( (nume1 * deno2 )/(nume2 * deno1) );
		}
		return division;
	}


	
	
}



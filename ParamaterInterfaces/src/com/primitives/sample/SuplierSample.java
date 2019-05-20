package com.primitives.sample;

import java.util.function.BinaryOperator;
import java.util.function.DoubleSupplier;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.function.BiFunction;

public class SuplierSample {
	public static void main(String[] args) {
		DoubleSupplier l = ()-> ( Math.random() * 10);
		
		System.out.println(l.getAsDouble());
		//System.out.println(l.getAsInt());
		System.out.println(l.getAsDouble());
		System.out.println(l.getAsDouble());
		
		
		UnaryOperator<Double> o = i->i*i;
		
		System.out.println(o.apply(100.9));
		
		IntUnaryOperator i=x->x*x;
		System.out.println(i.applyAsInt(79));
		
		BiFunction<String,String,Integer> f = (t1,t2)-> (t1 + t2).length();
		
		System.out.println(f.apply("Hello", "World"));
		
		BinaryOperator<String> or= (a,b)->a+b;
		System.out.println(or.apply("30", "60"));
		
		IntBinaryOperator inBiOp = (a,b)->(a + b);
		System.out.println(inBiOp.applyAsInt("30".length(), "60".length()));
	}
}

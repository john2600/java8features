package com.primitives.sample;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongConsumer;
import java.util.function.ToIntFunction;

public class PrimitiveTypes {
	// 1 
	public static void main(String[] args) {
		Function<Integer,Integer> p=i->i*i;
		int result = p.apply(5);
		System.out.println(result);
		
		IntFunction<Integer> r = i->i * i;
		
		System.out.println(r.apply(5));
		
		Function<String,Integer> s = x->x.length();
		
		System.out.println(s.apply("juan"));
		
		
		ToIntFunction<String> o = x->x.length();
		
		System.out.println(o.applyAsInt("juan"));
		
		
		Function<Integer,Double> sq = i->Math.sqrt(i);
		
		System.out.println(sq.apply(3));
		
		
		IntToDoubleFunction id = i->Math.sqrt(i);
		
		System.out.println(id.applyAsDouble(3));
		
		BiConsumer<Integer, String> bi = (x,y)->System.out.println(x+y.length());
		
		bi.accept(30, "juan");
		
		
		IntConsumer ic = x-> System.out.println(x*x);
		
		ic.accept(33);
		
		LongConsumer longCon = x->System.out.println(x*x);
		longCon.accept(33233130);
		
		
	}
}

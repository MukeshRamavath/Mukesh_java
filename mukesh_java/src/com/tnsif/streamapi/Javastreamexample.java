package com.tnsif.streamapi;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Javastreamexample {

		public static void main(String[] args) {
			List<Product> productlist=new ArrayList<Product>();
			
			productlist.add(new Product(1,"hp",25000f));
			productlist.add(new Product(2,"lenova",60000f));
			productlist.add(new Product(3,"apple",95000f));
			productlist.add(new Product(4,"dell",55000f));
			
			List<Float> pl=productlist.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());
			
		//	System.out.println(pl);
			
			
			Double totalprice=productlist.stream().collect(Collectors.summarizingDouble(Product->Product.price));
			System.out.println(totalprice);
			Product a=productlist.stream().max((pro1,pro2)->pro1.price>pro2.price?1:-1).get();
			
			System.out.println(a.price);
			Product r=productlist.stream().min((pro1,pro2)->pro1.price>pro2.price?1:-1).get();
			
			System.out.println(r.price);
			
			long count=productlist.stream().filter(product->product.price<5000).count();
			
			System.out.println(count);
		}
}

package c_statement;

import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("나는 금사빠다 : (Y/N)");
		String input = s.nextLine(); 

		if(input.equals("Y"))
		{
			System.out.println("연애할 때 끌려다니는 타입이다. : (Y/N)");
			String input2 = s.nextLine(); 
			
			if(input2.equals("Y"))
			{
				System.out.println("감정표현에 솔직한 편이다. : (Y/N)");
				String input3 = s.nextLine(); 
				
				if(input3.equals("Y"))
				{
					System.out.println("이성친구는 존재할수 없다. : (Y/N)");
					String input4 = s.nextLine(); 
					if(input4.equals("Y"))
					{
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. : (Y/N) ");
						String input5 = s.nextLine(); 
						
						if(input5.equals("Y"))
						{
							System.out.println(" TYPE D ");
						}
						else if(input5.equals("N"))
						{
							System.out.println(" TYPE C ");
						}
						else
						{
							System.out.println("입력이 잘못됨");
						}
					}
					else if(input4.equals("N"))
					{
						System.out.println(" TYPE B ");
					}
					else
					{
						System.out.println("입력이 잘못됨");
					}
				}
			}
			else if(input2.equals("N"))
			{
				System.out.println("데이트 코스는 미리 짜는게 편하다. : (Y/N)");
				String input15 = s.nextLine(); 
				
				if(input15.equals("Y"))
				{
					System.out.println("활동적인 데이트가 좋다. : (Y/N)");
					String input16 = s.nextLine();
					
					if(input16.equals("Y"))
					{
						System.out.println("이성친구는 존재할 수 없다. : (Y/N)");
						String input17 = s.nextLine();
						
						if(input17.equals("Y"))
						{
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. : (Y/N)");
							String input18 = s.nextLine();
							
							if(input18.equals("Y"))
							{
								System.out.println(" TYPE D ");
							}
							else if(input18.equals("N"))
							{
								System.out.println(" TYPE C ");
							}
							else
							{
								System.out.println("입력이 잘못됨");
							}
						}
						else if(input17.equals("N"))
						{
							System.out.println("TYPE B");
						}
						else
						{
							System.out.println("입력이 잘못됨");
						}
					}
					else if(input16.equals("N"))
					{
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. : (Y/N)");
						String input24 = s.nextLine();
						
						if(input24.equals("Y"))
						{
							System.out.println(" TYPE D ");
						}
						else if(input24.equals("N"))
						{
							System.out.println(" TYPE C ");
						}
						else
						{
							System.out.println("입력이 잘못됨");
						}
						
					}
					else
					{
						System.out.println("입력이 잘못됨");
					}
					
				}
				else if(input15.equals("N"))
				{
					System.out.println("감정표현에 솔직한 편이다. : (Y/N)");
					String input19 = s.nextLine();
					
					if(input19.equals("Y"))
					{
						System.out.println("이성친구는 존재할 수 없다. : (Y/N)");
						String input20 = s.nextLine();
						
						if(input20.equals("Y"))
						{
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. : (Y/N)");
							String input21 = s.nextLine();
							
							if(input21.equals("Y"))
							{
								System.out.println(" TYPE D ");
							}
							else if(input21.equals("N"))
							{
								System.out.println(" TYPE C ");
							}
							else
							{
								System.out.println("입력이 잘못됨");
							}
						}
						else if(input20.equals("N"))
						{
							System.out.println(" TYPE B ");
						}
						else
						{
							System.out.println("입력이 잘못됨");
						}
					}
					else if(input19.equals("N"))
					{
						System.out.println("활동적인 데이트가 좋다. : (Y/N)");
						String input22 = s.nextLine();
						
						if(input22.equals("N"))
						{
							System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓인다. : (Y/N)");
							String input23 = s.nextLine();
							
							if(input23.equals("Y"))
							{
								System.out.println(" TYPE D ");
							}
							else if(input23.equals("N"))
							{
								System.out.println(" TYPE C ");
							}
							else
							{
								System.out.println("입력이 잘못됨");
							}
							
						}
						else if(input22.equals("Y"))
						{
							System.out.println("이성친구는 존재할 수 없다. : (Y/N)");
							String input27 = s.nextLine();
							
							if(input27.equals("Y"))
							{
								System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. : (Y/N)");
								String input28 = s.nextLine();
								
								if(input28.equals("Y"))
								{
									System.out.println(" TYPE D ");
								}
								else if(input28.equals("N"))
								{
									System.out.println(" TYPE C ");
								}
								else
								{
									System.out.println("입력이 잘못됨");
								}
							}
							else if(input27.equals("N"))
							{
								System.out.println(" TYPE B ");
							}
							else
							{
								System.out.println("입력이 잘못됨");
							}
						}
						else
						{
							System.out.println("입력이 잘못됨");
						}
					}
					else
					{
						System.out.println("입력이 잘못됨");
					}
					
				}
				else
				{
					System.out.println("입력이 잘못됨");
				}
								
			}
			
		
		}	
		else if(input.equals("N"))
		{
			System.out.println("감정기복이 크지않다. : (Y/N)");
			String input6 = s.nextLine();
			
			if(input6.equals("Y"))
			{
				System.out.println("연락이 없어도 믿고 기다리는 편이다. : (Y/N)");
				String input7 = s.nextLine();
				
				if(input7.equals("Y"))
				{
					System.out.println(" TYPE A ");
				}
				else if(input7.equals("N"))
				{
					System.out.println("이성친구는 존재할 수 없다. : (Y/N)");
					String input25 = s.nextLine();
					if(input25.equals("Y"))
					{
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. : (Y/N)");
						String input26 = s.nextLine();
						
						if(input26.equals("Y"))
						{
							System.out.println(" TYPE D ");
						}
						else if(input26.equals("N"))
						{
							System.out.println(" TYPE C ");
						}
						else
						{
							System.out.println("입력이 잘못됨");
						}
						
					}
					else if(input25.equals("N"))
					{
						System.out.println(" TYPE B ");
					}
					else
					{
						System.out.println("입력이 잘못됨");
					}
					
				}
				else
				{
					System.out.println("입력이 잘못됨");
				}
			}
			
			else if(input6.equals("N"))
			{
				System.out.println("감정표현에 솔직한 편이다. : (Y/N)");
				String input8 = s.nextLine();
				
				if(input8.equals("Y"))
				{
					System.out.println("이성친구는 존재할 수 없다. : (Y/N)");
					String input9 = s.nextLine();
					
					if(input9.equals("Y"))
					{
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. : (Y/N)");
						String input10 = s.nextLine();
						
						if(input10.equals("Y"))
						{
							System.out.println(" TYPE D ");
						}
						else if(input10.equals("N"))
						{
							System.out.println(" TYPE C ");
						}
						else
						{
							System.out.println("입력이 잘못됨");
						}
					}
					else if(input9.equals("N"))
					{
						System.out.println(" TYPE B ");
					}
					else
					{
						System.out.println("입력이 잘못됨");
					}
				}
				
				else if(input8.equals("N"))
				{
					System.out.println("활동적인 데이트가 좋다. : (Y/N)");
					String input11 = s.nextLine();
					
					if(input11.equals("Y"))
					{
						System.out.println("이성친구는 존재할 수 없다. : (Y/N)");
						String input12 = s.nextLine();
						
						if(input12.equals("Y"))
						{
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. : (Y/N)");
							String input14 = s.nextLine();
							
							if(input14.equals("Y"))
							{
								System.out.println(" TYPE C ");
							}
							else if(input14.equals("N"))
							{
								System.out.println(" TYPE C ");
							}
							else
							{
								System.out.println("입력이 잘못됨");
							}
							
						}
						
						else if(input12.equals("N"))
						{
							System.out.println(" TYPE B ");
						}
						else
						{
							System.out.println("입력이 잘못됨");
						}
					}
					
					else if(input11.equals("N"))
					{
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다. : (Y/N)");
						String input13 = s.nextLine();
						
						if(input13.equals("Y"))
						{
							System.out.println(" TYPE D ");
						}
						else if(input13.equals("N"))
						{
							System.out.println(" TYPE C ");
						}
						else
						{
							System.out.println("입력이 잘못됨");
						}
					}
					
				}
				else
				{
					System.out.println("입력이 잘못됨");
				}
				
			}
			
		}
		else
		{
			System.out.println("입력이 잘못됨");
		}

	

	}

}

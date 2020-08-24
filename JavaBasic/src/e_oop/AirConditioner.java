package e_oop;

public class AirConditioner {
	
	
	boolean power; //전원 - 기본값 false
	int temperature; //온도 - 기본값 0
	int airVolume; //풍량 - 기본값 0
	
	AirConditioner()
	{
		//우리가 에어컨을 켰을때 처음 설정되어있는 값
		power = false;
		temperature = 24;
		airVolume = 1;
	}
	
	void power()
		{		
			power = !power;	
		}
	
		void temperatureUp()
		{		
			if(power)
			{
				if(temperature < 30)
				{			
					temperature++;		
				}	
			}
		}
		void temperatureDown()
		{
			if(power && temperature > 18 )
			{
				temperature--;
			}
		}
	
		void airVolume()
		{
			
			if(power && 3 < ++airVolume)
				{
					airVolume = 1;
				}
			
		}
		
		public static void main(String[] args)
		{
			AirConditioner ac = new AirConditioner();
			
			ac.power();
			System.out.println("power > " + ac.power);
			
			ac.temperatureUp();
			System.out.println("temperature > " + ac.temperature);
			
			ac.temperatureDown();
			System.out.println("temperature > " + ac.temperature);
			
			ac.airVolume();
			System.out.println("airVolume > " + ac.airVolume);
			
		}
	}



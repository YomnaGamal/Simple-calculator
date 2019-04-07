package eg.edu.alexu.csd.oop.calculator.cs60;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import eg.edu.alexu.csd.oop.calculator.Calculator;

public class Calc implements Calculator {

	public double res;
	public int current = 0,max =0;
	public String saved[] = new String[5];
	boolean flag = false ;
	@Override
	public void input(String s) {
		// TODO Auto-generated method stub
		if (!flag) {
			if (current >= 5) {
				for (int i = 0; i < 4; i++) {
					saved[i] = saved[i + 1];
				}
				current = 5;
				saved[4] = s;
			} else {
				int i = 0;
				for(i = 0;i<= 4;i++) {
					if (saved[i] == null){
						break;
					}
				}
					saved[i] = s;
					current=i+1;		
			}
		}
		flag = false;
		String nOne = "0", nTwo = "0";
		char op = '+';
		for (int i = 0; i < s.length(); i++) {
			if (i == 0 && s.charAt(0)== '-') {
				continue;
			}
			if (s.charAt(i) == '.' || Character.isDigit(s.charAt(i))) {
				continue;
			} else {
				nOne = s.substring(0, i);
				op = s.charAt(i);
				nTwo = s.substring(i + 1);
				break;
			}
		}
		switch (op) {
		case '+':
			res = Double.parseDouble(nOne) + Double.parseDouble(nTwo);
			break;
		case '-':
			res = Double.parseDouble(nOne) - Double.parseDouble(nTwo);
			break;
		case '/':
			res = Double.parseDouble(nOne) / Double.parseDouble(nTwo);
			break;
		case '*':
			res = Double.parseDouble(nOne) * Double.parseDouble(nTwo);
			break;
		}

	}

	@Override
	public String getResult() {
		// TODO Auto-generated method stub
		String r = current();
		input(r);
		return String.valueOf(res);
	}

	@Override
	public String current() {
		// TODO Auto-generated method stub
		flag = true;
		if (current == 0) {
			return saved[current];
		} else if (current>4) {
			return saved[4];
		}
		return saved[current-1];
	}

	@Override
	public String prev() {
		// TODO Auto-generated method stub
		flag = true;
		if (current == 0 || current == 1) {
			return null;
		} else {
			current--;
			String l =saved[current-1];
			input(l);
			return l;
		}
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		flag = true;
		if (current > 4) {
			current = 5;
			flag = false;
			return null;
		}else if (saved[current] == null) {
			flag = false;
			return null;
		} else {
			current++;
			String l =saved[current-1];
			input(l);
			return l;
		}
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		File f = new File("saved data.txt");
		try {
			BufferedWriter b = new BufferedWriter(new FileWriter(f));
			b.write(current);
			for (int i = 0; i < current; i++) {
				b.write(saved[i]);
				b.newLine();
			}
			b.flush();
			b.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void load() {
		// TODO Auto-generated method stub
		File f = new File("saved data.txt");
		try {
			BufferedReader b = new BufferedReader(new FileReader(f));
			try {
				current = b.read();
				int i = 0;
				while (i < 5) {
					saved[i] = b.readLine();
					i++;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			b.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

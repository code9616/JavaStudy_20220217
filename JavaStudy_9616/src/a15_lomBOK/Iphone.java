package a15_lomBOK;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Iphone {
	private int series;
	private String model;
	private String color;
	private int memorySize; 
	private int releaseYear ;
	

}

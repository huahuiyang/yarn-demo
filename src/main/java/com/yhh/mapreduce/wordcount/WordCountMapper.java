package com.yhh.mapreduce.wordcount;
import java.io.IOException;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapred.*;

public class WordCountMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text,IntWritable>  {

	@Override
	public void map(LongWritable key, Text value,
			OutputCollector<Text, IntWritable> output, Reporter reporter)
			throws IOException {
		
		String line = value.toString();
		if(line != null) {
			String[] words = line.split(" ");
			for(String word:words) {
				output.collect(new Text(word), new IntWritable(1));
			}
		}
		
	}

}

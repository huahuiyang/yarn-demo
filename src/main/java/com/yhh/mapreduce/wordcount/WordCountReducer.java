package com.yhh.mapreduce.wordcount;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapred.*;

public class WordCountReducer extends MapReduceBase implements Reducer<Text, IntWritable, Text, IntWritable>{

	@Override
	public void reduce(Text key, Iterator<IntWritable> values,
			OutputCollector<Text, IntWritable> output, Reporter reporter)
			throws IOException {
		int count = 0;
		while(values.hasNext()) {
			values.next();
			count++;
		}
		output.collect(key, new IntWritable(count));
	}

}

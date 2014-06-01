yarn-demo
=========

a wordcount mapreduce demo run on yarn

run as:

hadoop jar ~/wordcount.jar com.yhh.mapreduce.wordcount.WordCount input-file output-dir

hadoop jar ~/wordcount.jar com.yhh.mapreduce.wordcount.WordCount data.txt /wordcount/result

data.txt format: split with space, one line contaians one or more words

I write down detail in my blog: http://www.cnblogs.com/yanghuahui/p/3763820.html

yarn-demo
=========


运行示例：
hadoop jar ~/wordcount.jar com.yhh.mapreduce.wordcount.WordCount <input-file> <output-dir>

hadoop jar ~/wordcount.jar com.yhh.mapreduce.wordcount.WordCount data.txt /wordcount/result

data.txt格式如下：（每行包含一个或多个单词，空格分开）
hadoop yarn

mapreduce

hello redis

java hadoop

hello world

here we go


具体用法可以看博客：http://www.cnblogs.com/yanghuahui/p/3763820.html

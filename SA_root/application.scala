// Databricks notebook source
/* 
* Programmed By: Jared Hall, <your name here>
* Description: This is is a small Scala notebook which processes twitter data to decode user sentiment.
* Assignment: Course Project
*/

//Load in the dataset as a data-frame
val filename = "twitter1.csv"
val df = spark.read.option("header", "true")  
  .option("inferSchema","true")
  .csv("/FileStore/tables/"+filename)

//prep the df for use in the hw
df.cache()
df.createOrReplaceTempView("twitter_data") 

// COMMAND ----------

/*
* Task 1: Split dataset into 2 data-frames: 1 test and 1 train.
*/

// COMMAND ----------

/*
* Task 2: Setup DBN for input.
*/

// COMMAND ----------

/*
* Task 3: For each tweet in TRAIN: Run through DBN, DBN correction, collect output. 
*/

// COMMAND ----------

/*
* Task 4: For each tweet in TEST: Run through DBN, collect output. 
*/

// COMMAND ----------

/*
* Task 5: Pre-process output for analysis.
*/

// COMMAND ----------

/*
* Task 6: Graph Analysis of DBN output.
*/

// COMMAND ----------

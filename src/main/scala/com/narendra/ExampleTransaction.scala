package com.narendra

import java.sql.Time

import com.verizon.bda.trapezium.framework.BatchTransaction

import org.apache.spark.sql.DataFrame
import org.slf4j.LoggerFactory


/**
 * Created by parmana on 10/28/16.
 */
object ExampleTransaction extends BatchTransaction {
  val logger = LoggerFactory.getLogger(this.getClass)
  override def processBatch(df: Map[String, DataFrame], wfTime: Time): DataFrame = {
    logger.info("Inside process of TestTransaction")
    require(df.size > 0)
    val dfata=df("exampleworkflow")
    dfata.show(false) // this just for testing
    dfata
  }
  override def persistBatch(df: DataFrame, batchTime: Time): Unit = {

    println("In Persist")
   df.show(false)
    println("In Persist end")
   // df.write.parquet("my/first/Trapezium/output")
  }
}

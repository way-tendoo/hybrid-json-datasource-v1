package org.apache.spark.sql.hybrid.model

import org.apache.spark.sql.execution.streaming.Offset

case class HybridJSONOffset(commitMillis: Long) extends Offset {
  override def json(): String = commitMillis.toString
}
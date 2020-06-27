package tech.datapipes.spark.extensions.auth

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.catalyst.plans.logical.LogicalPlan
import org.apache.spark.sql.catalyst.rules.Rule

case class AuthLogicalPlanRule(spark: SparkSession) extends Rule[LogicalPlan] with Printable {
}


trait Printable extends Rule[LogicalPlan] with Logging {

  def spark: SparkSession

  override def apply(plan: LogicalPlan): LogicalPlan = {
    logWarning("apply extension")
    var message = "THIS IS A TEST SPARK EXTENSION"
    warn(
      s"""
         |+================================================+
         ||Spark SQL Print Data Pipes Auth Extension is ON |
         ||------------------------------------------------|
         ||${message}
         ||------------------------------------------------|
         ||Spark SQL Visit datapipes.tech                  |
         |+================================================+
      """.stripMargin)
    plan
  }
};
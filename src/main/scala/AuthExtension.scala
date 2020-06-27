package tech.datapipes.spark.extensions.auth

import org.apache.spark.sql.SparkSessionExtensions

class AuthExtension extends (SparkSessionExtensions => Unit) with Logging {
  override def apply(ext: SparkSessionExtensions): Unit = {
    ext.injectOptimizerRule(AuthLogicalPlanRule);
  }
}
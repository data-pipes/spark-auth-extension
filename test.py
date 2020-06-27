from pyspark.sql import SparkSession

spark = (SparkSession
            .builder
            .appName('Test')
            .config("spark.jars", "./out/artifacts/spark_auth_extension_jar/spark-auth-extension.jar")
            .config("spark.sql.extensions", "tech.datapipes.spark.extensions.auth.AuthExtension")
            .getOrCreate())

df = spark.createDataFrame([[1,2],[3,4],[5,6]])
df.show()
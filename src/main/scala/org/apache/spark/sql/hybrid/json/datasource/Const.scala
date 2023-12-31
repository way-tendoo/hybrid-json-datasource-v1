package org.apache.spark.sql.hybrid.json.datasource

object Const {

  object FieldsName {
    val Filepath     = "path"
    val ObjectName   = "objectName"
    val CommitMillis = "commitMillis"
    val SchemaRef    = "schemaRef"
    val ColumnStats  = "columnStats"
    val Name         = "name"
    val Min          = "min"
    val Max          = "max"
  }

  object TablesName {
    val FileIndex   = "file_index"
    val SchemaIndex = "schema_index"
  }

  object Database {
    val IndexStore = "index_store"
  }

  object EnvVars {
    val MongoUri = "MONGO_URI"
  }

  object TimeZone {
    val UTC = "UTC"
  }

}

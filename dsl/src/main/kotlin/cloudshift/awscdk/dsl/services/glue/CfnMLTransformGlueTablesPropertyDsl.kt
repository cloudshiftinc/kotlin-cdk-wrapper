@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnMLTransform

@CdkDslMarker
public class CfnMLTransformGlueTablesPropertyDsl {
  private val cdkBuilder: CfnMLTransform.GlueTablesProperty.Builder =
      CfnMLTransform.GlueTablesProperty.builder()

  /**
   * @param catalogId A unique identifier for the AWS Glue Data Catalog .
   */
  public fun catalogId(catalogId: String) {
    cdkBuilder.catalogId(catalogId)
  }

  /**
   * @param connectionName The name of the connection to the AWS Glue Data Catalog .
   */
  public fun connectionName(connectionName: String) {
    cdkBuilder.connectionName(connectionName)
  }

  /**
   * @param databaseName A database name in the AWS Glue Data Catalog . 
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * @param tableName A table name in the AWS Glue Data Catalog . 
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun build(): CfnMLTransform.GlueTablesProperty = cdkBuilder.build()
}

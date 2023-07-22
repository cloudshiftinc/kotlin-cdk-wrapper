@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotanalytics.CfnDataset

@CdkDslMarker
public class CfnDatasetGlueConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataset.GlueConfigurationProperty.Builder =
      CfnDataset.GlueConfigurationProperty.builder()

  /**
   * @param databaseName The name of the database in your AWS Glue Data Catalog in which the table
   * is located. 
   * An AWS Glue Data Catalog database contains metadata tables.
   */
  public fun databaseName(databaseName: String) {
    cdkBuilder.databaseName(databaseName)
  }

  /**
   * @param tableName The name of the table in your AWS Glue Data Catalog that is used to perform
   * the ETL operations. 
   * An AWS Glue Data Catalog table contains partitioned data and descriptions of data sources and
   * targets.
   */
  public fun tableName(tableName: String) {
    cdkBuilder.tableName(tableName)
  }

  public fun build(): CfnDataset.GlueConfigurationProperty = cdkBuilder.build()
}

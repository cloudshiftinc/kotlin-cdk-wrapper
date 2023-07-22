@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationCatalogConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.CatalogConfigurationProperty.Builder =
      CfnApplication.CatalogConfigurationProperty.builder()

  /**
   * @param glueDataCatalogConfiguration The configuration parameters for the default Amazon Glue
   * database.
   * You use this database for Apache Flink SQL queries and table API transforms that you write in a
   * Kinesis Data Analytics Studio notebook.
   */
  public fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: IResolvable) {
    cdkBuilder.glueDataCatalogConfiguration(glueDataCatalogConfiguration)
  }

  /**
   * @param glueDataCatalogConfiguration The configuration parameters for the default Amazon Glue
   * database.
   * You use this database for Apache Flink SQL queries and table API transforms that you write in a
   * Kinesis Data Analytics Studio notebook.
   */
  public
      fun glueDataCatalogConfiguration(glueDataCatalogConfiguration: CfnApplication.GlueDataCatalogConfigurationProperty) {
    cdkBuilder.glueDataCatalogConfiguration(glueDataCatalogConfiguration)
  }

  public fun build(): CfnApplication.CatalogConfigurationProperty = cdkBuilder.build()
}

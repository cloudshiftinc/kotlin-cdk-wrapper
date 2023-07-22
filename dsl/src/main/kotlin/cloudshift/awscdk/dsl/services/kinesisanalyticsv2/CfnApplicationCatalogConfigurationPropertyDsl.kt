@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

/**
 * The configuration parameters for the default Amazon Glue database.
 *
 * You use this database for SQL queries that you write in a Kinesis Data Analytics Studio notebook.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalyticsv2.*;
 * CatalogConfigurationProperty catalogConfigurationProperty =
 * CatalogConfigurationProperty.builder()
 * .glueDataCatalogConfiguration(GlueDataCatalogConfigurationProperty.builder()
 * .databaseArn("databaseArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-catalogconfiguration.html)
 */
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

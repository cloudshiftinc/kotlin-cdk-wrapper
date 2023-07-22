@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationGlueDataCatalogConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplication.GlueDataCatalogConfigurationProperty.Builder =
      CfnApplication.GlueDataCatalogConfigurationProperty.builder()

  /**
   * @param databaseArn The Amazon Resource Name (ARN) of the database.
   */
  public fun databaseArn(databaseArn: String) {
    cdkBuilder.databaseArn(databaseArn)
  }

  public fun build(): CfnApplication.GlueDataCatalogConfigurationProperty = cdkBuilder.build()
}

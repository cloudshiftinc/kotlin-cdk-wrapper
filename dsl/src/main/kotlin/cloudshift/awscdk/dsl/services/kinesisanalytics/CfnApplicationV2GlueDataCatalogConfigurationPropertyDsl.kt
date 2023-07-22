@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2GlueDataCatalogConfigurationPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.GlueDataCatalogConfigurationProperty.Builder =
      CfnApplicationV2.GlueDataCatalogConfigurationProperty.builder()

  /**
   * @param databaseArn The Amazon Resource Name (ARN) of the database.
   */
  public fun databaseArn(databaseArn: String) {
    cdkBuilder.databaseArn(databaseArn)
  }

  public fun build(): CfnApplicationV2.GlueDataCatalogConfigurationProperty = cdkBuilder.build()
}

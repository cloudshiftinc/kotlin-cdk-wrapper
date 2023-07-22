@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2

@CdkDslMarker
public class CfnApplicationReferenceDataSourceV2JSONMappingParametersPropertyDsl {
  private val cdkBuilder: CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty.Builder
      = CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty.builder()

  /**
   * @param recordRowPath The path to the top-level parent that contains the records. 
   */
  public fun recordRowPath(recordRowPath: String) {
    cdkBuilder.recordRowPath(recordRowPath)
  }

  public fun build(): CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty =
      cdkBuilder.build()
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplication

@CdkDslMarker
public class CfnApplicationJSONMappingParametersPropertyDsl {
  private val cdkBuilder: CfnApplication.JSONMappingParametersProperty.Builder =
      CfnApplication.JSONMappingParametersProperty.builder()

  /**
   * @param recordRowPath Path to the top-level parent that contains the records. 
   */
  public fun recordRowPath(recordRowPath: String) {
    cdkBuilder.recordRowPath(recordRowPath)
  }

  public fun build(): CfnApplication.JSONMappingParametersProperty = cdkBuilder.build()
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datapipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datapipeline.CfnPipeline

@CdkDslMarker
public class CfnPipelineParameterAttributePropertyDsl {
  private val cdkBuilder: CfnPipeline.ParameterAttributeProperty.Builder =
      CfnPipeline.ParameterAttributeProperty.builder()

  /**
   * @param key The field identifier. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param stringValue The field value, expressed as a String. 
   */
  public fun stringValue(stringValue: String) {
    cdkBuilder.stringValue(stringValue)
  }

  public fun build(): CfnPipeline.ParameterAttributeProperty = cdkBuilder.build()
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datapipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datapipeline.CfnPipeline

@CdkDslMarker
public class CfnPipelineParameterValuePropertyDsl {
  private val cdkBuilder: CfnPipeline.ParameterValueProperty.Builder =
      CfnPipeline.ParameterValueProperty.builder()

  /**
   * @param id The ID of the parameter value. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param stringValue The field value, expressed as a String. 
   */
  public fun stringValue(stringValue: String) {
    cdkBuilder.stringValue(stringValue)
  }

  public fun build(): CfnPipeline.ParameterValueProperty = cdkBuilder.build()
}

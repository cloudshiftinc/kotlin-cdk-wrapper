@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.datapipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.datapipeline.CfnPipeline

/**
 * A value or list of parameter values.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.datapipeline.*;
 * ParameterValueProperty parameterValueProperty = ParameterValueProperty.builder()
 * .id("id")
 * .stringValue("stringValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datapipeline-pipeline-parametervalue.html)
 */
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

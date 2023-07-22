@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

/**
 * Information about the variable and its new value.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotevents.*;
 * SetVariableProperty setVariableProperty = SetVariableProperty.builder()
 * .value("value")
 * .variableName("variableName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-setvariable.html)
 */
@CdkDslMarker
public class CfnDetectorModelSetVariablePropertyDsl {
  private val cdkBuilder: CfnDetectorModel.SetVariableProperty.Builder =
      CfnDetectorModel.SetVariableProperty.builder()

  /**
   * @param value The new value of the variable. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  /**
   * @param variableName The name of the variable. 
   */
  public fun variableName(variableName: String) {
    cdkBuilder.variableName(variableName)
  }

  public fun build(): CfnDetectorModel.SetVariableProperty = cdkBuilder.build()
}

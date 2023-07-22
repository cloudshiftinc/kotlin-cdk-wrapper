@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotevents

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotevents.CfnDetectorModel

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

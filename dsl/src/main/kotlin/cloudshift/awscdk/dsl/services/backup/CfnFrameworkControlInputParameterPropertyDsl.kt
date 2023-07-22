@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.backup.CfnFramework

@CdkDslMarker
public class CfnFrameworkControlInputParameterPropertyDsl {
  private val cdkBuilder: CfnFramework.ControlInputParameterProperty.Builder =
      CfnFramework.ControlInputParameterProperty.builder()

  /**
   * @param parameterName The name of a parameter, for example, `BackupPlanFrequency` . 
   */
  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  /**
   * @param parameterValue The value of parameter, for example, `hourly` . 
   */
  public fun parameterValue(parameterValue: String) {
    cdkBuilder.parameterValue(parameterValue)
  }

  public fun build(): CfnFramework.ControlInputParameterProperty = cdkBuilder.build()
}

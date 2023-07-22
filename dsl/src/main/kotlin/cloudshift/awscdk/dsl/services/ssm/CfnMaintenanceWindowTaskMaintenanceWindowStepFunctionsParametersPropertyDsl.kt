@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

@CdkDslMarker
public class CfnMaintenanceWindowTaskMaintenanceWindowStepFunctionsParametersPropertyDsl {
  private val cdkBuilder:
      CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty.Builder =
      CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty.builder()

  /**
   * @param input The inputs for the `STEP_FUNCTIONS` task.
   */
  public fun input(input: String) {
    cdkBuilder.input(input)
  }

  /**
   * @param name The name of the `STEP_FUNCTIONS` task.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnMaintenanceWindowTask.MaintenanceWindowStepFunctionsParametersProperty =
      cdkBuilder.build()
}

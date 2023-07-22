@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

@CdkDslMarker
public class CfnMaintenanceWindowTaskMaintenanceWindowAutomationParametersPropertyDsl {
  private val cdkBuilder:
      CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty.Builder =
      CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty.builder()

  /**
   * @param documentVersion The version of an Automation runbook to use during task execution.
   */
  public fun documentVersion(documentVersion: String) {
    cdkBuilder.documentVersion(documentVersion)
  }

  /**
   * @param parameters The parameters for the AUTOMATION task.
   */
  public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(parameters)
    cdkBuilder.parameters(builder.map)
  }

  /**
   * @param parameters The parameters for the AUTOMATION task.
   */
  public fun parameters(parameters: Any) {
    cdkBuilder.parameters(parameters)
  }

  public fun build(): CfnMaintenanceWindowTask.MaintenanceWindowAutomationParametersProperty =
      cdkBuilder.build()
}

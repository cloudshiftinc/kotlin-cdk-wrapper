@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rum

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rum.CfnAppMonitor

@CdkDslMarker
public class CfnAppMonitorCustomEventsPropertyDsl {
  private val cdkBuilder: CfnAppMonitor.CustomEventsProperty.Builder =
      CfnAppMonitor.CustomEventsProperty.builder()

  /**
   * @param status Set this to `ENABLED` to allow the web client to send custom events for this app
   * monitor.
   * Valid values are `ENABLED` and `DISABLED` .
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun build(): CfnAppMonitor.CustomEventsProperty = cdkBuilder.build()
}

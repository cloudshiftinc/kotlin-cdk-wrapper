@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.amazonmq

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.amazonmq.CfnBroker

@CdkDslMarker
public class CfnBrokerMaintenanceWindowPropertyDsl {
  private val cdkBuilder: CfnBroker.MaintenanceWindowProperty.Builder =
      CfnBroker.MaintenanceWindowProperty.builder()

  /**
   * @param dayOfWeek The day of the week. 
   */
  public fun dayOfWeek(dayOfWeek: String) {
    cdkBuilder.dayOfWeek(dayOfWeek)
  }

  /**
   * @param timeOfDay The time, in 24-hour format. 
   */
  public fun timeOfDay(timeOfDay: String) {
    cdkBuilder.timeOfDay(timeOfDay)
  }

  /**
   * @param timeZone The time zone, UTC by default, in either the Country/City format, or the UTC
   * offset format. 
   */
  public fun timeZone(timeZone: String) {
    cdkBuilder.timeZone(timeZone)
  }

  public fun build(): CfnBroker.MaintenanceWindowProperty = cdkBuilder.build()
}

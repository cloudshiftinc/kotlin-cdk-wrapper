@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.fsx.LustreMaintenanceTimeProps
import software.amazon.awscdk.services.fsx.Weekday

@CdkDslMarker
public class LustreMaintenanceTimePropsDsl {
  private val cdkBuilder: LustreMaintenanceTimeProps.Builder = LustreMaintenanceTimeProps.builder()

  /**
   * @param day The day of the week for maintenance to be performed. 
   */
  public fun day(day: Weekday) {
    cdkBuilder.day(day)
  }

  /**
   * @param hour The hour of the day (from 0-24) for maintenance to be performed. 
   */
  public fun hour(hour: Number) {
    cdkBuilder.hour(hour)
  }

  /**
   * @param minute The minute of the hour (from 0-59) for maintenance to be performed. 
   */
  public fun minute(minute: Number) {
    cdkBuilder.minute(minute)
  }

  public fun build(): LustreMaintenanceTimeProps = cdkBuilder.build()
}

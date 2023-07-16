@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.fsx.LustreMaintenanceTime
import software.amazon.awscdk.services.fsx.Weekday

@CdkDslMarker
public class LustreMaintenanceTimeDsl {
  private val cdkBuilder: LustreMaintenanceTime.Builder = LustreMaintenanceTime.Builder.create()

  public fun day(day: Weekday) {
    cdkBuilder.day(day)
  }

  public fun hour(hour: Number) {
    cdkBuilder.hour(hour)
  }

  public fun minute(minute: Number) {
    cdkBuilder.minute(minute)
  }

  public fun build(): LustreMaintenanceTime = cdkBuilder.build()
}

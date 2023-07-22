@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpoint.CfnApplicationSettings

@CdkDslMarker
public class CfnApplicationSettingsQuietTimePropertyDsl {
  private val cdkBuilder: CfnApplicationSettings.QuietTimeProperty.Builder =
      CfnApplicationSettings.QuietTimeProperty.builder()

  /**
   * @param end The specific time when quiet time ends. 
   * This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a
   * leading zero, if applicable) and MM is the minutes. For example, use `02:30` to represent 2:30 AM,
   * or `14:30` to represent 2:30 PM.
   */
  public fun end(end: String) {
    cdkBuilder.end(end)
  }

  /**
   * @param start The specific time when quiet time begins. 
   * This value has to use 24-hour notation and be in HH:MM format, where HH is the hour (with a
   * leading zero, if applicable) and MM is the minutes. For example, use `02:30` to represent 2:30 AM,
   * or `14:30` to represent 2:30 PM.
   */
  public fun start(start: String) {
    cdkBuilder.start(start)
  }

  public fun build(): CfnApplicationSettings.QuietTimeProperty = cdkBuilder.build()
}

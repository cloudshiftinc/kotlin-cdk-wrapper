@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.glue.CfnTrigger

@CdkDslMarker
public class CfnTriggerNotificationPropertyPropertyDsl {
  private val cdkBuilder: CfnTrigger.NotificationPropertyProperty.Builder =
      CfnTrigger.NotificationPropertyProperty.builder()

  /**
   * @param notifyDelayAfter After a job run starts, the number of minutes to wait before sending a
   * job run delay notification.
   */
  public fun notifyDelayAfter(notifyDelayAfter: Number) {
    cdkBuilder.notifyDelayAfter(notifyDelayAfter)
  }

  public fun build(): CfnTrigger.NotificationPropertyProperty = cdkBuilder.build()
}

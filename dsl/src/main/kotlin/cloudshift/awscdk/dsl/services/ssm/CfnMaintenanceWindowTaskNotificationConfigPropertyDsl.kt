@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ssm.CfnMaintenanceWindowTask

@CdkDslMarker
public class CfnMaintenanceWindowTaskNotificationConfigPropertyDsl {
  private val cdkBuilder: CfnMaintenanceWindowTask.NotificationConfigProperty.Builder =
      CfnMaintenanceWindowTask.NotificationConfigProperty.builder()

  private val _notificationEvents: MutableList<String> = mutableListOf()

  public fun notificationArn(notificationArn: String) {
    cdkBuilder.notificationArn(notificationArn)
  }

  public fun notificationEvents(vararg notificationEvents: String) {
    _notificationEvents.addAll(listOf(*notificationEvents))
  }

  public fun notificationEvents(notificationEvents: Collection<String>) {
    _notificationEvents.addAll(notificationEvents)
  }

  public fun notificationType(notificationType: String) {
    cdkBuilder.notificationType(notificationType)
  }

  public fun build(): CfnMaintenanceWindowTask.NotificationConfigProperty {
    if(_notificationEvents.isNotEmpty()) cdkBuilder.notificationEvents(_notificationEvents)
    return cdkBuilder.build()
  }
}

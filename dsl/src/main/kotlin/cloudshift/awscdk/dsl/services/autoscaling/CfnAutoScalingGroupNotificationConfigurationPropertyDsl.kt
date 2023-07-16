@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup

@CdkDslMarker
public class CfnAutoScalingGroupNotificationConfigurationPropertyDsl {
  private val cdkBuilder: CfnAutoScalingGroup.NotificationConfigurationProperty.Builder =
      CfnAutoScalingGroup.NotificationConfigurationProperty.builder()

  private val _notificationTypes: MutableList<String> = mutableListOf()

  public fun notificationTypes(vararg notificationTypes: String) {
    _notificationTypes.addAll(listOf(*notificationTypes))
  }

  public fun notificationTypes(notificationTypes: Collection<String>) {
    _notificationTypes.addAll(notificationTypes)
  }

  public fun topicArn(topicArn: String) {
    cdkBuilder.topicArn(topicArn)
  }

  public fun build(): CfnAutoScalingGroup.NotificationConfigurationProperty {
    if(_notificationTypes.isNotEmpty()) cdkBuilder.notificationTypes(_notificationTypes)
    return cdkBuilder.build()
  }
}

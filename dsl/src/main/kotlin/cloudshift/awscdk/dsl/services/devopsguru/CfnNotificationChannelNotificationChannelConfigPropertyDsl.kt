@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devopsguru

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannel

@CdkDslMarker
public class CfnNotificationChannelNotificationChannelConfigPropertyDsl {
  private val cdkBuilder: CfnNotificationChannel.NotificationChannelConfigProperty.Builder =
      CfnNotificationChannel.NotificationChannelConfigProperty.builder()

  public fun filters(filters: IResolvable) {
    cdkBuilder.filters(filters)
  }

  public fun filters(filters: CfnNotificationChannel.NotificationFilterConfigProperty) {
    cdkBuilder.filters(filters)
  }

  public fun sns(sns: IResolvable) {
    cdkBuilder.sns(sns)
  }

  public fun sns(sns: CfnNotificationChannel.SnsChannelConfigProperty) {
    cdkBuilder.sns(sns)
  }

  public fun build(): CfnNotificationChannel.NotificationChannelConfigProperty = cdkBuilder.build()
}

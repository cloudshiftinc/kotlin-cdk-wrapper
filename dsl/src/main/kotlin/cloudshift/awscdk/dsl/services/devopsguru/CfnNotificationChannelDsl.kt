@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devopsguru

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannel
import software.constructs.Construct

@CdkDslMarker
public class CfnNotificationChannelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnNotificationChannel.Builder =
      CfnNotificationChannel.Builder.create(scope, id)

  /**
   * A `NotificationChannelConfig` object that contains information about configured notification
   * channels.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-notificationchannel.html#cfn-devopsguru-notificationchannel-config)
   * @param config A `NotificationChannelConfig` object that contains information about configured
   * notification channels. 
   */
  public fun config(config: IResolvable) {
    cdkBuilder.config(config)
  }

  /**
   * A `NotificationChannelConfig` object that contains information about configured notification
   * channels.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-notificationchannel.html#cfn-devopsguru-notificationchannel-config)
   * @param config A `NotificationChannelConfig` object that contains information about configured
   * notification channels. 
   */
  public fun config(config: CfnNotificationChannel.NotificationChannelConfigProperty) {
    cdkBuilder.config(config)
  }

  public fun build(): CfnNotificationChannel = cdkBuilder.build()
}

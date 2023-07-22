@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devopsguru

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannel
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps

/**
 * Properties for defining a `CfnNotificationChannel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.devopsguru.*;
 * CfnNotificationChannelProps cfnNotificationChannelProps = CfnNotificationChannelProps.builder()
 * .config(NotificationChannelConfigProperty.builder()
 * .filters(NotificationFilterConfigProperty.builder()
 * .messageTypes(List.of("messageTypes"))
 * .severities(List.of("severities"))
 * .build())
 * .sns(SnsChannelConfigProperty.builder()
 * .topicArn("topicArn")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-notificationchannel.html)
 */
@CdkDslMarker
public class CfnNotificationChannelPropsDsl {
  private val cdkBuilder: CfnNotificationChannelProps.Builder =
      CfnNotificationChannelProps.builder()

  /**
   * @param config A `NotificationChannelConfig` object that contains information about configured
   * notification channels. 
   */
  public fun config(config: IResolvable) {
    cdkBuilder.config(config)
  }

  /**
   * @param config A `NotificationChannelConfig` object that contains information about configured
   * notification channels. 
   */
  public fun config(config: CfnNotificationChannel.NotificationChannelConfigProperty) {
    cdkBuilder.config(config)
  }

  public fun build(): CfnNotificationChannelProps = cdkBuilder.build()
}

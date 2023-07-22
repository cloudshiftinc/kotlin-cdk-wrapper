@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnWorkteam

@CdkDslMarker
public class CfnWorkteamNotificationConfigurationPropertyDsl {
  private val cdkBuilder: CfnWorkteam.NotificationConfigurationProperty.Builder =
      CfnWorkteam.NotificationConfigurationProperty.builder()

  /**
   * @param notificationTopicArn The ARN for the Amazon SNS topic to which notifications should be
   * published. 
   */
  public fun notificationTopicArn(notificationTopicArn: String) {
    cdkBuilder.notificationTopicArn(notificationTopicArn)
  }

  public fun build(): CfnWorkteam.NotificationConfigurationProperty = cdkBuilder.build()
}

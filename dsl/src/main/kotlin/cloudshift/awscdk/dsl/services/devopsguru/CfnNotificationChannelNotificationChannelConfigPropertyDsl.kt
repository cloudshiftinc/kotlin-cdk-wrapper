@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devopsguru

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.devopsguru.CfnNotificationChannel

@CdkDslMarker
public class CfnNotificationChannelNotificationChannelConfigPropertyDsl {
  private val cdkBuilder: CfnNotificationChannel.NotificationChannelConfigProperty.Builder =
      CfnNotificationChannel.NotificationChannelConfigProperty.builder()

  /**
   * @param filters The filter configurations for the Amazon SNS notification topic you use with
   * DevOps Guru.
   * If you do not provide filter configurations, the default configurations are to receive
   * notifications for all message types of `High` or `Medium` severity.
   */
  public fun filters(filters: IResolvable) {
    cdkBuilder.filters(filters)
  }

  /**
   * @param filters The filter configurations for the Amazon SNS notification topic you use with
   * DevOps Guru.
   * If you do not provide filter configurations, the default configurations are to receive
   * notifications for all message types of `High` or `Medium` severity.
   */
  public fun filters(filters: CfnNotificationChannel.NotificationFilterConfigProperty) {
    cdkBuilder.filters(filters)
  }

  /**
   * @param sns Information about a notification channel configured in DevOps Guru to send
   * notifications when insights are created.
   * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants
   * DevOps Guru permission to send it notifications. DevOps Guru adds the required policy on your
   * behalf to send notifications using Amazon SNS in your account. DevOps Guru only supports standard
   * SNS topics. For more information, see [Permissions for Amazon SNS
   * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html) .
   *
   * If you use an Amazon SNS topic that is encrypted by an AWS Key Management Service
   * customer-managed key (CMK), then you must add permissions to the CMK. For more information, see
   * [Permissions for AWS KMS–encrypted Amazon SNS
   * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html) .
   */
  public fun sns(sns: IResolvable) {
    cdkBuilder.sns(sns)
  }

  /**
   * @param sns Information about a notification channel configured in DevOps Guru to send
   * notifications when insights are created.
   * If you use an Amazon SNS topic in another account, you must attach a policy to it that grants
   * DevOps Guru permission to send it notifications. DevOps Guru adds the required policy on your
   * behalf to send notifications using Amazon SNS in your account. DevOps Guru only supports standard
   * SNS topics. For more information, see [Permissions for Amazon SNS
   * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-required-permissions.html) .
   *
   * If you use an Amazon SNS topic that is encrypted by an AWS Key Management Service
   * customer-managed key (CMK), then you must add permissions to the CMK. For more information, see
   * [Permissions for AWS KMS–encrypted Amazon SNS
   * topics](https://docs.aws.amazon.com/devops-guru/latest/userguide/sns-kms-permissions.html) .
   */
  public fun sns(sns: CfnNotificationChannel.SnsChannelConfigProperty) {
    cdkBuilder.sns(sns)
  }

  public fun build(): CfnNotificationChannel.NotificationChannelConfigProperty = cdkBuilder.build()
}

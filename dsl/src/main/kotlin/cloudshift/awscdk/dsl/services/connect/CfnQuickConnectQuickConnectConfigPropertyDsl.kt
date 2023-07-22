@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnQuickConnect

/**
 * Contains configuration settings for a quick connect.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.connect.*;
 * QuickConnectConfigProperty quickConnectConfigProperty = QuickConnectConfigProperty.builder()
 * .quickConnectType("quickConnectType")
 * // the properties below are optional
 * .phoneConfig(PhoneNumberQuickConnectConfigProperty.builder()
 * .phoneNumber("phoneNumber")
 * .build())
 * .queueConfig(QueueQuickConnectConfigProperty.builder()
 * .contactFlowArn("contactFlowArn")
 * .queueArn("queueArn")
 * .build())
 * .userConfig(UserQuickConnectConfigProperty.builder()
 * .contactFlowArn("contactFlowArn")
 * .userArn("userArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-quickconnect-quickconnectconfig.html)
 */
@CdkDslMarker
public class CfnQuickConnectQuickConnectConfigPropertyDsl {
  private val cdkBuilder: CfnQuickConnect.QuickConnectConfigProperty.Builder =
      CfnQuickConnect.QuickConnectConfigProperty.builder()

  /**
   * @param phoneConfig The phone configuration.
   * This is required only if QuickConnectType is PHONE_NUMBER.
   */
  public fun phoneConfig(phoneConfig: IResolvable) {
    cdkBuilder.phoneConfig(phoneConfig)
  }

  /**
   * @param phoneConfig The phone configuration.
   * This is required only if QuickConnectType is PHONE_NUMBER.
   */
  public fun phoneConfig(phoneConfig: CfnQuickConnect.PhoneNumberQuickConnectConfigProperty) {
    cdkBuilder.phoneConfig(phoneConfig)
  }

  /**
   * @param queueConfig The queue configuration.
   * This is required only if QuickConnectType is QUEUE.
   */
  public fun queueConfig(queueConfig: IResolvable) {
    cdkBuilder.queueConfig(queueConfig)
  }

  /**
   * @param queueConfig The queue configuration.
   * This is required only if QuickConnectType is QUEUE.
   */
  public fun queueConfig(queueConfig: CfnQuickConnect.QueueQuickConnectConfigProperty) {
    cdkBuilder.queueConfig(queueConfig)
  }

  /**
   * @param quickConnectType The type of quick connect. 
   * In the Amazon Connect console, when you create a quick connect, you are prompted to assign one
   * of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
   */
  public fun quickConnectType(quickConnectType: String) {
    cdkBuilder.quickConnectType(quickConnectType)
  }

  /**
   * @param userConfig The user configuration.
   * This is required only if QuickConnectType is USER.
   */
  public fun userConfig(userConfig: IResolvable) {
    cdkBuilder.userConfig(userConfig)
  }

  /**
   * @param userConfig The user configuration.
   * This is required only if QuickConnectType is USER.
   */
  public fun userConfig(userConfig: CfnQuickConnect.UserQuickConnectConfigProperty) {
    cdkBuilder.userConfig(userConfig)
  }

  public fun build(): CfnQuickConnect.QuickConnectConfigProperty = cdkBuilder.build()
}

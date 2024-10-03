@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.securitylake

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSubscriberNotification`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.securitylake.*;
 * Object sqsNotificationConfiguration;
 * CfnSubscriberNotificationProps cfnSubscriberNotificationProps =
 * CfnSubscriberNotificationProps.builder()
 * .notificationConfiguration(NotificationConfigurationProperty.builder()
 * .httpsNotificationConfiguration(HttpsNotificationConfigurationProperty.builder()
 * .endpoint("endpoint")
 * .targetRoleArn("targetRoleArn")
 * // the properties below are optional
 * .authorizationApiKeyName("authorizationApiKeyName")
 * .authorizationApiKeyValue("authorizationApiKeyValue")
 * .httpMethod("httpMethod")
 * .build())
 * .sqsNotificationConfiguration(sqsNotificationConfiguration)
 * .build())
 * .subscriberArn("subscriberArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscribernotification.html)
 */
public interface CfnSubscriberNotificationProps {
  /**
   * Specify the configurations you want to use for subscriber notification.
   *
   * The subscriber is notified when new data is written to the data lake for sources that the
   * subscriber consumes in Security Lake .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscribernotification.html#cfn-securitylake-subscribernotification-notificationconfiguration)
   */
  public fun notificationConfiguration(): Any

  /**
   * The Amazon Resource Name (ARN) of the Security Lake subscriber.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscribernotification.html#cfn-securitylake-subscribernotification-subscriberarn)
   */
  public fun subscriberArn(): String

  /**
   * A builder for [CfnSubscriberNotificationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param notificationConfiguration Specify the configurations you want to use for subscriber
     * notification. 
     * The subscriber is notified when new data is written to the data lake for sources that the
     * subscriber consumes in Security Lake .
     */
    public fun notificationConfiguration(notificationConfiguration: IResolvable)

    /**
     * @param notificationConfiguration Specify the configurations you want to use for subscriber
     * notification. 
     * The subscriber is notified when new data is written to the data lake for sources that the
     * subscriber consumes in Security Lake .
     */
    public
        fun notificationConfiguration(notificationConfiguration: CfnSubscriberNotification.NotificationConfigurationProperty)

    /**
     * @param notificationConfiguration Specify the configurations you want to use for subscriber
     * notification. 
     * The subscriber is notified when new data is written to the data lake for sources that the
     * subscriber consumes in Security Lake .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1c3194637f51a16f001e43cb2898cd8d39f99fc420775a916b48942f60979889")
    public
        fun notificationConfiguration(notificationConfiguration: CfnSubscriberNotification.NotificationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param subscriberArn The Amazon Resource Name (ARN) of the Security Lake subscriber. 
     */
    public fun subscriberArn(subscriberArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.securitylake.CfnSubscriberNotificationProps.Builder =
        software.amazon.awscdk.services.securitylake.CfnSubscriberNotificationProps.builder()

    /**
     * @param notificationConfiguration Specify the configurations you want to use for subscriber
     * notification. 
     * The subscriber is notified when new data is written to the data lake for sources that the
     * subscriber consumes in Security Lake .
     */
    override fun notificationConfiguration(notificationConfiguration: IResolvable) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param notificationConfiguration Specify the configurations you want to use for subscriber
     * notification. 
     * The subscriber is notified when new data is written to the data lake for sources that the
     * subscriber consumes in Security Lake .
     */
    override
        fun notificationConfiguration(notificationConfiguration: CfnSubscriberNotification.NotificationConfigurationProperty) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(CfnSubscriberNotification.NotificationConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param notificationConfiguration Specify the configurations you want to use for subscriber
     * notification. 
     * The subscriber is notified when new data is written to the data lake for sources that the
     * subscriber consumes in Security Lake .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1c3194637f51a16f001e43cb2898cd8d39f99fc420775a916b48942f60979889")
    override
        fun notificationConfiguration(notificationConfiguration: CfnSubscriberNotification.NotificationConfigurationProperty.Builder.() -> Unit):
        Unit =
        notificationConfiguration(CfnSubscriberNotification.NotificationConfigurationProperty(notificationConfiguration))

    /**
     * @param subscriberArn The Amazon Resource Name (ARN) of the Security Lake subscriber. 
     */
    override fun subscriberArn(subscriberArn: String) {
      cdkBuilder.subscriberArn(subscriberArn)
    }

    public fun build(): software.amazon.awscdk.services.securitylake.CfnSubscriberNotificationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.securitylake.CfnSubscriberNotificationProps,
  ) : CdkObject(cdkObject),
      CfnSubscriberNotificationProps {
    /**
     * Specify the configurations you want to use for subscriber notification.
     *
     * The subscriber is notified when new data is written to the data lake for sources that the
     * subscriber consumes in Security Lake .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscribernotification.html#cfn-securitylake-subscribernotification-notificationconfiguration)
     */
    override fun notificationConfiguration(): Any = unwrap(this).getNotificationConfiguration()

    /**
     * The Amazon Resource Name (ARN) of the Security Lake subscriber.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-securitylake-subscribernotification.html#cfn-securitylake-subscribernotification-subscriberarn)
     */
    override fun subscriberArn(): String = unwrap(this).getSubscriberArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSubscriberNotificationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.securitylake.CfnSubscriberNotificationProps):
        CfnSubscriberNotificationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnSubscriberNotificationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSubscriberNotificationProps):
        software.amazon.awscdk.services.securitylake.CfnSubscriberNotificationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.securitylake.CfnSubscriberNotificationProps
  }
}

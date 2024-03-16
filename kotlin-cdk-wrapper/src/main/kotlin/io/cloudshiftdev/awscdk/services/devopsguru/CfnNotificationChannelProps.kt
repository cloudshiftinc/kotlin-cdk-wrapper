@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.devopsguru

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnNotificationChannel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.devopsguru.*;
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
public interface CfnNotificationChannelProps {
  /**
   * A `NotificationChannelConfig` object that contains information about configured notification
   * channels.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-notificationchannel.html#cfn-devopsguru-notificationchannel-config)
   */
  public fun config(): Any

  /**
   * A builder for [CfnNotificationChannelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param config A `NotificationChannelConfig` object that contains information about configured
     * notification channels. 
     */
    public fun config(config: IResolvable)

    /**
     * @param config A `NotificationChannelConfig` object that contains information about configured
     * notification channels. 
     */
    public fun config(config: CfnNotificationChannel.NotificationChannelConfigProperty)

    /**
     * @param config A `NotificationChannelConfig` object that contains information about configured
     * notification channels. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1852829fd8f53980d0685f78e14253379f8c85928cc008e34f48b671cbd2cf20")
    public
        fun config(config: CfnNotificationChannel.NotificationChannelConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps.Builder =
        software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps.builder()

    /**
     * @param config A `NotificationChannelConfig` object that contains information about configured
     * notification channels. 
     */
    override fun config(config: IResolvable) {
      cdkBuilder.config(config.let(IResolvable::unwrap))
    }

    /**
     * @param config A `NotificationChannelConfig` object that contains information about configured
     * notification channels. 
     */
    override fun config(config: CfnNotificationChannel.NotificationChannelConfigProperty) {
      cdkBuilder.config(config.let(CfnNotificationChannel.NotificationChannelConfigProperty::unwrap))
    }

    /**
     * @param config A `NotificationChannelConfig` object that contains information about configured
     * notification channels. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1852829fd8f53980d0685f78e14253379f8c85928cc008e34f48b671cbd2cf20")
    override
        fun config(config: CfnNotificationChannel.NotificationChannelConfigProperty.Builder.() -> Unit):
        Unit = config(CfnNotificationChannel.NotificationChannelConfigProperty(config))

    public fun build(): software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps,
  ) : CdkObject(cdkObject), CfnNotificationChannelProps {
    /**
     * A `NotificationChannelConfig` object that contains information about configured notification
     * channels.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devopsguru-notificationchannel.html#cfn-devopsguru-notificationchannel-config)
     */
    override fun config(): Any = unwrap(this).getConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNotificationChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps):
        CfnNotificationChannelProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnNotificationChannelProps

    internal fun unwrap(wrapped: CfnNotificationChannelProps):
        software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.devopsguru.CfnNotificationChannelProps
  }
}

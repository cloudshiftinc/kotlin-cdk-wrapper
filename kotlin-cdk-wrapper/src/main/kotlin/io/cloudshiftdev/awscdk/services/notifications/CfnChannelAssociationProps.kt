@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.notifications

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnChannelAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.notifications.*;
 * CfnChannelAssociationProps cfnChannelAssociationProps = CfnChannelAssociationProps.builder()
 * .arn("arn")
 * .notificationConfigurationArn("notificationConfigurationArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-channelassociation.html)
 */
public interface CfnChannelAssociationProps {
  /**
   * The Amazon Resource Name (ARN) of the `Channel` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-channelassociation.html#cfn-notifications-channelassociation-arn)
   */
  public fun arn(): String

  /**
   * The ARN of the `NotificationConfiguration` associated with the `Channel` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-channelassociation.html#cfn-notifications-channelassociation-notificationconfigurationarn)
   */
  public fun notificationConfigurationArn(): String

  /**
   * A builder for [CfnChannelAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param arn The Amazon Resource Name (ARN) of the `Channel` . 
     */
    public fun arn(arn: String)

    /**
     * @param notificationConfigurationArn The ARN of the `NotificationConfiguration` associated
     * with the `Channel` . 
     */
    public fun notificationConfigurationArn(notificationConfigurationArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.notifications.CfnChannelAssociationProps.Builder =
        software.amazon.awscdk.services.notifications.CfnChannelAssociationProps.builder()

    /**
     * @param arn The Amazon Resource Name (ARN) of the `Channel` . 
     */
    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    /**
     * @param notificationConfigurationArn The ARN of the `NotificationConfiguration` associated
     * with the `Channel` . 
     */
    override fun notificationConfigurationArn(notificationConfigurationArn: String) {
      cdkBuilder.notificationConfigurationArn(notificationConfigurationArn)
    }

    public fun build(): software.amazon.awscdk.services.notifications.CfnChannelAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.notifications.CfnChannelAssociationProps,
  ) : CdkObject(cdkObject),
      CfnChannelAssociationProps {
    /**
     * The Amazon Resource Name (ARN) of the `Channel` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-channelassociation.html#cfn-notifications-channelassociation-arn)
     */
    override fun arn(): String = unwrap(this).getArn()

    /**
     * The ARN of the `NotificationConfiguration` associated with the `Channel` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-channelassociation.html#cfn-notifications-channelassociation-notificationconfigurationarn)
     */
    override fun notificationConfigurationArn(): String =
        unwrap(this).getNotificationConfigurationArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnChannelAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.notifications.CfnChannelAssociationProps):
        CfnChannelAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnChannelAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnChannelAssociationProps):
        software.amazon.awscdk.services.notifications.CfnChannelAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.notifications.CfnChannelAssociationProps
  }
}

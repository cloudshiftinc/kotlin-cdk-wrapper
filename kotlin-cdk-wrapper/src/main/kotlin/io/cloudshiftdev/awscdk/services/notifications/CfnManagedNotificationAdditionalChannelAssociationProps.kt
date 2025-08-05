@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.notifications

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnManagedNotificationAdditionalChannelAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.notifications.*;
 * CfnManagedNotificationAdditionalChannelAssociationProps
 * cfnManagedNotificationAdditionalChannelAssociationProps =
 * CfnManagedNotificationAdditionalChannelAssociationProps.builder()
 * .channelArn("channelArn")
 * .managedNotificationConfigurationArn("managedNotificationConfigurationArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-managednotificationadditionalchannelassociation.html)
 */
public interface CfnManagedNotificationAdditionalChannelAssociationProps {
  /**
   * The ARN of the `Channel` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-managednotificationadditionalchannelassociation.html#cfn-notifications-managednotificationadditionalchannelassociation-channelarn)
   */
  public fun channelArn(): String

  /**
   * The ARN of the `ManagedNotificationAdditionalChannelAssociation` associated with the `Channel`
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-managednotificationadditionalchannelassociation.html#cfn-notifications-managednotificationadditionalchannelassociation-managednotificationconfigurationarn)
   */
  public fun managedNotificationConfigurationArn(): String

  /**
   * A builder for [CfnManagedNotificationAdditionalChannelAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param channelArn The ARN of the `Channel` . 
     */
    public fun channelArn(channelArn: String)

    /**
     * @param managedNotificationConfigurationArn The ARN of the
     * `ManagedNotificationAdditionalChannelAssociation` associated with the `Channel` . 
     */
    public fun managedNotificationConfigurationArn(managedNotificationConfigurationArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.notifications.CfnManagedNotificationAdditionalChannelAssociationProps.Builder
        =
        software.amazon.awscdk.services.notifications.CfnManagedNotificationAdditionalChannelAssociationProps.builder()

    /**
     * @param channelArn The ARN of the `Channel` . 
     */
    override fun channelArn(channelArn: String) {
      cdkBuilder.channelArn(channelArn)
    }

    /**
     * @param managedNotificationConfigurationArn The ARN of the
     * `ManagedNotificationAdditionalChannelAssociation` associated with the `Channel` . 
     */
    override fun managedNotificationConfigurationArn(managedNotificationConfigurationArn: String) {
      cdkBuilder.managedNotificationConfigurationArn(managedNotificationConfigurationArn)
    }

    public fun build():
        software.amazon.awscdk.services.notifications.CfnManagedNotificationAdditionalChannelAssociationProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.notifications.CfnManagedNotificationAdditionalChannelAssociationProps,
  ) : CdkObject(cdkObject),
      CfnManagedNotificationAdditionalChannelAssociationProps {
    /**
     * The ARN of the `Channel` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-managednotificationadditionalchannelassociation.html#cfn-notifications-managednotificationadditionalchannelassociation-channelarn)
     */
    override fun channelArn(): String = unwrap(this).getChannelArn()

    /**
     * The ARN of the `ManagedNotificationAdditionalChannelAssociation` associated with the
     * `Channel` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-managednotificationadditionalchannelassociation.html#cfn-notifications-managednotificationadditionalchannelassociation-managednotificationconfigurationarn)
     */
    override fun managedNotificationConfigurationArn(): String =
        unwrap(this).getManagedNotificationConfigurationArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnManagedNotificationAdditionalChannelAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.notifications.CfnManagedNotificationAdditionalChannelAssociationProps):
        CfnManagedNotificationAdditionalChannelAssociationProps = CdkObjectWrappers.wrap(cdkObject)
        as? CfnManagedNotificationAdditionalChannelAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnManagedNotificationAdditionalChannelAssociationProps):
        software.amazon.awscdk.services.notifications.CfnManagedNotificationAdditionalChannelAssociationProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.notifications.CfnManagedNotificationAdditionalChannelAssociationProps
  }
}

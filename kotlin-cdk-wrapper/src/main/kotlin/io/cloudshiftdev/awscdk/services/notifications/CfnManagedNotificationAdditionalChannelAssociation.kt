@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.notifications

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Associates a `Channel` with a `ManagedNotificationAdditionalChannelAssociation` for AWS User
 * Notifications .
 *
 * For more information about AWS User Notifications , see the [AWS User Notifications User
 * Guide](https://docs.aws.amazon.com/notifications/latest/userguide/what-is-service.html) .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.notifications.*;
 * CfnManagedNotificationAdditionalChannelAssociation
 * cfnManagedNotificationAdditionalChannelAssociation =
 * CfnManagedNotificationAdditionalChannelAssociation.Builder.create(this,
 * "MyCfnManagedNotificationAdditionalChannelAssociation")
 * .channelArn("channelArn")
 * .managedNotificationConfigurationArn("managedNotificationConfigurationArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-managednotificationadditionalchannelassociation.html)
 */
public open class CfnManagedNotificationAdditionalChannelAssociation(
  cdkObject: software.amazon.awscdk.services.notifications.CfnManagedNotificationAdditionalChannelAssociation,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnManagedNotificationAdditionalChannelAssociationProps,
  ) :
      this(software.amazon.awscdk.services.notifications.CfnManagedNotificationAdditionalChannelAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnManagedNotificationAdditionalChannelAssociationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnManagedNotificationAdditionalChannelAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnManagedNotificationAdditionalChannelAssociationProps(props)
  )

  /**
   * The ARN of the `Channel` .
   */
  public open fun channelArn(): String = unwrap(this).getChannelArn()

  /**
   * The ARN of the `Channel` .
   */
  public open fun channelArn(`value`: String) {
    unwrap(this).setChannelArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ARN of the `ManagedNotificationAdditionalChannelAssociation` associated with the `Channel`
   * .
   */
  public open fun managedNotificationConfigurationArn(): String =
      unwrap(this).getManagedNotificationConfigurationArn()

  /**
   * The ARN of the `ManagedNotificationAdditionalChannelAssociation` associated with the `Channel`
   * .
   */
  public open fun managedNotificationConfigurationArn(`value`: String) {
    unwrap(this).setManagedNotificationConfigurationArn(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.notifications.CfnManagedNotificationAdditionalChannelAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ARN of the `Channel` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-managednotificationadditionalchannelassociation.html#cfn-notifications-managednotificationadditionalchannelassociation-channelarn)
     * @param channelArn The ARN of the `Channel` . 
     */
    public fun channelArn(channelArn: String)

    /**
     * The ARN of the `ManagedNotificationAdditionalChannelAssociation` associated with the
     * `Channel` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-managednotificationadditionalchannelassociation.html#cfn-notifications-managednotificationadditionalchannelassociation-managednotificationconfigurationarn)
     * @param managedNotificationConfigurationArn The ARN of the
     * `ManagedNotificationAdditionalChannelAssociation` associated with the `Channel` . 
     */
    public fun managedNotificationConfigurationArn(managedNotificationConfigurationArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.notifications.CfnManagedNotificationAdditionalChannelAssociation.Builder
        =
        software.amazon.awscdk.services.notifications.CfnManagedNotificationAdditionalChannelAssociation.Builder.create(scope,
        id)

    /**
     * The ARN of the `Channel` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-managednotificationadditionalchannelassociation.html#cfn-notifications-managednotificationadditionalchannelassociation-channelarn)
     * @param channelArn The ARN of the `Channel` . 
     */
    override fun channelArn(channelArn: String) {
      cdkBuilder.channelArn(channelArn)
    }

    /**
     * The ARN of the `ManagedNotificationAdditionalChannelAssociation` associated with the
     * `Channel` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-managednotificationadditionalchannelassociation.html#cfn-notifications-managednotificationadditionalchannelassociation-managednotificationconfigurationarn)
     * @param managedNotificationConfigurationArn The ARN of the
     * `ManagedNotificationAdditionalChannelAssociation` associated with the `Channel` . 
     */
    override fun managedNotificationConfigurationArn(managedNotificationConfigurationArn: String) {
      cdkBuilder.managedNotificationConfigurationArn(managedNotificationConfigurationArn)
    }

    public fun build():
        software.amazon.awscdk.services.notifications.CfnManagedNotificationAdditionalChannelAssociation
        = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.notifications.CfnManagedNotificationAdditionalChannelAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnManagedNotificationAdditionalChannelAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnManagedNotificationAdditionalChannelAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.notifications.CfnManagedNotificationAdditionalChannelAssociation):
        CfnManagedNotificationAdditionalChannelAssociation =
        CfnManagedNotificationAdditionalChannelAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnManagedNotificationAdditionalChannelAssociation):
        software.amazon.awscdk.services.notifications.CfnManagedNotificationAdditionalChannelAssociation
        = wrapped.cdkObject as
        software.amazon.awscdk.services.notifications.CfnManagedNotificationAdditionalChannelAssociation
  }
}

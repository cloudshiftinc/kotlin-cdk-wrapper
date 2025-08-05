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
 * The `AWS::Notifications::ChannelAssociation` resource associates a `Channel` with a
 * `NotificationConfiguration` for AWS User Notifications .
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
 * CfnChannelAssociation cfnChannelAssociation = CfnChannelAssociation.Builder.create(this,
 * "MyCfnChannelAssociation")
 * .arn("arn")
 * .notificationConfigurationArn("notificationConfigurationArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-channelassociation.html)
 */
public open class CfnChannelAssociation(
  cdkObject: software.amazon.awscdk.services.notifications.CfnChannelAssociation,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnChannelAssociationProps,
  ) :
      this(software.amazon.awscdk.services.notifications.CfnChannelAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnChannelAssociationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnChannelAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnChannelAssociationProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the `Channel` .
   */
  public open fun arn(): String = unwrap(this).getArn()

  /**
   * The Amazon Resource Name (ARN) of the `Channel` .
   */
  public open fun arn(`value`: String) {
    unwrap(this).setArn(`value`)
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
   * The ARN of the `NotificationConfiguration` associated with the `Channel` .
   */
  public open fun notificationConfigurationArn(): String =
      unwrap(this).getNotificationConfigurationArn()

  /**
   * The ARN of the `NotificationConfiguration` associated with the `Channel` .
   */
  public open fun notificationConfigurationArn(`value`: String) {
    unwrap(this).setNotificationConfigurationArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.notifications.CfnChannelAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the `Channel` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-channelassociation.html#cfn-notifications-channelassociation-arn)
     * @param arn The Amazon Resource Name (ARN) of the `Channel` . 
     */
    public fun arn(arn: String)

    /**
     * The ARN of the `NotificationConfiguration` associated with the `Channel` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-channelassociation.html#cfn-notifications-channelassociation-notificationconfigurationarn)
     * @param notificationConfigurationArn The ARN of the `NotificationConfiguration` associated
     * with the `Channel` . 
     */
    public fun notificationConfigurationArn(notificationConfigurationArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.notifications.CfnChannelAssociation.Builder =
        software.amazon.awscdk.services.notifications.CfnChannelAssociation.Builder.create(scope,
        id)

    /**
     * The Amazon Resource Name (ARN) of the `Channel` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-channelassociation.html#cfn-notifications-channelassociation-arn)
     * @param arn The Amazon Resource Name (ARN) of the `Channel` . 
     */
    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    /**
     * The ARN of the `NotificationConfiguration` associated with the `Channel` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-notifications-channelassociation.html#cfn-notifications-channelassociation-notificationconfigurationarn)
     * @param notificationConfigurationArn The ARN of the `NotificationConfiguration` associated
     * with the `Channel` . 
     */
    override fun notificationConfigurationArn(notificationConfigurationArn: String) {
      cdkBuilder.notificationConfigurationArn(notificationConfigurationArn)
    }

    public fun build(): software.amazon.awscdk.services.notifications.CfnChannelAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.notifications.CfnChannelAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnChannelAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnChannelAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.notifications.CfnChannelAssociation):
        CfnChannelAssociation = CfnChannelAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnChannelAssociation):
        software.amazon.awscdk.services.notifications.CfnChannelAssociation = wrapped.cdkObject as
        software.amazon.awscdk.services.notifications.CfnChannelAssociation
  }
}

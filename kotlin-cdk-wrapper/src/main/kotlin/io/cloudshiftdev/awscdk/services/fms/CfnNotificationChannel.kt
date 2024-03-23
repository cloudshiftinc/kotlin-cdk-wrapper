@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Designates the IAM role and Amazon Simple Notification Service (SNS) topic to use to record SNS
 * logs.
 *
 * To perform this action outside of the console, you must configure the SNS topic to allow the role
 * `AWSServiceRoleForFMS` to publish SNS logs. For more information, see [Firewall Manager required
 * permissions for API
 * actions](https://docs.aws.amazon.com/waf/latest/developerguide/fms-api-permissions-ref.html) in the
 * *AWS Firewall Manager Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.fms.*;
 * CfnNotificationChannel cfnNotificationChannel = CfnNotificationChannel.Builder.create(this,
 * "MyCfnNotificationChannel")
 * .snsRoleName("snsRoleName")
 * .snsTopicArn("snsTopicArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html)
 */
public open class CfnNotificationChannel(
  cdkObject: software.amazon.awscdk.services.fms.CfnNotificationChannel,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNotificationChannelProps,
  ) :
      this(software.amazon.awscdk.services.fms.CfnNotificationChannel(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnNotificationChannelProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnNotificationChannelProps.Builder.() -> Unit,
  ) : this(scope, id, CfnNotificationChannelProps(props)
  )

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to record AWS Firewall
   * Manager activity.
   */
  public open fun snsRoleName(): String = unwrap(this).getSnsRoleName()

  /**
   * The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to record AWS Firewall
   * Manager activity.
   */
  public open fun snsRoleName(`value`: String) {
    unwrap(this).setSnsRoleName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the SNS topic that collects notifications from AWS Firewall
   * Manager .
   */
  public open fun snsTopicArn(): String = unwrap(this).getSnsTopicArn()

  /**
   * The Amazon Resource Name (ARN) of the SNS topic that collects notifications from AWS Firewall
   * Manager .
   */
  public open fun snsTopicArn(`value`: String) {
    unwrap(this).setSnsTopicArn(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.fms.CfnNotificationChannel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to record AWS Firewall
     * Manager activity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html#cfn-fms-notificationchannel-snsrolename)
     * @param snsRoleName The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to
     * record AWS Firewall Manager activity. 
     */
    public fun snsRoleName(snsRoleName: String)

    /**
     * The Amazon Resource Name (ARN) of the SNS topic that collects notifications from AWS Firewall
     * Manager .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html#cfn-fms-notificationchannel-snstopicarn)
     * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic that collects
     * notifications from AWS Firewall Manager . 
     */
    public fun snsTopicArn(snsTopicArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fms.CfnNotificationChannel.Builder =
        software.amazon.awscdk.services.fms.CfnNotificationChannel.Builder.create(scope, id)

    /**
     * The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to record AWS Firewall
     * Manager activity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html#cfn-fms-notificationchannel-snsrolename)
     * @param snsRoleName The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to
     * record AWS Firewall Manager activity. 
     */
    override fun snsRoleName(snsRoleName: String) {
      cdkBuilder.snsRoleName(snsRoleName)
    }

    /**
     * The Amazon Resource Name (ARN) of the SNS topic that collects notifications from AWS Firewall
     * Manager .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html#cfn-fms-notificationchannel-snstopicarn)
     * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic that collects
     * notifications from AWS Firewall Manager . 
     */
    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    public fun build(): software.amazon.awscdk.services.fms.CfnNotificationChannel =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.fms.CfnNotificationChannel.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNotificationChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNotificationChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnNotificationChannel):
        CfnNotificationChannel = CfnNotificationChannel(cdkObject)

    internal fun unwrap(wrapped: CfnNotificationChannel):
        software.amazon.awscdk.services.fms.CfnNotificationChannel = wrapped.cdkObject as
        software.amazon.awscdk.services.fms.CfnNotificationChannel
  }
}

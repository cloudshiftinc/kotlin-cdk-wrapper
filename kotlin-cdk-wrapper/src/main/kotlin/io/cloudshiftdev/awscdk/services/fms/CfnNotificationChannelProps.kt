@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fms

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnNotificationChannel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.fms.*;
 * CfnNotificationChannelProps cfnNotificationChannelProps = CfnNotificationChannelProps.builder()
 * .snsRoleName("snsRoleName")
 * .snsTopicArn("snsTopicArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html)
 */
public interface CfnNotificationChannelProps {
  /**
   * The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to record AWS Firewall
   * Manager activity.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html#cfn-fms-notificationchannel-snsrolename)
   */
  public fun snsRoleName(): String

  /**
   * The Amazon Resource Name (ARN) of the SNS topic that collects notifications from AWS Firewall
   * Manager .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html#cfn-fms-notificationchannel-snstopicarn)
   */
  public fun snsTopicArn(): String

  /**
   * A builder for [CfnNotificationChannelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param snsRoleName The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to
     * record AWS Firewall Manager activity. 
     */
    public fun snsRoleName(snsRoleName: String)

    /**
     * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic that collects
     * notifications from AWS Firewall Manager . 
     */
    public fun snsTopicArn(snsTopicArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fms.CfnNotificationChannelProps.Builder
        = software.amazon.awscdk.services.fms.CfnNotificationChannelProps.builder()

    /**
     * @param snsRoleName The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to
     * record AWS Firewall Manager activity. 
     */
    override fun snsRoleName(snsRoleName: String) {
      cdkBuilder.snsRoleName(snsRoleName)
    }

    /**
     * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic that collects
     * notifications from AWS Firewall Manager . 
     */
    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    public fun build(): software.amazon.awscdk.services.fms.CfnNotificationChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fms.CfnNotificationChannelProps,
  ) : CdkObject(cdkObject), CfnNotificationChannelProps {
    /**
     * The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to record AWS Firewall
     * Manager activity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html#cfn-fms-notificationchannel-snsrolename)
     */
    override fun snsRoleName(): String = unwrap(this).getSnsRoleName()

    /**
     * The Amazon Resource Name (ARN) of the SNS topic that collects notifications from AWS Firewall
     * Manager .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-notificationchannel.html#cfn-fms-notificationchannel-snstopicarn)
     */
    override fun snsTopicArn(): String = unwrap(this).getSnsTopicArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNotificationChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnNotificationChannelProps):
        CfnNotificationChannelProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnNotificationChannelProps

    internal fun unwrap(wrapped: CfnNotificationChannelProps):
        software.amazon.awscdk.services.fms.CfnNotificationChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.fms.CfnNotificationChannelProps
  }
}

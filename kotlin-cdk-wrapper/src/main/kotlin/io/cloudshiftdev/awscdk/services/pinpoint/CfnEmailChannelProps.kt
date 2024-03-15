@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnEmailChannel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpoint.*;
 * CfnEmailChannelProps cfnEmailChannelProps = CfnEmailChannelProps.builder()
 * .applicationId("applicationId")
 * .fromAddress("fromAddress")
 * .identity("identity")
 * // the properties below are optional
 * .configurationSet("configurationSet")
 * .enabled(false)
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html)
 */
public interface CfnEmailChannelProps {
  /**
   * The unique identifier for the Amazon Pinpoint application that you're specifying the email
   * channel for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-applicationid)
   */
  public fun applicationId(): String

  /**
   * The [Amazon SES configuration
   * set](https://docs.aws.amazon.com/ses/latest/APIReference/API_ConfigurationSet.html) that you want
   * to apply to messages that you send through the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-configurationset)
   */
  public fun configurationSet(): String? = unwrap(this).getConfigurationSet()

  /**
   * Specifies whether to enable the email channel for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-enabled)
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * The verified email address that you want to send email from when you send email through the
   * channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-fromaddress)
   */
  public fun fromAddress(): String

  /**
   * The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service
   * (Amazon SES), that you want to use when you send email through the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-identity)
   */
  public fun identity(): String

  /**
   * The ARN of the AWS Identity and Access Management (IAM) role that you want Amazon Pinpoint to
   * use when it submits email-related event data for the channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * A builder for [CfnEmailChannelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that you're
     * specifying the email channel for. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param configurationSet The [Amazon SES configuration
     * set](https://docs.aws.amazon.com/ses/latest/APIReference/API_ConfigurationSet.html) that you
     * want to apply to messages that you send through the channel.
     */
    public fun configurationSet(configurationSet: String)

    /**
     * @param enabled Specifies whether to enable the email channel for the application.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled Specifies whether to enable the email channel for the application.
     */
    public fun enabled(enabled: IResolvable)

    /**
     * @param fromAddress The verified email address that you want to send email from when you send
     * email through the channel. 
     */
    public fun fromAddress(fromAddress: String)

    /**
     * @param identity The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple
     * Email Service (Amazon SES), that you want to use when you send email through the channel. 
     */
    public fun identity(identity: String)

    /**
     * @param roleArn The ARN of the AWS Identity and Access Management (IAM) role that you want
     * Amazon Pinpoint to use when it submits email-related event data for the channel.
     */
    public fun roleArn(roleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps.builder()

    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that you're
     * specifying the email channel for. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param configurationSet The [Amazon SES configuration
     * set](https://docs.aws.amazon.com/ses/latest/APIReference/API_ConfigurationSet.html) that you
     * want to apply to messages that you send through the channel.
     */
    override fun configurationSet(configurationSet: String) {
      cdkBuilder.configurationSet(configurationSet)
    }

    /**
     * @param enabled Specifies whether to enable the email channel for the application.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Specifies whether to enable the email channel for the application.
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    /**
     * @param fromAddress The verified email address that you want to send email from when you send
     * email through the channel. 
     */
    override fun fromAddress(fromAddress: String) {
      cdkBuilder.fromAddress(fromAddress)
    }

    /**
     * @param identity The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple
     * Email Service (Amazon SES), that you want to use when you send email through the channel. 
     */
    override fun identity(identity: String) {
      cdkBuilder.identity(identity)
    }

    /**
     * @param roleArn The ARN of the AWS Identity and Access Management (IAM) role that you want
     * Amazon Pinpoint to use when it submits email-related event data for the channel.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps,
  ) : CdkObject(cdkObject), CfnEmailChannelProps {
    /**
     * The unique identifier for the Amazon Pinpoint application that you're specifying the email
     * channel for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * The [Amazon SES configuration
     * set](https://docs.aws.amazon.com/ses/latest/APIReference/API_ConfigurationSet.html) that you
     * want to apply to messages that you send through the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-configurationset)
     */
    override fun configurationSet(): String? = unwrap(this).getConfigurationSet()

    /**
     * Specifies whether to enable the email channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-enabled)
     */
    override fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The verified email address that you want to send email from when you send email through the
     * channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-fromaddress)
     */
    override fun fromAddress(): String = unwrap(this).getFromAddress()

    /**
     * The Amazon Resource Name (ARN) of the identity, verified with Amazon Simple Email Service
     * (Amazon SES), that you want to use when you send email through the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-identity)
     */
    override fun identity(): String = unwrap(this).getIdentity()

    /**
     * The ARN of the AWS Identity and Access Management (IAM) role that you want Amazon Pinpoint to
     * use when it submits email-related event data for the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-emailchannel.html#cfn-pinpoint-emailchannel-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEmailChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps):
        CfnEmailChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEmailChannelProps):
        software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps
  }
}

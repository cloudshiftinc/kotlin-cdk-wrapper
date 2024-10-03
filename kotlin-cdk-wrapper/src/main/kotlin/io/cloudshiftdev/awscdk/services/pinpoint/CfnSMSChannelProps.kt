@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnSMSChannel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpoint.*;
 * CfnSMSChannelProps cfnSMSChannelProps = CfnSMSChannelProps.builder()
 * .applicationId("applicationId")
 * // the properties below are optional
 * .enabled(false)
 * .senderId("senderId")
 * .shortCode("shortCode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html)
 */
public interface CfnSMSChannelProps {
  /**
   * The unique identifier for the Amazon Pinpoint application that the SMS channel applies to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html#cfn-pinpoint-smschannel-applicationid)
   */
  public fun applicationId(): String

  /**
   * Specifies whether to enable the SMS channel for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html#cfn-pinpoint-smschannel-enabled)
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * The identity that you want to display on recipients' devices when they receive messages from
   * the SMS channel.
   *
   *
   * SenderIDs are only supported in certain countries and regions. For more information, see
   * [Supported Countries and
   * Regions](https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-countries.html) in the
   * *Amazon Pinpoint User Guide* .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html#cfn-pinpoint-smschannel-senderid)
   */
  public fun senderId(): String? = unwrap(this).getSenderId()

  /**
   * The registered short code that you want to use when you send messages through the SMS channel.
   *
   *
   * For information about obtaining a dedicated short code for sending SMS messages, see
   * [Requesting Dedicated Short Codes for SMS Messaging with Amazon
   * Pinpoint](https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-awssupport-short-code.html)
   * in the *Amazon Pinpoint User Guide* .
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html#cfn-pinpoint-smschannel-shortcode)
   */
  public fun shortCode(): String? = unwrap(this).getShortCode()

  /**
   * A builder for [CfnSMSChannelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the SMS
     * channel applies to. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param enabled Specifies whether to enable the SMS channel for the application.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled Specifies whether to enable the SMS channel for the application.
     */
    public fun enabled(enabled: IResolvable)

    /**
     * @param senderId The identity that you want to display on recipients' devices when they
     * receive messages from the SMS channel.
     *
     * SenderIDs are only supported in certain countries and regions. For more information, see
     * [Supported Countries and
     * Regions](https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-countries.html) in
     * the *Amazon Pinpoint User Guide* .
     */
    public fun senderId(senderId: String)

    /**
     * @param shortCode The registered short code that you want to use when you send messages
     * through the SMS channel.
     *
     * For information about obtaining a dedicated short code for sending SMS messages, see
     * [Requesting Dedicated Short Codes for SMS Messaging with Amazon
     * Pinpoint](https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-awssupport-short-code.html)
     * in the *Amazon Pinpoint User Guide* .
     */
    public fun shortCode(shortCode: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps.builder()

    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the SMS
     * channel applies to. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param enabled Specifies whether to enable the SMS channel for the application.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Specifies whether to enable the SMS channel for the application.
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param senderId The identity that you want to display on recipients' devices when they
     * receive messages from the SMS channel.
     *
     * SenderIDs are only supported in certain countries and regions. For more information, see
     * [Supported Countries and
     * Regions](https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-countries.html) in
     * the *Amazon Pinpoint User Guide* .
     */
    override fun senderId(senderId: String) {
      cdkBuilder.senderId(senderId)
    }

    /**
     * @param shortCode The registered short code that you want to use when you send messages
     * through the SMS channel.
     *
     * For information about obtaining a dedicated short code for sending SMS messages, see
     * [Requesting Dedicated Short Codes for SMS Messaging with Amazon
     * Pinpoint](https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-awssupport-short-code.html)
     * in the *Amazon Pinpoint User Guide* .
     */
    override fun shortCode(shortCode: String) {
      cdkBuilder.shortCode(shortCode)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps,
  ) : CdkObject(cdkObject),
      CfnSMSChannelProps {
    /**
     * The unique identifier for the Amazon Pinpoint application that the SMS channel applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html#cfn-pinpoint-smschannel-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * Specifies whether to enable the SMS channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html#cfn-pinpoint-smschannel-enabled)
     */
    override fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The identity that you want to display on recipients' devices when they receive messages from
     * the SMS channel.
     *
     *
     * SenderIDs are only supported in certain countries and regions. For more information, see
     * [Supported Countries and
     * Regions](https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-countries.html) in
     * the *Amazon Pinpoint User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html#cfn-pinpoint-smschannel-senderid)
     */
    override fun senderId(): String? = unwrap(this).getSenderId()

    /**
     * The registered short code that you want to use when you send messages through the SMS
     * channel.
     *
     *
     * For information about obtaining a dedicated short code for sending SMS messages, see
     * [Requesting Dedicated Short Codes for SMS Messaging with Amazon
     * Pinpoint](https://docs.aws.amazon.com/pinpoint/latest/userguide/channels-sms-awssupport-short-code.html)
     * in the *Amazon Pinpoint User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html#cfn-pinpoint-smschannel-shortcode)
     */
    override fun shortCode(): String? = unwrap(this).getShortCode()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSMSChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps):
        CfnSMSChannelProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSMSChannelProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSMSChannelProps):
        software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnSMSChannelProps
  }
}

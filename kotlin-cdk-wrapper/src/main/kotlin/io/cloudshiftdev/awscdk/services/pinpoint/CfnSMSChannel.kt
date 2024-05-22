@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.pinpoint

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A *channel* is a type of platform that you can deliver messages to.
 *
 * To send an SMS text message, you send the message through the SMS channel. Before you can use
 * Amazon Pinpoint to send text messages, you have to enable the SMS channel for an Amazon Pinpoint
 * application.
 *
 * The SMSChannel resource represents the status, sender ID, and other settings for the SMS channel
 * for an application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpoint.*;
 * CfnSMSChannel cfnSMSChannel = CfnSMSChannel.Builder.create(this, "MyCfnSMSChannel")
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
public open class CfnSMSChannel(
  cdkObject: software.amazon.awscdk.services.pinpoint.CfnSMSChannel,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSMSChannelProps,
  ) :
      this(software.amazon.awscdk.services.pinpoint.CfnSMSChannel(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnSMSChannelProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnSMSChannelProps.Builder.() -> Unit,
  ) : this(scope, id, CfnSMSChannelProps(props)
  )

  /**
   * The unique identifier for the Amazon Pinpoint application that the SMS channel applies to.
   */
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * The unique identifier for the Amazon Pinpoint application that the SMS channel applies to.
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   * (Deprecated) An identifier for the SMS channel.
   *
   * This property is retained only for backward compatibility.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Specifies whether to enable the SMS channel for the application.
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * Specifies whether to enable the SMS channel for the application.
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * Specifies whether to enable the SMS channel for the application.
   */
  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable.Companion::unwrap))
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
   * The identity that you want to display on recipients' devices when they receive messages from
   * the SMS channel.
   */
  public open fun senderId(): String? = unwrap(this).getSenderId()

  /**
   * The identity that you want to display on recipients' devices when they receive messages from
   * the SMS channel.
   */
  public open fun senderId(`value`: String) {
    unwrap(this).setSenderId(`value`)
  }

  /**
   * The registered short code that you want to use when you send messages through the SMS channel.
   */
  public open fun shortCode(): String? = unwrap(this).getShortCode()

  /**
   * The registered short code that you want to use when you send messages through the SMS channel.
   */
  public open fun shortCode(`value`: String) {
    unwrap(this).setShortCode(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pinpoint.CfnSMSChannel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique identifier for the Amazon Pinpoint application that the SMS channel applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html#cfn-pinpoint-smschannel-applicationid)
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the SMS
     * channel applies to. 
     */
    public fun applicationId(applicationId: String)

    /**
     * Specifies whether to enable the SMS channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html#cfn-pinpoint-smschannel-enabled)
     * @param enabled Specifies whether to enable the SMS channel for the application. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * Specifies whether to enable the SMS channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html#cfn-pinpoint-smschannel-enabled)
     * @param enabled Specifies whether to enable the SMS channel for the application. 
     */
    public fun enabled(enabled: IResolvable)

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
     * @param senderId The identity that you want to display on recipients' devices when they
     * receive messages from the SMS channel. 
     */
    public fun senderId(senderId: String)

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
     * @param shortCode The registered short code that you want to use when you send messages
     * through the SMS channel. 
     */
    public fun shortCode(shortCode: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnSMSChannel.Builder =
        software.amazon.awscdk.services.pinpoint.CfnSMSChannel.Builder.create(scope, id)

    /**
     * The unique identifier for the Amazon Pinpoint application that the SMS channel applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html#cfn-pinpoint-smschannel-applicationid)
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the SMS
     * channel applies to. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * Specifies whether to enable the SMS channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html#cfn-pinpoint-smschannel-enabled)
     * @param enabled Specifies whether to enable the SMS channel for the application. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * Specifies whether to enable the SMS channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-smschannel.html#cfn-pinpoint-smschannel-enabled)
     * @param enabled Specifies whether to enable the SMS channel for the application. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

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
     * @param senderId The identity that you want to display on recipients' devices when they
     * receive messages from the SMS channel. 
     */
    override fun senderId(senderId: String) {
      cdkBuilder.senderId(senderId)
    }

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
     * @param shortCode The registered short code that you want to use when you send messages
     * through the SMS channel. 
     */
    override fun shortCode(shortCode: String) {
      cdkBuilder.shortCode(shortCode)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnSMSChannel = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pinpoint.CfnSMSChannel.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSMSChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSMSChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnSMSChannel):
        CfnSMSChannel = CfnSMSChannel(cdkObject)

    internal fun unwrap(wrapped: CfnSMSChannel):
        software.amazon.awscdk.services.pinpoint.CfnSMSChannel = wrapped.cdkObject as
        software.amazon.awscdk.services.pinpoint.CfnSMSChannel
  }
}

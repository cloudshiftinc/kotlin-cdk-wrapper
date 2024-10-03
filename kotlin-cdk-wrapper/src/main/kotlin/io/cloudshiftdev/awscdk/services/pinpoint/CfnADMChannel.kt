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
 * You can use the ADM channel to send push notifications through the Amazon Device Messaging (ADM)
 * service to apps that run on Amazon devices, such as Kindle Fire tablets. Before you can use Amazon
 * Pinpoint to send messages to Amazon devices, you have to enable the ADM channel for an Amazon
 * Pinpoint application.
 *
 * The ADMChannel resource represents the status and authentication settings for the ADM channel for
 * an application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpoint.*;
 * CfnADMChannel cfnADMChannel = CfnADMChannel.Builder.create(this, "MyCfnADMChannel")
 * .applicationId("applicationId")
 * .clientId("clientId")
 * .clientSecret("clientSecret")
 * // the properties below are optional
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html)
 */
public open class CfnADMChannel(
  cdkObject: software.amazon.awscdk.services.pinpoint.CfnADMChannel,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnADMChannelProps,
  ) :
      this(software.amazon.awscdk.services.pinpoint.CfnADMChannel(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnADMChannelProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnADMChannelProps.Builder.() -> Unit,
  ) : this(scope, id, CfnADMChannelProps(props)
  )

  /**
   * The unique identifier for the Amazon Pinpoint application that the ADM channel applies to.
   */
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * The unique identifier for the Amazon Pinpoint application that the ADM channel applies to.
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   * (Deprecated) An identifier for the ADM channel.
   *
   * This property is retained only for backward compatibility.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The Client ID that you received from Amazon to send messages by using ADM.
   */
  public open fun clientId(): String = unwrap(this).getClientId()

  /**
   * The Client ID that you received from Amazon to send messages by using ADM.
   */
  public open fun clientId(`value`: String) {
    unwrap(this).setClientId(`value`)
  }

  /**
   * The Client Secret that you received from Amazon to send messages by using ADM.
   */
  public open fun clientSecret(): String = unwrap(this).getClientSecret()

  /**
   * The Client Secret that you received from Amazon to send messages by using ADM.
   */
  public open fun clientSecret(`value`: String) {
    unwrap(this).setClientSecret(`value`)
  }

  /**
   * Specifies whether to enable the ADM channel for the application.
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * Specifies whether to enable the ADM channel for the application.
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * Specifies whether to enable the ADM channel for the application.
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pinpoint.CfnADMChannel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique identifier for the Amazon Pinpoint application that the ADM channel applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-applicationid)
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the ADM
     * channel applies to. 
     */
    public fun applicationId(applicationId: String)

    /**
     * The Client ID that you received from Amazon to send messages by using ADM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-clientid)
     * @param clientId The Client ID that you received from Amazon to send messages by using ADM. 
     */
    public fun clientId(clientId: String)

    /**
     * The Client Secret that you received from Amazon to send messages by using ADM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-clientsecret)
     * @param clientSecret The Client Secret that you received from Amazon to send messages by using
     * ADM. 
     */
    public fun clientSecret(clientSecret: String)

    /**
     * Specifies whether to enable the ADM channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-enabled)
     * @param enabled Specifies whether to enable the ADM channel for the application. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * Specifies whether to enable the ADM channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-enabled)
     * @param enabled Specifies whether to enable the ADM channel for the application. 
     */
    public fun enabled(enabled: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnADMChannel.Builder =
        software.amazon.awscdk.services.pinpoint.CfnADMChannel.Builder.create(scope, id)

    /**
     * The unique identifier for the Amazon Pinpoint application that the ADM channel applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-applicationid)
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the ADM
     * channel applies to. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * The Client ID that you received from Amazon to send messages by using ADM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-clientid)
     * @param clientId The Client ID that you received from Amazon to send messages by using ADM. 
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * The Client Secret that you received from Amazon to send messages by using ADM.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-clientsecret)
     * @param clientSecret The Client Secret that you received from Amazon to send messages by using
     * ADM. 
     */
    override fun clientSecret(clientSecret: String) {
      cdkBuilder.clientSecret(clientSecret)
    }

    /**
     * Specifies whether to enable the ADM channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-enabled)
     * @param enabled Specifies whether to enable the ADM channel for the application. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * Specifies whether to enable the ADM channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-admchannel.html#cfn-pinpoint-admchannel-enabled)
     * @param enabled Specifies whether to enable the ADM channel for the application. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnADMChannel = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pinpoint.CfnADMChannel.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnADMChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnADMChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnADMChannel):
        CfnADMChannel = CfnADMChannel(cdkObject)

    internal fun unwrap(wrapped: CfnADMChannel):
        software.amazon.awscdk.services.pinpoint.CfnADMChannel = wrapped.cdkObject as
        software.amazon.awscdk.services.pinpoint.CfnADMChannel
  }
}

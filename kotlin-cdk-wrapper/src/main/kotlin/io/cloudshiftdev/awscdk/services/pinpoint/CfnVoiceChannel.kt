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
 * To send a voice message, you send the message through the voice channel. Before you can use
 * Amazon Pinpoint to send voice messages, you have to enable the voice channel for an Amazon Pinpoint
 * application.
 *
 * The VoiceChannel resource represents the status and other information about the voice channel for
 * an application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpoint.*;
 * CfnVoiceChannel cfnVoiceChannel = CfnVoiceChannel.Builder.create(this, "MyCfnVoiceChannel")
 * .applicationId("applicationId")
 * // the properties below are optional
 * .enabled(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-voicechannel.html)
 */
public open class CfnVoiceChannel(
  cdkObject: software.amazon.awscdk.services.pinpoint.CfnVoiceChannel,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVoiceChannelProps,
  ) :
      this(software.amazon.awscdk.services.pinpoint.CfnVoiceChannel(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnVoiceChannelProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnVoiceChannelProps.Builder.() -> Unit,
  ) : this(scope, id, CfnVoiceChannelProps(props)
  )

  /**
   * The unique identifier for the Amazon Pinpoint application that the voice channel applies to.
   */
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * The unique identifier for the Amazon Pinpoint application that the voice channel applies to.
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   * (Deprecated) An identifier for the voice channel.
   *
   * This property is retained only for backward compatibility.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Specifies whether to enable the voice channel for the application.
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * Specifies whether to enable the voice channel for the application.
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * Specifies whether to enable the voice channel for the application.
   */
  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pinpoint.CfnVoiceChannel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique identifier for the Amazon Pinpoint application that the voice channel applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-voicechannel.html#cfn-pinpoint-voicechannel-applicationid)
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the voice
     * channel applies to. 
     */
    public fun applicationId(applicationId: String)

    /**
     * Specifies whether to enable the voice channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-voicechannel.html#cfn-pinpoint-voicechannel-enabled)
     * @param enabled Specifies whether to enable the voice channel for the application. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * Specifies whether to enable the voice channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-voicechannel.html#cfn-pinpoint-voicechannel-enabled)
     * @param enabled Specifies whether to enable the voice channel for the application. 
     */
    public fun enabled(enabled: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnVoiceChannel.Builder =
        software.amazon.awscdk.services.pinpoint.CfnVoiceChannel.Builder.create(scope, id)

    /**
     * The unique identifier for the Amazon Pinpoint application that the voice channel applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-voicechannel.html#cfn-pinpoint-voicechannel-applicationid)
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the voice
     * channel applies to. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * Specifies whether to enable the voice channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-voicechannel.html#cfn-pinpoint-voicechannel-enabled)
     * @param enabled Specifies whether to enable the voice channel for the application. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * Specifies whether to enable the voice channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-voicechannel.html#cfn-pinpoint-voicechannel-enabled)
     * @param enabled Specifies whether to enable the voice channel for the application. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnVoiceChannel =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pinpoint.CfnVoiceChannel.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVoiceChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVoiceChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnVoiceChannel):
        CfnVoiceChannel = CfnVoiceChannel(cdkObject)

    internal fun unwrap(wrapped: CfnVoiceChannel):
        software.amazon.awscdk.services.pinpoint.CfnVoiceChannel = wrapped.cdkObject as
        software.amazon.awscdk.services.pinpoint.CfnVoiceChannel
  }
}

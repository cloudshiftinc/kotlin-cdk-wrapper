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
 * You can use the GCM channel to send push notification messages to the Firebase Cloud Messaging
 * (FCM) service, which replaced the Google Cloud Messaging (GCM) service. Before you use Amazon
 * Pinpoint to send notifications to FCM, you have to enable the GCM channel for an Amazon Pinpoint
 * application.
 *
 * The GCMChannel resource represents the status and authentication settings of the GCM channel for
 * an application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpoint.*;
 * CfnGCMChannel cfnGCMChannel = CfnGCMChannel.Builder.create(this, "MyCfnGCMChannel")
 * .applicationId("applicationId")
 * // the properties below are optional
 * .apiKey("apiKey")
 * .defaultAuthenticationMethod("defaultAuthenticationMethod")
 * .enabled(false)
 * .serviceJson("serviceJson")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html)
 */
public open class CfnGCMChannel(
  cdkObject: software.amazon.awscdk.services.pinpoint.CfnGCMChannel,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGCMChannelProps,
  ) :
      this(software.amazon.awscdk.services.pinpoint.CfnGCMChannel(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnGCMChannelProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGCMChannelProps.Builder.() -> Unit,
  ) : this(scope, id, CfnGCMChannelProps(props)
  )

  /**
   * The Web API key, also called the *server key* , that you received from Google to communicate
   * with Google services.
   */
  public open fun apiKey(): String? = unwrap(this).getApiKey()

  /**
   * The Web API key, also called the *server key* , that you received from Google to communicate
   * with Google services.
   */
  public open fun apiKey(`value`: String) {
    unwrap(this).setApiKey(`value`)
  }

  /**
   * The unique identifier for the Amazon Pinpoint application that the GCM channel applies to.
   */
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * The unique identifier for the Amazon Pinpoint application that the GCM channel applies to.
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   * (Deprecated) An identifier for the GCM channel.
   *
   * This property is retained only for backward compatibility.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The default authentication method used for GCM.
   */
  public open fun defaultAuthenticationMethod(): String? =
      unwrap(this).getDefaultAuthenticationMethod()

  /**
   * The default authentication method used for GCM.
   */
  public open fun defaultAuthenticationMethod(`value`: String) {
    unwrap(this).setDefaultAuthenticationMethod(`value`)
  }

  /**
   * Specifies whether to enable the GCM channel for the Amazon Pinpoint application.
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * Specifies whether to enable the GCM channel for the Amazon Pinpoint application.
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * Specifies whether to enable the GCM channel for the Amazon Pinpoint application.
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
   * The contents of the JSON file provided by Google during registration in order to generate an
   * access token for authentication.
   */
  public open fun serviceJson(): String? = unwrap(this).getServiceJson()

  /**
   * The contents of the JSON file provided by Google during registration in order to generate an
   * access token for authentication.
   */
  public open fun serviceJson(`value`: String) {
    unwrap(this).setServiceJson(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pinpoint.CfnGCMChannel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Web API key, also called the *server key* , that you received from Google to communicate
     * with Google services.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-apikey)
     * @param apiKey The Web API key, also called the *server key* , that you received from Google
     * to communicate with Google services. 
     */
    public fun apiKey(apiKey: String)

    /**
     * The unique identifier for the Amazon Pinpoint application that the GCM channel applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-applicationid)
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the GCM
     * channel applies to. 
     */
    public fun applicationId(applicationId: String)

    /**
     * The default authentication method used for GCM.
     *
     * Values are either "TOKEN" or "KEY". Defaults to "KEY".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-defaultauthenticationmethod)
     * @param defaultAuthenticationMethod The default authentication method used for GCM. 
     */
    public fun defaultAuthenticationMethod(defaultAuthenticationMethod: String)

    /**
     * Specifies whether to enable the GCM channel for the Amazon Pinpoint application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-enabled)
     * @param enabled Specifies whether to enable the GCM channel for the Amazon Pinpoint
     * application. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * Specifies whether to enable the GCM channel for the Amazon Pinpoint application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-enabled)
     * @param enabled Specifies whether to enable the GCM channel for the Amazon Pinpoint
     * application. 
     */
    public fun enabled(enabled: IResolvable)

    /**
     * The contents of the JSON file provided by Google during registration in order to generate an
     * access token for authentication.
     *
     * For more information see [Migrate from legacy FCM APIs to HTTP
     * v1](https://docs.aws.amazon.com/https://firebase.google.com/docs/cloud-messaging/migrate-v1) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-servicejson)
     * @param serviceJson The contents of the JSON file provided by Google during registration in
     * order to generate an access token for authentication. 
     */
    public fun serviceJson(serviceJson: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnGCMChannel.Builder =
        software.amazon.awscdk.services.pinpoint.CfnGCMChannel.Builder.create(scope, id)

    /**
     * The Web API key, also called the *server key* , that you received from Google to communicate
     * with Google services.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-apikey)
     * @param apiKey The Web API key, also called the *server key* , that you received from Google
     * to communicate with Google services. 
     */
    override fun apiKey(apiKey: String) {
      cdkBuilder.apiKey(apiKey)
    }

    /**
     * The unique identifier for the Amazon Pinpoint application that the GCM channel applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-applicationid)
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the GCM
     * channel applies to. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * The default authentication method used for GCM.
     *
     * Values are either "TOKEN" or "KEY". Defaults to "KEY".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-defaultauthenticationmethod)
     * @param defaultAuthenticationMethod The default authentication method used for GCM. 
     */
    override fun defaultAuthenticationMethod(defaultAuthenticationMethod: String) {
      cdkBuilder.defaultAuthenticationMethod(defaultAuthenticationMethod)
    }

    /**
     * Specifies whether to enable the GCM channel for the Amazon Pinpoint application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-enabled)
     * @param enabled Specifies whether to enable the GCM channel for the Amazon Pinpoint
     * application. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * Specifies whether to enable the GCM channel for the Amazon Pinpoint application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-enabled)
     * @param enabled Specifies whether to enable the GCM channel for the Amazon Pinpoint
     * application. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * The contents of the JSON file provided by Google during registration in order to generate an
     * access token for authentication.
     *
     * For more information see [Migrate from legacy FCM APIs to HTTP
     * v1](https://docs.aws.amazon.com/https://firebase.google.com/docs/cloud-messaging/migrate-v1) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-servicejson)
     * @param serviceJson The contents of the JSON file provided by Google during registration in
     * order to generate an access token for authentication. 
     */
    override fun serviceJson(serviceJson: String) {
      cdkBuilder.serviceJson(serviceJson)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnGCMChannel = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pinpoint.CfnGCMChannel.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGCMChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGCMChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnGCMChannel):
        CfnGCMChannel = CfnGCMChannel(cdkObject)

    internal fun unwrap(wrapped: CfnGCMChannel):
        software.amazon.awscdk.services.pinpoint.CfnGCMChannel = wrapped.cdkObject as
        software.amazon.awscdk.services.pinpoint.CfnGCMChannel
  }
}

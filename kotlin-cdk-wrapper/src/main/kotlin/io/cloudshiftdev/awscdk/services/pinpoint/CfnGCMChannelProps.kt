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
 * Properties for defining a `CfnGCMChannel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpoint.*;
 * CfnGCMChannelProps cfnGCMChannelProps = CfnGCMChannelProps.builder()
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
public interface CfnGCMChannelProps {
  /**
   * The Web API key, also called the *server key* , that you received from Google to communicate
   * with Google services.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-apikey)
   */
  public fun apiKey(): String? = unwrap(this).getApiKey()

  /**
   * The unique identifier for the Amazon Pinpoint application that the GCM channel applies to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-applicationid)
   */
  public fun applicationId(): String

  /**
   * The default authentication method used for GCM.
   *
   * Values are either "TOKEN" or "KEY". Defaults to "KEY".
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-defaultauthenticationmethod)
   */
  public fun defaultAuthenticationMethod(): String? = unwrap(this).getDefaultAuthenticationMethod()

  /**
   * Specifies whether to enable the GCM channel for the Amazon Pinpoint application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-enabled)
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * The contents of the JSON file provided by Google during registration in order to generate an
   * access token for authentication.
   *
   * For more information see [Migrate from legacy FCM APIs to HTTP
   * v1](https://docs.aws.amazon.com/https://firebase.google.com/docs/cloud-messaging/migrate-v1) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-servicejson)
   */
  public fun serviceJson(): String? = unwrap(this).getServiceJson()

  /**
   * A builder for [CfnGCMChannelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiKey The Web API key, also called the *server key* , that you received from Google
     * to communicate with Google services.
     */
    public fun apiKey(apiKey: String)

    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the GCM
     * channel applies to. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param defaultAuthenticationMethod The default authentication method used for GCM.
     * Values are either "TOKEN" or "KEY". Defaults to "KEY".
     */
    public fun defaultAuthenticationMethod(defaultAuthenticationMethod: String)

    /**
     * @param enabled Specifies whether to enable the GCM channel for the Amazon Pinpoint
     * application.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled Specifies whether to enable the GCM channel for the Amazon Pinpoint
     * application.
     */
    public fun enabled(enabled: IResolvable)

    /**
     * @param serviceJson The contents of the JSON file provided by Google during registration in
     * order to generate an access token for authentication.
     * For more information see [Migrate from legacy FCM APIs to HTTP
     * v1](https://docs.aws.amazon.com/https://firebase.google.com/docs/cloud-messaging/migrate-v1) .
     */
    public fun serviceJson(serviceJson: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnGCMChannelProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnGCMChannelProps.builder()

    /**
     * @param apiKey The Web API key, also called the *server key* , that you received from Google
     * to communicate with Google services.
     */
    override fun apiKey(apiKey: String) {
      cdkBuilder.apiKey(apiKey)
    }

    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the GCM
     * channel applies to. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param defaultAuthenticationMethod The default authentication method used for GCM.
     * Values are either "TOKEN" or "KEY". Defaults to "KEY".
     */
    override fun defaultAuthenticationMethod(defaultAuthenticationMethod: String) {
      cdkBuilder.defaultAuthenticationMethod(defaultAuthenticationMethod)
    }

    /**
     * @param enabled Specifies whether to enable the GCM channel for the Amazon Pinpoint
     * application.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Specifies whether to enable the GCM channel for the Amazon Pinpoint
     * application.
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    /**
     * @param serviceJson The contents of the JSON file provided by Google during registration in
     * order to generate an access token for authentication.
     * For more information see [Migrate from legacy FCM APIs to HTTP
     * v1](https://docs.aws.amazon.com/https://firebase.google.com/docs/cloud-messaging/migrate-v1) .
     */
    override fun serviceJson(serviceJson: String) {
      cdkBuilder.serviceJson(serviceJson)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnGCMChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.pinpoint.CfnGCMChannelProps,
  ) : CdkObject(cdkObject), CfnGCMChannelProps {
    /**
     * The Web API key, also called the *server key* , that you received from Google to communicate
     * with Google services.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-apikey)
     */
    override fun apiKey(): String? = unwrap(this).getApiKey()

    /**
     * The unique identifier for the Amazon Pinpoint application that the GCM channel applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * The default authentication method used for GCM.
     *
     * Values are either "TOKEN" or "KEY". Defaults to "KEY".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-defaultauthenticationmethod)
     */
    override fun defaultAuthenticationMethod(): String? =
        unwrap(this).getDefaultAuthenticationMethod()

    /**
     * Specifies whether to enable the GCM channel for the Amazon Pinpoint application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-enabled)
     */
    override fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The contents of the JSON file provided by Google during registration in order to generate an
     * access token for authentication.
     *
     * For more information see [Migrate from legacy FCM APIs to HTTP
     * v1](https://docs.aws.amazon.com/https://firebase.google.com/docs/cloud-messaging/migrate-v1) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-gcmchannel.html#cfn-pinpoint-gcmchannel-servicejson)
     */
    override fun serviceJson(): String? = unwrap(this).getServiceJson()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGCMChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnGCMChannelProps):
        CfnGCMChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGCMChannelProps):
        software.amazon.awscdk.services.pinpoint.CfnGCMChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnGCMChannelProps
  }
}

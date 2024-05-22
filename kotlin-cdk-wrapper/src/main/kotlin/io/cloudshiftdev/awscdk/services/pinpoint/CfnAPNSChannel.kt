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
 * You can use the APNs channel to send push notification messages to the Apple Push Notification
 * service (APNs). Before you can use Amazon Pinpoint to send notifications to APNs, you have to enable
 * the APNs channel for an Amazon Pinpoint application.
 *
 * The APNSChannel resource represents the status and authentication settings for the APNs channel
 * for an application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpoint.*;
 * CfnAPNSChannel cfnAPNSChannel = CfnAPNSChannel.Builder.create(this, "MyCfnAPNSChannel")
 * .applicationId("applicationId")
 * // the properties below are optional
 * .bundleId("bundleId")
 * .certificate("certificate")
 * .defaultAuthenticationMethod("defaultAuthenticationMethod")
 * .enabled(false)
 * .privateKey("privateKey")
 * .teamId("teamId")
 * .tokenKey("tokenKey")
 * .tokenKeyId("tokenKeyId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html)
 */
public open class CfnAPNSChannel(
  cdkObject: software.amazon.awscdk.services.pinpoint.CfnAPNSChannel,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAPNSChannelProps,
  ) :
      this(software.amazon.awscdk.services.pinpoint.CfnAPNSChannel(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAPNSChannelProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAPNSChannelProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAPNSChannelProps(props)
  )

  /**
   * The unique identifier for the Amazon Pinpoint application that the APNs channel applies to.
   */
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * The unique identifier for the Amazon Pinpoint application that the APNs channel applies to.
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   * (Deprecated) An identifier for the APNs channel.
   *
   * This property is retained only for backward compatibility.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The bundle identifier that's assigned to your iOS app.
   */
  public open fun bundleId(): String? = unwrap(this).getBundleId()

  /**
   * The bundle identifier that's assigned to your iOS app.
   */
  public open fun bundleId(`value`: String) {
    unwrap(this).setBundleId(`value`)
  }

  /**
   * The APNs client certificate that you received from Apple.
   */
  public open fun certificate(): String? = unwrap(this).getCertificate()

  /**
   * The APNs client certificate that you received from Apple.
   */
  public open fun certificate(`value`: String) {
    unwrap(this).setCertificate(`value`)
  }

  /**
   * The default authentication method that you want Amazon Pinpoint to use when authenticating with
   * APNs.
   */
  public open fun defaultAuthenticationMethod(): String? =
      unwrap(this).getDefaultAuthenticationMethod()

  /**
   * The default authentication method that you want Amazon Pinpoint to use when authenticating with
   * APNs.
   */
  public open fun defaultAuthenticationMethod(`value`: String) {
    unwrap(this).setDefaultAuthenticationMethod(`value`)
  }

  /**
   * Specifies whether to enable the APNs channel for the application.
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * Specifies whether to enable the APNs channel for the application.
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * Specifies whether to enable the APNs channel for the application.
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
   * The private key for the APNs client certificate that you want Amazon Pinpoint to use to
   * communicate with APNs.
   */
  public open fun privateKey(): String? = unwrap(this).getPrivateKey()

  /**
   * The private key for the APNs client certificate that you want Amazon Pinpoint to use to
   * communicate with APNs.
   */
  public open fun privateKey(`value`: String) {
    unwrap(this).setPrivateKey(`value`)
  }

  /**
   * The identifier that's assigned to your Apple Developer Account team.
   */
  public open fun teamId(): String? = unwrap(this).getTeamId()

  /**
   * The identifier that's assigned to your Apple Developer Account team.
   */
  public open fun teamId(`value`: String) {
    unwrap(this).setTeamId(`value`)
  }

  /**
   * The authentication key to use for APNs tokens.
   */
  public open fun tokenKey(): String? = unwrap(this).getTokenKey()

  /**
   * The authentication key to use for APNs tokens.
   */
  public open fun tokenKey(`value`: String) {
    unwrap(this).setTokenKey(`value`)
  }

  /**
   * The key identifier that's assigned to your APNs signing key.
   */
  public open fun tokenKeyId(): String? = unwrap(this).getTokenKeyId()

  /**
   * The key identifier that's assigned to your APNs signing key.
   */
  public open fun tokenKeyId(`value`: String) {
    unwrap(this).setTokenKeyId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.pinpoint.CfnAPNSChannel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The unique identifier for the Amazon Pinpoint application that the APNs channel applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-applicationid)
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the APNs
     * channel applies to. 
     */
    public fun applicationId(applicationId: String)

    /**
     * The bundle identifier that's assigned to your iOS app.
     *
     * This identifier is used for APNs tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-bundleid)
     * @param bundleId The bundle identifier that's assigned to your iOS app. 
     */
    public fun bundleId(bundleId: String)

    /**
     * The APNs client certificate that you received from Apple.
     *
     * Specify this value if you want Amazon Pinpoint to communicate with APNs by using an APNs
     * certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-certificate)
     * @param certificate The APNs client certificate that you received from Apple. 
     */
    public fun certificate(certificate: String)

    /**
     * The default authentication method that you want Amazon Pinpoint to use when authenticating
     * with APNs.
     *
     * Valid options are `key` or `certificate` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-defaultauthenticationmethod)
     * @param defaultAuthenticationMethod The default authentication method that you want Amazon
     * Pinpoint to use when authenticating with APNs. 
     */
    public fun defaultAuthenticationMethod(defaultAuthenticationMethod: String)

    /**
     * Specifies whether to enable the APNs channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-enabled)
     * @param enabled Specifies whether to enable the APNs channel for the application. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * Specifies whether to enable the APNs channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-enabled)
     * @param enabled Specifies whether to enable the APNs channel for the application. 
     */
    public fun enabled(enabled: IResolvable)

    /**
     * The private key for the APNs client certificate that you want Amazon Pinpoint to use to
     * communicate with APNs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-privatekey)
     * @param privateKey The private key for the APNs client certificate that you want Amazon
     * Pinpoint to use to communicate with APNs. 
     */
    public fun privateKey(privateKey: String)

    /**
     * The identifier that's assigned to your Apple Developer Account team.
     *
     * This identifier is used for APNs tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-teamid)
     * @param teamId The identifier that's assigned to your Apple Developer Account team. 
     */
    public fun teamId(teamId: String)

    /**
     * The authentication key to use for APNs tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-tokenkey)
     * @param tokenKey The authentication key to use for APNs tokens. 
     */
    public fun tokenKey(tokenKey: String)

    /**
     * The key identifier that's assigned to your APNs signing key.
     *
     * Specify this value if you want Amazon Pinpoint to communicate with APNs by using APNs tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-tokenkeyid)
     * @param tokenKeyId The key identifier that's assigned to your APNs signing key. 
     */
    public fun tokenKeyId(tokenKeyId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.pinpoint.CfnAPNSChannel.Builder =
        software.amazon.awscdk.services.pinpoint.CfnAPNSChannel.Builder.create(scope, id)

    /**
     * The unique identifier for the Amazon Pinpoint application that the APNs channel applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-applicationid)
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the APNs
     * channel applies to. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * The bundle identifier that's assigned to your iOS app.
     *
     * This identifier is used for APNs tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-bundleid)
     * @param bundleId The bundle identifier that's assigned to your iOS app. 
     */
    override fun bundleId(bundleId: String) {
      cdkBuilder.bundleId(bundleId)
    }

    /**
     * The APNs client certificate that you received from Apple.
     *
     * Specify this value if you want Amazon Pinpoint to communicate with APNs by using an APNs
     * certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-certificate)
     * @param certificate The APNs client certificate that you received from Apple. 
     */
    override fun certificate(certificate: String) {
      cdkBuilder.certificate(certificate)
    }

    /**
     * The default authentication method that you want Amazon Pinpoint to use when authenticating
     * with APNs.
     *
     * Valid options are `key` or `certificate` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-defaultauthenticationmethod)
     * @param defaultAuthenticationMethod The default authentication method that you want Amazon
     * Pinpoint to use when authenticating with APNs. 
     */
    override fun defaultAuthenticationMethod(defaultAuthenticationMethod: String) {
      cdkBuilder.defaultAuthenticationMethod(defaultAuthenticationMethod)
    }

    /**
     * Specifies whether to enable the APNs channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-enabled)
     * @param enabled Specifies whether to enable the APNs channel for the application. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * Specifies whether to enable the APNs channel for the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-enabled)
     * @param enabled Specifies whether to enable the APNs channel for the application. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * The private key for the APNs client certificate that you want Amazon Pinpoint to use to
     * communicate with APNs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-privatekey)
     * @param privateKey The private key for the APNs client certificate that you want Amazon
     * Pinpoint to use to communicate with APNs. 
     */
    override fun privateKey(privateKey: String) {
      cdkBuilder.privateKey(privateKey)
    }

    /**
     * The identifier that's assigned to your Apple Developer Account team.
     *
     * This identifier is used for APNs tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-teamid)
     * @param teamId The identifier that's assigned to your Apple Developer Account team. 
     */
    override fun teamId(teamId: String) {
      cdkBuilder.teamId(teamId)
    }

    /**
     * The authentication key to use for APNs tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-tokenkey)
     * @param tokenKey The authentication key to use for APNs tokens. 
     */
    override fun tokenKey(tokenKey: String) {
      cdkBuilder.tokenKey(tokenKey)
    }

    /**
     * The key identifier that's assigned to your APNs signing key.
     *
     * Specify this value if you want Amazon Pinpoint to communicate with APNs by using APNs tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-tokenkeyid)
     * @param tokenKeyId The key identifier that's assigned to your APNs signing key. 
     */
    override fun tokenKeyId(tokenKeyId: String) {
      cdkBuilder.tokenKeyId(tokenKeyId)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnAPNSChannel = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.pinpoint.CfnAPNSChannel.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAPNSChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAPNSChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnAPNSChannel):
        CfnAPNSChannel = CfnAPNSChannel(cdkObject)

    internal fun unwrap(wrapped: CfnAPNSChannel):
        software.amazon.awscdk.services.pinpoint.CfnAPNSChannel = wrapped.cdkObject as
        software.amazon.awscdk.services.pinpoint.CfnAPNSChannel
  }
}

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
 * Properties for defining a `CfnAPNSSandboxChannel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.pinpoint.*;
 * CfnAPNSSandboxChannelProps cfnAPNSSandboxChannelProps = CfnAPNSSandboxChannelProps.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html)
 */
public interface CfnAPNSSandboxChannelProps {
  /**
   * The unique identifier for the Amazon Pinpoint application that the APNs sandbox channel applies
   * to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-applicationid)
   */
  public fun applicationId(): String

  /**
   * The bundle identifier that's assigned to your iOS app.
   *
   * This identifier is used for APNs tokens.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-bundleid)
   */
  public fun bundleId(): String? = unwrap(this).getBundleId()

  /**
   * The APNs client certificate that you received from Apple.
   *
   * Specify this value if you want Amazon Pinpoint to communicate with APNs by using an APNs
   * certificate.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-certificate)
   */
  public fun certificate(): String? = unwrap(this).getCertificate()

  /**
   * The default authentication method that you want Amazon Pinpoint to use when authenticating with
   * APNs.
   *
   * Valid options are `key` or `certificate` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-defaultauthenticationmethod)
   */
  public fun defaultAuthenticationMethod(): String? = unwrap(this).getDefaultAuthenticationMethod()

  /**
   * Specifies whether to enable the APNs Sandbox channel for the Amazon Pinpoint application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-enabled)
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * The private key for the APNs client certificate that you want Amazon Pinpoint to use to
   * communicate with APNs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-privatekey)
   */
  public fun privateKey(): String? = unwrap(this).getPrivateKey()

  /**
   * The identifier that's assigned to your Apple Developer Account team.
   *
   * This identifier is used for APNs tokens.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-teamid)
   */
  public fun teamId(): String? = unwrap(this).getTeamId()

  /**
   * The authentication key to use for APNs tokens.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-tokenkey)
   */
  public fun tokenKey(): String? = unwrap(this).getTokenKey()

  /**
   * The key identifier that's assigned to your APNs signing key.
   *
   * Specify this value if you want Amazon Pinpoint to communicate with APNs by using APNs tokens.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-tokenkeyid)
   */
  public fun tokenKeyId(): String? = unwrap(this).getTokenKeyId()

  /**
   * A builder for [CfnAPNSSandboxChannelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the APNs
     * sandbox channel applies to. 
     */
    public fun applicationId(applicationId: String)

    /**
     * @param bundleId The bundle identifier that's assigned to your iOS app.
     * This identifier is used for APNs tokens.
     */
    public fun bundleId(bundleId: String)

    /**
     * @param certificate The APNs client certificate that you received from Apple.
     * Specify this value if you want Amazon Pinpoint to communicate with APNs by using an APNs
     * certificate.
     */
    public fun certificate(certificate: String)

    /**
     * @param defaultAuthenticationMethod The default authentication method that you want Amazon
     * Pinpoint to use when authenticating with APNs.
     * Valid options are `key` or `certificate` .
     */
    public fun defaultAuthenticationMethod(defaultAuthenticationMethod: String)

    /**
     * @param enabled Specifies whether to enable the APNs Sandbox channel for the Amazon Pinpoint
     * application.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled Specifies whether to enable the APNs Sandbox channel for the Amazon Pinpoint
     * application.
     */
    public fun enabled(enabled: IResolvable)

    /**
     * @param privateKey The private key for the APNs client certificate that you want Amazon
     * Pinpoint to use to communicate with APNs.
     */
    public fun privateKey(privateKey: String)

    /**
     * @param teamId The identifier that's assigned to your Apple Developer Account team.
     * This identifier is used for APNs tokens.
     */
    public fun teamId(teamId: String)

    /**
     * @param tokenKey The authentication key to use for APNs tokens.
     */
    public fun tokenKey(tokenKey: String)

    /**
     * @param tokenKeyId The key identifier that's assigned to your APNs signing key.
     * Specify this value if you want Amazon Pinpoint to communicate with APNs by using APNs tokens.
     */
    public fun tokenKeyId(tokenKeyId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannelProps.Builder =
        software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannelProps.builder()

    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the APNs
     * sandbox channel applies to. 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param bundleId The bundle identifier that's assigned to your iOS app.
     * This identifier is used for APNs tokens.
     */
    override fun bundleId(bundleId: String) {
      cdkBuilder.bundleId(bundleId)
    }

    /**
     * @param certificate The APNs client certificate that you received from Apple.
     * Specify this value if you want Amazon Pinpoint to communicate with APNs by using an APNs
     * certificate.
     */
    override fun certificate(certificate: String) {
      cdkBuilder.certificate(certificate)
    }

    /**
     * @param defaultAuthenticationMethod The default authentication method that you want Amazon
     * Pinpoint to use when authenticating with APNs.
     * Valid options are `key` or `certificate` .
     */
    override fun defaultAuthenticationMethod(defaultAuthenticationMethod: String) {
      cdkBuilder.defaultAuthenticationMethod(defaultAuthenticationMethod)
    }

    /**
     * @param enabled Specifies whether to enable the APNs Sandbox channel for the Amazon Pinpoint
     * application.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Specifies whether to enable the APNs Sandbox channel for the Amazon Pinpoint
     * application.
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param privateKey The private key for the APNs client certificate that you want Amazon
     * Pinpoint to use to communicate with APNs.
     */
    override fun privateKey(privateKey: String) {
      cdkBuilder.privateKey(privateKey)
    }

    /**
     * @param teamId The identifier that's assigned to your Apple Developer Account team.
     * This identifier is used for APNs tokens.
     */
    override fun teamId(teamId: String) {
      cdkBuilder.teamId(teamId)
    }

    /**
     * @param tokenKey The authentication key to use for APNs tokens.
     */
    override fun tokenKey(tokenKey: String) {
      cdkBuilder.tokenKey(tokenKey)
    }

    /**
     * @param tokenKeyId The key identifier that's assigned to your APNs signing key.
     * Specify this value if you want Amazon Pinpoint to communicate with APNs by using APNs tokens.
     */
    override fun tokenKeyId(tokenKeyId: String) {
      cdkBuilder.tokenKeyId(tokenKeyId)
    }

    public fun build(): software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannelProps,
  ) : CdkObject(cdkObject),
      CfnAPNSSandboxChannelProps {
    /**
     * The unique identifier for the Amazon Pinpoint application that the APNs sandbox channel
     * applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-applicationid)
     */
    override fun applicationId(): String = unwrap(this).getApplicationId()

    /**
     * The bundle identifier that's assigned to your iOS app.
     *
     * This identifier is used for APNs tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-bundleid)
     */
    override fun bundleId(): String? = unwrap(this).getBundleId()

    /**
     * The APNs client certificate that you received from Apple.
     *
     * Specify this value if you want Amazon Pinpoint to communicate with APNs by using an APNs
     * certificate.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-certificate)
     */
    override fun certificate(): String? = unwrap(this).getCertificate()

    /**
     * The default authentication method that you want Amazon Pinpoint to use when authenticating
     * with APNs.
     *
     * Valid options are `key` or `certificate` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-defaultauthenticationmethod)
     */
    override fun defaultAuthenticationMethod(): String? =
        unwrap(this).getDefaultAuthenticationMethod()

    /**
     * Specifies whether to enable the APNs Sandbox channel for the Amazon Pinpoint application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-enabled)
     */
    override fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The private key for the APNs client certificate that you want Amazon Pinpoint to use to
     * communicate with APNs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-privatekey)
     */
    override fun privateKey(): String? = unwrap(this).getPrivateKey()

    /**
     * The identifier that's assigned to your Apple Developer Account team.
     *
     * This identifier is used for APNs tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-teamid)
     */
    override fun teamId(): String? = unwrap(this).getTeamId()

    /**
     * The authentication key to use for APNs tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-tokenkey)
     */
    override fun tokenKey(): String? = unwrap(this).getTokenKey()

    /**
     * The key identifier that's assigned to your APNs signing key.
     *
     * Specify this value if you want Amazon Pinpoint to communicate with APNs by using APNs tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-tokenkeyid)
     */
    override fun tokenKeyId(): String? = unwrap(this).getTokenKeyId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAPNSSandboxChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannelProps):
        CfnAPNSSandboxChannelProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnAPNSSandboxChannelProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAPNSSandboxChannelProps):
        software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannelProps
  }
}

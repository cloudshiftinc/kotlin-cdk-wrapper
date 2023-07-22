@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnAPNSChannel
import software.constructs.Construct

@CdkDslMarker
public class CfnAPNSChannelDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAPNSChannel.Builder = CfnAPNSChannel.Builder.create(scope, id)

  /**
   * The unique identifier for the Amazon Pinpoint application that the APNs channel applies to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-applicationid)
   * @param applicationId The unique identifier for the Amazon Pinpoint application that the APNs
   * channel applies to. 
   */
  public fun applicationId(applicationId: String) {
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
  public fun bundleId(bundleId: String) {
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
  public fun certificate(certificate: String) {
    cdkBuilder.certificate(certificate)
  }

  /**
   * The default authentication method that you want Amazon Pinpoint to use when authenticating with
   * APNs.
   *
   * Valid options are `key` or `certificate` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-defaultauthenticationmethod)
   * @param defaultAuthenticationMethod The default authentication method that you want Amazon
   * Pinpoint to use when authenticating with APNs. 
   */
  public fun defaultAuthenticationMethod(defaultAuthenticationMethod: String) {
    cdkBuilder.defaultAuthenticationMethod(defaultAuthenticationMethod)
  }

  /**
   * Specifies whether to enable the APNs channel for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-enabled)
   * @param enabled Specifies whether to enable the APNs channel for the application. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * Specifies whether to enable the APNs channel for the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-enabled)
   * @param enabled Specifies whether to enable the APNs channel for the application. 
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * The private key for the APNs client certificate that you want Amazon Pinpoint to use to
   * communicate with APNs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-privatekey)
   * @param privateKey The private key for the APNs client certificate that you want Amazon Pinpoint
   * to use to communicate with APNs. 
   */
  public fun privateKey(privateKey: String) {
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
  public fun teamId(teamId: String) {
    cdkBuilder.teamId(teamId)
  }

  /**
   * The authentication key to use for APNs tokens.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-tokenkey)
   * @param tokenKey The authentication key to use for APNs tokens. 
   */
  public fun tokenKey(tokenKey: String) {
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
  public fun tokenKeyId(tokenKeyId: String) {
    cdkBuilder.tokenKeyId(tokenKeyId)
  }

  public fun build(): CfnAPNSChannel = cdkBuilder.build()
}

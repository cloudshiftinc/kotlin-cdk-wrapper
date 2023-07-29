@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnAPNSVoipChannel
import software.constructs.Construct

/**
 * A *channel* is a type of platform that you can deliver messages to.
 *
 * You can use the APNs VoIP channel to send VoIP notification messages to the Apple Push
 * Notification service (APNs). Before you can use Amazon Pinpoint to send VoIP notifications to
 * APNs, you have to enable the APNs VoIP channel for an Amazon Pinpoint application.
 *
 * The APNSVoipChannel resource represents the status and authentication settings of the APNs VoIP
 * channel for an application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * CfnAPNSVoipChannel cfnAPNSVoipChannel = CfnAPNSVoipChannel.Builder.create(this,
 * "MyCfnAPNSVoipChannel")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnsvoipchannel.html)
 */
@CdkDslMarker
public class CfnAPNSVoipChannelDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAPNSVoipChannel.Builder =
        CfnAPNSVoipChannel.Builder.create(scope, id)

    /**
     * The unique identifier for the Amazon Pinpoint application that the APNs VoIP channel applies
     * to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnsvoipchannel.html#cfn-pinpoint-apnsvoipchannel-applicationid)
     *
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the APNs
     *   VoIP channel applies to.
     */
    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    /**
     * The bundle identifier that's assigned to your iOS app.
     *
     * This identifier is used for APNs tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnsvoipchannel.html#cfn-pinpoint-apnsvoipchannel-bundleid)
     *
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnsvoipchannel.html#cfn-pinpoint-apnsvoipchannel-certificate)
     *
     * @param certificate The APNs client certificate that you received from Apple.
     */
    public fun certificate(certificate: String) {
        cdkBuilder.certificate(certificate)
    }

    /**
     * The default authentication method that you want Amazon Pinpoint to use when authenticating
     * with APNs.
     *
     * Valid options are `key` or `certificate` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnsvoipchannel.html#cfn-pinpoint-apnsvoipchannel-defaultauthenticationmethod)
     *
     * @param defaultAuthenticationMethod The default authentication method that you want Amazon
     *   Pinpoint to use when authenticating with APNs.
     */
    public fun defaultAuthenticationMethod(defaultAuthenticationMethod: String) {
        cdkBuilder.defaultAuthenticationMethod(defaultAuthenticationMethod)
    }

    /**
     * Specifies whether to enable the APNs VoIP channel for the Amazon Pinpoint application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnsvoipchannel.html#cfn-pinpoint-apnsvoipchannel-enabled)
     *
     * @param enabled Specifies whether to enable the APNs VoIP channel for the Amazon Pinpoint
     *   application.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * Specifies whether to enable the APNs VoIP channel for the Amazon Pinpoint application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnsvoipchannel.html#cfn-pinpoint-apnsvoipchannel-enabled)
     *
     * @param enabled Specifies whether to enable the APNs VoIP channel for the Amazon Pinpoint
     *   application.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * The private key for the APNs client certificate that you want Amazon Pinpoint to use to
     * communicate with APNs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnsvoipchannel.html#cfn-pinpoint-apnsvoipchannel-privatekey)
     *
     * @param privateKey The private key for the APNs client certificate that you want Amazon
     *   Pinpoint to use to communicate with APNs.
     */
    public fun privateKey(privateKey: String) {
        cdkBuilder.privateKey(privateKey)
    }

    /**
     * The identifier that's assigned to your Apple Developer Account team.
     *
     * This identifier is used for APNs tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnsvoipchannel.html#cfn-pinpoint-apnsvoipchannel-teamid)
     *
     * @param teamId The identifier that's assigned to your Apple Developer Account team.
     */
    public fun teamId(teamId: String) {
        cdkBuilder.teamId(teamId)
    }

    /**
     * The authentication key to use for APNs tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnsvoipchannel.html#cfn-pinpoint-apnsvoipchannel-tokenkey)
     *
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnsvoipchannel.html#cfn-pinpoint-apnsvoipchannel-tokenkeyid)
     *
     * @param tokenKeyId The key identifier that's assigned to your APNs signing key.
     */
    public fun tokenKeyId(tokenKeyId: String) {
        cdkBuilder.tokenKeyId(tokenKeyId)
    }

    public fun build(): CfnAPNSVoipChannel = cdkBuilder.build()
}

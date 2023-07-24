@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnAPNSSandboxChannel
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String

/**
 * A *channel* is a type of platform that you can deliver messages to.
 *
 * You can use the APNs sandbox channel to send push notification messages to the sandbox
 * environment of the Apple Push Notification service (APNs). Before you can use Amazon Pinpoint to
 * send notifications to the APNs sandbox environment, you have to enable the APNs sandbox channel for
 * an Amazon Pinpoint application.
 *
 * The APNSSandboxChannel resource represents the status and authentication settings of the APNs
 * sandbox channel for an application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * CfnAPNSSandboxChannel cfnAPNSSandboxChannel = CfnAPNSSandboxChannel.Builder.create(this,
 * "MyCfnAPNSSandboxChannel")
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
@CdkDslMarker
public class CfnAPNSSandboxChannelDsl(
    scope: Construct,
    id: String
) {
    private val cdkBuilder: CfnAPNSSandboxChannel.Builder =
        CfnAPNSSandboxChannel.Builder.create(scope, id)

    /**
     * The unique identifier for the Amazon Pinpoint application that the APNs sandbox channel applies
     * to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-applicationid)
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the APNs
     * sandbox channel applies to.
     */
    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    /**
     * The bundle identifier that's assigned to your iOS app.
     *
     * This identifier is used for APNs tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-bundleid)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-certificate)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-defaultauthenticationmethod)
     * @param defaultAuthenticationMethod The default authentication method that you want Amazon
     * Pinpoint to use when authenticating with APNs.
     */
    public fun defaultAuthenticationMethod(defaultAuthenticationMethod: String) {
        cdkBuilder.defaultAuthenticationMethod(defaultAuthenticationMethod)
    }

    /**
     * Specifies whether to enable the APNs Sandbox channel for the Amazon Pinpoint application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-enabled)
     * @param enabled Specifies whether to enable the APNs Sandbox channel for the Amazon Pinpoint
     * application.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * Specifies whether to enable the APNs Sandbox channel for the Amazon Pinpoint application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-enabled)
     * @param enabled Specifies whether to enable the APNs Sandbox channel for the Amazon Pinpoint
     * application.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * The private key for the APNs client certificate that you want Amazon Pinpoint to use to
     * communicate with APNs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-privatekey)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-teamid)
     * @param teamId The identifier that's assigned to your Apple Developer Account team.
     */
    public fun teamId(teamId: String) {
        cdkBuilder.teamId(teamId)
    }

    /**
     * The authentication key to use for APNs tokens.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-tokenkey)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnssandboxchannel.html#cfn-pinpoint-apnssandboxchannel-tokenkeyid)
     * @param tokenKeyId The key identifier that's assigned to your APNs signing key.
     */
    public fun tokenKeyId(tokenKeyId: String) {
        cdkBuilder.tokenKeyId(tokenKeyId)
    }

    public fun build(): CfnAPNSSandboxChannel = cdkBuilder.build()
}

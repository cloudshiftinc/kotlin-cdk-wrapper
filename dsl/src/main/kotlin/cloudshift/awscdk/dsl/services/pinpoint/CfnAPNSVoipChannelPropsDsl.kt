@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnAPNSVoipChannelProps
import kotlin.Boolean
import kotlin.String

/**
 * Properties for defining a `CfnAPNSVoipChannel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpoint.*;
 * CfnAPNSVoipChannelProps cfnAPNSVoipChannelProps = CfnAPNSVoipChannelProps.builder()
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
public class CfnAPNSVoipChannelPropsDsl {
    private val cdkBuilder: CfnAPNSVoipChannelProps.Builder = CfnAPNSVoipChannelProps.builder()

    /**
     * @param applicationId The unique identifier for the Amazon Pinpoint application that the APNs
     * VoIP channel applies to.
     */
    public fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
    }

    /**
     * @param bundleId The bundle identifier that's assigned to your iOS app.
     * This identifier is used for APNs tokens.
     */
    public fun bundleId(bundleId: String) {
        cdkBuilder.bundleId(bundleId)
    }

    /**
     * @param certificate The APNs client certificate that you received from Apple.
     * Specify this value if you want Amazon Pinpoint to communicate with APNs by using an APNs
     * certificate.
     */
    public fun certificate(certificate: String) {
        cdkBuilder.certificate(certificate)
    }

    /**
     * @param defaultAuthenticationMethod The default authentication method that you want Amazon
     * Pinpoint to use when authenticating with APNs.
     * Valid options are `key` or `certificate` .
     */
    public fun defaultAuthenticationMethod(defaultAuthenticationMethod: String) {
        cdkBuilder.defaultAuthenticationMethod(defaultAuthenticationMethod)
    }

    /**
     * @param enabled Specifies whether to enable the APNs VoIP channel for the Amazon Pinpoint
     * application.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Specifies whether to enable the APNs VoIP channel for the Amazon Pinpoint
     * application.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param privateKey The private key for the APNs client certificate that you want Amazon Pinpoint
     * to use to communicate with APNs.
     */
    public fun privateKey(privateKey: String) {
        cdkBuilder.privateKey(privateKey)
    }

    /**
     * @param teamId The identifier that's assigned to your Apple Developer Account team.
     * This identifier is used for APNs tokens.
     */
    public fun teamId(teamId: String) {
        cdkBuilder.teamId(teamId)
    }

    /**
     * @param tokenKey The authentication key to use for APNs tokens.
     */
    public fun tokenKey(tokenKey: String) {
        cdkBuilder.tokenKey(tokenKey)
    }

    /**
     * @param tokenKeyId The key identifier that's assigned to your APNs signing key.
     * Specify this value if you want Amazon Pinpoint to communicate with APNs by using APNs tokens.
     */
    public fun tokenKeyId(tokenKeyId: String) {
        cdkBuilder.tokenKeyId(tokenKeyId)
    }

    public fun build(): CfnAPNSVoipChannelProps = cdkBuilder.build()
}

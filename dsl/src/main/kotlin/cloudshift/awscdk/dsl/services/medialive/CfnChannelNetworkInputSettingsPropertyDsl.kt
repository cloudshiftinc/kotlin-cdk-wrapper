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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Information about how to connect to the upstream system.
 *
 * The parent of this entity is InputSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * NetworkInputSettingsProperty networkInputSettingsProperty =
 * NetworkInputSettingsProperty.builder()
 * .hlsInputSettings(HlsInputSettingsProperty.builder()
 * .bandwidth(123)
 * .bufferSegments(123)
 * .retries(123)
 * .retryInterval(123)
 * .scte35Source("scte35Source")
 * .build())
 * .serverValidation("serverValidation")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-networkinputsettings.html)
 */
@CdkDslMarker
public class CfnChannelNetworkInputSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.NetworkInputSettingsProperty.Builder =
        CfnChannel.NetworkInputSettingsProperty.builder()

    /** @param hlsInputSettings Information about how to connect to the upstream system. */
    public fun hlsInputSettings(hlsInputSettings: IResolvable) {
        cdkBuilder.hlsInputSettings(hlsInputSettings)
    }

    /** @param hlsInputSettings Information about how to connect to the upstream system. */
    public fun hlsInputSettings(hlsInputSettings: CfnChannel.HlsInputSettingsProperty) {
        cdkBuilder.hlsInputSettings(hlsInputSettings)
    }

    /**
     * @param serverValidation Checks HTTPS server certificates. When set to checkCryptographyOnly,
     *   cryptography in the certificate is checked, but not the server's name. Certain subdomains
     *   (notably S3 buckets that use dots in the bucket name) don't strictly match the
     *   corresponding certificate's wildcard pattern and would otherwise cause the channel to
     *   error. This setting is ignored for protocols that do not use HTTPS.
     */
    public fun serverValidation(serverValidation: String) {
        cdkBuilder.serverValidation(serverValidation)
    }

    public fun build(): CfnChannel.NetworkInputSettingsProperty = cdkBuilder.build()
}

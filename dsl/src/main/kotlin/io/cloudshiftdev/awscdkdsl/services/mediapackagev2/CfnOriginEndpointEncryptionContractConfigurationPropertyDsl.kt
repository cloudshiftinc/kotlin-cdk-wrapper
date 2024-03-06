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

package io.cloudshiftdev.awscdkdsl.services.mediapackagev2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint

/**
 * Use `encryptionContractConfiguration` to configure one or more content encryption keys for your
 * endpoints that use SPEKE Version 2.0. The encryption contract defines which content keys are used
 * to encrypt the audio and video tracks in your stream. To configure the encryption contract,
 * specify which audio and video encryption presets to use.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackagev2.*;
 * EncryptionContractConfigurationProperty encryptionContractConfigurationProperty =
 * EncryptionContractConfigurationProperty.builder()
 * .presetSpeke20Audio("presetSpeke20Audio")
 * .presetSpeke20Video("presetSpeke20Video")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryptioncontractconfiguration.html)
 */
@CdkDslMarker
public class CfnOriginEndpointEncryptionContractConfigurationPropertyDsl {
    private val cdkBuilder: CfnOriginEndpoint.EncryptionContractConfigurationProperty.Builder =
        CfnOriginEndpoint.EncryptionContractConfigurationProperty.builder()

    /**
     * @param presetSpeke20Audio A collection of audio encryption presets. Value description:
     * * `PRESET-AUDIO-1` - Use one content key to encrypt all of the audio tracks in your stream.
     * * `PRESET-AUDIO-2` - Use one content key to encrypt all of the stereo audio tracks and one
     *   content key to encrypt all of the multichannel audio tracks.
     * * `PRESET-AUDIO-3` - Use one content key to encrypt all of the stereo audio tracks, one
     *   content key to encrypt all of the multichannel audio tracks with 3 to 6 channels, and one
     *   content key to encrypt all of the multichannel audio tracks with more than 6 channels.
     * * `SHARED` - Use the same content key for all of the audio and video tracks in your stream.
     * * `UNENCRYPTED` - Don't encrypt any of the audio tracks in your stream.
     */
    public fun presetSpeke20Audio(presetSpeke20Audio: String) {
        cdkBuilder.presetSpeke20Audio(presetSpeke20Audio)
    }

    /**
     * @param presetSpeke20Video The SPEKE Version 2.0 preset video associated with the encryption
     *   contract configuration of the origin endpoint.
     */
    public fun presetSpeke20Video(presetSpeke20Video: String) {
        cdkBuilder.presetSpeke20Video(presetSpeke20Video)
    }

    public fun build(): CfnOriginEndpoint.EncryptionContractConfigurationProperty =
        cdkBuilder.build()
}

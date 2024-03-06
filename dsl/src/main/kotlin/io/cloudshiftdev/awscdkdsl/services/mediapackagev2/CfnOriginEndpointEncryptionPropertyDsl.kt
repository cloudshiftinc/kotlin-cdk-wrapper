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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint

/**
 * A collection of video encryption presets.
 *
 * Value description:
 * * `PRESET-VIDEO-1` - Use one content key to encrypt all of the video tracks in your stream.
 * * `PRESET-VIDEO-2` - Use one content key to encrypt all of the SD video tracks and one content
 *   key for all HD and higher resolutions video tracks.
 * * `PRESET-VIDEO-3` - Use one content key to encrypt all of the SD video tracks, one content key
 *   for HD video tracks and one content key for all UHD video tracks.
 * * `PRESET-VIDEO-4` - Use one content key to encrypt all of the SD video tracks, one content key
 *   for HD video tracks, one content key for all UHD1 video tracks and one content key for all UHD2
 *   video tracks.
 * * `PRESET-VIDEO-5` - Use one content key to encrypt all of the SD video tracks, one content key
 *   for HD1 video tracks, one content key for HD2 video tracks, one content key for all UHD1 video
 *   tracks and one content key for all UHD2 video tracks.
 * * `PRESET-VIDEO-6` - Use one content key to encrypt all of the SD video tracks, one content key
 *   for HD1 video tracks, one content key for HD2 video tracks and one content key for all UHD
 *   video tracks.
 * * `PRESET-VIDEO-7` - Use one content key to encrypt all of the SD+HD1 video tracks, one content
 *   key for HD2 video tracks and one content key for all UHD video tracks.
 * * `PRESET-VIDEO-8` - Use one content key to encrypt all of the SD+HD1 video tracks, one content
 *   key for HD2 video tracks, one content key for all UHD1 video tracks and one content key for all
 *   UHD2 video tracks.
 * * `SHARED` - Use the same content key for all of the video and audio tracks in your stream.
 * * `UNENCRYPTED` - Don't encrypt any of the video tracks in your stream.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackagev2.*;
 * EncryptionProperty encryptionProperty = EncryptionProperty.builder()
 * .encryptionMethod(EncryptionMethodProperty.builder()
 * .cmafEncryptionMethod("cmafEncryptionMethod")
 * .tsEncryptionMethod("tsEncryptionMethod")
 * .build())
 * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
 * .drmSystems(List.of("drmSystems"))
 * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
 * .presetSpeke20Audio("presetSpeke20Audio")
 * .presetSpeke20Video("presetSpeke20Video")
 * .build())
 * .resourceId("resourceId")
 * .roleArn("roleArn")
 * .url("url")
 * .build())
 * // the properties below are optional
 * .constantInitializationVector("constantInitializationVector")
 * .keyRotationIntervalSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryption.html)
 */
@CdkDslMarker
public class CfnOriginEndpointEncryptionPropertyDsl {
    private val cdkBuilder: CfnOriginEndpoint.EncryptionProperty.Builder =
        CfnOriginEndpoint.EncryptionProperty.builder()

    /**
     * @param constantInitializationVector A 128-bit, 16-byte hex value represented by a
     *   32-character string, used in conjunction with the key for encrypting content. If you don't
     *   specify a value, then MediaPackage creates the constant initialization vector (IV).
     */
    public fun constantInitializationVector(constantInitializationVector: String) {
        cdkBuilder.constantInitializationVector(constantInitializationVector)
    }

    /** @param encryptionMethod The encryption method to use. */
    public fun encryptionMethod(encryptionMethod: IResolvable) {
        cdkBuilder.encryptionMethod(encryptionMethod)
    }

    /** @param encryptionMethod The encryption method to use. */
    public fun encryptionMethod(encryptionMethod: CfnOriginEndpoint.EncryptionMethodProperty) {
        cdkBuilder.encryptionMethod(encryptionMethod)
    }

    /**
     * @param keyRotationIntervalSeconds The interval, in seconds, to rotate encryption keys for the
     *   origin endpoint.
     */
    public fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number) {
        cdkBuilder.keyRotationIntervalSeconds(keyRotationIntervalSeconds)
    }

    /** @param spekeKeyProvider The SPEKE key provider to use for encryption. */
    public fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider)
    }

    /** @param spekeKeyProvider The SPEKE key provider to use for encryption. */
    public fun spekeKeyProvider(spekeKeyProvider: CfnOriginEndpoint.SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider)
    }

    public fun build(): CfnOriginEndpoint.EncryptionProperty = cdkBuilder.build()
}

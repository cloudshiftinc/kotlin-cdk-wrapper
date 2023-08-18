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

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Hdr10 Settings.
 *
 * The parents of this entity are H265ColorSpaceSettings (for color space settings in the output)
 * and VideoSelectorColorSpaceSettings (for color space settings in the input).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * Hdr10SettingsProperty hdr10SettingsProperty = Hdr10SettingsProperty.builder()
 * .maxCll(123)
 * .maxFall(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hdr10settings.html)
 */
@CdkDslMarker
public class CfnChannelHdr10SettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.Hdr10SettingsProperty.Builder =
        CfnChannel.Hdr10SettingsProperty.builder()

    /**
     * @param maxCll Maximum Content Light Level An integer metadata value defining the maximum
     *   light level, in nits, of any single pixel within an encoded HDR video stream or file.
     */
    public fun maxCll(maxCll: Number) {
        cdkBuilder.maxCll(maxCll)
    }

    /**
     * @param maxFall Maximum Frame Average Light Level An integer metadata value defining the
     *   maximum average light level, in nits, for any single frame within an encoded HDR video
     *   stream or file.
     */
    public fun maxFall(maxFall: Number) {
        cdkBuilder.maxFall(maxFall)
    }

    public fun build(): CfnChannel.Hdr10SettingsProperty = cdkBuilder.build()
}

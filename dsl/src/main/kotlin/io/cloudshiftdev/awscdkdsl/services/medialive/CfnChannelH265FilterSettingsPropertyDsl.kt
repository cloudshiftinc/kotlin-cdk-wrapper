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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Settings to configure video filters that apply to the H265 codec.
 *
 * The parent of this entity is H265Settings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * H265FilterSettingsProperty h265FilterSettingsProperty = H265FilterSettingsProperty.builder()
 * .temporalFilterSettings(TemporalFilterSettingsProperty.builder()
 * .postFilterSharpening("postFilterSharpening")
 * .strength("strength")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-h265filtersettings.html)
 */
@CdkDslMarker
public class CfnChannelH265FilterSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.H265FilterSettingsProperty.Builder =
        CfnChannel.H265FilterSettingsProperty.builder()

    /** @param temporalFilterSettings Settings for applying the temporal filter to the video. */
    public fun temporalFilterSettings(temporalFilterSettings: IResolvable) {
        cdkBuilder.temporalFilterSettings(temporalFilterSettings)
    }

    /** @param temporalFilterSettings Settings for applying the temporal filter to the video. */
    public fun temporalFilterSettings(
        temporalFilterSettings: CfnChannel.TemporalFilterSettingsProperty
    ) {
        cdkBuilder.temporalFilterSettings(temporalFilterSettings)
    }

    public fun build(): CfnChannel.H265FilterSettingsProperty = cdkBuilder.build()
}

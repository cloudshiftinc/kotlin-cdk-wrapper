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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnMultiplexprogram

/**
 * The video configuration for each program in a multiplex.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * MultiplexVideoSettingsProperty multiplexVideoSettingsProperty =
 * MultiplexVideoSettingsProperty.builder()
 * .constantBitrate(123)
 * .statmuxSettings(MultiplexStatmuxVideoSettingsProperty.builder()
 * .maximumBitrate(123)
 * .minimumBitrate(123)
 * .priority(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-multiplexprogram-multiplexvideosettings.html)
 */
@CdkDslMarker
public class CfnMultiplexprogramMultiplexVideoSettingsPropertyDsl {
    private val cdkBuilder: CfnMultiplexprogram.MultiplexVideoSettingsProperty.Builder =
        CfnMultiplexprogram.MultiplexVideoSettingsProperty.builder()

    /**
     * @param constantBitrate The constant bitrate configuration for the video encode. When this
     *   field is defined, StatmuxSettings must be undefined.
     */
    public fun constantBitrate(constantBitrate: Number) {
        cdkBuilder.constantBitrate(constantBitrate)
    }

    /**
     * @param statmuxSettings Statmux rate control settings. When this field is defined,
     *   ConstantBitrate must be undefined.
     */
    public fun statmuxSettings(statmuxSettings: IResolvable) {
        cdkBuilder.statmuxSettings(statmuxSettings)
    }

    /**
     * @param statmuxSettings Statmux rate control settings. When this field is defined,
     *   ConstantBitrate must be undefined.
     */
    public fun statmuxSettings(
        statmuxSettings: CfnMultiplexprogram.MultiplexStatmuxVideoSettingsProperty
    ) {
        cdkBuilder.statmuxSettings(statmuxSettings)
    }

    public fun build(): CfnMultiplexprogram.MultiplexVideoSettingsProperty = cdkBuilder.build()
}

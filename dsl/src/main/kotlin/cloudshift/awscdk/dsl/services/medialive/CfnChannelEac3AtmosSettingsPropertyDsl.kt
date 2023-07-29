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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * Eac3AtmosSettingsProperty eac3AtmosSettingsProperty = Eac3AtmosSettingsProperty.builder()
 * .bitrate(123)
 * .codingMode("codingMode")
 * .dialnorm(123)
 * .drcLine("drcLine")
 * .drcRf("drcRf")
 * .heightTrim(123)
 * .surroundTrim(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-eac3atmossettings.html)
 */
@CdkDslMarker
public class CfnChannelEac3AtmosSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.Eac3AtmosSettingsProperty.Builder =
        CfnChannel.Eac3AtmosSettingsProperty.builder()

    /** @param bitrate the value to be set. */
    public fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
    }

    /** @param codingMode the value to be set. */
    public fun codingMode(codingMode: String) {
        cdkBuilder.codingMode(codingMode)
    }

    /** @param dialnorm the value to be set. */
    public fun dialnorm(dialnorm: Number) {
        cdkBuilder.dialnorm(dialnorm)
    }

    /** @param drcLine the value to be set. */
    public fun drcLine(drcLine: String) {
        cdkBuilder.drcLine(drcLine)
    }

    /** @param drcRf the value to be set. */
    public fun drcRf(drcRf: String) {
        cdkBuilder.drcRf(drcRf)
    }

    /** @param heightTrim the value to be set. */
    public fun heightTrim(heightTrim: Number) {
        cdkBuilder.heightTrim(heightTrim)
    }

    /** @param surroundTrim the value to be set. */
    public fun surroundTrim(surroundTrim: Number) {
        cdkBuilder.surroundTrim(surroundTrim)
    }

    public fun build(): CfnChannel.Eac3AtmosSettingsProperty = cdkBuilder.build()
}

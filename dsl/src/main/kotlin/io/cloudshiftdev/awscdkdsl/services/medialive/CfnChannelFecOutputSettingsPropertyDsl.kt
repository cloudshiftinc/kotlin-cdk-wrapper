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
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The settings for FEC.
 *
 * The parent of this entity is UdpOutputSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * FecOutputSettingsProperty fecOutputSettingsProperty = FecOutputSettingsProperty.builder()
 * .columnDepth(123)
 * .includeFec("includeFec")
 * .rowLength(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-fecoutputsettings.html)
 */
@CdkDslMarker
public class CfnChannelFecOutputSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.FecOutputSettingsProperty.Builder =
        CfnChannel.FecOutputSettingsProperty.builder()

    /**
     * @param columnDepth The parameter D from SMPTE 2022-1. The height of the FEC protection
     *   matrix. The number of transport stream packets per column error correction packet. The
     *   number must be between 4 and 20, inclusive.
     */
    public fun columnDepth(columnDepth: Number) {
        cdkBuilder.columnDepth(columnDepth)
    }

    /** @param includeFec Enables column only or column and row-based FEC. */
    public fun includeFec(includeFec: String) {
        cdkBuilder.includeFec(includeFec)
    }

    /**
     * @param rowLength The parameter L from SMPTE 2022-1. The width of the FEC protection matrix.
     *   Must be between 1 and 20, inclusive. If only Column FEC is used, then larger values
     *   increase robustness. If Row FEC is used, then this is the number of transport stream
     *   packets per row error correction packet, and the value must be between 4 and 20, inclusive,
     *   if includeFec is columnAndRow. If includeFec is column, this value must be 1 to 20,
     *   inclusive.
     */
    public fun rowLength(rowLength: Number) {
        cdkBuilder.rowLength(rowLength)
    }

    public fun build(): CfnChannel.FecOutputSettingsProperty = cdkBuilder.build()
}

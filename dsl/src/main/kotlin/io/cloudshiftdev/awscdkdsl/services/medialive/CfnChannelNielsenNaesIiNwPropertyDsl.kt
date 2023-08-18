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
 * Complete these fields only if you want to insert watermarks of type Nielsen NAES II (N2) and
 * Nielsen NAES VI (NW).
 *
 * The parent of this entity is NielsenWatermarksSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * NielsenNaesIiNwProperty nielsenNaesIiNwProperty = NielsenNaesIiNwProperty.builder()
 * .checkDigitString("checkDigitString")
 * .sid(123)
 * .timezone("timezone")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-nielsennaesiinw.html)
 */
@CdkDslMarker
public class CfnChannelNielsenNaesIiNwPropertyDsl {
    private val cdkBuilder: CfnChannel.NielsenNaesIiNwProperty.Builder =
        CfnChannel.NielsenNaesIiNwProperty.builder()

    /** @param checkDigitString Enter the check digit string for the watermark. */
    public fun checkDigitString(checkDigitString: String) {
        cdkBuilder.checkDigitString(checkDigitString)
    }

    /** @param sid Enter the Nielsen Source ID (SID) to include in the watermark. */
    public fun sid(sid: Number) {
        cdkBuilder.sid(sid)
    }

    /** @param timezone the value to be set. */
    public fun timezone(timezone: String) {
        cdkBuilder.timezone(timezone)
    }

    public fun build(): CfnChannel.NielsenNaesIiNwProperty = cdkBuilder.build()
}

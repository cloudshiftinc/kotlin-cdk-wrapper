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
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The DVB Time and Date Table (TDT).
 *
 * The parent of this entity is M2tsSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * DvbTdtSettingsProperty dvbTdtSettingsProperty = DvbTdtSettingsProperty.builder()
 * .repInterval(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-dvbtdtsettings.html)
 */
@CdkDslMarker
public class CfnChannelDvbTdtSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.DvbTdtSettingsProperty.Builder =
        CfnChannel.DvbTdtSettingsProperty.builder()

    /**
     * @param repInterval The number of milliseconds between instances of this table in the output
     *   transport stream.
     */
    public fun repInterval(repInterval: Number) {
        cdkBuilder.repInterval(repInterval)
    }

    public fun build(): CfnChannel.DvbTdtSettingsProperty = cdkBuilder.build()
}

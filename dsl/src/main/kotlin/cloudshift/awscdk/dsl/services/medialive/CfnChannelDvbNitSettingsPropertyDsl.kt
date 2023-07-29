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
 * The configuration of DVB NIT.
 *
 * The parent of this entity is M2tsSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * DvbNitSettingsProperty dvbNitSettingsProperty = DvbNitSettingsProperty.builder()
 * .networkId(123)
 * .networkName("networkName")
 * .repInterval(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-dvbnitsettings.html)
 */
@CdkDslMarker
public class CfnChannelDvbNitSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.DvbNitSettingsProperty.Builder =
        CfnChannel.DvbNitSettingsProperty.builder()

    /** @param networkId The numeric value placed in the Network Information Table (NIT). */
    public fun networkId(networkId: Number) {
        cdkBuilder.networkId(networkId)
    }

    /**
     * @param networkName The network name text placed in the networkNameDescriptor inside the
     *   Network Information Table (NIT). The maximum length is 256 characters.
     */
    public fun networkName(networkName: String) {
        cdkBuilder.networkName(networkName)
    }

    /**
     * @param repInterval The number of milliseconds between instances of this table in the output
     *   transport stream.
     */
    public fun repInterval(repInterval: Number) {
        cdkBuilder.repInterval(repInterval)
    }

    public fun build(): CfnChannel.DvbNitSettingsProperty = cdkBuilder.build()
}

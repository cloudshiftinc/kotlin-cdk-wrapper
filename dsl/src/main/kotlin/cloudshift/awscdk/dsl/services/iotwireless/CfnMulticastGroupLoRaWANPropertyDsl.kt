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

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.iotwireless.CfnMulticastGroup

/**
 * The LoRaWAN information that is to be used with the multicast group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * LoRaWANProperty loRaWANProperty = LoRaWANProperty.builder()
 * .dlClass("dlClass")
 * .rfRegion("rfRegion")
 * // the properties below are optional
 * .numberOfDevicesInGroup(123)
 * .numberOfDevicesRequested(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-multicastgroup-lorawan.html)
 */
@CdkDslMarker
public class CfnMulticastGroupLoRaWANPropertyDsl {
    private val cdkBuilder: CfnMulticastGroup.LoRaWANProperty.Builder =
        CfnMulticastGroup.LoRaWANProperty.builder()

    /** @param dlClass DlClass for LoRaWAN. Valid values are ClassB and ClassC. */
    public fun dlClass(dlClass: String) {
        cdkBuilder.dlClass(dlClass)
    }

    /**
     * @param numberOfDevicesInGroup Number of devices that are associated to the multicast group.
     */
    public fun numberOfDevicesInGroup(numberOfDevicesInGroup: Number) {
        cdkBuilder.numberOfDevicesInGroup(numberOfDevicesInGroup)
    }

    /**
     * @param numberOfDevicesRequested Number of devices that are requested to be associated with
     *   the multicast group.
     */
    public fun numberOfDevicesRequested(numberOfDevicesRequested: Number) {
        cdkBuilder.numberOfDevicesRequested(numberOfDevicesRequested)
    }

    /** @param rfRegion The frequency band (RFRegion) value. */
    public fun rfRegion(rfRegion: String) {
        cdkBuilder.rfRegion(rfRegion)
    }

    public fun build(): CfnMulticastGroup.LoRaWANProperty = cdkBuilder.build()
}

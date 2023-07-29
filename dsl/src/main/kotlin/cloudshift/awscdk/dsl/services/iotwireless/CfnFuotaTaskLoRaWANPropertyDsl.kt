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
import kotlin.String
import software.amazon.awscdk.services.iotwireless.CfnFuotaTask

/**
 * The LoRaWAN information used with a FUOTA task.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * LoRaWANProperty loRaWANProperty = LoRaWANProperty.builder()
 * .rfRegion("rfRegion")
 * // the properties below are optional
 * .startTime("startTime")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-fuotatask-lorawan.html)
 */
@CdkDslMarker
public class CfnFuotaTaskLoRaWANPropertyDsl {
    private val cdkBuilder: CfnFuotaTask.LoRaWANProperty.Builder =
        CfnFuotaTask.LoRaWANProperty.builder()

    /** @param rfRegion The frequency band (RFRegion) value. */
    public fun rfRegion(rfRegion: String) {
        cdkBuilder.rfRegion(rfRegion)
    }

    /** @param startTime Start time of a FUOTA task. */
    public fun startTime(startTime: String) {
        cdkBuilder.startTime(startTime)
    }

    public fun build(): CfnFuotaTask.LoRaWANProperty = cdkBuilder.build()
}

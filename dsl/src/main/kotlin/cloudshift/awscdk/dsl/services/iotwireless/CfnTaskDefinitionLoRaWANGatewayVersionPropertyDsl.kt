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
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinition

/**
 * LoRaWANGatewayVersion object.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * LoRaWANGatewayVersionProperty loRaWANGatewayVersionProperty =
 * LoRaWANGatewayVersionProperty.builder()
 * .model("model")
 * .packageVersion("packageVersion")
 * .station("station")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawangatewayversion.html)
 */
@CdkDslMarker
public class CfnTaskDefinitionLoRaWANGatewayVersionPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.LoRaWANGatewayVersionProperty.Builder =
        CfnTaskDefinition.LoRaWANGatewayVersionProperty.builder()

    /** @param model The model number of the wireless gateway. */
    public fun model(model: String) {
        cdkBuilder.model(model)
    }

    /** @param packageVersion The version of the wireless gateway firmware. */
    public fun packageVersion(packageVersion: String) {
        cdkBuilder.packageVersion(packageVersion)
    }

    /** @param station The basic station version of the wireless gateway. */
    public fun station(station: String) {
        cdkBuilder.station(station)
    }

    public fun build(): CfnTaskDefinition.LoRaWANGatewayVersionProperty = cdkBuilder.build()
}

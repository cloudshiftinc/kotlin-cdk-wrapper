@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinition

/**
 * LoRaWANUpdateGatewayTaskEntry object.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotwireless.*;
 * LoRaWANUpdateGatewayTaskEntryProperty loRaWANUpdateGatewayTaskEntryProperty =
 * LoRaWANUpdateGatewayTaskEntryProperty.builder()
 * .currentVersion(LoRaWANGatewayVersionProperty.builder()
 * .model("model")
 * .packageVersion("packageVersion")
 * .station("station")
 * .build())
 * .updateVersion(LoRaWANGatewayVersionProperty.builder()
 * .model("model")
 * .packageVersion("packageVersion")
 * .station("station")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotwireless-taskdefinition-lorawanupdategatewaytaskentry.html)
 */
@CdkDslMarker
public class CfnTaskDefinitionLoRaWANUpdateGatewayTaskEntryPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty.Builder =
        CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty.builder()

    /**
     * @param currentVersion The version of the gateways that should receive the update.
     */
    public fun currentVersion(currentVersion: IResolvable) {
        cdkBuilder.currentVersion(currentVersion)
    }

    /**
     * @param currentVersion The version of the gateways that should receive the update.
     */
    public fun currentVersion(currentVersion: CfnTaskDefinition.LoRaWANGatewayVersionProperty) {
        cdkBuilder.currentVersion(currentVersion)
    }

    /**
     * @param updateVersion The firmware version to update the gateway to.
     */
    public fun updateVersion(updateVersion: IResolvable) {
        cdkBuilder.updateVersion(updateVersion)
    }

    /**
     * @param updateVersion The firmware version to update the gateway to.
     */
    public fun updateVersion(updateVersion: CfnTaskDefinition.LoRaWANGatewayVersionProperty) {
        cdkBuilder.updateVersion(updateVersion)
    }

    public fun build(): CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty = cdkBuilder.build()
}

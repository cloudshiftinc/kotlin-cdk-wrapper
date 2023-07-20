@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.iotwireless

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotwireless.CfnTaskDefinition

@CdkDslMarker
public class CfnTaskDefinitionLoRaWANUpdateGatewayTaskEntryPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty.Builder =
        CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty.builder()

    public fun currentVersion(currentVersion: IResolvable) {
        cdkBuilder.currentVersion(currentVersion)
    }

    public fun currentVersion(currentVersion: CfnTaskDefinition.LoRaWANGatewayVersionProperty) {
        cdkBuilder.currentVersion(currentVersion)
    }

    public fun updateVersion(updateVersion: IResolvable) {
        cdkBuilder.updateVersion(updateVersion)
    }

    public fun updateVersion(updateVersion: CfnTaskDefinition.LoRaWANGatewayVersionProperty) {
        cdkBuilder.updateVersion(updateVersion)
    }

    public fun build(): CfnTaskDefinition.LoRaWANUpdateGatewayTaskEntryProperty = cdkBuilder.build()
}

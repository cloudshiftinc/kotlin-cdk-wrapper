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
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnTaskDefinitionLoRaWANUpdateGatewayTaskCreatePropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty.Builder =
        CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty.builder()

    public fun currentVersion(currentVersion: IResolvable) {
        cdkBuilder.currentVersion(currentVersion)
    }

    public fun currentVersion(currentVersion: CfnTaskDefinition.LoRaWANGatewayVersionProperty) {
        cdkBuilder.currentVersion(currentVersion)
    }

    public fun sigKeyCrc(sigKeyCrc: Number) {
        cdkBuilder.sigKeyCrc(sigKeyCrc)
    }

    public fun updateSignature(updateSignature: String) {
        cdkBuilder.updateSignature(updateSignature)
    }

    public fun updateVersion(updateVersion: IResolvable) {
        cdkBuilder.updateVersion(updateVersion)
    }

    public fun updateVersion(updateVersion: CfnTaskDefinition.LoRaWANGatewayVersionProperty) {
        cdkBuilder.updateVersion(updateVersion)
    }

    public fun build(): CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty = cdkBuilder.build()
}

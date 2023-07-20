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
import kotlin.String

@CdkDslMarker
public class CfnTaskDefinitionUpdateWirelessGatewayTaskCreatePropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty.Builder =
        CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty.builder()

    public fun loRaWan(loRaWan: IResolvable) {
        cdkBuilder.loRaWan(loRaWan)
    }

    public fun loRaWan(loRaWan: CfnTaskDefinition.LoRaWANUpdateGatewayTaskCreateProperty) {
        cdkBuilder.loRaWan(loRaWan)
    }

    public fun updateDataRole(updateDataRole: String) {
        cdkBuilder.updateDataRole(updateDataRole)
    }

    public fun updateDataSource(updateDataSource: String) {
        cdkBuilder.updateDataSource(updateDataSource)
    }

    public fun build(): CfnTaskDefinition.UpdateWirelessGatewayTaskCreateProperty = cdkBuilder.build()
}

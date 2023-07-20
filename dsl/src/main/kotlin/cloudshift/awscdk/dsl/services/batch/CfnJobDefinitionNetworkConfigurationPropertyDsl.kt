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

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.batch.CfnJobDefinition
import kotlin.String

@CdkDslMarker
public class CfnJobDefinitionNetworkConfigurationPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.NetworkConfigurationProperty.Builder =
        CfnJobDefinition.NetworkConfigurationProperty.builder()

    public fun assignPublicIp(assignPublicIp: String) {
        cdkBuilder.assignPublicIp(assignPublicIp)
    }

    public fun build(): CfnJobDefinition.NetworkConfigurationProperty = cdkBuilder.build()
}

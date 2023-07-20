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

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.groundstation.CfnConfig
import kotlin.String

@CdkDslMarker
public class CfnConfigDataflowEndpointConfigPropertyDsl {
    private val cdkBuilder: CfnConfig.DataflowEndpointConfigProperty.Builder =
        CfnConfig.DataflowEndpointConfigProperty.builder()

    public fun dataflowEndpointName(dataflowEndpointName: String) {
        cdkBuilder.dataflowEndpointName(dataflowEndpointName)
    }

    public fun dataflowEndpointRegion(dataflowEndpointRegion: String) {
        cdkBuilder.dataflowEndpointRegion(dataflowEndpointRegion)
    }

    public fun build(): CfnConfig.DataflowEndpointConfigProperty = cdkBuilder.build()
}

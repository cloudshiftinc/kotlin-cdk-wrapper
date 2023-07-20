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

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnInfrastructureConfigurationInstanceMetadataOptionsPropertyDsl {
    private val cdkBuilder: CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty.Builder =
        CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty.builder()

    public fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
        cdkBuilder.httpPutResponseHopLimit(httpPutResponseHopLimit)
    }

    public fun httpTokens(httpTokens: String) {
        cdkBuilder.httpTokens(httpTokens)
    }

    public fun build(): CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty =
        cdkBuilder.build()
}

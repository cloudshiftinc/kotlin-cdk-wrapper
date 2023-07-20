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

package cloudshift.awscdk.dsl.services.devopsguru

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.devopsguru.CfnLogAnomalyDetectionIntegrationProps

@CdkDslMarker
public class CfnLogAnomalyDetectionIntegrationPropsDsl {
    private val cdkBuilder: CfnLogAnomalyDetectionIntegrationProps.Builder =
        CfnLogAnomalyDetectionIntegrationProps.builder()

    public fun build(): CfnLogAnomalyDetectionIntegrationProps = cdkBuilder.build()
}

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

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.applicationinsights.CfnApplication
import kotlin.String

@CdkDslMarker
public class CfnApplicationHAClusterPrometheusExporterPropertyDsl {
    private val cdkBuilder: CfnApplication.HAClusterPrometheusExporterProperty.Builder =
        CfnApplication.HAClusterPrometheusExporterProperty.builder()

    public fun prometheusPort(prometheusPort: String) {
        cdkBuilder.prometheusPort(prometheusPort)
    }

    public fun build(): CfnApplication.HAClusterPrometheusExporterProperty = cdkBuilder.build()
}

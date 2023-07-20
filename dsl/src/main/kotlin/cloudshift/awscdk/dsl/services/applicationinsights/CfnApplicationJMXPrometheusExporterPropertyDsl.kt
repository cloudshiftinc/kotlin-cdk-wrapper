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
public class CfnApplicationJMXPrometheusExporterPropertyDsl {
    private val cdkBuilder: CfnApplication.JMXPrometheusExporterProperty.Builder =
        CfnApplication.JMXPrometheusExporterProperty.builder()

    public fun hostPort(hostPort: String) {
        cdkBuilder.hostPort(hostPort)
    }

    public fun jmxurl(jmxurl: String) {
        cdkBuilder.jmxurl(jmxurl)
    }

    public fun prometheusPort(prometheusPort: String) {
        cdkBuilder.prometheusPort(prometheusPort)
    }

    public fun build(): CfnApplication.JMXPrometheusExporterProperty = cdkBuilder.build()
}

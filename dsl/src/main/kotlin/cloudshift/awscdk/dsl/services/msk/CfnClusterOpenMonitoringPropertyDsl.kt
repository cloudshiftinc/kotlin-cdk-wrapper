@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * JMX and Node monitoring for the MSK cluster.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * OpenMonitoringProperty openMonitoringProperty = OpenMonitoringProperty.builder()
 * .prometheus(PrometheusProperty.builder()
 * .jmxExporter(JmxExporterProperty.builder()
 * .enabledInBroker(false)
 * .build())
 * .nodeExporter(NodeExporterProperty.builder()
 * .enabledInBroker(false)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-openmonitoring.html)
 */
@CdkDslMarker
public class CfnClusterOpenMonitoringPropertyDsl {
    private val cdkBuilder: CfnCluster.OpenMonitoringProperty.Builder =
        CfnCluster.OpenMonitoringProperty.builder()

    /** @param prometheus Prometheus exporter settings. */
    public fun prometheus(prometheus: IResolvable) {
        cdkBuilder.prometheus(prometheus)
    }

    /** @param prometheus Prometheus exporter settings. */
    public fun prometheus(prometheus: CfnCluster.PrometheusProperty) {
        cdkBuilder.prometheus(prometheus)
    }

    public fun build(): CfnCluster.OpenMonitoringProperty = cdkBuilder.build()
}

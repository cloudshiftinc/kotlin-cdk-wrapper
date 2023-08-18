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

package io.cloudshiftdev.awscdkdsl.services.msk

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnCluster

/**
 * Prometheus settings for open monitoring.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.msk.*;
 * PrometheusProperty prometheusProperty = PrometheusProperty.builder()
 * .jmxExporter(JmxExporterProperty.builder()
 * .enabledInBroker(false)
 * .build())
 * .nodeExporter(NodeExporterProperty.builder()
 * .enabledInBroker(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-prometheus.html)
 */
@CdkDslMarker
public class CfnClusterPrometheusPropertyDsl {
    private val cdkBuilder: CfnCluster.PrometheusProperty.Builder =
        CfnCluster.PrometheusProperty.builder()

    /** @param jmxExporter Indicates whether you want to enable or disable the JMX Exporter. */
    public fun jmxExporter(jmxExporter: IResolvable) {
        cdkBuilder.jmxExporter(jmxExporter)
    }

    /** @param jmxExporter Indicates whether you want to enable or disable the JMX Exporter. */
    public fun jmxExporter(jmxExporter: CfnCluster.JmxExporterProperty) {
        cdkBuilder.jmxExporter(jmxExporter)
    }

    /** @param nodeExporter Indicates whether you want to enable or disable the Node Exporter. */
    public fun nodeExporter(nodeExporter: IResolvable) {
        cdkBuilder.nodeExporter(nodeExporter)
    }

    /** @param nodeExporter Indicates whether you want to enable or disable the Node Exporter. */
    public fun nodeExporter(nodeExporter: CfnCluster.NodeExporterProperty) {
        cdkBuilder.nodeExporter(nodeExporter)
    }

    public fun build(): CfnCluster.PrometheusProperty = cdkBuilder.build()
}

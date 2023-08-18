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

package io.cloudshiftdev.awscdkdsl.services.applicationinsights

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.applicationinsights.CfnApplication

/**
 * The `AWS::ApplicationInsights::Application HAClusterPrometheusExporter` property type defines the
 * HA cluster Prometheus Exporter settings.
 *
 * For more information, see the
 * [component configuration](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/component-config-sections.html#component-configuration-prometheus)
 * in the CloudWatch Application Insights documentation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationinsights.*;
 * HAClusterPrometheusExporterProperty hAClusterPrometheusExporterProperty =
 * HAClusterPrometheusExporterProperty.builder()
 * .prometheusPort("prometheusPort")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-haclusterprometheusexporter.html)
 */
@CdkDslMarker
public class CfnApplicationHAClusterPrometheusExporterPropertyDsl {
    private val cdkBuilder: CfnApplication.HAClusterPrometheusExporterProperty.Builder =
        CfnApplication.HAClusterPrometheusExporterProperty.builder()

    /**
     * @param prometheusPort The target port to which Prometheus sends metrics. If not specified,
     *   the default port 9668 is used.
     */
    public fun prometheusPort(prometheusPort: String) {
        cdkBuilder.prometheusPort(prometheusPort)
    }

    public fun build(): CfnApplication.HAClusterPrometheusExporterProperty = cdkBuilder.build()
}

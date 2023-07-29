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

package cloudshift.awscdk.dsl.services.applicationinsights

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.applicationinsights.CfnApplication

/**
 * The `AWS::ApplicationInsights::Application JMXPrometheusExporter` property type defines the
 * JMXPrometheus Exporter configuration.
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
 * JMXPrometheusExporterProperty jMXPrometheusExporterProperty =
 * JMXPrometheusExporterProperty.builder()
 * .hostPort("hostPort")
 * .jmxurl("jmxurl")
 * .prometheusPort("prometheusPort")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-jmxprometheusexporter.html)
 */
@CdkDslMarker
public class CfnApplicationJMXPrometheusExporterPropertyDsl {
    private val cdkBuilder: CfnApplication.JMXPrometheusExporterProperty.Builder =
        CfnApplication.JMXPrometheusExporterProperty.builder()

    /**
     * @param hostPort The host and port to connect to through remote JMX. Only one of `jmxURL` and
     *   `hostPort` can be specified.
     */
    public fun hostPort(hostPort: String) {
        cdkBuilder.hostPort(hostPort)
    }

    /** @param jmxurl The complete JMX URL to connect to. */
    public fun jmxurl(jmxurl: String) {
        cdkBuilder.jmxurl(jmxurl)
    }

    /**
     * @param prometheusPort The target port to send Prometheus metrics to. If not specified, the
     *   default port `9404` is used.
     */
    public fun prometheusPort(prometheusPort: String) {
        cdkBuilder.prometheusPort(prometheusPort)
    }

    public fun build(): CfnApplication.JMXPrometheusExporterProperty = cdkBuilder.build()
}

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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationinsights.CfnApplication

/**
 * The `AWS::ApplicationInsights::Application HANAPrometheusExporter` property type defines the HANA
 * DB Prometheus Exporter settings.
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
 * HANAPrometheusExporterProperty hANAPrometheusExporterProperty =
 * HANAPrometheusExporterProperty.builder()
 * .agreeToInstallHanadbClient(false)
 * .hanaPort("hanaPort")
 * .hanaSecretName("hanaSecretName")
 * .hanasid("hanasid")
 * // the properties below are optional
 * .prometheusPort("prometheusPort")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-hanaprometheusexporter.html)
 */
@CdkDslMarker
public class CfnApplicationHANAPrometheusExporterPropertyDsl {
    private val cdkBuilder: CfnApplication.HANAPrometheusExporterProperty.Builder =
        CfnApplication.HANAPrometheusExporterProperty.builder()

    /**
     * @param agreeToInstallHanadbClient Designates whether you agree to install the HANA DB client.
     */
    public fun agreeToInstallHanadbClient(agreeToInstallHanadbClient: Boolean) {
        cdkBuilder.agreeToInstallHanadbClient(agreeToInstallHanadbClient)
    }

    /**
     * @param agreeToInstallHanadbClient Designates whether you agree to install the HANA DB client.
     */
    public fun agreeToInstallHanadbClient(agreeToInstallHanadbClient: IResolvable) {
        cdkBuilder.agreeToInstallHanadbClient(agreeToInstallHanadbClient)
    }

    /** @param hanaPort The HANA database port by which the exporter will query HANA metrics. */
    public fun hanaPort(hanaPort: String) {
        cdkBuilder.hanaPort(hanaPort)
    }

    /**
     * @param hanaSecretName The AWS Secrets Manager secret that stores HANA monitoring user
     *   credentials. The HANA Prometheus exporter uses these credentials to connect to the database
     *   and query HANA metrics.
     */
    public fun hanaSecretName(hanaSecretName: String) {
        cdkBuilder.hanaSecretName(hanaSecretName)
    }

    /** @param hanasid The three-character SAP system ID (SID) of the SAP HANA system. */
    public fun hanasid(hanasid: String) {
        cdkBuilder.hanasid(hanasid)
    }

    /**
     * @param prometheusPort The target port to which Prometheus sends metrics. If not specified,
     *   the default port 9668 is used.
     */
    public fun prometheusPort(prometheusPort: String) {
        cdkBuilder.prometheusPort(prometheusPort)
    }

    public fun build(): CfnApplication.HANAPrometheusExporterProperty = cdkBuilder.build()
}

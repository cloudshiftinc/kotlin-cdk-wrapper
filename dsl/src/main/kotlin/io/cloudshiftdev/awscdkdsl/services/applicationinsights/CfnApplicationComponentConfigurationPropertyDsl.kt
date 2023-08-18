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
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationinsights.CfnApplication

/**
 * The `AWS::ApplicationInsights::Application ComponentConfiguration` property type defines the
 * configuration settings of the component.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationinsights.*;
 * ComponentConfigurationProperty componentConfigurationProperty =
 * ComponentConfigurationProperty.builder()
 * .configurationDetails(ConfigurationDetailsProperty.builder()
 * .alarmMetrics(List.of(AlarmMetricProperty.builder()
 * .alarmMetricName("alarmMetricName")
 * .build()))
 * .alarms(List.of(AlarmProperty.builder()
 * .alarmName("alarmName")
 * // the properties below are optional
 * .severity("severity")
 * .build()))
 * .haClusterPrometheusExporter(HAClusterPrometheusExporterProperty.builder()
 * .prometheusPort("prometheusPort")
 * .build())
 * .hanaPrometheusExporter(HANAPrometheusExporterProperty.builder()
 * .agreeToInstallHanadbClient(false)
 * .hanaPort("hanaPort")
 * .hanaSecretName("hanaSecretName")
 * .hanasid("hanasid")
 * // the properties below are optional
 * .prometheusPort("prometheusPort")
 * .build())
 * .jmxPrometheusExporter(JMXPrometheusExporterProperty.builder()
 * .hostPort("hostPort")
 * .jmxurl("jmxurl")
 * .prometheusPort("prometheusPort")
 * .build())
 * .logs(List.of(LogProperty.builder()
 * .logType("logType")
 * // the properties below are optional
 * .encoding("encoding")
 * .logGroupName("logGroupName")
 * .logPath("logPath")
 * .patternSet("patternSet")
 * .build()))
 * .windowsEvents(List.of(WindowsEventProperty.builder()
 * .eventLevels(List.of("eventLevels"))
 * .eventName("eventName")
 * .logGroupName("logGroupName")
 * // the properties below are optional
 * .patternSet("patternSet")
 * .build()))
 * .build())
 * .subComponentTypeConfigurations(List.of(SubComponentTypeConfigurationProperty.builder()
 * .subComponentConfigurationDetails(SubComponentConfigurationDetailsProperty.builder()
 * .alarmMetrics(List.of(AlarmMetricProperty.builder()
 * .alarmMetricName("alarmMetricName")
 * .build()))
 * .logs(List.of(LogProperty.builder()
 * .logType("logType")
 * // the properties below are optional
 * .encoding("encoding")
 * .logGroupName("logGroupName")
 * .logPath("logPath")
 * .patternSet("patternSet")
 * .build()))
 * .windowsEvents(List.of(WindowsEventProperty.builder()
 * .eventLevels(List.of("eventLevels"))
 * .eventName("eventName")
 * .logGroupName("logGroupName")
 * // the properties below are optional
 * .patternSet("patternSet")
 * .build()))
 * .build())
 * .subComponentType("subComponentType")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-componentconfiguration.html)
 */
@CdkDslMarker
public class CfnApplicationComponentConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.ComponentConfigurationProperty.Builder =
        CfnApplication.ComponentConfigurationProperty.builder()

    private val _subComponentTypeConfigurations: MutableList<Any> = mutableListOf()

    /** @param configurationDetails The configuration settings. */
    public fun configurationDetails(configurationDetails: IResolvable) {
        cdkBuilder.configurationDetails(configurationDetails)
    }

    /** @param configurationDetails The configuration settings. */
    public fun configurationDetails(
        configurationDetails: CfnApplication.ConfigurationDetailsProperty
    ) {
        cdkBuilder.configurationDetails(configurationDetails)
    }

    /** @param subComponentTypeConfigurations Sub-component configurations of the component. */
    public fun subComponentTypeConfigurations(vararg subComponentTypeConfigurations: Any) {
        _subComponentTypeConfigurations.addAll(listOf(*subComponentTypeConfigurations))
    }

    /** @param subComponentTypeConfigurations Sub-component configurations of the component. */
    public fun subComponentTypeConfigurations(subComponentTypeConfigurations: Collection<Any>) {
        _subComponentTypeConfigurations.addAll(subComponentTypeConfigurations)
    }

    /** @param subComponentTypeConfigurations Sub-component configurations of the component. */
    public fun subComponentTypeConfigurations(subComponentTypeConfigurations: IResolvable) {
        cdkBuilder.subComponentTypeConfigurations(subComponentTypeConfigurations)
    }

    public fun build(): CfnApplication.ComponentConfigurationProperty {
        if (_subComponentTypeConfigurations.isNotEmpty())
            cdkBuilder.subComponentTypeConfigurations(_subComponentTypeConfigurations)
        return cdkBuilder.build()
    }
}

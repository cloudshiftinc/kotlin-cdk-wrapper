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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationinsights.CfnApplication

/**
 * The `AWS::ApplicationInsights::Application ComponentMonitoringSetting` property type defines the
 * monitoring setting of the component.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationinsights.*;
 * ComponentMonitoringSettingProperty componentMonitoringSettingProperty =
 * ComponentMonitoringSettingProperty.builder()
 * .componentConfigurationMode("componentConfigurationMode")
 * .tier("tier")
 * // the properties below are optional
 * .componentArn("componentArn")
 * .componentName("componentName")
 * .customComponentConfiguration(ComponentConfigurationProperty.builder()
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
 * .build())
 * .defaultOverwriteComponentConfiguration(ComponentConfigurationProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-componentmonitoringsetting.html)
 */
@CdkDslMarker
public class CfnApplicationComponentMonitoringSettingPropertyDsl {
    private val cdkBuilder: CfnApplication.ComponentMonitoringSettingProperty.Builder =
        CfnApplication.ComponentMonitoringSettingProperty.builder()

    /** @param componentArn The ARN of the component. */
    public fun componentArn(componentArn: String) {
        cdkBuilder.componentArn(componentArn)
    }

    /**
     * @param componentConfigurationMode Component monitoring can be configured in one of the
     *   following three modes:.
     * * `DEFAULT` : The component will be configured with the recommended default monitoring
     *   settings of the selected `Tier` .
     * * `CUSTOM` : The component will be configured with the customized monitoring settings that
     *   are specified in `CustomComponentConfiguration` . If used, `CustomComponentConfiguration`
     *   must be provided.
     * * `DEFAULT_WITH_OVERWRITE` : The component will be configured with the recommended default
     *   monitoring settings of the selected `Tier` , and merged with customized overwrite settings
     *   that are specified in `DefaultOverwriteComponentConfiguration` . If used,
     *   `DefaultOverwriteComponentConfiguration` must be provided.
     */
    public fun componentConfigurationMode(componentConfigurationMode: String) {
        cdkBuilder.componentConfigurationMode(componentConfigurationMode)
    }

    /** @param componentName The name of the component. */
    public fun componentName(componentName: String) {
        cdkBuilder.componentName(componentName)
    }

    /**
     * @param customComponentConfiguration Customized monitoring settings. Required if CUSTOM mode
     *   is configured in `ComponentConfigurationMode` .
     */
    public fun customComponentConfiguration(customComponentConfiguration: IResolvable) {
        cdkBuilder.customComponentConfiguration(customComponentConfiguration)
    }

    /**
     * @param customComponentConfiguration Customized monitoring settings. Required if CUSTOM mode
     *   is configured in `ComponentConfigurationMode` .
     */
    public fun customComponentConfiguration(
        customComponentConfiguration: CfnApplication.ComponentConfigurationProperty
    ) {
        cdkBuilder.customComponentConfiguration(customComponentConfiguration)
    }

    /**
     * @param defaultOverwriteComponentConfiguration Customized overwrite monitoring settings.
     *   Required if CUSTOM mode is configured in `ComponentConfigurationMode` .
     */
    public fun defaultOverwriteComponentConfiguration(
        defaultOverwriteComponentConfiguration: IResolvable
    ) {
        cdkBuilder.defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration)
    }

    /**
     * @param defaultOverwriteComponentConfiguration Customized overwrite monitoring settings.
     *   Required if CUSTOM mode is configured in `ComponentConfigurationMode` .
     */
    public fun defaultOverwriteComponentConfiguration(
        defaultOverwriteComponentConfiguration: CfnApplication.ComponentConfigurationProperty
    ) {
        cdkBuilder.defaultOverwriteComponentConfiguration(defaultOverwriteComponentConfiguration)
    }

    /**
     * @param tier The tier of the application component. Supported tiers include `DOT_NET_CORE` ,
     *   `DOT_NET_WORKER` , `DOT_NET_WEB` , `SQL_SERVER` , `SQL_SERVER_ALWAYSON_AVAILABILITY_GROUP`
     *   , `SQL_SERVER_FAILOVER_CLUSTER_INSTANCE` , `MYSQL` , `POSTGRESQL` , `JAVA_JMX` , `ORACLE` ,
     *   `SAP_HANA_MULTI_NODE` , `SAP_HANA_SINGLE_NODE` , `SAP_HANA_HIGH_AVAILABILITY` ,
     *   `SHAREPOINT` . `ACTIVE_DIRECTORY` , and `DEFAULT` .
     */
    public fun tier(tier: String) {
        cdkBuilder.tier(tier)
    }

    public fun build(): CfnApplication.ComponentMonitoringSettingProperty = cdkBuilder.build()
}

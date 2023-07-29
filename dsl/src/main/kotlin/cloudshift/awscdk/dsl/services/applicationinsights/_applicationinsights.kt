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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.applicationinsights.CfnApplication
import software.amazon.awscdk.services.applicationinsights.CfnApplicationProps
import software.constructs.Construct

public object applicationinsights {
    /**
     * The `AWS::ApplicationInsights::Application` resource adds an application that is created from
     * a resource group.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationinsights.*;
     * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
     * .resourceGroupName("resourceGroupName")
     * // the properties below are optional
     * .autoConfigurationEnabled(false)
     * .componentMonitoringSettings(List.of(ComponentMonitoringSettingProperty.builder()
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
     * .build()))
     * .customComponents(List.of(CustomComponentProperty.builder()
     * .componentName("componentName")
     * .resourceList(List.of("resourceList"))
     * .build()))
     * .cweMonitorEnabled(false)
     * .groupingType("groupingType")
     * .logPatternSets(List.of(LogPatternSetProperty.builder()
     * .logPatterns(List.of(LogPatternProperty.builder()
     * .pattern("pattern")
     * .patternName("patternName")
     * .rank(123)
     * .build()))
     * .patternSetName("patternSetName")
     * .build()))
     * .opsCenterEnabled(false)
     * .opsItemSnsTopicArn("opsItemSnsTopicArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html)
     */
    public inline fun cfnApplication(
        scope: Construct,
        id: String,
        block: CfnApplicationDsl.() -> Unit = {},
    ): CfnApplication {
        val builder = CfnApplicationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApplicationInsights::Application AlarmMetric` property type defines a metric to
     * monitor for the component.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationinsights.*;
     * AlarmMetricProperty alarmMetricProperty = AlarmMetricProperty.builder()
     * .alarmMetricName("alarmMetricName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-alarmmetric.html)
     */
    public inline fun cfnApplicationAlarmMetricProperty(
        block: CfnApplicationAlarmMetricPropertyDsl.() -> Unit = {}
    ): CfnApplication.AlarmMetricProperty {
        val builder = CfnApplicationAlarmMetricPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApplicationInsights::Application Alarm` property type defines a CloudWatch alarm to
     * be monitored for the component.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationinsights.*;
     * AlarmProperty alarmProperty = AlarmProperty.builder()
     * .alarmName("alarmName")
     * // the properties below are optional
     * .severity("severity")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-alarm.html)
     */
    public inline fun cfnApplicationAlarmProperty(
        block: CfnApplicationAlarmPropertyDsl.() -> Unit = {}
    ): CfnApplication.AlarmProperty {
        val builder = CfnApplicationAlarmPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnApplicationComponentConfigurationProperty(
        block: CfnApplicationComponentConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.ComponentConfigurationProperty {
        val builder = CfnApplicationComponentConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApplicationInsights::Application ComponentMonitoringSetting` property type defines
     * the monitoring setting of the component.
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
    public inline fun cfnApplicationComponentMonitoringSettingProperty(
        block: CfnApplicationComponentMonitoringSettingPropertyDsl.() -> Unit = {}
    ): CfnApplication.ComponentMonitoringSettingProperty {
        val builder = CfnApplicationComponentMonitoringSettingPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApplicationInsights::Application ConfigurationDetails` property type specifies the
     * configuration settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationinsights.*;
     * ConfigurationDetailsProperty configurationDetailsProperty =
     * ConfigurationDetailsProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-configurationdetails.html)
     */
    public inline fun cfnApplicationConfigurationDetailsProperty(
        block: CfnApplicationConfigurationDetailsPropertyDsl.() -> Unit = {}
    ): CfnApplication.ConfigurationDetailsProperty {
        val builder = CfnApplicationConfigurationDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApplicationInsights::Application CustomComponent` property type describes a custom
     * component by grouping similar standalone instances to monitor.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationinsights.*;
     * CustomComponentProperty customComponentProperty = CustomComponentProperty.builder()
     * .componentName("componentName")
     * .resourceList(List.of("resourceList"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-customcomponent.html)
     */
    public inline fun cfnApplicationCustomComponentProperty(
        block: CfnApplicationCustomComponentPropertyDsl.() -> Unit = {}
    ): CfnApplication.CustomComponentProperty {
        val builder = CfnApplicationCustomComponentPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApplicationInsights::Application HAClusterPrometheusExporter` property type defines
     * the HA cluster Prometheus Exporter settings.
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
    public inline fun cfnApplicationHAClusterPrometheusExporterProperty(
        block: CfnApplicationHAClusterPrometheusExporterPropertyDsl.() -> Unit = {}
    ): CfnApplication.HAClusterPrometheusExporterProperty {
        val builder = CfnApplicationHAClusterPrometheusExporterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApplicationInsights::Application HANAPrometheusExporter` property type defines the
     * HANA DB Prometheus Exporter settings.
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
    public inline fun cfnApplicationHANAPrometheusExporterProperty(
        block: CfnApplicationHANAPrometheusExporterPropertyDsl.() -> Unit = {}
    ): CfnApplication.HANAPrometheusExporterProperty {
        val builder = CfnApplicationHANAPrometheusExporterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnApplicationJMXPrometheusExporterProperty(
        block: CfnApplicationJMXPrometheusExporterPropertyDsl.() -> Unit = {}
    ): CfnApplication.JMXPrometheusExporterProperty {
        val builder = CfnApplicationJMXPrometheusExporterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApplicationInsights::Application LogPattern` property type specifies an object that
     * defines the log patterns that belong to a `LogPatternSet` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationinsights.*;
     * LogPatternProperty logPatternProperty = LogPatternProperty.builder()
     * .pattern("pattern")
     * .patternName("patternName")
     * .rank(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-logpattern.html)
     */
    public inline fun cfnApplicationLogPatternProperty(
        block: CfnApplicationLogPatternPropertyDsl.() -> Unit = {}
    ): CfnApplication.LogPatternProperty {
        val builder = CfnApplicationLogPatternPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApplicationInsights::Application LogPatternSet` property type specifies the log
     * pattern set.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationinsights.*;
     * LogPatternSetProperty logPatternSetProperty = LogPatternSetProperty.builder()
     * .logPatterns(List.of(LogPatternProperty.builder()
     * .pattern("pattern")
     * .patternName("patternName")
     * .rank(123)
     * .build()))
     * .patternSetName("patternSetName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-logpatternset.html)
     */
    public inline fun cfnApplicationLogPatternSetProperty(
        block: CfnApplicationLogPatternSetPropertyDsl.() -> Unit = {}
    ): CfnApplication.LogPatternSetProperty {
        val builder = CfnApplicationLogPatternSetPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApplicationInsights::Application Log` property type specifies a log to monitor for
     * the component.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationinsights.*;
     * LogProperty logProperty = LogProperty.builder()
     * .logType("logType")
     * // the properties below are optional
     * .encoding("encoding")
     * .logGroupName("logGroupName")
     * .logPath("logPath")
     * .patternSet("patternSet")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-log.html)
     */
    public inline fun cfnApplicationLogProperty(
        block: CfnApplicationLogPropertyDsl.() -> Unit = {}
    ): CfnApplication.LogProperty {
        val builder = CfnApplicationLogPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnApplication`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationinsights.*;
     * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
     * .resourceGroupName("resourceGroupName")
     * // the properties below are optional
     * .autoConfigurationEnabled(false)
     * .componentMonitoringSettings(List.of(ComponentMonitoringSettingProperty.builder()
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
     * .build()))
     * .customComponents(List.of(CustomComponentProperty.builder()
     * .componentName("componentName")
     * .resourceList(List.of("resourceList"))
     * .build()))
     * .cweMonitorEnabled(false)
     * .groupingType("groupingType")
     * .logPatternSets(List.of(LogPatternSetProperty.builder()
     * .logPatterns(List.of(LogPatternProperty.builder()
     * .pattern("pattern")
     * .patternName("patternName")
     * .rank(123)
     * .build()))
     * .patternSetName("patternSetName")
     * .build()))
     * .opsCenterEnabled(false)
     * .opsItemSnsTopicArn("opsItemSnsTopicArn")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-applicationinsights-application.html)
     */
    public inline fun cfnApplicationProps(
        block: CfnApplicationPropsDsl.() -> Unit = {}
    ): CfnApplicationProps {
        val builder = CfnApplicationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApplicationInsights::Application SubComponentConfigurationDetails` property type
     * specifies the configuration settings of the sub-components.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationinsights.*;
     * SubComponentConfigurationDetailsProperty subComponentConfigurationDetailsProperty =
     * SubComponentConfigurationDetailsProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-subcomponentconfigurationdetails.html)
     */
    public inline fun cfnApplicationSubComponentConfigurationDetailsProperty(
        block: CfnApplicationSubComponentConfigurationDetailsPropertyDsl.() -> Unit = {}
    ): CfnApplication.SubComponentConfigurationDetailsProperty {
        val builder = CfnApplicationSubComponentConfigurationDetailsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApplicationInsights::Application SubComponentTypeConfiguration` property type
     * specifies the sub-component configurations for a component.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationinsights.*;
     * SubComponentTypeConfigurationProperty subComponentTypeConfigurationProperty =
     * SubComponentTypeConfigurationProperty.builder()
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
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-subcomponenttypeconfiguration.html)
     */
    public inline fun cfnApplicationSubComponentTypeConfigurationProperty(
        block: CfnApplicationSubComponentTypeConfigurationPropertyDsl.() -> Unit = {}
    ): CfnApplication.SubComponentTypeConfigurationProperty {
        val builder = CfnApplicationSubComponentTypeConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::ApplicationInsights::Application WindowsEvent` property type specifies a Windows
     * Event to monitor for the component.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.applicationinsights.*;
     * WindowsEventProperty windowsEventProperty = WindowsEventProperty.builder()
     * .eventLevels(List.of("eventLevels"))
     * .eventName("eventName")
     * .logGroupName("logGroupName")
     * // the properties below are optional
     * .patternSet("patternSet")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationinsights-application-windowsevent.html)
     */
    public inline fun cfnApplicationWindowsEventProperty(
        block: CfnApplicationWindowsEventPropertyDsl.() -> Unit = {}
    ): CfnApplication.WindowsEventProperty {
        val builder = CfnApplicationWindowsEventPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}

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

package io.cloudshiftdev.awscdkdsl.services.rum

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rum.CfnAppMonitor
import software.amazon.awscdk.services.rum.CfnAppMonitorProps
import software.constructs.Construct

public object rum {
    /**
     * Creates a CloudWatch RUM app monitor, which you can use to collect telemetry data from your
     * application and send it to CloudWatch RUM.
     *
     * The data includes performance and reliability information such as page load time, client-side
     * errors, and user behavior.
     *
     * After you create an app monitor, sign in to the CloudWatch RUM console to get the JavaScript
     * code snippet to add to your web application. For more information, see
     * [How do I find a code snippet that I've already generated?](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-find-code-snippet.html)
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rum.*;
     * CfnAppMonitor cfnAppMonitor = CfnAppMonitor.Builder.create(this, "MyCfnAppMonitor")
     * .domain("domain")
     * .name("name")
     * // the properties below are optional
     * .appMonitorConfiguration(AppMonitorConfigurationProperty.builder()
     * .allowCookies(false)
     * .enableXRay(false)
     * .excludedPages(List.of("excludedPages"))
     * .favoritePages(List.of("favoritePages"))
     * .guestRoleArn("guestRoleArn")
     * .identityPoolId("identityPoolId")
     * .includedPages(List.of("includedPages"))
     * .metricDestinations(List.of(MetricDestinationProperty.builder()
     * .destination("destination")
     * // the properties below are optional
     * .destinationArn("destinationArn")
     * .iamRoleArn("iamRoleArn")
     * .metricDefinitions(List.of(MetricDefinitionProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .dimensionKeys(Map.of(
     * "dimensionKeysKey", "dimensionKeys"))
     * .eventPattern("eventPattern")
     * .namespace("namespace")
     * .unitLabel("unitLabel")
     * .valueKey("valueKey")
     * .build()))
     * .build()))
     * .sessionSampleRate(123)
     * .telemetries(List.of("telemetries"))
     * .build())
     * .customEvents(CustomEventsProperty.builder()
     * .status("status")
     * .build())
     * .cwLogEnabled(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html)
     */
    public inline fun cfnAppMonitor(
        scope: Construct,
        id: String,
        block: CfnAppMonitorDsl.() -> Unit = {},
    ): CfnAppMonitor {
        val builder = CfnAppMonitorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure contains much of the configuration data for the app monitor.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rum.*;
     * AppMonitorConfigurationProperty appMonitorConfigurationProperty =
     * AppMonitorConfigurationProperty.builder()
     * .allowCookies(false)
     * .enableXRay(false)
     * .excludedPages(List.of("excludedPages"))
     * .favoritePages(List.of("favoritePages"))
     * .guestRoleArn("guestRoleArn")
     * .identityPoolId("identityPoolId")
     * .includedPages(List.of("includedPages"))
     * .metricDestinations(List.of(MetricDestinationProperty.builder()
     * .destination("destination")
     * // the properties below are optional
     * .destinationArn("destinationArn")
     * .iamRoleArn("iamRoleArn")
     * .metricDefinitions(List.of(MetricDefinitionProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .dimensionKeys(Map.of(
     * "dimensionKeysKey", "dimensionKeys"))
     * .eventPattern("eventPattern")
     * .namespace("namespace")
     * .unitLabel("unitLabel")
     * .valueKey("valueKey")
     * .build()))
     * .build()))
     * .sessionSampleRate(123)
     * .telemetries(List.of("telemetries"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-appmonitorconfiguration.html)
     */
    public inline fun cfnAppMonitorAppMonitorConfigurationProperty(
        block: CfnAppMonitorAppMonitorConfigurationPropertyDsl.() -> Unit = {}
    ): CfnAppMonitor.AppMonitorConfigurationProperty {
        val builder = CfnAppMonitorAppMonitorConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure specifies whether this app monitor allows the web client to define and send
     * custom events.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rum.*;
     * CustomEventsProperty customEventsProperty = CustomEventsProperty.builder()
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-customevents.html)
     */
    public inline fun cfnAppMonitorCustomEventsProperty(
        block: CfnAppMonitorCustomEventsPropertyDsl.() -> Unit = {}
    ): CfnAppMonitor.CustomEventsProperty {
        val builder = CfnAppMonitorCustomEventsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies one custom metric or extended metric that you want the CloudWatch RUM app monitor
     * to send to a destination.
     *
     * Valid destinations include CloudWatch and Evidently.
     *
     * By default, RUM app monitors send some metrics to CloudWatch . These default metrics are
     * listed in
     * [CloudWatch metrics that you can collect.](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-metrics.html)
     *
     * In addition to these default metrics, you can choose to send extended metrics or custom
     * metrics or both.
     * * Extended metrics enable you to send metrics with additional dimensions not included in the
     *   default metrics. You can also send extended metrics to Evidently as well as CloudWatch .
     *   The valid dimension names for the additional dimensions for extended metrics are
     *   `BrowserName` , `CountryCode` , `DeviceType` , `FileType` , `OSName` , and `PageId` . For
     *   more information, see
     *   [Extended metrics](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-vended-metrics.html)
     *   .
     * * Custom metrics are metrics that you define. You can send custom metrics to CloudWatch or to
     *   CloudWatch Evidently or to both. With custom metrics, you can use any metric name and
     *   namespace, and to derive the metrics you can use any custom events, built-in events, custom
     *   attributes, or default attributes.
     *
     * You can't send custom metrics to the `AWS/RUM` namespace. You must send custom metrics to a
     * custom namespace that you define. The namespace that you use can't start with `AWS/` .
     * CloudWatch RUM prepends `RUM/CustomMetrics/` to the custom namespace that you define, so the
     * final namespace for your metrics in CloudWatch is `RUM/CustomMetrics/
     * *your-custom-namespace*` .
     *
     * For information about syntax rules for specifying custom metrics and extended metrics, see
     * [MetridDefinitionRequest](https://docs.aws.amazon.com/cloudwatchrum/latest/APIReference/API_MetricDefinitionRequest.html)
     * in the *CloudWatch RUM API Reference* .
     *
     * The maximum number of metric definitions that one destination can contain is 2000.
     *
     * Extended metrics sent to CloudWatch and RUM custom metrics are charged as CloudWatch custom
     * metrics. Each combination of additional dimension name and dimension value counts as a custom
     * metric.
     *
     * If some metric definitions that you specify are not valid, then the operation will not modify
     * any metric definitions even if other metric definitions specified are valid.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rum.*;
     * MetricDefinitionProperty metricDefinitionProperty = MetricDefinitionProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .dimensionKeys(Map.of(
     * "dimensionKeysKey", "dimensionKeys"))
     * .eventPattern("eventPattern")
     * .namespace("namespace")
     * .unitLabel("unitLabel")
     * .valueKey("valueKey")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdefinition.html)
     */
    public inline fun cfnAppMonitorMetricDefinitionProperty(
        block: CfnAppMonitorMetricDefinitionPropertyDsl.() -> Unit = {}
    ): CfnAppMonitor.MetricDefinitionProperty {
        val builder = CfnAppMonitorMetricDefinitionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates or updates a destination to receive extended metrics from CloudWatch RUM.
     *
     * You can send extended metrics to CloudWatch or to a CloudWatch Evidently experiment.
     *
     * For more information about extended metrics, see
     * [Extended metrics that you can send to CloudWatch and CloudWatch Evidently](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-RUM-vended-metrics.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rum.*;
     * MetricDestinationProperty metricDestinationProperty = MetricDestinationProperty.builder()
     * .destination("destination")
     * // the properties below are optional
     * .destinationArn("destinationArn")
     * .iamRoleArn("iamRoleArn")
     * .metricDefinitions(List.of(MetricDefinitionProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .dimensionKeys(Map.of(
     * "dimensionKeysKey", "dimensionKeys"))
     * .eventPattern("eventPattern")
     * .namespace("namespace")
     * .unitLabel("unitLabel")
     * .valueKey("valueKey")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rum-appmonitor-metricdestination.html)
     */
    public inline fun cfnAppMonitorMetricDestinationProperty(
        block: CfnAppMonitorMetricDestinationPropertyDsl.() -> Unit = {}
    ): CfnAppMonitor.MetricDestinationProperty {
        val builder = CfnAppMonitorMetricDestinationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAppMonitor`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.rum.*;
     * CfnAppMonitorProps cfnAppMonitorProps = CfnAppMonitorProps.builder()
     * .domain("domain")
     * .name("name")
     * // the properties below are optional
     * .appMonitorConfiguration(AppMonitorConfigurationProperty.builder()
     * .allowCookies(false)
     * .enableXRay(false)
     * .excludedPages(List.of("excludedPages"))
     * .favoritePages(List.of("favoritePages"))
     * .guestRoleArn("guestRoleArn")
     * .identityPoolId("identityPoolId")
     * .includedPages(List.of("includedPages"))
     * .metricDestinations(List.of(MetricDestinationProperty.builder()
     * .destination("destination")
     * // the properties below are optional
     * .destinationArn("destinationArn")
     * .iamRoleArn("iamRoleArn")
     * .metricDefinitions(List.of(MetricDefinitionProperty.builder()
     * .name("name")
     * // the properties below are optional
     * .dimensionKeys(Map.of(
     * "dimensionKeysKey", "dimensionKeys"))
     * .eventPattern("eventPattern")
     * .namespace("namespace")
     * .unitLabel("unitLabel")
     * .valueKey("valueKey")
     * .build()))
     * .build()))
     * .sessionSampleRate(123)
     * .telemetries(List.of("telemetries"))
     * .build())
     * .customEvents(CustomEventsProperty.builder()
     * .status("status")
     * .build())
     * .cwLogEnabled(false)
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rum-appmonitor.html)
     */
    public inline fun cfnAppMonitorProps(
        block: CfnAppMonitorPropsDsl.() -> Unit = {}
    ): CfnAppMonitorProps {
        val builder = CfnAppMonitorPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}

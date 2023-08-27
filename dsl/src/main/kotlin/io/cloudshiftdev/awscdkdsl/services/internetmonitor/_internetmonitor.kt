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

package io.cloudshiftdev.awscdkdsl.services.internetmonitor

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.internetmonitor.CfnMonitor
import software.amazon.awscdk.services.internetmonitor.CfnMonitorProps
import software.constructs.Construct

public object internetmonitor {
    /**
     * The `AWS::InternetMonitor::Monitor` resource is an Internet Monitor resource type that
     * contains information about how you create a monitor in Amazon CloudWatch Internet Monitor.
     *
     * A monitor in Internet Monitor provides visibility into performance and availability between
     * your applications hosted on AWS and your end users, using a traffic profile that it creates
     * based on the application resources that you add: Virtual Private Clouds (VPCs), Amazon
     * CloudFront distributions, or WorkSpaces directories.
     *
     * Internet Monitor also alerts you to internet issues that impact your application in the
     * city-networks (geographies and networks) where your end users use it. With Internet Monitor,
     * you can quickly pinpoint the locations and providers that are affected, so that you can
     * address the issue.
     *
     * For more information, see
     * [Using Amazon CloudWatch Internet Monitor](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-InternetMonitor.html)
     * in the *Amazon CloudWatch User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.internetmonitor.*;
     * CfnMonitor cfnMonitor = CfnMonitor.Builder.create(this, "MyCfnMonitor")
     * .monitorName("monitorName")
     * // the properties below are optional
     * .healthEventsConfig(HealthEventsConfigProperty.builder()
     * .availabilityLocalHealthEventsConfig(LocalHealthEventsConfigProperty.builder()
     * .healthScoreThreshold(123)
     * .minTrafficImpact(123)
     * .status("status")
     * .build())
     * .availabilityScoreThreshold(123)
     * .performanceLocalHealthEventsConfig(LocalHealthEventsConfigProperty.builder()
     * .healthScoreThreshold(123)
     * .minTrafficImpact(123)
     * .status("status")
     * .build())
     * .performanceScoreThreshold(123)
     * .build())
     * .internetMeasurementsLogDelivery(InternetMeasurementsLogDeliveryProperty.builder()
     * .s3Config(S3ConfigProperty.builder()
     * .bucketName("bucketName")
     * .bucketPrefix("bucketPrefix")
     * .logDeliveryStatus("logDeliveryStatus")
     * .build())
     * .build())
     * .maxCityNetworksToMonitor(123)
     * .resources(List.of("resources"))
     * .resourcesToAdd(List.of("resourcesToAdd"))
     * .resourcesToRemove(List.of("resourcesToRemove"))
     * .status("status")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .trafficPercentageToMonitor(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html)
     */
    public inline fun cfnMonitor(
        scope: Construct,
        id: String,
        block: CfnMonitorDsl.() -> Unit = {},
    ): CfnMonitor {
        val builder = CfnMonitorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Define the health event threshold percentages for the performance score and availability
     * score for your application's monitor.
     *
     * Amazon CloudWatch Internet Monitor creates a health event when there's an internet issue that
     * affects your application end users where a health score percentage is at or below a set
     * threshold.
     *
     * If you don't set a health event threshold, the default value is 95%.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.internetmonitor.*;
     * HealthEventsConfigProperty healthEventsConfigProperty = HealthEventsConfigProperty.builder()
     * .availabilityLocalHealthEventsConfig(LocalHealthEventsConfigProperty.builder()
     * .healthScoreThreshold(123)
     * .minTrafficImpact(123)
     * .status("status")
     * .build())
     * .availabilityScoreThreshold(123)
     * .performanceLocalHealthEventsConfig(LocalHealthEventsConfigProperty.builder()
     * .healthScoreThreshold(123)
     * .minTrafficImpact(123)
     * .status("status")
     * .build())
     * .performanceScoreThreshold(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-healtheventsconfig.html)
     */
    public inline fun cfnMonitorHealthEventsConfigProperty(
        block: CfnMonitorHealthEventsConfigPropertyDsl.() -> Unit = {}
    ): CfnMonitor.HealthEventsConfigProperty {
        val builder = CfnMonitorHealthEventsConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Publish internet measurements to an Amazon S3 bucket in addition to CloudWatch Logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.internetmonitor.*;
     * InternetMeasurementsLogDeliveryProperty internetMeasurementsLogDeliveryProperty =
     * InternetMeasurementsLogDeliveryProperty.builder()
     * .s3Config(S3ConfigProperty.builder()
     * .bucketName("bucketName")
     * .bucketPrefix("bucketPrefix")
     * .logDeliveryStatus("logDeliveryStatus")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-internetmeasurementslogdelivery.html)
     */
    public inline fun cfnMonitorInternetMeasurementsLogDeliveryProperty(
        block: CfnMonitorInternetMeasurementsLogDeliveryPropertyDsl.() -> Unit = {}
    ): CfnMonitor.InternetMeasurementsLogDeliveryProperty {
        val builder = CfnMonitorInternetMeasurementsLogDeliveryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configuration information that determines the threshold and other conditions for when
     * Internet Monitor creates a health event for a local performance or availability issue, when
     * scores cross a threshold for one or more city-networks.
     *
     * Defines the percentages, for performance scores or availability scores, that are the local
     * thresholds for when Amazon CloudWatch Internet Monitor creates a health event. Also defines
     * whether a local threshold is enabled or disabled, and the minimum percentage of overall
     * traffic that must be impacted by an issue before Internet Monitor creates an event when a
     * threshold is crossed for a local health score.
     *
     * If you don't set a local health event threshold, the default value is 60%.
     *
     * For more information, see
     * [Change health event thresholds](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-overview.html#IMUpdateThresholdFromOverview)
     * in the Internet Monitor section of the *Amazon CloudWatch User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.internetmonitor.*;
     * LocalHealthEventsConfigProperty localHealthEventsConfigProperty =
     * LocalHealthEventsConfigProperty.builder()
     * .healthScoreThreshold(123)
     * .minTrafficImpact(123)
     * .status("status")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-localhealtheventsconfig.html)
     */
    public inline fun cfnMonitorLocalHealthEventsConfigProperty(
        block: CfnMonitorLocalHealthEventsConfigPropertyDsl.() -> Unit = {}
    ): CfnMonitor.LocalHealthEventsConfigProperty {
        val builder = CfnMonitorLocalHealthEventsConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnMonitor`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.internetmonitor.*;
     * CfnMonitorProps cfnMonitorProps = CfnMonitorProps.builder()
     * .monitorName("monitorName")
     * // the properties below are optional
     * .healthEventsConfig(HealthEventsConfigProperty.builder()
     * .availabilityLocalHealthEventsConfig(LocalHealthEventsConfigProperty.builder()
     * .healthScoreThreshold(123)
     * .minTrafficImpact(123)
     * .status("status")
     * .build())
     * .availabilityScoreThreshold(123)
     * .performanceLocalHealthEventsConfig(LocalHealthEventsConfigProperty.builder()
     * .healthScoreThreshold(123)
     * .minTrafficImpact(123)
     * .status("status")
     * .build())
     * .performanceScoreThreshold(123)
     * .build())
     * .internetMeasurementsLogDelivery(InternetMeasurementsLogDeliveryProperty.builder()
     * .s3Config(S3ConfigProperty.builder()
     * .bucketName("bucketName")
     * .bucketPrefix("bucketPrefix")
     * .logDeliveryStatus("logDeliveryStatus")
     * .build())
     * .build())
     * .maxCityNetworksToMonitor(123)
     * .resources(List.of("resources"))
     * .resourcesToAdd(List.of("resourcesToAdd"))
     * .resourcesToRemove(List.of("resourcesToRemove"))
     * .status("status")
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .trafficPercentageToMonitor(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-internetmonitor-monitor.html)
     */
    public inline fun cfnMonitorProps(block: CfnMonitorPropsDsl.() -> Unit = {}): CfnMonitorProps {
        val builder = CfnMonitorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for publishing Amazon CloudWatch Internet Monitor internet measurements to
     * Amazon S3.
     *
     * The configuration includes the bucket name and (optionally) bucket prefix for the S3 bucket
     * to store the measurements, and the delivery status. The delivery status is `ENABLED` if you
     * choose to deliver internet measurements to S3 logs, and `DISABLED` otherwise.
     *
     * The measurements are also published to Amazon CloudWatch Logs.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.internetmonitor.*;
     * S3ConfigProperty s3ConfigProperty = S3ConfigProperty.builder()
     * .bucketName("bucketName")
     * .bucketPrefix("bucketPrefix")
     * .logDeliveryStatus("logDeliveryStatus")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-internetmonitor-monitor-s3config.html)
     */
    public inline fun cfnMonitorS3ConfigProperty(
        block: CfnMonitorS3ConfigPropertyDsl.() -> Unit = {}
    ): CfnMonitor.S3ConfigProperty {
        val builder = CfnMonitorS3ConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}

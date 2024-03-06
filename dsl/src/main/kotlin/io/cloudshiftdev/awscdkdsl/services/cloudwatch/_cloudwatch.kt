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

package io.cloudshiftdev.awscdkdsl.services.cloudwatch

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Alarm
import software.amazon.awscdk.services.cloudwatch.AlarmActionConfig
import software.amazon.awscdk.services.cloudwatch.AlarmProps
import software.amazon.awscdk.services.cloudwatch.AlarmStatusWidget
import software.amazon.awscdk.services.cloudwatch.AlarmStatusWidgetProps
import software.amazon.awscdk.services.cloudwatch.AlarmWidget
import software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps
import software.amazon.awscdk.services.cloudwatch.CfnAlarm
import software.amazon.awscdk.services.cloudwatch.CfnAlarmProps
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetectorProps
import software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarm
import software.amazon.awscdk.services.cloudwatch.CfnCompositeAlarmProps
import software.amazon.awscdk.services.cloudwatch.CfnDashboard
import software.amazon.awscdk.services.cloudwatch.CfnDashboardProps
import software.amazon.awscdk.services.cloudwatch.CfnInsightRule
import software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps
import software.amazon.awscdk.services.cloudwatch.CfnMetricStream
import software.amazon.awscdk.services.cloudwatch.CfnMetricStreamProps
import software.amazon.awscdk.services.cloudwatch.CommonMetricOptions
import software.amazon.awscdk.services.cloudwatch.CompositeAlarm
import software.amazon.awscdk.services.cloudwatch.CompositeAlarmProps
import software.amazon.awscdk.services.cloudwatch.CreateAlarmOptions
import software.amazon.awscdk.services.cloudwatch.CustomWidget
import software.amazon.awscdk.services.cloudwatch.CustomWidgetProps
import software.amazon.awscdk.services.cloudwatch.Dashboard
import software.amazon.awscdk.services.cloudwatch.DashboardProps
import software.amazon.awscdk.services.cloudwatch.DashboardVariable
import software.amazon.awscdk.services.cloudwatch.DashboardVariableOptions
import software.amazon.awscdk.services.cloudwatch.Dimension
import software.amazon.awscdk.services.cloudwatch.GaugeWidget
import software.amazon.awscdk.services.cloudwatch.GaugeWidgetProps
import software.amazon.awscdk.services.cloudwatch.GraphWidget
import software.amazon.awscdk.services.cloudwatch.GraphWidgetProps
import software.amazon.awscdk.services.cloudwatch.HorizontalAnnotation
import software.amazon.awscdk.services.cloudwatch.LogQueryWidget
import software.amazon.awscdk.services.cloudwatch.LogQueryWidgetProps
import software.amazon.awscdk.services.cloudwatch.MathExpression
import software.amazon.awscdk.services.cloudwatch.MathExpressionOptions
import software.amazon.awscdk.services.cloudwatch.MathExpressionProps
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.cloudwatch.MetricConfig
import software.amazon.awscdk.services.cloudwatch.MetricExpressionConfig
import software.amazon.awscdk.services.cloudwatch.MetricOptions
import software.amazon.awscdk.services.cloudwatch.MetricProps
import software.amazon.awscdk.services.cloudwatch.MetricStatConfig
import software.amazon.awscdk.services.cloudwatch.MetricWidgetProps
import software.amazon.awscdk.services.cloudwatch.SearchComponents
import software.amazon.awscdk.services.cloudwatch.SingleValueWidget
import software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps
import software.amazon.awscdk.services.cloudwatch.Spacer
import software.amazon.awscdk.services.cloudwatch.SpacerProps
import software.amazon.awscdk.services.cloudwatch.TableSummaryProps
import software.amazon.awscdk.services.cloudwatch.TableWidget
import software.amazon.awscdk.services.cloudwatch.TableWidgetProps
import software.amazon.awscdk.services.cloudwatch.TextWidget
import software.amazon.awscdk.services.cloudwatch.TextWidgetProps
import software.amazon.awscdk.services.cloudwatch.VariableValue
import software.amazon.awscdk.services.cloudwatch.VerticalAnnotation
import software.amazon.awscdk.services.cloudwatch.YAxisProps
import software.constructs.Construct

public object cloudwatch {
    /**
     * An alarm on a CloudWatch metric.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Alias alias;
     * // or add alarms to an existing group
     * Alias blueGreenAlias;
     * Alarm alarm = Alarm.Builder.create(this, "Errors")
     * .comparisonOperator(ComparisonOperator.GREATER_THAN_THRESHOLD)
     * .threshold(1)
     * .evaluationPeriods(1)
     * .metric(alias.metricErrors())
     * .build();
     * LambdaDeploymentGroup deploymentGroup = LambdaDeploymentGroup.Builder.create(this,
     * "BlueGreenDeployment")
     * .alias(alias)
     * .deploymentConfig(LambdaDeploymentConfig.LINEAR_10PERCENT_EVERY_1MINUTE)
     * .alarms(List.of(alarm))
     * .build();
     * deploymentGroup.addAlarm(Alarm.Builder.create(this, "BlueGreenErrors")
     * .comparisonOperator(ComparisonOperator.GREATER_THAN_THRESHOLD)
     * .threshold(1)
     * .evaluationPeriods(1)
     * .metric(blueGreenAlias.metricErrors())
     * .build());
     * ```
     */
    public inline fun alarm(
        scope: Construct,
        id: String,
        block: AlarmDsl.() -> Unit = {},
    ): Alarm {
        val builder = AlarmDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for an alarm action.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * AlarmActionConfig alarmActionConfig = AlarmActionConfig.builder()
     * .alarmActionArn("alarmActionArn")
     * .build();
     * ```
     */
    public inline fun alarmActionConfig(
        block: AlarmActionConfigDsl.() -> Unit = {}
    ): AlarmActionConfig {
        val builder = AlarmActionConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for Alarms.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Alias alias;
     * // or add alarms to an existing group
     * Alias blueGreenAlias;
     * Alarm alarm = Alarm.Builder.create(this, "Errors")
     * .comparisonOperator(ComparisonOperator.GREATER_THAN_THRESHOLD)
     * .threshold(1)
     * .evaluationPeriods(1)
     * .metric(alias.metricErrors())
     * .build();
     * LambdaDeploymentGroup deploymentGroup = LambdaDeploymentGroup.Builder.create(this,
     * "BlueGreenDeployment")
     * .alias(alias)
     * .deploymentConfig(LambdaDeploymentConfig.LINEAR_10PERCENT_EVERY_1MINUTE)
     * .alarms(List.of(alarm))
     * .build();
     * deploymentGroup.addAlarm(Alarm.Builder.create(this, "BlueGreenErrors")
     * .comparisonOperator(ComparisonOperator.GREATER_THAN_THRESHOLD)
     * .threshold(1)
     * .evaluationPeriods(1)
     * .metric(blueGreenAlias.metricErrors())
     * .build());
     * ```
     */
    public inline fun alarmProps(block: AlarmPropsDsl.() -> Unit = {}): AlarmProps {
        val builder = AlarmPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A dashboard widget that displays alarms in a grid view.
     *
     * Example:
     * ```
     * Dashboard dashboard;
     * Alarm errorAlarm;
     * dashboard.addWidgets(
     * AlarmStatusWidget.Builder.create()
     * .alarms(List.of(errorAlarm))
     * .build());
     * ```
     */
    public inline fun alarmStatusWidget(
        block: AlarmStatusWidgetDsl.() -> Unit = {}
    ): AlarmStatusWidget {
        val builder = AlarmStatusWidgetDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for an Alarm Status Widget.
     *
     * Example:
     * ```
     * Dashboard dashboard;
     * Alarm errorAlarm;
     * dashboard.addWidgets(
     * AlarmStatusWidget.Builder.create()
     * .alarms(List.of(errorAlarm))
     * .build());
     * ```
     */
    public inline fun alarmStatusWidgetProps(
        block: AlarmStatusWidgetPropsDsl.() -> Unit = {}
    ): AlarmStatusWidgetProps {
        val builder = AlarmStatusWidgetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Display the metric associated with an alarm, including the alarm line.
     *
     * Example:
     * ```
     * Dashboard dashboard;
     * Alarm errorAlarm;
     * dashboard.addWidgets(AlarmWidget.Builder.create()
     * .title("Errors")
     * .alarm(errorAlarm)
     * .build());
     * ```
     */
    public inline fun alarmWidget(block: AlarmWidgetDsl.() -> Unit = {}): AlarmWidget {
        val builder = AlarmWidgetDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for an AlarmWidget.
     *
     * Example:
     * ```
     * Dashboard dashboard;
     * Alarm errorAlarm;
     * dashboard.addWidgets(AlarmWidget.Builder.create()
     * .title("Errors")
     * .alarm(errorAlarm)
     * .build());
     * ```
     */
    public inline fun alarmWidgetProps(
        block: AlarmWidgetPropsDsl.() -> Unit = {}
    ): AlarmWidgetProps {
        val builder = AlarmWidgetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::CloudWatch::Alarm` type specifies an alarm and associates it with the specified
     * metric or metric math expression.
     *
     * When this operation creates an alarm, the alarm state is immediately set to
     * `INSUFFICIENT_DATA` . The alarm is then evaluated and its state is set appropriately. Any
     * actions associated with the new state are then executed.
     *
     * When you update an existing alarm, its state is left unchanged, but the update completely
     * overwrites the previous configuration of the alarm.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * CfnAlarm cfnAlarm = CfnAlarm.Builder.create(this, "MyCfnAlarm")
     * .comparisonOperator("comparisonOperator")
     * .evaluationPeriods(123)
     * // the properties below are optional
     * .actionsEnabled(false)
     * .alarmActions(List.of("alarmActions"))
     * .alarmDescription("alarmDescription")
     * .alarmName("alarmName")
     * .datapointsToAlarm(123)
     * .dimensions(List.of(DimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .evaluateLowSampleCountPercentile("evaluateLowSampleCountPercentile")
     * .extendedStatistic("extendedStatistic")
     * .insufficientDataActions(List.of("insufficientDataActions"))
     * .metricName("metricName")
     * .metrics(List.of(MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .accountId("accountId")
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .dimensions(List.of(DimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .metricName("metricName")
     * .namespace("namespace")
     * .build())
     * .period(123)
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .period(123)
     * .returnData(false)
     * .build()))
     * .namespace("namespace")
     * .okActions(List.of("okActions"))
     * .period(123)
     * .statistic("statistic")
     * .threshold(123)
     * .thresholdMetricId("thresholdMetricId")
     * .treatMissingData("treatMissingData")
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html)
     */
    public inline fun cfnAlarm(
        scope: Construct,
        id: String,
        block: CfnAlarmDsl.() -> Unit = {},
    ): CfnAlarm {
        val builder = CfnAlarmDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Dimension is an embedded property of the `AWS::CloudWatch::Alarm` type.
     *
     * Dimensions are name/value pairs that can be associated with a CloudWatch metric. You can
     * specify a maximum of 10 dimensions for a given metric.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * DimensionProperty dimensionProperty = DimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-dimension.html)
     */
    public inline fun cfnAlarmDimensionProperty(
        block: CfnAlarmDimensionPropertyDsl.() -> Unit = {}
    ): CfnAlarm.DimensionProperty {
        val builder = CfnAlarmDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `MetricDataQuery` property type specifies the metric data to return, and whether this
     * call is just retrieving a batch set of data for one metric, or is performing a math
     * expression on metric data.
     *
     * Any expression used must return a single time series. For more information, see
     * [Metric Math Syntax and Functions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax)
     * in the *Amazon CloudWatch User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * MetricDataQueryProperty metricDataQueryProperty = MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .accountId("accountId")
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .dimensions(List.of(DimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .metricName("metricName")
     * .namespace("namespace")
     * .build())
     * .period(123)
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .period(123)
     * .returnData(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html)
     */
    public inline fun cfnAlarmMetricDataQueryProperty(
        block: CfnAlarmMetricDataQueryPropertyDsl.() -> Unit = {}
    ): CfnAlarm.MetricDataQueryProperty {
        val builder = CfnAlarmMetricDataQueryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `Metric` property type represents a specific metric.
     *
     * `Metric` is a property of the
     * [MetricStat](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricstat.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * MetricProperty metricProperty = MetricProperty.builder()
     * .dimensions(List.of(DimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .metricName("metricName")
     * .namespace("namespace")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metric.html)
     */
    public inline fun cfnAlarmMetricProperty(
        block: CfnAlarmMetricPropertyDsl.() -> Unit = {}
    ): CfnAlarm.MetricProperty {
        val builder = CfnAlarmMetricPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure defines the metric to be returned, along with the statistics, period, and
     * units.
     *
     * `MetricStat` is a property of the
     * [MetricDataQuery](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricdataquery.html)
     * property type.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * MetricStatProperty metricStatProperty = MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .dimensions(List.of(DimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .metricName("metricName")
     * .namespace("namespace")
     * .build())
     * .period(123)
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-alarm-metricstat.html)
     */
    public inline fun cfnAlarmMetricStatProperty(
        block: CfnAlarmMetricStatPropertyDsl.() -> Unit = {}
    ): CfnAlarm.MetricStatProperty {
        val builder = CfnAlarmMetricStatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAlarm`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * CfnAlarmProps cfnAlarmProps = CfnAlarmProps.builder()
     * .comparisonOperator("comparisonOperator")
     * .evaluationPeriods(123)
     * // the properties below are optional
     * .actionsEnabled(false)
     * .alarmActions(List.of("alarmActions"))
     * .alarmDescription("alarmDescription")
     * .alarmName("alarmName")
     * .datapointsToAlarm(123)
     * .dimensions(List.of(DimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .evaluateLowSampleCountPercentile("evaluateLowSampleCountPercentile")
     * .extendedStatistic("extendedStatistic")
     * .insufficientDataActions(List.of("insufficientDataActions"))
     * .metricName("metricName")
     * .metrics(List.of(MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .accountId("accountId")
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .dimensions(List.of(DimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .metricName("metricName")
     * .namespace("namespace")
     * .build())
     * .period(123)
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .period(123)
     * .returnData(false)
     * .build()))
     * .namespace("namespace")
     * .okActions(List.of("okActions"))
     * .period(123)
     * .statistic("statistic")
     * .threshold(123)
     * .thresholdMetricId("thresholdMetricId")
     * .treatMissingData("treatMissingData")
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-alarm.html)
     */
    public inline fun cfnAlarmProps(block: CfnAlarmPropsDsl.() -> Unit = {}): CfnAlarmProps {
        val builder = CfnAlarmPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::CloudWatch::AnomalyDetector` type specifies an anomaly detection band for a certain
     * metric and statistic.
     *
     * The band represents the expected "normal" range for the metric values. Anomaly detection
     * bands can be used for visualization of a metric's expected values, and for alarms.
     *
     * For more information see
     * [Using CloudWatch anomaly detection.](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch_Anomaly_Detection.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * CfnAnomalyDetector cfnAnomalyDetector = CfnAnomalyDetector.Builder.create(this,
     * "MyCfnAnomalyDetector")
     * .configuration(ConfigurationProperty.builder()
     * .excludedTimeRanges(List.of(RangeProperty.builder()
     * .endTime("endTime")
     * .startTime("startTime")
     * .build()))
     * .metricTimeZone("metricTimeZone")
     * .build())
     * .dimensions(List.of(DimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .metricMathAnomalyDetector(MetricMathAnomalyDetectorProperty.builder()
     * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .accountId("accountId")
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(DimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .period(123)
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .period(123)
     * .returnData(false)
     * .build()))
     * .build())
     * .metricName("metricName")
     * .namespace("namespace")
     * .singleMetricAnomalyDetector(SingleMetricAnomalyDetectorProperty.builder()
     * .dimensions(List.of(DimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .metricName("metricName")
     * .namespace("namespace")
     * .stat("stat")
     * .build())
     * .stat("stat")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html)
     */
    public inline fun cfnAnomalyDetector(
        scope: Construct,
        id: String,
        block: CfnAnomalyDetectorDsl.() -> Unit = {},
    ): CfnAnomalyDetector {
        val builder = CfnAnomalyDetectorDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies details about how the anomaly detection model is to be trained, including time
     * ranges to exclude when training and updating the model.
     *
     * The configuration can also include the time zone to use for the metric.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * ConfigurationProperty configurationProperty = ConfigurationProperty.builder()
     * .excludedTimeRanges(List.of(RangeProperty.builder()
     * .endTime("endTime")
     * .startTime("startTime")
     * .build()))
     * .metricTimeZone("metricTimeZone")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-configuration.html)
     */
    public inline fun cfnAnomalyDetectorConfigurationProperty(
        block: CfnAnomalyDetectorConfigurationPropertyDsl.() -> Unit = {}
    ): CfnAnomalyDetector.ConfigurationProperty {
        val builder = CfnAnomalyDetectorConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A dimension is a name/value pair that is part of the identity of a metric.
     *
     * Because dimensions are part of the unique identifier for a metric, whenever you add a unique
     * name/value pair to one of your metrics, you are creating a new variation of that metric. For
     * example, many Amazon EC2 metrics publish `InstanceId` as a dimension name, and the actual
     * instance ID as the value for that dimension.
     *
     * You can assign up to 30 dimensions to a metric.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * DimensionProperty dimensionProperty = DimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-dimension.html)
     */
    public inline fun cfnAnomalyDetectorDimensionProperty(
        block: CfnAnomalyDetectorDimensionPropertyDsl.() -> Unit = {}
    ): CfnAnomalyDetector.DimensionProperty {
        val builder = CfnAnomalyDetectorDimensionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure is used in both `GetMetricData` and `PutMetricAlarm` .
     *
     * The supported use of this structure is different for those two operations.
     *
     * When used in `GetMetricData` , it indicates the metric data to return, and whether this call
     * is just retrieving a batch set of data for one metric, or is performing a Metrics Insights
     * query or a math expression. A single `GetMetricData` call can include up to 500
     * `MetricDataQuery` structures.
     *
     * When used in `PutMetricAlarm` , it enables you to create an alarm based on a metric math
     * expression. Each `MetricDataQuery` in the array specifies either a metric to retrieve, or a
     * math expression to be performed on retrieved metrics. A single `PutMetricAlarm` call can
     * include up to 20 `MetricDataQuery` structures in the array. The 20 structures can include as
     * many as 10 structures that contain a `MetricStat` parameter to retrieve a metric, and as many
     * as 10 structures that contain the `Expression` parameter to perform a math expression. Of
     * those `Expression` structures, one must have `true` as the value for `ReturnData` . The
     * result of this expression is the value the alarm watches.
     *
     * Any expression used in a `PutMetricAlarm` operation must return a single time series. For
     * more information, see
     * [Metric Math Syntax and Functions](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/using-metric-math.html#metric-math-syntax)
     * in the *Amazon CloudWatch User Guide* .
     *
     * Some of the parameters of this structure also have different uses whether you are using this
     * structure in a `GetMetricData` operation or a `PutMetricAlarm` operation. These differences
     * are explained in the following parameter list.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * MetricDataQueryProperty metricDataQueryProperty = MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .accountId("accountId")
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(DimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .period(123)
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .period(123)
     * .returnData(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricdataquery.html)
     */
    public inline fun cfnAnomalyDetectorMetricDataQueryProperty(
        block: CfnAnomalyDetectorMetricDataQueryPropertyDsl.() -> Unit = {}
    ): CfnAnomalyDetector.MetricDataQueryProperty {
        val builder = CfnAnomalyDetectorMetricDataQueryPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Indicates the CloudWatch math expression that provides the time series the anomaly detector
     * uses as input.
     *
     * The designated math expression must return a single time series.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * MetricMathAnomalyDetectorProperty metricMathAnomalyDetectorProperty =
     * MetricMathAnomalyDetectorProperty.builder()
     * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .accountId("accountId")
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(DimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .period(123)
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .period(123)
     * .returnData(false)
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricmathanomalydetector.html)
     */
    public inline fun cfnAnomalyDetectorMetricMathAnomalyDetectorProperty(
        block: CfnAnomalyDetectorMetricMathAnomalyDetectorPropertyDsl.() -> Unit = {}
    ): CfnAnomalyDetector.MetricMathAnomalyDetectorProperty {
        val builder = CfnAnomalyDetectorMetricMathAnomalyDetectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Represents a specific metric.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * MetricProperty metricProperty = MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(DimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metric.html)
     */
    public inline fun cfnAnomalyDetectorMetricProperty(
        block: CfnAnomalyDetectorMetricPropertyDsl.() -> Unit = {}
    ): CfnAnomalyDetector.MetricProperty {
        val builder = CfnAnomalyDetectorMetricPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure defines the metric to be returned, along with the statistics, period, and
     * units.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * MetricStatProperty metricStatProperty = MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(DimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .period(123)
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-metricstat.html)
     */
    public inline fun cfnAnomalyDetectorMetricStatProperty(
        block: CfnAnomalyDetectorMetricStatPropertyDsl.() -> Unit = {}
    ): CfnAnomalyDetector.MetricStatProperty {
        val builder = CfnAnomalyDetectorMetricStatPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnAnomalyDetector`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * CfnAnomalyDetectorProps cfnAnomalyDetectorProps = CfnAnomalyDetectorProps.builder()
     * .configuration(ConfigurationProperty.builder()
     * .excludedTimeRanges(List.of(RangeProperty.builder()
     * .endTime("endTime")
     * .startTime("startTime")
     * .build()))
     * .metricTimeZone("metricTimeZone")
     * .build())
     * .dimensions(List.of(DimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .metricMathAnomalyDetector(MetricMathAnomalyDetectorProperty.builder()
     * .metricDataQueries(List.of(MetricDataQueryProperty.builder()
     * .id("id")
     * // the properties below are optional
     * .accountId("accountId")
     * .expression("expression")
     * .label("label")
     * .metricStat(MetricStatProperty.builder()
     * .metric(MetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * // the properties below are optional
     * .dimensions(List.of(DimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .build())
     * .period(123)
     * .stat("stat")
     * // the properties below are optional
     * .unit("unit")
     * .build())
     * .period(123)
     * .returnData(false)
     * .build()))
     * .build())
     * .metricName("metricName")
     * .namespace("namespace")
     * .singleMetricAnomalyDetector(SingleMetricAnomalyDetectorProperty.builder()
     * .dimensions(List.of(DimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .metricName("metricName")
     * .namespace("namespace")
     * .stat("stat")
     * .build())
     * .stat("stat")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-anomalydetector.html)
     */
    public inline fun cfnAnomalyDetectorProps(
        block: CfnAnomalyDetectorPropsDsl.() -> Unit = {}
    ): CfnAnomalyDetectorProps {
        val builder = CfnAnomalyDetectorPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Each `Range` specifies one range of days or times to exclude from use for training or
     * updating an anomaly detection model.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * RangeProperty rangeProperty = RangeProperty.builder()
     * .endTime("endTime")
     * .startTime("startTime")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-range.html)
     */
    public inline fun cfnAnomalyDetectorRangeProperty(
        block: CfnAnomalyDetectorRangePropertyDsl.() -> Unit = {}
    ): CfnAnomalyDetector.RangeProperty {
        val builder = CfnAnomalyDetectorRangePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Designates the CloudWatch metric and statistic that provides the time series the anomaly
     * detector uses as input.
     *
     * If you have enabled unified cross-account observability, and this account is a monitoring
     * account, the metric can be in the same account or a source account.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * SingleMetricAnomalyDetectorProperty singleMetricAnomalyDetectorProperty =
     * SingleMetricAnomalyDetectorProperty.builder()
     * .dimensions(List.of(DimensionProperty.builder()
     * .name("name")
     * .value("value")
     * .build()))
     * .metricName("metricName")
     * .namespace("namespace")
     * .stat("stat")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-singlemetricanomalydetector.html)
     */
    public inline fun cfnAnomalyDetectorSingleMetricAnomalyDetectorProperty(
        block: CfnAnomalyDetectorSingleMetricAnomalyDetectorPropertyDsl.() -> Unit = {}
    ): CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty {
        val builder = CfnAnomalyDetectorSingleMetricAnomalyDetectorPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::CloudWatch::CompositeAlarm` type creates or updates a composite alarm.
     *
     * When you create a composite alarm, you specify a rule expression for the alarm that takes
     * into account the alarm states of other alarms that you have created. The composite alarm goes
     * into ALARM state only if all conditions of the rule are met.
     *
     * The alarms specified in a composite alarm's rule expression can include metric alarms and
     * other composite alarms.
     *
     * Using composite alarms can reduce alarm noise. You can create multiple metric alarms, and
     * also create a composite alarm and set up alerts only for the composite alarm. For example,
     * you could create a composite alarm that goes into ALARM state only when more than one of the
     * underlying metric alarms are in ALARM state.
     *
     * Currently, the only alarm actions that can be taken by composite alarms are notifying SNS
     * topics.
     *
     * When this operation creates an alarm, the alarm state is immediately set to
     * INSUFFICIENT_DATA. The alarm is then evaluated and its state is set appropriately. Any
     * actions associated with the new state are then executed. For a composite alarm, this initial
     * time after creation is the only time that the alarm can be in INSUFFICIENT_DATA state.
     *
     * When you update an existing alarm, its state is left unchanged, but the update completely
     * overwrites the previous configuration of the alarm.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * CfnCompositeAlarm cfnCompositeAlarm = CfnCompositeAlarm.Builder.create(this,
     * "MyCfnCompositeAlarm")
     * .alarmRule("alarmRule")
     * // the properties below are optional
     * .actionsEnabled(false)
     * .actionsSuppressor("actionsSuppressor")
     * .actionsSuppressorExtensionPeriod(123)
     * .actionsSuppressorWaitPeriod(123)
     * .alarmActions(List.of("alarmActions"))
     * .alarmDescription("alarmDescription")
     * .alarmName("alarmName")
     * .insufficientDataActions(List.of("insufficientDataActions"))
     * .okActions(List.of("okActions"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html)
     */
    public inline fun cfnCompositeAlarm(
        scope: Construct,
        id: String,
        block: CfnCompositeAlarmDsl.() -> Unit = {},
    ): CfnCompositeAlarm {
        val builder = CfnCompositeAlarmDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnCompositeAlarm`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * CfnCompositeAlarmProps cfnCompositeAlarmProps = CfnCompositeAlarmProps.builder()
     * .alarmRule("alarmRule")
     * // the properties below are optional
     * .actionsEnabled(false)
     * .actionsSuppressor("actionsSuppressor")
     * .actionsSuppressorExtensionPeriod(123)
     * .actionsSuppressorWaitPeriod(123)
     * .alarmActions(List.of("alarmActions"))
     * .alarmDescription("alarmDescription")
     * .alarmName("alarmName")
     * .insufficientDataActions(List.of("insufficientDataActions"))
     * .okActions(List.of("okActions"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-compositealarm.html)
     */
    public inline fun cfnCompositeAlarmProps(
        block: CfnCompositeAlarmPropsDsl.() -> Unit = {}
    ): CfnCompositeAlarmProps {
        val builder = CfnCompositeAlarmPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The `AWS::CloudWatch::Dashboard` resource specifies an Amazon CloudWatch dashboard.
     *
     * A dashboard is a customizable home page in the CloudWatch console that you can use to monitor
     * your AWS resources in a single view.
     *
     * All dashboards in your account are global, not region-specific.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * CfnDashboard cfnDashboard = CfnDashboard.Builder.create(this, "MyCfnDashboard")
     * .dashboardBody("dashboardBody")
     * // the properties below are optional
     * .dashboardName("dashboardName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html)
     */
    public inline fun cfnDashboard(
        scope: Construct,
        id: String,
        block: CfnDashboardDsl.() -> Unit = {},
    ): CfnDashboard {
        val builder = CfnDashboardDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnDashboard`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * CfnDashboardProps cfnDashboardProps = CfnDashboardProps.builder()
     * .dashboardBody("dashboardBody")
     * // the properties below are optional
     * .dashboardName("dashboardName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-dashboard.html)
     */
    public inline fun cfnDashboardProps(
        block: CfnDashboardPropsDsl.() -> Unit = {}
    ): CfnDashboardProps {
        val builder = CfnDashboardPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates or updates a Contributor Insights rule.
     *
     * Rules evaluate log events in a CloudWatch Logs log group, enabling you to find contributor
     * data for the log events in that log group. For more information, see
     * [Using Contributor Insights to Analyze High-Cardinality Data](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/ContributorInsights.html)
     * in the *Amazon CloudWatch User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * CfnInsightRule cfnInsightRule = CfnInsightRule.Builder.create(this, "MyCfnInsightRule")
     * .ruleBody("ruleBody")
     * .ruleName("ruleName")
     * .ruleState("ruleState")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html)
     */
    public inline fun cfnInsightRule(
        scope: Construct,
        id: String,
        block: CfnInsightRuleDsl.() -> Unit = {},
    ): CfnInsightRule {
        val builder = CfnInsightRuleDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnInsightRule`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * CfnInsightRuleProps cfnInsightRuleProps = CfnInsightRuleProps.builder()
     * .ruleBody("ruleBody")
     * .ruleName("ruleName")
     * .ruleState("ruleState")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-insightrule.html)
     */
    public inline fun cfnInsightRuleProps(
        block: CfnInsightRulePropsDsl.() -> Unit = {}
    ): CfnInsightRuleProps {
        val builder = CfnInsightRulePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Creates or updates a metric stream.
     *
     * Metrics streams can automatically stream CloudWatch metrics to AWS destinations including
     * Amazon S3 and to many third-party solutions. For more information, see
     * [Metric streams](https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-Metric-Streams.html)
     * .
     *
     * To create a metric stream, you must be logged on to an account that has the `iam:PassRole`
     * permission and either the *CloudWatchFullAccess* policy or the `cloudwatch:PutMetricStream`
     * permission.
     *
     * When you create or update a metric stream, you choose one of the following:
     * * Stream metrics from all metric namespaces in the account.
     * * Stream metrics from all metric namespaces in the account, except for the namespaces that
     *   you list in `ExcludeFilters` .
     * * Stream metrics from only the metric namespaces that you list in `IncludeFilters` .
     *
     * When you create a metric stream, the stream is created in the `running` state. If you update
     * an existing metric stream, the state does not change.
     *
     * If you create a metric stream in an account that has been set up as a monitoring account in
     * CloudWatch cross-account observability, you can choose whether to include metrics from linked
     * source accounts in the metric stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * CfnMetricStream cfnMetricStream = CfnMetricStream.Builder.create(this, "MyCfnMetricStream")
     * .firehoseArn("firehoseArn")
     * .outputFormat("outputFormat")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .excludeFilters(List.of(MetricStreamFilterProperty.builder()
     * .namespace("namespace")
     * // the properties below are optional
     * .metricNames(List.of("metricNames"))
     * .build()))
     * .includeFilters(List.of(MetricStreamFilterProperty.builder()
     * .namespace("namespace")
     * // the properties below are optional
     * .metricNames(List.of("metricNames"))
     * .build()))
     * .includeLinkedAccountsMetrics(false)
     * .name("name")
     * .statisticsConfigurations(List.of(MetricStreamStatisticsConfigurationProperty.builder()
     * .additionalStatistics(List.of("additionalStatistics"))
     * .includeMetrics(List.of(MetricStreamStatisticsMetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * .build()))
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html)
     */
    public inline fun cfnMetricStream(
        scope: Construct,
        id: String,
        block: CfnMetricStreamDsl.() -> Unit = {},
    ): CfnMetricStream {
        val builder = CfnMetricStreamDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure contains a metric namespace and optionally, a list of metric names, to either
     * include in a metric ' stream or exclude from a metric stream.
     *
     * A metric stream's filters can include up to 1000 total names. This limit applies to the sum
     * of namespace names and metric names in the filters. For example, this could include 10 metric
     * namespace filters with 99 metrics each, or 20 namespace filters with 49 metrics specified in
     * each filter.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * MetricStreamFilterProperty metricStreamFilterProperty = MetricStreamFilterProperty.builder()
     * .namespace("namespace")
     * // the properties below are optional
     * .metricNames(List.of("metricNames"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-metricstream-metricstreamfilter.html)
     */
    public inline fun cfnMetricStreamMetricStreamFilterProperty(
        block: CfnMetricStreamMetricStreamFilterPropertyDsl.() -> Unit = {}
    ): CfnMetricStream.MetricStreamFilterProperty {
        val builder = CfnMetricStreamMetricStreamFilterPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * This structure specifies a list of additional statistics to stream, and the metrics to stream
     * those additional statistics for.
     *
     * All metrics that match the combination of metric name and namespace will be streamed with the
     * additional statistics, no matter their dimensions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * MetricStreamStatisticsConfigurationProperty metricStreamStatisticsConfigurationProperty =
     * MetricStreamStatisticsConfigurationProperty.builder()
     * .additionalStatistics(List.of("additionalStatistics"))
     * .includeMetrics(List.of(MetricStreamStatisticsMetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-metricstream-metricstreamstatisticsconfiguration.html)
     */
    public inline fun cfnMetricStreamMetricStreamStatisticsConfigurationProperty(
        block: CfnMetricStreamMetricStreamStatisticsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnMetricStream.MetricStreamStatisticsConfigurationProperty {
        val builder = CfnMetricStreamMetricStreamStatisticsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A structure that specifies the metric name and namespace for one metric that is going to have
     * additional statistics included in the stream.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * MetricStreamStatisticsMetricProperty metricStreamStatisticsMetricProperty =
     * MetricStreamStatisticsMetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-metricstream-metricstreamstatisticsmetric.html)
     */
    public inline fun cfnMetricStreamMetricStreamStatisticsMetricProperty(
        block: CfnMetricStreamMetricStreamStatisticsMetricPropertyDsl.() -> Unit = {}
    ): CfnMetricStream.MetricStreamStatisticsMetricProperty {
        val builder = CfnMetricStreamMetricStreamStatisticsMetricPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnMetricStream`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * CfnMetricStreamProps cfnMetricStreamProps = CfnMetricStreamProps.builder()
     * .firehoseArn("firehoseArn")
     * .outputFormat("outputFormat")
     * .roleArn("roleArn")
     * // the properties below are optional
     * .excludeFilters(List.of(MetricStreamFilterProperty.builder()
     * .namespace("namespace")
     * // the properties below are optional
     * .metricNames(List.of("metricNames"))
     * .build()))
     * .includeFilters(List.of(MetricStreamFilterProperty.builder()
     * .namespace("namespace")
     * // the properties below are optional
     * .metricNames(List.of("metricNames"))
     * .build()))
     * .includeLinkedAccountsMetrics(false)
     * .name("name")
     * .statisticsConfigurations(List.of(MetricStreamStatisticsConfigurationProperty.builder()
     * .additionalStatistics(List.of("additionalStatistics"))
     * .includeMetrics(List.of(MetricStreamStatisticsMetricProperty.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * .build()))
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudwatch-metricstream.html)
     */
    public inline fun cfnMetricStreamProps(
        block: CfnMetricStreamPropsDsl.() -> Unit = {}
    ): CfnMetricStreamProps {
        val builder = CfnMetricStreamPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options shared by most methods accepting metric options.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.cloudwatch.*;
     * CommonMetricOptions commonMetricOptions = CommonMetricOptions.builder()
     * .account("account")
     * .color("color")
     * .dimensionsMap(Map.of(
     * "dimensionsMapKey", "dimensionsMap"))
     * .label("label")
     * .period(Duration.minutes(30))
     * .region("region")
     * .statistic("statistic")
     * .unit(Unit.SECONDS)
     * .build();
     * ```
     */
    public inline fun commonMetricOptions(
        block: CommonMetricOptionsDsl.() -> Unit = {}
    ): CommonMetricOptions {
        val builder = CommonMetricOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A Composite Alarm based on Alarm Rule.
     *
     * Example:
     * ```
     * Alarm alarm1;
     * Alarm alarm2;
     * Alarm alarm3;
     * Alarm alarm4;
     * IAlarmRule alarmRule = AlarmRule.anyOf(AlarmRule.allOf(AlarmRule.anyOf(alarm1,
     * AlarmRule.fromAlarm(alarm2, AlarmState.OK), alarm3), AlarmRule.not(AlarmRule.fromAlarm(alarm4,
     * AlarmState.INSUFFICIENT_DATA))), AlarmRule.fromBoolean(false));
     * CompositeAlarm.Builder.create(this, "MyAwesomeCompositeAlarm")
     * .alarmRule(alarmRule)
     * .build();
     * ```
     */
    public inline fun compositeAlarm(
        scope: Construct,
        id: String,
        block: CompositeAlarmDsl.() -> Unit = {},
    ): CompositeAlarm {
        val builder = CompositeAlarmDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for creating a Composite Alarm.
     *
     * Example:
     * ```
     * Alarm alarm1;
     * Alarm alarm2;
     * Alarm alarm3;
     * Alarm alarm4;
     * IAlarmRule alarmRule = AlarmRule.anyOf(AlarmRule.allOf(AlarmRule.anyOf(alarm1,
     * AlarmRule.fromAlarm(alarm2, AlarmState.OK), alarm3), AlarmRule.not(AlarmRule.fromAlarm(alarm4,
     * AlarmState.INSUFFICIENT_DATA))), AlarmRule.fromBoolean(false));
     * CompositeAlarm.Builder.create(this, "MyAwesomeCompositeAlarm")
     * .alarmRule(alarmRule)
     * .build();
     * ```
     */
    public inline fun compositeAlarmProps(
        block: CompositeAlarmPropsDsl.() -> Unit = {}
    ): CompositeAlarmProps {
        val builder = CompositeAlarmPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties needed to make an alarm from a metric.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cloudwatch.*;
     * HostedZone myHostedZone;
     * Certificate certificate = Certificate.Builder.create(this, "Certificate")
     * .domainName("hello.example.com")
     * .validation(CertificateValidation.fromDns(myHostedZone))
     * .build();
     * certificate.metricDaysToExpiry().createAlarm(this, "Alarm", CreateAlarmOptions.builder()
     * .comparisonOperator(ComparisonOperator.LESS_THAN_THRESHOLD)
     * .evaluationPeriods(1)
     * .threshold(45)
     * .build());
     * ```
     */
    public inline fun createAlarmOptions(
        block: CreateAlarmOptionsDsl.() -> Unit = {}
    ): CreateAlarmOptions {
        val builder = CreateAlarmOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A CustomWidget shows the result of a AWS lambda function.
     *
     * Example:
     * ```
     * Dashboard dashboard;
     * // Import or create a lambda function
     * IFunction fn = Function.fromFunctionArn(dashboard, "Function",
     * "arn:aws:lambda:us-east-1:123456789012:function:MyFn");
     * dashboard.addWidgets(CustomWidget.Builder.create()
     * .functionArn(fn.getFunctionArn())
     * .title("My lambda baked widget")
     * .build());
     * ```
     */
    public inline fun customWidget(block: CustomWidgetDsl.() -> Unit = {}): CustomWidget {
        val builder = CustomWidgetDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The properties for a CustomWidget.
     *
     * Example:
     * ```
     * Dashboard dashboard;
     * // Import or create a lambda function
     * IFunction fn = Function.fromFunctionArn(dashboard, "Function",
     * "arn:aws:lambda:us-east-1:123456789012:function:MyFn");
     * dashboard.addWidgets(CustomWidget.Builder.create()
     * .functionArn(fn.getFunctionArn())
     * .title("My lambda baked widget")
     * .build());
     * ```
     */
    public inline fun customWidgetProps(
        block: CustomWidgetPropsDsl.() -> Unit = {}
    ): CustomWidgetProps {
        val builder = CustomWidgetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A CloudWatch dashboard.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Dashboard dashboard = Dashboard.Builder.create(this, "Dash")
     * .defaultInterval(Duration.days(7))
     * .variables(List.of(DashboardVariable.Builder.create()
     * .id("region2")
     * .type(VariableType.PATTERN)
     * .label("RegionPattern")
     * .inputType(VariableInputType.INPUT)
     * .value("us-east-1")
     * .defaultValue(DefaultValue.value("us-east-1"))
     * .visible(true)
     * .build()))
     * .build();
     * ```
     */
    public inline fun dashboard(
        scope: Construct,
        id: String,
        block: DashboardDsl.() -> Unit = {},
    ): Dashboard {
        val builder = DashboardDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a CloudWatch Dashboard.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Dashboard dashboard = Dashboard.Builder.create(this, "Dash")
     * .defaultInterval(Duration.days(7))
     * .variables(List.of(DashboardVariable.Builder.create()
     * .id("region2")
     * .type(VariableType.PATTERN)
     * .label("RegionPattern")
     * .inputType(VariableInputType.INPUT)
     * .value("us-east-1")
     * .defaultValue(DefaultValue.value("us-east-1"))
     * .visible(true)
     * .build()))
     * .build();
     * ```
     */
    public inline fun dashboardProps(block: DashboardPropsDsl.() -> Unit = {}): DashboardProps {
        val builder = DashboardPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Dashboard Variable.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Dashboard dashboard = Dashboard.Builder.create(this, "Dash")
     * .defaultInterval(Duration.days(7))
     * .variables(List.of(DashboardVariable.Builder.create()
     * .id("functionName")
     * .type(VariableType.PATTERN)
     * .label("Function")
     * .inputType(VariableInputType.RADIO)
     * .value("originalFuncNameInDashboard")
     * // equivalent to cw.Values.fromSearch('{AWS/Lambda,FunctionName} MetricName=\"Duration\"',
     * 'FunctionName')
     * .values(Values.fromSearchComponents(SearchComponents.builder()
     * .namespace("AWS/Lambda")
     * .dimensions(List.of("FunctionName"))
     * .metricName("Duration")
     * .populateFrom("FunctionName")
     * .build()))
     * .defaultValue(DefaultValue.FIRST)
     * .visible(true)
     * .build()))
     * .build();
     * ```
     */
    public inline fun dashboardVariable(
        block: DashboardVariableDsl.() -> Unit = {}
    ): DashboardVariable {
        val builder = DashboardVariableDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Options for [DashboardVariable].
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Dashboard dashboard = Dashboard.Builder.create(this, "Dash")
     * .defaultInterval(Duration.days(7))
     * .variables(List.of(DashboardVariable.Builder.create()
     * .id("functionName")
     * .type(VariableType.PATTERN)
     * .label("Function")
     * .inputType(VariableInputType.RADIO)
     * .value("originalFuncNameInDashboard")
     * // equivalent to cw.Values.fromSearch('{AWS/Lambda,FunctionName} MetricName=\"Duration\"',
     * 'FunctionName')
     * .values(Values.fromSearchComponents(SearchComponents.builder()
     * .namespace("AWS/Lambda")
     * .dimensions(List.of("FunctionName"))
     * .metricName("Duration")
     * .populateFrom("FunctionName")
     * .build()))
     * .defaultValue(DefaultValue.FIRST)
     * .visible(true)
     * .build()))
     * .build();
     * ```
     */
    public inline fun dashboardVariableOptions(
        block: DashboardVariableOptionsDsl.() -> Unit = {}
    ): DashboardVariableOptions {
        val builder = DashboardVariableOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Metric dimension.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Object value;
     * Dimension dimension = Dimension.builder()
     * .name("name")
     * .value(value)
     * .build();
     * ```
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cw-dimension.html)
     */
    public inline fun dimension(block: DimensionDsl.() -> Unit = {}): Dimension {
        val builder = DimensionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A dashboard gauge widget that displays metrics.
     *
     * Example:
     * ```
     * Dashboard dashboard;
     * Alarm errorAlarm;
     * Metric gaugeMetric;
     * dashboard.addWidgets(GaugeWidget.Builder.create()
     * .metrics(List.of(gaugeMetric))
     * .leftYAxis(YAxisProps.builder()
     * .min(0)
     * .max(1000)
     * .build())
     * .build());
     * ```
     */
    public inline fun gaugeWidget(block: GaugeWidgetDsl.() -> Unit = {}): GaugeWidget {
        val builder = GaugeWidgetDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a GaugeWidget.
     *
     * Example:
     * ```
     * Dashboard dashboard;
     * Alarm errorAlarm;
     * Metric gaugeMetric;
     * dashboard.addWidgets(GaugeWidget.Builder.create()
     * .metrics(List.of(gaugeMetric))
     * .leftYAxis(YAxisProps.builder()
     * .min(0)
     * .max(1000)
     * .build())
     * .build());
     * ```
     */
    public inline fun gaugeWidgetProps(
        block: GaugeWidgetPropsDsl.() -> Unit = {}
    ): GaugeWidgetProps {
        val builder = GaugeWidgetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A dashboard widget that displays metrics.
     *
     * Example:
     * ```
     * Dashboard dashboard;
     * dashboard.addWidgets(GraphWidget.Builder.create()
     * // ...
     * .legendPosition(LegendPosition.RIGHT)
     * .build());
     * ```
     */
    public inline fun graphWidget(block: GraphWidgetDsl.() -> Unit = {}): GraphWidget {
        val builder = GraphWidgetDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a GraphWidget.
     *
     * Example:
     * ```
     * Dashboard dashboard;
     * dashboard.addWidgets(GraphWidget.Builder.create()
     * // ...
     * .legendPosition(LegendPosition.RIGHT)
     * .build());
     * ```
     */
    public inline fun graphWidgetProps(
        block: GraphWidgetPropsDsl.() -> Unit = {}
    ): GraphWidgetProps {
        val builder = GraphWidgetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Horizontal annotation to be added to a graph.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * HorizontalAnnotation horizontalAnnotation = HorizontalAnnotation.builder()
     * .value(123)
     * // the properties below are optional
     * .color("color")
     * .fill(Shading.NONE)
     * .label("label")
     * .visible(false)
     * .build();
     * ```
     */
    public inline fun horizontalAnnotation(
        block: HorizontalAnnotationDsl.() -> Unit = {}
    ): HorizontalAnnotation {
        val builder = HorizontalAnnotationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Display query results from Logs Insights.
     *
     * Example:
     * ```
     * Dashboard dashboard;
     * dashboard.addWidgets(LogQueryWidget.Builder.create()
     * .logGroupNames(List.of("my-log-group"))
     * .view(LogQueryVisualizationType.TABLE)
     * // The lines will be automatically combined using '\n|'.
     * .queryLines(List.of("fields &#64;message", "filter &#64;message like /Error/"))
     * .build());
     * ```
     */
    public inline fun logQueryWidget(block: LogQueryWidgetDsl.() -> Unit = {}): LogQueryWidget {
        val builder = LogQueryWidgetDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a Query widget.
     *
     * Example:
     * ```
     * Dashboard dashboard;
     * dashboard.addWidgets(LogQueryWidget.Builder.create()
     * .logGroupNames(List.of("my-log-group"))
     * .view(LogQueryVisualizationType.TABLE)
     * // The lines will be automatically combined using '\n|'.
     * .queryLines(List.of("fields &#64;message", "filter &#64;message like /Error/"))
     * .build());
     * ```
     */
    public inline fun logQueryWidgetProps(
        block: LogQueryWidgetPropsDsl.() -> Unit = {}
    ): LogQueryWidgetProps {
        val builder = LogQueryWidgetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A math expression built with metric(s) emitted by a service.
     *
     * The math expression is a combination of an expression (x+y) and metrics to apply expression
     * on. It also contains metadata which is used only in graphs, such as color and label. It makes
     * sense to embed this in here, so that compound constructs can attach that metadata to metrics
     * they expose.
     *
     * MathExpression can also be used for search expressions. In this case, it also optionally
     * accepts a searchRegion and searchAccount property for cross-environment search expressions.
     *
     * This class does not represent a resource, so hence is not a construct. Instead,
     * MathExpression is an abstraction that makes it easy to specify metrics for use in both alarms
     * and graphs.
     *
     * Example:
     * ```
     * Function fn;
     * MathExpression allProblems = MathExpression.Builder.create()
     * .expression("errors + throttles")
     * .usingMetrics(Map.of(
     * "errors", fn.metricErrors(),
     * "throttles", fn.metricThrottles()))
     * .build();
     * ```
     */
    public inline fun mathExpression(block: MathExpressionDsl.() -> Unit = {}): MathExpression {
        val builder = MathExpressionDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Configurable options for MathExpressions.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.cloudwatch.*;
     * MathExpressionOptions mathExpressionOptions = MathExpressionOptions.builder()
     * .color("color")
     * .label("label")
     * .period(Duration.minutes(30))
     * .searchAccount("searchAccount")
     * .searchRegion("searchRegion")
     * .build();
     * ```
     */
    public inline fun mathExpressionOptions(
        block: MathExpressionOptionsDsl.() -> Unit = {}
    ): MathExpressionOptions {
        val builder = MathExpressionOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a MathExpression.
     *
     * Example:
     * ```
     * Function fn;
     * MathExpression allProblems = MathExpression.Builder.create()
     * .expression("errors + throttles")
     * .usingMetrics(Map.of(
     * "errors", fn.metricErrors(),
     * "throttles", fn.metricThrottles()))
     * .build();
     * ```
     */
    public inline fun mathExpressionProps(
        block: MathExpressionPropsDsl.() -> Unit = {}
    ): MathExpressionProps {
        val builder = MathExpressionPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A metric emitted by a service.
     *
     * The metric is a combination of a metric identifier (namespace, name and dimensions) and an
     * aggregation function (statistic, period and unit).
     *
     * It also contains metadata which is used only in graphs, such as color and label. It makes
     * sense to embed this in here, so that compound constructs can attach that metadata to metrics
     * they expose.
     *
     * This class does not represent a resource, so hence is not a construct. Instead, Metric is an
     * abstraction that makes it easy to specify metrics for use in both alarms and graphs.
     *
     * Example:
     * ```
     * Function fn;
     * Metric minuteErrorRate = fn.metricErrors(MetricOptions.builder()
     * .statistic(Stats.AVERAGE)
     * .period(Duration.minutes(1))
     * .label("Lambda failure rate")
     * .build());
     * ```
     */
    public inline fun metric(block: MetricDsl.() -> Unit = {}): Metric {
        val builder = MetricDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of a rendered metric.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Metric metric;
     * Object renderingProperties;
     * Object value;
     * MetricConfig metricConfig = MetricConfig.builder()
     * .mathExpression(MetricExpressionConfig.builder()
     * .expression("expression")
     * .period(123)
     * .usingMetrics(Map.of(
     * "usingMetricsKey", metric))
     * // the properties below are optional
     * .searchAccount("searchAccount")
     * .searchRegion("searchRegion")
     * .build())
     * .metricStat(MetricStatConfig.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * .period(Duration.minutes(30))
     * .statistic("statistic")
     * // the properties below are optional
     * .account("account")
     * .dimensions(List.of(Dimension.builder()
     * .name("name")
     * .value(value)
     * .build()))
     * .region("region")
     * .unitFilter(Unit.SECONDS)
     * .build())
     * .renderingProperties(Map.of(
     * "renderingPropertiesKey", renderingProperties))
     * .build();
     * ```
     */
    public inline fun metricConfig(block: MetricConfigDsl.() -> Unit = {}): MetricConfig {
        val builder = MetricConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a concrete metric.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Metric metric;
     * MetricExpressionConfig metricExpressionConfig = MetricExpressionConfig.builder()
     * .expression("expression")
     * .period(123)
     * .usingMetrics(Map.of(
     * "usingMetricsKey", metric))
     * // the properties below are optional
     * .searchAccount("searchAccount")
     * .searchRegion("searchRegion")
     * .build();
     * ```
     */
    public inline fun metricExpressionConfig(
        block: MetricExpressionConfigDsl.() -> Unit = {}
    ): MetricExpressionConfig {
        val builder = MetricExpressionConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties of a metric that can be changed.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cloudwatch.*;
     * DeliveryStream deliveryStream;
     * // Alarm that triggers when the per-second average of incoming bytes exceeds 90% of the current
     * service limit
     * MathExpression incomingBytesPercentOfLimit = MathExpression.Builder.create()
     * .expression("incomingBytes / 300 / bytePerSecLimit")
     * .usingMetrics(Map.of(
     * "incomingBytes",
     * deliveryStream.metricIncomingBytes(MetricOptions.builder().statistic(Statistic.SUM).build()),
     * "bytePerSecLimit", deliveryStream.metric("BytesPerSecondLimit")))
     * .build();
     * Alarm.Builder.create(this, "Alarm")
     * .metric(incomingBytesPercentOfLimit)
     * .threshold(0.9)
     * .evaluationPeriods(3)
     * .build();
     * ```
     */
    public inline fun metricOptions(block: MetricOptionsDsl.() -> Unit = {}): MetricOptions {
        val builder = MetricOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a metric.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Metric metric = Metric.Builder.create()
     * .namespace("MyNamespace")
     * .metricName("MyMetric")
     * .dimensionsMap(Map.of("MyDimension", "MyDimensionValue"))
     * .build();
     * Alarm alarm = Alarm.Builder.create(this, "MyAlarm")
     * .metric(metric)
     * .threshold(100)
     * .evaluationPeriods(3)
     * .datapointsToAlarm(2)
     * .build();
     * TopicRule topicRule = TopicRule.Builder.create(this, "TopicRule")
     * .sql(IotSql.fromStringAsVer20160323("SELECT topic(2) as device_id FROM 'device/+/data'"))
     * .actions(List.of(
     * CloudWatchSetAlarmStateAction.Builder.create(alarm)
     * .reason("AWS Iot Rule action is triggered")
     * .alarmStateToSet(AlarmState.ALARM)
     * .build()))
     * .build();
     * ```
     */
    public inline fun metricProps(block: MetricPropsDsl.() -> Unit = {}): MetricProps {
        val builder = MetricPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a concrete metric.
     *
     * NOTE: `unit` is no longer on this object since it is only used for `Alarms`, and doesn't mean
     * what one would expect it to mean there anyway. It is most likely to be misused.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.*;
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Object value;
     * MetricStatConfig metricStatConfig = MetricStatConfig.builder()
     * .metricName("metricName")
     * .namespace("namespace")
     * .period(Duration.minutes(30))
     * .statistic("statistic")
     * // the properties below are optional
     * .account("account")
     * .dimensions(List.of(Dimension.builder()
     * .name("name")
     * .value(value)
     * .build()))
     * .region("region")
     * .unitFilter(Unit.SECONDS)
     * .build();
     * ```
     */
    public inline fun metricStatConfig(
        block: MetricStatConfigDsl.() -> Unit = {}
    ): MetricStatConfig {
        val builder = MetricStatConfigDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Basic properties for widgets that display metrics.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * MetricWidgetProps metricWidgetProps = MetricWidgetProps.builder()
     * .height(123)
     * .region("region")
     * .title("title")
     * .width(123)
     * .build();
     * ```
     */
    public inline fun metricWidgetProps(
        block: MetricWidgetPropsDsl.() -> Unit = {}
    ): MetricWidgetProps {
        val builder = MetricWidgetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Search components for use with [Values.fromSearchComponents].
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Dashboard dashboard = Dashboard.Builder.create(this, "Dash")
     * .defaultInterval(Duration.days(7))
     * .variables(List.of(DashboardVariable.Builder.create()
     * .id("functionName")
     * .type(VariableType.PATTERN)
     * .label("Function")
     * .inputType(VariableInputType.RADIO)
     * .value("originalFuncNameInDashboard")
     * // equivalent to cw.Values.fromSearch('{AWS/Lambda,FunctionName} MetricName=\"Duration\"',
     * 'FunctionName')
     * .values(Values.fromSearchComponents(SearchComponents.builder()
     * .namespace("AWS/Lambda")
     * .dimensions(List.of("FunctionName"))
     * .metricName("Duration")
     * .populateFrom("FunctionName")
     * .build()))
     * .defaultValue(DefaultValue.FIRST)
     * .visible(true)
     * .build()))
     * .build();
     * ```
     */
    public inline fun searchComponents(
        block: SearchComponentsDsl.() -> Unit = {}
    ): SearchComponents {
        val builder = SearchComponentsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A dashboard widget that displays the most recent value for every metric.
     *
     * Example:
     * ```
     * Dashboard dashboard;
     * dashboard.addWidgets(SingleValueWidget.Builder.create()
     * .metrics(List.of())
     * .period(Duration.minutes(15))
     * .build());
     * ```
     */
    public inline fun singleValueWidget(
        block: SingleValueWidgetDsl.() -> Unit = {}
    ): SingleValueWidget {
        val builder = SingleValueWidgetDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a SingleValueWidget.
     *
     * Example:
     * ```
     * Dashboard dashboard;
     * dashboard.addWidgets(SingleValueWidget.Builder.create()
     * .metrics(List.of())
     * .period(Duration.minutes(15))
     * .build());
     * ```
     */
    public inline fun singleValueWidgetProps(
        block: SingleValueWidgetPropsDsl.() -> Unit = {}
    ): SingleValueWidgetProps {
        val builder = SingleValueWidgetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A widget that doesn't display anything but takes up space.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Spacer spacer = Spacer.Builder.create()
     * .height(123)
     * .width(123)
     * .build();
     * ```
     */
    public inline fun spacer(block: SpacerDsl.() -> Unit = {}): Spacer {
        val builder = SpacerDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props of the spacer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * SpacerProps spacerProps = SpacerProps.builder()
     * .height(123)
     * .width(123)
     * .build();
     * ```
     */
    public inline fun spacerProps(block: SpacerPropsDsl.() -> Unit = {}): SpacerProps {
        val builder = SpacerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for TableWidget's summary columns.
     *
     * Example:
     * ```
     * Dashboard dashboard;
     * dashboard.addWidgets(TableWidget.Builder.create()
     * // ...
     * .summary(TableSummaryProps.builder()
     * .columns(List.of(TableSummaryColumn.AVERAGE))
     * .hideNonSummaryColumns(true)
     * .sticky(true)
     * .build())
     * .build());
     * ```
     */
    public inline fun tableSummaryProps(
        block: TableSummaryPropsDsl.() -> Unit = {}
    ): TableSummaryProps {
        val builder = TableSummaryPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A dashboard widget that displays metrics.
     *
     * Example:
     * ```
     * Dashboard dashboard;
     * dashboard.addWidgets(TableWidget.Builder.create()
     * // ...
     * .layout(TableLayout.VERTICAL)
     * .build());
     * ```
     */
    public inline fun tableWidget(block: TableWidgetDsl.() -> Unit = {}): TableWidget {
        val builder = TableWidgetDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a TableWidget.
     *
     * Example:
     * ```
     * Dashboard dashboard;
     * dashboard.addWidgets(TableWidget.Builder.create()
     * // ...
     * .layout(TableLayout.VERTICAL)
     * .build());
     * ```
     */
    public inline fun tableWidgetProps(
        block: TableWidgetPropsDsl.() -> Unit = {}
    ): TableWidgetProps {
        val builder = TableWidgetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A dashboard widget that displays MarkDown.
     *
     * Example:
     * ```
     * Dashboard dashboard;
     * dashboard.addWidgets(TextWidget.Builder.create()
     * .markdown("# Key Performance Indicators")
     * .build());
     * ```
     */
    public inline fun textWidget(block: TextWidgetDsl.() -> Unit = {}): TextWidget {
        val builder = TextWidgetDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a Text widget.
     *
     * Example:
     * ```
     * Dashboard dashboard;
     * dashboard.addWidgets(TextWidget.Builder.create()
     * .markdown("# Key Performance Indicators")
     * .build());
     * ```
     */
    public inline fun textWidgetProps(block: TextWidgetPropsDsl.() -> Unit = {}): TextWidgetProps {
        val builder = TextWidgetPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Example:
     * ```
     * import software.amazon.awscdk.services.cloudwatch.*;
     * Dashboard dashboard = Dashboard.Builder.create(this, "Dash")
     * .defaultInterval(Duration.days(7))
     * .variables(List.of(DashboardVariable.Builder.create()
     * .id("region")
     * .type(VariableType.PROPERTY)
     * .label("Region")
     * .inputType(VariableInputType.RADIO)
     * .value("region")
     * .values(Values.fromValues(VariableValue.builder().label("IAD").value("us-east-1").build(),
     * VariableValue.builder().label("DUB").value("us-west-2").build()))
     * .defaultValue(DefaultValue.value("us-east-1"))
     * .visible(true)
     * .build()))
     * .build();
     * ```
     */
    public inline fun variableValue(block: VariableValueDsl.() -> Unit = {}): VariableValue {
        val builder = VariableValueDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Vertical annotation to be added to a graph.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.cloudwatch.*;
     * VerticalAnnotation verticalAnnotation = VerticalAnnotation.builder()
     * .date("date")
     * // the properties below are optional
     * .color("color")
     * .fill(VerticalShading.NONE)
     * .label("label")
     * .visible(false)
     * .build();
     * ```
     */
    public inline fun verticalAnnotation(
        block: VerticalAnnotationDsl.() -> Unit = {}
    ): VerticalAnnotation {
        val builder = VerticalAnnotationDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for a Y-Axis.
     *
     * Example:
     * ```
     * Dashboard dashboard;
     * Alarm errorAlarm;
     * Metric gaugeMetric;
     * dashboard.addWidgets(GaugeWidget.Builder.create()
     * .metrics(List.of(gaugeMetric))
     * .leftYAxis(YAxisProps.builder()
     * .min(0)
     * .max(1000)
     * .build())
     * .build());
     * ```
     */
    public inline fun yAxisProps(block: YAxisPropsDsl.() -> Unit = {}): YAxisProps {
        val builder = YAxisPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}

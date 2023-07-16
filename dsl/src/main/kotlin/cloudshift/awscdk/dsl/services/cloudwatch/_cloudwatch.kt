@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

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
import software.amazon.awscdk.services.cloudwatch.SingleValueWidget
import software.amazon.awscdk.services.cloudwatch.SingleValueWidgetProps
import software.amazon.awscdk.services.cloudwatch.Spacer
import software.amazon.awscdk.services.cloudwatch.SpacerProps
import software.amazon.awscdk.services.cloudwatch.TextWidget
import software.amazon.awscdk.services.cloudwatch.TextWidgetProps
import software.amazon.awscdk.services.cloudwatch.YAxisProps
import software.constructs.Construct

public object cloudwatch {
  public inline fun alarm(
    scope: Construct,
    id: String,
    block: AlarmDsl.() -> Unit = {},
  ): Alarm {
    val builder = AlarmDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun alarmActionConfig(block: AlarmActionConfigDsl.() -> Unit = {}):
      AlarmActionConfig {
    val builder = AlarmActionConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun alarmProps(block: AlarmPropsDsl.() -> Unit = {}): AlarmProps {
    val builder = AlarmPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun alarmStatusWidget(block: AlarmStatusWidgetDsl.() -> Unit = {}):
      AlarmStatusWidget {
    val builder = AlarmStatusWidgetDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun alarmStatusWidgetProps(block: AlarmStatusWidgetPropsDsl.() -> Unit = {}):
      AlarmStatusWidgetProps {
    val builder = AlarmStatusWidgetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun alarmWidget(block: AlarmWidgetDsl.() -> Unit = {}): AlarmWidget {
    val builder = AlarmWidgetDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun alarmWidgetProps(block: AlarmWidgetPropsDsl.() -> Unit = {}): AlarmWidgetProps {
    val builder = AlarmWidgetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAlarm(
    scope: Construct,
    id: String,
    block: CfnAlarmDsl.() -> Unit = {},
  ): CfnAlarm {
    val builder = CfnAlarmDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAlarmDimensionProperty(block: CfnAlarmDimensionPropertyDsl.() -> Unit = {}):
      CfnAlarm.DimensionProperty {
    val builder = CfnAlarmDimensionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAlarmMetricDataQueryProperty(block: CfnAlarmMetricDataQueryPropertyDsl.() -> Unit =
      {}): CfnAlarm.MetricDataQueryProperty {
    val builder = CfnAlarmMetricDataQueryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAlarmMetricProperty(block: CfnAlarmMetricPropertyDsl.() -> Unit = {}):
      CfnAlarm.MetricProperty {
    val builder = CfnAlarmMetricPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAlarmMetricStatProperty(block: CfnAlarmMetricStatPropertyDsl.() -> Unit =
      {}): CfnAlarm.MetricStatProperty {
    val builder = CfnAlarmMetricStatPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAlarmProps(block: CfnAlarmPropsDsl.() -> Unit = {}): CfnAlarmProps {
    val builder = CfnAlarmPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnomalyDetector(
    scope: Construct,
    id: String,
    block: CfnAnomalyDetectorDsl.() -> Unit = {},
  ): CfnAnomalyDetector {
    val builder = CfnAnomalyDetectorDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnomalyDetectorConfigurationProperty(block: CfnAnomalyDetectorConfigurationPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.ConfigurationProperty {
    val builder = CfnAnomalyDetectorConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnomalyDetectorDimensionProperty(block: CfnAnomalyDetectorDimensionPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.DimensionProperty {
    val builder = CfnAnomalyDetectorDimensionPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnomalyDetectorMetricDataQueryProperty(block: CfnAnomalyDetectorMetricDataQueryPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.MetricDataQueryProperty {
    val builder = CfnAnomalyDetectorMetricDataQueryPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnomalyDetectorMetricMathAnomalyDetectorProperty(block: CfnAnomalyDetectorMetricMathAnomalyDetectorPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.MetricMathAnomalyDetectorProperty {
    val builder = CfnAnomalyDetectorMetricMathAnomalyDetectorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnomalyDetectorMetricProperty(block: CfnAnomalyDetectorMetricPropertyDsl.() -> Unit =
      {}): CfnAnomalyDetector.MetricProperty {
    val builder = CfnAnomalyDetectorMetricPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnomalyDetectorMetricStatProperty(block: CfnAnomalyDetectorMetricStatPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.MetricStatProperty {
    val builder = CfnAnomalyDetectorMetricStatPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnomalyDetectorProps(block: CfnAnomalyDetectorPropsDsl.() -> Unit = {}):
      CfnAnomalyDetectorProps {
    val builder = CfnAnomalyDetectorPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnomalyDetectorRangeProperty(block: CfnAnomalyDetectorRangePropertyDsl.() -> Unit =
      {}): CfnAnomalyDetector.RangeProperty {
    val builder = CfnAnomalyDetectorRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnomalyDetectorSingleMetricAnomalyDetectorProperty(block: CfnAnomalyDetectorSingleMetricAnomalyDetectorPropertyDsl.() -> Unit
      = {}): CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty {
    val builder = CfnAnomalyDetectorSingleMetricAnomalyDetectorPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCompositeAlarm(
    scope: Construct,
    id: String,
    block: CfnCompositeAlarmDsl.() -> Unit = {},
  ): CfnCompositeAlarm {
    val builder = CfnCompositeAlarmDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnCompositeAlarmProps(block: CfnCompositeAlarmPropsDsl.() -> Unit = {}):
      CfnCompositeAlarmProps {
    val builder = CfnCompositeAlarmPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDashboard(
    scope: Construct,
    id: String,
    block: CfnDashboardDsl.() -> Unit = {},
  ): CfnDashboard {
    val builder = CfnDashboardDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnDashboardProps(block: CfnDashboardPropsDsl.() -> Unit = {}):
      CfnDashboardProps {
    val builder = CfnDashboardPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInsightRule(
    scope: Construct,
    id: String,
    block: CfnInsightRuleDsl.() -> Unit = {},
  ): CfnInsightRule {
    val builder = CfnInsightRuleDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnInsightRuleProps(block: CfnInsightRulePropsDsl.() -> Unit = {}):
      CfnInsightRuleProps {
    val builder = CfnInsightRulePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMetricStream(
    scope: Construct,
    id: String,
    block: CfnMetricStreamDsl.() -> Unit = {},
  ): CfnMetricStream {
    val builder = CfnMetricStreamDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMetricStreamMetricStreamFilterProperty(block: CfnMetricStreamMetricStreamFilterPropertyDsl.() -> Unit
      = {}): CfnMetricStream.MetricStreamFilterProperty {
    val builder = CfnMetricStreamMetricStreamFilterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMetricStreamMetricStreamStatisticsConfigurationProperty(block: CfnMetricStreamMetricStreamStatisticsConfigurationPropertyDsl.() -> Unit
      = {}): CfnMetricStream.MetricStreamStatisticsConfigurationProperty {
    val builder = CfnMetricStreamMetricStreamStatisticsConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnMetricStreamMetricStreamStatisticsMetricProperty(block: CfnMetricStreamMetricStreamStatisticsMetricPropertyDsl.() -> Unit
      = {}): CfnMetricStream.MetricStreamStatisticsMetricProperty {
    val builder = CfnMetricStreamMetricStreamStatisticsMetricPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnMetricStreamProps(block: CfnMetricStreamPropsDsl.() -> Unit = {}):
      CfnMetricStreamProps {
    val builder = CfnMetricStreamPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun commonMetricOptions(block: CommonMetricOptionsDsl.() -> Unit = {}):
      CommonMetricOptions {
    val builder = CommonMetricOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun compositeAlarm(
    scope: Construct,
    id: String,
    block: CompositeAlarmDsl.() -> Unit = {},
  ): CompositeAlarm {
    val builder = CompositeAlarmDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun compositeAlarmProps(block: CompositeAlarmPropsDsl.() -> Unit = {}):
      CompositeAlarmProps {
    val builder = CompositeAlarmPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun createAlarmOptions(block: CreateAlarmOptionsDsl.() -> Unit = {}):
      CreateAlarmOptions {
    val builder = CreateAlarmOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun customWidget(block: CustomWidgetDsl.() -> Unit = {}): CustomWidget {
    val builder = CustomWidgetDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun customWidgetProps(block: CustomWidgetPropsDsl.() -> Unit = {}):
      CustomWidgetProps {
    val builder = CustomWidgetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dashboard(
    scope: Construct,
    id: String,
    block: DashboardDsl.() -> Unit = {},
  ): Dashboard {
    val builder = DashboardDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun dashboardProps(block: DashboardPropsDsl.() -> Unit = {}): DashboardProps {
    val builder = DashboardPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun dimension(block: DimensionDsl.() -> Unit = {}): Dimension {
    val builder = DimensionDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun gaugeWidget(block: GaugeWidgetDsl.() -> Unit = {}): GaugeWidget {
    val builder = GaugeWidgetDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun gaugeWidgetProps(block: GaugeWidgetPropsDsl.() -> Unit = {}): GaugeWidgetProps {
    val builder = GaugeWidgetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun graphWidget(block: GraphWidgetDsl.() -> Unit = {}): GraphWidget {
    val builder = GraphWidgetDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun graphWidgetProps(block: GraphWidgetPropsDsl.() -> Unit = {}): GraphWidgetProps {
    val builder = GraphWidgetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun horizontalAnnotation(block: HorizontalAnnotationDsl.() -> Unit = {}):
      HorizontalAnnotation {
    val builder = HorizontalAnnotationDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun logQueryWidget(block: LogQueryWidgetDsl.() -> Unit = {}): LogQueryWidget {
    val builder = LogQueryWidgetDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun logQueryWidgetProps(block: LogQueryWidgetPropsDsl.() -> Unit = {}):
      LogQueryWidgetProps {
    val builder = LogQueryWidgetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun mathExpression(block: MathExpressionDsl.() -> Unit = {}): MathExpression {
    val builder = MathExpressionDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun mathExpressionOptions(block: MathExpressionOptionsDsl.() -> Unit = {}):
      MathExpressionOptions {
    val builder = MathExpressionOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun mathExpressionProps(block: MathExpressionPropsDsl.() -> Unit = {}):
      MathExpressionProps {
    val builder = MathExpressionPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun metric(block: MetricDsl.() -> Unit = {}): Metric {
    val builder = MetricDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun metricConfig(block: MetricConfigDsl.() -> Unit = {}): MetricConfig {
    val builder = MetricConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun metricExpressionConfig(block: MetricExpressionConfigDsl.() -> Unit = {}):
      MetricExpressionConfig {
    val builder = MetricExpressionConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun metricOptions(block: MetricOptionsDsl.() -> Unit = {}): MetricOptions {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun metricProps(block: MetricPropsDsl.() -> Unit = {}): MetricProps {
    val builder = MetricPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun metricStatConfig(block: MetricStatConfigDsl.() -> Unit = {}): MetricStatConfig {
    val builder = MetricStatConfigDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun metricWidgetProps(block: MetricWidgetPropsDsl.() -> Unit = {}):
      MetricWidgetProps {
    val builder = MetricWidgetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun singleValueWidget(block: SingleValueWidgetDsl.() -> Unit = {}):
      SingleValueWidget {
    val builder = SingleValueWidgetDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun singleValueWidgetProps(block: SingleValueWidgetPropsDsl.() -> Unit = {}):
      SingleValueWidgetProps {
    val builder = SingleValueWidgetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun spacer(block: SpacerDsl.() -> Unit = {}): Spacer {
    val builder = SpacerDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun spacerProps(block: SpacerPropsDsl.() -> Unit = {}): SpacerProps {
    val builder = SpacerPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun textWidget(block: TextWidgetDsl.() -> Unit = {}): TextWidget {
    val builder = TextWidgetDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun textWidgetProps(block: TextWidgetPropsDsl.() -> Unit = {}): TextWidgetProps {
    val builder = TextWidgetPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun yAxisProps(block: YAxisPropsDsl.() -> Unit = {}): YAxisProps {
    val builder = YAxisPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}

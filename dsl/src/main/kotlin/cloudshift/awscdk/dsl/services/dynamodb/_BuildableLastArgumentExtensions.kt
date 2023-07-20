@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.dsl.services.applicationautoscaling.ScalingScheduleDsl
import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable
import software.amazon.awscdk.services.dynamodb.CfnTable
import software.amazon.awscdk.services.dynamodb.IScalableTableAttribute
import software.amazon.awscdk.services.dynamodb.ITable
import software.amazon.awscdk.services.dynamodb.Table

public inline
    fun CfnGlobalTable.setSseSpecification(block: CfnGlobalTableSSESpecificationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnGlobalTableSSESpecificationPropertyDsl()
  builder.apply(block)
  return setSseSpecification(builder.build())
}

public inline
    fun CfnGlobalTable.setStreamSpecification(block: CfnGlobalTableStreamSpecificationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnGlobalTableStreamSpecificationPropertyDsl()
  builder.apply(block)
  return setStreamSpecification(builder.build())
}

public inline
    fun CfnGlobalTable.setTimeToLiveSpecification(block: CfnGlobalTableTimeToLiveSpecificationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnGlobalTableTimeToLiveSpecificationPropertyDsl()
  builder.apply(block)
  return setTimeToLiveSpecification(builder.build())
}

public inline
    fun CfnGlobalTable.setWriteProvisionedThroughputSettings(block: CfnGlobalTableWriteProvisionedThroughputSettingsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnGlobalTableWriteProvisionedThroughputSettingsPropertyDsl()
  builder.apply(block)
  return setWriteProvisionedThroughputSettings(builder.build())
}

public inline fun IScalableTableAttribute.scaleOnSchedule(arg0: String,
    block: ScalingScheduleDsl.() -> Unit = {}) {
  val builder = ScalingScheduleDsl()
  builder.apply(block)
  return scaleOnSchedule(arg0, builder.build())
}

public inline
    fun IScalableTableAttribute.scaleOnUtilization(block: UtilizationScalingPropsDsl.() -> Unit =
    {}) {
  val builder = UtilizationScalingPropsDsl()
  builder.apply(block)
  return scaleOnUtilization(builder.build())
}

public inline fun Table.addGlobalSecondaryIndex(block: GlobalSecondaryIndexPropsDsl.() -> Unit =
    {}) {
  val builder = GlobalSecondaryIndexPropsDsl()
  builder.apply(block)
  return addGlobalSecondaryIndex(builder.build())
}

public inline fun Table.addLocalSecondaryIndex(block: LocalSecondaryIndexPropsDsl.() -> Unit = {}) {
  val builder = LocalSecondaryIndexPropsDsl()
  builder.apply(block)
  return addLocalSecondaryIndex(builder.build())
}

public inline fun Table.autoScaleGlobalSecondaryIndexReadCapacity(indexName: String,
    block: EnableScalingPropsDsl.() -> Unit = {}): IScalableTableAttribute {
  val builder = EnableScalingPropsDsl()
  builder.apply(block)
  return autoScaleGlobalSecondaryIndexReadCapacity(indexName, builder.build())
}

public inline fun Table.autoScaleGlobalSecondaryIndexWriteCapacity(indexName: String,
    block: EnableScalingPropsDsl.() -> Unit = {}): IScalableTableAttribute {
  val builder = EnableScalingPropsDsl()
  builder.apply(block)
  return autoScaleGlobalSecondaryIndexWriteCapacity(indexName, builder.build())
}

public inline fun Table.autoScaleReadCapacity(block: EnableScalingPropsDsl.() -> Unit = {}):
    IScalableTableAttribute {
  val builder = EnableScalingPropsDsl()
  builder.apply(block)
  return autoScaleReadCapacity(builder.build())
}

public inline fun Table.autoScaleWriteCapacity(block: EnableScalingPropsDsl.() -> Unit = {}):
    IScalableTableAttribute {
  val builder = EnableScalingPropsDsl()
  builder.apply(block)
  return autoScaleWriteCapacity(builder.build())
}

public inline fun Table.metric(metricName: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, builder.build())
}

public inline fun Table.metricConditionalCheckFailedRequests(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricConditionalCheckFailedRequests(builder.build())
}

public inline fun Table.metricConsumedReadCapacityUnits(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricConsumedReadCapacityUnits(builder.build())
}

public inline fun Table.metricConsumedWriteCapacityUnits(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricConsumedWriteCapacityUnits(builder.build())
}

public inline fun Table.metricSuccessfulRequestLatency(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSuccessfulRequestLatency(builder.build())
}

public inline
    fun Table.metricSystemErrorsForOperations(block: SystemErrorsForOperationsMetricOptionsDsl.() -> Unit
    = {}): IMetric {
  val builder = SystemErrorsForOperationsMetricOptionsDsl()
  builder.apply(block)
  return metricSystemErrorsForOperations(builder.build())
}

public inline fun Table.metricThrottledRequests(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricThrottledRequests(builder.build())
}

public inline fun Table.metricThrottledRequestsForOperation(operation: String,
    block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricThrottledRequestsForOperation(operation, builder.build())
}

public inline
    fun Table.metricThrottledRequestsForOperations(block: OperationsMetricOptionsDsl.() -> Unit =
    {}): IMetric {
  val builder = OperationsMetricOptionsDsl()
  builder.apply(block)
  return metricThrottledRequestsForOperations(builder.build())
}

public inline fun Table.metricUserErrors(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricUserErrors(builder.build())
}

public inline
    fun CfnTable.setContributorInsightsSpecification(block: CfnTableContributorInsightsSpecificationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTableContributorInsightsSpecificationPropertyDsl()
  builder.apply(block)
  return setContributorInsightsSpecification(builder.build())
}

public inline
    fun CfnTable.setImportSourceSpecification(block: CfnTableImportSourceSpecificationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTableImportSourceSpecificationPropertyDsl()
  builder.apply(block)
  return setImportSourceSpecification(builder.build())
}

public inline
    fun CfnTable.setKinesisStreamSpecification(block: CfnTableKinesisStreamSpecificationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTableKinesisStreamSpecificationPropertyDsl()
  builder.apply(block)
  return setKinesisStreamSpecification(builder.build())
}

public inline
    fun CfnTable.setPointInTimeRecoverySpecification(block: CfnTablePointInTimeRecoverySpecificationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTablePointInTimeRecoverySpecificationPropertyDsl()
  builder.apply(block)
  return setPointInTimeRecoverySpecification(builder.build())
}

public inline
    fun CfnTable.setProvisionedThroughput(block: CfnTableProvisionedThroughputPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTableProvisionedThroughputPropertyDsl()
  builder.apply(block)
  return setProvisionedThroughput(builder.build())
}

public inline fun CfnTable.setSseSpecification(block: CfnTableSSESpecificationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTableSSESpecificationPropertyDsl()
  builder.apply(block)
  return setSseSpecification(builder.build())
}

public inline
    fun CfnTable.setStreamSpecification(block: CfnTableStreamSpecificationPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnTableStreamSpecificationPropertyDsl()
  builder.apply(block)
  return setStreamSpecification(builder.build())
}

public inline
    fun CfnTable.setTimeToLiveSpecification(block: CfnTableTimeToLiveSpecificationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnTableTimeToLiveSpecificationPropertyDsl()
  builder.apply(block)
  return setTimeToLiveSpecification(builder.build())
}

public inline fun ITable.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0, builder.build())
}

public inline fun ITable.metricConditionalCheckFailedRequests(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricConditionalCheckFailedRequests(builder.build())
}

public inline fun ITable.metricConsumedReadCapacityUnits(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricConsumedReadCapacityUnits(builder.build())
}

public inline fun ITable.metricConsumedWriteCapacityUnits(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricConsumedWriteCapacityUnits(builder.build())
}

public inline fun ITable.metricSuccessfulRequestLatency(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSuccessfulRequestLatency(builder.build())
}

public inline
    fun ITable.metricSystemErrorsForOperations(block: SystemErrorsForOperationsMetricOptionsDsl.() -> Unit
    = {}): IMetric {
  val builder = SystemErrorsForOperationsMetricOptionsDsl()
  builder.apply(block)
  return metricSystemErrorsForOperations(builder.build())
}

public inline fun ITable.metricThrottledRequests(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricThrottledRequests(builder.build())
}

public inline
    fun ITable.metricThrottledRequestsForOperations(block: OperationsMetricOptionsDsl.() -> Unit =
    {}): IMetric {
  val builder = OperationsMetricOptionsDsl()
  builder.apply(block)
  return metricThrottledRequestsForOperations(builder.build())
}

public inline fun ITable.metricUserErrors(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricUserErrors(builder.build())
}

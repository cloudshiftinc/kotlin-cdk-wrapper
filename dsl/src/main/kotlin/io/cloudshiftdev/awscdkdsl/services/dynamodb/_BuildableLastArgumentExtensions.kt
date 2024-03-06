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

package io.cloudshiftdev.awscdkdsl.services.dynamodb

import io.cloudshiftdev.awscdkdsl.services.applicationautoscaling.ScalingScheduleDsl
import io.cloudshiftdev.awscdkdsl.services.cloudwatch.MetricOptionsDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.IMetric
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.dynamodb.CfnGlobalTable
import software.amazon.awscdk.services.dynamodb.CfnTable
import software.amazon.awscdk.services.dynamodb.IScalableTableAttribute
import software.amazon.awscdk.services.dynamodb.ITable
import software.amazon.awscdk.services.dynamodb.Table
import software.amazon.awscdk.services.dynamodb.TableBase
import software.amazon.awscdk.services.dynamodb.TableBaseV2
import software.amazon.awscdk.services.dynamodb.TableV2

/** Specifies the settings to enable server-side encryption. */
public inline fun CfnGlobalTable.setSseSpecification(
    block: CfnGlobalTableSSESpecificationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnGlobalTableSSESpecificationPropertyDsl()
    builder.apply(block)
    return setSseSpecification(builder.build())
}

/** Specifies the streams settings on your global table. */
public inline fun CfnGlobalTable.setStreamSpecification(
    block: CfnGlobalTableStreamSpecificationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnGlobalTableStreamSpecificationPropertyDsl()
    builder.apply(block)
    return setStreamSpecification(builder.build())
}

/** Specifies the time to live (TTL) settings for the table. */
public inline fun CfnGlobalTable.setTimeToLiveSpecification(
    block: CfnGlobalTableTimeToLiveSpecificationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnGlobalTableTimeToLiveSpecificationPropertyDsl()
    builder.apply(block)
    return setTimeToLiveSpecification(builder.build())
}

/** Specifies an auto scaling policy for write capacity. */
public inline fun CfnGlobalTable.setWriteProvisionedThroughputSettings(
    block: CfnGlobalTableWriteProvisionedThroughputSettingsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnGlobalTableWriteProvisionedThroughputSettingsPropertyDsl()
    builder.apply(block)
    return setWriteProvisionedThroughputSettings(builder.build())
}

/**
 * The settings used to enable or disable CloudWatch Contributor Insights for the specified table.
 */
public inline fun CfnTable.setContributorInsightsSpecification(
    block: CfnTableContributorInsightsSpecificationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnTableContributorInsightsSpecificationPropertyDsl()
    builder.apply(block)
    return setContributorInsightsSpecification(builder.build())
}

/** Specifies the properties of data being imported from the S3 bucket source to the table. */
public inline fun CfnTable.setImportSourceSpecification(
    block: CfnTableImportSourceSpecificationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnTableImportSourceSpecificationPropertyDsl()
    builder.apply(block)
    return setImportSourceSpecification(builder.build())
}

/** The Kinesis Data Streams configuration for the specified table. */
public inline fun CfnTable.setKinesisStreamSpecification(
    block: CfnTableKinesisStreamSpecificationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnTableKinesisStreamSpecificationPropertyDsl()
    builder.apply(block)
    return setKinesisStreamSpecification(builder.build())
}

/** The settings used to enable point in time recovery. */
public inline fun CfnTable.setPointInTimeRecoverySpecification(
    block: CfnTablePointInTimeRecoverySpecificationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnTablePointInTimeRecoverySpecificationPropertyDsl()
    builder.apply(block)
    return setPointInTimeRecoverySpecification(builder.build())
}

/**
 * Throughput for the specified table, which consists of values for `ReadCapacityUnits` and
 * `WriteCapacityUnits` .
 */
public inline fun CfnTable.setProvisionedThroughput(
    block: CfnTableProvisionedThroughputPropertyDsl.() -> Unit = {}
) {
    val builder = CfnTableProvisionedThroughputPropertyDsl()
    builder.apply(block)
    return setProvisionedThroughput(builder.build())
}

/** Specifies the settings to enable server-side encryption. */
public inline fun CfnTable.setSseSpecification(
    block: CfnTableSSESpecificationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnTableSSESpecificationPropertyDsl()
    builder.apply(block)
    return setSseSpecification(builder.build())
}

/**
 * The settings for the DynamoDB table stream, which capture changes to items stored in the table.
 */
public inline fun CfnTable.setStreamSpecification(
    block: CfnTableStreamSpecificationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnTableStreamSpecificationPropertyDsl()
    builder.apply(block)
    return setStreamSpecification(builder.build())
}

/** Specifies the Time to Live (TTL) settings for the table. */
public inline fun CfnTable.setTimeToLiveSpecification(
    block: CfnTableTimeToLiveSpecificationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnTableTimeToLiveSpecificationPropertyDsl()
    builder.apply(block)
    return setTimeToLiveSpecification(builder.build())
}

/**
 * Add scheduled scaling for this scaling attribute.
 *
 * @param id
 * @param actions
 */
public inline fun IScalableTableAttribute.scaleOnSchedule(
    arg0: String,
    block: ScalingScheduleDsl.() -> Unit = {}
) {
    val builder = ScalingScheduleDsl()
    builder.apply(block)
    return scaleOnSchedule(arg0, builder.build())
}

/**
 * Scale out or in to keep utilization at a given level.
 *
 * @param props
 */
public inline fun IScalableTableAttribute.scaleOnUtilization(
    block: UtilizationScalingPropsDsl.() -> Unit = {}
) {
    val builder = UtilizationScalingPropsDsl()
    builder.apply(block)
    return scaleOnUtilization(builder.build())
}

/**
 * Metric for the number of Errors executing all Lambdas.
 *
 * @param metricName
 * @param props
 */
public inline fun ITable.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(arg0, builder.build())
}

/**
 * Metric for the conditional check failed requests.
 *
 * @param props properties of a metric.
 */
public inline fun ITable.metricConditionalCheckFailedRequests(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricConditionalCheckFailedRequests(builder.build())
}

/**
 * Metric for the consumed read capacity units.
 *
 * @param props properties of a metric.
 */
public inline fun ITable.metricConsumedReadCapacityUnits(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricConsumedReadCapacityUnits(builder.build())
}

/**
 * Metric for the consumed write capacity units.
 *
 * @param props properties of a metric.
 */
public inline fun ITable.metricConsumedWriteCapacityUnits(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricConsumedWriteCapacityUnits(builder.build())
}

/**
 * Metric for the successful request latency.
 *
 * @param props properties of a metric.
 */
public inline fun ITable.metricSuccessfulRequestLatency(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricSuccessfulRequestLatency(builder.build())
}

/**
 * Metric for the system errors this table.
 *
 * @param props properties of a metric.
 */
public inline fun ITable.metricSystemErrorsForOperations(
    block: SystemErrorsForOperationsMetricOptionsDsl.() -> Unit = {}
): IMetric {
    val builder = SystemErrorsForOperationsMetricOptionsDsl()
    builder.apply(block)
    return metricSystemErrorsForOperations(builder.build())
}

/**
 * (deprecated) Metric for throttled requests.
 *
 * @param props properties of a metric.
 * @deprecated use `metricThrottledRequestsForOperations`
 */
public inline fun ITable.metricThrottledRequests(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricThrottledRequests(builder.build())
}

/**
 * Metric for throttled requests.
 *
 * @param props properties of a metric.
 */
public inline fun ITable.metricThrottledRequestsForOperations(
    block: OperationsMetricOptionsDsl.() -> Unit = {}
): IMetric {
    val builder = OperationsMetricOptionsDsl()
    builder.apply(block)
    return metricThrottledRequestsForOperations(builder.build())
}

/**
 * Metric for the user errors.
 *
 * @param props properties of a metric.
 */
public inline fun ITable.metricUserErrors(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricUserErrors(builder.build())
}

/**
 * Add a global secondary index of table.
 *
 * @param props the property of global secondary index.
 */
public inline fun Table.addGlobalSecondaryIndex(
    block: GlobalSecondaryIndexPropsDsl.() -> Unit = {}
) {
    val builder = GlobalSecondaryIndexPropsDsl()
    builder.apply(block)
    return addGlobalSecondaryIndex(builder.build())
}

/**
 * Add a local secondary index of table.
 *
 * @param props the property of local secondary index.
 */
public inline fun Table.addLocalSecondaryIndex(block: LocalSecondaryIndexPropsDsl.() -> Unit = {}) {
    val builder = LocalSecondaryIndexPropsDsl()
    builder.apply(block)
    return addLocalSecondaryIndex(builder.build())
}

/**
 * Enable read capacity scaling for the given GSI.
 *
 * @param indexName
 * @param props
 * @return An object to configure additional AutoScaling settings for this attribute
 */
public inline fun Table.autoScaleGlobalSecondaryIndexReadCapacity(
    indexName: String,
    block: EnableScalingPropsDsl.() -> Unit = {}
): IScalableTableAttribute {
    val builder = EnableScalingPropsDsl()
    builder.apply(block)
    return autoScaleGlobalSecondaryIndexReadCapacity(indexName, builder.build())
}

/**
 * Enable write capacity scaling for the given GSI.
 *
 * @param indexName
 * @param props
 * @return An object to configure additional AutoScaling settings for this attribute
 */
public inline fun Table.autoScaleGlobalSecondaryIndexWriteCapacity(
    indexName: String,
    block: EnableScalingPropsDsl.() -> Unit = {}
): IScalableTableAttribute {
    val builder = EnableScalingPropsDsl()
    builder.apply(block)
    return autoScaleGlobalSecondaryIndexWriteCapacity(indexName, builder.build())
}

/**
 * Enable read capacity scaling for this table.
 *
 * @param props
 * @return An object to configure additional AutoScaling settings
 */
public inline fun Table.autoScaleReadCapacity(
    block: EnableScalingPropsDsl.() -> Unit = {}
): IScalableTableAttribute {
    val builder = EnableScalingPropsDsl()
    builder.apply(block)
    return autoScaleReadCapacity(builder.build())
}

/**
 * Enable write capacity scaling for this table.
 *
 * @param props
 * @return An object to configure additional AutoScaling settings for this attribute
 */
public inline fun Table.autoScaleWriteCapacity(
    block: EnableScalingPropsDsl.() -> Unit = {}
): IScalableTableAttribute {
    val builder = EnableScalingPropsDsl()
    builder.apply(block)
    return autoScaleWriteCapacity(builder.build())
}

/**
 * Return the given named metric for this Table.
 *
 * By default, the metric will be calculated as a sum over a period of 5 minutes. You can customize
 * this by using the `statistic` and `period` properties.
 *
 * @param metricName
 * @param props
 */
public inline fun TableBase.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

/**
 * Metric for the conditional check failed requests this table.
 *
 * By default, the metric will be calculated as a sum over a period of 5 minutes. You can customize
 * this by using the `statistic` and `period` properties.
 *
 * @param props
 */
public inline fun TableBase.metricConditionalCheckFailedRequests(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricConditionalCheckFailedRequests(builder.build())
}

/**
 * Metric for the consumed read capacity units this table.
 *
 * By default, the metric will be calculated as a sum over a period of 5 minutes. You can customize
 * this by using the `statistic` and `period` properties.
 *
 * @param props
 */
public inline fun TableBase.metricConsumedReadCapacityUnits(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricConsumedReadCapacityUnits(builder.build())
}

/**
 * Metric for the consumed write capacity units this table.
 *
 * By default, the metric will be calculated as a sum over a period of 5 minutes. You can customize
 * this by using the `statistic` and `period` properties.
 *
 * @param props
 */
public inline fun TableBase.metricConsumedWriteCapacityUnits(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricConsumedWriteCapacityUnits(builder.build())
}

/**
 * Metric for the successful request latency this table.
 *
 * By default, the metric will be calculated as an average over a period of 5 minutes. You can
 * customize this by using the `statistic` and `period` properties.
 *
 * @param props
 */
public inline fun TableBase.metricSuccessfulRequestLatency(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricSuccessfulRequestLatency(builder.build())
}

/**
 * (deprecated) Metric for the system errors this table.
 *
 * @param props
 * @deprecated use `metricSystemErrorsForOperations`.
 */
public inline fun TableBase.metricSystemErrors(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricSystemErrors(builder.build())
}

/**
 * Metric for the system errors this table.
 *
 * This will sum errors across all possible operations. Note that by default, each individual metric
 * will be calculated as a sum over a period of 5 minutes. You can customize this by using the
 * `statistic` and `period` properties.
 *
 * @param props
 */
public inline fun TableBase.metricSystemErrorsForOperations(
    block: SystemErrorsForOperationsMetricOptionsDsl.() -> Unit = {}
): IMetric {
    val builder = SystemErrorsForOperationsMetricOptionsDsl()
    builder.apply(block)
    return metricSystemErrorsForOperations(builder.build())
}

/**
 * (deprecated) How many requests are throttled on this table.
 *
 * Default: sum over 5 minutes
 *
 * @param props
 * @deprecated Do not use this function. It returns an invalid metric. Use
 *   `metricThrottledRequestsForOperation` instead.
 */
public inline fun TableBase.metricThrottledRequests(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricThrottledRequests(builder.build())
}

/**
 * How many requests are throttled on this table, for the given operation.
 *
 * Default: sum over 5 minutes
 *
 * @param operation
 * @param props
 */
public inline fun TableBase.metricThrottledRequestsForOperation(
    operation: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricThrottledRequestsForOperation(operation, builder.build())
}

/**
 * How many requests are throttled on this table.
 *
 * This will sum errors across all possible operations. Note that by default, each individual metric
 * will be calculated as a sum over a period of 5 minutes. You can customize this by using the
 * `statistic` and `period` properties.
 *
 * @param props
 */
public inline fun TableBase.metricThrottledRequestsForOperations(
    block: OperationsMetricOptionsDsl.() -> Unit = {}
): IMetric {
    val builder = OperationsMetricOptionsDsl()
    builder.apply(block)
    return metricThrottledRequestsForOperations(builder.build())
}

/**
 * Metric for the user errors.
 *
 * Note that this metric reports user errors across all the tables in the account and region the
 * table resides in.
 *
 * By default, the metric will be calculated as a sum over a period of 5 minutes. You can customize
 * this by using the `statistic` and `period` properties.
 *
 * @param props
 */
public inline fun TableBase.metricUserErrors(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricUserErrors(builder.build())
}

/**
 * Return the given named metric for this table.
 *
 * By default, the metric will be calculated as a sum over a period of 5 minutes. You can customize
 * this by using the `statistic` and `period` properties.
 *
 * @param metricName
 * @param props
 */
public inline fun TableBaseV2.metric(
    metricName: String,
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

/**
 * Metric for the conditional check failed requests for this table.
 *
 * By default, the metric will be calculated as a sum over a period of 5 minutes. You can customize
 * this by using the `statistic` and `period` properties.
 *
 * @param props
 */
public inline fun TableBaseV2.metricConditionalCheckFailedRequests(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricConditionalCheckFailedRequests(builder.build())
}

/**
 * Metric for the consumed read capacity units for this table.
 *
 * By default, the metric will be calculated as a sum over a period of 5 minutes. You can customize
 * this by using the `statistic` and `period` properties.
 *
 * @param props
 */
public inline fun TableBaseV2.metricConsumedReadCapacityUnits(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricConsumedReadCapacityUnits(builder.build())
}

/**
 * Metric for the consumed write capacity units for this table.
 *
 * By default, the metric will be calculated as a sum over a period of 5 minutes. You can customize
 * this by using the `statistic` and `period` properties.
 *
 * @param props
 */
public inline fun TableBaseV2.metricConsumedWriteCapacityUnits(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricConsumedWriteCapacityUnits(builder.build())
}

/**
 * Metric for the successful request latency for this table.
 *
 * By default, the metric will be calculated as an average over a period of 5 minutes. You can
 * customize this by using the `statistic` and `period` properties.
 *
 * @param props
 */
public inline fun TableBaseV2.metricSuccessfulRequestLatency(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricSuccessfulRequestLatency(builder.build())
}

/**
 * (deprecated) Metric for the system errors this table.
 *
 * @param props
 * @deprecated use `metricSystemErrorsForOperations`.
 */
public inline fun TableBaseV2.metricSystemErrors(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricSystemErrors(builder.build())
}

/**
 * Metric for the system errors for this table. This will sum errors across all possible operations.
 *
 * By default, each individual metric will be calculated as a sum over a period of 5 minutes. You
 * can customize this by using the `statistic` and `period` properties.
 *
 * @param props
 */
public inline fun TableBaseV2.metricSystemErrorsForOperations(
    block: SystemErrorsForOperationsMetricOptionsDsl.() -> Unit = {}
): IMetric {
    val builder = SystemErrorsForOperationsMetricOptionsDsl()
    builder.apply(block)
    return metricSystemErrorsForOperations(builder.build())
}

/**
 * (deprecated) How many requests are throttled on this table.
 *
 * By default, each individual metric will be calculated as a sum over a period of 5 minutes. You
 * can customize this by using the `statistic` and `period` properties.
 *
 * @param props
 * @deprecated Do not use this function. It returns an invalid metric. Use
 *   `metricThrottledRequestsForOperation` instead.
 */
public inline fun TableBaseV2.metricThrottledRequests(
    block: MetricOptionsDsl.() -> Unit = {}
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricThrottledRequests(builder.build())
}

/**
 * How many requests are throttled on this table for the given operation.
 *
 * By default, the metric will be calculated as an average over a period of 5 minutes. You can
 * customize this by using the `statistic` and `period` properties.
 *
 * @param operation
 * @param props
 */
public inline fun TableBaseV2.metricThrottledRequestsForOperation(
    operation: String,
    block: OperationsMetricOptionsDsl.() -> Unit = {}
): IMetric {
    val builder = OperationsMetricOptionsDsl()
    builder.apply(block)
    return metricThrottledRequestsForOperation(operation, builder.build())
}

/**
 * How many requests are throttled on this table. This will sum errors across all possible
 * operations.
 *
 * By default, each individual metric will be calculated as a sum over a period of 5 minutes. You
 * can customize this by using the `statistic` and `period` properties.
 *
 * @param props
 */
public inline fun TableBaseV2.metricThrottledRequestsForOperations(
    block: OperationsMetricOptionsDsl.() -> Unit = {}
): IMetric {
    val builder = OperationsMetricOptionsDsl()
    builder.apply(block)
    return metricThrottledRequestsForOperations(builder.build())
}

/**
 * Metric for the user errors for this table.
 *
 * Note: This metric reports user errors across all the tables in the account and region the table
 * resides in.
 *
 * By default, the metric will be calculated as a sum over a period of 5 minutes. You can customize
 * this by using the `statistic` and `period` properties.
 *
 * @param props
 */
public inline fun TableBaseV2.metricUserErrors(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricUserErrors(builder.build())
}

/**
 * Add a global secondary index to the table.
 *
 * Note: Global secondary indexes will be inherited by all replica tables.
 *
 * @param props the properties of the global secondary index.
 */
public inline fun TableV2.addGlobalSecondaryIndex(
    block: GlobalSecondaryIndexPropsV2Dsl.() -> Unit = {}
) {
    val builder = GlobalSecondaryIndexPropsV2Dsl()
    builder.apply(block)
    return addGlobalSecondaryIndex(builder.build())
}

/**
 * Add a local secondary index to the table.
 *
 * Note: Local secondary indexes will be inherited by all replica tables.
 *
 * @param props the properties of the local secondary index.
 */
public inline fun TableV2.addLocalSecondaryIndex(
    block: LocalSecondaryIndexPropsDsl.() -> Unit = {}
) {
    val builder = LocalSecondaryIndexPropsDsl()
    builder.apply(block)
    return addLocalSecondaryIndex(builder.build())
}

/**
 * Add a replica table.
 *
 * Note: Adding a replica table will allow you to use your table as a global table.
 *
 * @param props the properties of the replica table to add.
 */
public inline fun TableV2.addReplica(block: ReplicaTablePropsDsl.() -> Unit = {}) {
    val builder = ReplicaTablePropsDsl()
    builder.apply(block)
    return addReplica(builder.build())
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesis

import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.kinesis.CfnStream
import software.amazon.awscdk.services.kinesis.IStream
import software.amazon.awscdk.services.kinesis.Stream

public inline fun IStream.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0, builder.build())
}

public inline fun IStream.metricGetRecords(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricGetRecords(builder.build())
}

public inline fun IStream.metricGetRecordsBytes(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricGetRecordsBytes(builder.build())
}

public inline fun IStream.metricGetRecordsIteratorAgeMilliseconds(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricGetRecordsIteratorAgeMilliseconds(builder.build())
}

public inline fun IStream.metricGetRecordsLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricGetRecordsLatency(builder.build())
}

public inline fun IStream.metricGetRecordsSuccess(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricGetRecordsSuccess(builder.build())
}

public inline fun IStream.metricIncomingBytes(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricIncomingBytes(builder.build())
}

public inline fun IStream.metricIncomingRecords(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricIncomingRecords(builder.build())
}

public inline fun IStream.metricPutRecordBytes(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPutRecordBytes(builder.build())
}

public inline fun IStream.metricPutRecordLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPutRecordLatency(builder.build())
}

public inline fun IStream.metricPutRecordsBytes(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPutRecordsBytes(builder.build())
}

public inline fun IStream.metricPutRecordsFailedRecords(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPutRecordsFailedRecords(builder.build())
}

public inline fun IStream.metricPutRecordsLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPutRecordsLatency(builder.build())
}

public inline fun IStream.metricPutRecordsSuccess(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPutRecordsSuccess(builder.build())
}

public inline fun IStream.metricPutRecordsSuccessfulRecords(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPutRecordsSuccessfulRecords(builder.build())
}

public inline fun IStream.metricPutRecordsThrottledRecords(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPutRecordsThrottledRecords(builder.build())
}

public inline fun IStream.metricPutRecordsTotalRecords(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPutRecordsTotalRecords(builder.build())
}

public inline fun IStream.metricPutRecordSuccess(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPutRecordSuccess(builder.build())
}

public inline fun IStream.metricReadProvisionedThroughputExceeded(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricReadProvisionedThroughputExceeded(builder.build())
}

public inline
    fun IStream.metricWriteProvisionedThroughputExceeded(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricWriteProvisionedThroughputExceeded(builder.build())
}

/**
 * When specified, enables or updates server-side encryption using an AWS KMS key for a specified
 * stream.
 */
public inline
    fun CfnStream.setStreamEncryption(block: CfnStreamStreamEncryptionPropertyDsl.() -> Unit = {}) {
  val builder = CfnStreamStreamEncryptionPropertyDsl()
  builder.apply(block)
  return setStreamEncryption(builder.build())
}

/**
 * Specifies the capacity mode to which you want to set your data stream.
 */
public inline
    fun CfnStream.setStreamModeDetails(block: CfnStreamStreamModeDetailsPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnStreamStreamModeDetailsPropertyDsl()
  builder.apply(block)
  return setStreamModeDetails(builder.build())
}

/**
 * Return stream metric based from its metric name.
 *
 * @param metricName name of the stream metric. 
 * @param props properties of the metric.
 */
public inline fun Stream.metric(metricName: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, builder.build())
}

/**
 * The number of records retrieved from the shard, measured over the specified time period.
 *
 * Minimum, Maximum, and
 * Average statistics represent the records in a single GetRecords operation for the stream in the
 * specified time
 * period.
 *
 * average
 * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
 * `period` properties.
 *
 * @param props properties of the metric.
 */
public inline fun Stream.metricGetRecords(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricGetRecords(builder.build())
}

/**
 * The number of bytes retrieved from the Kinesis stream, measured over the specified time period.
 *
 * Minimum, Maximum,
 * and Average statistics represent the bytes in a single GetRecords operation for the stream in the
 * specified time
 * period.
 *
 * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
 * `period` properties.
 *
 * @param props properties of the metric.
 */
public inline fun Stream.metricGetRecordsBytes(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricGetRecordsBytes(builder.build())
}

/**
 * The age of the last record in all GetRecords calls made against a Kinesis stream, measured over
 * the specified time period.
 *
 * Age is the difference between the current time and when the last record of the GetRecords call
 * was written
 * to the stream. The Minimum and Maximum statistics can be used to track the progress of Kinesis
 * consumer
 * applications. A value of zero indicates that the records being read are completely caught up with
 * the stream.
 *
 * The metric defaults to maximum over 5 minutes, it can be changed by passing `statistic` and
 * `period` properties.
 *
 * @param props properties of the metric.
 */
public inline fun Stream.metricGetRecordsIteratorAgeMilliseconds(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricGetRecordsIteratorAgeMilliseconds(builder.build())
}

/**
 * The number of successful GetRecords operations per stream, measured over the specified time
 * period.
 *
 * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
 * `period` properties.
 *
 * @param props properties of the metric.
 */
public inline fun Stream.metricGetRecordsLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricGetRecordsLatency(builder.build())
}

/**
 * The number of successful GetRecords operations per stream, measured over the specified time
 * period.
 *
 * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
 * `period` properties.
 *
 * @param props properties of the metric.
 */
public inline fun Stream.metricGetRecordsSuccess(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricGetRecordsSuccess(builder.build())
}

/**
 * The number of bytes successfully put to the Kinesis stream over the specified time period.
 *
 * This metric includes
 * bytes from PutRecord and PutRecords operations. Minimum, Maximum, and Average statistics
 * represent the bytes in a
 * single put operation for the stream in the specified time period.
 *
 * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
 * `period` properties.
 *
 * @param props properties of the metric.
 */
public inline fun Stream.metricIncomingBytes(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricIncomingBytes(builder.build())
}

/**
 * The number of records successfully put to the Kinesis stream over the specified time period.
 *
 * This metric includes
 * record counts from PutRecord and PutRecords operations. Minimum, Maximum, and Average statistics
 * represent the
 * records in a single put operation for the stream in the specified time period.
 *
 * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
 * `period` properties.
 *
 * @param props properties of the metric.
 */
public inline fun Stream.metricIncomingRecords(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricIncomingRecords(builder.build())
}

/**
 * The number of bytes put to the Kinesis stream using the PutRecord operation over the specified
 * time period.
 *
 * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
 * `period` properties.
 *
 * @param props properties of the metric.
 */
public inline fun Stream.metricPutRecordBytes(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPutRecordBytes(builder.build())
}

/**
 * The time taken per PutRecord operation, measured over the specified time period.
 *
 * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
 * `period` properties.
 *
 * @param props properties of the metric.
 */
public inline fun Stream.metricPutRecordLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPutRecordLatency(builder.build())
}

/**
 * The number of bytes put to the Kinesis stream using the PutRecords operation over the specified
 * time period.
 *
 * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
 * `period` properties.
 *
 * @param props properties of the metric.
 */
public inline fun Stream.metricPutRecordsBytes(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPutRecordsBytes(builder.build())
}

/**
 * The number of records rejected due to internal failures in a PutRecords operation per Kinesis
 * data stream, measured over the specified time period.
 *
 * Occasional internal failures are to be expected and should be retried.
 *
 * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
 * `period` properties.
 *
 * @param props properties of the metric.
 */
public inline fun Stream.metricPutRecordsFailedRecords(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPutRecordsFailedRecords(builder.build())
}

/**
 * The time taken per PutRecords operation, measured over the specified time period.
 *
 * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
 * `period` properties.
 *
 * @param props properties of the metric.
 */
public inline fun Stream.metricPutRecordsLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPutRecordsLatency(builder.build())
}

/**
 * The number of PutRecords operations where at least one record succeeded, per Kinesis stream,
 * measured over the specified time period.
 *
 * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
 * `period` properties.
 *
 * @param props properties of the metric.
 */
public inline fun Stream.metricPutRecordsSuccess(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPutRecordsSuccess(builder.build())
}

/**
 * The number of successful records in a PutRecords operation per Kinesis data stream, measured over
 * the specified time period.
 *
 * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
 * `period` properties.
 *
 * @param props properties of the metric.
 */
public inline fun Stream.metricPutRecordsSuccessfulRecords(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPutRecordsSuccessfulRecords(builder.build())
}

/**
 * The number of records rejected due to throttling in a PutRecords operation per Kinesis data
 * stream, measured over the specified time period.
 *
 * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
 * `period` properties.
 *
 * @param props properties of the metric.
 */
public inline fun Stream.metricPutRecordsThrottledRecords(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPutRecordsThrottledRecords(builder.build())
}

/**
 * The total number of records sent in a PutRecords operation per Kinesis data stream, measured over
 * the specified time period.
 *
 * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
 * `period` properties.
 *
 * @param props properties of the metric.
 */
public inline fun Stream.metricPutRecordsTotalRecords(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPutRecordsTotalRecords(builder.build())
}

/**
 * The number of successful PutRecord operations per Kinesis stream, measured over the specified
 * time period.
 *
 * Average
 * reflects the percentage of successful writes to a stream.
 *
 * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
 * `period` properties.
 *
 * @param props properties of the metric.
 */
public inline fun Stream.metricPutRecordSuccess(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricPutRecordSuccess(builder.build())
}

/**
 * The number of GetRecords calls throttled for the stream over the specified time period.
 *
 * The most commonly used
 * statistic for this metric is Average.
 *
 * When the Minimum statistic has a value of 1, all records were throttled for the stream during the
 * specified time
 * period.
 *
 * When the Maximum statistic has a value of 0 (zero), no records were throttled for the stream
 * during the specified
 * time period.
 *
 * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
 * `period` properties
 *
 * @param props properties of the metric.
 */
public inline fun Stream.metricReadProvisionedThroughputExceeded(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricReadProvisionedThroughputExceeded(builder.build())
}

/**
 * The number of records rejected due to throttling for the stream over the specified time period.
 *
 * This metric
 * includes throttling from PutRecord and PutRecords operations.
 *
 * When the Minimum statistic has a non-zero value, records were being throttled for the stream
 * during the specified
 * time period.
 *
 * When the Maximum statistic has a value of 0 (zero), no records were being throttled for the
 * stream during the
 * specified time period.
 *
 * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
 * `period` properties.
 *
 * @param props properties of the metric.
 */
public inline fun Stream.metricWriteProvisionedThroughputExceeded(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricWriteProvisionedThroughputExceeded(builder.build())
}

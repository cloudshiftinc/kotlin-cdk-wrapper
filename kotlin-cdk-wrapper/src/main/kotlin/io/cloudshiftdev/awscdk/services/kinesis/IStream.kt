@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * A Kinesis Stream.
 */
public interface IStream : IResource {
  /**
   * Optional KMS encryption key associated with this stream.
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * Grant the indicated permissions on this stream to the provided IAM principal.
   *
   * @param grantee 
   * @param actions 
   */
  public fun grant(grantee: IGrantable, actions: String): Grant

  /**
   * Grant read permissions for this stream and its contents to an IAM principal (Role/Group/User).
   *
   * If an encryption key is used, permission to ues the key to decrypt the
   * contents of the stream will also be granted.
   *
   * @param grantee 
   */
  public fun grantRead(grantee: IGrantable): Grant

  /**
   * Grants read/write permissions for this stream and its contents to an IAM principal
   * (Role/Group/User).
   *
   * If an encryption key is used, permission to use the key for
   * encrypt/decrypt will also be granted.
   *
   * @param grantee 
   */
  public fun grantReadWrite(grantee: IGrantable): Grant

  /**
   * Grant write permissions for this stream and its contents to an IAM principal (Role/Group/User).
   *
   * If an encryption key is used, permission to ues the key to encrypt the
   * contents of the stream will also be granted.
   *
   * @param grantee 
   */
  public fun grantWrite(grantee: IGrantable): Grant

  /**
   * Return stream metric based from its metric name.
   *
   * @param metricName name of the stream metric. 
   * @param props properties of the metric.
   */
  public fun metric(metricName: String): Metric

  /**
   * Return stream metric based from its metric name.
   *
   * @param metricName name of the stream metric. 
   * @param props properties of the metric.
   */
  public fun metric(metricName: String, props: MetricOptions): Metric

  /**
   * Return stream metric based from its metric name.
   *
   * @param metricName name of the stream metric. 
   * @param props properties of the metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of records retrieved from the shard, measured over the specified time period.
   *
   * Minimum, Maximum, and
   * Average statistics represent the records in a single GetRecords operation for the stream in the
   * specified time
   * period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricGetRecords(): Metric

  /**
   * The number of records retrieved from the shard, measured over the specified time period.
   *
   * Minimum, Maximum, and
   * Average statistics represent the records in a single GetRecords operation for the stream in the
   * specified time
   * period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricGetRecords(props: MetricOptions): Metric

  /**
   * The number of records retrieved from the shard, measured over the specified time period.
   *
   * Minimum, Maximum, and
   * Average statistics represent the records in a single GetRecords operation for the stream in the
   * specified time
   * period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("64006eee3de241673b33ca50fcbe2a190cf733d041b096b91eacf214c4da625f")
  public fun metricGetRecords(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of bytes retrieved from the Kinesis stream, measured over the specified time period.
   *
   * Minimum, Maximum,
   * and Average statistics represent the bytes in a single GetRecords operation for the stream in
   * the specified time
   * period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricGetRecordsBytes(): Metric

  /**
   * The number of bytes retrieved from the Kinesis stream, measured over the specified time period.
   *
   * Minimum, Maximum,
   * and Average statistics represent the bytes in a single GetRecords operation for the stream in
   * the specified time
   * period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricGetRecordsBytes(props: MetricOptions): Metric

  /**
   * The number of bytes retrieved from the Kinesis stream, measured over the specified time period.
   *
   * Minimum, Maximum,
   * and Average statistics represent the bytes in a single GetRecords operation for the stream in
   * the specified time
   * period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0c201e1e1b082f7da088c00768805ea23f2c6564ac8cb80875b5de7c78514134")
  public fun metricGetRecordsBytes(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The age of the last record in all GetRecords calls made against a Kinesis stream, measured over
   * the specified time period.
   *
   * Age is the difference between the current time and when the last record of the GetRecords call
   * was written
   * to the stream. The Minimum and Maximum statistics can be used to track the progress of Kinesis
   * consumer
   * applications. A value of zero indicates that the records being read are completely caught up
   * with the stream.
   *
   * The metric defaults to maximum over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricGetRecordsIteratorAgeMilliseconds(): Metric

  /**
   * The age of the last record in all GetRecords calls made against a Kinesis stream, measured over
   * the specified time period.
   *
   * Age is the difference between the current time and when the last record of the GetRecords call
   * was written
   * to the stream. The Minimum and Maximum statistics can be used to track the progress of Kinesis
   * consumer
   * applications. A value of zero indicates that the records being read are completely caught up
   * with the stream.
   *
   * The metric defaults to maximum over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricGetRecordsIteratorAgeMilliseconds(props: MetricOptions): Metric

  /**
   * The age of the last record in all GetRecords calls made against a Kinesis stream, measured over
   * the specified time period.
   *
   * Age is the difference between the current time and when the last record of the GetRecords call
   * was written
   * to the stream. The Minimum and Maximum statistics can be used to track the progress of Kinesis
   * consumer
   * applications. A value of zero indicates that the records being read are completely caught up
   * with the stream.
   *
   * The metric defaults to maximum over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("02a5a0e08027fc281e8f0fe5ce577ec1d11588dc8b2031bd977ea08809fa6a95")
  public fun metricGetRecordsIteratorAgeMilliseconds(props: MetricOptions.Builder.() -> Unit):
      Metric

  /**
   * The time taken per GetRecords operation, measured over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricGetRecordsLatency(): Metric

  /**
   * The time taken per GetRecords operation, measured over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricGetRecordsLatency(props: MetricOptions): Metric

  /**
   * The time taken per GetRecords operation, measured over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a8ac5360653b93c88061d7fa148543d53b984abbf534bfbed8793178a04b3a57")
  public fun metricGetRecordsLatency(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of successful GetRecords operations per stream, measured over the specified time
   * period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricGetRecordsSuccess(): Metric

  /**
   * The number of successful GetRecords operations per stream, measured over the specified time
   * period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricGetRecordsSuccess(props: MetricOptions): Metric

  /**
   * The number of successful GetRecords operations per stream, measured over the specified time
   * period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bd242d326cb89e4b531dc3965afb07887520c4c52eac039511e13a6b7bcb6850")
  public fun metricGetRecordsSuccess(props: MetricOptions.Builder.() -> Unit): Metric

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
  public fun metricIncomingBytes(): Metric

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
  public fun metricIncomingBytes(props: MetricOptions): Metric

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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("289b17285610a67712940bcd7a3287676eb71631ba3f6c55430acb662300effc")
  public fun metricIncomingBytes(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of records successfully put to the Kinesis stream over the specified time period.
   *
   * This metric includes
   * record counts from PutRecord and PutRecords operations. Minimum, Maximum, and Average
   * statistics represent the
   * records in a single put operation for the stream in the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricIncomingRecords(): Metric

  /**
   * The number of records successfully put to the Kinesis stream over the specified time period.
   *
   * This metric includes
   * record counts from PutRecord and PutRecords operations. Minimum, Maximum, and Average
   * statistics represent the
   * records in a single put operation for the stream in the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricIncomingRecords(props: MetricOptions): Metric

  /**
   * The number of records successfully put to the Kinesis stream over the specified time period.
   *
   * This metric includes
   * record counts from PutRecord and PutRecords operations. Minimum, Maximum, and Average
   * statistics represent the
   * records in a single put operation for the stream in the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f4ba11c4c2e6ab05ada7dda41d9029150657f08075945ee195e353186840f177")
  public fun metricIncomingRecords(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of bytes put to the Kinesis stream using the PutRecord operation over the specified
   * time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricPutRecordBytes(): Metric

  /**
   * The number of bytes put to the Kinesis stream using the PutRecord operation over the specified
   * time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricPutRecordBytes(props: MetricOptions): Metric

  /**
   * The number of bytes put to the Kinesis stream using the PutRecord operation over the specified
   * time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("45d73df91071dfeb1fe24efe18340f4065b35bb552e776e1c007499a866431d1")
  public fun metricPutRecordBytes(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The time taken per PutRecord operation, measured over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricPutRecordLatency(): Metric

  /**
   * The time taken per PutRecord operation, measured over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricPutRecordLatency(props: MetricOptions): Metric

  /**
   * The time taken per PutRecord operation, measured over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2f1678f42d50100f83e5e0bd3bf61e97ae182b4045ddfdd91275c0dcc02cd021")
  public fun metricPutRecordLatency(props: MetricOptions.Builder.() -> Unit): Metric

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
  public fun metricPutRecordSuccess(): Metric

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
  public fun metricPutRecordSuccess(props: MetricOptions): Metric

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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6322bfd273c74c0431a8308d802e78231b2a8662c360b7b24a3750c1f8bdd289")
  public fun metricPutRecordSuccess(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of bytes put to the Kinesis stream using the PutRecords operation over the specified
   * time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricPutRecordsBytes(): Metric

  /**
   * The number of bytes put to the Kinesis stream using the PutRecords operation over the specified
   * time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricPutRecordsBytes(props: MetricOptions): Metric

  /**
   * The number of bytes put to the Kinesis stream using the PutRecords operation over the specified
   * time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7ea61d93cb0050691a3117d2e0ad7a86b09e141b97d29642f5a2c43cddf678d0")
  public fun metricPutRecordsBytes(props: MetricOptions.Builder.() -> Unit): Metric

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
  public fun metricPutRecordsFailedRecords(): Metric

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
  public fun metricPutRecordsFailedRecords(props: MetricOptions): Metric

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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("def3a22c4d69d1357a84df640d18e5e4c5f4d03285532f1be64c4836996f8b89")
  public fun metricPutRecordsFailedRecords(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The time taken per PutRecords operation, measured over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricPutRecordsLatency(): Metric

  /**
   * The time taken per PutRecords operation, measured over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricPutRecordsLatency(props: MetricOptions): Metric

  /**
   * The time taken per PutRecords operation, measured over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f4eae1c861d69a864a5096232da76e7ea92c86174f543a8fb31f7c6368187e00")
  public fun metricPutRecordsLatency(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of PutRecords operations where at least one record succeeded, per Kinesis stream,
   * measured over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricPutRecordsSuccess(): Metric

  /**
   * The number of PutRecords operations where at least one record succeeded, per Kinesis stream,
   * measured over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricPutRecordsSuccess(props: MetricOptions): Metric

  /**
   * The number of PutRecords operations where at least one record succeeded, per Kinesis stream,
   * measured over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8b869ce9256caf3107582795124c248443c2c8db0ee69b8a70f6e4cbf03dae2c")
  public fun metricPutRecordsSuccess(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of successful records in a PutRecords operation per Kinesis data stream, measured
   * over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricPutRecordsSuccessfulRecords(): Metric

  /**
   * The number of successful records in a PutRecords operation per Kinesis data stream, measured
   * over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricPutRecordsSuccessfulRecords(props: MetricOptions): Metric

  /**
   * The number of successful records in a PutRecords operation per Kinesis data stream, measured
   * over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fee6ceadc6edb0b112f728a1a8d40f41eec4dfe94b2ce4ccd15112e0561a232f")
  public fun metricPutRecordsSuccessfulRecords(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of records rejected due to throttling in a PutRecords operation per Kinesis data
   * stream, measured over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricPutRecordsThrottledRecords(): Metric

  /**
   * The number of records rejected due to throttling in a PutRecords operation per Kinesis data
   * stream, measured over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricPutRecordsThrottledRecords(props: MetricOptions): Metric

  /**
   * The number of records rejected due to throttling in a PutRecords operation per Kinesis data
   * stream, measured over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("826d8c97f079a6271aaf12665dbc757fd124a3d5cb429c194f523794a597f941")
  public fun metricPutRecordsThrottledRecords(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The total number of records sent in a PutRecords operation per Kinesis data stream, measured
   * over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricPutRecordsTotalRecords(): Metric

  /**
   * The total number of records sent in a PutRecords operation per Kinesis data stream, measured
   * over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public fun metricPutRecordsTotalRecords(props: MetricOptions): Metric

  /**
   * The total number of records sent in a PutRecords operation per Kinesis data stream, measured
   * over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9d694e2791776aebacae738c16dc15d91dc85abd391681f27833bfd15e1499e3")
  public fun metricPutRecordsTotalRecords(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of GetRecords calls throttled for the stream over the specified time period.
   *
   * The most commonly used
   * statistic for this metric is Average.
   *
   * When the Minimum statistic has a value of 1, all records were throttled for the stream during
   * the specified time
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
  public fun metricReadProvisionedThroughputExceeded(): Metric

  /**
   * The number of GetRecords calls throttled for the stream over the specified time period.
   *
   * The most commonly used
   * statistic for this metric is Average.
   *
   * When the Minimum statistic has a value of 1, all records were throttled for the stream during
   * the specified time
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
  public fun metricReadProvisionedThroughputExceeded(props: MetricOptions): Metric

  /**
   * The number of GetRecords calls throttled for the stream over the specified time period.
   *
   * The most commonly used
   * statistic for this metric is Average.
   *
   * When the Minimum statistic has a value of 1, all records were throttled for the stream during
   * the specified time
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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("985d8e4aa7daaea864279775c7e34dadc3af403718e0a2123e05cbe31fc03a86")
  public fun metricReadProvisionedThroughputExceeded(props: MetricOptions.Builder.() -> Unit):
      Metric

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
  public fun metricWriteProvisionedThroughputExceeded(): Metric

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
  public fun metricWriteProvisionedThroughputExceeded(props: MetricOptions): Metric

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
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2ba305b95279408f1d6a145e80f8f92a54467fbbabdad48078127bb57e32bb25")
  public fun metricWriteProvisionedThroughputExceeded(props: MetricOptions.Builder.() -> Unit):
      Metric

  /**
   * The ARN of the stream.
   */
  public fun streamArn(): String

  /**
   * The name of the stream.
   */
  public fun streamName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kinesis.IStream,
  ) : CdkObject(cdkObject), IStream {
    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
    }

    /**
     * Optional KMS encryption key associated with this stream.
     */
    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * Grant the indicated permissions on this stream to the provided IAM principal.
     *
     * @param grantee 
     * @param actions 
     */
    override fun grant(grantee: IGrantable, actions: String): Grant =
        unwrap(this).grant(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

    /**
     * Grant read permissions for this stream and its contents to an IAM principal
     * (Role/Group/User).
     *
     * If an encryption key is used, permission to ues the key to decrypt the
     * contents of the stream will also be granted.
     *
     * @param grantee 
     */
    override fun grantRead(grantee: IGrantable): Grant =
        unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Grants read/write permissions for this stream and its contents to an IAM principal
     * (Role/Group/User).
     *
     * If an encryption key is used, permission to use the key for
     * encrypt/decrypt will also be granted.
     *
     * @param grantee 
     */
    override fun grantReadWrite(grantee: IGrantable): Grant =
        unwrap(this).grantReadWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Grant write permissions for this stream and its contents to an IAM principal
     * (Role/Group/User).
     *
     * If an encryption key is used, permission to ues the key to encrypt the
     * contents of the stream will also be granted.
     *
     * @param grantee 
     */
    override fun grantWrite(grantee: IGrantable): Grant =
        unwrap(this).grantWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Return stream metric based from its metric name.
     *
     * @param metricName name of the stream metric. 
     * @param props properties of the metric.
     */
    override fun metric(metricName: String): Metric =
        unwrap(this).metric(metricName).let(Metric::wrap)

    /**
     * Return stream metric based from its metric name.
     *
     * @param metricName name of the stream metric. 
     * @param props properties of the metric.
     */
    override fun metric(metricName: String, props: MetricOptions): Metric =
        unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Return stream metric based from its metric name.
     *
     * @param metricName name of the stream metric. 
     * @param props properties of the metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
        metric(metricName, MetricOptions(props))

    /**
     * The number of records retrieved from the shard, measured over the specified time period.
     *
     * Minimum, Maximum, and
     * Average statistics represent the records in a single GetRecords operation for the stream in
     * the specified time
     * period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricGetRecords(): Metric = unwrap(this).metricGetRecords().let(Metric::wrap)

    /**
     * The number of records retrieved from the shard, measured over the specified time period.
     *
     * Minimum, Maximum, and
     * Average statistics represent the records in a single GetRecords operation for the stream in
     * the specified time
     * period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricGetRecords(props: MetricOptions): Metric =
        unwrap(this).metricGetRecords(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The number of records retrieved from the shard, measured over the specified time period.
     *
     * Minimum, Maximum, and
     * Average statistics represent the records in a single GetRecords operation for the stream in
     * the specified time
     * period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64006eee3de241673b33ca50fcbe2a190cf733d041b096b91eacf214c4da625f")
    override fun metricGetRecords(props: MetricOptions.Builder.() -> Unit): Metric =
        metricGetRecords(MetricOptions(props))

    /**
     * The number of bytes retrieved from the Kinesis stream, measured over the specified time
     * period.
     *
     * Minimum, Maximum,
     * and Average statistics represent the bytes in a single GetRecords operation for the stream in
     * the specified time
     * period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricGetRecordsBytes(): Metric =
        unwrap(this).metricGetRecordsBytes().let(Metric::wrap)

    /**
     * The number of bytes retrieved from the Kinesis stream, measured over the specified time
     * period.
     *
     * Minimum, Maximum,
     * and Average statistics represent the bytes in a single GetRecords operation for the stream in
     * the specified time
     * period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricGetRecordsBytes(props: MetricOptions): Metric =
        unwrap(this).metricGetRecordsBytes(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The number of bytes retrieved from the Kinesis stream, measured over the specified time
     * period.
     *
     * Minimum, Maximum,
     * and Average statistics represent the bytes in a single GetRecords operation for the stream in
     * the specified time
     * period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c201e1e1b082f7da088c00768805ea23f2c6564ac8cb80875b5de7c78514134")
    override fun metricGetRecordsBytes(props: MetricOptions.Builder.() -> Unit): Metric =
        metricGetRecordsBytes(MetricOptions(props))

    /**
     * The age of the last record in all GetRecords calls made against a Kinesis stream, measured
     * over the specified time period.
     *
     * Age is the difference between the current time and when the last record of the GetRecords
     * call was written
     * to the stream. The Minimum and Maximum statistics can be used to track the progress of
     * Kinesis consumer
     * applications. A value of zero indicates that the records being read are completely caught up
     * with the stream.
     *
     * The metric defaults to maximum over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricGetRecordsIteratorAgeMilliseconds(): Metric =
        unwrap(this).metricGetRecordsIteratorAgeMilliseconds().let(Metric::wrap)

    /**
     * The age of the last record in all GetRecords calls made against a Kinesis stream, measured
     * over the specified time period.
     *
     * Age is the difference between the current time and when the last record of the GetRecords
     * call was written
     * to the stream. The Minimum and Maximum statistics can be used to track the progress of
     * Kinesis consumer
     * applications. A value of zero indicates that the records being read are completely caught up
     * with the stream.
     *
     * The metric defaults to maximum over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricGetRecordsIteratorAgeMilliseconds(props: MetricOptions): Metric =
        unwrap(this).metricGetRecordsIteratorAgeMilliseconds(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The age of the last record in all GetRecords calls made against a Kinesis stream, measured
     * over the specified time period.
     *
     * Age is the difference between the current time and when the last record of the GetRecords
     * call was written
     * to the stream. The Minimum and Maximum statistics can be used to track the progress of
     * Kinesis consumer
     * applications. A value of zero indicates that the records being read are completely caught up
     * with the stream.
     *
     * The metric defaults to maximum over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02a5a0e08027fc281e8f0fe5ce577ec1d11588dc8b2031bd977ea08809fa6a95")
    override fun metricGetRecordsIteratorAgeMilliseconds(props: MetricOptions.Builder.() -> Unit):
        Metric = metricGetRecordsIteratorAgeMilliseconds(MetricOptions(props))

    /**
     * The time taken per GetRecords operation, measured over the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricGetRecordsLatency(): Metric =
        unwrap(this).metricGetRecordsLatency().let(Metric::wrap)

    /**
     * The time taken per GetRecords operation, measured over the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricGetRecordsLatency(props: MetricOptions): Metric =
        unwrap(this).metricGetRecordsLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The time taken per GetRecords operation, measured over the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a8ac5360653b93c88061d7fa148543d53b984abbf534bfbed8793178a04b3a57")
    override fun metricGetRecordsLatency(props: MetricOptions.Builder.() -> Unit): Metric =
        metricGetRecordsLatency(MetricOptions(props))

    /**
     * The number of successful GetRecords operations per stream, measured over the specified time
     * period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricGetRecordsSuccess(): Metric =
        unwrap(this).metricGetRecordsSuccess().let(Metric::wrap)

    /**
     * The number of successful GetRecords operations per stream, measured over the specified time
     * period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricGetRecordsSuccess(props: MetricOptions): Metric =
        unwrap(this).metricGetRecordsSuccess(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The number of successful GetRecords operations per stream, measured over the specified time
     * period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd242d326cb89e4b531dc3965afb07887520c4c52eac039511e13a6b7bcb6850")
    override fun metricGetRecordsSuccess(props: MetricOptions.Builder.() -> Unit): Metric =
        metricGetRecordsSuccess(MetricOptions(props))

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
    override fun metricIncomingBytes(): Metric =
        unwrap(this).metricIncomingBytes().let(Metric::wrap)

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
    override fun metricIncomingBytes(props: MetricOptions): Metric =
        unwrap(this).metricIncomingBytes(props.let(MetricOptions::unwrap)).let(Metric::wrap)

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("289b17285610a67712940bcd7a3287676eb71631ba3f6c55430acb662300effc")
    override fun metricIncomingBytes(props: MetricOptions.Builder.() -> Unit): Metric =
        metricIncomingBytes(MetricOptions(props))

    /**
     * The number of records successfully put to the Kinesis stream over the specified time period.
     *
     * This metric includes
     * record counts from PutRecord and PutRecords operations. Minimum, Maximum, and Average
     * statistics represent the
     * records in a single put operation for the stream in the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricIncomingRecords(): Metric =
        unwrap(this).metricIncomingRecords().let(Metric::wrap)

    /**
     * The number of records successfully put to the Kinesis stream over the specified time period.
     *
     * This metric includes
     * record counts from PutRecord and PutRecords operations. Minimum, Maximum, and Average
     * statistics represent the
     * records in a single put operation for the stream in the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricIncomingRecords(props: MetricOptions): Metric =
        unwrap(this).metricIncomingRecords(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The number of records successfully put to the Kinesis stream over the specified time period.
     *
     * This metric includes
     * record counts from PutRecord and PutRecords operations. Minimum, Maximum, and Average
     * statistics represent the
     * records in a single put operation for the stream in the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4ba11c4c2e6ab05ada7dda41d9029150657f08075945ee195e353186840f177")
    override fun metricIncomingRecords(props: MetricOptions.Builder.() -> Unit): Metric =
        metricIncomingRecords(MetricOptions(props))

    /**
     * The number of bytes put to the Kinesis stream using the PutRecord operation over the
     * specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricPutRecordBytes(): Metric =
        unwrap(this).metricPutRecordBytes().let(Metric::wrap)

    /**
     * The number of bytes put to the Kinesis stream using the PutRecord operation over the
     * specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricPutRecordBytes(props: MetricOptions): Metric =
        unwrap(this).metricPutRecordBytes(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The number of bytes put to the Kinesis stream using the PutRecord operation over the
     * specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45d73df91071dfeb1fe24efe18340f4065b35bb552e776e1c007499a866431d1")
    override fun metricPutRecordBytes(props: MetricOptions.Builder.() -> Unit): Metric =
        metricPutRecordBytes(MetricOptions(props))

    /**
     * The time taken per PutRecord operation, measured over the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricPutRecordLatency(): Metric =
        unwrap(this).metricPutRecordLatency().let(Metric::wrap)

    /**
     * The time taken per PutRecord operation, measured over the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricPutRecordLatency(props: MetricOptions): Metric =
        unwrap(this).metricPutRecordLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The time taken per PutRecord operation, measured over the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f1678f42d50100f83e5e0bd3bf61e97ae182b4045ddfdd91275c0dcc02cd021")
    override fun metricPutRecordLatency(props: MetricOptions.Builder.() -> Unit): Metric =
        metricPutRecordLatency(MetricOptions(props))

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
    override fun metricPutRecordSuccess(): Metric =
        unwrap(this).metricPutRecordSuccess().let(Metric::wrap)

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
    override fun metricPutRecordSuccess(props: MetricOptions): Metric =
        unwrap(this).metricPutRecordSuccess(props.let(MetricOptions::unwrap)).let(Metric::wrap)

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6322bfd273c74c0431a8308d802e78231b2a8662c360b7b24a3750c1f8bdd289")
    override fun metricPutRecordSuccess(props: MetricOptions.Builder.() -> Unit): Metric =
        metricPutRecordSuccess(MetricOptions(props))

    /**
     * The number of bytes put to the Kinesis stream using the PutRecords operation over the
     * specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricPutRecordsBytes(): Metric =
        unwrap(this).metricPutRecordsBytes().let(Metric::wrap)

    /**
     * The number of bytes put to the Kinesis stream using the PutRecords operation over the
     * specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricPutRecordsBytes(props: MetricOptions): Metric =
        unwrap(this).metricPutRecordsBytes(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The number of bytes put to the Kinesis stream using the PutRecords operation over the
     * specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ea61d93cb0050691a3117d2e0ad7a86b09e141b97d29642f5a2c43cddf678d0")
    override fun metricPutRecordsBytes(props: MetricOptions.Builder.() -> Unit): Metric =
        metricPutRecordsBytes(MetricOptions(props))

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
    override fun metricPutRecordsFailedRecords(): Metric =
        unwrap(this).metricPutRecordsFailedRecords().let(Metric::wrap)

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
    override fun metricPutRecordsFailedRecords(props: MetricOptions): Metric =
        unwrap(this).metricPutRecordsFailedRecords(props.let(MetricOptions::unwrap)).let(Metric::wrap)

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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("def3a22c4d69d1357a84df640d18e5e4c5f4d03285532f1be64c4836996f8b89")
    override fun metricPutRecordsFailedRecords(props: MetricOptions.Builder.() -> Unit): Metric =
        metricPutRecordsFailedRecords(MetricOptions(props))

    /**
     * The time taken per PutRecords operation, measured over the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricPutRecordsLatency(): Metric =
        unwrap(this).metricPutRecordsLatency().let(Metric::wrap)

    /**
     * The time taken per PutRecords operation, measured over the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricPutRecordsLatency(props: MetricOptions): Metric =
        unwrap(this).metricPutRecordsLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The time taken per PutRecords operation, measured over the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4eae1c861d69a864a5096232da76e7ea92c86174f543a8fb31f7c6368187e00")
    override fun metricPutRecordsLatency(props: MetricOptions.Builder.() -> Unit): Metric =
        metricPutRecordsLatency(MetricOptions(props))

    /**
     * The number of PutRecords operations where at least one record succeeded, per Kinesis stream,
     * measured over the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricPutRecordsSuccess(): Metric =
        unwrap(this).metricPutRecordsSuccess().let(Metric::wrap)

    /**
     * The number of PutRecords operations where at least one record succeeded, per Kinesis stream,
     * measured over the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricPutRecordsSuccess(props: MetricOptions): Metric =
        unwrap(this).metricPutRecordsSuccess(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The number of PutRecords operations where at least one record succeeded, per Kinesis stream,
     * measured over the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b869ce9256caf3107582795124c248443c2c8db0ee69b8a70f6e4cbf03dae2c")
    override fun metricPutRecordsSuccess(props: MetricOptions.Builder.() -> Unit): Metric =
        metricPutRecordsSuccess(MetricOptions(props))

    /**
     * The number of successful records in a PutRecords operation per Kinesis data stream, measured
     * over the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricPutRecordsSuccessfulRecords(): Metric =
        unwrap(this).metricPutRecordsSuccessfulRecords().let(Metric::wrap)

    /**
     * The number of successful records in a PutRecords operation per Kinesis data stream, measured
     * over the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricPutRecordsSuccessfulRecords(props: MetricOptions): Metric =
        unwrap(this).metricPutRecordsSuccessfulRecords(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The number of successful records in a PutRecords operation per Kinesis data stream, measured
     * over the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fee6ceadc6edb0b112f728a1a8d40f41eec4dfe94b2ce4ccd15112e0561a232f")
    override fun metricPutRecordsSuccessfulRecords(props: MetricOptions.Builder.() -> Unit): Metric
        = metricPutRecordsSuccessfulRecords(MetricOptions(props))

    /**
     * The number of records rejected due to throttling in a PutRecords operation per Kinesis data
     * stream, measured over the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricPutRecordsThrottledRecords(): Metric =
        unwrap(this).metricPutRecordsThrottledRecords().let(Metric::wrap)

    /**
     * The number of records rejected due to throttling in a PutRecords operation per Kinesis data
     * stream, measured over the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricPutRecordsThrottledRecords(props: MetricOptions): Metric =
        unwrap(this).metricPutRecordsThrottledRecords(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The number of records rejected due to throttling in a PutRecords operation per Kinesis data
     * stream, measured over the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("826d8c97f079a6271aaf12665dbc757fd124a3d5cb429c194f523794a597f941")
    override fun metricPutRecordsThrottledRecords(props: MetricOptions.Builder.() -> Unit): Metric =
        metricPutRecordsThrottledRecords(MetricOptions(props))

    /**
     * The total number of records sent in a PutRecords operation per Kinesis data stream, measured
     * over the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricPutRecordsTotalRecords(): Metric =
        unwrap(this).metricPutRecordsTotalRecords().let(Metric::wrap)

    /**
     * The total number of records sent in a PutRecords operation per Kinesis data stream, measured
     * over the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    override fun metricPutRecordsTotalRecords(props: MetricOptions): Metric =
        unwrap(this).metricPutRecordsTotalRecords(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The total number of records sent in a PutRecords operation per Kinesis data stream, measured
     * over the specified time period.
     *
     * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
     * `period` properties.
     *
     * @param props properties of the metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d694e2791776aebacae738c16dc15d91dc85abd391681f27833bfd15e1499e3")
    override fun metricPutRecordsTotalRecords(props: MetricOptions.Builder.() -> Unit): Metric =
        metricPutRecordsTotalRecords(MetricOptions(props))

    /**
     * The number of GetRecords calls throttled for the stream over the specified time period.
     *
     * The most commonly used
     * statistic for this metric is Average.
     *
     * When the Minimum statistic has a value of 1, all records were throttled for the stream during
     * the specified time
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
    override fun metricReadProvisionedThroughputExceeded(): Metric =
        unwrap(this).metricReadProvisionedThroughputExceeded().let(Metric::wrap)

    /**
     * The number of GetRecords calls throttled for the stream over the specified time period.
     *
     * The most commonly used
     * statistic for this metric is Average.
     *
     * When the Minimum statistic has a value of 1, all records were throttled for the stream during
     * the specified time
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
    override fun metricReadProvisionedThroughputExceeded(props: MetricOptions): Metric =
        unwrap(this).metricReadProvisionedThroughputExceeded(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The number of GetRecords calls throttled for the stream over the specified time period.
     *
     * The most commonly used
     * statistic for this metric is Average.
     *
     * When the Minimum statistic has a value of 1, all records were throttled for the stream during
     * the specified time
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("985d8e4aa7daaea864279775c7e34dadc3af403718e0a2123e05cbe31fc03a86")
    override fun metricReadProvisionedThroughputExceeded(props: MetricOptions.Builder.() -> Unit):
        Metric = metricReadProvisionedThroughputExceeded(MetricOptions(props))

    /**
     * The number of records rejected due to throttling for the stream over the specified time
     * period.
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
    override fun metricWriteProvisionedThroughputExceeded(): Metric =
        unwrap(this).metricWriteProvisionedThroughputExceeded().let(Metric::wrap)

    /**
     * The number of records rejected due to throttling for the stream over the specified time
     * period.
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
    override fun metricWriteProvisionedThroughputExceeded(props: MetricOptions): Metric =
        unwrap(this).metricWriteProvisionedThroughputExceeded(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * The number of records rejected due to throttling for the stream over the specified time
     * period.
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
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ba305b95279408f1d6a145e80f8f92a54467fbbabdad48078127bb57e32bb25")
    override fun metricWriteProvisionedThroughputExceeded(props: MetricOptions.Builder.() -> Unit):
        Metric = metricWriteProvisionedThroughputExceeded(MetricOptions(props))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * The ARN of the stream.
     */
    override fun streamArn(): String = unwrap(this).getStreamArn()

    /**
     * The name of the stream.
     */
    override fun streamName(): String = unwrap(this).getStreamName()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.IStream): IStream =
        CdkObjectWrappers.wrap(cdkObject) as? IStream ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStream): software.amazon.awscdk.services.kinesis.IStream =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.kinesis.IStream
  }
}

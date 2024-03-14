package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Stream internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.kinesis.Stream,
) : Resource(cdkObject), IStream {
  /**
   * Optional KMS encryption key associated with this stream.
   */
  public override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * Grant the indicated permissions on this stream to the given IAM principal (Role/Group/User).
   *
   * @param grantee 
   * @param actions 
   */
  public override fun grant(grantee: IGrantable, actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

  /**
   * Grant read permissions for this stream and its contents to an IAM principal (Role/Group/User).
   *
   * If an encryption key is used, permission to ues the key to decrypt the
   * contents of the stream will also be granted.
   *
   * @param grantee 
   */
  public override fun grantRead(grantee: IGrantable): Grant =
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
  public override fun grantReadWrite(grantee: IGrantable): Grant =
      unwrap(this).grantReadWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Grant write permissions for this stream and its contents to an IAM principal (Role/Group/User).
   *
   * If an encryption key is used, permission to ues the key to encrypt the
   * contents of the stream will also be granted.
   *
   * @param grantee 
   */
  public override fun grantWrite(grantee: IGrantable): Grant =
      unwrap(this).grantWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Return stream metric based from its metric name.
   *
   * @param metricName name of the stream metric. 
   * @param props properties of the metric.
   */
  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * Return stream metric based from its metric name.
   *
   * @param metricName name of the stream metric. 
   * @param props properties of the metric.
   */
  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Return stream metric based from its metric name.
   *
   * @param metricName name of the stream metric. 
   * @param props properties of the metric.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

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
  public override fun metricGetRecords(): Metric = unwrap(this).metricGetRecords().let(Metric::wrap)

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
  public override fun metricGetRecords(props: MetricOptions): Metric =
      unwrap(this).metricGetRecords(props.let(MetricOptions::unwrap)).let(Metric::wrap)

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
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("64006eee3de241673b33ca50fcbe2a190cf733d041b096b91eacf214c4da625f")
  public override fun metricGetRecords(props: MetricOptions.Builder.() -> Unit): Metric =
      metricGetRecords(MetricOptions(props))

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
  public override fun metricGetRecordsBytes(): Metric =
      unwrap(this).metricGetRecordsBytes().let(Metric::wrap)

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
  public override fun metricGetRecordsBytes(props: MetricOptions): Metric =
      unwrap(this).metricGetRecordsBytes(props.let(MetricOptions::unwrap)).let(Metric::wrap)

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
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0c201e1e1b082f7da088c00768805ea23f2c6564ac8cb80875b5de7c78514134")
  public override fun metricGetRecordsBytes(props: MetricOptions.Builder.() -> Unit): Metric =
      metricGetRecordsBytes(MetricOptions(props))

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
  public override fun metricGetRecordsIteratorAgeMilliseconds(): Metric =
      unwrap(this).metricGetRecordsIteratorAgeMilliseconds().let(Metric::wrap)

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
  public override fun metricGetRecordsIteratorAgeMilliseconds(props: MetricOptions): Metric =
      unwrap(this).metricGetRecordsIteratorAgeMilliseconds(props.let(MetricOptions::unwrap)).let(Metric::wrap)

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
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("02a5a0e08027fc281e8f0fe5ce577ec1d11588dc8b2031bd977ea08809fa6a95")
  public override
      fun metricGetRecordsIteratorAgeMilliseconds(props: MetricOptions.Builder.() -> Unit): Metric =
      metricGetRecordsIteratorAgeMilliseconds(MetricOptions(props))

  /**
   * The number of successful GetRecords operations per stream, measured over the specified time
   * period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public override fun metricGetRecordsLatency(): Metric =
      unwrap(this).metricGetRecordsLatency().let(Metric::wrap)

  /**
   * The number of successful GetRecords operations per stream, measured over the specified time
   * period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public override fun metricGetRecordsLatency(props: MetricOptions): Metric =
      unwrap(this).metricGetRecordsLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The number of successful GetRecords operations per stream, measured over the specified time
   * period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a8ac5360653b93c88061d7fa148543d53b984abbf534bfbed8793178a04b3a57")
  public override fun metricGetRecordsLatency(props: MetricOptions.Builder.() -> Unit): Metric =
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
  public override fun metricGetRecordsSuccess(): Metric =
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
  public override fun metricGetRecordsSuccess(props: MetricOptions): Metric =
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
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bd242d326cb89e4b531dc3965afb07887520c4c52eac039511e13a6b7bcb6850")
  public override fun metricGetRecordsSuccess(props: MetricOptions.Builder.() -> Unit): Metric =
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
  public override fun metricIncomingBytes(): Metric =
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
  public override fun metricIncomingBytes(props: MetricOptions): Metric =
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
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("289b17285610a67712940bcd7a3287676eb71631ba3f6c55430acb662300effc")
  public override fun metricIncomingBytes(props: MetricOptions.Builder.() -> Unit): Metric =
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
  public override fun metricIncomingRecords(): Metric =
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
  public override fun metricIncomingRecords(props: MetricOptions): Metric =
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
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f4ba11c4c2e6ab05ada7dda41d9029150657f08075945ee195e353186840f177")
  public override fun metricIncomingRecords(props: MetricOptions.Builder.() -> Unit): Metric =
      metricIncomingRecords(MetricOptions(props))

  /**
   * The number of bytes put to the Kinesis stream using the PutRecord operation over the specified
   * time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public override fun metricPutRecordBytes(): Metric =
      unwrap(this).metricPutRecordBytes().let(Metric::wrap)

  /**
   * The number of bytes put to the Kinesis stream using the PutRecord operation over the specified
   * time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public override fun metricPutRecordBytes(props: MetricOptions): Metric =
      unwrap(this).metricPutRecordBytes(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The number of bytes put to the Kinesis stream using the PutRecord operation over the specified
   * time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("45d73df91071dfeb1fe24efe18340f4065b35bb552e776e1c007499a866431d1")
  public override fun metricPutRecordBytes(props: MetricOptions.Builder.() -> Unit): Metric =
      metricPutRecordBytes(MetricOptions(props))

  /**
   * The time taken per PutRecord operation, measured over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public override fun metricPutRecordLatency(): Metric =
      unwrap(this).metricPutRecordLatency().let(Metric::wrap)

  /**
   * The time taken per PutRecord operation, measured over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public override fun metricPutRecordLatency(props: MetricOptions): Metric =
      unwrap(this).metricPutRecordLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The time taken per PutRecord operation, measured over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2f1678f42d50100f83e5e0bd3bf61e97ae182b4045ddfdd91275c0dcc02cd021")
  public override fun metricPutRecordLatency(props: MetricOptions.Builder.() -> Unit): Metric =
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
  public override fun metricPutRecordSuccess(): Metric =
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
  public override fun metricPutRecordSuccess(props: MetricOptions): Metric =
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
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6322bfd273c74c0431a8308d802e78231b2a8662c360b7b24a3750c1f8bdd289")
  public override fun metricPutRecordSuccess(props: MetricOptions.Builder.() -> Unit): Metric =
      metricPutRecordSuccess(MetricOptions(props))

  /**
   * The number of bytes put to the Kinesis stream using the PutRecords operation over the specified
   * time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public override fun metricPutRecordsBytes(): Metric =
      unwrap(this).metricPutRecordsBytes().let(Metric::wrap)

  /**
   * The number of bytes put to the Kinesis stream using the PutRecords operation over the specified
   * time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public override fun metricPutRecordsBytes(props: MetricOptions): Metric =
      unwrap(this).metricPutRecordsBytes(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The number of bytes put to the Kinesis stream using the PutRecords operation over the specified
   * time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7ea61d93cb0050691a3117d2e0ad7a86b09e141b97d29642f5a2c43cddf678d0")
  public override fun metricPutRecordsBytes(props: MetricOptions.Builder.() -> Unit): Metric =
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
  public override fun metricPutRecordsFailedRecords(): Metric =
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
  public override fun metricPutRecordsFailedRecords(props: MetricOptions): Metric =
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
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("def3a22c4d69d1357a84df640d18e5e4c5f4d03285532f1be64c4836996f8b89")
  public override fun metricPutRecordsFailedRecords(props: MetricOptions.Builder.() -> Unit): Metric
      = metricPutRecordsFailedRecords(MetricOptions(props))

  /**
   * The time taken per PutRecords operation, measured over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public override fun metricPutRecordsLatency(): Metric =
      unwrap(this).metricPutRecordsLatency().let(Metric::wrap)

  /**
   * The time taken per PutRecords operation, measured over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public override fun metricPutRecordsLatency(props: MetricOptions): Metric =
      unwrap(this).metricPutRecordsLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The time taken per PutRecords operation, measured over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f4eae1c861d69a864a5096232da76e7ea92c86174f543a8fb31f7c6368187e00")
  public override fun metricPutRecordsLatency(props: MetricOptions.Builder.() -> Unit): Metric =
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
  public override fun metricPutRecordsSuccess(): Metric =
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
  public override fun metricPutRecordsSuccess(props: MetricOptions): Metric =
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
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8b869ce9256caf3107582795124c248443c2c8db0ee69b8a70f6e4cbf03dae2c")
  public override fun metricPutRecordsSuccess(props: MetricOptions.Builder.() -> Unit): Metric =
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
  public override fun metricPutRecordsSuccessfulRecords(): Metric =
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
  public override fun metricPutRecordsSuccessfulRecords(props: MetricOptions): Metric =
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
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fee6ceadc6edb0b112f728a1a8d40f41eec4dfe94b2ce4ccd15112e0561a232f")
  public override fun metricPutRecordsSuccessfulRecords(props: MetricOptions.Builder.() -> Unit):
      Metric = metricPutRecordsSuccessfulRecords(MetricOptions(props))

  /**
   * The number of records rejected due to throttling in a PutRecords operation per Kinesis data
   * stream, measured over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public override fun metricPutRecordsThrottledRecords(): Metric =
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
  public override fun metricPutRecordsThrottledRecords(props: MetricOptions): Metric =
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
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("826d8c97f079a6271aaf12665dbc757fd124a3d5cb429c194f523794a597f941")
  public override fun metricPutRecordsThrottledRecords(props: MetricOptions.Builder.() -> Unit):
      Metric = metricPutRecordsThrottledRecords(MetricOptions(props))

  /**
   * The total number of records sent in a PutRecords operation per Kinesis data stream, measured
   * over the specified time period.
   *
   * The metric defaults to average over 5 minutes, it can be changed by passing `statistic` and
   * `period` properties.
   *
   * @param props properties of the metric.
   */
  public override fun metricPutRecordsTotalRecords(): Metric =
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
  public override fun metricPutRecordsTotalRecords(props: MetricOptions): Metric =
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
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9d694e2791776aebacae738c16dc15d91dc85abd391681f27833bfd15e1499e3")
  public override fun metricPutRecordsTotalRecords(props: MetricOptions.Builder.() -> Unit): Metric
      = metricPutRecordsTotalRecords(MetricOptions(props))

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
  public override fun metricReadProvisionedThroughputExceeded(): Metric =
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
  public override fun metricReadProvisionedThroughputExceeded(props: MetricOptions): Metric =
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
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("985d8e4aa7daaea864279775c7e34dadc3af403718e0a2123e05cbe31fc03a86")
  public override
      fun metricReadProvisionedThroughputExceeded(props: MetricOptions.Builder.() -> Unit): Metric =
      metricReadProvisionedThroughputExceeded(MetricOptions(props))

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
  public override fun metricWriteProvisionedThroughputExceeded(): Metric =
      unwrap(this).metricWriteProvisionedThroughputExceeded().let(Metric::wrap)

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
  public override fun metricWriteProvisionedThroughputExceeded(props: MetricOptions): Metric =
      unwrap(this).metricWriteProvisionedThroughputExceeded(props.let(MetricOptions::unwrap)).let(Metric::wrap)

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
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2ba305b95279408f1d6a145e80f8f92a54467fbbabdad48078127bb57e32bb25")
  public override
      fun metricWriteProvisionedThroughputExceeded(props: MetricOptions.Builder.() -> Unit): Metric
      = metricWriteProvisionedThroughputExceeded(MetricOptions(props))

  /**
   * The ARN of the stream.
   */
  public override fun streamArn(): String = unwrap(this).getStreamArn()

  /**
   * The name of the stream.
   */
  public override fun streamName(): String = unwrap(this).getStreamName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.kinesis.Stream].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The kind of server-side encryption to apply to this stream.
     *
     * If you choose KMS, you can specify a KMS key via `encryptionKey`. If
     * encryption key is not specified, a key will automatically be created.
     *
     * Default: - StreamEncryption.KMS if encrypted Streams are supported in the region
     * or StreamEncryption.UNENCRYPTED otherwise.
     * StreamEncryption.KMS if an encryption key is supplied through the encryptionKey property
     *
     * @param encryption The kind of server-side encryption to apply to this stream. 
     */
    public fun encryption(encryption: StreamEncryption)

    /**
     * External KMS key to use for stream encryption.
     *
     * The 'encryption' property must be set to "Kms".
     *
     * Default: - Kinesis Data Streams master key ('/alias/aws/kinesis').
     * If encryption is set to StreamEncryption.KMS and this property is undefined, a new KMS key
     * will be created and associated with this stream.
     *
     * @param encryptionKey External KMS key to use for stream encryption. 
     */
    public fun encryptionKey(encryptionKey: IKey)

    /**
     * The number of hours for the data records that are stored in shards to remain accessible.
     *
     * Default: Duration.hours(24)
     *
     * @param retentionPeriod The number of hours for the data records that are stored in shards to
     * remain accessible. 
     */
    public fun retentionPeriod(retentionPeriod: Duration)

    /**
     * The number of shards for the stream.
     *
     * Can only be provided if streamMode is Provisioned.
     *
     * Default: 1
     *
     * @param shardCount The number of shards for the stream. 
     */
    public fun shardCount(shardCount: Number)

    /**
     * The capacity mode of this stream.
     *
     * Default: StreamMode.PROVISIONED
     *
     * @param streamMode The capacity mode of this stream. 
     */
    public fun streamMode(streamMode: StreamMode)

    /**
     * Enforces a particular physical stream name.
     *
     * Default: <generated>
     *
     * @param streamName Enforces a particular physical stream name. 
     */
    public fun streamName(streamName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kinesis.Stream.Builder =
        software.amazon.awscdk.services.kinesis.Stream.Builder.create(scope, id)

    /**
     * The kind of server-side encryption to apply to this stream.
     *
     * If you choose KMS, you can specify a KMS key via `encryptionKey`. If
     * encryption key is not specified, a key will automatically be created.
     *
     * Default: - StreamEncryption.KMS if encrypted Streams are supported in the region
     * or StreamEncryption.UNENCRYPTED otherwise.
     * StreamEncryption.KMS if an encryption key is supplied through the encryptionKey property
     *
     * @param encryption The kind of server-side encryption to apply to this stream. 
     */
    override fun encryption(encryption: StreamEncryption) {
      cdkBuilder.encryption(encryption.let(StreamEncryption::unwrap))
    }

    /**
     * External KMS key to use for stream encryption.
     *
     * The 'encryption' property must be set to "Kms".
     *
     * Default: - Kinesis Data Streams master key ('/alias/aws/kinesis').
     * If encryption is set to StreamEncryption.KMS and this property is undefined, a new KMS key
     * will be created and associated with this stream.
     *
     * @param encryptionKey External KMS key to use for stream encryption. 
     */
    override fun encryptionKey(encryptionKey: IKey) {
      cdkBuilder.encryptionKey(encryptionKey.let(IKey::unwrap))
    }

    /**
     * The number of hours for the data records that are stored in shards to remain accessible.
     *
     * Default: Duration.hours(24)
     *
     * @param retentionPeriod The number of hours for the data records that are stored in shards to
     * remain accessible. 
     */
    override fun retentionPeriod(retentionPeriod: Duration) {
      cdkBuilder.retentionPeriod(retentionPeriod.let(Duration::unwrap))
    }

    /**
     * The number of shards for the stream.
     *
     * Can only be provided if streamMode is Provisioned.
     *
     * Default: 1
     *
     * @param shardCount The number of shards for the stream. 
     */
    override fun shardCount(shardCount: Number) {
      cdkBuilder.shardCount(shardCount)
    }

    /**
     * The capacity mode of this stream.
     *
     * Default: StreamMode.PROVISIONED
     *
     * @param streamMode The capacity mode of this stream. 
     */
    override fun streamMode(streamMode: StreamMode) {
      cdkBuilder.streamMode(streamMode.let(StreamMode::unwrap))
    }

    /**
     * Enforces a particular physical stream name.
     *
     * Default: <generated>
     *
     * @param streamName Enforces a particular physical stream name. 
     */
    override fun streamName(streamName: String) {
      cdkBuilder.streamName(streamName)
    }

    public fun build(): software.amazon.awscdk.services.kinesis.Stream = cdkBuilder.build()
  }

  public companion object {
    public fun fromStreamArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      streamArn: String,
    ): IStream =
        software.amazon.awscdk.services.kinesis.Stream.fromStreamArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, streamArn).let(IStream::wrap)

    public fun fromStreamAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: StreamAttributes,
    ): IStream =
        software.amazon.awscdk.services.kinesis.Stream.fromStreamAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(StreamAttributes::unwrap)).let(IStream::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef7ebd7feb27a37dfb1f0d6a36bd8d7bb4dbab3fa2f42817390c0e4d58ae82cf")
    public fun fromStreamAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: StreamAttributes.Builder.() -> Unit,
    ): IStream = fromStreamAttributes(scope, id, StreamAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Stream {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Stream(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.Stream): Stream =
        Stream(cdkObject)

    internal fun unwrap(wrapped: Stream): software.amazon.awscdk.services.kinesis.Stream =
        wrapped.cdkObject
  }
}

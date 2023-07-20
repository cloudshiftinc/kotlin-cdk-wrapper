@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.kinesis

import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.kinesis.CfnStream
import software.amazon.awscdk.services.kinesis.IStream
import software.amazon.awscdk.services.kinesis.Stream
import kotlin.String
import kotlin.Unit

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

public inline fun IStream.metricGetRecordsIteratorAgeMilliseconds(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
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

public inline fun IStream.metricPutRecordsFailedRecords(block: MetricOptionsDsl.() -> Unit = {}): Metric {
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

public inline fun IStream.metricPutRecordsSuccessfulRecords(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricPutRecordsSuccessfulRecords(builder.build())
}

public inline fun IStream.metricPutRecordsThrottledRecords(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricPutRecordsThrottledRecords(builder.build())
}

public inline fun IStream.metricPutRecordsTotalRecords(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricPutRecordsTotalRecords(builder.build())
}

public inline fun IStream.metricPutRecordSuccess(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricPutRecordSuccess(builder.build())
}

public inline fun IStream.metricReadProvisionedThroughputExceeded(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricReadProvisionedThroughputExceeded(builder.build())
}

public inline fun IStream.metricWriteProvisionedThroughputExceeded(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricWriteProvisionedThroughputExceeded(builder.build())
}

public inline fun CfnStream.setStreamEncryption(block: CfnStreamStreamEncryptionPropertyDsl.() -> Unit = {}) {
    val builder = CfnStreamStreamEncryptionPropertyDsl()
    builder.apply(block)
    return setStreamEncryption(builder.build())
}

public inline fun CfnStream.setStreamModeDetails(
    block: CfnStreamStreamModeDetailsPropertyDsl.() -> Unit =
        {},
) {
    val builder = CfnStreamStreamModeDetailsPropertyDsl()
    builder.apply(block)
    return setStreamModeDetails(builder.build())
}

public inline fun Stream.metric(metricName: String, block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metric(metricName, builder.build())
}

public inline fun Stream.metricGetRecords(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricGetRecords(builder.build())
}

public inline fun Stream.metricGetRecordsBytes(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricGetRecordsBytes(builder.build())
}

public inline fun Stream.metricGetRecordsIteratorAgeMilliseconds(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricGetRecordsIteratorAgeMilliseconds(builder.build())
}

public inline fun Stream.metricGetRecordsLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricGetRecordsLatency(builder.build())
}

public inline fun Stream.metricGetRecordsSuccess(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricGetRecordsSuccess(builder.build())
}

public inline fun Stream.metricIncomingBytes(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricIncomingBytes(builder.build())
}

public inline fun Stream.metricIncomingRecords(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricIncomingRecords(builder.build())
}

public inline fun Stream.metricPutRecordBytes(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricPutRecordBytes(builder.build())
}

public inline fun Stream.metricPutRecordLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricPutRecordLatency(builder.build())
}

public inline fun Stream.metricPutRecordsBytes(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricPutRecordsBytes(builder.build())
}

public inline fun Stream.metricPutRecordsFailedRecords(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricPutRecordsFailedRecords(builder.build())
}

public inline fun Stream.metricPutRecordsLatency(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricPutRecordsLatency(builder.build())
}

public inline fun Stream.metricPutRecordsSuccess(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricPutRecordsSuccess(builder.build())
}

public inline fun Stream.metricPutRecordsSuccessfulRecords(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricPutRecordsSuccessfulRecords(builder.build())
}

public inline fun Stream.metricPutRecordsThrottledRecords(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricPutRecordsThrottledRecords(builder.build())
}

public inline fun Stream.metricPutRecordsTotalRecords(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricPutRecordsTotalRecords(builder.build())
}

public inline fun Stream.metricPutRecordSuccess(block: MetricOptionsDsl.() -> Unit = {}): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricPutRecordSuccess(builder.build())
}

public inline fun Stream.metricReadProvisionedThroughputExceeded(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricReadProvisionedThroughputExceeded(builder.build())
}

public inline fun Stream.metricWriteProvisionedThroughputExceeded(
    block: MetricOptionsDsl.() -> Unit =
        {},
): Metric {
    val builder = MetricOptionsDsl()
    builder.apply(block)
    return metricWriteProvisionedThroughputExceeded(builder.build())
}

package io.cloudshiftdev.awscdk.services.kinesis

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IStream : IResource {
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  public fun grant(arg0: IGrantable, arg1: String): Grant

  public fun grantRead(arg0: IGrantable): Grant

  public fun grantReadWrite(arg0: IGrantable): Grant

  public fun grantWrite(arg0: IGrantable): Grant

  public fun metric(arg0: String): Metric

  public fun metric(arg0: String, arg1: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric

  public fun metricGetRecords(): Metric

  public fun metricGetRecords(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("64006eee3de241673b33ca50fcbe2a190cf733d041b096b91eacf214c4da625f")
  public fun metricGetRecords(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricGetRecordsBytes(): Metric

  public fun metricGetRecordsBytes(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0c201e1e1b082f7da088c00768805ea23f2c6564ac8cb80875b5de7c78514134")
  public fun metricGetRecordsBytes(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricGetRecordsIteratorAgeMilliseconds(): Metric

  public fun metricGetRecordsIteratorAgeMilliseconds(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("02a5a0e08027fc281e8f0fe5ce577ec1d11588dc8b2031bd977ea08809fa6a95")
  public fun metricGetRecordsIteratorAgeMilliseconds(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricGetRecordsLatency(): Metric

  public fun metricGetRecordsLatency(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a8ac5360653b93c88061d7fa148543d53b984abbf534bfbed8793178a04b3a57")
  public fun metricGetRecordsLatency(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricGetRecordsSuccess(): Metric

  public fun metricGetRecordsSuccess(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bd242d326cb89e4b531dc3965afb07887520c4c52eac039511e13a6b7bcb6850")
  public fun metricGetRecordsSuccess(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricIncomingBytes(): Metric

  public fun metricIncomingBytes(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("289b17285610a67712940bcd7a3287676eb71631ba3f6c55430acb662300effc")
  public fun metricIncomingBytes(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricIncomingRecords(): Metric

  public fun metricIncomingRecords(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f4ba11c4c2e6ab05ada7dda41d9029150657f08075945ee195e353186840f177")
  public fun metricIncomingRecords(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricPutRecordBytes(): Metric

  public fun metricPutRecordBytes(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("45d73df91071dfeb1fe24efe18340f4065b35bb552e776e1c007499a866431d1")
  public fun metricPutRecordBytes(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricPutRecordLatency(): Metric

  public fun metricPutRecordLatency(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2f1678f42d50100f83e5e0bd3bf61e97ae182b4045ddfdd91275c0dcc02cd021")
  public fun metricPutRecordLatency(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricPutRecordSuccess(): Metric

  public fun metricPutRecordSuccess(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6322bfd273c74c0431a8308d802e78231b2a8662c360b7b24a3750c1f8bdd289")
  public fun metricPutRecordSuccess(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricPutRecordsBytes(): Metric

  public fun metricPutRecordsBytes(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7ea61d93cb0050691a3117d2e0ad7a86b09e141b97d29642f5a2c43cddf678d0")
  public fun metricPutRecordsBytes(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricPutRecordsFailedRecords(): Metric

  public fun metricPutRecordsFailedRecords(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("def3a22c4d69d1357a84df640d18e5e4c5f4d03285532f1be64c4836996f8b89")
  public fun metricPutRecordsFailedRecords(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricPutRecordsLatency(): Metric

  public fun metricPutRecordsLatency(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f4eae1c861d69a864a5096232da76e7ea92c86174f543a8fb31f7c6368187e00")
  public fun metricPutRecordsLatency(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricPutRecordsSuccess(): Metric

  public fun metricPutRecordsSuccess(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8b869ce9256caf3107582795124c248443c2c8db0ee69b8a70f6e4cbf03dae2c")
  public fun metricPutRecordsSuccess(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricPutRecordsSuccessfulRecords(): Metric

  public fun metricPutRecordsSuccessfulRecords(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fee6ceadc6edb0b112f728a1a8d40f41eec4dfe94b2ce4ccd15112e0561a232f")
  public fun metricPutRecordsSuccessfulRecords(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricPutRecordsThrottledRecords(): Metric

  public fun metricPutRecordsThrottledRecords(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("826d8c97f079a6271aaf12665dbc757fd124a3d5cb429c194f523794a597f941")
  public fun metricPutRecordsThrottledRecords(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricPutRecordsTotalRecords(): Metric

  public fun metricPutRecordsTotalRecords(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9d694e2791776aebacae738c16dc15d91dc85abd391681f27833bfd15e1499e3")
  public fun metricPutRecordsTotalRecords(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricReadProvisionedThroughputExceeded(): Metric

  public fun metricReadProvisionedThroughputExceeded(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("985d8e4aa7daaea864279775c7e34dadc3af403718e0a2123e05cbe31fc03a86")
  public fun metricReadProvisionedThroughputExceeded(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricWriteProvisionedThroughputExceeded(): Metric

  public fun metricWriteProvisionedThroughputExceeded(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2ba305b95279408f1d6a145e80f8f92a54467fbbabdad48078127bb57e32bb25")
  public fun metricWriteProvisionedThroughputExceeded(arg0: MetricOptions.Builder.() -> Unit):
      Metric

  public fun streamArn(): String

  public fun streamName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.kinesis.IStream,
  ) : IStream {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grant(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grant(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    override fun grantRead(arg0: IGrantable): Grant =
        unwrap(this).grantRead(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantReadWrite(arg0: IGrantable): Grant =
        unwrap(this).grantReadWrite(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantWrite(arg0: IGrantable): Grant =
        unwrap(this).grantWrite(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun metric(arg0: String): Metric = unwrap(this).metric(arg0).let(Metric::wrap)

    override fun metric(arg0: String, arg1: MetricOptions): Metric = unwrap(this).metric(arg0,
        arg1.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric = metric(arg0,
        MetricOptions(arg1))

    override fun metricGetRecords(): Metric = unwrap(this).metricGetRecords().let(Metric::wrap)

    override fun metricGetRecords(arg0: MetricOptions): Metric =
        unwrap(this).metricGetRecords(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64006eee3de241673b33ca50fcbe2a190cf733d041b096b91eacf214c4da625f")
    override fun metricGetRecords(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricGetRecords(MetricOptions(arg0))

    override fun metricGetRecordsBytes(): Metric =
        unwrap(this).metricGetRecordsBytes().let(Metric::wrap)

    override fun metricGetRecordsBytes(arg0: MetricOptions): Metric =
        unwrap(this).metricGetRecordsBytes(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c201e1e1b082f7da088c00768805ea23f2c6564ac8cb80875b5de7c78514134")
    override fun metricGetRecordsBytes(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricGetRecordsBytes(MetricOptions(arg0))

    override fun metricGetRecordsIteratorAgeMilliseconds(): Metric =
        unwrap(this).metricGetRecordsIteratorAgeMilliseconds().let(Metric::wrap)

    override fun metricGetRecordsIteratorAgeMilliseconds(arg0: MetricOptions): Metric =
        unwrap(this).metricGetRecordsIteratorAgeMilliseconds(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02a5a0e08027fc281e8f0fe5ce577ec1d11588dc8b2031bd977ea08809fa6a95")
    override fun metricGetRecordsIteratorAgeMilliseconds(arg0: MetricOptions.Builder.() -> Unit):
        Metric = metricGetRecordsIteratorAgeMilliseconds(MetricOptions(arg0))

    override fun metricGetRecordsLatency(): Metric =
        unwrap(this).metricGetRecordsLatency().let(Metric::wrap)

    override fun metricGetRecordsLatency(arg0: MetricOptions): Metric =
        unwrap(this).metricGetRecordsLatency(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a8ac5360653b93c88061d7fa148543d53b984abbf534bfbed8793178a04b3a57")
    override fun metricGetRecordsLatency(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricGetRecordsLatency(MetricOptions(arg0))

    override fun metricGetRecordsSuccess(): Metric =
        unwrap(this).metricGetRecordsSuccess().let(Metric::wrap)

    override fun metricGetRecordsSuccess(arg0: MetricOptions): Metric =
        unwrap(this).metricGetRecordsSuccess(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bd242d326cb89e4b531dc3965afb07887520c4c52eac039511e13a6b7bcb6850")
    override fun metricGetRecordsSuccess(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricGetRecordsSuccess(MetricOptions(arg0))

    override fun metricIncomingBytes(): Metric =
        unwrap(this).metricIncomingBytes().let(Metric::wrap)

    override fun metricIncomingBytes(arg0: MetricOptions): Metric =
        unwrap(this).metricIncomingBytes(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("289b17285610a67712940bcd7a3287676eb71631ba3f6c55430acb662300effc")
    override fun metricIncomingBytes(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricIncomingBytes(MetricOptions(arg0))

    override fun metricIncomingRecords(): Metric =
        unwrap(this).metricIncomingRecords().let(Metric::wrap)

    override fun metricIncomingRecords(arg0: MetricOptions): Metric =
        unwrap(this).metricIncomingRecords(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4ba11c4c2e6ab05ada7dda41d9029150657f08075945ee195e353186840f177")
    override fun metricIncomingRecords(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricIncomingRecords(MetricOptions(arg0))

    override fun metricPutRecordBytes(): Metric =
        unwrap(this).metricPutRecordBytes().let(Metric::wrap)

    override fun metricPutRecordBytes(arg0: MetricOptions): Metric =
        unwrap(this).metricPutRecordBytes(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("45d73df91071dfeb1fe24efe18340f4065b35bb552e776e1c007499a866431d1")
    override fun metricPutRecordBytes(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricPutRecordBytes(MetricOptions(arg0))

    override fun metricPutRecordLatency(): Metric =
        unwrap(this).metricPutRecordLatency().let(Metric::wrap)

    override fun metricPutRecordLatency(arg0: MetricOptions): Metric =
        unwrap(this).metricPutRecordLatency(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2f1678f42d50100f83e5e0bd3bf61e97ae182b4045ddfdd91275c0dcc02cd021")
    override fun metricPutRecordLatency(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricPutRecordLatency(MetricOptions(arg0))

    override fun metricPutRecordSuccess(): Metric =
        unwrap(this).metricPutRecordSuccess().let(Metric::wrap)

    override fun metricPutRecordSuccess(arg0: MetricOptions): Metric =
        unwrap(this).metricPutRecordSuccess(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6322bfd273c74c0431a8308d802e78231b2a8662c360b7b24a3750c1f8bdd289")
    override fun metricPutRecordSuccess(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricPutRecordSuccess(MetricOptions(arg0))

    override fun metricPutRecordsBytes(): Metric =
        unwrap(this).metricPutRecordsBytes().let(Metric::wrap)

    override fun metricPutRecordsBytes(arg0: MetricOptions): Metric =
        unwrap(this).metricPutRecordsBytes(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ea61d93cb0050691a3117d2e0ad7a86b09e141b97d29642f5a2c43cddf678d0")
    override fun metricPutRecordsBytes(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricPutRecordsBytes(MetricOptions(arg0))

    override fun metricPutRecordsFailedRecords(): Metric =
        unwrap(this).metricPutRecordsFailedRecords().let(Metric::wrap)

    override fun metricPutRecordsFailedRecords(arg0: MetricOptions): Metric =
        unwrap(this).metricPutRecordsFailedRecords(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("def3a22c4d69d1357a84df640d18e5e4c5f4d03285532f1be64c4836996f8b89")
    override fun metricPutRecordsFailedRecords(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricPutRecordsFailedRecords(MetricOptions(arg0))

    override fun metricPutRecordsLatency(): Metric =
        unwrap(this).metricPutRecordsLatency().let(Metric::wrap)

    override fun metricPutRecordsLatency(arg0: MetricOptions): Metric =
        unwrap(this).metricPutRecordsLatency(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f4eae1c861d69a864a5096232da76e7ea92c86174f543a8fb31f7c6368187e00")
    override fun metricPutRecordsLatency(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricPutRecordsLatency(MetricOptions(arg0))

    override fun metricPutRecordsSuccess(): Metric =
        unwrap(this).metricPutRecordsSuccess().let(Metric::wrap)

    override fun metricPutRecordsSuccess(arg0: MetricOptions): Metric =
        unwrap(this).metricPutRecordsSuccess(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8b869ce9256caf3107582795124c248443c2c8db0ee69b8a70f6e4cbf03dae2c")
    override fun metricPutRecordsSuccess(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricPutRecordsSuccess(MetricOptions(arg0))

    override fun metricPutRecordsSuccessfulRecords(): Metric =
        unwrap(this).metricPutRecordsSuccessfulRecords().let(Metric::wrap)

    override fun metricPutRecordsSuccessfulRecords(arg0: MetricOptions): Metric =
        unwrap(this).metricPutRecordsSuccessfulRecords(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fee6ceadc6edb0b112f728a1a8d40f41eec4dfe94b2ce4ccd15112e0561a232f")
    override fun metricPutRecordsSuccessfulRecords(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricPutRecordsSuccessfulRecords(MetricOptions(arg0))

    override fun metricPutRecordsThrottledRecords(): Metric =
        unwrap(this).metricPutRecordsThrottledRecords().let(Metric::wrap)

    override fun metricPutRecordsThrottledRecords(arg0: MetricOptions): Metric =
        unwrap(this).metricPutRecordsThrottledRecords(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("826d8c97f079a6271aaf12665dbc757fd124a3d5cb429c194f523794a597f941")
    override fun metricPutRecordsThrottledRecords(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricPutRecordsThrottledRecords(MetricOptions(arg0))

    override fun metricPutRecordsTotalRecords(): Metric =
        unwrap(this).metricPutRecordsTotalRecords().let(Metric::wrap)

    override fun metricPutRecordsTotalRecords(arg0: MetricOptions): Metric =
        unwrap(this).metricPutRecordsTotalRecords(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d694e2791776aebacae738c16dc15d91dc85abd391681f27833bfd15e1499e3")
    override fun metricPutRecordsTotalRecords(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricPutRecordsTotalRecords(MetricOptions(arg0))

    override fun metricReadProvisionedThroughputExceeded(): Metric =
        unwrap(this).metricReadProvisionedThroughputExceeded().let(Metric::wrap)

    override fun metricReadProvisionedThroughputExceeded(arg0: MetricOptions): Metric =
        unwrap(this).metricReadProvisionedThroughputExceeded(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("985d8e4aa7daaea864279775c7e34dadc3af403718e0a2123e05cbe31fc03a86")
    override fun metricReadProvisionedThroughputExceeded(arg0: MetricOptions.Builder.() -> Unit):
        Metric = metricReadProvisionedThroughputExceeded(MetricOptions(arg0))

    override fun metricWriteProvisionedThroughputExceeded(): Metric =
        unwrap(this).metricWriteProvisionedThroughputExceeded().let(Metric::wrap)

    override fun metricWriteProvisionedThroughputExceeded(arg0: MetricOptions): Metric =
        unwrap(this).metricWriteProvisionedThroughputExceeded(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ba305b95279408f1d6a145e80f8f92a54467fbbabdad48078127bb57e32bb25")
    override fun metricWriteProvisionedThroughputExceeded(arg0: MetricOptions.Builder.() -> Unit):
        Metric = metricWriteProvisionedThroughputExceeded(MetricOptions(arg0))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun streamArn(): String = unwrap(this).getStreamArn()

    override fun streamName(): String = unwrap(this).getStreamName()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kinesis.IStream): IStream =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStream): software.amazon.awscdk.services.kinesis.IStream =
        (wrapped as Wrapper).cdkObject
  }
}

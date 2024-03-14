package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.cloudwatch.IMetric
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.constructs.Node
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ITableV2 : ITable {
  public fun tableId(): String? = unwrap(this).getTableId()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.dynamodb.ITableV2,
  ) : ITableV2 {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grant(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grant(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    override fun grantFullAccess(arg0: IGrantable): Grant =
        unwrap(this).grantFullAccess(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantReadData(arg0: IGrantable): Grant =
        unwrap(this).grantReadData(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantReadWriteData(arg0: IGrantable): Grant =
        unwrap(this).grantReadWriteData(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantStream(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grantStream(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    override fun grantStreamRead(arg0: IGrantable): Grant =
        unwrap(this).grantStreamRead(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantTableListStreams(arg0: IGrantable): Grant =
        unwrap(this).grantTableListStreams(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun grantWriteData(arg0: IGrantable): Grant =
        unwrap(this).grantWriteData(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    override fun metric(arg0: String): Metric = unwrap(this).metric(arg0).let(Metric::wrap)

    override fun metric(arg0: String, arg1: MetricOptions): Metric = unwrap(this).metric(arg0,
        arg1.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric = metric(arg0,
        MetricOptions(arg1))

    override fun metricConditionalCheckFailedRequests(): Metric =
        unwrap(this).metricConditionalCheckFailedRequests().let(Metric::wrap)

    override fun metricConditionalCheckFailedRequests(arg0: MetricOptions): Metric =
        unwrap(this).metricConditionalCheckFailedRequests(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9b8e70255d87720549813a96360e76430b16a256c0f36155443932de96201a2")
    override fun metricConditionalCheckFailedRequests(arg0: MetricOptions.Builder.() -> Unit):
        Metric = metricConditionalCheckFailedRequests(MetricOptions(arg0))

    override fun metricConsumedReadCapacityUnits(): Metric =
        unwrap(this).metricConsumedReadCapacityUnits().let(Metric::wrap)

    override fun metricConsumedReadCapacityUnits(arg0: MetricOptions): Metric =
        unwrap(this).metricConsumedReadCapacityUnits(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c6dedc5612550c906d2dcf85f8bb47accdc7927dd2378e3f46db1bac0bee1cb")
    override fun metricConsumedReadCapacityUnits(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricConsumedReadCapacityUnits(MetricOptions(arg0))

    override fun metricConsumedWriteCapacityUnits(): Metric =
        unwrap(this).metricConsumedWriteCapacityUnits().let(Metric::wrap)

    override fun metricConsumedWriteCapacityUnits(arg0: MetricOptions): Metric =
        unwrap(this).metricConsumedWriteCapacityUnits(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7445a448a81fdfe9ee99fd876103c7f742088e6821f8fbd70b24a1cb51fef4c6")
    override fun metricConsumedWriteCapacityUnits(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricConsumedWriteCapacityUnits(MetricOptions(arg0))

    override fun metricSuccessfulRequestLatency(): Metric =
        unwrap(this).metricSuccessfulRequestLatency().let(Metric::wrap)

    override fun metricSuccessfulRequestLatency(arg0: MetricOptions): Metric =
        unwrap(this).metricSuccessfulRequestLatency(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc4a2ceba40208e097d1967e18a76b045f6c6dfc471c5ef50286afc017fb5bf0")
    override fun metricSuccessfulRequestLatency(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricSuccessfulRequestLatency(MetricOptions(arg0))

    override fun metricSystemErrorsForOperations(): IMetric =
        unwrap(this).metricSystemErrorsForOperations().let(IMetric::wrap)

    override fun metricSystemErrorsForOperations(arg0: SystemErrorsForOperationsMetricOptions):
        IMetric =
        unwrap(this).metricSystemErrorsForOperations(arg0.let(SystemErrorsForOperationsMetricOptions::unwrap)).let(IMetric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("243105ce2a4fb20cce0461c7af47eb1f000db6f0064d2015a88da669977dfe7b")
    override
        fun metricSystemErrorsForOperations(arg0: SystemErrorsForOperationsMetricOptions.Builder.() -> Unit):
        IMetric = metricSystemErrorsForOperations(SystemErrorsForOperationsMetricOptions(arg0))

    @Deprecated(message = "deprecated in CDK")
    override fun metricThrottledRequests(): Metric =
        unwrap(this).metricThrottledRequests().let(Metric::wrap)

    @Deprecated(message = "deprecated in CDK")
    override fun metricThrottledRequests(arg0: MetricOptions): Metric =
        unwrap(this).metricThrottledRequests(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Deprecated(message = "deprecated in CDK")
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("969283deb4bccd284ed13bd37c4975707652898bf85291a87af65ce1e70c379c")
    override fun metricThrottledRequests(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricThrottledRequests(MetricOptions(arg0))

    override fun metricThrottledRequestsForOperations(): IMetric =
        unwrap(this).metricThrottledRequestsForOperations().let(IMetric::wrap)

    override fun metricThrottledRequestsForOperations(arg0: OperationsMetricOptions): IMetric =
        unwrap(this).metricThrottledRequestsForOperations(arg0.let(OperationsMetricOptions::unwrap)).let(IMetric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5c36f4b41b0cef64cf51971857d069781a38fec62ede50552fbcd95f5f15d08")
    override
        fun metricThrottledRequestsForOperations(arg0: OperationsMetricOptions.Builder.() -> Unit):
        IMetric = metricThrottledRequestsForOperations(OperationsMetricOptions(arg0))

    override fun metricUserErrors(): Metric = unwrap(this).metricUserErrors().let(Metric::wrap)

    override fun metricUserErrors(arg0: MetricOptions): Metric =
        unwrap(this).metricUserErrors(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5d5bbd29687f3904b7ec5d90b962683d72c5b8f6c61b1a25526eb0415b87f7f")
    override fun metricUserErrors(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricUserErrors(MetricOptions(arg0))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun tableArn(): String = unwrap(this).getTableArn()

    override fun tableId(): String? = unwrap(this).getTableId()

    override fun tableName(): String = unwrap(this).getTableName()

    override fun tableStreamArn(): String? = unwrap(this).getTableStreamArn()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.ITableV2): ITableV2 =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITableV2): software.amazon.awscdk.services.dynamodb.ITableV2 =
        (wrapped as Wrapper).cdkObject
  }
}

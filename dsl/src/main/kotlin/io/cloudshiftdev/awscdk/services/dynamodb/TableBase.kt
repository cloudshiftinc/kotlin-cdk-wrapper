package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.cloudwatch.IMetric
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class TableBase internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.dynamodb.TableBase,
) : Resource(cdkObject), ITable {
  /**
   * KMS encryption key, if this table uses a customer-managed encryption key.
   */
  public override fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * Adds an IAM policy statement associated with this table to an IAM principal's policy.
   *
   * If `encryptionKey` is present, appropriate grants to the key needs to be added
   * separately using the `table.encryptionKey.grant*` methods.
   *
   * @param grantee The principal (no-op if undefined). 
   * @param actions The set of actions to allow (i.e. "dynamodb:PutItem", "dynamodb:GetItem", ...). 
   */
  public override fun grant(grantee: IGrantable, actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

  /**
   * Permits all DynamoDB operations ("dynamodb:*") to an IAM principal.
   *
   * Appropriate grants will also be added to the customer-managed KMS key
   * if one was configured.
   *
   * @param grantee The principal to grant access to. 
   */
  public override fun grantFullAccess(grantee: IGrantable): Grant =
      unwrap(this).grantFullAccess(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Permits an IAM principal all data read operations from this table: BatchGetItem, GetRecords,
   * GetShardIterator, Query, GetItem, Scan, DescribeTable.
   *
   * Appropriate grants will also be added to the customer-managed KMS key
   * if one was configured.
   *
   * @param grantee The principal to grant access to. 
   */
  public override fun grantReadData(grantee: IGrantable): Grant =
      unwrap(this).grantReadData(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Permits an IAM principal to all data read/write operations to this table.
   *
   * BatchGetItem, GetRecords, GetShardIterator, Query, GetItem, Scan,
   * BatchWriteItem, PutItem, UpdateItem, DeleteItem, DescribeTable
   *
   * Appropriate grants will also be added to the customer-managed KMS key
   * if one was configured.
   *
   * @param grantee The principal to grant access to. 
   */
  public override fun grantReadWriteData(grantee: IGrantable): Grant =
      unwrap(this).grantReadWriteData(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Adds an IAM policy statement associated with this table's stream to an IAM principal's policy.
   *
   * If `encryptionKey` is present, appropriate grants to the key needs to be added
   * separately using the `table.encryptionKey.grant*` methods.
   *
   * @param grantee The principal (no-op if undefined). 
   * @param actions The set of actions to allow (i.e. "dynamodb:DescribeStream",
   * "dynamodb:GetRecords", ...). 
   */
  public override fun grantStream(grantee: IGrantable, actions: String): Grant =
      unwrap(this).grantStream(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

  /**
   * Permits an IAM principal all stream data read operations for this table's stream:
   * DescribeStream, GetRecords, GetShardIterator, ListStreams.
   *
   * Appropriate grants will also be added to the customer-managed KMS key
   * if one was configured.
   *
   * @param grantee The principal to grant access to. 
   */
  public override fun grantStreamRead(grantee: IGrantable): Grant =
      unwrap(this).grantStreamRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Permits an IAM Principal to list streams attached to current dynamodb table.
   *
   * @param grantee The principal (no-op if undefined). 
   */
  public override fun grantTableListStreams(grantee: IGrantable): Grant =
      unwrap(this).grantTableListStreams(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Permits an IAM principal all data write operations to this table: BatchWriteItem, PutItem,
   * UpdateItem, DeleteItem, DescribeTable.
   *
   * Appropriate grants will also be added to the customer-managed KMS key
   * if one was configured.
   *
   * @param grantee The principal to grant access to. 
   */
  public override fun grantWriteData(grantee: IGrantable): Grant =
      unwrap(this).grantWriteData(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Return the given named metric for this Table.
   *
   * By default, the metric will be calculated as a sum over a period of 5 minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * Return the given named metric for this Table.
   *
   * By default, the metric will be calculated as a sum over a period of 5 minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Return the given named metric for this Table.
   *
   * By default, the metric will be calculated as a sum over a period of 5 minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param metricName 
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * Metric for the conditional check failed requests this table.
   *
   * By default, the metric will be calculated as a sum over a period of 5 minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param props
   */
  public override fun metricConditionalCheckFailedRequests(): Metric =
      unwrap(this).metricConditionalCheckFailedRequests().let(Metric::wrap)

  /**
   * Metric for the conditional check failed requests this table.
   *
   * By default, the metric will be calculated as a sum over a period of 5 minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param props
   */
  public override fun metricConditionalCheckFailedRequests(props: MetricOptions): Metric =
      unwrap(this).metricConditionalCheckFailedRequests(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the conditional check failed requests this table.
   *
   * By default, the metric will be calculated as a sum over a period of 5 minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e9b8e70255d87720549813a96360e76430b16a256c0f36155443932de96201a2")
  public override fun metricConditionalCheckFailedRequests(props: MetricOptions.Builder.() -> Unit):
      Metric = metricConditionalCheckFailedRequests(MetricOptions(props))

  /**
   * Metric for the consumed read capacity units this table.
   *
   * By default, the metric will be calculated as a sum over a period of 5 minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param props
   */
  public override fun metricConsumedReadCapacityUnits(): Metric =
      unwrap(this).metricConsumedReadCapacityUnits().let(Metric::wrap)

  /**
   * Metric for the consumed read capacity units this table.
   *
   * By default, the metric will be calculated as a sum over a period of 5 minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param props
   */
  public override fun metricConsumedReadCapacityUnits(props: MetricOptions): Metric =
      unwrap(this).metricConsumedReadCapacityUnits(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the consumed read capacity units this table.
   *
   * By default, the metric will be calculated as a sum over a period of 5 minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3c6dedc5612550c906d2dcf85f8bb47accdc7927dd2378e3f46db1bac0bee1cb")
  public override fun metricConsumedReadCapacityUnits(props: MetricOptions.Builder.() -> Unit):
      Metric = metricConsumedReadCapacityUnits(MetricOptions(props))

  /**
   * Metric for the consumed write capacity units this table.
   *
   * By default, the metric will be calculated as a sum over a period of 5 minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param props
   */
  public override fun metricConsumedWriteCapacityUnits(): Metric =
      unwrap(this).metricConsumedWriteCapacityUnits().let(Metric::wrap)

  /**
   * Metric for the consumed write capacity units this table.
   *
   * By default, the metric will be calculated as a sum over a period of 5 minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param props
   */
  public override fun metricConsumedWriteCapacityUnits(props: MetricOptions): Metric =
      unwrap(this).metricConsumedWriteCapacityUnits(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the consumed write capacity units this table.
   *
   * By default, the metric will be calculated as a sum over a period of 5 minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7445a448a81fdfe9ee99fd876103c7f742088e6821f8fbd70b24a1cb51fef4c6")
  public override fun metricConsumedWriteCapacityUnits(props: MetricOptions.Builder.() -> Unit):
      Metric = metricConsumedWriteCapacityUnits(MetricOptions(props))

  /**
   * Metric for the successful request latency this table.
   *
   * By default, the metric will be calculated as an average over a period of 5 minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param props
   */
  public override fun metricSuccessfulRequestLatency(): Metric =
      unwrap(this).metricSuccessfulRequestLatency().let(Metric::wrap)

  /**
   * Metric for the successful request latency this table.
   *
   * By default, the metric will be calculated as an average over a period of 5 minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param props
   */
  public override fun metricSuccessfulRequestLatency(props: MetricOptions): Metric =
      unwrap(this).metricSuccessfulRequestLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the successful request latency this table.
   *
   * By default, the metric will be calculated as an average over a period of 5 minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc4a2ceba40208e097d1967e18a76b045f6c6dfc471c5ef50286afc017fb5bf0")
  public override fun metricSuccessfulRequestLatency(props: MetricOptions.Builder.() -> Unit):
      Metric = metricSuccessfulRequestLatency(MetricOptions(props))

  /**
   * (deprecated) Metric for the system errors this table.
   *
   * @deprecated use `metricSystemErrorsForOperations`.
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricSystemErrors(): Metric = unwrap(this).metricSystemErrors().let(Metric::wrap)

  /**
   * (deprecated) Metric for the system errors this table.
   *
   * @deprecated use `metricSystemErrorsForOperations`.
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun metricSystemErrors(props: MetricOptions): Metric =
      unwrap(this).metricSystemErrors(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) Metric for the system errors this table.
   *
   * @deprecated use `metricSystemErrorsForOperations`.
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0e6bbe6a4f3f3f5dadc2ee27811aa12f6d3d4ced4f527f0024f1382d149fc253")
  public open fun metricSystemErrors(props: MetricOptions.Builder.() -> Unit): Metric =
      metricSystemErrors(MetricOptions(props))

  /**
   * Metric for the system errors this table.
   *
   * This will sum errors across all possible operations.
   * Note that by default, each individual metric will be calculated as a sum over a period of 5
   * minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param props
   */
  public override fun metricSystemErrorsForOperations(): IMetric =
      unwrap(this).metricSystemErrorsForOperations().let(IMetric::wrap)

  /**
   * Metric for the system errors this table.
   *
   * This will sum errors across all possible operations.
   * Note that by default, each individual metric will be calculated as a sum over a period of 5
   * minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param props
   */
  public override
      fun metricSystemErrorsForOperations(props: SystemErrorsForOperationsMetricOptions): IMetric =
      unwrap(this).metricSystemErrorsForOperations(props.let(SystemErrorsForOperationsMetricOptions::unwrap)).let(IMetric::wrap)

  /**
   * Metric for the system errors this table.
   *
   * This will sum errors across all possible operations.
   * Note that by default, each individual metric will be calculated as a sum over a period of 5
   * minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("243105ce2a4fb20cce0461c7af47eb1f000db6f0064d2015a88da669977dfe7b")
  public override
      fun metricSystemErrorsForOperations(props: SystemErrorsForOperationsMetricOptions.Builder.() -> Unit):
      IMetric = metricSystemErrorsForOperations(SystemErrorsForOperationsMetricOptions(props))

  /**
   * (deprecated) How many requests are throttled on this table.
   *
   * Default: sum over 5 minutes
   *
   * @deprecated Do not use this function. It returns an invalid metric. Use
   * `metricThrottledRequestsForOperation` instead.
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricThrottledRequests(): Metric =
      unwrap(this).metricThrottledRequests().let(Metric::wrap)

  /**
   * (deprecated) How many requests are throttled on this table.
   *
   * Default: sum over 5 minutes
   *
   * @deprecated Do not use this function. It returns an invalid metric. Use
   * `metricThrottledRequestsForOperation` instead.
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public override fun metricThrottledRequests(props: MetricOptions): Metric =
      unwrap(this).metricThrottledRequests(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * (deprecated) How many requests are throttled on this table.
   *
   * Default: sum over 5 minutes
   *
   * @deprecated Do not use this function. It returns an invalid metric. Use
   * `metricThrottledRequestsForOperation` instead.
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("969283deb4bccd284ed13bd37c4975707652898bf85291a87af65ce1e70c379c")
  public override fun metricThrottledRequests(props: MetricOptions.Builder.() -> Unit): Metric =
      metricThrottledRequests(MetricOptions(props))

  /**
   * How many requests are throttled on this table, for the given operation.
   *
   * Default: sum over 5 minutes
   *
   * @param operation 
   * @param props
   */
  public open fun metricThrottledRequestsForOperation(operation: String): Metric =
      unwrap(this).metricThrottledRequestsForOperation(operation).let(Metric::wrap)

  /**
   * How many requests are throttled on this table, for the given operation.
   *
   * Default: sum over 5 minutes
   *
   * @param operation 
   * @param props
   */
  public open fun metricThrottledRequestsForOperation(operation: String, props: MetricOptions):
      Metric = unwrap(this).metricThrottledRequestsForOperation(operation,
      props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * How many requests are throttled on this table, for the given operation.
   *
   * Default: sum over 5 minutes
   *
   * @param operation 
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("df25826d224835ea1c96e1a251f16316249fc949e2cdc5b58873e431935e9ce3")
  public open fun metricThrottledRequestsForOperation(operation: String,
      props: MetricOptions.Builder.() -> Unit): Metric =
      metricThrottledRequestsForOperation(operation, MetricOptions(props))

  /**
   * How many requests are throttled on this table.
   *
   * This will sum errors across all possible operations.
   * Note that by default, each individual metric will be calculated as a sum over a period of 5
   * minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param props
   */
  public override fun metricThrottledRequestsForOperations(): IMetric =
      unwrap(this).metricThrottledRequestsForOperations().let(IMetric::wrap)

  /**
   * How many requests are throttled on this table.
   *
   * This will sum errors across all possible operations.
   * Note that by default, each individual metric will be calculated as a sum over a period of 5
   * minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param props
   */
  public override fun metricThrottledRequestsForOperations(props: OperationsMetricOptions): IMetric
      =
      unwrap(this).metricThrottledRequestsForOperations(props.let(OperationsMetricOptions::unwrap)).let(IMetric::wrap)

  /**
   * How many requests are throttled on this table.
   *
   * This will sum errors across all possible operations.
   * Note that by default, each individual metric will be calculated as a sum over a period of 5
   * minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c5c36f4b41b0cef64cf51971857d069781a38fec62ede50552fbcd95f5f15d08")
  public override
      fun metricThrottledRequestsForOperations(props: OperationsMetricOptions.Builder.() -> Unit):
      IMetric = metricThrottledRequestsForOperations(OperationsMetricOptions(props))

  /**
   * Metric for the user errors.
   *
   * Note that this metric reports user errors across all
   * the tables in the account and region the table resides in.
   *
   * By default, the metric will be calculated as a sum over a period of 5 minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param props
   */
  public override fun metricUserErrors(): Metric = unwrap(this).metricUserErrors().let(Metric::wrap)

  /**
   * Metric for the user errors.
   *
   * Note that this metric reports user errors across all
   * the tables in the account and region the table resides in.
   *
   * By default, the metric will be calculated as a sum over a period of 5 minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param props
   */
  public override fun metricUserErrors(props: MetricOptions): Metric =
      unwrap(this).metricUserErrors(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Metric for the user errors.
   *
   * Note that this metric reports user errors across all
   * the tables in the account and region the table resides in.
   *
   * By default, the metric will be calculated as a sum over a period of 5 minutes.
   * You can customize this by using the `statistic` and `period` properties.
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f5d5bbd29687f3904b7ec5d90b962683d72c5b8f6c61b1a25526eb0415b87f7f")
  public override fun metricUserErrors(props: MetricOptions.Builder.() -> Unit): Metric =
      metricUserErrors(MetricOptions(props))

  /**
   * Arn of the dynamodb table.
   */
  public override fun tableArn(): String = unwrap(this).getTableArn()

  /**
   * Table name of the dynamodb table.
   */
  public override fun tableName(): String = unwrap(this).getTableName()

  /**
   * ARN of the table's stream, if there is one.
   */
  public override fun tableStreamArn(): String? = unwrap(this).getTableStreamArn()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.dynamodb.TableBase,
  ) : TableBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.TableBase): TableBase =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TableBase): software.amazon.awscdk.services.dynamodb.TableBase =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.TableBase
  }
}

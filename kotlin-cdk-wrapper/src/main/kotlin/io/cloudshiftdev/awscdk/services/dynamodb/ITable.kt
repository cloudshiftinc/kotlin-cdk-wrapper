@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.IMetric
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.constructs.Node
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * An interface that represents a DynamoDB Table - either created with the CDK, or an existing one.
 */
public interface ITable : IResource {
  /**
   * Optional KMS encryption key associated with this table.
   */
  public fun encryptionKey(): IKey? = unwrap(this).getEncryptionKey()?.let(IKey::wrap)

  /**
   * Adds an IAM policy statement associated with this table to an IAM principal's policy.
   *
   * If `encryptionKey` is present, appropriate grants to the key needs to be added
   * separately using the `table.encryptionKey.grant*` methods.
   *
   * @param grantee The principal (no-op if undefined). 
   * @param actions The set of actions to allow (i.e. "dynamodb:PutItem", "dynamodb:GetItem", ...). 
   */
  public fun grant(grantee: IGrantable, vararg actions: String): Grant

  /**
   * Permits all DynamoDB operations ("dynamodb:*") to an IAM principal.
   *
   * Appropriate grants will also be added to the customer-managed KMS key
   * if one was configured.
   *
   * @param grantee The principal to grant access to. 
   */
  public fun grantFullAccess(grantee: IGrantable): Grant

  /**
   * Permits an IAM principal all data read operations from this table: BatchGetItem, GetRecords,
   * GetShardIterator, Query, GetItem, Scan.
   *
   * Appropriate grants will also be added to the customer-managed KMS key
   * if one was configured.
   *
   * @param grantee The principal to grant access to. 
   */
  public fun grantReadData(grantee: IGrantable): Grant

  /**
   * Permits an IAM principal to all data read/write operations to this table.
   *
   * BatchGetItem, GetRecords, GetShardIterator, Query, GetItem, Scan,
   * BatchWriteItem, PutItem, UpdateItem, DeleteItem
   *
   * Appropriate grants will also be added to the customer-managed KMS key
   * if one was configured.
   *
   * @param grantee The principal to grant access to. 
   */
  public fun grantReadWriteData(grantee: IGrantable): Grant

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
  public fun grantStream(grantee: IGrantable, vararg actions: String): Grant

  /**
   * Permits an IAM principal all stream data read operations for this table's stream:
   * DescribeStream, GetRecords, GetShardIterator, ListStreams.
   *
   * Appropriate grants will also be added to the customer-managed KMS key
   * if one was configured.
   *
   * @param grantee The principal to grant access to. 
   */
  public fun grantStreamRead(grantee: IGrantable): Grant

  /**
   * Permits an IAM Principal to list streams attached to current dynamodb table.
   *
   * @param grantee The principal (no-op if undefined). 
   */
  public fun grantTableListStreams(grantee: IGrantable): Grant

  /**
   * Permits an IAM principal all data write operations to this table: BatchWriteItem, PutItem,
   * UpdateItem, DeleteItem.
   *
   * Appropriate grants will also be added to the customer-managed KMS key
   * if one was configured.
   *
   * @param grantee The principal to grant access to. 
   */
  public fun grantWriteData(grantee: IGrantable): Grant

  /**
   * Metric for the number of Errors executing all Lambdas.
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String): Metric

  /**
   * Metric for the number of Errors executing all Lambdas.
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String, props: MetricOptions): Metric

  /**
   * Metric for the number of Errors executing all Lambdas.
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the conditional check failed requests.
   *
   * @param props properties of a metric.
   */
  public fun metricConditionalCheckFailedRequests(): Metric

  /**
   * Metric for the conditional check failed requests.
   *
   * @param props properties of a metric.
   */
  public fun metricConditionalCheckFailedRequests(props: MetricOptions): Metric

  /**
   * Metric for the conditional check failed requests.
   *
   * @param props properties of a metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e9b8e70255d87720549813a96360e76430b16a256c0f36155443932de96201a2")
  public fun metricConditionalCheckFailedRequests(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the consumed read capacity units.
   *
   * @param props properties of a metric.
   */
  public fun metricConsumedReadCapacityUnits(): Metric

  /**
   * Metric for the consumed read capacity units.
   *
   * @param props properties of a metric.
   */
  public fun metricConsumedReadCapacityUnits(props: MetricOptions): Metric

  /**
   * Metric for the consumed read capacity units.
   *
   * @param props properties of a metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3c6dedc5612550c906d2dcf85f8bb47accdc7927dd2378e3f46db1bac0bee1cb")
  public fun metricConsumedReadCapacityUnits(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the consumed write capacity units.
   *
   * @param props properties of a metric.
   */
  public fun metricConsumedWriteCapacityUnits(): Metric

  /**
   * Metric for the consumed write capacity units.
   *
   * @param props properties of a metric.
   */
  public fun metricConsumedWriteCapacityUnits(props: MetricOptions): Metric

  /**
   * Metric for the consumed write capacity units.
   *
   * @param props properties of a metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7445a448a81fdfe9ee99fd876103c7f742088e6821f8fbd70b24a1cb51fef4c6")
  public fun metricConsumedWriteCapacityUnits(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the successful request latency.
   *
   * @param props properties of a metric.
   */
  public fun metricSuccessfulRequestLatency(): Metric

  /**
   * Metric for the successful request latency.
   *
   * @param props properties of a metric.
   */
  public fun metricSuccessfulRequestLatency(props: MetricOptions): Metric

  /**
   * Metric for the successful request latency.
   *
   * @param props properties of a metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc4a2ceba40208e097d1967e18a76b045f6c6dfc471c5ef50286afc017fb5bf0")
  public fun metricSuccessfulRequestLatency(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the system errors this table.
   *
   * @param props properties of a metric.
   */
  public fun metricSystemErrorsForOperations(): IMetric

  /**
   * Metric for the system errors this table.
   *
   * @param props properties of a metric.
   */
  public fun metricSystemErrorsForOperations(props: SystemErrorsForOperationsMetricOptions): IMetric

  /**
   * Metric for the system errors this table.
   *
   * @param props properties of a metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("243105ce2a4fb20cce0461c7af47eb1f000db6f0064d2015a88da669977dfe7b")
  public
      fun metricSystemErrorsForOperations(props: SystemErrorsForOperationsMetricOptions.Builder.() -> Unit):
      IMetric

  /**
   * (deprecated) Metric for throttled requests.
   *
   * @deprecated use `metricThrottledRequestsForOperations`
   * @param props properties of a metric.
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricThrottledRequests(): Metric

  /**
   * (deprecated) Metric for throttled requests.
   *
   * @deprecated use `metricThrottledRequestsForOperations`
   * @param props properties of a metric.
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricThrottledRequests(props: MetricOptions): Metric

  /**
   * (deprecated) Metric for throttled requests.
   *
   * @deprecated use `metricThrottledRequestsForOperations`
   * @param props properties of a metric.
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("969283deb4bccd284ed13bd37c4975707652898bf85291a87af65ce1e70c379c")
  public fun metricThrottledRequests(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for throttled requests.
   *
   * @param props properties of a metric.
   */
  public fun metricThrottledRequestsForOperations(): IMetric

  /**
   * Metric for throttled requests.
   *
   * @param props properties of a metric.
   */
  public fun metricThrottledRequestsForOperations(props: OperationsMetricOptions): IMetric

  /**
   * Metric for throttled requests.
   *
   * @param props properties of a metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c5c36f4b41b0cef64cf51971857d069781a38fec62ede50552fbcd95f5f15d08")
  public
      fun metricThrottledRequestsForOperations(props: OperationsMetricOptions.Builder.() -> Unit):
      IMetric

  /**
   * Metric for the user errors.
   *
   * @param props properties of a metric.
   */
  public fun metricUserErrors(): Metric

  /**
   * Metric for the user errors.
   *
   * @param props properties of a metric.
   */
  public fun metricUserErrors(props: MetricOptions): Metric

  /**
   * Metric for the user errors.
   *
   * @param props properties of a metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f5d5bbd29687f3904b7ec5d90b962683d72c5b8f6c61b1a25526eb0415b87f7f")
  public fun metricUserErrors(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Arn of the dynamodb table.
   */
  public fun tableArn(): String

  /**
   * Table name of the dynamodb table.
   */
  public fun tableName(): String

  /**
   * ARN of the table's stream, if there is one.
   */
  public fun tableStreamArn(): String? = unwrap(this).getTableStreamArn()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.dynamodb.ITable,
  ) : CdkObject(cdkObject), ITable {
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
     * Optional KMS encryption key associated with this table.
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
     * Adds an IAM policy statement associated with this table to an IAM principal's policy.
     *
     * If `encryptionKey` is present, appropriate grants to the key needs to be added
     * separately using the `table.encryptionKey.grant*` methods.
     *
     * @param grantee The principal (no-op if undefined). 
     * @param actions The set of actions to allow (i.e. "dynamodb:PutItem", "dynamodb:GetItem",
     * ...). 
     */
    override fun grant(grantee: IGrantable, vararg actions: String): Grant =
        unwrap(this).grant(grantee.let(IGrantable::unwrap), *actions).let(Grant::wrap)

    /**
     * Permits all DynamoDB operations ("dynamodb:*") to an IAM principal.
     *
     * Appropriate grants will also be added to the customer-managed KMS key
     * if one was configured.
     *
     * @param grantee The principal to grant access to. 
     */
    override fun grantFullAccess(grantee: IGrantable): Grant =
        unwrap(this).grantFullAccess(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Permits an IAM principal all data read operations from this table: BatchGetItem, GetRecords,
     * GetShardIterator, Query, GetItem, Scan.
     *
     * Appropriate grants will also be added to the customer-managed KMS key
     * if one was configured.
     *
     * @param grantee The principal to grant access to. 
     */
    override fun grantReadData(grantee: IGrantable): Grant =
        unwrap(this).grantReadData(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Permits an IAM principal to all data read/write operations to this table.
     *
     * BatchGetItem, GetRecords, GetShardIterator, Query, GetItem, Scan,
     * BatchWriteItem, PutItem, UpdateItem, DeleteItem
     *
     * Appropriate grants will also be added to the customer-managed KMS key
     * if one was configured.
     *
     * @param grantee The principal to grant access to. 
     */
    override fun grantReadWriteData(grantee: IGrantable): Grant =
        unwrap(this).grantReadWriteData(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Adds an IAM policy statement associated with this table's stream to an IAM principal's
     * policy.
     *
     * If `encryptionKey` is present, appropriate grants to the key needs to be added
     * separately using the `table.encryptionKey.grant*` methods.
     *
     * @param grantee The principal (no-op if undefined). 
     * @param actions The set of actions to allow (i.e. "dynamodb:DescribeStream",
     * "dynamodb:GetRecords", ...). 
     */
    override fun grantStream(grantee: IGrantable, vararg actions: String): Grant =
        unwrap(this).grantStream(grantee.let(IGrantable::unwrap), *actions).let(Grant::wrap)

    /**
     * Permits an IAM principal all stream data read operations for this table's stream:
     * DescribeStream, GetRecords, GetShardIterator, ListStreams.
     *
     * Appropriate grants will also be added to the customer-managed KMS key
     * if one was configured.
     *
     * @param grantee The principal to grant access to. 
     */
    override fun grantStreamRead(grantee: IGrantable): Grant =
        unwrap(this).grantStreamRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Permits an IAM Principal to list streams attached to current dynamodb table.
     *
     * @param grantee The principal (no-op if undefined). 
     */
    override fun grantTableListStreams(grantee: IGrantable): Grant =
        unwrap(this).grantTableListStreams(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Permits an IAM principal all data write operations to this table: BatchWriteItem, PutItem,
     * UpdateItem, DeleteItem.
     *
     * Appropriate grants will also be added to the customer-managed KMS key
     * if one was configured.
     *
     * @param grantee The principal to grant access to. 
     */
    override fun grantWriteData(grantee: IGrantable): Grant =
        unwrap(this).grantWriteData(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Metric for the number of Errors executing all Lambdas.
     *
     * @param metricName 
     * @param props
     */
    override fun metric(metricName: String): Metric =
        unwrap(this).metric(metricName).let(Metric::wrap)

    /**
     * Metric for the number of Errors executing all Lambdas.
     *
     * @param metricName 
     * @param props
     */
    override fun metric(metricName: String, props: MetricOptions): Metric =
        unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the number of Errors executing all Lambdas.
     *
     * @param metricName 
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
        metric(metricName, MetricOptions(props))

    /**
     * Metric for the conditional check failed requests.
     *
     * @param props properties of a metric.
     */
    override fun metricConditionalCheckFailedRequests(): Metric =
        unwrap(this).metricConditionalCheckFailedRequests().let(Metric::wrap)

    /**
     * Metric for the conditional check failed requests.
     *
     * @param props properties of a metric.
     */
    override fun metricConditionalCheckFailedRequests(props: MetricOptions): Metric =
        unwrap(this).metricConditionalCheckFailedRequests(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the conditional check failed requests.
     *
     * @param props properties of a metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9b8e70255d87720549813a96360e76430b16a256c0f36155443932de96201a2")
    override fun metricConditionalCheckFailedRequests(props: MetricOptions.Builder.() -> Unit):
        Metric = metricConditionalCheckFailedRequests(MetricOptions(props))

    /**
     * Metric for the consumed read capacity units.
     *
     * @param props properties of a metric.
     */
    override fun metricConsumedReadCapacityUnits(): Metric =
        unwrap(this).metricConsumedReadCapacityUnits().let(Metric::wrap)

    /**
     * Metric for the consumed read capacity units.
     *
     * @param props properties of a metric.
     */
    override fun metricConsumedReadCapacityUnits(props: MetricOptions): Metric =
        unwrap(this).metricConsumedReadCapacityUnits(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the consumed read capacity units.
     *
     * @param props properties of a metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3c6dedc5612550c906d2dcf85f8bb47accdc7927dd2378e3f46db1bac0bee1cb")
    override fun metricConsumedReadCapacityUnits(props: MetricOptions.Builder.() -> Unit): Metric =
        metricConsumedReadCapacityUnits(MetricOptions(props))

    /**
     * Metric for the consumed write capacity units.
     *
     * @param props properties of a metric.
     */
    override fun metricConsumedWriteCapacityUnits(): Metric =
        unwrap(this).metricConsumedWriteCapacityUnits().let(Metric::wrap)

    /**
     * Metric for the consumed write capacity units.
     *
     * @param props properties of a metric.
     */
    override fun metricConsumedWriteCapacityUnits(props: MetricOptions): Metric =
        unwrap(this).metricConsumedWriteCapacityUnits(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the consumed write capacity units.
     *
     * @param props properties of a metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7445a448a81fdfe9ee99fd876103c7f742088e6821f8fbd70b24a1cb51fef4c6")
    override fun metricConsumedWriteCapacityUnits(props: MetricOptions.Builder.() -> Unit): Metric =
        metricConsumedWriteCapacityUnits(MetricOptions(props))

    /**
     * Metric for the successful request latency.
     *
     * @param props properties of a metric.
     */
    override fun metricSuccessfulRequestLatency(): Metric =
        unwrap(this).metricSuccessfulRequestLatency().let(Metric::wrap)

    /**
     * Metric for the successful request latency.
     *
     * @param props properties of a metric.
     */
    override fun metricSuccessfulRequestLatency(props: MetricOptions): Metric =
        unwrap(this).metricSuccessfulRequestLatency(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the successful request latency.
     *
     * @param props properties of a metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc4a2ceba40208e097d1967e18a76b045f6c6dfc471c5ef50286afc017fb5bf0")
    override fun metricSuccessfulRequestLatency(props: MetricOptions.Builder.() -> Unit): Metric =
        metricSuccessfulRequestLatency(MetricOptions(props))

    /**
     * Metric for the system errors this table.
     *
     * @param props properties of a metric.
     */
    override fun metricSystemErrorsForOperations(): IMetric =
        unwrap(this).metricSystemErrorsForOperations().let(IMetric::wrap)

    /**
     * Metric for the system errors this table.
     *
     * @param props properties of a metric.
     */
    override fun metricSystemErrorsForOperations(props: SystemErrorsForOperationsMetricOptions):
        IMetric =
        unwrap(this).metricSystemErrorsForOperations(props.let(SystemErrorsForOperationsMetricOptions::unwrap)).let(IMetric::wrap)

    /**
     * Metric for the system errors this table.
     *
     * @param props properties of a metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("243105ce2a4fb20cce0461c7af47eb1f000db6f0064d2015a88da669977dfe7b")
    override
        fun metricSystemErrorsForOperations(props: SystemErrorsForOperationsMetricOptions.Builder.() -> Unit):
        IMetric = metricSystemErrorsForOperations(SystemErrorsForOperationsMetricOptions(props))

    /**
     * (deprecated) Metric for throttled requests.
     *
     * @deprecated use `metricThrottledRequestsForOperations`
     * @param props properties of a metric.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricThrottledRequests(): Metric =
        unwrap(this).metricThrottledRequests().let(Metric::wrap)

    /**
     * (deprecated) Metric for throttled requests.
     *
     * @deprecated use `metricThrottledRequestsForOperations`
     * @param props properties of a metric.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricThrottledRequests(props: MetricOptions): Metric =
        unwrap(this).metricThrottledRequests(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * (deprecated) Metric for throttled requests.
     *
     * @deprecated use `metricThrottledRequestsForOperations`
     * @param props properties of a metric.
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("969283deb4bccd284ed13bd37c4975707652898bf85291a87af65ce1e70c379c")
    override fun metricThrottledRequests(props: MetricOptions.Builder.() -> Unit): Metric =
        metricThrottledRequests(MetricOptions(props))

    /**
     * Metric for throttled requests.
     *
     * @param props properties of a metric.
     */
    override fun metricThrottledRequestsForOperations(): IMetric =
        unwrap(this).metricThrottledRequestsForOperations().let(IMetric::wrap)

    /**
     * Metric for throttled requests.
     *
     * @param props properties of a metric.
     */
    override fun metricThrottledRequestsForOperations(props: OperationsMetricOptions): IMetric =
        unwrap(this).metricThrottledRequestsForOperations(props.let(OperationsMetricOptions::unwrap)).let(IMetric::wrap)

    /**
     * Metric for throttled requests.
     *
     * @param props properties of a metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5c36f4b41b0cef64cf51971857d069781a38fec62ede50552fbcd95f5f15d08")
    override
        fun metricThrottledRequestsForOperations(props: OperationsMetricOptions.Builder.() -> Unit):
        IMetric = metricThrottledRequestsForOperations(OperationsMetricOptions(props))

    /**
     * Metric for the user errors.
     *
     * @param props properties of a metric.
     */
    override fun metricUserErrors(): Metric = unwrap(this).metricUserErrors().let(Metric::wrap)

    /**
     * Metric for the user errors.
     *
     * @param props properties of a metric.
     */
    override fun metricUserErrors(props: MetricOptions): Metric =
        unwrap(this).metricUserErrors(props.let(MetricOptions::unwrap)).let(Metric::wrap)

    /**
     * Metric for the user errors.
     *
     * @param props properties of a metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f5d5bbd29687f3904b7ec5d90b962683d72c5b8f6c61b1a25526eb0415b87f7f")
    override fun metricUserErrors(props: MetricOptions.Builder.() -> Unit): Metric =
        metricUserErrors(MetricOptions(props))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * Arn of the dynamodb table.
     */
    override fun tableArn(): String = unwrap(this).getTableArn()

    /**
     * Table name of the dynamodb table.
     */
    override fun tableName(): String = unwrap(this).getTableName()

    /**
     * ARN of the table's stream, if there is one.
     */
    override fun tableStreamArn(): String? = unwrap(this).getTableStreamArn()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.ITable): ITable =
        CdkObjectWrappers.wrap(cdkObject) as? ITable ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITable): software.amazon.awscdk.services.dynamodb.ITable = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.services.dynamodb.ITable
  }
}

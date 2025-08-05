@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.AddToResourcePolicyResult
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IResourceWithPolicy
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 *
 */
public interface ILogGroup : IResourceWithPolicy {
  /**
   * Create a new Metric Filter on this Log Group.
   *
   * @param id Unique identifier for the construct in its parent. 
   * @param props Properties for creating the MetricFilter. 
   */
  public fun addMetricFilter(id: String, props: MetricFilterOptions): MetricFilter

  /**
   * Create a new Metric Filter on this Log Group.
   *
   * @param id Unique identifier for the construct in its parent. 
   * @param props Properties for creating the MetricFilter. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fa5eb338ced88e08a44a54871b849cb2cc0edd7ab75cdb3b68614fc030c321db")
  public fun addMetricFilter(id: String, props: MetricFilterOptions.Builder.() -> Unit):
      MetricFilter

  /**
   * Create a new Log Stream for this Log Group.
   *
   * @param id Unique identifier for the construct in its parent. 
   * @param props Properties for creating the LogStream.
   */
  public fun addStream(id: String): LogStream

  /**
   * Create a new Log Stream for this Log Group.
   *
   * @param id Unique identifier for the construct in its parent. 
   * @param props Properties for creating the LogStream.
   */
  public fun addStream(id: String, props: StreamOptions): LogStream

  /**
   * Create a new Log Stream for this Log Group.
   *
   * @param id Unique identifier for the construct in its parent. 
   * @param props Properties for creating the LogStream.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc0acd2b2aa5766d1e96b6ab06178eafd114af09cbd7db63af738298d3dc3245")
  public fun addStream(id: String, props: StreamOptions.Builder.() -> Unit): LogStream

  /**
   * Create a new Subscription Filter on this Log Group.
   *
   * @param id Unique identifier for the construct in its parent. 
   * @param props Properties for creating the SubscriptionFilter. 
   */
  public fun addSubscriptionFilter(id: String, props: SubscriptionFilterOptions): SubscriptionFilter

  /**
   * Create a new Subscription Filter on this Log Group.
   *
   * @param id Unique identifier for the construct in its parent. 
   * @param props Properties for creating the SubscriptionFilter. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6594bd057f7db2f9f802ecdd2581f361203d2614039afa6960709697b01a3d88")
  public fun addSubscriptionFilter(id: String, props: SubscriptionFilterOptions.Builder.() -> Unit):
      SubscriptionFilter

  /**
   * Create a new Transformer on this Log Group.
   *
   * @param id Unique identifier for the construct in its parent. 
   * @param props Properties for creating the Transformer. 
   */
  public fun addTransformer(id: String, props: TransformerOptions): Transformer

  /**
   * Create a new Transformer on this Log Group.
   *
   * @param id Unique identifier for the construct in its parent. 
   * @param props Properties for creating the Transformer. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b9ff4e7a8c844c9c7e83b607771b404351b7784102e7de5dbb13f4be956945d3")
  public fun addTransformer(id: String, props: TransformerOptions.Builder.() -> Unit): Transformer

  /**
   * Extract a metric from structured log events in the LogGroup.
   *
   * Creates a MetricFilter on this LogGroup that will extract the value
   * of the indicated JSON field in all records where it occurs.
   *
   * The metric will be available in CloudWatch Metrics under the
   * indicated namespace and name.
   *
   * @return A Metric object representing the extracted metric
   * @param jsonField JSON field to extract (example: '$.myfield'). 
   * @param metricNamespace Namespace to emit the metric under. 
   * @param metricName Name to emit the metric under. 
   */
  public fun extractMetric(
    jsonField: String,
    metricNamespace: String,
    metricName: String,
  ): Metric

  /**
   * Give the indicated permissions on this log group and all streams.
   *
   * @param grantee 
   * @param actions 
   */
  public fun grant(grantee: IGrantable, vararg actions: String): Grant

  /**
   * Give permissions to read from this log group and streams.
   *
   * @param grantee 
   */
  public fun grantRead(grantee: IGrantable): Grant

  /**
   * Give permissions to write to create and write to streams in this log group.
   *
   * @param grantee 
   */
  public fun grantWrite(grantee: IGrantable): Grant

  /**
   * The ARN of this log group, with ':*' appended.
   */
  public fun logGroupArn(): String

  /**
   * The name of this log group.
   */
  public fun logGroupName(): String

  /**
   * Public method to get the physical name of this log group.
   */
  public fun logGroupPhysicalName(): String

  /**
   * Return the given named metric for this Log Group.
   *
   * @param metricName The name of the metric. 
   * @param props Properties for the metric.
   */
  public fun metric(metricName: String): Metric

  /**
   * Return the given named metric for this Log Group.
   *
   * @param metricName The name of the metric. 
   * @param props Properties for the metric.
   */
  public fun metric(metricName: String, props: MetricOptions): Metric

  /**
   * Return the given named metric for this Log Group.
   *
   * @param metricName The name of the metric. 
   * @param props Properties for the metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The volume of log events in uncompressed bytes uploaded to CloudWatch Logs.
   *
   * When used with the LogGroupName dimension, this is the volume of log events
   * in uncompressed bytes uploaded to the log group.
   *
   * @param props Properties for the Cloudwatch metric.
   */
  public fun metricIncomingBytes(): Metric

  /**
   * The volume of log events in uncompressed bytes uploaded to CloudWatch Logs.
   *
   * When used with the LogGroupName dimension, this is the volume of log events
   * in uncompressed bytes uploaded to the log group.
   *
   * @param props Properties for the Cloudwatch metric.
   */
  public fun metricIncomingBytes(props: MetricOptions): Metric

  /**
   * The volume of log events in uncompressed bytes uploaded to CloudWatch Logs.
   *
   * When used with the LogGroupName dimension, this is the volume of log events
   * in uncompressed bytes uploaded to the log group.
   *
   * @param props Properties for the Cloudwatch metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("289b17285610a67712940bcd7a3287676eb71631ba3f6c55430acb662300effc")
  public fun metricIncomingBytes(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of log events uploaded to CloudWatch Logs.
   *
   * When used with the LogGroupName dimension, this is the number of
   * log events uploaded to the log group.
   *
   * @param props Properties for the Cloudwatch metric.
   */
  public fun metricIncomingLogEvents(): Metric

  /**
   * The number of log events uploaded to CloudWatch Logs.
   *
   * When used with the LogGroupName dimension, this is the number of
   * log events uploaded to the log group.
   *
   * @param props Properties for the Cloudwatch metric.
   */
  public fun metricIncomingLogEvents(props: MetricOptions): Metric

  /**
   * The number of log events uploaded to CloudWatch Logs.
   *
   * When used with the LogGroupName dimension, this is the number of
   * log events uploaded to the log group.
   *
   * @param props Properties for the Cloudwatch metric.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("01022ee4a8224c9369c1e598131d0c672ff4b9255fd2f5aa5162fc8003c3f15e")
  public fun metricIncomingLogEvents(props: MetricOptions.Builder.() -> Unit): Metric

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.ILogGroup,
  ) : CdkObject(cdkObject),
      ILogGroup {
    /**
     * Create a new Metric Filter on this Log Group.
     *
     * @param id Unique identifier for the construct in its parent. 
     * @param props Properties for creating the MetricFilter. 
     */
    override fun addMetricFilter(id: String, props: MetricFilterOptions): MetricFilter =
        unwrap(this).addMetricFilter(id,
        props.let(MetricFilterOptions.Companion::unwrap)).let(MetricFilter::wrap)

    /**
     * Create a new Metric Filter on this Log Group.
     *
     * @param id Unique identifier for the construct in its parent. 
     * @param props Properties for creating the MetricFilter. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fa5eb338ced88e08a44a54871b849cb2cc0edd7ab75cdb3b68614fc030c321db")
    override fun addMetricFilter(id: String, props: MetricFilterOptions.Builder.() -> Unit):
        MetricFilter = addMetricFilter(id, MetricFilterOptions(props))

    /**
     * Create a new Log Stream for this Log Group.
     *
     * @param id Unique identifier for the construct in its parent. 
     * @param props Properties for creating the LogStream.
     */
    override fun addStream(id: String): LogStream = unwrap(this).addStream(id).let(LogStream::wrap)

    /**
     * Create a new Log Stream for this Log Group.
     *
     * @param id Unique identifier for the construct in its parent. 
     * @param props Properties for creating the LogStream.
     */
    override fun addStream(id: String, props: StreamOptions): LogStream = unwrap(this).addStream(id,
        props.let(StreamOptions.Companion::unwrap)).let(LogStream::wrap)

    /**
     * Create a new Log Stream for this Log Group.
     *
     * @param id Unique identifier for the construct in its parent. 
     * @param props Properties for creating the LogStream.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc0acd2b2aa5766d1e96b6ab06178eafd114af09cbd7db63af738298d3dc3245")
    override fun addStream(id: String, props: StreamOptions.Builder.() -> Unit): LogStream =
        addStream(id, StreamOptions(props))

    /**
     * Create a new Subscription Filter on this Log Group.
     *
     * @param id Unique identifier for the construct in its parent. 
     * @param props Properties for creating the SubscriptionFilter. 
     */
    override fun addSubscriptionFilter(id: String, props: SubscriptionFilterOptions):
        SubscriptionFilter = unwrap(this).addSubscriptionFilter(id,
        props.let(SubscriptionFilterOptions.Companion::unwrap)).let(SubscriptionFilter::wrap)

    /**
     * Create a new Subscription Filter on this Log Group.
     *
     * @param id Unique identifier for the construct in its parent. 
     * @param props Properties for creating the SubscriptionFilter. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6594bd057f7db2f9f802ecdd2581f361203d2614039afa6960709697b01a3d88")
    override fun addSubscriptionFilter(id: String,
        props: SubscriptionFilterOptions.Builder.() -> Unit): SubscriptionFilter =
        addSubscriptionFilter(id, SubscriptionFilterOptions(props))

    /**
     * Add a statement to the resource's resource policy.
     *
     * @param statement 
     */
    override fun addToResourcePolicy(statement: PolicyStatement): AddToResourcePolicyResult =
        unwrap(this).addToResourcePolicy(statement.let(PolicyStatement.Companion::unwrap)).let(AddToResourcePolicyResult::wrap)

    /**
     * Add a statement to the resource's resource policy.
     *
     * @param statement 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b93f8258425594b02debe63f0c120f198512d8431f5ae67b7fb7780e34fcbae2")
    override fun addToResourcePolicy(statement: PolicyStatement.Builder.() -> Unit):
        AddToResourcePolicyResult = addToResourcePolicy(PolicyStatement(statement))

    /**
     * Create a new Transformer on this Log Group.
     *
     * @param id Unique identifier for the construct in its parent. 
     * @param props Properties for creating the Transformer. 
     */
    override fun addTransformer(id: String, props: TransformerOptions): Transformer =
        unwrap(this).addTransformer(id,
        props.let(TransformerOptions.Companion::unwrap)).let(Transformer::wrap)

    /**
     * Create a new Transformer on this Log Group.
     *
     * @param id Unique identifier for the construct in its parent. 
     * @param props Properties for creating the Transformer. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b9ff4e7a8c844c9c7e83b607771b404351b7784102e7de5dbb13f4be956945d3")
    override fun addTransformer(id: String, props: TransformerOptions.Builder.() -> Unit):
        Transformer = addTransformer(id, TransformerOptions(props))

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
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy.Companion::unwrap))
    }

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
     * Extract a metric from structured log events in the LogGroup.
     *
     * Creates a MetricFilter on this LogGroup that will extract the value
     * of the indicated JSON field in all records where it occurs.
     *
     * The metric will be available in CloudWatch Metrics under the
     * indicated namespace and name.
     *
     * @return A Metric object representing the extracted metric
     * @param jsonField JSON field to extract (example: '$.myfield'). 
     * @param metricNamespace Namespace to emit the metric under. 
     * @param metricName Name to emit the metric under. 
     */
    override fun extractMetric(
      jsonField: String,
      metricNamespace: String,
      metricName: String,
    ): Metric = unwrap(this).extractMetric(jsonField, metricNamespace, metricName).let(Metric::wrap)

    /**
     * Give the indicated permissions on this log group and all streams.
     *
     * @param grantee 
     * @param actions 
     */
    override fun grant(grantee: IGrantable, vararg actions: String): Grant =
        unwrap(this).grant(grantee.let(IGrantable.Companion::unwrap),
        *actions.map{CdkObjectWrappers.unwrap(it) as String}.toTypedArray()).let(Grant::wrap)

    /**
     * Give permissions to read from this log group and streams.
     *
     * @param grantee 
     */
    override fun grantRead(grantee: IGrantable): Grant =
        unwrap(this).grantRead(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * Give permissions to write to create and write to streams in this log group.
     *
     * @param grantee 
     */
    override fun grantWrite(grantee: IGrantable): Grant =
        unwrap(this).grantWrite(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * The ARN of this log group, with ':*' appended.
     */
    override fun logGroupArn(): String = unwrap(this).getLogGroupArn()

    /**
     * The name of this log group.
     */
    override fun logGroupName(): String = unwrap(this).getLogGroupName()

    /**
     * Public method to get the physical name of this log group.
     */
    override fun logGroupPhysicalName(): String = unwrap(this).logGroupPhysicalName()

    /**
     * Return the given named metric for this Log Group.
     *
     * @param metricName The name of the metric. 
     * @param props Properties for the metric.
     */
    override fun metric(metricName: String): Metric =
        unwrap(this).metric(metricName).let(Metric::wrap)

    /**
     * Return the given named metric for this Log Group.
     *
     * @param metricName The name of the metric. 
     * @param props Properties for the metric.
     */
    override fun metric(metricName: String, props: MetricOptions): Metric =
        unwrap(this).metric(metricName,
        props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * Return the given named metric for this Log Group.
     *
     * @param metricName The name of the metric. 
     * @param props Properties for the metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
        metric(metricName, MetricOptions(props))

    /**
     * The volume of log events in uncompressed bytes uploaded to CloudWatch Logs.
     *
     * When used with the LogGroupName dimension, this is the volume of log events
     * in uncompressed bytes uploaded to the log group.
     *
     * @param props Properties for the Cloudwatch metric.
     */
    override fun metricIncomingBytes(): Metric =
        unwrap(this).metricIncomingBytes().let(Metric::wrap)

    /**
     * The volume of log events in uncompressed bytes uploaded to CloudWatch Logs.
     *
     * When used with the LogGroupName dimension, this is the volume of log events
     * in uncompressed bytes uploaded to the log group.
     *
     * @param props Properties for the Cloudwatch metric.
     */
    override fun metricIncomingBytes(props: MetricOptions): Metric =
        unwrap(this).metricIncomingBytes(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The volume of log events in uncompressed bytes uploaded to CloudWatch Logs.
     *
     * When used with the LogGroupName dimension, this is the volume of log events
     * in uncompressed bytes uploaded to the log group.
     *
     * @param props Properties for the Cloudwatch metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("289b17285610a67712940bcd7a3287676eb71631ba3f6c55430acb662300effc")
    override fun metricIncomingBytes(props: MetricOptions.Builder.() -> Unit): Metric =
        metricIncomingBytes(MetricOptions(props))

    /**
     * The number of log events uploaded to CloudWatch Logs.
     *
     * When used with the LogGroupName dimension, this is the number of
     * log events uploaded to the log group.
     *
     * @param props Properties for the Cloudwatch metric.
     */
    override fun metricIncomingLogEvents(): Metric =
        unwrap(this).metricIncomingLogEvents().let(Metric::wrap)

    /**
     * The number of log events uploaded to CloudWatch Logs.
     *
     * When used with the LogGroupName dimension, this is the number of
     * log events uploaded to the log group.
     *
     * @param props Properties for the Cloudwatch metric.
     */
    override fun metricIncomingLogEvents(props: MetricOptions): Metric =
        unwrap(this).metricIncomingLogEvents(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of log events uploaded to CloudWatch Logs.
     *
     * When used with the LogGroupName dimension, this is the number of
     * log events uploaded to the log group.
     *
     * @param props Properties for the Cloudwatch metric.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("01022ee4a8224c9369c1e598131d0c672ff4b9255fd2f5aa5162fc8003c3f15e")
    override fun metricIncomingLogEvents(props: MetricOptions.Builder.() -> Unit): Metric =
        metricIncomingLogEvents(MetricOptions(props))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.ILogGroup): ILogGroup =
        CdkObjectWrappers.wrap(cdkObject) as? ILogGroup ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILogGroup): software.amazon.awscdk.services.logs.ILogGroup =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.logs.ILogGroup
  }
}

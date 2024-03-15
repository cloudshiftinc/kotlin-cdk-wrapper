@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
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
  public fun grant(grantee: IGrantable, actions: String): Grant

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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.ILogGroup,
  ) : CdkObject(cdkObject), ILogGroup {
    /**
     * Create a new Metric Filter on this Log Group.
     *
     * @param id Unique identifier for the construct in its parent. 
     * @param props Properties for creating the MetricFilter. 
     */
    override fun addMetricFilter(id: String, props: MetricFilterOptions): MetricFilter =
        unwrap(this).addMetricFilter(id,
        props.let(MetricFilterOptions::unwrap)).let(MetricFilter::wrap)

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
        props.let(StreamOptions::unwrap)).let(LogStream::wrap)

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
        props.let(SubscriptionFilterOptions::unwrap)).let(SubscriptionFilter::wrap)

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
        unwrap(this).addToResourcePolicy(statement.let(PolicyStatement::unwrap)).let(AddToResourcePolicyResult::wrap)

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
    override fun grant(grantee: IGrantable, actions: String): Grant =
        unwrap(this).grant(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

    /**
     * Give permissions to read from this log group and streams.
     *
     * @param grantee 
     */
    override fun grantRead(grantee: IGrantable): Grant =
        unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Give permissions to write to create and write to streams in this log group.
     *
     * @param grantee 
     */
    override fun grantWrite(grantee: IGrantable): Grant =
        unwrap(this).grantWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

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

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.ILogGroup): ILogGroup =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILogGroup): software.amazon.awscdk.services.logs.ILogGroup =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.logs.ILogGroup
  }
}

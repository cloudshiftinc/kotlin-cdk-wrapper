@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IResourceWithPolicy
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

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.ILogGroup): ILogGroup =
        CdkObjectWrappers.wrap(cdkObject) as ILogGroup

    internal fun unwrap(wrapped: ILogGroup): software.amazon.awscdk.services.logs.ILogGroup =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.logs.ILogGroup
  }
}

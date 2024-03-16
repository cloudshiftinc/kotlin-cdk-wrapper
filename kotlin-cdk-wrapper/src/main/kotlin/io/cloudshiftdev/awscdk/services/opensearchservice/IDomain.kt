@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * An interface that represents an Amazon OpenSearch Service domain - either created with the CDK,
 * or an existing one.
 */
public interface IDomain : IResource {
  /**
   * Arn of the Amazon OpenSearch Service domain.
   */
  public fun domainArn(): String

  /**
   * Endpoint of the Amazon OpenSearch Service domain.
   */
  public fun domainEndpoint(): String

  /**
   * Identifier of the Amazon OpenSearch Service domain.
   */
  public fun domainId(): String

  /**
   * Domain name of the Amazon OpenSearch Service domain.
   */
  public fun domainName(): String

  /**
   * Grant read permissions for an index in this domain to an IAM principal (Role/Group/User).
   *
   * @param index The index to grant permissions for. 
   * @param identity The principal. 
   */
  public fun grantIndexRead(index: String, identity: IGrantable): Grant

  /**
   * Grant read/write permissions for an index in this domain to an IAM principal (Role/Group/User).
   *
   * @param index The index to grant permissions for. 
   * @param identity The principal. 
   */
  public fun grantIndexReadWrite(index: String, identity: IGrantable): Grant

  /**
   * Grant write permissions for an index in this domain to an IAM principal (Role/Group/User).
   *
   * @param index The index to grant permissions for. 
   * @param identity The principal. 
   */
  public fun grantIndexWrite(index: String, identity: IGrantable): Grant

  /**
   * Grant read permissions for a specific path in this domain to an IAM principal
   * (Role/Group/User).
   *
   * @param path The path to grant permissions for. 
   * @param identity The principal. 
   */
  public fun grantPathRead(path: String, identity: IGrantable): Grant

  /**
   * Grant read/write permissions for a specific path in this domain to an IAM principal
   * (Role/Group/User).
   *
   * @param path The path to grant permissions for. 
   * @param identity The principal. 
   */
  public fun grantPathReadWrite(path: String, identity: IGrantable): Grant

  /**
   * Grant write permissions for a specific path in this domain to an IAM principal
   * (Role/Group/User).
   *
   * @param path The path to grant permissions for. 
   * @param identity The principal. 
   */
  public fun grantPathWrite(path: String, identity: IGrantable): Grant

  /**
   * Grant read permissions for this domain and its contents to an IAM principal (Role/Group/User).
   *
   * @param identity The principal. 
   */
  public fun grantRead(identity: IGrantable): Grant

  /**
   * Grant read/write permissions for this domain and its contents to an IAM principal
   * (Role/Group/User).
   *
   * @param identity The principal. 
   */
  public fun grantReadWrite(identity: IGrantable): Grant

  /**
   * Grant write permissions for this domain and its contents to an IAM principal (Role/Group/User).
   *
   * @param identity The principal. 
   */
  public fun grantWrite(identity: IGrantable): Grant

  /**
   * Return the given named metric for this domain.
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String): Metric

  /**
   * Return the given named metric for this domain.
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String, props: MetricOptions): Metric

  /**
   * Return the given named metric for this domain.
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for automated snapshot failures.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public fun metricAutomatedSnapshotFailure(): Metric

  /**
   * Metric for automated snapshot failures.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public fun metricAutomatedSnapshotFailure(props: MetricOptions): Metric

  /**
   * Metric for automated snapshot failures.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f9f702cdc4e375e8b739cdce26ff5c0a5606646a98edb39614863885f1182c7f")
  public fun metricAutomatedSnapshotFailure(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the cluster blocking index writes.
   *
   * Default: maximum over 1 minute
   *
   * @param props
   */
  public fun metricClusterIndexWritesBlocked(): Metric

  /**
   * Metric for the cluster blocking index writes.
   *
   * Default: maximum over 1 minute
   *
   * @param props
   */
  public fun metricClusterIndexWritesBlocked(props: MetricOptions): Metric

  /**
   * Metric for the cluster blocking index writes.
   *
   * Default: maximum over 1 minute
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("016b489514978517ae80814c783dc254d3f821a64ba427a0725fa9ed3e854018")
  public fun metricClusterIndexWritesBlocked(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the time the cluster status is red.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public fun metricClusterStatusRed(): Metric

  /**
   * Metric for the time the cluster status is red.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public fun metricClusterStatusRed(props: MetricOptions): Metric

  /**
   * Metric for the time the cluster status is red.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5e0926b5a2e18fffe32b1ec2076e81bbcc7d98107a425301c58fbc9d2905a860")
  public fun metricClusterStatusRed(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the time the cluster status is yellow.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public fun metricClusterStatusYellow(): Metric

  /**
   * Metric for the time the cluster status is yellow.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public fun metricClusterStatusYellow(props: MetricOptions): Metric

  /**
   * Metric for the time the cluster status is yellow.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1ef39420c98f9d4cfefd45b8c2db0c21ea1a1e68a7c9b723df1412af465bda2f")
  public fun metricClusterStatusYellow(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public fun metricCpuUtilization(): Metric

  /**
   * Metric for CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public fun metricCpuUtilization(props: MetricOptions): Metric

  /**
   * Metric for CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("06a38048efcdd43000e7f66d74001004b818625d95136f460bf350a2397a31d0")
  public fun metricCpuUtilization(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the storage space of nodes in the cluster.
   *
   * Default: minimum over 5 minutes
   *
   * @param props
   */
  public fun metricFreeStorageSpace(): Metric

  /**
   * Metric for the storage space of nodes in the cluster.
   *
   * Default: minimum over 5 minutes
   *
   * @param props
   */
  public fun metricFreeStorageSpace(props: MetricOptions): Metric

  /**
   * Metric for the storage space of nodes in the cluster.
   *
   * Default: minimum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("368af7ac3be4f10e672f08286b7e70f8633b6e9198d1685bfedc9108b3414e62")
  public fun metricFreeStorageSpace(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for indexing latency.
   *
   * Default: p99 over 5 minutes
   *
   * @param props
   */
  public fun metricIndexingLatency(): Metric

  /**
   * Metric for indexing latency.
   *
   * Default: p99 over 5 minutes
   *
   * @param props
   */
  public fun metricIndexingLatency(props: MetricOptions): Metric

  /**
   * Metric for indexing latency.
   *
   * Default: p99 over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("07b87f2aa9d61ee51a0627ce9ffe82c5e5f6e38fef54d0ff7ab95be9c0731c15")
  public fun metricIndexingLatency(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public fun metricJvmMemoryPressure(): Metric

  /**
   * Metric for JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public fun metricJvmMemoryPressure(props: MetricOptions): Metric

  /**
   * Metric for JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("283ffec8edbd9b28227078700405c8b7b7fe0f6bf433f6323ba9205b4c8a528f")
  public fun metricJvmMemoryPressure(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for KMS key errors.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public fun metricKmsKeyError(): Metric

  /**
   * Metric for KMS key errors.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public fun metricKmsKeyError(props: MetricOptions): Metric

  /**
   * Metric for KMS key errors.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("309d28dee34b268d496bc1e8ba269d5bff9ec10e9e17132d9a884e208a805741")
  public fun metricKmsKeyError(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for KMS key being inaccessible.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public fun metricKmsKeyInaccessible(): Metric

  /**
   * Metric for KMS key being inaccessible.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public fun metricKmsKeyInaccessible(props: MetricOptions): Metric

  /**
   * Metric for KMS key being inaccessible.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bfca9e4cdc1ad37f6d57f9fdeb4258e1c6235ab92ed8224c8ee4cda359baaad6")
  public fun metricKmsKeyInaccessible(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for master CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public fun metricMasterCpuUtilization(): Metric

  /**
   * Metric for master CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public fun metricMasterCpuUtilization(props: MetricOptions): Metric

  /**
   * Metric for master CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8a46b211229de3f431630b8ea4f99843647a1cab494f599c79138732a397c709")
  public fun metricMasterCpuUtilization(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for master JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public fun metricMasterJvmMemoryPressure(): Metric

  /**
   * Metric for master JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public fun metricMasterJvmMemoryPressure(props: MetricOptions): Metric

  /**
   * Metric for master JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fbcf8e4882306bcb2bed673a80ed7a54a16cc27adfc1a7fe173fbb566b335350")
  public fun metricMasterJvmMemoryPressure(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for the number of nodes.
   *
   * Default: minimum over 1 hour
   *
   * @param props
   */
  public fun metricNodes(): Metric

  /**
   * Metric for the number of nodes.
   *
   * Default: minimum over 1 hour
   *
   * @param props
   */
  public fun metricNodes(props: MetricOptions): Metric

  /**
   * Metric for the number of nodes.
   *
   * Default: minimum over 1 hour
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("355f82e0d8db21f2bb54b9766182780100c904a3efcf3167fc2c3468c208268b")
  public fun metricNodes(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for search latency.
   *
   * Default: p99 over 5 minutes
   *
   * @param props
   */
  public fun metricSearchLatency(): Metric

  /**
   * Metric for search latency.
   *
   * Default: p99 over 5 minutes
   *
   * @param props
   */
  public fun metricSearchLatency(props: MetricOptions): Metric

  /**
   * Metric for search latency.
   *
   * Default: p99 over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b37148931823e387018afa8190e3e362020aa1dc4211a32e63ee13acb1e89fd6")
  public fun metricSearchLatency(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * Metric for number of searchable documents.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public fun metricSearchableDocuments(): Metric

  /**
   * Metric for number of searchable documents.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  public fun metricSearchableDocuments(props: MetricOptions): Metric

  /**
   * Metric for number of searchable documents.
   *
   * Default: maximum over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("92e1cde4c44cd4a6f76bd4af6b9e03846698bfe485a039b042b4989c8258df65")
  public fun metricSearchableDocuments(props: MetricOptions.Builder.() -> Unit): Metric

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.opensearchservice.IDomain): IDomain
        = CdkObjectWrappers.wrap(cdkObject) as IDomain

    internal fun unwrap(wrapped: IDomain): software.amazon.awscdk.services.opensearchservice.IDomain
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.opensearchservice.IDomain
  }
}

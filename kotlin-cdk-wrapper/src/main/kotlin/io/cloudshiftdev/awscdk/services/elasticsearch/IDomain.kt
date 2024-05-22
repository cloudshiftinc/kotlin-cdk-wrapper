@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticsearch

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Node
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * (deprecated) An interface that represents an Elasticsearch domain - either created with the CDK,
 * or an existing one.
 *
 * @deprecated use opensearchservice module instead
 */
public interface IDomain : IResource {
  /**
   * (deprecated) Arn of the Elasticsearch domain.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun domainArn(): String

  /**
   * (deprecated) Endpoint of the Elasticsearch domain.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun domainEndpoint(): String

  /**
   * (deprecated) Domain name of the Elasticsearch domain.
   *
   * @deprecated use opensearchservice module instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun domainName(): String

  /**
   * (deprecated) Grant read permissions for an index in this domain to an IAM principal
   * (Role/Group/User).
   *
   * @deprecated use opensearchservice module instead
   * @param index The index to grant permissions for. 
   * @param identity The principal. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun grantIndexRead(index: String, identity: IGrantable): Grant

  /**
   * (deprecated) Grant read/write permissions for an index in this domain to an IAM principal
   * (Role/Group/User).
   *
   * @deprecated use opensearchservice module instead
   * @param index The index to grant permissions for. 
   * @param identity The principal. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun grantIndexReadWrite(index: String, identity: IGrantable): Grant

  /**
   * (deprecated) Grant write permissions for an index in this domain to an IAM principal
   * (Role/Group/User).
   *
   * @deprecated use opensearchservice module instead
   * @param index The index to grant permissions for. 
   * @param identity The principal. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun grantIndexWrite(index: String, identity: IGrantable): Grant

  /**
   * (deprecated) Grant read permissions for a specific path in this domain to an IAM principal
   * (Role/Group/User).
   *
   * @deprecated use opensearchservice module instead
   * @param path The path to grant permissions for. 
   * @param identity The principal. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun grantPathRead(path: String, identity: IGrantable): Grant

  /**
   * (deprecated) Grant read/write permissions for a specific path in this domain to an IAM
   * principal (Role/Group/User).
   *
   * @deprecated use opensearchservice module instead
   * @param path The path to grant permissions for. 
   * @param identity The principal. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun grantPathReadWrite(path: String, identity: IGrantable): Grant

  /**
   * (deprecated) Grant write permissions for a specific path in this domain to an IAM principal
   * (Role/Group/User).
   *
   * @deprecated use opensearchservice module instead
   * @param path The path to grant permissions for. 
   * @param identity The principal. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun grantPathWrite(path: String, identity: IGrantable): Grant

  /**
   * (deprecated) Grant read permissions for this domain and its contents to an IAM principal
   * (Role/Group/User).
   *
   * @deprecated use opensearchservice module instead
   * @param identity The principal. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun grantRead(identity: IGrantable): Grant

  /**
   * (deprecated) Grant read/write permissions for this domain and its contents to an IAM principal
   * (Role/Group/User).
   *
   * @deprecated use opensearchservice module instead
   * @param identity The principal. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun grantReadWrite(identity: IGrantable): Grant

  /**
   * (deprecated) Grant write permissions for this domain and its contents to an IAM principal
   * (Role/Group/User).
   *
   * @deprecated use opensearchservice module instead
   * @param identity The principal. 
   */
  @Deprecated(message = "deprecated in CDK")
  public fun grantWrite(identity: IGrantable): Grant

  /**
   * (deprecated) Return the given named metric for this Domain.
   *
   * @deprecated use opensearchservice module instead
   * @param metricName 
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metric(metricName: String): Metric

  /**
   * (deprecated) Return the given named metric for this Domain.
   *
   * @deprecated use opensearchservice module instead
   * @param metricName 
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metric(metricName: String, props: MetricOptions): Metric

  /**
   * (deprecated) Return the given named metric for this Domain.
   *
   * @deprecated use opensearchservice module instead
   * @param metricName 
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * (deprecated) Metric for automated snapshot failures.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricAutomatedSnapshotFailure(): Metric

  /**
   * (deprecated) Metric for automated snapshot failures.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricAutomatedSnapshotFailure(props: MetricOptions): Metric

  /**
   * (deprecated) Metric for automated snapshot failures.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f9f702cdc4e375e8b739cdce26ff5c0a5606646a98edb39614863885f1182c7f")
  public fun metricAutomatedSnapshotFailure(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * (deprecated) Metric for CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricCPUUtilization(): Metric

  /**
   * (deprecated) Metric for CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricCPUUtilization(props: MetricOptions): Metric

  /**
   * (deprecated) Metric for CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("66a273587ca08857c76d1952aa0bb360d86bfe06cc24788a922415fa0fa097ef")
  public fun metricCPUUtilization(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * (deprecated) Metric for the cluster blocking index writes.
   *
   * Default: maximum over 1 minute
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricClusterIndexWritesBlocked(): Metric

  /**
   * (deprecated) Metric for the cluster blocking index writes.
   *
   * Default: maximum over 1 minute
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricClusterIndexWritesBlocked(props: MetricOptions): Metric

  /**
   * (deprecated) Metric for the cluster blocking index writes.
   *
   * Default: maximum over 1 minute
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("016b489514978517ae80814c783dc254d3f821a64ba427a0725fa9ed3e854018")
  public fun metricClusterIndexWritesBlocked(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * (deprecated) Metric for the time the cluster status is red.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricClusterStatusRed(): Metric

  /**
   * (deprecated) Metric for the time the cluster status is red.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricClusterStatusRed(props: MetricOptions): Metric

  /**
   * (deprecated) Metric for the time the cluster status is red.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5e0926b5a2e18fffe32b1ec2076e81bbcc7d98107a425301c58fbc9d2905a860")
  public fun metricClusterStatusRed(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * (deprecated) Metric for the time the cluster status is yellow.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricClusterStatusYellow(): Metric

  /**
   * (deprecated) Metric for the time the cluster status is yellow.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricClusterStatusYellow(props: MetricOptions): Metric

  /**
   * (deprecated) Metric for the time the cluster status is yellow.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1ef39420c98f9d4cfefd45b8c2db0c21ea1a1e68a7c9b723df1412af465bda2f")
  public fun metricClusterStatusYellow(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * (deprecated) Metric for the storage space of nodes in the cluster.
   *
   * Default: minimum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricFreeStorageSpace(): Metric

  /**
   * (deprecated) Metric for the storage space of nodes in the cluster.
   *
   * Default: minimum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricFreeStorageSpace(props: MetricOptions): Metric

  /**
   * (deprecated) Metric for the storage space of nodes in the cluster.
   *
   * Default: minimum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("368af7ac3be4f10e672f08286b7e70f8633b6e9198d1685bfedc9108b3414e62")
  public fun metricFreeStorageSpace(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * (deprecated) Metric for indexing latency.
   *
   * Default: p99 over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricIndexingLatency(): Metric

  /**
   * (deprecated) Metric for indexing latency.
   *
   * Default: p99 over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricIndexingLatency(props: MetricOptions): Metric

  /**
   * (deprecated) Metric for indexing latency.
   *
   * Default: p99 over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("07b87f2aa9d61ee51a0627ce9ffe82c5e5f6e38fef54d0ff7ab95be9c0731c15")
  public fun metricIndexingLatency(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * (deprecated) Metric for JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricJVMMemoryPressure(): Metric

  /**
   * (deprecated) Metric for JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricJVMMemoryPressure(props: MetricOptions): Metric

  /**
   * (deprecated) Metric for JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bbc5860f20525c5c3cf2850d91d7efa180c7058337e1de65c8420bc7be81cc9b")
  public fun metricJVMMemoryPressure(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * (deprecated) Metric for KMS key errors.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricKMSKeyError(): Metric

  /**
   * (deprecated) Metric for KMS key errors.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricKMSKeyError(props: MetricOptions): Metric

  /**
   * (deprecated) Metric for KMS key errors.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e6d547afff79fd0803e3b15eb00be8f5c5c65020938e7e8c527fefe04c3ec7de")
  public fun metricKMSKeyError(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * (deprecated) Metric for KMS key being inaccessible.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricKMSKeyInaccessible(): Metric

  /**
   * (deprecated) Metric for KMS key being inaccessible.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricKMSKeyInaccessible(props: MetricOptions): Metric

  /**
   * (deprecated) Metric for KMS key being inaccessible.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5c4bf93f4e622d4a76178b4868be7efe604fd3d16316e4a05742bea79f81ef77")
  public fun metricKMSKeyInaccessible(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * (deprecated) Metric for master CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricMasterCPUUtilization(): Metric

  /**
   * (deprecated) Metric for master CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricMasterCPUUtilization(props: MetricOptions): Metric

  /**
   * (deprecated) Metric for master CPU utilization.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9bfbec0deb2fa2aad0f19ca7ed1e5d7e6bd722bd278b8f9e86e0086d51527219")
  public fun metricMasterCPUUtilization(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * (deprecated) Metric for master JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricMasterJVMMemoryPressure(): Metric

  /**
   * (deprecated) Metric for master JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricMasterJVMMemoryPressure(props: MetricOptions): Metric

  /**
   * (deprecated) Metric for master JVM memory pressure.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8abbe6fe8c9df31c7c02cf8f2ff374dd99996363ad1f3de815273cee61f4b816")
  public fun metricMasterJVMMemoryPressure(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * (deprecated) Metric for the number of nodes.
   *
   * Default: minimum over 1 hour
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricNodes(): Metric

  /**
   * (deprecated) Metric for the number of nodes.
   *
   * Default: minimum over 1 hour
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricNodes(props: MetricOptions): Metric

  /**
   * (deprecated) Metric for the number of nodes.
   *
   * Default: minimum over 1 hour
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("355f82e0d8db21f2bb54b9766182780100c904a3efcf3167fc2c3468c208268b")
  public fun metricNodes(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * (deprecated) Metric for search latency.
   *
   * Default: p99 over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricSearchLatency(): Metric

  /**
   * (deprecated) Metric for search latency.
   *
   * Default: p99 over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricSearchLatency(props: MetricOptions): Metric

  /**
   * (deprecated) Metric for search latency.
   *
   * Default: p99 over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b37148931823e387018afa8190e3e362020aa1dc4211a32e63ee13acb1e89fd6")
  public fun metricSearchLatency(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * (deprecated) Metric for number of searchable documents.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricSearchableDocuments(): Metric

  /**
   * (deprecated) Metric for number of searchable documents.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  public fun metricSearchableDocuments(props: MetricOptions): Metric

  /**
   * (deprecated) Metric for number of searchable documents.
   *
   * Default: maximum over 5 minutes
   *
   * @deprecated use opensearchservice module instead
   * @param props
   */
  @Deprecated(message = "deprecated in CDK")
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("92e1cde4c44cd4a6f76bd4af6b9e03846698bfe485a039b042b4989c8258df65")
  public fun metricSearchableDocuments(props: MetricOptions.Builder.() -> Unit): Metric

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.elasticsearch.IDomain,
  ) : CdkObject(cdkObject), IDomain {
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
     * (deprecated) Arn of the Elasticsearch domain.
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun domainArn(): String = unwrap(this).getDomainArn()

    /**
     * (deprecated) Endpoint of the Elasticsearch domain.
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun domainEndpoint(): String = unwrap(this).getDomainEndpoint()

    /**
     * (deprecated) Domain name of the Elasticsearch domain.
     *
     * @deprecated use opensearchservice module instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun domainName(): String = unwrap(this).getDomainName()

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
     * (deprecated) Grant read permissions for an index in this domain to an IAM principal
     * (Role/Group/User).
     *
     * @deprecated use opensearchservice module instead
     * @param index The index to grant permissions for. 
     * @param identity The principal. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun grantIndexRead(index: String, identity: IGrantable): Grant =
        unwrap(this).grantIndexRead(index,
        identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * (deprecated) Grant read/write permissions for an index in this domain to an IAM principal
     * (Role/Group/User).
     *
     * @deprecated use opensearchservice module instead
     * @param index The index to grant permissions for. 
     * @param identity The principal. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun grantIndexReadWrite(index: String, identity: IGrantable): Grant =
        unwrap(this).grantIndexReadWrite(index,
        identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * (deprecated) Grant write permissions for an index in this domain to an IAM principal
     * (Role/Group/User).
     *
     * @deprecated use opensearchservice module instead
     * @param index The index to grant permissions for. 
     * @param identity The principal. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun grantIndexWrite(index: String, identity: IGrantable): Grant =
        unwrap(this).grantIndexWrite(index,
        identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * (deprecated) Grant read permissions for a specific path in this domain to an IAM principal
     * (Role/Group/User).
     *
     * @deprecated use opensearchservice module instead
     * @param path The path to grant permissions for. 
     * @param identity The principal. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun grantPathRead(path: String, identity: IGrantable): Grant =
        unwrap(this).grantPathRead(path,
        identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * (deprecated) Grant read/write permissions for a specific path in this domain to an IAM
     * principal (Role/Group/User).
     *
     * @deprecated use opensearchservice module instead
     * @param path The path to grant permissions for. 
     * @param identity The principal. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun grantPathReadWrite(path: String, identity: IGrantable): Grant =
        unwrap(this).grantPathReadWrite(path,
        identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * (deprecated) Grant write permissions for a specific path in this domain to an IAM principal
     * (Role/Group/User).
     *
     * @deprecated use opensearchservice module instead
     * @param path The path to grant permissions for. 
     * @param identity The principal. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun grantPathWrite(path: String, identity: IGrantable): Grant =
        unwrap(this).grantPathWrite(path,
        identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * (deprecated) Grant read permissions for this domain and its contents to an IAM principal
     * (Role/Group/User).
     *
     * @deprecated use opensearchservice module instead
     * @param identity The principal. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun grantRead(identity: IGrantable): Grant =
        unwrap(this).grantRead(identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * (deprecated) Grant read/write permissions for this domain and its contents to an IAM
     * principal (Role/Group/User).
     *
     * @deprecated use opensearchservice module instead
     * @param identity The principal. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun grantReadWrite(identity: IGrantable): Grant =
        unwrap(this).grantReadWrite(identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * (deprecated) Grant write permissions for this domain and its contents to an IAM principal
     * (Role/Group/User).
     *
     * @deprecated use opensearchservice module instead
     * @param identity The principal. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun grantWrite(identity: IGrantable): Grant =
        unwrap(this).grantWrite(identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * (deprecated) Return the given named metric for this Domain.
     *
     * @deprecated use opensearchservice module instead
     * @param metricName 
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metric(metricName: String): Metric =
        unwrap(this).metric(metricName).let(Metric::wrap)

    /**
     * (deprecated) Return the given named metric for this Domain.
     *
     * @deprecated use opensearchservice module instead
     * @param metricName 
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metric(metricName: String, props: MetricOptions): Metric =
        unwrap(this).metric(metricName,
        props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * (deprecated) Return the given named metric for this Domain.
     *
     * @deprecated use opensearchservice module instead
     * @param metricName 
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
        metric(metricName, MetricOptions(props))

    /**
     * (deprecated) Metric for automated snapshot failures.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricAutomatedSnapshotFailure(): Metric =
        unwrap(this).metricAutomatedSnapshotFailure().let(Metric::wrap)

    /**
     * (deprecated) Metric for automated snapshot failures.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricAutomatedSnapshotFailure(props: MetricOptions): Metric =
        unwrap(this).metricAutomatedSnapshotFailure(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * (deprecated) Metric for automated snapshot failures.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9f702cdc4e375e8b739cdce26ff5c0a5606646a98edb39614863885f1182c7f")
    override fun metricAutomatedSnapshotFailure(props: MetricOptions.Builder.() -> Unit): Metric =
        metricAutomatedSnapshotFailure(MetricOptions(props))

    /**
     * (deprecated) Metric for CPU utilization.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricCPUUtilization(): Metric =
        unwrap(this).metricCPUUtilization().let(Metric::wrap)

    /**
     * (deprecated) Metric for CPU utilization.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricCPUUtilization(props: MetricOptions): Metric =
        unwrap(this).metricCPUUtilization(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * (deprecated) Metric for CPU utilization.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66a273587ca08857c76d1952aa0bb360d86bfe06cc24788a922415fa0fa097ef")
    override fun metricCPUUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
        metricCPUUtilization(MetricOptions(props))

    /**
     * (deprecated) Metric for the cluster blocking index writes.
     *
     * Default: maximum over 1 minute
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricClusterIndexWritesBlocked(): Metric =
        unwrap(this).metricClusterIndexWritesBlocked().let(Metric::wrap)

    /**
     * (deprecated) Metric for the cluster blocking index writes.
     *
     * Default: maximum over 1 minute
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricClusterIndexWritesBlocked(props: MetricOptions): Metric =
        unwrap(this).metricClusterIndexWritesBlocked(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * (deprecated) Metric for the cluster blocking index writes.
     *
     * Default: maximum over 1 minute
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("016b489514978517ae80814c783dc254d3f821a64ba427a0725fa9ed3e854018")
    override fun metricClusterIndexWritesBlocked(props: MetricOptions.Builder.() -> Unit): Metric =
        metricClusterIndexWritesBlocked(MetricOptions(props))

    /**
     * (deprecated) Metric for the time the cluster status is red.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricClusterStatusRed(): Metric =
        unwrap(this).metricClusterStatusRed().let(Metric::wrap)

    /**
     * (deprecated) Metric for the time the cluster status is red.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricClusterStatusRed(props: MetricOptions): Metric =
        unwrap(this).metricClusterStatusRed(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * (deprecated) Metric for the time the cluster status is red.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e0926b5a2e18fffe32b1ec2076e81bbcc7d98107a425301c58fbc9d2905a860")
    override fun metricClusterStatusRed(props: MetricOptions.Builder.() -> Unit): Metric =
        metricClusterStatusRed(MetricOptions(props))

    /**
     * (deprecated) Metric for the time the cluster status is yellow.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricClusterStatusYellow(): Metric =
        unwrap(this).metricClusterStatusYellow().let(Metric::wrap)

    /**
     * (deprecated) Metric for the time the cluster status is yellow.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricClusterStatusYellow(props: MetricOptions): Metric =
        unwrap(this).metricClusterStatusYellow(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * (deprecated) Metric for the time the cluster status is yellow.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ef39420c98f9d4cfefd45b8c2db0c21ea1a1e68a7c9b723df1412af465bda2f")
    override fun metricClusterStatusYellow(props: MetricOptions.Builder.() -> Unit): Metric =
        metricClusterStatusYellow(MetricOptions(props))

    /**
     * (deprecated) Metric for the storage space of nodes in the cluster.
     *
     * Default: minimum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricFreeStorageSpace(): Metric =
        unwrap(this).metricFreeStorageSpace().let(Metric::wrap)

    /**
     * (deprecated) Metric for the storage space of nodes in the cluster.
     *
     * Default: minimum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricFreeStorageSpace(props: MetricOptions): Metric =
        unwrap(this).metricFreeStorageSpace(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * (deprecated) Metric for the storage space of nodes in the cluster.
     *
     * Default: minimum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("368af7ac3be4f10e672f08286b7e70f8633b6e9198d1685bfedc9108b3414e62")
    override fun metricFreeStorageSpace(props: MetricOptions.Builder.() -> Unit): Metric =
        metricFreeStorageSpace(MetricOptions(props))

    /**
     * (deprecated) Metric for indexing latency.
     *
     * Default: p99 over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricIndexingLatency(): Metric =
        unwrap(this).metricIndexingLatency().let(Metric::wrap)

    /**
     * (deprecated) Metric for indexing latency.
     *
     * Default: p99 over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricIndexingLatency(props: MetricOptions): Metric =
        unwrap(this).metricIndexingLatency(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * (deprecated) Metric for indexing latency.
     *
     * Default: p99 over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07b87f2aa9d61ee51a0627ce9ffe82c5e5f6e38fef54d0ff7ab95be9c0731c15")
    override fun metricIndexingLatency(props: MetricOptions.Builder.() -> Unit): Metric =
        metricIndexingLatency(MetricOptions(props))

    /**
     * (deprecated) Metric for JVM memory pressure.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricJVMMemoryPressure(): Metric =
        unwrap(this).metricJVMMemoryPressure().let(Metric::wrap)

    /**
     * (deprecated) Metric for JVM memory pressure.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricJVMMemoryPressure(props: MetricOptions): Metric =
        unwrap(this).metricJVMMemoryPressure(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * (deprecated) Metric for JVM memory pressure.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bbc5860f20525c5c3cf2850d91d7efa180c7058337e1de65c8420bc7be81cc9b")
    override fun metricJVMMemoryPressure(props: MetricOptions.Builder.() -> Unit): Metric =
        metricJVMMemoryPressure(MetricOptions(props))

    /**
     * (deprecated) Metric for KMS key errors.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricKMSKeyError(): Metric = unwrap(this).metricKMSKeyError().let(Metric::wrap)

    /**
     * (deprecated) Metric for KMS key errors.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricKMSKeyError(props: MetricOptions): Metric =
        unwrap(this).metricKMSKeyError(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * (deprecated) Metric for KMS key errors.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e6d547afff79fd0803e3b15eb00be8f5c5c65020938e7e8c527fefe04c3ec7de")
    override fun metricKMSKeyError(props: MetricOptions.Builder.() -> Unit): Metric =
        metricKMSKeyError(MetricOptions(props))

    /**
     * (deprecated) Metric for KMS key being inaccessible.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricKMSKeyInaccessible(): Metric =
        unwrap(this).metricKMSKeyInaccessible().let(Metric::wrap)

    /**
     * (deprecated) Metric for KMS key being inaccessible.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricKMSKeyInaccessible(props: MetricOptions): Metric =
        unwrap(this).metricKMSKeyInaccessible(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * (deprecated) Metric for KMS key being inaccessible.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c4bf93f4e622d4a76178b4868be7efe604fd3d16316e4a05742bea79f81ef77")
    override fun metricKMSKeyInaccessible(props: MetricOptions.Builder.() -> Unit): Metric =
        metricKMSKeyInaccessible(MetricOptions(props))

    /**
     * (deprecated) Metric for master CPU utilization.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricMasterCPUUtilization(): Metric =
        unwrap(this).metricMasterCPUUtilization().let(Metric::wrap)

    /**
     * (deprecated) Metric for master CPU utilization.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricMasterCPUUtilization(props: MetricOptions): Metric =
        unwrap(this).metricMasterCPUUtilization(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * (deprecated) Metric for master CPU utilization.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9bfbec0deb2fa2aad0f19ca7ed1e5d7e6bd722bd278b8f9e86e0086d51527219")
    override fun metricMasterCPUUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
        metricMasterCPUUtilization(MetricOptions(props))

    /**
     * (deprecated) Metric for master JVM memory pressure.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricMasterJVMMemoryPressure(): Metric =
        unwrap(this).metricMasterJVMMemoryPressure().let(Metric::wrap)

    /**
     * (deprecated) Metric for master JVM memory pressure.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricMasterJVMMemoryPressure(props: MetricOptions): Metric =
        unwrap(this).metricMasterJVMMemoryPressure(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * (deprecated) Metric for master JVM memory pressure.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8abbe6fe8c9df31c7c02cf8f2ff374dd99996363ad1f3de815273cee61f4b816")
    override fun metricMasterJVMMemoryPressure(props: MetricOptions.Builder.() -> Unit): Metric =
        metricMasterJVMMemoryPressure(MetricOptions(props))

    /**
     * (deprecated) Metric for the number of nodes.
     *
     * Default: minimum over 1 hour
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricNodes(): Metric = unwrap(this).metricNodes().let(Metric::wrap)

    /**
     * (deprecated) Metric for the number of nodes.
     *
     * Default: minimum over 1 hour
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricNodes(props: MetricOptions): Metric =
        unwrap(this).metricNodes(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * (deprecated) Metric for the number of nodes.
     *
     * Default: minimum over 1 hour
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("355f82e0d8db21f2bb54b9766182780100c904a3efcf3167fc2c3468c208268b")
    override fun metricNodes(props: MetricOptions.Builder.() -> Unit): Metric =
        metricNodes(MetricOptions(props))

    /**
     * (deprecated) Metric for search latency.
     *
     * Default: p99 over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricSearchLatency(): Metric =
        unwrap(this).metricSearchLatency().let(Metric::wrap)

    /**
     * (deprecated) Metric for search latency.
     *
     * Default: p99 over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricSearchLatency(props: MetricOptions): Metric =
        unwrap(this).metricSearchLatency(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * (deprecated) Metric for search latency.
     *
     * Default: p99 over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b37148931823e387018afa8190e3e362020aa1dc4211a32e63ee13acb1e89fd6")
    override fun metricSearchLatency(props: MetricOptions.Builder.() -> Unit): Metric =
        metricSearchLatency(MetricOptions(props))

    /**
     * (deprecated) Metric for number of searchable documents.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricSearchableDocuments(): Metric =
        unwrap(this).metricSearchableDocuments().let(Metric::wrap)

    /**
     * (deprecated) Metric for number of searchable documents.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    override fun metricSearchableDocuments(props: MetricOptions): Metric =
        unwrap(this).metricSearchableDocuments(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * (deprecated) Metric for number of searchable documents.
     *
     * Default: maximum over 5 minutes
     *
     * @deprecated use opensearchservice module instead
     * @param props
     */
    @Deprecated(message = "deprecated in CDK")
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("92e1cde4c44cd4a6f76bd4af6b9e03846698bfe485a039b042b4989c8258df65")
    override fun metricSearchableDocuments(props: MetricOptions.Builder.() -> Unit): Metric =
        metricSearchableDocuments(MetricOptions(props))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticsearch.IDomain): IDomain =
        CdkObjectWrappers.wrap(cdkObject) as? IDomain ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDomain): software.amazon.awscdk.services.elasticsearch.IDomain =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.elasticsearch.IDomain
  }
}

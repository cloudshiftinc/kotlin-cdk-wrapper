@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecretAttachmentTarget
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretAttachmentTargetProps
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Create a clustered database with a given number of instances.
 */
public interface IDatabaseCluster : IResource, IConnectable, ISecretAttachmentTarget {
  /**
   * Add a new db proxy to this cluster.
   *
   * @param id 
   * @param options 
   */
  public fun addProxy(id: String, options: DatabaseProxyOptions): DatabaseProxy

  /**
   * Add a new db proxy to this cluster.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("88c3f7afe80587682acb73327f437ae531d6b1be89cc947d8c70a770c539b4be")
  public fun addProxy(id: String, options: DatabaseProxyOptions.Builder.() -> Unit): DatabaseProxy

  /**
   * The ARN of the database cluster.
   */
  public fun clusterArn(): String

  /**
   * The endpoint to use for read/write operations.
   */
  public fun clusterEndpoint(): Endpoint

  /**
   * Identifier of the cluster.
   */
  public fun clusterIdentifier(): String

  /**
   * Endpoint to use for load-balanced read-only operations.
   */
  public fun clusterReadEndpoint(): Endpoint

  /**
   * The immutable identifier for the cluster; for example: cluster-ABCD1234EFGH5678IJKL90MNOP.
   *
   * This AWS Region-unique identifier is used in things like IAM authentication policies.
   */
  public fun clusterResourceIdentifier(): String

  /**
   * The engine of this Cluster.
   *
   * May be not known for imported Clusters if it wasn't provided explicitly.
   */
  public fun engine(): IClusterEngine? = unwrap(this).getEngine()?.let(IClusterEngine::wrap)

  /**
   * Grant the given identity connection access to the Cluster.
   *
   * @param grantee the Principal to grant the permissions to. 
   * @param dbUser the name of the database user to allow connecting. 
   */
  public fun grantConnect(grantee: IGrantable, dbUser: String): Grant

  /**
   * Grant the given identity to access to the Data API.
   *
   * @param grantee The principal to grant access to. 
   */
  public fun grantDataApiAccess(grantee: IGrantable): Grant

  /**
   * Endpoints which address each individual replica.
   */
  public fun instanceEndpoints(): List<Endpoint>

  /**
   * Identifiers of the replicas.
   */
  public fun instanceIdentifiers(): List<String>

  /**
   * Return the given named metric for this DBCluster.
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String): Metric

  /**
   * Return the given named metric for this DBCluster.
   *
   * @param metricName 
   * @param props
   */
  public fun metric(metricName: String, props: MetricOptions): Metric

  /**
   * Return the given named metric for this DBCluster.
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The percentage of CPU utilization.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricCPUUtilization(): Metric

  /**
   * The percentage of CPU utilization.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricCPUUtilization(props: MetricOptions): Metric

  /**
   * The percentage of CPU utilization.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("66a273587ca08857c76d1952aa0bb360d86bfe06cc24788a922415fa0fa097ef")
  public fun metricCPUUtilization(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of database connections in use.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricDatabaseConnections(): Metric

  /**
   * The number of database connections in use.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricDatabaseConnections(props: MetricOptions): Metric

  /**
   * The number of database connections in use.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("da93b368080fddd327564c3f008e4c664a1799b65b054ae9fec1c7433068712b")
  public fun metricDatabaseConnections(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The average number of deadlocks in the database per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricDeadlocks(): Metric

  /**
   * The average number of deadlocks in the database per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricDeadlocks(props: MetricOptions): Metric

  /**
   * The average number of deadlocks in the database per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7c5fdf1f5b950b6ebb59f3a7d04102d5ea9229889ed1fbbe65d0b2f1feda9910")
  public fun metricDeadlocks(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The amount of time that the instance has been running, in seconds.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricEngineUptime(): Metric

  /**
   * The amount of time that the instance has been running, in seconds.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricEngineUptime(props: MetricOptions): Metric

  /**
   * The amount of time that the instance has been running, in seconds.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c987dd67b49b37fd08a66eb08d8eb42b13dff7f72815ba90f997acce53b91f13")
  public fun metricEngineUptime(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The amount of local storage available, in bytes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricFreeLocalStorage(): Metric

  /**
   * The amount of local storage available, in bytes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricFreeLocalStorage(props: MetricOptions): Metric

  /**
   * The amount of local storage available, in bytes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("610b9fe8b0f31bd9ac969185582bde69ab1a4734f7260522d267450d8b615e32")
  public fun metricFreeLocalStorage(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The amount of available random access memory, in bytes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricFreeableMemory(): Metric

  /**
   * The amount of available random access memory, in bytes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricFreeableMemory(props: MetricOptions): Metric

  /**
   * The amount of available random access memory, in bytes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("52581dbf24aa60f3a3d2a22ad5c3a44848ddd52404f8b8dd8e3c0d665b77d5cf")
  public fun metricFreeableMemory(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The amount of network throughput received from clients by each instance, in bytes per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricNetworkReceiveThroughput(): Metric

  /**
   * The amount of network throughput received from clients by each instance, in bytes per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricNetworkReceiveThroughput(props: MetricOptions): Metric

  /**
   * The amount of network throughput received from clients by each instance, in bytes per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a0b27f96abcd8796ec25a8dadcac39406010dc87ed255773f61b30234c64218f")
  public fun metricNetworkReceiveThroughput(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The amount of network throughput both received from and transmitted to clients by each
   * instance, in bytes per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricNetworkThroughput(): Metric

  /**
   * The amount of network throughput both received from and transmitted to clients by each
   * instance, in bytes per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricNetworkThroughput(props: MetricOptions): Metric

  /**
   * The amount of network throughput both received from and transmitted to clients by each
   * instance, in bytes per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7fa1ef794b739c2bc5aa500ab6258cc0e6369f83b4a0befe0efa5f957a32eb8c")
  public fun metricNetworkThroughput(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The amount of network throughput sent to clients by each instance, in bytes per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricNetworkTransmitThroughput(): Metric

  /**
   * The amount of network throughput sent to clients by each instance, in bytes per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricNetworkTransmitThroughput(props: MetricOptions): Metric

  /**
   * The amount of network throughput sent to clients by each instance, in bytes per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2dcf397506092ed5637a6755904f121a8abac26c6288b2aa463bfd00a2e33a51")
  public fun metricNetworkTransmitThroughput(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The total amount of backup storage in bytes consumed by all Aurora snapshots outside its backup
   * retention window.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricSnapshotStorageUsed(): Metric

  /**
   * The total amount of backup storage in bytes consumed by all Aurora snapshots outside its backup
   * retention window.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricSnapshotStorageUsed(props: MetricOptions): Metric

  /**
   * The total amount of backup storage in bytes consumed by all Aurora snapshots outside its backup
   * retention window.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b20cebf25cdba39d8cafa1126165761c523a3fe674b9acb5d4c7a047c4f33c2c")
  public fun metricSnapshotStorageUsed(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The total amount of backup storage in bytes for which you are billed.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricTotalBackupStorageBilled(): Metric

  /**
   * The total amount of backup storage in bytes for which you are billed.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricTotalBackupStorageBilled(props: MetricOptions): Metric

  /**
   * The total amount of backup storage in bytes for which you are billed.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6eda8a6eaab0f83b3871c32bb94a5e952f3426afa9431da7911d5aa071625bf0")
  public fun metricTotalBackupStorageBilled(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The amount of storage used by your Aurora DB instance, in bytes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricVolumeBytesUsed(): Metric

  /**
   * The amount of storage used by your Aurora DB instance, in bytes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricVolumeBytesUsed(props: MetricOptions): Metric

  /**
   * The amount of storage used by your Aurora DB instance, in bytes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3bb277c510696a1a9ff520ce37a49f2b8512ad967ff39007f763e2c6dd25fe23")
  public fun metricVolumeBytesUsed(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of billed read I/O operations from a cluster volume, reported at 5-minute intervals.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricVolumeReadIOPs(): Metric

  /**
   * The number of billed read I/O operations from a cluster volume, reported at 5-minute intervals.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricVolumeReadIOPs(props: MetricOptions): Metric

  /**
   * The number of billed read I/O operations from a cluster volume, reported at 5-minute intervals.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("086a9f6911f369e61d0fcde9022eb67ad1713fce19147894ef9b125ba6821a32")
  public fun metricVolumeReadIOPs(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of write disk I/O operations to the cluster volume, reported at 5-minute intervals.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricVolumeWriteIOPs(): Metric

  /**
   * The number of write disk I/O operations to the cluster volume, reported at 5-minute intervals.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricVolumeWriteIOPs(props: MetricOptions): Metric

  /**
   * The number of write disk I/O operations to the cluster volume, reported at 5-minute intervals.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f19f045892b48d2f8dfe909a7aebc7e660a59bbc59651b3f2119beea07c2cdd9")
  public fun metricVolumeWriteIOPs(props: MetricOptions.Builder.() -> Unit): Metric

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.IDatabaseCluster,
  ) : CdkObject(cdkObject),
      IDatabaseCluster {
    /**
     * Add a new db proxy to this cluster.
     *
     * @param id 
     * @param options 
     */
    override fun addProxy(id: String, options: DatabaseProxyOptions): DatabaseProxy =
        unwrap(this).addProxy(id,
        options.let(DatabaseProxyOptions.Companion::unwrap)).let(DatabaseProxy::wrap)

    /**
     * Add a new db proxy to this cluster.
     *
     * @param id 
     * @param options 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88c3f7afe80587682acb73327f437ae531d6b1be89cc947d8c70a770c539b4be")
    override fun addProxy(id: String, options: DatabaseProxyOptions.Builder.() -> Unit):
        DatabaseProxy = addProxy(id, DatabaseProxyOptions(options))

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
     * Renders the target specifications.
     */
    override fun asSecretAttachmentTarget(): SecretAttachmentTargetProps =
        unwrap(this).asSecretAttachmentTarget().let(SecretAttachmentTargetProps::wrap)

    /**
     * The ARN of the database cluster.
     */
    override fun clusterArn(): String = unwrap(this).getClusterArn()

    /**
     * The endpoint to use for read/write operations.
     */
    override fun clusterEndpoint(): Endpoint = unwrap(this).getClusterEndpoint().let(Endpoint::wrap)

    /**
     * Identifier of the cluster.
     */
    override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

    /**
     * Endpoint to use for load-balanced read-only operations.
     */
    override fun clusterReadEndpoint(): Endpoint =
        unwrap(this).getClusterReadEndpoint().let(Endpoint::wrap)

    /**
     * The immutable identifier for the cluster; for example: cluster-ABCD1234EFGH5678IJKL90MNOP.
     *
     * This AWS Region-unique identifier is used in things like IAM authentication policies.
     */
    override fun clusterResourceIdentifier(): String = unwrap(this).getClusterResourceIdentifier()

    /**
     * The network connections associated with this resource.
     */
    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    /**
     * The engine of this Cluster.
     *
     * May be not known for imported Clusters if it wasn't provided explicitly.
     */
    override fun engine(): IClusterEngine? = unwrap(this).getEngine()?.let(IClusterEngine::wrap)

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
     * Grant the given identity connection access to the Cluster.
     *
     * @param grantee the Principal to grant the permissions to. 
     * @param dbUser the name of the database user to allow connecting. 
     */
    override fun grantConnect(grantee: IGrantable, dbUser: String): Grant =
        unwrap(this).grantConnect(grantee.let(IGrantable.Companion::unwrap),
        dbUser).let(Grant::wrap)

    /**
     * Grant the given identity to access to the Data API.
     *
     * @param grantee The principal to grant access to. 
     */
    override fun grantDataApiAccess(grantee: IGrantable): Grant =
        unwrap(this).grantDataApiAccess(grantee.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

    /**
     * Endpoints which address each individual replica.
     */
    override fun instanceEndpoints(): List<Endpoint> =
        unwrap(this).getInstanceEndpoints().map(Endpoint::wrap)

    /**
     * Identifiers of the replicas.
     */
    override fun instanceIdentifiers(): List<String> = unwrap(this).getInstanceIdentifiers()

    /**
     * Return the given named metric for this DBCluster.
     *
     * @param metricName 
     * @param props
     */
    override fun metric(metricName: String): Metric =
        unwrap(this).metric(metricName).let(Metric::wrap)

    /**
     * Return the given named metric for this DBCluster.
     *
     * @param metricName 
     * @param props
     */
    override fun metric(metricName: String, props: MetricOptions): Metric =
        unwrap(this).metric(metricName,
        props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * Return the given named metric for this DBCluster.
     *
     * @param metricName 
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
        metric(metricName, MetricOptions(props))

    /**
     * The percentage of CPU utilization.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricCPUUtilization(): Metric =
        unwrap(this).metricCPUUtilization().let(Metric::wrap)

    /**
     * The percentage of CPU utilization.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricCPUUtilization(props: MetricOptions): Metric =
        unwrap(this).metricCPUUtilization(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The percentage of CPU utilization.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66a273587ca08857c76d1952aa0bb360d86bfe06cc24788a922415fa0fa097ef")
    override fun metricCPUUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
        metricCPUUtilization(MetricOptions(props))

    /**
     * The number of database connections in use.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricDatabaseConnections(): Metric =
        unwrap(this).metricDatabaseConnections().let(Metric::wrap)

    /**
     * The number of database connections in use.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricDatabaseConnections(props: MetricOptions): Metric =
        unwrap(this).metricDatabaseConnections(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of database connections in use.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da93b368080fddd327564c3f008e4c664a1799b65b054ae9fec1c7433068712b")
    override fun metricDatabaseConnections(props: MetricOptions.Builder.() -> Unit): Metric =
        metricDatabaseConnections(MetricOptions(props))

    /**
     * The average number of deadlocks in the database per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricDeadlocks(): Metric = unwrap(this).metricDeadlocks().let(Metric::wrap)

    /**
     * The average number of deadlocks in the database per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricDeadlocks(props: MetricOptions): Metric =
        unwrap(this).metricDeadlocks(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The average number of deadlocks in the database per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c5fdf1f5b950b6ebb59f3a7d04102d5ea9229889ed1fbbe65d0b2f1feda9910")
    override fun metricDeadlocks(props: MetricOptions.Builder.() -> Unit): Metric =
        metricDeadlocks(MetricOptions(props))

    /**
     * The amount of time that the instance has been running, in seconds.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricEngineUptime(): Metric = unwrap(this).metricEngineUptime().let(Metric::wrap)

    /**
     * The amount of time that the instance has been running, in seconds.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricEngineUptime(props: MetricOptions): Metric =
        unwrap(this).metricEngineUptime(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The amount of time that the instance has been running, in seconds.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c987dd67b49b37fd08a66eb08d8eb42b13dff7f72815ba90f997acce53b91f13")
    override fun metricEngineUptime(props: MetricOptions.Builder.() -> Unit): Metric =
        metricEngineUptime(MetricOptions(props))

    /**
     * The amount of local storage available, in bytes.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricFreeLocalStorage(): Metric =
        unwrap(this).metricFreeLocalStorage().let(Metric::wrap)

    /**
     * The amount of local storage available, in bytes.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricFreeLocalStorage(props: MetricOptions): Metric =
        unwrap(this).metricFreeLocalStorage(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The amount of local storage available, in bytes.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("610b9fe8b0f31bd9ac969185582bde69ab1a4734f7260522d267450d8b615e32")
    override fun metricFreeLocalStorage(props: MetricOptions.Builder.() -> Unit): Metric =
        metricFreeLocalStorage(MetricOptions(props))

    /**
     * The amount of available random access memory, in bytes.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricFreeableMemory(): Metric =
        unwrap(this).metricFreeableMemory().let(Metric::wrap)

    /**
     * The amount of available random access memory, in bytes.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricFreeableMemory(props: MetricOptions): Metric =
        unwrap(this).metricFreeableMemory(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The amount of available random access memory, in bytes.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52581dbf24aa60f3a3d2a22ad5c3a44848ddd52404f8b8dd8e3c0d665b77d5cf")
    override fun metricFreeableMemory(props: MetricOptions.Builder.() -> Unit): Metric =
        metricFreeableMemory(MetricOptions(props))

    /**
     * The amount of network throughput received from clients by each instance, in bytes per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricNetworkReceiveThroughput(): Metric =
        unwrap(this).metricNetworkReceiveThroughput().let(Metric::wrap)

    /**
     * The amount of network throughput received from clients by each instance, in bytes per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricNetworkReceiveThroughput(props: MetricOptions): Metric =
        unwrap(this).metricNetworkReceiveThroughput(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The amount of network throughput received from clients by each instance, in bytes per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0b27f96abcd8796ec25a8dadcac39406010dc87ed255773f61b30234c64218f")
    override fun metricNetworkReceiveThroughput(props: MetricOptions.Builder.() -> Unit): Metric =
        metricNetworkReceiveThroughput(MetricOptions(props))

    /**
     * The amount of network throughput both received from and transmitted to clients by each
     * instance, in bytes per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricNetworkThroughput(): Metric =
        unwrap(this).metricNetworkThroughput().let(Metric::wrap)

    /**
     * The amount of network throughput both received from and transmitted to clients by each
     * instance, in bytes per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricNetworkThroughput(props: MetricOptions): Metric =
        unwrap(this).metricNetworkThroughput(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The amount of network throughput both received from and transmitted to clients by each
     * instance, in bytes per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fa1ef794b739c2bc5aa500ab6258cc0e6369f83b4a0befe0efa5f957a32eb8c")
    override fun metricNetworkThroughput(props: MetricOptions.Builder.() -> Unit): Metric =
        metricNetworkThroughput(MetricOptions(props))

    /**
     * The amount of network throughput sent to clients by each instance, in bytes per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricNetworkTransmitThroughput(): Metric =
        unwrap(this).metricNetworkTransmitThroughput().let(Metric::wrap)

    /**
     * The amount of network throughput sent to clients by each instance, in bytes per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricNetworkTransmitThroughput(props: MetricOptions): Metric =
        unwrap(this).metricNetworkTransmitThroughput(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The amount of network throughput sent to clients by each instance, in bytes per second.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2dcf397506092ed5637a6755904f121a8abac26c6288b2aa463bfd00a2e33a51")
    override fun metricNetworkTransmitThroughput(props: MetricOptions.Builder.() -> Unit): Metric =
        metricNetworkTransmitThroughput(MetricOptions(props))

    /**
     * The total amount of backup storage in bytes consumed by all Aurora snapshots outside its
     * backup retention window.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricSnapshotStorageUsed(): Metric =
        unwrap(this).metricSnapshotStorageUsed().let(Metric::wrap)

    /**
     * The total amount of backup storage in bytes consumed by all Aurora snapshots outside its
     * backup retention window.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricSnapshotStorageUsed(props: MetricOptions): Metric =
        unwrap(this).metricSnapshotStorageUsed(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The total amount of backup storage in bytes consumed by all Aurora snapshots outside its
     * backup retention window.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b20cebf25cdba39d8cafa1126165761c523a3fe674b9acb5d4c7a047c4f33c2c")
    override fun metricSnapshotStorageUsed(props: MetricOptions.Builder.() -> Unit): Metric =
        metricSnapshotStorageUsed(MetricOptions(props))

    /**
     * The total amount of backup storage in bytes for which you are billed.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricTotalBackupStorageBilled(): Metric =
        unwrap(this).metricTotalBackupStorageBilled().let(Metric::wrap)

    /**
     * The total amount of backup storage in bytes for which you are billed.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricTotalBackupStorageBilled(props: MetricOptions): Metric =
        unwrap(this).metricTotalBackupStorageBilled(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The total amount of backup storage in bytes for which you are billed.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6eda8a6eaab0f83b3871c32bb94a5e952f3426afa9431da7911d5aa071625bf0")
    override fun metricTotalBackupStorageBilled(props: MetricOptions.Builder.() -> Unit): Metric =
        metricTotalBackupStorageBilled(MetricOptions(props))

    /**
     * The amount of storage used by your Aurora DB instance, in bytes.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricVolumeBytesUsed(): Metric =
        unwrap(this).metricVolumeBytesUsed().let(Metric::wrap)

    /**
     * The amount of storage used by your Aurora DB instance, in bytes.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricVolumeBytesUsed(props: MetricOptions): Metric =
        unwrap(this).metricVolumeBytesUsed(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The amount of storage used by your Aurora DB instance, in bytes.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3bb277c510696a1a9ff520ce37a49f2b8512ad967ff39007f763e2c6dd25fe23")
    override fun metricVolumeBytesUsed(props: MetricOptions.Builder.() -> Unit): Metric =
        metricVolumeBytesUsed(MetricOptions(props))

    /**
     * The number of billed read I/O operations from a cluster volume, reported at 5-minute
     * intervals.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricVolumeReadIOPs(): Metric =
        unwrap(this).metricVolumeReadIOPs().let(Metric::wrap)

    /**
     * The number of billed read I/O operations from a cluster volume, reported at 5-minute
     * intervals.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricVolumeReadIOPs(props: MetricOptions): Metric =
        unwrap(this).metricVolumeReadIOPs(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of billed read I/O operations from a cluster volume, reported at 5-minute
     * intervals.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("086a9f6911f369e61d0fcde9022eb67ad1713fce19147894ef9b125ba6821a32")
    override fun metricVolumeReadIOPs(props: MetricOptions.Builder.() -> Unit): Metric =
        metricVolumeReadIOPs(MetricOptions(props))

    /**
     * The number of write disk I/O operations to the cluster volume, reported at 5-minute
     * intervals.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricVolumeWriteIOPs(): Metric =
        unwrap(this).metricVolumeWriteIOPs().let(Metric::wrap)

    /**
     * The number of write disk I/O operations to the cluster volume, reported at 5-minute
     * intervals.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    override fun metricVolumeWriteIOPs(props: MetricOptions): Metric =
        unwrap(this).metricVolumeWriteIOPs(props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

    /**
     * The number of write disk I/O operations to the cluster volume, reported at 5-minute
     * intervals.
     *
     * Average over 5 minutes
     *
     * @param props
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f19f045892b48d2f8dfe909a7aebc7e660a59bbc59651b3f2119beea07c2cdd9")
    override fun metricVolumeWriteIOPs(props: MetricOptions.Builder.() -> Unit): Metric =
        metricVolumeWriteIOPs(MetricOptions(props))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IDatabaseCluster):
        IDatabaseCluster = CdkObjectWrappers.wrap(cdkObject) as? IDatabaseCluster ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDatabaseCluster):
        software.amazon.awscdk.services.rds.IDatabaseCluster = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.IDatabaseCluster
  }
}

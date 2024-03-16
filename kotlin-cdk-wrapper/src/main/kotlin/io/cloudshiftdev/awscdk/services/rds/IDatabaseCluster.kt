@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecretAttachmentTarget
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
  public fun metricCpuUtilization(): Metric

  /**
   * The percentage of CPU utilization.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricCpuUtilization(props: MetricOptions): Metric

  /**
   * The percentage of CPU utilization.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("06a38048efcdd43000e7f66d74001004b818625d95136f460bf350a2397a31d0")
  public fun metricCpuUtilization(props: MetricOptions.Builder.() -> Unit): Metric

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
  public fun metricVolumeReadIoPs(): Metric

  /**
   * The number of billed read I/O operations from a cluster volume, reported at 5-minute intervals.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricVolumeReadIoPs(props: MetricOptions): Metric

  /**
   * The number of billed read I/O operations from a cluster volume, reported at 5-minute intervals.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("72067052a26857a00db0f687d77e4b1548626bbc1cc21cf9326d161fc9b68886")
  public fun metricVolumeReadIoPs(props: MetricOptions.Builder.() -> Unit): Metric

  /**
   * The number of write disk I/O operations to the cluster volume, reported at 5-minute intervals.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricVolumeWriteIoPs(): Metric

  /**
   * The number of write disk I/O operations to the cluster volume, reported at 5-minute intervals.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public fun metricVolumeWriteIoPs(props: MetricOptions): Metric

  /**
   * The number of write disk I/O operations to the cluster volume, reported at 5-minute intervals.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e049e75cf4d1c56da8bf142e554ca3f6d27b3533201bcb1be743dd489f70476a")
  public fun metricVolumeWriteIoPs(props: MetricOptions.Builder.() -> Unit): Metric

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IDatabaseCluster):
        IDatabaseCluster = CdkObjectWrappers.wrap(cdkObject) as IDatabaseCluster

    internal fun unwrap(wrapped: IDatabaseCluster):
        software.amazon.awscdk.services.rds.IDatabaseCluster = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.rds.IDatabaseCluster
  }
}

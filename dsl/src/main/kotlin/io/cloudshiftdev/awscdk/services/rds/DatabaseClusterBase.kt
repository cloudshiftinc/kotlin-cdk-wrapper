package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretAttachmentTargetProps
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public abstract class DatabaseClusterBase internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.DatabaseClusterBase,
) : Resource(cdkObject), IDatabaseCluster {
  /**
   * Add a new db proxy to this cluster.
   *
   * @param id 
   * @param options 
   */
  public override fun addProxy(id: String, options: DatabaseProxyOptions): DatabaseProxy =
      unwrap(this).addProxy(id, options.let(DatabaseProxyOptions::unwrap)).let(DatabaseProxy::wrap)

  /**
   * Add a new db proxy to this cluster.
   *
   * @param id 
   * @param options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("88c3f7afe80587682acb73327f437ae531d6b1be89cc947d8c70a770c539b4be")
  public override fun addProxy(id: String, options: DatabaseProxyOptions.Builder.() -> Unit):
      DatabaseProxy = addProxy(id, DatabaseProxyOptions(options))

  /**
   * Renders the secret attachment target specifications.
   */
  public override fun asSecretAttachmentTarget(): SecretAttachmentTargetProps =
      unwrap(this).asSecretAttachmentTarget().let(SecretAttachmentTargetProps::wrap)

  /**
   * The ARN of the cluster.
   */
  public override fun clusterArn(): String = unwrap(this).getClusterArn()

  /**
   * The endpoint to use for read/write operations.
   */
  public override fun clusterEndpoint(): Endpoint =
      unwrap(this).getClusterEndpoint().let(Endpoint::wrap)

  /**
   * Identifier of the cluster.
   */
  public override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

  /**
   * Endpoint to use for load-balanced read-only operations.
   */
  public override fun clusterReadEndpoint(): Endpoint =
      unwrap(this).getClusterReadEndpoint().let(Endpoint::wrap)

  /**
   * The immutable identifier for the cluster; for example: cluster-ABCD1234EFGH5678IJKL90MNOP.
   *
   * This AWS Region-unique identifier is used in things like IAM authentication policies.
   */
  public override fun clusterResourceIdentifier(): String =
      unwrap(this).getClusterResourceIdentifier()

  /**
   * Access to the network connections.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * The engine of this Cluster.
   *
   * May be not known for imported Clusters if it wasn't provided explicitly.
   */
  public override fun engine(): IClusterEngine? =
      unwrap(this).getEngine()?.let(IClusterEngine::wrap)

  /**
   * Grant the given identity connection access to the Cluster.
   *
   * @param grantee 
   * @param dbUser 
   */
  public override fun grantConnect(grantee: IGrantable, dbUser: String): Grant =
      unwrap(this).grantConnect(grantee.let(IGrantable::unwrap), dbUser).let(Grant::wrap)

  /**
   * Grant the given identity to access the Data API.
   *
   * @param grantee 
   */
  public open fun grantDataApiAccess(grantee: IGrantable): Grant =
      unwrap(this).grantDataApiAccess(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * Endpoints which address each individual replica.
   */
  public override fun instanceEndpoints(): List<Endpoint> =
      unwrap(this).getInstanceEndpoints().map(Endpoint::wrap)

  /**
   * Identifiers of the replicas.
   */
  public override fun instanceIdentifiers(): List<String> = unwrap(this).getInstanceIdentifiers()

  /**
   * Return the given named metric for this DBCluster.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * Return the given named metric for this DBCluster.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Return the given named metric for this DBCluster.
   *
   * @param metricName 
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * The percentage of CPU utilization.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricCpuUtilization(): Metric =
      unwrap(this).metricCPUUtilization().let(Metric::wrap)

  /**
   * The percentage of CPU utilization.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricCpuUtilization(props: MetricOptions): Metric =
      unwrap(this).metricCPUUtilization(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The percentage of CPU utilization.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("06a38048efcdd43000e7f66d74001004b818625d95136f460bf350a2397a31d0")
  public override fun metricCpuUtilization(props: MetricOptions.Builder.() -> Unit): Metric =
      metricCpuUtilization(MetricOptions(props))

  /**
   * The number of database connections in use.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricDatabaseConnections(): Metric =
      unwrap(this).metricDatabaseConnections().let(Metric::wrap)

  /**
   * The number of database connections in use.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricDatabaseConnections(props: MetricOptions): Metric =
      unwrap(this).metricDatabaseConnections(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The number of database connections in use.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("da93b368080fddd327564c3f008e4c664a1799b65b054ae9fec1c7433068712b")
  public override fun metricDatabaseConnections(props: MetricOptions.Builder.() -> Unit): Metric =
      metricDatabaseConnections(MetricOptions(props))

  /**
   * The average number of deadlocks in the database per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricDeadlocks(): Metric = unwrap(this).metricDeadlocks().let(Metric::wrap)

  /**
   * The average number of deadlocks in the database per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricDeadlocks(props: MetricOptions): Metric =
      unwrap(this).metricDeadlocks(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The average number of deadlocks in the database per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7c5fdf1f5b950b6ebb59f3a7d04102d5ea9229889ed1fbbe65d0b2f1feda9910")
  public override fun metricDeadlocks(props: MetricOptions.Builder.() -> Unit): Metric =
      metricDeadlocks(MetricOptions(props))

  /**
   * The amount of time that the instance has been running, in seconds.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricEngineUptime(): Metric =
      unwrap(this).metricEngineUptime().let(Metric::wrap)

  /**
   * The amount of time that the instance has been running, in seconds.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricEngineUptime(props: MetricOptions): Metric =
      unwrap(this).metricEngineUptime(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The amount of time that the instance has been running, in seconds.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c987dd67b49b37fd08a66eb08d8eb42b13dff7f72815ba90f997acce53b91f13")
  public override fun metricEngineUptime(props: MetricOptions.Builder.() -> Unit): Metric =
      metricEngineUptime(MetricOptions(props))

  /**
   * The amount of local storage available, in bytes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricFreeLocalStorage(): Metric =
      unwrap(this).metricFreeLocalStorage().let(Metric::wrap)

  /**
   * The amount of local storage available, in bytes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricFreeLocalStorage(props: MetricOptions): Metric =
      unwrap(this).metricFreeLocalStorage(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The amount of local storage available, in bytes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("610b9fe8b0f31bd9ac969185582bde69ab1a4734f7260522d267450d8b615e32")
  public override fun metricFreeLocalStorage(props: MetricOptions.Builder.() -> Unit): Metric =
      metricFreeLocalStorage(MetricOptions(props))

  /**
   * The amount of available random access memory, in bytes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricFreeableMemory(): Metric =
      unwrap(this).metricFreeableMemory().let(Metric::wrap)

  /**
   * The amount of available random access memory, in bytes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricFreeableMemory(props: MetricOptions): Metric =
      unwrap(this).metricFreeableMemory(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The amount of available random access memory, in bytes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("52581dbf24aa60f3a3d2a22ad5c3a44848ddd52404f8b8dd8e3c0d665b77d5cf")
  public override fun metricFreeableMemory(props: MetricOptions.Builder.() -> Unit): Metric =
      metricFreeableMemory(MetricOptions(props))

  /**
   * The amount of network throughput received from clients by each instance, in bytes per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricNetworkReceiveThroughput(): Metric =
      unwrap(this).metricNetworkReceiveThroughput().let(Metric::wrap)

  /**
   * The amount of network throughput received from clients by each instance, in bytes per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricNetworkReceiveThroughput(props: MetricOptions): Metric =
      unwrap(this).metricNetworkReceiveThroughput(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The amount of network throughput received from clients by each instance, in bytes per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a0b27f96abcd8796ec25a8dadcac39406010dc87ed255773f61b30234c64218f")
  public override fun metricNetworkReceiveThroughput(props: MetricOptions.Builder.() -> Unit):
      Metric = metricNetworkReceiveThroughput(MetricOptions(props))

  /**
   * The amount of network throughput both received from and transmitted to clients by each
   * instance, in bytes per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricNetworkThroughput(): Metric =
      unwrap(this).metricNetworkThroughput().let(Metric::wrap)

  /**
   * The amount of network throughput both received from and transmitted to clients by each
   * instance, in bytes per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricNetworkThroughput(props: MetricOptions): Metric =
      unwrap(this).metricNetworkThroughput(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The amount of network throughput both received from and transmitted to clients by each
   * instance, in bytes per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7fa1ef794b739c2bc5aa500ab6258cc0e6369f83b4a0befe0efa5f957a32eb8c")
  public override fun metricNetworkThroughput(props: MetricOptions.Builder.() -> Unit): Metric =
      metricNetworkThroughput(MetricOptions(props))

  /**
   * The amount of network throughput sent to clients by each instance, in bytes per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricNetworkTransmitThroughput(): Metric =
      unwrap(this).metricNetworkTransmitThroughput().let(Metric::wrap)

  /**
   * The amount of network throughput sent to clients by each instance, in bytes per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricNetworkTransmitThroughput(props: MetricOptions): Metric =
      unwrap(this).metricNetworkTransmitThroughput(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The amount of network throughput sent to clients by each instance, in bytes per second.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2dcf397506092ed5637a6755904f121a8abac26c6288b2aa463bfd00a2e33a51")
  public override fun metricNetworkTransmitThroughput(props: MetricOptions.Builder.() -> Unit):
      Metric = metricNetworkTransmitThroughput(MetricOptions(props))

  /**
   * The total amount of backup storage in bytes consumed by all Aurora snapshots outside its backup
   * retention window.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricSnapshotStorageUsed(): Metric =
      unwrap(this).metricSnapshotStorageUsed().let(Metric::wrap)

  /**
   * The total amount of backup storage in bytes consumed by all Aurora snapshots outside its backup
   * retention window.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricSnapshotStorageUsed(props: MetricOptions): Metric =
      unwrap(this).metricSnapshotStorageUsed(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The total amount of backup storage in bytes consumed by all Aurora snapshots outside its backup
   * retention window.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b20cebf25cdba39d8cafa1126165761c523a3fe674b9acb5d4c7a047c4f33c2c")
  public override fun metricSnapshotStorageUsed(props: MetricOptions.Builder.() -> Unit): Metric =
      metricSnapshotStorageUsed(MetricOptions(props))

  /**
   * The total amount of backup storage in bytes for which you are billed.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricTotalBackupStorageBilled(): Metric =
      unwrap(this).metricTotalBackupStorageBilled().let(Metric::wrap)

  /**
   * The total amount of backup storage in bytes for which you are billed.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricTotalBackupStorageBilled(props: MetricOptions): Metric =
      unwrap(this).metricTotalBackupStorageBilled(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The total amount of backup storage in bytes for which you are billed.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6eda8a6eaab0f83b3871c32bb94a5e952f3426afa9431da7911d5aa071625bf0")
  public override fun metricTotalBackupStorageBilled(props: MetricOptions.Builder.() -> Unit):
      Metric = metricTotalBackupStorageBilled(MetricOptions(props))

  /**
   * The amount of storage used by your Aurora DB instance, in bytes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricVolumeBytesUsed(): Metric =
      unwrap(this).metricVolumeBytesUsed().let(Metric::wrap)

  /**
   * The amount of storage used by your Aurora DB instance, in bytes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricVolumeBytesUsed(props: MetricOptions): Metric =
      unwrap(this).metricVolumeBytesUsed(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The amount of storage used by your Aurora DB instance, in bytes.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3bb277c510696a1a9ff520ce37a49f2b8512ad967ff39007f763e2c6dd25fe23")
  public override fun metricVolumeBytesUsed(props: MetricOptions.Builder.() -> Unit): Metric =
      metricVolumeBytesUsed(MetricOptions(props))

  /**
   * The number of billed read I/O operations from a cluster volume, reported at 5-minute intervals.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricVolumeReadIoPs(): Metric =
      unwrap(this).metricVolumeReadIOPs().let(Metric::wrap)

  /**
   * The number of billed read I/O operations from a cluster volume, reported at 5-minute intervals.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricVolumeReadIoPs(props: MetricOptions): Metric =
      unwrap(this).metricVolumeReadIOPs(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The number of billed read I/O operations from a cluster volume, reported at 5-minute intervals.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("72067052a26857a00db0f687d77e4b1548626bbc1cc21cf9326d161fc9b68886")
  public override fun metricVolumeReadIoPs(props: MetricOptions.Builder.() -> Unit): Metric =
      metricVolumeReadIoPs(MetricOptions(props))

  /**
   * The number of write disk I/O operations to the cluster volume, reported at 5-minute intervals.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricVolumeWriteIoPs(): Metric =
      unwrap(this).metricVolumeWriteIOPs().let(Metric::wrap)

  /**
   * The number of write disk I/O operations to the cluster volume, reported at 5-minute intervals.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  public override fun metricVolumeWriteIoPs(props: MetricOptions): Metric =
      unwrap(this).metricVolumeWriteIOPs(props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * The number of write disk I/O operations to the cluster volume, reported at 5-minute intervals.
   *
   * Average over 5 minutes
   *
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e049e75cf4d1c56da8bf142e554ca3f6d27b3533201bcb1be743dd489f70476a")
  public override fun metricVolumeWriteIoPs(props: MetricOptions.Builder.() -> Unit): Metric =
      metricVolumeWriteIoPs(MetricOptions(props))

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.DatabaseClusterBase,
  ) : DatabaseClusterBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseClusterBase):
        DatabaseClusterBase = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseClusterBase):
        software.amazon.awscdk.services.rds.DatabaseClusterBase = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.DatabaseClusterBase
  }
}

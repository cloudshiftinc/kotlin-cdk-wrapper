package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
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
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface IDatabaseCluster : IResource, IConnectable, ISecretAttachmentTarget {
  public fun addProxy(arg0: String, arg1: DatabaseProxyOptions): DatabaseProxy

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("88c3f7afe80587682acb73327f437ae531d6b1be89cc947d8c70a770c539b4be")
  public fun addProxy(arg0: String, arg1: DatabaseProxyOptions.Builder.() -> Unit): DatabaseProxy

  public fun clusterArn(): String

  public fun clusterEndpoint(): Endpoint

  public fun clusterIdentifier(): String

  public fun clusterReadEndpoint(): Endpoint

  public fun clusterResourceIdentifier(): String

  public fun engine(): IClusterEngine? = unwrap(this).getEngine()?.let(IClusterEngine::wrap)

  public fun grantConnect(arg0: IGrantable, arg1: String): Grant

  public fun instanceEndpoints(): List<Endpoint>

  public fun instanceIdentifiers(): List<String>

  public fun metric(arg0: String): Metric

  public fun metric(arg0: String, arg1: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric

  public fun metricCpuUtilization(): Metric

  public fun metricCpuUtilization(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("06a38048efcdd43000e7f66d74001004b818625d95136f460bf350a2397a31d0")
  public fun metricCpuUtilization(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricDatabaseConnections(): Metric

  public fun metricDatabaseConnections(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("da93b368080fddd327564c3f008e4c664a1799b65b054ae9fec1c7433068712b")
  public fun metricDatabaseConnections(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricDeadlocks(): Metric

  public fun metricDeadlocks(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7c5fdf1f5b950b6ebb59f3a7d04102d5ea9229889ed1fbbe65d0b2f1feda9910")
  public fun metricDeadlocks(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricEngineUptime(): Metric

  public fun metricEngineUptime(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c987dd67b49b37fd08a66eb08d8eb42b13dff7f72815ba90f997acce53b91f13")
  public fun metricEngineUptime(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricFreeLocalStorage(): Metric

  public fun metricFreeLocalStorage(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("610b9fe8b0f31bd9ac969185582bde69ab1a4734f7260522d267450d8b615e32")
  public fun metricFreeLocalStorage(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricFreeableMemory(): Metric

  public fun metricFreeableMemory(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("52581dbf24aa60f3a3d2a22ad5c3a44848ddd52404f8b8dd8e3c0d665b77d5cf")
  public fun metricFreeableMemory(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricNetworkReceiveThroughput(): Metric

  public fun metricNetworkReceiveThroughput(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a0b27f96abcd8796ec25a8dadcac39406010dc87ed255773f61b30234c64218f")
  public fun metricNetworkReceiveThroughput(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricNetworkThroughput(): Metric

  public fun metricNetworkThroughput(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7fa1ef794b739c2bc5aa500ab6258cc0e6369f83b4a0befe0efa5f957a32eb8c")
  public fun metricNetworkThroughput(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricNetworkTransmitThroughput(): Metric

  public fun metricNetworkTransmitThroughput(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2dcf397506092ed5637a6755904f121a8abac26c6288b2aa463bfd00a2e33a51")
  public fun metricNetworkTransmitThroughput(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricSnapshotStorageUsed(): Metric

  public fun metricSnapshotStorageUsed(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b20cebf25cdba39d8cafa1126165761c523a3fe674b9acb5d4c7a047c4f33c2c")
  public fun metricSnapshotStorageUsed(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricTotalBackupStorageBilled(): Metric

  public fun metricTotalBackupStorageBilled(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6eda8a6eaab0f83b3871c32bb94a5e952f3426afa9431da7911d5aa071625bf0")
  public fun metricTotalBackupStorageBilled(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricVolumeBytesUsed(): Metric

  public fun metricVolumeBytesUsed(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3bb277c510696a1a9ff520ce37a49f2b8512ad967ff39007f763e2c6dd25fe23")
  public fun metricVolumeBytesUsed(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricVolumeReadIoPs(): Metric

  public fun metricVolumeReadIoPs(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("72067052a26857a00db0f687d77e4b1548626bbc1cc21cf9326d161fc9b68886")
  public fun metricVolumeReadIoPs(arg0: MetricOptions.Builder.() -> Unit): Metric

  public fun metricVolumeWriteIoPs(): Metric

  public fun metricVolumeWriteIoPs(arg0: MetricOptions): Metric

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e049e75cf4d1c56da8bf142e554ca3f6d27b3533201bcb1be743dd489f70476a")
  public fun metricVolumeWriteIoPs(arg0: MetricOptions.Builder.() -> Unit): Metric

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.IDatabaseCluster,
  ) : IDatabaseCluster {
    override fun addProxy(arg0: String, arg1: DatabaseProxyOptions): DatabaseProxy =
        unwrap(this).addProxy(arg0, arg1.let(DatabaseProxyOptions::unwrap)).let(DatabaseProxy::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("88c3f7afe80587682acb73327f437ae531d6b1be89cc947d8c70a770c539b4be")
    override fun addProxy(arg0: String, arg1: DatabaseProxyOptions.Builder.() -> Unit):
        DatabaseProxy = addProxy(arg0, DatabaseProxyOptions(arg1))

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun asSecretAttachmentTarget(): SecretAttachmentTargetProps =
        unwrap(this).asSecretAttachmentTarget().let(SecretAttachmentTargetProps::wrap)

    override fun clusterArn(): String = unwrap(this).getClusterArn()

    override fun clusterEndpoint(): Endpoint = unwrap(this).getClusterEndpoint().let(Endpoint::wrap)

    override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

    override fun clusterReadEndpoint(): Endpoint =
        unwrap(this).getClusterReadEndpoint().let(Endpoint::wrap)

    override fun clusterResourceIdentifier(): String = unwrap(this).getClusterResourceIdentifier()

    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    override fun engine(): IClusterEngine? = unwrap(this).getEngine()?.let(IClusterEngine::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun grantConnect(arg0: IGrantable, arg1: String): Grant =
        unwrap(this).grantConnect(arg0.let(IGrantable::unwrap), arg1).let(Grant::wrap)

    override fun instanceEndpoints(): List<Endpoint> =
        unwrap(this).getInstanceEndpoints().map(Endpoint::wrap)

    override fun instanceIdentifiers(): List<String> = unwrap(this).getInstanceIdentifiers() ?:
        emptyList()

    override fun metric(arg0: String): Metric = unwrap(this).metric(arg0).let(Metric::wrap)

    override fun metric(arg0: String, arg1: MetricOptions): Metric = unwrap(this).metric(arg0,
        arg1.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
    override fun metric(arg0: String, arg1: MetricOptions.Builder.() -> Unit): Metric = metric(arg0,
        MetricOptions(arg1))

    override fun metricCpuUtilization(): Metric =
        unwrap(this).metricCPUUtilization().let(Metric::wrap)

    override fun metricCpuUtilization(arg0: MetricOptions): Metric =
        unwrap(this).metricCPUUtilization(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06a38048efcdd43000e7f66d74001004b818625d95136f460bf350a2397a31d0")
    override fun metricCpuUtilization(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricCpuUtilization(MetricOptions(arg0))

    override fun metricDatabaseConnections(): Metric =
        unwrap(this).metricDatabaseConnections().let(Metric::wrap)

    override fun metricDatabaseConnections(arg0: MetricOptions): Metric =
        unwrap(this).metricDatabaseConnections(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("da93b368080fddd327564c3f008e4c664a1799b65b054ae9fec1c7433068712b")
    override fun metricDatabaseConnections(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricDatabaseConnections(MetricOptions(arg0))

    override fun metricDeadlocks(): Metric = unwrap(this).metricDeadlocks().let(Metric::wrap)

    override fun metricDeadlocks(arg0: MetricOptions): Metric =
        unwrap(this).metricDeadlocks(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7c5fdf1f5b950b6ebb59f3a7d04102d5ea9229889ed1fbbe65d0b2f1feda9910")
    override fun metricDeadlocks(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricDeadlocks(MetricOptions(arg0))

    override fun metricEngineUptime(): Metric = unwrap(this).metricEngineUptime().let(Metric::wrap)

    override fun metricEngineUptime(arg0: MetricOptions): Metric =
        unwrap(this).metricEngineUptime(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c987dd67b49b37fd08a66eb08d8eb42b13dff7f72815ba90f997acce53b91f13")
    override fun metricEngineUptime(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricEngineUptime(MetricOptions(arg0))

    override fun metricFreeLocalStorage(): Metric =
        unwrap(this).metricFreeLocalStorage().let(Metric::wrap)

    override fun metricFreeLocalStorage(arg0: MetricOptions): Metric =
        unwrap(this).metricFreeLocalStorage(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("610b9fe8b0f31bd9ac969185582bde69ab1a4734f7260522d267450d8b615e32")
    override fun metricFreeLocalStorage(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricFreeLocalStorage(MetricOptions(arg0))

    override fun metricFreeableMemory(): Metric =
        unwrap(this).metricFreeableMemory().let(Metric::wrap)

    override fun metricFreeableMemory(arg0: MetricOptions): Metric =
        unwrap(this).metricFreeableMemory(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52581dbf24aa60f3a3d2a22ad5c3a44848ddd52404f8b8dd8e3c0d665b77d5cf")
    override fun metricFreeableMemory(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricFreeableMemory(MetricOptions(arg0))

    override fun metricNetworkReceiveThroughput(): Metric =
        unwrap(this).metricNetworkReceiveThroughput().let(Metric::wrap)

    override fun metricNetworkReceiveThroughput(arg0: MetricOptions): Metric =
        unwrap(this).metricNetworkReceiveThroughput(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a0b27f96abcd8796ec25a8dadcac39406010dc87ed255773f61b30234c64218f")
    override fun metricNetworkReceiveThroughput(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricNetworkReceiveThroughput(MetricOptions(arg0))

    override fun metricNetworkThroughput(): Metric =
        unwrap(this).metricNetworkThroughput().let(Metric::wrap)

    override fun metricNetworkThroughput(arg0: MetricOptions): Metric =
        unwrap(this).metricNetworkThroughput(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7fa1ef794b739c2bc5aa500ab6258cc0e6369f83b4a0befe0efa5f957a32eb8c")
    override fun metricNetworkThroughput(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricNetworkThroughput(MetricOptions(arg0))

    override fun metricNetworkTransmitThroughput(): Metric =
        unwrap(this).metricNetworkTransmitThroughput().let(Metric::wrap)

    override fun metricNetworkTransmitThroughput(arg0: MetricOptions): Metric =
        unwrap(this).metricNetworkTransmitThroughput(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2dcf397506092ed5637a6755904f121a8abac26c6288b2aa463bfd00a2e33a51")
    override fun metricNetworkTransmitThroughput(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricNetworkTransmitThroughput(MetricOptions(arg0))

    override fun metricSnapshotStorageUsed(): Metric =
        unwrap(this).metricSnapshotStorageUsed().let(Metric::wrap)

    override fun metricSnapshotStorageUsed(arg0: MetricOptions): Metric =
        unwrap(this).metricSnapshotStorageUsed(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b20cebf25cdba39d8cafa1126165761c523a3fe674b9acb5d4c7a047c4f33c2c")
    override fun metricSnapshotStorageUsed(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricSnapshotStorageUsed(MetricOptions(arg0))

    override fun metricTotalBackupStorageBilled(): Metric =
        unwrap(this).metricTotalBackupStorageBilled().let(Metric::wrap)

    override fun metricTotalBackupStorageBilled(arg0: MetricOptions): Metric =
        unwrap(this).metricTotalBackupStorageBilled(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6eda8a6eaab0f83b3871c32bb94a5e952f3426afa9431da7911d5aa071625bf0")
    override fun metricTotalBackupStorageBilled(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricTotalBackupStorageBilled(MetricOptions(arg0))

    override fun metricVolumeBytesUsed(): Metric =
        unwrap(this).metricVolumeBytesUsed().let(Metric::wrap)

    override fun metricVolumeBytesUsed(arg0: MetricOptions): Metric =
        unwrap(this).metricVolumeBytesUsed(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3bb277c510696a1a9ff520ce37a49f2b8512ad967ff39007f763e2c6dd25fe23")
    override fun metricVolumeBytesUsed(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricVolumeBytesUsed(MetricOptions(arg0))

    override fun metricVolumeReadIoPs(): Metric =
        unwrap(this).metricVolumeReadIOPs().let(Metric::wrap)

    override fun metricVolumeReadIoPs(arg0: MetricOptions): Metric =
        unwrap(this).metricVolumeReadIOPs(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72067052a26857a00db0f687d77e4b1548626bbc1cc21cf9326d161fc9b68886")
    override fun metricVolumeReadIoPs(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricVolumeReadIoPs(MetricOptions(arg0))

    override fun metricVolumeWriteIoPs(): Metric =
        unwrap(this).metricVolumeWriteIOPs().let(Metric::wrap)

    override fun metricVolumeWriteIoPs(arg0: MetricOptions): Metric =
        unwrap(this).metricVolumeWriteIOPs(arg0.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e049e75cf4d1c56da8bf142e554ca3f6d27b3533201bcb1be743dd489f70476a")
    override fun metricVolumeWriteIoPs(arg0: MetricOptions.Builder.() -> Unit): Metric =
        metricVolumeWriteIoPs(MetricOptions(arg0))

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IDatabaseCluster):
        IDatabaseCluster = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDatabaseCluster):
        software.amazon.awscdk.services.rds.IDatabaseCluster = (wrapped as Wrapper).cdkObject
  }
}

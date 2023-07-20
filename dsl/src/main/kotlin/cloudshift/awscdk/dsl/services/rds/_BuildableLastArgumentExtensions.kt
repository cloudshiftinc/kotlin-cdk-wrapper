@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.events.OnEventOptionsDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.events.Rule
import software.amazon.awscdk.services.rds.CfnDBCluster
import software.amazon.awscdk.services.rds.CfnDBInstance
import software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup
import software.amazon.awscdk.services.rds.ClusterEngineConfig
import software.amazon.awscdk.services.rds.ClusterInstance
import software.amazon.awscdk.services.rds.DatabaseCluster
import software.amazon.awscdk.services.rds.DatabaseClusterBase
import software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshot
import software.amazon.awscdk.services.rds.DatabaseInstance
import software.amazon.awscdk.services.rds.DatabaseInstanceBase
import software.amazon.awscdk.services.rds.DatabaseInstanceFromSnapshot
import software.amazon.awscdk.services.rds.DatabaseProxy
import software.amazon.awscdk.services.rds.IAuroraClusterInstance
import software.amazon.awscdk.services.rds.IClusterEngine
import software.amazon.awscdk.services.rds.IClusterInstance
import software.amazon.awscdk.services.rds.IDatabaseCluster
import software.amazon.awscdk.services.rds.IDatabaseInstance
import software.amazon.awscdk.services.rds.IInstanceEngine
import software.amazon.awscdk.services.rds.IOptionGroup
import software.amazon.awscdk.services.rds.IParameterGroup
import software.amazon.awscdk.services.rds.InstanceEngineConfig
import software.amazon.awscdk.services.rds.OptionGroup
import software.amazon.awscdk.services.rds.ParameterGroup
import software.amazon.awscdk.services.rds.ParameterGroupClusterConfig
import software.amazon.awscdk.services.rds.ParameterGroupInstanceConfig
import software.amazon.awscdk.services.rds.ServerlessCluster
import software.amazon.awscdk.services.secretsmanager.SecretRotation
import software.constructs.Construct

public inline
    fun CfnDBInstance.setCertificateDetails(block: CfnDBInstanceCertificateDetailsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDBInstanceCertificateDetailsPropertyDsl()
  builder.apply(block)
  return setCertificateDetails(builder.build())
}

public inline fun CfnDBInstance.setEndpoint(block: CfnDBInstanceEndpointPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnDBInstanceEndpointPropertyDsl()
  builder.apply(block)
  return setEndpoint(builder.build())
}

public inline
    fun CfnDBInstance.setMasterUserSecret(block: CfnDBInstanceMasterUserSecretPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDBInstanceMasterUserSecretPropertyDsl()
  builder.apply(block)
  return setMasterUserSecret(builder.build())
}

public inline fun DatabaseClusterBase.addProxy(id: String, block: DatabaseProxyOptionsDsl.() -> Unit
    = {}): DatabaseProxy {
  val builder = DatabaseProxyOptionsDsl()
  builder.apply(block)
  return addProxy(id, builder.build())
}

public inline fun DatabaseClusterBase.metric(metricName: String, block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, builder.build())
}

public inline fun DatabaseClusterBase.metricCPUUtilization(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCPUUtilization(builder.build())
}

public inline fun DatabaseClusterBase.metricDatabaseConnections(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDatabaseConnections(builder.build())
}

public inline fun DatabaseClusterBase.metricDeadlocks(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDeadlocks(builder.build())
}

public inline fun DatabaseClusterBase.metricEngineUptime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricEngineUptime(builder.build())
}

public inline fun DatabaseClusterBase.metricFreeableMemory(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFreeableMemory(builder.build())
}

public inline fun DatabaseClusterBase.metricFreeLocalStorage(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFreeLocalStorage(builder.build())
}

public inline
    fun DatabaseClusterBase.metricNetworkReceiveThroughput(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNetworkReceiveThroughput(builder.build())
}

public inline fun DatabaseClusterBase.metricNetworkThroughput(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNetworkThroughput(builder.build())
}

public inline
    fun DatabaseClusterBase.metricNetworkTransmitThroughput(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNetworkTransmitThroughput(builder.build())
}

public inline fun DatabaseClusterBase.metricSnapshotStorageUsed(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSnapshotStorageUsed(builder.build())
}

public inline
    fun DatabaseClusterBase.metricTotalBackupStorageBilled(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTotalBackupStorageBilled(builder.build())
}

public inline fun DatabaseClusterBase.metricVolumeBytesUsed(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricVolumeBytesUsed(builder.build())
}

public inline fun DatabaseClusterBase.metricVolumeReadIOPs(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricVolumeReadIOPs(builder.build())
}

public inline fun DatabaseClusterBase.metricVolumeWriteIOPs(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricVolumeWriteIOPs(builder.build())
}

public inline fun IClusterInstance.bind(
  arg0: Construct,
  arg1: IDatabaseCluster,
  block: ClusterInstanceBindOptionsDsl.() -> Unit = {},
): IAuroraClusterInstance {
  val builder = ClusterInstanceBindOptionsDsl()
  builder.apply(block)
  return bind(arg0, arg1, builder.build())
}

public inline fun IDatabaseCluster.addProxy(arg0: String, block: DatabaseProxyOptionsDsl.() -> Unit
    = {}): DatabaseProxy {
  val builder = DatabaseProxyOptionsDsl()
  builder.apply(block)
  return addProxy(arg0, builder.build())
}

public inline fun IDatabaseCluster.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0, builder.build())
}

public inline fun IDatabaseCluster.metricCPUUtilization(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCPUUtilization(builder.build())
}

public inline fun IDatabaseCluster.metricDatabaseConnections(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDatabaseConnections(builder.build())
}

public inline fun IDatabaseCluster.metricDeadlocks(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDeadlocks(builder.build())
}

public inline fun IDatabaseCluster.metricEngineUptime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricEngineUptime(builder.build())
}

public inline fun IDatabaseCluster.metricFreeableMemory(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFreeableMemory(builder.build())
}

public inline fun IDatabaseCluster.metricFreeLocalStorage(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFreeLocalStorage(builder.build())
}

public inline fun IDatabaseCluster.metricNetworkReceiveThroughput(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNetworkReceiveThroughput(builder.build())
}

public inline fun IDatabaseCluster.metricNetworkThroughput(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNetworkThroughput(builder.build())
}

public inline
    fun IDatabaseCluster.metricNetworkTransmitThroughput(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNetworkTransmitThroughput(builder.build())
}

public inline fun IDatabaseCluster.metricSnapshotStorageUsed(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSnapshotStorageUsed(builder.build())
}

public inline fun IDatabaseCluster.metricTotalBackupStorageBilled(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTotalBackupStorageBilled(builder.build())
}

public inline fun IDatabaseCluster.metricVolumeBytesUsed(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricVolumeBytesUsed(builder.build())
}

public inline fun IDatabaseCluster.metricVolumeReadIOPs(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricVolumeReadIOPs(builder.build())
}

public inline fun IDatabaseCluster.metricVolumeWriteIOPs(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricVolumeWriteIOPs(builder.build())
}

public inline fun IInstanceEngine.bindToInstance(arg0: Construct,
    block: InstanceEngineBindOptionsDsl.() -> Unit = {}): InstanceEngineConfig {
  val builder = InstanceEngineBindOptionsDsl()
  builder.apply(block)
  return bindToInstance(arg0, builder.build())
}

public inline fun ServerlessCluster.addRotationMultiUser(id: String,
    block: RotationMultiUserOptionsDsl.() -> Unit = {}): SecretRotation {
  val builder = RotationMultiUserOptionsDsl()
  builder.apply(block)
  return addRotationMultiUser(id, builder.build())
}

public inline
    fun ServerlessCluster.addRotationSingleUser(block: RotationSingleUserOptionsDsl.() -> Unit =
    {}): SecretRotation {
  val builder = RotationSingleUserOptionsDsl()
  builder.apply(block)
  return addRotationSingleUser(builder.build())
}

public inline fun IDatabaseInstance.addProxy(arg0: String, block: DatabaseProxyOptionsDsl.() -> Unit
    = {}): DatabaseProxy {
  val builder = DatabaseProxyOptionsDsl()
  builder.apply(block)
  return addProxy(arg0, builder.build())
}

public inline fun IDatabaseInstance.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0, builder.build())
}

public inline fun IDatabaseInstance.metricCPUUtilization(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCPUUtilization(builder.build())
}

public inline fun IDatabaseInstance.metricDatabaseConnections(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDatabaseConnections(builder.build())
}

public inline fun IDatabaseInstance.metricFreeableMemory(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFreeableMemory(builder.build())
}

public inline fun IDatabaseInstance.metricFreeStorageSpace(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFreeStorageSpace(builder.build())
}

public inline fun IDatabaseInstance.metricReadIOPS(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricReadIOPS(builder.build())
}

public inline fun IDatabaseInstance.metricWriteIOPS(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricWriteIOPS(builder.build())
}

public inline fun IDatabaseInstance.onEvent(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}):
    Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onEvent(arg0, builder.build())
}

public inline
    fun CfnDBCluster.setMasterUserSecret(block: CfnDBClusterMasterUserSecretPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnDBClusterMasterUserSecretPropertyDsl()
  builder.apply(block)
  return setMasterUserSecret(builder.build())
}

public inline
    fun CfnDBCluster.setScalingConfiguration(block: CfnDBClusterScalingConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDBClusterScalingConfigurationPropertyDsl()
  builder.apply(block)
  return setScalingConfiguration(builder.build())
}

public inline
    fun CfnDBCluster.setServerlessV2ScalingConfiguration(block: CfnDBClusterServerlessV2ScalingConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDBClusterServerlessV2ScalingConfigurationPropertyDsl()
  builder.apply(block)
  return setServerlessV2ScalingConfiguration(builder.build())
}

public inline fun OptionGroup.addConfiguration(block: OptionConfigurationDsl.() -> Unit = {}):
    Boolean {
  val builder = OptionConfigurationDsl()
  builder.apply(block)
  return addConfiguration(builder.build())
}

public inline fun IOptionGroup.addConfiguration(block: OptionConfigurationDsl.() -> Unit = {}):
    Boolean {
  val builder = OptionConfigurationDsl()
  builder.apply(block)
  return addConfiguration(builder.build())
}

public inline fun DatabaseClusterFromSnapshot.addRotationMultiUser(id: String,
    block: RotationMultiUserOptionsDsl.() -> Unit = {}): SecretRotation {
  val builder = RotationMultiUserOptionsDsl()
  builder.apply(block)
  return addRotationMultiUser(id, builder.build())
}

public inline
    fun DatabaseClusterFromSnapshot.addRotationSingleUser(block: RotationSingleUserOptionsDsl.() -> Unit
    = {}): SecretRotation {
  val builder = RotationSingleUserOptionsDsl()
  builder.apply(block)
  return addRotationSingleUser(builder.build())
}

public inline
    fun DatabaseClusterFromSnapshot.metricACUUtilization(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricACUUtilization(builder.build())
}

public inline
    fun DatabaseClusterFromSnapshot.metricServerlessDatabaseCapacity(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricServerlessDatabaseCapacity(builder.build())
}

public inline fun DatabaseCluster.addRotationMultiUser(id: String,
    block: RotationMultiUserOptionsDsl.() -> Unit = {}): SecretRotation {
  val builder = RotationMultiUserOptionsDsl()
  builder.apply(block)
  return addRotationMultiUser(id, builder.build())
}

public inline
    fun DatabaseCluster.addRotationSingleUser(block: RotationSingleUserOptionsDsl.() -> Unit = {}):
    SecretRotation {
  val builder = RotationSingleUserOptionsDsl()
  builder.apply(block)
  return addRotationSingleUser(builder.build())
}

public inline fun DatabaseCluster.metricACUUtilization(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricACUUtilization(builder.build())
}

public inline
    fun DatabaseCluster.metricServerlessDatabaseCapacity(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricServerlessDatabaseCapacity(builder.build())
}

public inline fun ClusterInstance.bind(
  scope: Construct,
  cluster: IDatabaseCluster,
  block: ClusterInstanceBindOptionsDsl.() -> Unit = {},
): IAuroraClusterInstance {
  val builder = ClusterInstanceBindOptionsDsl()
  builder.apply(block)
  return bind(scope, cluster, builder.build())
}

public inline
    fun IParameterGroup.bindToCluster(block: ParameterGroupClusterBindOptionsDsl.() -> Unit = {}):
    ParameterGroupClusterConfig {
  val builder = ParameterGroupClusterBindOptionsDsl()
  builder.apply(block)
  return bindToCluster(builder.build())
}

public inline
    fun IParameterGroup.bindToInstance(block: ParameterGroupInstanceBindOptionsDsl.() -> Unit = {}):
    ParameterGroupInstanceConfig {
  val builder = ParameterGroupInstanceBindOptionsDsl()
  builder.apply(block)
  return bindToInstance(builder.build())
}

public inline fun ParameterGroup.bindToCluster(block: ParameterGroupClusterBindOptionsDsl.() -> Unit
    = {}): ParameterGroupClusterConfig {
  val builder = ParameterGroupClusterBindOptionsDsl()
  builder.apply(block)
  return bindToCluster(builder.build())
}

public inline
    fun ParameterGroup.bindToInstance(block: ParameterGroupInstanceBindOptionsDsl.() -> Unit = {}):
    ParameterGroupInstanceConfig {
  val builder = ParameterGroupInstanceBindOptionsDsl()
  builder.apply(block)
  return bindToInstance(builder.build())
}

public inline fun IClusterEngine.bindToCluster(arg0: Construct,
    block: ClusterEngineBindOptionsDsl.() -> Unit = {}): ClusterEngineConfig {
  val builder = ClusterEngineBindOptionsDsl()
  builder.apply(block)
  return bindToCluster(arg0, builder.build())
}

public inline fun DatabaseInstanceBase.addProxy(id: String,
    block: DatabaseProxyOptionsDsl.() -> Unit = {}): DatabaseProxy {
  val builder = DatabaseProxyOptionsDsl()
  builder.apply(block)
  return addProxy(id, builder.build())
}

public inline fun DatabaseInstanceBase.metric(metricName: String, block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(metricName, builder.build())
}

public inline fun DatabaseInstanceBase.metricCPUUtilization(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCPUUtilization(builder.build())
}

public inline fun DatabaseInstanceBase.metricDatabaseConnections(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDatabaseConnections(builder.build())
}

public inline fun DatabaseInstanceBase.metricFreeableMemory(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFreeableMemory(builder.build())
}

public inline fun DatabaseInstanceBase.metricFreeStorageSpace(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFreeStorageSpace(builder.build())
}

public inline fun DatabaseInstanceBase.metricReadIOPS(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricReadIOPS(builder.build())
}

public inline fun DatabaseInstanceBase.metricWriteIOPS(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricWriteIOPS(builder.build())
}

public inline fun DatabaseInstanceBase.onEvent(id: String, block: OnEventOptionsDsl.() -> Unit =
    {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onEvent(id, builder.build())
}

public inline
    fun CfnDBProxyTargetGroup.setConnectionPoolConfigurationInfo(block: CfnDBProxyTargetGroupConnectionPoolConfigurationInfoFormatPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDBProxyTargetGroupConnectionPoolConfigurationInfoFormatPropertyDsl()
  builder.apply(block)
  return setConnectionPoolConfigurationInfo(builder.build())
}

public inline fun DatabaseInstance.addRotationMultiUser(id: String,
    block: RotationMultiUserOptionsDsl.() -> Unit = {}): SecretRotation {
  val builder = RotationMultiUserOptionsDsl()
  builder.apply(block)
  return addRotationMultiUser(id, builder.build())
}

public inline
    fun DatabaseInstance.addRotationSingleUser(block: RotationSingleUserOptionsDsl.() -> Unit = {}):
    SecretRotation {
  val builder = RotationSingleUserOptionsDsl()
  builder.apply(block)
  return addRotationSingleUser(builder.build())
}

public inline fun DatabaseInstanceFromSnapshot.addRotationMultiUser(id: String,
    block: RotationMultiUserOptionsDsl.() -> Unit = {}): SecretRotation {
  val builder = RotationMultiUserOptionsDsl()
  builder.apply(block)
  return addRotationMultiUser(id, builder.build())
}

public inline
    fun DatabaseInstanceFromSnapshot.addRotationSingleUser(block: RotationSingleUserOptionsDsl.() -> Unit
    = {}): SecretRotation {
  val builder = RotationSingleUserOptionsDsl()
  builder.apply(block)
  return addRotationSingleUser(builder.build())
}

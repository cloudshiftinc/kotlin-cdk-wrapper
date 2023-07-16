@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import cloudshift.awscdk.dsl.services.cloudwatch.MetricOptionsDsl
import cloudshift.awscdk.dsl.services.events.OnEventOptionsDsl
import cloudshift.awscdk.dsl.services.iam.PolicyStatementDsl
import cloudshift.awscdk.dsl.services.secretsmanager.RotationScheduleOptionsDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.cloudwatch.Metric
import software.amazon.awscdk.services.events.Rule
import software.amazon.awscdk.services.iam.AddToResourcePolicyResult
import software.amazon.awscdk.services.rds.CfnCustomDBEngineVersion
import software.amazon.awscdk.services.rds.CfnDBCluster
import software.amazon.awscdk.services.rds.CfnDBClusterParameterGroup
import software.amazon.awscdk.services.rds.CfnDBInstance
import software.amazon.awscdk.services.rds.CfnDBParameterGroup
import software.amazon.awscdk.services.rds.CfnDBProxy
import software.amazon.awscdk.services.rds.CfnDBProxyEndpoint
import software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup
import software.amazon.awscdk.services.rds.CfnDBSecurityGroup
import software.amazon.awscdk.services.rds.CfnDBSecurityGroupIngress
import software.amazon.awscdk.services.rds.CfnDBSubnetGroup
import software.amazon.awscdk.services.rds.CfnEventSubscription
import software.amazon.awscdk.services.rds.CfnGlobalCluster
import software.amazon.awscdk.services.rds.CfnOptionGroup
import software.amazon.awscdk.services.rds.ClusterInstance
import software.amazon.awscdk.services.rds.DatabaseCluster
import software.amazon.awscdk.services.rds.DatabaseClusterFromSnapshot
import software.amazon.awscdk.services.rds.DatabaseInstance
import software.amazon.awscdk.services.rds.DatabaseInstanceFromSnapshot
import software.amazon.awscdk.services.rds.DatabaseInstanceReadReplica
import software.amazon.awscdk.services.rds.DatabaseProxy
import software.amazon.awscdk.services.rds.DatabaseSecret
import software.amazon.awscdk.services.rds.IAuroraClusterInstance
import software.amazon.awscdk.services.rds.IDatabaseCluster
import software.amazon.awscdk.services.rds.OptionGroup
import software.amazon.awscdk.services.rds.ParameterGroup
import software.amazon.awscdk.services.rds.ParameterGroupClusterConfig
import software.amazon.awscdk.services.rds.ParameterGroupInstanceConfig
import software.amazon.awscdk.services.rds.ServerlessCluster
import software.amazon.awscdk.services.secretsmanager.RotationSchedule
import software.amazon.awscdk.services.secretsmanager.SecretRotation
import software.constructs.Construct

public inline fun CfnCustomDBEngineVersion.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDBCluster.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
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

public inline fun CfnDBClusterParameterGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDBInstance.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

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

public inline fun CfnDBParameterGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDBProxy.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDBProxyEndpoint.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDBProxyTargetGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnDBProxyTargetGroup.setConnectionPoolConfigurationInfo(block: CfnDBProxyTargetGroupConnectionPoolConfigurationInfoFormatPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnDBProxyTargetGroupConnectionPoolConfigurationInfoFormatPropertyDsl()
  builder.apply(block)
  return setConnectionPoolConfigurationInfo(builder.build())
}

public inline fun CfnDBSecurityGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDBSecurityGroupIngress.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnDBSubnetGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnEventSubscription.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnGlobalCluster.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun CfnOptionGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline fun ClusterInstance.bind(
  arg0: Construct,
  arg1: IDatabaseCluster,
  block: ClusterInstanceBindOptionsDsl.() -> Unit = {},
): IAuroraClusterInstance {
  val builder = ClusterInstanceBindOptionsDsl()
  builder.apply(block)
  return bind(arg0,arg1,builder.build())
}

public inline fun DatabaseCluster.addProxy(arg0: String, block: DatabaseProxyOptionsDsl.() -> Unit =
    {}): DatabaseProxy {
  val builder = DatabaseProxyOptionsDsl()
  builder.apply(block)
  return addProxy(arg0,builder.build())
}

public inline fun DatabaseCluster.addRotationMultiUser(arg0: String,
    block: RotationMultiUserOptionsDsl.() -> Unit = {}): SecretRotation {
  val builder = RotationMultiUserOptionsDsl()
  builder.apply(block)
  return addRotationMultiUser(arg0,builder.build())
}

public inline
    fun DatabaseCluster.addRotationSingleUser(block: RotationSingleUserOptionsDsl.() -> Unit = {}):
    SecretRotation {
  val builder = RotationSingleUserOptionsDsl()
  builder.apply(block)
  return addRotationSingleUser(builder.build())
}

public inline fun DatabaseCluster.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun DatabaseCluster.metricACUUtilization(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricACUUtilization(builder.build())
}

public inline fun DatabaseCluster.metricCPUUtilization(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCPUUtilization(builder.build())
}

public inline fun DatabaseCluster.metricDatabaseConnections(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDatabaseConnections(builder.build())
}

public inline fun DatabaseCluster.metricDeadlocks(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDeadlocks(builder.build())
}

public inline fun DatabaseCluster.metricEngineUptime(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricEngineUptime(builder.build())
}

public inline fun DatabaseCluster.metricFreeLocalStorage(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFreeLocalStorage(builder.build())
}

public inline fun DatabaseCluster.metricFreeableMemory(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFreeableMemory(builder.build())
}

public inline fun DatabaseCluster.metricNetworkReceiveThroughput(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNetworkReceiveThroughput(builder.build())
}

public inline fun DatabaseCluster.metricNetworkThroughput(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNetworkThroughput(builder.build())
}

public inline fun DatabaseCluster.metricNetworkTransmitThroughput(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNetworkTransmitThroughput(builder.build())
}

public inline
    fun DatabaseCluster.metricServerlessDatabaseCapacity(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricServerlessDatabaseCapacity(builder.build())
}

public inline fun DatabaseCluster.metricSnapshotStorageUsed(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSnapshotStorageUsed(builder.build())
}

public inline fun DatabaseCluster.metricTotalBackupStorageBilled(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTotalBackupStorageBilled(builder.build())
}

public inline fun DatabaseCluster.metricVolumeBytesUsed(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricVolumeBytesUsed(builder.build())
}

public inline fun DatabaseCluster.metricVolumeReadIOPs(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricVolumeReadIOPs(builder.build())
}

public inline fun DatabaseCluster.metricVolumeWriteIOPs(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricVolumeWriteIOPs(builder.build())
}

public inline fun DatabaseClusterFromSnapshot.addProxy(arg0: String,
    block: DatabaseProxyOptionsDsl.() -> Unit = {}): DatabaseProxy {
  val builder = DatabaseProxyOptionsDsl()
  builder.apply(block)
  return addProxy(arg0,builder.build())
}

public inline fun DatabaseClusterFromSnapshot.addRotationMultiUser(arg0: String,
    block: RotationMultiUserOptionsDsl.() -> Unit = {}): SecretRotation {
  val builder = RotationMultiUserOptionsDsl()
  builder.apply(block)
  return addRotationMultiUser(arg0,builder.build())
}

public inline
    fun DatabaseClusterFromSnapshot.addRotationSingleUser(block: RotationSingleUserOptionsDsl.() -> Unit
    = {}): SecretRotation {
  val builder = RotationSingleUserOptionsDsl()
  builder.apply(block)
  return addRotationSingleUser(builder.build())
}

public inline fun DatabaseClusterFromSnapshot.metric(arg0: String,
    block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline
    fun DatabaseClusterFromSnapshot.metricACUUtilization(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricACUUtilization(builder.build())
}

public inline
    fun DatabaseClusterFromSnapshot.metricCPUUtilization(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCPUUtilization(builder.build())
}

public inline
    fun DatabaseClusterFromSnapshot.metricDatabaseConnections(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDatabaseConnections(builder.build())
}

public inline fun DatabaseClusterFromSnapshot.metricDeadlocks(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDeadlocks(builder.build())
}

public inline fun DatabaseClusterFromSnapshot.metricEngineUptime(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricEngineUptime(builder.build())
}

public inline
    fun DatabaseClusterFromSnapshot.metricFreeLocalStorage(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFreeLocalStorage(builder.build())
}

public inline
    fun DatabaseClusterFromSnapshot.metricFreeableMemory(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFreeableMemory(builder.build())
}

public inline
    fun DatabaseClusterFromSnapshot.metricNetworkReceiveThroughput(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNetworkReceiveThroughput(builder.build())
}

public inline
    fun DatabaseClusterFromSnapshot.metricNetworkThroughput(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNetworkThroughput(builder.build())
}

public inline
    fun DatabaseClusterFromSnapshot.metricNetworkTransmitThroughput(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricNetworkTransmitThroughput(builder.build())
}

public inline
    fun DatabaseClusterFromSnapshot.metricServerlessDatabaseCapacity(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricServerlessDatabaseCapacity(builder.build())
}

public inline
    fun DatabaseClusterFromSnapshot.metricSnapshotStorageUsed(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricSnapshotStorageUsed(builder.build())
}

public inline
    fun DatabaseClusterFromSnapshot.metricTotalBackupStorageBilled(block: MetricOptionsDsl.() -> Unit
    = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricTotalBackupStorageBilled(builder.build())
}

public inline
    fun DatabaseClusterFromSnapshot.metricVolumeBytesUsed(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricVolumeBytesUsed(builder.build())
}

public inline
    fun DatabaseClusterFromSnapshot.metricVolumeReadIOPs(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricVolumeReadIOPs(builder.build())
}

public inline
    fun DatabaseClusterFromSnapshot.metricVolumeWriteIOPs(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricVolumeWriteIOPs(builder.build())
}

public inline fun DatabaseInstance.addProxy(arg0: String, block: DatabaseProxyOptionsDsl.() -> Unit
    = {}): DatabaseProxy {
  val builder = DatabaseProxyOptionsDsl()
  builder.apply(block)
  return addProxy(arg0,builder.build())
}

public inline fun DatabaseInstance.addRotationMultiUser(arg0: String,
    block: RotationMultiUserOptionsDsl.() -> Unit = {}): SecretRotation {
  val builder = RotationMultiUserOptionsDsl()
  builder.apply(block)
  return addRotationMultiUser(arg0,builder.build())
}

public inline
    fun DatabaseInstance.addRotationSingleUser(block: RotationSingleUserOptionsDsl.() -> Unit = {}):
    SecretRotation {
  val builder = RotationSingleUserOptionsDsl()
  builder.apply(block)
  return addRotationSingleUser(builder.build())
}

public inline fun DatabaseInstance.metric(arg0: String, block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline fun DatabaseInstance.metricCPUUtilization(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCPUUtilization(builder.build())
}

public inline fun DatabaseInstance.metricDatabaseConnections(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDatabaseConnections(builder.build())
}

public inline fun DatabaseInstance.metricFreeStorageSpace(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFreeStorageSpace(builder.build())
}

public inline fun DatabaseInstance.metricFreeableMemory(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFreeableMemory(builder.build())
}

public inline fun DatabaseInstance.metricReadIOPS(block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricReadIOPS(builder.build())
}

public inline fun DatabaseInstance.metricWriteIOPS(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricWriteIOPS(builder.build())
}

public inline fun DatabaseInstance.onEvent(arg0: String, block: OnEventOptionsDsl.() -> Unit = {}):
    Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onEvent(arg0,builder.build())
}

public inline fun DatabaseInstanceFromSnapshot.addProxy(arg0: String,
    block: DatabaseProxyOptionsDsl.() -> Unit = {}): DatabaseProxy {
  val builder = DatabaseProxyOptionsDsl()
  builder.apply(block)
  return addProxy(arg0,builder.build())
}

public inline fun DatabaseInstanceFromSnapshot.addRotationMultiUser(arg0: String,
    block: RotationMultiUserOptionsDsl.() -> Unit = {}): SecretRotation {
  val builder = RotationMultiUserOptionsDsl()
  builder.apply(block)
  return addRotationMultiUser(arg0,builder.build())
}

public inline
    fun DatabaseInstanceFromSnapshot.addRotationSingleUser(block: RotationSingleUserOptionsDsl.() -> Unit
    = {}): SecretRotation {
  val builder = RotationSingleUserOptionsDsl()
  builder.apply(block)
  return addRotationSingleUser(builder.build())
}

public inline fun DatabaseInstanceFromSnapshot.metric(arg0: String,
    block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline
    fun DatabaseInstanceFromSnapshot.metricCPUUtilization(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCPUUtilization(builder.build())
}

public inline
    fun DatabaseInstanceFromSnapshot.metricDatabaseConnections(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDatabaseConnections(builder.build())
}

public inline
    fun DatabaseInstanceFromSnapshot.metricFreeStorageSpace(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFreeStorageSpace(builder.build())
}

public inline
    fun DatabaseInstanceFromSnapshot.metricFreeableMemory(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFreeableMemory(builder.build())
}

public inline fun DatabaseInstanceFromSnapshot.metricReadIOPS(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricReadIOPS(builder.build())
}

public inline fun DatabaseInstanceFromSnapshot.metricWriteIOPS(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricWriteIOPS(builder.build())
}

public inline fun DatabaseInstanceFromSnapshot.onEvent(arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onEvent(arg0,builder.build())
}

public inline fun DatabaseInstanceReadReplica.addProxy(arg0: String,
    block: DatabaseProxyOptionsDsl.() -> Unit = {}): DatabaseProxy {
  val builder = DatabaseProxyOptionsDsl()
  builder.apply(block)
  return addProxy(arg0,builder.build())
}

public inline fun DatabaseInstanceReadReplica.metric(arg0: String,
    block: MetricOptionsDsl.() -> Unit = {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metric(arg0,builder.build())
}

public inline
    fun DatabaseInstanceReadReplica.metricCPUUtilization(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricCPUUtilization(builder.build())
}

public inline
    fun DatabaseInstanceReadReplica.metricDatabaseConnections(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricDatabaseConnections(builder.build())
}

public inline
    fun DatabaseInstanceReadReplica.metricFreeStorageSpace(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFreeStorageSpace(builder.build())
}

public inline
    fun DatabaseInstanceReadReplica.metricFreeableMemory(block: MetricOptionsDsl.() -> Unit = {}):
    Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricFreeableMemory(builder.build())
}

public inline fun DatabaseInstanceReadReplica.metricReadIOPS(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricReadIOPS(builder.build())
}

public inline fun DatabaseInstanceReadReplica.metricWriteIOPS(block: MetricOptionsDsl.() -> Unit =
    {}): Metric {
  val builder = MetricOptionsDsl()
  builder.apply(block)
  return metricWriteIOPS(builder.build())
}

public inline fun DatabaseInstanceReadReplica.onEvent(arg0: String,
    block: OnEventOptionsDsl.() -> Unit = {}): Rule {
  val builder = OnEventOptionsDsl()
  builder.apply(block)
  return onEvent(arg0,builder.build())
}

public inline fun DatabaseSecret.addRotationSchedule(arg0: String,
    block: RotationScheduleOptionsDsl.() -> Unit = {}): RotationSchedule {
  val builder = RotationScheduleOptionsDsl()
  builder.apply(block)
  return addRotationSchedule(arg0,builder.build())
}

public inline fun DatabaseSecret.addToResourcePolicy(block: PolicyStatementDsl.() -> Unit = {}):
    AddToResourcePolicyResult {
  val builder = PolicyStatementDsl()
  builder.apply(block)
  return addToResourcePolicy(builder.build())
}

public inline fun OptionGroup.addConfiguration(block: OptionConfigurationDsl.() -> Unit = {}):
    Boolean {
  val builder = OptionConfigurationDsl()
  builder.apply(block)
  return addConfiguration(builder.build())
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

public inline fun ServerlessCluster.addRotationMultiUser(arg0: String,
    block: RotationMultiUserOptionsDsl.() -> Unit = {}): SecretRotation {
  val builder = RotationMultiUserOptionsDsl()
  builder.apply(block)
  return addRotationMultiUser(arg0,builder.build())
}

public inline
    fun ServerlessCluster.addRotationSingleUser(block: RotationSingleUserOptionsDsl.() -> Unit =
    {}): SecretRotation {
  val builder = RotationSingleUserOptionsDsl()
  builder.apply(block)
  return addRotationSingleUser(builder.build())
}

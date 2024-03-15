@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnReplicationGroupProps {
  public fun atRestEncryptionEnabled(): Any? = unwrap(this).getAtRestEncryptionEnabled()

  public fun authToken(): String? = unwrap(this).getAuthToken()

  public fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  public fun automaticFailoverEnabled(): Any? = unwrap(this).getAutomaticFailoverEnabled()

  public fun cacheNodeType(): String? = unwrap(this).getCacheNodeType()

  public fun cacheParameterGroupName(): String? = unwrap(this).getCacheParameterGroupName()

  public fun cacheSecurityGroupNames(): List<String> = unwrap(this).getCacheSecurityGroupNames() ?:
      emptyList()

  public fun cacheSubnetGroupName(): String? = unwrap(this).getCacheSubnetGroupName()

  public fun clusterMode(): String? = unwrap(this).getClusterMode()

  public fun dataTieringEnabled(): Any? = unwrap(this).getDataTieringEnabled()

  public fun engine(): String? = unwrap(this).getEngine()

  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public fun globalReplicationGroupId(): String? = unwrap(this).getGlobalReplicationGroupId()

  public fun ipDiscovery(): String? = unwrap(this).getIpDiscovery()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun logDeliveryConfigurations(): Any? = unwrap(this).getLogDeliveryConfigurations()

  public fun multiAzEnabled(): Any? = unwrap(this).getMultiAzEnabled()

  public fun networkType(): String? = unwrap(this).getNetworkType()

  public fun nodeGroupConfiguration(): Any? = unwrap(this).getNodeGroupConfiguration()

  public fun notificationTopicArn(): String? = unwrap(this).getNotificationTopicArn()

  public fun numCacheClusters(): Number? = unwrap(this).getNumCacheClusters()

  public fun numNodeGroups(): Number? = unwrap(this).getNumNodeGroups()

  public fun port(): Number? = unwrap(this).getPort()

  public fun preferredCacheClusterAZs(): List<String> = unwrap(this).getPreferredCacheClusterAZs()
      ?: emptyList()

  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  public fun primaryClusterId(): String? = unwrap(this).getPrimaryClusterId()

  public fun replicasPerNodeGroup(): Number? = unwrap(this).getReplicasPerNodeGroup()

  public fun replicationGroupDescription(): String

  public fun replicationGroupId(): String? = unwrap(this).getReplicationGroupId()

  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  public fun snapshotArns(): List<String> = unwrap(this).getSnapshotArns() ?: emptyList()

  public fun snapshotName(): String? = unwrap(this).getSnapshotName()

  public fun snapshotRetentionLimit(): Number? = unwrap(this).getSnapshotRetentionLimit()

  public fun snapshotWindow(): String? = unwrap(this).getSnapshotWindow()

  public fun snapshottingClusterId(): String? = unwrap(this).getSnapshottingClusterId()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun transitEncryptionEnabled(): Any? = unwrap(this).getTransitEncryptionEnabled()

  public fun transitEncryptionMode(): String? = unwrap(this).getTransitEncryptionMode()

  public fun userGroupIds(): List<String> = unwrap(this).getUserGroupIds() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun atRestEncryptionEnabled(atRestEncryptionEnabled: Boolean)

    public fun atRestEncryptionEnabled(atRestEncryptionEnabled: IResolvable)

    public fun authToken(authToken: String)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    public fun automaticFailoverEnabled(automaticFailoverEnabled: Boolean)

    public fun automaticFailoverEnabled(automaticFailoverEnabled: IResolvable)

    public fun cacheNodeType(cacheNodeType: String)

    public fun cacheParameterGroupName(cacheParameterGroupName: String)

    public fun cacheSecurityGroupNames(cacheSecurityGroupNames: List<String>)

    public fun cacheSecurityGroupNames(vararg cacheSecurityGroupNames: String)

    public fun cacheSubnetGroupName(cacheSubnetGroupName: String)

    public fun clusterMode(clusterMode: String)

    public fun dataTieringEnabled(dataTieringEnabled: Boolean)

    public fun dataTieringEnabled(dataTieringEnabled: IResolvable)

    public fun engine(engine: String)

    public fun engineVersion(engineVersion: String)

    public fun globalReplicationGroupId(globalReplicationGroupId: String)

    public fun ipDiscovery(ipDiscovery: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun logDeliveryConfigurations(logDeliveryConfigurations: IResolvable)

    public fun logDeliveryConfigurations(logDeliveryConfigurations: List<Any>)

    public fun logDeliveryConfigurations(vararg logDeliveryConfigurations: Any)

    public fun multiAzEnabled(multiAzEnabled: Boolean)

    public fun multiAzEnabled(multiAzEnabled: IResolvable)

    public fun networkType(networkType: String)

    public fun nodeGroupConfiguration(nodeGroupConfiguration: IResolvable)

    public fun nodeGroupConfiguration(nodeGroupConfiguration: List<Any>)

    public fun nodeGroupConfiguration(vararg nodeGroupConfiguration: Any)

    public fun notificationTopicArn(notificationTopicArn: String)

    public fun numCacheClusters(numCacheClusters: Number)

    public fun numNodeGroups(numNodeGroups: Number)

    public fun port(port: Number)

    public fun preferredCacheClusterAZs(preferredCacheClusterAZs: List<String>)

    public fun preferredCacheClusterAZs(vararg preferredCacheClusterAZs: String)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun primaryClusterId(primaryClusterId: String)

    public fun replicasPerNodeGroup(replicasPerNodeGroup: Number)

    public fun replicationGroupDescription(replicationGroupDescription: String)

    public fun replicationGroupId(replicationGroupId: String)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun snapshotArns(snapshotArns: List<String>)

    public fun snapshotArns(vararg snapshotArns: String)

    public fun snapshotName(snapshotName: String)

    public fun snapshotRetentionLimit(snapshotRetentionLimit: Number)

    public fun snapshotWindow(snapshotWindow: String)

    public fun snapshottingClusterId(snapshottingClusterId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean)

    public fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable)

    public fun transitEncryptionMode(transitEncryptionMode: String)

    public fun userGroupIds(userGroupIds: List<String>)

    public fun userGroupIds(vararg userGroupIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.Builder =
        software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps.builder()

    override fun atRestEncryptionEnabled(atRestEncryptionEnabled: Boolean) {
      cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled)
    }

    override fun atRestEncryptionEnabled(atRestEncryptionEnabled: IResolvable) {
      cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled.let(IResolvable::unwrap))
    }

    override fun authToken(authToken: String) {
      cdkBuilder.authToken(authToken)
    }

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    override fun automaticFailoverEnabled(automaticFailoverEnabled: Boolean) {
      cdkBuilder.automaticFailoverEnabled(automaticFailoverEnabled)
    }

    override fun automaticFailoverEnabled(automaticFailoverEnabled: IResolvable) {
      cdkBuilder.automaticFailoverEnabled(automaticFailoverEnabled.let(IResolvable::unwrap))
    }

    override fun cacheNodeType(cacheNodeType: String) {
      cdkBuilder.cacheNodeType(cacheNodeType)
    }

    override fun cacheParameterGroupName(cacheParameterGroupName: String) {
      cdkBuilder.cacheParameterGroupName(cacheParameterGroupName)
    }

    override fun cacheSecurityGroupNames(cacheSecurityGroupNames: List<String>) {
      cdkBuilder.cacheSecurityGroupNames(cacheSecurityGroupNames)
    }

    override fun cacheSecurityGroupNames(vararg cacheSecurityGroupNames: String): Unit =
        cacheSecurityGroupNames(cacheSecurityGroupNames.toList())

    override fun cacheSubnetGroupName(cacheSubnetGroupName: String) {
      cdkBuilder.cacheSubnetGroupName(cacheSubnetGroupName)
    }

    override fun clusterMode(clusterMode: String) {
      cdkBuilder.clusterMode(clusterMode)
    }

    override fun dataTieringEnabled(dataTieringEnabled: Boolean) {
      cdkBuilder.dataTieringEnabled(dataTieringEnabled)
    }

    override fun dataTieringEnabled(dataTieringEnabled: IResolvable) {
      cdkBuilder.dataTieringEnabled(dataTieringEnabled.let(IResolvable::unwrap))
    }

    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    override fun globalReplicationGroupId(globalReplicationGroupId: String) {
      cdkBuilder.globalReplicationGroupId(globalReplicationGroupId)
    }

    override fun ipDiscovery(ipDiscovery: String) {
      cdkBuilder.ipDiscovery(ipDiscovery)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun logDeliveryConfigurations(logDeliveryConfigurations: IResolvable) {
      cdkBuilder.logDeliveryConfigurations(logDeliveryConfigurations.let(IResolvable::unwrap))
    }

    override fun logDeliveryConfigurations(logDeliveryConfigurations: List<Any>) {
      cdkBuilder.logDeliveryConfigurations(logDeliveryConfigurations)
    }

    override fun logDeliveryConfigurations(vararg logDeliveryConfigurations: Any): Unit =
        logDeliveryConfigurations(logDeliveryConfigurations.toList())

    override fun multiAzEnabled(multiAzEnabled: Boolean) {
      cdkBuilder.multiAzEnabled(multiAzEnabled)
    }

    override fun multiAzEnabled(multiAzEnabled: IResolvable) {
      cdkBuilder.multiAzEnabled(multiAzEnabled.let(IResolvable::unwrap))
    }

    override fun networkType(networkType: String) {
      cdkBuilder.networkType(networkType)
    }

    override fun nodeGroupConfiguration(nodeGroupConfiguration: IResolvable) {
      cdkBuilder.nodeGroupConfiguration(nodeGroupConfiguration.let(IResolvable::unwrap))
    }

    override fun nodeGroupConfiguration(nodeGroupConfiguration: List<Any>) {
      cdkBuilder.nodeGroupConfiguration(nodeGroupConfiguration)
    }

    override fun nodeGroupConfiguration(vararg nodeGroupConfiguration: Any): Unit =
        nodeGroupConfiguration(nodeGroupConfiguration.toList())

    override fun notificationTopicArn(notificationTopicArn: String) {
      cdkBuilder.notificationTopicArn(notificationTopicArn)
    }

    override fun numCacheClusters(numCacheClusters: Number) {
      cdkBuilder.numCacheClusters(numCacheClusters)
    }

    override fun numNodeGroups(numNodeGroups: Number) {
      cdkBuilder.numNodeGroups(numNodeGroups)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun preferredCacheClusterAZs(preferredCacheClusterAZs: List<String>) {
      cdkBuilder.preferredCacheClusterAZs(preferredCacheClusterAZs)
    }

    override fun preferredCacheClusterAZs(vararg preferredCacheClusterAZs: String): Unit =
        preferredCacheClusterAZs(preferredCacheClusterAZs.toList())

    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    override fun primaryClusterId(primaryClusterId: String) {
      cdkBuilder.primaryClusterId(primaryClusterId)
    }

    override fun replicasPerNodeGroup(replicasPerNodeGroup: Number) {
      cdkBuilder.replicasPerNodeGroup(replicasPerNodeGroup)
    }

    override fun replicationGroupDescription(replicationGroupDescription: String) {
      cdkBuilder.replicationGroupDescription(replicationGroupDescription)
    }

    override fun replicationGroupId(replicationGroupId: String) {
      cdkBuilder.replicationGroupId(replicationGroupId)
    }

    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    override fun snapshotArns(snapshotArns: List<String>) {
      cdkBuilder.snapshotArns(snapshotArns)
    }

    override fun snapshotArns(vararg snapshotArns: String): Unit =
        snapshotArns(snapshotArns.toList())

    override fun snapshotName(snapshotName: String) {
      cdkBuilder.snapshotName(snapshotName)
    }

    override fun snapshotRetentionLimit(snapshotRetentionLimit: Number) {
      cdkBuilder.snapshotRetentionLimit(snapshotRetentionLimit)
    }

    override fun snapshotWindow(snapshotWindow: String) {
      cdkBuilder.snapshotWindow(snapshotWindow)
    }

    override fun snapshottingClusterId(snapshottingClusterId: String) {
      cdkBuilder.snapshottingClusterId(snapshottingClusterId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean) {
      cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled)
    }

    override fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable) {
      cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled.let(IResolvable::unwrap))
    }

    override fun transitEncryptionMode(transitEncryptionMode: String) {
      cdkBuilder.transitEncryptionMode(transitEncryptionMode)
    }

    override fun userGroupIds(userGroupIds: List<String>) {
      cdkBuilder.userGroupIds(userGroupIds)
    }

    override fun userGroupIds(vararg userGroupIds: String): Unit =
        userGroupIds(userGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps,
  ) : CdkObject(cdkObject), CfnReplicationGroupProps {
    override fun atRestEncryptionEnabled(): Any? = unwrap(this).getAtRestEncryptionEnabled()

    override fun authToken(): String? = unwrap(this).getAuthToken()

    override fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

    override fun automaticFailoverEnabled(): Any? = unwrap(this).getAutomaticFailoverEnabled()

    override fun cacheNodeType(): String? = unwrap(this).getCacheNodeType()

    override fun cacheParameterGroupName(): String? = unwrap(this).getCacheParameterGroupName()

    override fun cacheSecurityGroupNames(): List<String> = unwrap(this).getCacheSecurityGroupNames()
        ?: emptyList()

    override fun cacheSubnetGroupName(): String? = unwrap(this).getCacheSubnetGroupName()

    override fun clusterMode(): String? = unwrap(this).getClusterMode()

    override fun dataTieringEnabled(): Any? = unwrap(this).getDataTieringEnabled()

    override fun engine(): String? = unwrap(this).getEngine()

    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    override fun globalReplicationGroupId(): String? = unwrap(this).getGlobalReplicationGroupId()

    override fun ipDiscovery(): String? = unwrap(this).getIpDiscovery()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun logDeliveryConfigurations(): Any? = unwrap(this).getLogDeliveryConfigurations()

    override fun multiAzEnabled(): Any? = unwrap(this).getMultiAzEnabled()

    override fun networkType(): String? = unwrap(this).getNetworkType()

    override fun nodeGroupConfiguration(): Any? = unwrap(this).getNodeGroupConfiguration()

    override fun notificationTopicArn(): String? = unwrap(this).getNotificationTopicArn()

    override fun numCacheClusters(): Number? = unwrap(this).getNumCacheClusters()

    override fun numNodeGroups(): Number? = unwrap(this).getNumNodeGroups()

    override fun port(): Number? = unwrap(this).getPort()

    override fun preferredCacheClusterAZs(): List<String> =
        unwrap(this).getPreferredCacheClusterAZs() ?: emptyList()

    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    override fun primaryClusterId(): String? = unwrap(this).getPrimaryClusterId()

    override fun replicasPerNodeGroup(): Number? = unwrap(this).getReplicasPerNodeGroup()

    override fun replicationGroupDescription(): String =
        unwrap(this).getReplicationGroupDescription()

    override fun replicationGroupId(): String? = unwrap(this).getReplicationGroupId()

    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    override fun snapshotArns(): List<String> = unwrap(this).getSnapshotArns() ?: emptyList()

    override fun snapshotName(): String? = unwrap(this).getSnapshotName()

    override fun snapshotRetentionLimit(): Number? = unwrap(this).getSnapshotRetentionLimit()

    override fun snapshotWindow(): String? = unwrap(this).getSnapshotWindow()

    override fun snapshottingClusterId(): String? = unwrap(this).getSnapshottingClusterId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun transitEncryptionEnabled(): Any? = unwrap(this).getTransitEncryptionEnabled()

    override fun transitEncryptionMode(): String? = unwrap(this).getTransitEncryptionMode()

    override fun userGroupIds(): List<String> = unwrap(this).getUserGroupIds() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnReplicationGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps):
        CfnReplicationGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationGroupProps):
        software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticache.CfnReplicationGroupProps
  }
}

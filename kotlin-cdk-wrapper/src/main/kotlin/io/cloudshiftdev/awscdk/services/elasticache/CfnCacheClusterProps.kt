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

public interface CfnCacheClusterProps {
  public fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  public fun azMode(): String? = unwrap(this).getAzMode()

  public fun cacheNodeType(): String

  public fun cacheParameterGroupName(): String? = unwrap(this).getCacheParameterGroupName()

  public fun cacheSecurityGroupNames(): List<String> = unwrap(this).getCacheSecurityGroupNames() ?:
      emptyList()

  public fun cacheSubnetGroupName(): String? = unwrap(this).getCacheSubnetGroupName()

  public fun clusterName(): String? = unwrap(this).getClusterName()

  public fun engine(): String

  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public fun ipDiscovery(): String? = unwrap(this).getIpDiscovery()

  public fun logDeliveryConfigurations(): Any? = unwrap(this).getLogDeliveryConfigurations()

  public fun networkType(): String? = unwrap(this).getNetworkType()

  public fun notificationTopicArn(): String? = unwrap(this).getNotificationTopicArn()

  public fun numCacheNodes(): Number

  public fun port(): Number? = unwrap(this).getPort()

  public fun preferredAvailabilityZone(): String? = unwrap(this).getPreferredAvailabilityZone()

  public fun preferredAvailabilityZones(): List<String> =
      unwrap(this).getPreferredAvailabilityZones() ?: emptyList()

  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  public fun snapshotArns(): List<String> = unwrap(this).getSnapshotArns() ?: emptyList()

  public fun snapshotName(): String? = unwrap(this).getSnapshotName()

  public fun snapshotRetentionLimit(): Number? = unwrap(this).getSnapshotRetentionLimit()

  public fun snapshotWindow(): String? = unwrap(this).getSnapshotWindow()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun transitEncryptionEnabled(): Any? = unwrap(this).getTransitEncryptionEnabled()

  public fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    public fun azMode(azMode: String)

    public fun cacheNodeType(cacheNodeType: String)

    public fun cacheParameterGroupName(cacheParameterGroupName: String)

    public fun cacheSecurityGroupNames(cacheSecurityGroupNames: List<String>)

    public fun cacheSecurityGroupNames(vararg cacheSecurityGroupNames: String)

    public fun cacheSubnetGroupName(cacheSubnetGroupName: String)

    public fun clusterName(clusterName: String)

    public fun engine(engine: String)

    public fun engineVersion(engineVersion: String)

    public fun ipDiscovery(ipDiscovery: String)

    public fun logDeliveryConfigurations(logDeliveryConfigurations: IResolvable)

    public fun logDeliveryConfigurations(logDeliveryConfigurations: List<Any>)

    public fun logDeliveryConfigurations(vararg logDeliveryConfigurations: Any)

    public fun networkType(networkType: String)

    public fun notificationTopicArn(notificationTopicArn: String)

    public fun numCacheNodes(numCacheNodes: Number)

    public fun port(port: Number)

    public fun preferredAvailabilityZone(preferredAvailabilityZone: String)

    public fun preferredAvailabilityZones(preferredAvailabilityZones: List<String>)

    public fun preferredAvailabilityZones(vararg preferredAvailabilityZones: String)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun snapshotArns(snapshotArns: List<String>)

    public fun snapshotArns(vararg snapshotArns: String)

    public fun snapshotName(snapshotName: String)

    public fun snapshotRetentionLimit(snapshotRetentionLimit: Number)

    public fun snapshotWindow(snapshotWindow: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean)

    public fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable)

    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)

    public fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.Builder
        = software.amazon.awscdk.services.elasticache.CfnCacheClusterProps.builder()

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    override fun azMode(azMode: String) {
      cdkBuilder.azMode(azMode)
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

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    override fun ipDiscovery(ipDiscovery: String) {
      cdkBuilder.ipDiscovery(ipDiscovery)
    }

    override fun logDeliveryConfigurations(logDeliveryConfigurations: IResolvable) {
      cdkBuilder.logDeliveryConfigurations(logDeliveryConfigurations.let(IResolvable::unwrap))
    }

    override fun logDeliveryConfigurations(logDeliveryConfigurations: List<Any>) {
      cdkBuilder.logDeliveryConfigurations(logDeliveryConfigurations)
    }

    override fun logDeliveryConfigurations(vararg logDeliveryConfigurations: Any): Unit =
        logDeliveryConfigurations(logDeliveryConfigurations.toList())

    override fun networkType(networkType: String) {
      cdkBuilder.networkType(networkType)
    }

    override fun notificationTopicArn(notificationTopicArn: String) {
      cdkBuilder.notificationTopicArn(notificationTopicArn)
    }

    override fun numCacheNodes(numCacheNodes: Number) {
      cdkBuilder.numCacheNodes(numCacheNodes)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun preferredAvailabilityZone(preferredAvailabilityZone: String) {
      cdkBuilder.preferredAvailabilityZone(preferredAvailabilityZone)
    }

    override fun preferredAvailabilityZones(preferredAvailabilityZones: List<String>) {
      cdkBuilder.preferredAvailabilityZones(preferredAvailabilityZones)
    }

    override fun preferredAvailabilityZones(vararg preferredAvailabilityZones: String): Unit =
        preferredAvailabilityZones(preferredAvailabilityZones.toList())

    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

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

    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    override fun vpcSecurityGroupIds(vararg vpcSecurityGroupIds: String): Unit =
        vpcSecurityGroupIds(vpcSecurityGroupIds.toList())

    public fun build(): software.amazon.awscdk.services.elasticache.CfnCacheClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticache.CfnCacheClusterProps,
  ) : CdkObject(cdkObject), CfnCacheClusterProps {
    override fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

    override fun azMode(): String? = unwrap(this).getAzMode()

    override fun cacheNodeType(): String = unwrap(this).getCacheNodeType()

    override fun cacheParameterGroupName(): String? = unwrap(this).getCacheParameterGroupName()

    override fun cacheSecurityGroupNames(): List<String> = unwrap(this).getCacheSecurityGroupNames()
        ?: emptyList()

    override fun cacheSubnetGroupName(): String? = unwrap(this).getCacheSubnetGroupName()

    override fun clusterName(): String? = unwrap(this).getClusterName()

    override fun engine(): String = unwrap(this).getEngine()

    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    override fun ipDiscovery(): String? = unwrap(this).getIpDiscovery()

    override fun logDeliveryConfigurations(): Any? = unwrap(this).getLogDeliveryConfigurations()

    override fun networkType(): String? = unwrap(this).getNetworkType()

    override fun notificationTopicArn(): String? = unwrap(this).getNotificationTopicArn()

    override fun numCacheNodes(): Number = unwrap(this).getNumCacheNodes()

    override fun port(): Number? = unwrap(this).getPort()

    override fun preferredAvailabilityZone(): String? = unwrap(this).getPreferredAvailabilityZone()

    override fun preferredAvailabilityZones(): List<String> =
        unwrap(this).getPreferredAvailabilityZones() ?: emptyList()

    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    override fun snapshotArns(): List<String> = unwrap(this).getSnapshotArns() ?: emptyList()

    override fun snapshotName(): String? = unwrap(this).getSnapshotName()

    override fun snapshotRetentionLimit(): Number? = unwrap(this).getSnapshotRetentionLimit()

    override fun snapshotWindow(): String? = unwrap(this).getSnapshotWindow()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun transitEncryptionEnabled(): Any? = unwrap(this).getTransitEncryptionEnabled()

    override fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCacheClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnCacheClusterProps):
        CfnCacheClusterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCacheClusterProps):
        software.amazon.awscdk.services.elasticache.CfnCacheClusterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticache.CfnCacheClusterProps
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnReplicationGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun atRestEncryptionEnabled(): Any? = unwrap(this).getAtRestEncryptionEnabled()

  public open fun atRestEncryptionEnabled(`value`: Boolean) {
    unwrap(this).setAtRestEncryptionEnabled(`value`)
  }

  public open fun atRestEncryptionEnabled(`value`: IResolvable) {
    unwrap(this).setAtRestEncryptionEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun attrConfigurationEndPointAddress(): String =
      unwrap(this).getAttrConfigurationEndPointAddress()

  public open fun attrConfigurationEndPointPort(): String =
      unwrap(this).getAttrConfigurationEndPointPort()

  public open fun attrPrimaryEndPointAddress(): String =
      unwrap(this).getAttrPrimaryEndPointAddress()

  public open fun attrPrimaryEndPointPort(): String = unwrap(this).getAttrPrimaryEndPointPort()

  public open fun attrReadEndPointAddresses(): String = unwrap(this).getAttrReadEndPointAddresses()

  public open fun attrReadEndPointAddressesList(): List<String> =
      unwrap(this).getAttrReadEndPointAddressesList()

  public open fun attrReadEndPointPorts(): String = unwrap(this).getAttrReadEndPointPorts()

  public open fun attrReadEndPointPortsList(): List<String> =
      unwrap(this).getAttrReadEndPointPortsList()

  public open fun attrReaderEndPointAddress(): String = unwrap(this).getAttrReaderEndPointAddress()

  public open fun attrReaderEndPointPort(): String = unwrap(this).getAttrReaderEndPointPort()

  public open fun authToken(): String? = unwrap(this).getAuthToken()

  public open fun authToken(`value`: String) {
    unwrap(this).setAuthToken(`value`)
  }

  public open fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  public open fun autoMinorVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`)
  }

  public open fun autoMinorVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`.let(IResolvable::unwrap))
  }

  public open fun automaticFailoverEnabled(): Any? = unwrap(this).getAutomaticFailoverEnabled()

  public open fun automaticFailoverEnabled(`value`: Boolean) {
    unwrap(this).setAutomaticFailoverEnabled(`value`)
  }

  public open fun automaticFailoverEnabled(`value`: IResolvable) {
    unwrap(this).setAutomaticFailoverEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun cacheNodeType(): String? = unwrap(this).getCacheNodeType()

  public open fun cacheNodeType(`value`: String) {
    unwrap(this).setCacheNodeType(`value`)
  }

  public open fun cacheParameterGroupName(): String? = unwrap(this).getCacheParameterGroupName()

  public open fun cacheParameterGroupName(`value`: String) {
    unwrap(this).setCacheParameterGroupName(`value`)
  }

  public open fun cacheSecurityGroupNames(): List<String> =
      unwrap(this).getCacheSecurityGroupNames() ?: emptyList()

  public open fun cacheSecurityGroupNames(`value`: List<String>) {
    unwrap(this).setCacheSecurityGroupNames(`value`)
  }

  public open fun cacheSecurityGroupNames(vararg `value`: String): Unit =
      cacheSecurityGroupNames(`value`.toList())

  public open fun cacheSubnetGroupName(): String? = unwrap(this).getCacheSubnetGroupName()

  public open fun cacheSubnetGroupName(`value`: String) {
    unwrap(this).setCacheSubnetGroupName(`value`)
  }

  public open fun clusterMode(): String? = unwrap(this).getClusterMode()

  public open fun clusterMode(`value`: String) {
    unwrap(this).setClusterMode(`value`)
  }

  public open fun dataTieringEnabled(): Any? = unwrap(this).getDataTieringEnabled()

  public open fun dataTieringEnabled(`value`: Boolean) {
    unwrap(this).setDataTieringEnabled(`value`)
  }

  public open fun dataTieringEnabled(`value`: IResolvable) {
    unwrap(this).setDataTieringEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun engine(): String? = unwrap(this).getEngine()

  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
  }

  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  public open fun globalReplicationGroupId(): String? = unwrap(this).getGlobalReplicationGroupId()

  public open fun globalReplicationGroupId(`value`: String) {
    unwrap(this).setGlobalReplicationGroupId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipDiscovery(): String? = unwrap(this).getIpDiscovery()

  public open fun ipDiscovery(`value`: String) {
    unwrap(this).setIpDiscovery(`value`)
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun logDeliveryConfigurations(): Any? = unwrap(this).getLogDeliveryConfigurations()

  public open fun logDeliveryConfigurations(`value`: IResolvable) {
    unwrap(this).setLogDeliveryConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun logDeliveryConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setLogDeliveryConfigurations(__idx_ac66f0)
  }

  public open fun logDeliveryConfigurations(vararg __idx_ac66f0: Any): Unit =
      logDeliveryConfigurations(__idx_ac66f0.toList())

  public open fun multiAzEnabled(): Any? = unwrap(this).getMultiAzEnabled()

  public open fun multiAzEnabled(`value`: Boolean) {
    unwrap(this).setMultiAzEnabled(`value`)
  }

  public open fun multiAzEnabled(`value`: IResolvable) {
    unwrap(this).setMultiAzEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun networkType(): String? = unwrap(this).getNetworkType()

  public open fun networkType(`value`: String) {
    unwrap(this).setNetworkType(`value`)
  }

  public open fun nodeGroupConfiguration(): Any? = unwrap(this).getNodeGroupConfiguration()

  public open fun nodeGroupConfiguration(`value`: IResolvable) {
    unwrap(this).setNodeGroupConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun nodeGroupConfiguration(__idx_ac66f0: List<Any>) {
    unwrap(this).setNodeGroupConfiguration(__idx_ac66f0)
  }

  public open fun nodeGroupConfiguration(vararg __idx_ac66f0: Any): Unit =
      nodeGroupConfiguration(__idx_ac66f0.toList())

  public open fun notificationTopicArn(): String? = unwrap(this).getNotificationTopicArn()

  public open fun notificationTopicArn(`value`: String) {
    unwrap(this).setNotificationTopicArn(`value`)
  }

  public open fun numCacheClusters(): Number? = unwrap(this).getNumCacheClusters()

  public open fun numCacheClusters(`value`: Number) {
    unwrap(this).setNumCacheClusters(`value`)
  }

  public open fun numNodeGroups(): Number? = unwrap(this).getNumNodeGroups()

  public open fun numNodeGroups(`value`: Number) {
    unwrap(this).setNumNodeGroups(`value`)
  }

  public open fun port(): Number? = unwrap(this).getPort()

  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
  }

  public open fun preferredCacheClusterAZs(): List<String> =
      unwrap(this).getPreferredCacheClusterAZs() ?: emptyList()

  public open fun preferredCacheClusterAZs(`value`: List<String>) {
    unwrap(this).setPreferredCacheClusterAZs(`value`)
  }

  public open fun preferredCacheClusterAZs(vararg `value`: String): Unit =
      preferredCacheClusterAZs(`value`.toList())

  public open fun preferredMaintenanceWindow(): String? =
      unwrap(this).getPreferredMaintenanceWindow()

  public open fun preferredMaintenanceWindow(`value`: String) {
    unwrap(this).setPreferredMaintenanceWindow(`value`)
  }

  public open fun primaryClusterId(): String? = unwrap(this).getPrimaryClusterId()

  public open fun primaryClusterId(`value`: String) {
    unwrap(this).setPrimaryClusterId(`value`)
  }

  public open fun replicasPerNodeGroup(): Number? = unwrap(this).getReplicasPerNodeGroup()

  public open fun replicasPerNodeGroup(`value`: Number) {
    unwrap(this).setReplicasPerNodeGroup(`value`)
  }

  public open fun replicationGroupDescription(): String =
      unwrap(this).getReplicationGroupDescription()

  public open fun replicationGroupDescription(`value`: String) {
    unwrap(this).setReplicationGroupDescription(`value`)
  }

  public open fun replicationGroupId(): String? = unwrap(this).getReplicationGroupId()

  public open fun replicationGroupId(`value`: String) {
    unwrap(this).setReplicationGroupId(`value`)
  }

  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  public open fun snapshotArns(): List<String> = unwrap(this).getSnapshotArns() ?: emptyList()

  public open fun snapshotArns(`value`: List<String>) {
    unwrap(this).setSnapshotArns(`value`)
  }

  public open fun snapshotArns(vararg `value`: String): Unit = snapshotArns(`value`.toList())

  public open fun snapshotName(): String? = unwrap(this).getSnapshotName()

  public open fun snapshotName(`value`: String) {
    unwrap(this).setSnapshotName(`value`)
  }

  public open fun snapshotRetentionLimit(): Number? = unwrap(this).getSnapshotRetentionLimit()

  public open fun snapshotRetentionLimit(`value`: Number) {
    unwrap(this).setSnapshotRetentionLimit(`value`)
  }

  public open fun snapshotWindow(): String? = unwrap(this).getSnapshotWindow()

  public open fun snapshotWindow(`value`: String) {
    unwrap(this).setSnapshotWindow(`value`)
  }

  public open fun snapshottingClusterId(): String? = unwrap(this).getSnapshottingClusterId()

  public open fun snapshottingClusterId(`value`: String) {
    unwrap(this).setSnapshottingClusterId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun transitEncryptionEnabled(): Any? = unwrap(this).getTransitEncryptionEnabled()

  public open fun transitEncryptionEnabled(`value`: Boolean) {
    unwrap(this).setTransitEncryptionEnabled(`value`)
  }

  public open fun transitEncryptionEnabled(`value`: IResolvable) {
    unwrap(this).setTransitEncryptionEnabled(`value`.let(IResolvable::unwrap))
  }

  public open fun transitEncryptionMode(): String? = unwrap(this).getTransitEncryptionMode()

  public open fun transitEncryptionMode(`value`: String) {
    unwrap(this).setTransitEncryptionMode(`value`)
  }

  public open fun userGroupIds(): List<String> = unwrap(this).getUserGroupIds() ?: emptyList()

  public open fun userGroupIds(`value`: List<String>) {
    unwrap(this).setUserGroupIds(`value`)
  }

  public open fun userGroupIds(vararg `value`: String): Unit = userGroupIds(`value`.toList())

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticache.CfnReplicationGroup.Builder
        = software.amazon.awscdk.services.elasticache.CfnReplicationGroup.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.elasticache.CfnReplicationGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReplicationGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReplicationGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroup):
        CfnReplicationGroup = CfnReplicationGroup(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationGroup):
        software.amazon.awscdk.services.elasticache.CfnReplicationGroup = wrapped.cdkObject
  }

  public interface KinesisFirehoseDestinationDetailsProperty {
    public fun deliveryStream(): String

    @CdkDslMarker
    public interface Builder {
      public fun deliveryStream(deliveryStream: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty.builder()

      override fun deliveryStream(deliveryStream: String) {
        cdkBuilder.deliveryStream(deliveryStream)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty,
    ) : CdkObject(cdkObject), KinesisFirehoseDestinationDetailsProperty {
      override fun deliveryStream(): String = unwrap(this).getDeliveryStream()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          KinesisFirehoseDestinationDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty):
          KinesisFirehoseDestinationDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisFirehoseDestinationDetailsProperty):
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty
    }
  }

  public interface LogDeliveryConfigurationRequestProperty {
    public fun destinationDetails(): Any

    public fun destinationType(): String

    public fun logFormat(): String

    public fun logType(): String

    @CdkDslMarker
    public interface Builder {
      public fun destinationDetails(destinationDetails: IResolvable)

      public fun destinationDetails(destinationDetails: DestinationDetailsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac403f668fc7e8e4373285dfb7c3f76cce364b31c49c3319d1b6d16e9fce7414")
      public
          fun destinationDetails(destinationDetails: DestinationDetailsProperty.Builder.() -> Unit)

      public fun destinationType(destinationType: String)

      public fun logFormat(logFormat: String)

      public fun logType(logType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.LogDeliveryConfigurationRequestProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.LogDeliveryConfigurationRequestProperty.builder()

      override fun destinationDetails(destinationDetails: IResolvable) {
        cdkBuilder.destinationDetails(destinationDetails.let(IResolvable::unwrap))
      }

      override fun destinationDetails(destinationDetails: DestinationDetailsProperty) {
        cdkBuilder.destinationDetails(destinationDetails.let(DestinationDetailsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac403f668fc7e8e4373285dfb7c3f76cce364b31c49c3319d1b6d16e9fce7414")
      override
          fun destinationDetails(destinationDetails: DestinationDetailsProperty.Builder.() -> Unit):
          Unit = destinationDetails(DestinationDetailsProperty(destinationDetails))

      override fun destinationType(destinationType: String) {
        cdkBuilder.destinationType(destinationType)
      }

      override fun logFormat(logFormat: String) {
        cdkBuilder.logFormat(logFormat)
      }

      override fun logType(logType: String) {
        cdkBuilder.logType(logType)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.LogDeliveryConfigurationRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.LogDeliveryConfigurationRequestProperty,
    ) : CdkObject(cdkObject), LogDeliveryConfigurationRequestProperty {
      override fun destinationDetails(): Any = unwrap(this).getDestinationDetails()

      override fun destinationType(): String = unwrap(this).getDestinationType()

      override fun logFormat(): String = unwrap(this).getLogFormat()

      override fun logType(): String = unwrap(this).getLogType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LogDeliveryConfigurationRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroup.LogDeliveryConfigurationRequestProperty):
          LogDeliveryConfigurationRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogDeliveryConfigurationRequestProperty):
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.LogDeliveryConfigurationRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.LogDeliveryConfigurationRequestProperty
    }
  }

  public interface NodeGroupConfigurationProperty {
    public fun nodeGroupId(): String? = unwrap(this).getNodeGroupId()

    public fun primaryAvailabilityZone(): String? = unwrap(this).getPrimaryAvailabilityZone()

    public fun replicaAvailabilityZones(): List<String> = unwrap(this).getReplicaAvailabilityZones()
        ?: emptyList()

    public fun replicaCount(): Number? = unwrap(this).getReplicaCount()

    public fun slots(): String? = unwrap(this).getSlots()

    @CdkDslMarker
    public interface Builder {
      public fun nodeGroupId(nodeGroupId: String)

      public fun primaryAvailabilityZone(primaryAvailabilityZone: String)

      public fun replicaAvailabilityZones(replicaAvailabilityZones: List<String>)

      public fun replicaAvailabilityZones(vararg replicaAvailabilityZones: String)

      public fun replicaCount(replicaCount: Number)

      public fun slots(slots: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty.builder()

      override fun nodeGroupId(nodeGroupId: String) {
        cdkBuilder.nodeGroupId(nodeGroupId)
      }

      override fun primaryAvailabilityZone(primaryAvailabilityZone: String) {
        cdkBuilder.primaryAvailabilityZone(primaryAvailabilityZone)
      }

      override fun replicaAvailabilityZones(replicaAvailabilityZones: List<String>) {
        cdkBuilder.replicaAvailabilityZones(replicaAvailabilityZones)
      }

      override fun replicaAvailabilityZones(vararg replicaAvailabilityZones: String): Unit =
          replicaAvailabilityZones(replicaAvailabilityZones.toList())

      override fun replicaCount(replicaCount: Number) {
        cdkBuilder.replicaCount(replicaCount)
      }

      override fun slots(slots: String) {
        cdkBuilder.slots(slots)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty,
    ) : CdkObject(cdkObject), NodeGroupConfigurationProperty {
      override fun nodeGroupId(): String? = unwrap(this).getNodeGroupId()

      override fun primaryAvailabilityZone(): String? = unwrap(this).getPrimaryAvailabilityZone()

      override fun replicaAvailabilityZones(): List<String> =
          unwrap(this).getReplicaAvailabilityZones() ?: emptyList()

      override fun replicaCount(): Number? = unwrap(this).getReplicaCount()

      override fun slots(): String? = unwrap(this).getSlots()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NodeGroupConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty):
          NodeGroupConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NodeGroupConfigurationProperty):
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty
    }
  }

  public interface CloudWatchLogsDestinationDetailsProperty {
    public fun logGroup(): String

    @CdkDslMarker
    public interface Builder {
      public fun logGroup(logGroup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty.builder()

      override fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty,
    ) : CdkObject(cdkObject), CloudWatchLogsDestinationDetailsProperty {
      override fun logGroup(): String = unwrap(this).getLogGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CloudWatchLogsDestinationDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty):
          CloudWatchLogsDestinationDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsDestinationDetailsProperty):
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty
    }
  }

  public interface DestinationDetailsProperty {
    public fun cloudWatchLogsDetails(): Any? = unwrap(this).getCloudWatchLogsDetails()

    public fun kinesisFirehoseDetails(): Any? = unwrap(this).getKinesisFirehoseDetails()

    @CdkDslMarker
    public interface Builder {
      public fun cloudWatchLogsDetails(cloudWatchLogsDetails: IResolvable)

      public
          fun cloudWatchLogsDetails(cloudWatchLogsDetails: CloudWatchLogsDestinationDetailsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c0fab66a7b11abd79b203e0c3dcd007cb3c43e229073b97666d0f57dd609f1a")
      public
          fun cloudWatchLogsDetails(cloudWatchLogsDetails: CloudWatchLogsDestinationDetailsProperty.Builder.() -> Unit)

      public fun kinesisFirehoseDetails(kinesisFirehoseDetails: IResolvable)

      public
          fun kinesisFirehoseDetails(kinesisFirehoseDetails: KinesisFirehoseDestinationDetailsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e9071715f9eb9442b214016e6a2cd9f3d2d209b1f152746058d8f7ab17ec8a4")
      public
          fun kinesisFirehoseDetails(kinesisFirehoseDetails: KinesisFirehoseDestinationDetailsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty.builder()

      override fun cloudWatchLogsDetails(cloudWatchLogsDetails: IResolvable) {
        cdkBuilder.cloudWatchLogsDetails(cloudWatchLogsDetails.let(IResolvable::unwrap))
      }

      override
          fun cloudWatchLogsDetails(cloudWatchLogsDetails: CloudWatchLogsDestinationDetailsProperty) {
        cdkBuilder.cloudWatchLogsDetails(cloudWatchLogsDetails.let(CloudWatchLogsDestinationDetailsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c0fab66a7b11abd79b203e0c3dcd007cb3c43e229073b97666d0f57dd609f1a")
      override
          fun cloudWatchLogsDetails(cloudWatchLogsDetails: CloudWatchLogsDestinationDetailsProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLogsDetails(CloudWatchLogsDestinationDetailsProperty(cloudWatchLogsDetails))

      override fun kinesisFirehoseDetails(kinesisFirehoseDetails: IResolvable) {
        cdkBuilder.kinesisFirehoseDetails(kinesisFirehoseDetails.let(IResolvable::unwrap))
      }

      override
          fun kinesisFirehoseDetails(kinesisFirehoseDetails: KinesisFirehoseDestinationDetailsProperty) {
        cdkBuilder.kinesisFirehoseDetails(kinesisFirehoseDetails.let(KinesisFirehoseDestinationDetailsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e9071715f9eb9442b214016e6a2cd9f3d2d209b1f152746058d8f7ab17ec8a4")
      override
          fun kinesisFirehoseDetails(kinesisFirehoseDetails: KinesisFirehoseDestinationDetailsProperty.Builder.() -> Unit):
          Unit =
          kinesisFirehoseDetails(KinesisFirehoseDestinationDetailsProperty(kinesisFirehoseDetails))

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty,
    ) : CdkObject(cdkObject), DestinationDetailsProperty {
      override fun cloudWatchLogsDetails(): Any? = unwrap(this).getCloudWatchLogsDetails()

      override fun kinesisFirehoseDetails(): Any? = unwrap(this).getKinesisFirehoseDetails()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty):
          DestinationDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationDetailsProperty):
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty
    }
  }
}

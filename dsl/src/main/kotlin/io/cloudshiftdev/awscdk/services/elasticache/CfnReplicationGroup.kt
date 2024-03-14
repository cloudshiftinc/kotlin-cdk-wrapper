package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnReplicationGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroup,
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
      unwrap(this).getAttrReadEndPointAddressesList() ?: emptyList()

  public open fun attrReadEndPointPorts(): String = unwrap(this).getAttrReadEndPointPorts()

  public open fun attrReadEndPointPortsList(): List<String> =
      unwrap(this).getAttrReadEndPointPortsList() ?: emptyList()

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

  public open fun snapshotArns(): List<String> = unwrap(this).getSnapshotArns() ?: emptyList()

  public open fun snapshotArns(`value`: List<String>) {
    unwrap(this).setSnapshotArns(`value`)
  }

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

  public interface Builder {
    public fun atRestEncryptionEnabled(atRestEncryptionEnabled: Boolean) {
    }

    public fun atRestEncryptionEnabled(atRestEncryptionEnabled: IResolvable) {
    }

    public fun authToken(authToken: String) {
    }

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
    }

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
    }

    public fun automaticFailoverEnabled(automaticFailoverEnabled: Boolean) {
    }

    public fun automaticFailoverEnabled(automaticFailoverEnabled: IResolvable) {
    }

    public fun cacheNodeType(cacheNodeType: String) {
    }

    public fun cacheParameterGroupName(cacheParameterGroupName: String) {
    }

    public fun cacheSecurityGroupNames(cacheSecurityGroupNames: List<String>) {
    }

    public fun cacheSubnetGroupName(cacheSubnetGroupName: String) {
    }

    public fun clusterMode(clusterMode: String) {
    }

    public fun dataTieringEnabled(dataTieringEnabled: Boolean) {
    }

    public fun dataTieringEnabled(dataTieringEnabled: IResolvable) {
    }

    public fun engine(engine: String) {
    }

    public fun engineVersion(engineVersion: String) {
    }

    public fun globalReplicationGroupId(globalReplicationGroupId: String) {
    }

    public fun ipDiscovery(ipDiscovery: String) {
    }

    public fun kmsKeyId(kmsKeyId: String) {
    }

    public fun logDeliveryConfigurations(logDeliveryConfigurations: IResolvable) {
    }

    public fun logDeliveryConfigurations(logDeliveryConfigurations: List<Any>) {
    }

    public fun multiAzEnabled(multiAzEnabled: Boolean) {
    }

    public fun multiAzEnabled(multiAzEnabled: IResolvable) {
    }

    public fun networkType(networkType: String) {
    }

    public fun nodeGroupConfiguration(nodeGroupConfiguration: IResolvable) {
    }

    public fun nodeGroupConfiguration(nodeGroupConfiguration: List<Any>) {
    }

    public fun notificationTopicArn(notificationTopicArn: String) {
    }

    public fun numCacheClusters(numCacheClusters: Number) {
    }

    public fun numNodeGroups(numNodeGroups: Number) {
    }

    public fun port(port: Number) {
    }

    public fun preferredCacheClusterAZs(preferredCacheClusterAZs: List<String>) {
    }

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    }

    public fun primaryClusterId(primaryClusterId: String) {
    }

    public fun replicasPerNodeGroup(replicasPerNodeGroup: Number) {
    }

    public fun replicationGroupDescription(replicationGroupDescription: String) {
    }

    public fun replicationGroupId(replicationGroupId: String) {
    }

    public fun securityGroupIds(securityGroupIds: List<String>) {
    }

    public fun snapshotArns(snapshotArns: List<String>) {
    }

    public fun snapshotName(snapshotName: String) {
    }

    public fun snapshotRetentionLimit(snapshotRetentionLimit: Number) {
    }

    public fun snapshotWindow(snapshotWindow: String) {
    }

    public fun snapshottingClusterId(snapshottingClusterId: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean) {
    }

    public fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable) {
    }

    public fun transitEncryptionMode(transitEncryptionMode: String) {
    }

    public fun userGroupIds(userGroupIds: List<String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticache.CfnReplicationGroup.Builder
        = software.amazon.awscdk.services.elasticache.CfnReplicationGroup.Builder.create(scope, id)

    public override fun atRestEncryptionEnabled(atRestEncryptionEnabled: Boolean) {
      cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled)
    }

    public override fun atRestEncryptionEnabled(atRestEncryptionEnabled: IResolvable) {
      cdkBuilder.atRestEncryptionEnabled(atRestEncryptionEnabled.let(IResolvable::unwrap))
    }

    public override fun authToken(authToken: String) {
      cdkBuilder.authToken(authToken)
    }

    public override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    public override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    public override fun automaticFailoverEnabled(automaticFailoverEnabled: Boolean) {
      cdkBuilder.automaticFailoverEnabled(automaticFailoverEnabled)
    }

    public override fun automaticFailoverEnabled(automaticFailoverEnabled: IResolvable) {
      cdkBuilder.automaticFailoverEnabled(automaticFailoverEnabled.let(IResolvable::unwrap))
    }

    public override fun cacheNodeType(cacheNodeType: String) {
      cdkBuilder.cacheNodeType(cacheNodeType)
    }

    public override fun cacheParameterGroupName(cacheParameterGroupName: String) {
      cdkBuilder.cacheParameterGroupName(cacheParameterGroupName)
    }

    public override fun cacheSecurityGroupNames(cacheSecurityGroupNames: List<String>) {
      cdkBuilder.cacheSecurityGroupNames(cacheSecurityGroupNames)
    }

    public override fun cacheSubnetGroupName(cacheSubnetGroupName: String) {
      cdkBuilder.cacheSubnetGroupName(cacheSubnetGroupName)
    }

    public override fun clusterMode(clusterMode: String) {
      cdkBuilder.clusterMode(clusterMode)
    }

    public override fun dataTieringEnabled(dataTieringEnabled: Boolean) {
      cdkBuilder.dataTieringEnabled(dataTieringEnabled)
    }

    public override fun dataTieringEnabled(dataTieringEnabled: IResolvable) {
      cdkBuilder.dataTieringEnabled(dataTieringEnabled.let(IResolvable::unwrap))
    }

    public override fun engine(engine: String) {
      cdkBuilder.engine(engine)
    }

    public override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    public override fun globalReplicationGroupId(globalReplicationGroupId: String) {
      cdkBuilder.globalReplicationGroupId(globalReplicationGroupId)
    }

    public override fun ipDiscovery(ipDiscovery: String) {
      cdkBuilder.ipDiscovery(ipDiscovery)
    }

    public override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    public override fun logDeliveryConfigurations(logDeliveryConfigurations: IResolvable) {
      cdkBuilder.logDeliveryConfigurations(logDeliveryConfigurations.let(IResolvable::unwrap))
    }

    public override fun logDeliveryConfigurations(logDeliveryConfigurations: List<Any>) {
      cdkBuilder.logDeliveryConfigurations(logDeliveryConfigurations)
    }

    public override fun multiAzEnabled(multiAzEnabled: Boolean) {
      cdkBuilder.multiAzEnabled(multiAzEnabled)
    }

    public override fun multiAzEnabled(multiAzEnabled: IResolvable) {
      cdkBuilder.multiAzEnabled(multiAzEnabled.let(IResolvable::unwrap))
    }

    public override fun networkType(networkType: String) {
      cdkBuilder.networkType(networkType)
    }

    public override fun nodeGroupConfiguration(nodeGroupConfiguration: IResolvable) {
      cdkBuilder.nodeGroupConfiguration(nodeGroupConfiguration.let(IResolvable::unwrap))
    }

    public override fun nodeGroupConfiguration(nodeGroupConfiguration: List<Any>) {
      cdkBuilder.nodeGroupConfiguration(nodeGroupConfiguration)
    }

    public override fun notificationTopicArn(notificationTopicArn: String) {
      cdkBuilder.notificationTopicArn(notificationTopicArn)
    }

    public override fun numCacheClusters(numCacheClusters: Number) {
      cdkBuilder.numCacheClusters(numCacheClusters)
    }

    public override fun numNodeGroups(numNodeGroups: Number) {
      cdkBuilder.numNodeGroups(numNodeGroups)
    }

    public override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public override fun preferredCacheClusterAZs(preferredCacheClusterAZs: List<String>) {
      cdkBuilder.preferredCacheClusterAZs(preferredCacheClusterAZs)
    }

    public override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    public override fun primaryClusterId(primaryClusterId: String) {
      cdkBuilder.primaryClusterId(primaryClusterId)
    }

    public override fun replicasPerNodeGroup(replicasPerNodeGroup: Number) {
      cdkBuilder.replicasPerNodeGroup(replicasPerNodeGroup)
    }

    public override fun replicationGroupDescription(replicationGroupDescription: String) {
      cdkBuilder.replicationGroupDescription(replicationGroupDescription)
    }

    public override fun replicationGroupId(replicationGroupId: String) {
      cdkBuilder.replicationGroupId(replicationGroupId)
    }

    public override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    public override fun snapshotArns(snapshotArns: List<String>) {
      cdkBuilder.snapshotArns(snapshotArns)
    }

    public override fun snapshotName(snapshotName: String) {
      cdkBuilder.snapshotName(snapshotName)
    }

    public override fun snapshotRetentionLimit(snapshotRetentionLimit: Number) {
      cdkBuilder.snapshotRetentionLimit(snapshotRetentionLimit)
    }

    public override fun snapshotWindow(snapshotWindow: String) {
      cdkBuilder.snapshotWindow(snapshotWindow)
    }

    public override fun snapshottingClusterId(snapshottingClusterId: String) {
      cdkBuilder.snapshottingClusterId(snapshottingClusterId)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean) {
      cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled)
    }

    public override fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable) {
      cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled.let(IResolvable::unwrap))
    }

    public override fun transitEncryptionMode(transitEncryptionMode: String) {
      cdkBuilder.transitEncryptionMode(transitEncryptionMode)
    }

    public override fun userGroupIds(userGroupIds: List<String>) {
      cdkBuilder.userGroupIds(userGroupIds)
    }

    public fun build(): software.amazon.awscdk.services.elasticache.CfnReplicationGroup =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

    public interface Builder {
      public fun deliveryStream(deliveryStream: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty.builder()

      public override fun deliveryStream(deliveryStream: String) {
        cdkBuilder.deliveryStream(deliveryStream)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.KinesisFirehoseDestinationDetailsProperty,
    ) : KinesisFirehoseDestinationDetailsProperty {
      public override fun deliveryStream(): String = unwrap(this).getDeliveryStream()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface LogDeliveryConfigurationRequestProperty {
    public fun destinationDetails(): Any

    public fun destinationType(): String

    public fun logFormat(): String

    public fun logType(): String

    public interface Builder {
      public fun destinationDetails(destinationDetails: IResolvable) {
      }

      public fun destinationDetails(destinationDetails: DestinationDetailsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac403f668fc7e8e4373285dfb7c3f76cce364b31c49c3319d1b6d16e9fce7414")
      public
          fun destinationDetails(destinationDetails: DestinationDetailsProperty.Builder.() -> Unit) {
      }

      public fun destinationType(destinationType: String) {
      }

      public fun logFormat(logFormat: String) {
      }

      public fun logType(logType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.LogDeliveryConfigurationRequestProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.LogDeliveryConfigurationRequestProperty.builder()

      public override fun destinationDetails(destinationDetails: IResolvable) {
        cdkBuilder.destinationDetails(destinationDetails.let(IResolvable::unwrap))
      }

      public override fun destinationDetails(destinationDetails: DestinationDetailsProperty) {
        cdkBuilder.destinationDetails(destinationDetails.let(DestinationDetailsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ac403f668fc7e8e4373285dfb7c3f76cce364b31c49c3319d1b6d16e9fce7414")
      public override
          fun destinationDetails(destinationDetails: DestinationDetailsProperty.Builder.() -> Unit):
          Unit = destinationDetails(DestinationDetailsProperty(destinationDetails))

      public override fun destinationType(destinationType: String) {
        cdkBuilder.destinationType(destinationType)
      }

      public override fun logFormat(logFormat: String) {
        cdkBuilder.logFormat(logFormat)
      }

      public override fun logType(logType: String) {
        cdkBuilder.logType(logType)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.LogDeliveryConfigurationRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.LogDeliveryConfigurationRequestProperty,
    ) : LogDeliveryConfigurationRequestProperty {
      public override fun destinationDetails(): Any = unwrap(this).getDestinationDetails()

      public override fun destinationType(): String = unwrap(this).getDestinationType()

      public override fun logFormat(): String = unwrap(this).getLogFormat()

      public override fun logType(): String = unwrap(this).getLogType()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface NodeGroupConfigurationProperty {
    public fun nodeGroupId(): String? = unwrap(this).getNodeGroupId()

    public fun primaryAvailabilityZone(): String? = unwrap(this).getPrimaryAvailabilityZone()

    public fun replicaAvailabilityZones(): List<String> = unwrap(this).getReplicaAvailabilityZones()
        ?: emptyList()

    public fun replicaCount(): Number? = unwrap(this).getReplicaCount()

    public fun slots(): String? = unwrap(this).getSlots()

    public interface Builder {
      public fun nodeGroupId(nodeGroupId: String) {
      }

      public fun primaryAvailabilityZone(primaryAvailabilityZone: String) {
      }

      public fun replicaAvailabilityZones(replicaAvailabilityZones: List<String>) {
      }

      public fun replicaCount(replicaCount: Number) {
      }

      public fun slots(slots: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty.builder()

      public override fun nodeGroupId(nodeGroupId: String) {
        cdkBuilder.nodeGroupId(nodeGroupId)
      }

      public override fun primaryAvailabilityZone(primaryAvailabilityZone: String) {
        cdkBuilder.primaryAvailabilityZone(primaryAvailabilityZone)
      }

      public override fun replicaAvailabilityZones(replicaAvailabilityZones: List<String>) {
        cdkBuilder.replicaAvailabilityZones(replicaAvailabilityZones)
      }

      public override fun replicaCount(replicaCount: Number) {
        cdkBuilder.replicaCount(replicaCount)
      }

      public override fun slots(slots: String) {
        cdkBuilder.slots(slots)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty,
    ) : NodeGroupConfigurationProperty {
      public override fun nodeGroupId(): String? = unwrap(this).getNodeGroupId()

      public override fun primaryAvailabilityZone(): String? =
          unwrap(this).getPrimaryAvailabilityZone()

      public override fun replicaAvailabilityZones(): List<String> =
          unwrap(this).getReplicaAvailabilityZones() ?: emptyList()

      public override fun replicaCount(): Number? = unwrap(this).getReplicaCount()

      public override fun slots(): String? = unwrap(this).getSlots()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NodeGroupConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty):
          NodeGroupConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NodeGroupConfigurationProperty):
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.NodeGroupConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CloudWatchLogsDestinationDetailsProperty {
    public fun logGroup(): String

    public interface Builder {
      public fun logGroup(logGroup: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty.builder()

      public override fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.CloudWatchLogsDestinationDetailsProperty,
    ) : CloudWatchLogsDestinationDetailsProperty {
      public override fun logGroup(): String = unwrap(this).getLogGroup()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DestinationDetailsProperty {
    public fun cloudWatchLogsDetails(): Any? = unwrap(this).getCloudWatchLogsDetails()

    public fun kinesisFirehoseDetails(): Any? = unwrap(this).getKinesisFirehoseDetails()

    public interface Builder {
      public fun cloudWatchLogsDetails(cloudWatchLogsDetails: IResolvable) {
      }

      public
          fun cloudWatchLogsDetails(cloudWatchLogsDetails: CloudWatchLogsDestinationDetailsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c0fab66a7b11abd79b203e0c3dcd007cb3c43e229073b97666d0f57dd609f1a")
      public
          fun cloudWatchLogsDetails(cloudWatchLogsDetails: CloudWatchLogsDestinationDetailsProperty.Builder.() -> Unit) {
      }

      public fun kinesisFirehoseDetails(kinesisFirehoseDetails: IResolvable) {
      }

      public
          fun kinesisFirehoseDetails(kinesisFirehoseDetails: KinesisFirehoseDestinationDetailsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e9071715f9eb9442b214016e6a2cd9f3d2d209b1f152746058d8f7ab17ec8a4")
      public
          fun kinesisFirehoseDetails(kinesisFirehoseDetails: KinesisFirehoseDestinationDetailsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty.builder()

      public override fun cloudWatchLogsDetails(cloudWatchLogsDetails: IResolvable) {
        cdkBuilder.cloudWatchLogsDetails(cloudWatchLogsDetails.let(IResolvable::unwrap))
      }

      public override
          fun cloudWatchLogsDetails(cloudWatchLogsDetails: CloudWatchLogsDestinationDetailsProperty) {
        cdkBuilder.cloudWatchLogsDetails(cloudWatchLogsDetails.let(CloudWatchLogsDestinationDetailsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2c0fab66a7b11abd79b203e0c3dcd007cb3c43e229073b97666d0f57dd609f1a")
      public override
          fun cloudWatchLogsDetails(cloudWatchLogsDetails: CloudWatchLogsDestinationDetailsProperty.Builder.() -> Unit):
          Unit =
          cloudWatchLogsDetails(CloudWatchLogsDestinationDetailsProperty(cloudWatchLogsDetails))

      public override fun kinesisFirehoseDetails(kinesisFirehoseDetails: IResolvable) {
        cdkBuilder.kinesisFirehoseDetails(kinesisFirehoseDetails.let(IResolvable::unwrap))
      }

      public override
          fun kinesisFirehoseDetails(kinesisFirehoseDetails: KinesisFirehoseDestinationDetailsProperty) {
        cdkBuilder.kinesisFirehoseDetails(kinesisFirehoseDetails.let(KinesisFirehoseDestinationDetailsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e9071715f9eb9442b214016e6a2cd9f3d2d209b1f152746058d8f7ab17ec8a4")
      public override
          fun kinesisFirehoseDetails(kinesisFirehoseDetails: KinesisFirehoseDestinationDetailsProperty.Builder.() -> Unit):
          Unit =
          kinesisFirehoseDetails(KinesisFirehoseDestinationDetailsProperty(kinesisFirehoseDetails))

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty,
    ) : DestinationDetailsProperty {
      public override fun cloudWatchLogsDetails(): Any? = unwrap(this).getCloudWatchLogsDetails()

      public override fun kinesisFirehoseDetails(): Any? = unwrap(this).getKinesisFirehoseDetails()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty):
          DestinationDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationDetailsProperty):
          software.amazon.awscdk.services.elasticache.CfnReplicationGroup.DestinationDetailsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}

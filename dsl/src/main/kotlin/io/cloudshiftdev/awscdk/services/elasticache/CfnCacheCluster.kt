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

public open class CfnCacheCluster internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticache.CfnCacheCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrConfigurationEndpointAddress(): String =
      unwrap(this).getAttrConfigurationEndpointAddress()

  public open fun attrConfigurationEndpointPort(): String =
      unwrap(this).getAttrConfigurationEndpointPort()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrRedisEndpointAddress(): String = unwrap(this).getAttrRedisEndpointAddress()

  public open fun attrRedisEndpointPort(): String = unwrap(this).getAttrRedisEndpointPort()

  public open fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  public open fun autoMinorVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`)
  }

  public open fun autoMinorVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`.let(IResolvable::unwrap))
  }

  public open fun azMode(): String? = unwrap(this).getAzMode()

  public open fun azMode(`value`: String) {
    unwrap(this).setAzMode(`value`)
  }

  public open fun cacheNodeType(): String = unwrap(this).getCacheNodeType()

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

  public open fun clusterName(): String? = unwrap(this).getClusterName()

  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  public open fun engine(): String = unwrap(this).getEngine()

  public open fun engine(`value`: String) {
    unwrap(this).setEngine(`value`)
  }

  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun ipDiscovery(): String? = unwrap(this).getIpDiscovery()

  public open fun ipDiscovery(`value`: String) {
    unwrap(this).setIpDiscovery(`value`)
  }

  public open fun logDeliveryConfigurations(): Any? = unwrap(this).getLogDeliveryConfigurations()

  public open fun logDeliveryConfigurations(`value`: IResolvable) {
    unwrap(this).setLogDeliveryConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun logDeliveryConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setLogDeliveryConfigurations(__idx_ac66f0)
  }

  public open fun networkType(): String? = unwrap(this).getNetworkType()

  public open fun networkType(`value`: String) {
    unwrap(this).setNetworkType(`value`)
  }

  public open fun notificationTopicArn(): String? = unwrap(this).getNotificationTopicArn()

  public open fun notificationTopicArn(`value`: String) {
    unwrap(this).setNotificationTopicArn(`value`)
  }

  public open fun numCacheNodes(): Number = unwrap(this).getNumCacheNodes()

  public open fun numCacheNodes(`value`: Number) {
    unwrap(this).setNumCacheNodes(`value`)
  }

  public open fun port(): Number? = unwrap(this).getPort()

  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
  }

  public open fun preferredAvailabilityZone(): String? = unwrap(this).getPreferredAvailabilityZone()

  public open fun preferredAvailabilityZone(`value`: String) {
    unwrap(this).setPreferredAvailabilityZone(`value`)
  }

  public open fun preferredAvailabilityZones(): List<String> =
      unwrap(this).getPreferredAvailabilityZones() ?: emptyList()

  public open fun preferredAvailabilityZones(`value`: List<String>) {
    unwrap(this).setPreferredAvailabilityZones(`value`)
  }

  public open fun preferredMaintenanceWindow(): String? =
      unwrap(this).getPreferredMaintenanceWindow()

  public open fun preferredMaintenanceWindow(`value`: String) {
    unwrap(this).setPreferredMaintenanceWindow(`value`)
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

  public open fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
      emptyList()

  public open fun vpcSecurityGroupIds(`value`: List<String>) {
    unwrap(this).setVpcSecurityGroupIds(`value`)
  }

  public interface Builder {
    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    public fun azMode(azMode: String)

    public fun cacheNodeType(cacheNodeType: String)

    public fun cacheParameterGroupName(cacheParameterGroupName: String)

    public fun cacheSecurityGroupNames(cacheSecurityGroupNames: List<String>)

    public fun cacheSubnetGroupName(cacheSubnetGroupName: String)

    public fun clusterName(clusterName: String)

    public fun engine(engine: String)

    public fun engineVersion(engineVersion: String)

    public fun ipDiscovery(ipDiscovery: String)

    public fun logDeliveryConfigurations(logDeliveryConfigurations: IResolvable)

    public fun logDeliveryConfigurations(logDeliveryConfigurations: List<Any>)

    public fun networkType(networkType: String)

    public fun notificationTopicArn(notificationTopicArn: String)

    public fun numCacheNodes(numCacheNodes: Number)

    public fun port(port: Number)

    public fun preferredAvailabilityZone(preferredAvailabilityZone: String)

    public fun preferredAvailabilityZones(preferredAvailabilityZones: List<String>)

    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    public fun snapshotArns(snapshotArns: List<String>)

    public fun snapshotName(snapshotName: String)

    public fun snapshotRetentionLimit(snapshotRetentionLimit: Number)

    public fun snapshotWindow(snapshotWindow: String)

    public fun tags(tags: List<CfnTag>)

    public fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean)

    public fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable)

    public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.elasticache.CfnCacheCluster.Builder =
        software.amazon.awscdk.services.elasticache.CfnCacheCluster.Builder.create(scope, id)

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

    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    override fun snapshotArns(snapshotArns: List<String>) {
      cdkBuilder.snapshotArns(snapshotArns)
    }

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

    override fun transitEncryptionEnabled(transitEncryptionEnabled: Boolean) {
      cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled)
    }

    override fun transitEncryptionEnabled(transitEncryptionEnabled: IResolvable) {
      cdkBuilder.transitEncryptionEnabled(transitEncryptionEnabled.let(IResolvable::unwrap))
    }

    override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
      cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
    }

    public fun build(): software.amazon.awscdk.services.elasticache.CfnCacheCluster =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCacheCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCacheCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnCacheCluster):
        CfnCacheCluster = CfnCacheCluster(cdkObject)

    internal fun unwrap(wrapped: CfnCacheCluster):
        software.amazon.awscdk.services.elasticache.CfnCacheCluster = wrapped.cdkObject
  }

  public interface LogDeliveryConfigurationRequestProperty {
    public fun destinationDetails(): Any

    public fun destinationType(): String

    public fun logFormat(): String

    public fun logType(): String

    public interface Builder {
      public fun destinationDetails(destinationDetails: IResolvable)

      public fun destinationDetails(destinationDetails: DestinationDetailsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2e44261fa165e257bb303fce9896fc508c3a435e77b44009681d09f1efef725b")
      public
          fun destinationDetails(destinationDetails: DestinationDetailsProperty.Builder.() -> Unit)

      public fun destinationType(destinationType: String)

      public fun logFormat(logFormat: String)

      public fun logType(logType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.LogDeliveryConfigurationRequestProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.LogDeliveryConfigurationRequestProperty.builder()

      override fun destinationDetails(destinationDetails: IResolvable) {
        cdkBuilder.destinationDetails(destinationDetails.let(IResolvable::unwrap))
      }

      override fun destinationDetails(destinationDetails: DestinationDetailsProperty) {
        cdkBuilder.destinationDetails(destinationDetails.let(DestinationDetailsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2e44261fa165e257bb303fce9896fc508c3a435e77b44009681d09f1efef725b")
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
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.LogDeliveryConfigurationRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.LogDeliveryConfigurationRequestProperty,
    ) : LogDeliveryConfigurationRequestProperty {
      override fun destinationDetails(): Any = unwrap(this).getDestinationDetails()

      override fun destinationType(): String = unwrap(this).getDestinationType()

      override fun logFormat(): String = unwrap(this).getLogFormat()

      override fun logType(): String = unwrap(this).getLogType()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnCacheCluster.LogDeliveryConfigurationRequestProperty):
          LogDeliveryConfigurationRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogDeliveryConfigurationRequestProperty):
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.LogDeliveryConfigurationRequestProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface KinesisFirehoseDestinationDetailsProperty {
    public fun deliveryStream(): String

    public interface Builder {
      public fun deliveryStream(deliveryStream: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty.builder()

      override fun deliveryStream(deliveryStream: String) {
        cdkBuilder.deliveryStream(deliveryStream)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty,
    ) : KinesisFirehoseDestinationDetailsProperty {
      override fun deliveryStream(): String = unwrap(this).getDeliveryStream()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty):
          KinesisFirehoseDestinationDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KinesisFirehoseDestinationDetailsProperty):
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.KinesisFirehoseDestinationDetailsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface CloudWatchLogsDestinationDetailsProperty {
    public fun logGroup(): String

    public interface Builder {
      public fun logGroup(logGroup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty.builder()

      override fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty,
    ) : CloudWatchLogsDestinationDetailsProperty {
      override fun logGroup(): String = unwrap(this).getLogGroup()
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
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty):
          CloudWatchLogsDestinationDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CloudWatchLogsDestinationDetailsProperty):
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.CloudWatchLogsDestinationDetailsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DestinationDetailsProperty {
    public fun cloudWatchLogsDetails(): Any? = unwrap(this).getCloudWatchLogsDetails()

    public fun kinesisFirehoseDetails(): Any? = unwrap(this).getKinesisFirehoseDetails()

    public interface Builder {
      public fun cloudWatchLogsDetails(cloudWatchLogsDetails: IResolvable)

      public
          fun cloudWatchLogsDetails(cloudWatchLogsDetails: CloudWatchLogsDestinationDetailsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1f88bd5e3396556e7095ec41d5b9595bb216092508a08a2e27fe30e13e1b061")
      public
          fun cloudWatchLogsDetails(cloudWatchLogsDetails: CloudWatchLogsDestinationDetailsProperty.Builder.() -> Unit)

      public fun kinesisFirehoseDetails(kinesisFirehoseDetails: IResolvable)

      public
          fun kinesisFirehoseDetails(kinesisFirehoseDetails: KinesisFirehoseDestinationDetailsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e40b60a3f98ef9f2133846abea7bbfa7d345958b8dc9667f62706d40859df30c")
      public
          fun kinesisFirehoseDetails(kinesisFirehoseDetails: KinesisFirehoseDestinationDetailsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.DestinationDetailsProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.DestinationDetailsProperty.builder()

      override fun cloudWatchLogsDetails(cloudWatchLogsDetails: IResolvable) {
        cdkBuilder.cloudWatchLogsDetails(cloudWatchLogsDetails.let(IResolvable::unwrap))
      }

      override
          fun cloudWatchLogsDetails(cloudWatchLogsDetails: CloudWatchLogsDestinationDetailsProperty) {
        cdkBuilder.cloudWatchLogsDetails(cloudWatchLogsDetails.let(CloudWatchLogsDestinationDetailsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1f88bd5e3396556e7095ec41d5b9595bb216092508a08a2e27fe30e13e1b061")
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

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e40b60a3f98ef9f2133846abea7bbfa7d345958b8dc9667f62706d40859df30c")
      override
          fun kinesisFirehoseDetails(kinesisFirehoseDetails: KinesisFirehoseDestinationDetailsProperty.Builder.() -> Unit):
          Unit =
          kinesisFirehoseDetails(KinesisFirehoseDestinationDetailsProperty(kinesisFirehoseDetails))

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.DestinationDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.DestinationDetailsProperty,
    ) : DestinationDetailsProperty {
      override fun cloudWatchLogsDetails(): Any? = unwrap(this).getCloudWatchLogsDetails()

      override fun kinesisFirehoseDetails(): Any? = unwrap(this).getKinesisFirehoseDetails()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnCacheCluster.DestinationDetailsProperty):
          DestinationDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationDetailsProperty):
          software.amazon.awscdk.services.elasticache.CfnCacheCluster.DestinationDetailsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}

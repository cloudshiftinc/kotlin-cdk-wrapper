package io.cloudshiftdev.awscdk.services.memorydb

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

public open class CfnCluster internal constructor(
  private val cdkObject: software.amazon.awscdk.services.memorydb.CfnCluster,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun aclName(): String = unwrap(this).getAclName()

  public open fun aclName(`value`: String) {
    unwrap(this).setAclName(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrClusterEndpointAddress(): String =
      unwrap(this).getAttrClusterEndpointAddress()

  public open fun attrClusterEndpointPort(): Number = unwrap(this).getAttrClusterEndpointPort()

  public open fun attrParameterGroupStatus(): String = unwrap(this).getAttrParameterGroupStatus()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun autoMinorVersionUpgrade(): Any? = unwrap(this).getAutoMinorVersionUpgrade()

  public open fun autoMinorVersionUpgrade(`value`: Boolean) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`)
  }

  public open fun autoMinorVersionUpgrade(`value`: IResolvable) {
    unwrap(this).setAutoMinorVersionUpgrade(`value`.let(IResolvable::unwrap))
  }

  public open fun clusterEndpoint(): Any? = unwrap(this).getClusterEndpoint()

  public open fun clusterEndpoint(`value`: IResolvable) {
    unwrap(this).setClusterEndpoint(`value`.let(IResolvable::unwrap))
  }

  public open fun clusterEndpoint(`value`: EndpointProperty) {
    unwrap(this).setClusterEndpoint(`value`.let(EndpointProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d5527ac11fdc97153b5833ed5809a545cff10896ee706a0318cb3e803348749a")
  public open fun clusterEndpoint(`value`: EndpointProperty.Builder.() -> Unit): Unit =
      clusterEndpoint(EndpointProperty(`value`))

  public open fun clusterName(): String = unwrap(this).getClusterName()

  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  public open fun dataTiering(): String? = unwrap(this).getDataTiering()

  public open fun dataTiering(`value`: String) {
    unwrap(this).setDataTiering(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  public open fun finalSnapshotName(): String? = unwrap(this).getFinalSnapshotName()

  public open fun finalSnapshotName(`value`: String) {
    unwrap(this).setFinalSnapshotName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  public open fun maintenanceWindow(): String? = unwrap(this).getMaintenanceWindow()

  public open fun maintenanceWindow(`value`: String) {
    unwrap(this).setMaintenanceWindow(`value`)
  }

  public open fun nodeType(): String = unwrap(this).getNodeType()

  public open fun nodeType(`value`: String) {
    unwrap(this).setNodeType(`value`)
  }

  public open fun numReplicasPerShard(): Number? = unwrap(this).getNumReplicasPerShard()

  public open fun numReplicasPerShard(`value`: Number) {
    unwrap(this).setNumReplicasPerShard(`value`)
  }

  public open fun numShards(): Number? = unwrap(this).getNumShards()

  public open fun numShards(`value`: Number) {
    unwrap(this).setNumShards(`value`)
  }

  public open fun parameterGroupName(): String? = unwrap(this).getParameterGroupName()

  public open fun parameterGroupName(`value`: String) {
    unwrap(this).setParameterGroupName(`value`)
  }

  public open fun port(): Number? = unwrap(this).getPort()

  public open fun port(`value`: Number) {
    unwrap(this).setPort(`value`)
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

  public open fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

  public open fun snsTopicArn(`value`: String) {
    unwrap(this).setSnsTopicArn(`value`)
  }

  public open fun snsTopicStatus(): String? = unwrap(this).getSnsTopicStatus()

  public open fun snsTopicStatus(`value`: String) {
    unwrap(this).setSnsTopicStatus(`value`)
  }

  public open fun subnetGroupName(): String? = unwrap(this).getSubnetGroupName()

  public open fun subnetGroupName(`value`: String) {
    unwrap(this).setSubnetGroupName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun tlsEnabled(): Any? = unwrap(this).getTlsEnabled()

  public open fun tlsEnabled(`value`: Boolean) {
    unwrap(this).setTlsEnabled(`value`)
  }

  public open fun tlsEnabled(`value`: IResolvable) {
    unwrap(this).setTlsEnabled(`value`.let(IResolvable::unwrap))
  }

  public interface Builder {
    public fun aclName(aclName: String)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean)

    public fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable)

    public fun clusterEndpoint(clusterEndpoint: IResolvable)

    public fun clusterEndpoint(clusterEndpoint: EndpointProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d33203bee7e089e4fbdd81588dfcceea6441e02214de6749a98f01dd1955f8d")
    public fun clusterEndpoint(clusterEndpoint: EndpointProperty.Builder.() -> Unit)

    public fun clusterName(clusterName: String)

    public fun dataTiering(dataTiering: String)

    public fun description(description: String)

    public fun engineVersion(engineVersion: String)

    public fun finalSnapshotName(finalSnapshotName: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun maintenanceWindow(maintenanceWindow: String)

    public fun nodeType(nodeType: String)

    public fun numReplicasPerShard(numReplicasPerShard: Number)

    public fun numShards(numShards: Number)

    public fun parameterGroupName(parameterGroupName: String)

    public fun port(port: Number)

    public fun securityGroupIds(securityGroupIds: List<String>)

    public fun securityGroupIds(vararg securityGroupIds: String)

    public fun snapshotArns(snapshotArns: List<String>)

    public fun snapshotArns(vararg snapshotArns: String)

    public fun snapshotName(snapshotName: String)

    public fun snapshotRetentionLimit(snapshotRetentionLimit: Number)

    public fun snapshotWindow(snapshotWindow: String)

    public fun snsTopicArn(snsTopicArn: String)

    public fun snsTopicStatus(snsTopicStatus: String)

    public fun subnetGroupName(subnetGroupName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun tlsEnabled(tlsEnabled: Boolean)

    public fun tlsEnabled(tlsEnabled: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.memorydb.CfnCluster.Builder =
        software.amazon.awscdk.services.memorydb.CfnCluster.Builder.create(scope, id)

    override fun aclName(aclName: String) {
      cdkBuilder.aclName(aclName)
    }

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: Boolean) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade)
    }

    override fun autoMinorVersionUpgrade(autoMinorVersionUpgrade: IResolvable) {
      cdkBuilder.autoMinorVersionUpgrade(autoMinorVersionUpgrade.let(IResolvable::unwrap))
    }

    override fun clusterEndpoint(clusterEndpoint: IResolvable) {
      cdkBuilder.clusterEndpoint(clusterEndpoint.let(IResolvable::unwrap))
    }

    override fun clusterEndpoint(clusterEndpoint: EndpointProperty) {
      cdkBuilder.clusterEndpoint(clusterEndpoint.let(EndpointProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4d33203bee7e089e4fbdd81588dfcceea6441e02214de6749a98f01dd1955f8d")
    override fun clusterEndpoint(clusterEndpoint: EndpointProperty.Builder.() -> Unit): Unit =
        clusterEndpoint(EndpointProperty(clusterEndpoint))

    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    override fun dataTiering(dataTiering: String) {
      cdkBuilder.dataTiering(dataTiering)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    override fun finalSnapshotName(finalSnapshotName: String) {
      cdkBuilder.finalSnapshotName(finalSnapshotName)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun maintenanceWindow(maintenanceWindow: String) {
      cdkBuilder.maintenanceWindow(maintenanceWindow)
    }

    override fun nodeType(nodeType: String) {
      cdkBuilder.nodeType(nodeType)
    }

    override fun numReplicasPerShard(numReplicasPerShard: Number) {
      cdkBuilder.numReplicasPerShard(numReplicasPerShard)
    }

    override fun numShards(numShards: Number) {
      cdkBuilder.numShards(numShards)
    }

    override fun parameterGroupName(parameterGroupName: String) {
      cdkBuilder.parameterGroupName(parameterGroupName)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
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

    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    override fun snsTopicStatus(snsTopicStatus: String) {
      cdkBuilder.snsTopicStatus(snsTopicStatus)
    }

    override fun subnetGroupName(subnetGroupName: String) {
      cdkBuilder.subnetGroupName(subnetGroupName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun tlsEnabled(tlsEnabled: Boolean) {
      cdkBuilder.tlsEnabled(tlsEnabled)
    }

    override fun tlsEnabled(tlsEnabled: IResolvable) {
      cdkBuilder.tlsEnabled(tlsEnabled.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.memorydb.CfnCluster = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCluster {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCluster(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.memorydb.CfnCluster): CfnCluster =
        CfnCluster(cdkObject)

    internal fun unwrap(wrapped: CfnCluster): software.amazon.awscdk.services.memorydb.CfnCluster =
        wrapped.cdkObject
  }

  public interface EndpointProperty {
    public fun address(): String? = unwrap(this).getAddress()

    public fun port(): Number? = unwrap(this).getPort()

    public interface Builder {
      public fun address(address: String)

      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.memorydb.CfnCluster.EndpointProperty.Builder =
          software.amazon.awscdk.services.memorydb.CfnCluster.EndpointProperty.builder()

      override fun address(address: String) {
        cdkBuilder.address(address)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build(): software.amazon.awscdk.services.memorydb.CfnCluster.EndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.memorydb.CfnCluster.EndpointProperty,
    ) : EndpointProperty {
      override fun address(): String? = unwrap(this).getAddress()

      override fun port(): Number? = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.memorydb.CfnCluster.EndpointProperty):
          EndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointProperty):
          software.amazon.awscdk.services.memorydb.CfnCluster.EndpointProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}

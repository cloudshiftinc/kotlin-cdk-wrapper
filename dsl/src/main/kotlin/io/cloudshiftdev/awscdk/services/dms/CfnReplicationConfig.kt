package io.cloudshiftdev.awscdk.services.dms

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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

public open class CfnReplicationConfig internal constructor(
  private val cdkObject: software.amazon.awscdk.services.dms.CfnReplicationConfig,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrReplicationConfigArn(): String = unwrap(this).getAttrReplicationConfigArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun computeConfig(): Any? = unwrap(this).getComputeConfig()

  public open fun computeConfig(`value`: IResolvable) {
    unwrap(this).setComputeConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun computeConfig(`value`: ComputeConfigProperty) {
    unwrap(this).setComputeConfig(`value`.let(ComputeConfigProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7ea9b390b50089fd07693eb2a50e85bdb5d768dd07e29853a352d886c5f6a364")
  public open fun computeConfig(`value`: ComputeConfigProperty.Builder.() -> Unit): Unit =
      computeConfig(ComputeConfigProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun replicationConfigIdentifier(): String? =
      unwrap(this).getReplicationConfigIdentifier()

  public open fun replicationConfigIdentifier(`value`: String) {
    unwrap(this).setReplicationConfigIdentifier(`value`)
  }

  public open fun replicationSettings(): Any? = unwrap(this).getReplicationSettings()

  public open fun replicationSettings(`value`: Any) {
    unwrap(this).setReplicationSettings(`value`)
  }

  public open fun replicationType(): String? = unwrap(this).getReplicationType()

  public open fun replicationType(`value`: String) {
    unwrap(this).setReplicationType(`value`)
  }

  public open fun resourceIdentifier(): String? = unwrap(this).getResourceIdentifier()

  public open fun resourceIdentifier(`value`: String) {
    unwrap(this).setResourceIdentifier(`value`)
  }

  public open fun sourceEndpointArn(): String? = unwrap(this).getSourceEndpointArn()

  public open fun sourceEndpointArn(`value`: String) {
    unwrap(this).setSourceEndpointArn(`value`)
  }

  public open fun supplementalSettings(): Any? = unwrap(this).getSupplementalSettings()

  public open fun supplementalSettings(`value`: Any) {
    unwrap(this).setSupplementalSettings(`value`)
  }

  public open fun tableMappings(): Any? = unwrap(this).getTableMappings()

  public open fun tableMappings(`value`: Any) {
    unwrap(this).setTableMappings(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun targetEndpointArn(): String? = unwrap(this).getTargetEndpointArn()

  public open fun targetEndpointArn(`value`: String) {
    unwrap(this).setTargetEndpointArn(`value`)
  }

  public interface Builder {
    public fun computeConfig(computeConfig: IResolvable)

    public fun computeConfig(computeConfig: ComputeConfigProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8b204c7b9e5ebf2801fdcf758bcf72e12064ffee5778d3aba0c041c9d675c95")
    public fun computeConfig(computeConfig: ComputeConfigProperty.Builder.() -> Unit)

    public fun replicationConfigIdentifier(replicationConfigIdentifier: String)

    public fun replicationSettings(replicationSettings: Any)

    public fun replicationType(replicationType: String)

    public fun resourceIdentifier(resourceIdentifier: String)

    public fun sourceEndpointArn(sourceEndpointArn: String)

    public fun supplementalSettings(supplementalSettings: Any)

    public fun tableMappings(tableMappings: Any)

    public fun tags(tags: List<CfnTag>)

    public fun targetEndpointArn(targetEndpointArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dms.CfnReplicationConfig.Builder =
        software.amazon.awscdk.services.dms.CfnReplicationConfig.Builder.create(scope, id)

    override fun computeConfig(computeConfig: IResolvable) {
      cdkBuilder.computeConfig(computeConfig.let(IResolvable::unwrap))
    }

    override fun computeConfig(computeConfig: ComputeConfigProperty) {
      cdkBuilder.computeConfig(computeConfig.let(ComputeConfigProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b8b204c7b9e5ebf2801fdcf758bcf72e12064ffee5778d3aba0c041c9d675c95")
    override fun computeConfig(computeConfig: ComputeConfigProperty.Builder.() -> Unit): Unit =
        computeConfig(ComputeConfigProperty(computeConfig))

    override fun replicationConfigIdentifier(replicationConfigIdentifier: String) {
      cdkBuilder.replicationConfigIdentifier(replicationConfigIdentifier)
    }

    override fun replicationSettings(replicationSettings: Any) {
      cdkBuilder.replicationSettings(replicationSettings)
    }

    override fun replicationType(replicationType: String) {
      cdkBuilder.replicationType(replicationType)
    }

    override fun resourceIdentifier(resourceIdentifier: String) {
      cdkBuilder.resourceIdentifier(resourceIdentifier)
    }

    override fun sourceEndpointArn(sourceEndpointArn: String) {
      cdkBuilder.sourceEndpointArn(sourceEndpointArn)
    }

    override fun supplementalSettings(supplementalSettings: Any) {
      cdkBuilder.supplementalSettings(supplementalSettings)
    }

    override fun tableMappings(tableMappings: Any) {
      cdkBuilder.tableMappings(tableMappings)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun targetEndpointArn(targetEndpointArn: String) {
      cdkBuilder.targetEndpointArn(targetEndpointArn)
    }

    public fun build(): software.amazon.awscdk.services.dms.CfnReplicationConfig =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnReplicationConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnReplicationConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnReplicationConfig):
        CfnReplicationConfig = CfnReplicationConfig(cdkObject)

    internal fun unwrap(wrapped: CfnReplicationConfig):
        software.amazon.awscdk.services.dms.CfnReplicationConfig = wrapped.cdkObject
  }

  public interface ComputeConfigProperty {
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    public fun dnsNameServers(): String? = unwrap(this).getDnsNameServers()

    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun maxCapacityUnits(): Number

    public fun minCapacityUnits(): Number? = unwrap(this).getMinCapacityUnits()

    public fun multiAz(): Any? = unwrap(this).getMultiAz()

    public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

    public fun replicationSubnetGroupId(): String? = unwrap(this).getReplicationSubnetGroupId()

    public fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
        emptyList()

    public interface Builder {
      public fun availabilityZone(availabilityZone: String)

      public fun dnsNameServers(dnsNameServers: String)

      public fun kmsKeyId(kmsKeyId: String)

      public fun maxCapacityUnits(maxCapacityUnits: Number)

      public fun minCapacityUnits(minCapacityUnits: Number)

      public fun multiAz(multiAz: Boolean)

      public fun multiAz(multiAz: IResolvable)

      public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

      public fun replicationSubnetGroupId(replicationSubnetGroupId: String)

      public fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dms.CfnReplicationConfig.ComputeConfigProperty.Builder =
          software.amazon.awscdk.services.dms.CfnReplicationConfig.ComputeConfigProperty.builder()

      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      override fun dnsNameServers(dnsNameServers: String) {
        cdkBuilder.dnsNameServers(dnsNameServers)
      }

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      override fun maxCapacityUnits(maxCapacityUnits: Number) {
        cdkBuilder.maxCapacityUnits(maxCapacityUnits)
      }

      override fun minCapacityUnits(minCapacityUnits: Number) {
        cdkBuilder.minCapacityUnits(minCapacityUnits)
      }

      override fun multiAz(multiAz: Boolean) {
        cdkBuilder.multiAz(multiAz)
      }

      override fun multiAz(multiAz: IResolvable) {
        cdkBuilder.multiAz(multiAz.let(IResolvable::unwrap))
      }

      override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
        cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
      }

      override fun replicationSubnetGroupId(replicationSubnetGroupId: String) {
        cdkBuilder.replicationSubnetGroupId(replicationSubnetGroupId)
      }

      override fun vpcSecurityGroupIds(vpcSecurityGroupIds: List<String>) {
        cdkBuilder.vpcSecurityGroupIds(vpcSecurityGroupIds)
      }

      public fun build():
          software.amazon.awscdk.services.dms.CfnReplicationConfig.ComputeConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dms.CfnReplicationConfig.ComputeConfigProperty,
    ) : ComputeConfigProperty {
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      override fun dnsNameServers(): String? = unwrap(this).getDnsNameServers()

      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      override fun maxCapacityUnits(): Number = unwrap(this).getMaxCapacityUnits()

      override fun minCapacityUnits(): Number? = unwrap(this).getMinCapacityUnits()

      override fun multiAz(): Any? = unwrap(this).getMultiAz()

      override fun preferredMaintenanceWindow(): String? =
          unwrap(this).getPreferredMaintenanceWindow()

      override fun replicationSubnetGroupId(): String? = unwrap(this).getReplicationSubnetGroupId()

      override fun vpcSecurityGroupIds(): List<String> = unwrap(this).getVpcSecurityGroupIds() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ComputeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dms.CfnReplicationConfig.ComputeConfigProperty):
          ComputeConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComputeConfigProperty):
          software.amazon.awscdk.services.dms.CfnReplicationConfig.ComputeConfigProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGlobalReplicationGroup internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrGlobalReplicationGroupId(): String =
      unwrap(this).getAttrGlobalReplicationGroupId()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

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

  public open fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
  }

  public open fun globalNodeGroupCount(): Number? = unwrap(this).getGlobalNodeGroupCount()

  public open fun globalNodeGroupCount(`value`: Number) {
    unwrap(this).setGlobalNodeGroupCount(`value`)
  }

  public open fun globalReplicationGroupDescription(): String? =
      unwrap(this).getGlobalReplicationGroupDescription()

  public open fun globalReplicationGroupDescription(`value`: String) {
    unwrap(this).setGlobalReplicationGroupDescription(`value`)
  }

  public open fun globalReplicationGroupIdSuffix(): String? =
      unwrap(this).getGlobalReplicationGroupIdSuffix()

  public open fun globalReplicationGroupIdSuffix(`value`: String) {
    unwrap(this).setGlobalReplicationGroupIdSuffix(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun members(): Any = unwrap(this).getMembers()

  public open fun members(`value`: IResolvable) {
    unwrap(this).setMembers(`value`.let(IResolvable::unwrap))
  }

  public open fun members(__idx_ac66f0: List<Any>) {
    unwrap(this).setMembers(__idx_ac66f0)
  }

  public open fun members(vararg __idx_ac66f0: Any): Unit = members(__idx_ac66f0.toList())

  public open fun regionalConfigurations(): Any? = unwrap(this).getRegionalConfigurations()

  public open fun regionalConfigurations(`value`: IResolvable) {
    unwrap(this).setRegionalConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun regionalConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setRegionalConfigurations(__idx_ac66f0)
  }

  public open fun regionalConfigurations(vararg __idx_ac66f0: Any): Unit =
      regionalConfigurations(__idx_ac66f0.toList())

  @CdkDslMarker
  public interface Builder {
    public fun automaticFailoverEnabled(automaticFailoverEnabled: Boolean)

    public fun automaticFailoverEnabled(automaticFailoverEnabled: IResolvable)

    public fun cacheNodeType(cacheNodeType: String)

    public fun cacheParameterGroupName(cacheParameterGroupName: String)

    public fun engineVersion(engineVersion: String)

    public fun globalNodeGroupCount(globalNodeGroupCount: Number)

    public fun globalReplicationGroupDescription(globalReplicationGroupDescription: String)

    public fun globalReplicationGroupIdSuffix(globalReplicationGroupIdSuffix: String)

    public fun members(members: IResolvable)

    public fun members(members: List<Any>)

    public fun members(vararg members: Any)

    public fun regionalConfigurations(regionalConfigurations: IResolvable)

    public fun regionalConfigurations(regionalConfigurations: List<Any>)

    public fun regionalConfigurations(vararg regionalConfigurations: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.Builder =
        software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.Builder.create(scope,
        id)

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

    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    override fun globalNodeGroupCount(globalNodeGroupCount: Number) {
      cdkBuilder.globalNodeGroupCount(globalNodeGroupCount)
    }

    override fun globalReplicationGroupDescription(globalReplicationGroupDescription: String) {
      cdkBuilder.globalReplicationGroupDescription(globalReplicationGroupDescription)
    }

    override fun globalReplicationGroupIdSuffix(globalReplicationGroupIdSuffix: String) {
      cdkBuilder.globalReplicationGroupIdSuffix(globalReplicationGroupIdSuffix)
    }

    override fun members(members: IResolvable) {
      cdkBuilder.members(members.let(IResolvable::unwrap))
    }

    override fun members(members: List<Any>) {
      cdkBuilder.members(members)
    }

    override fun members(vararg members: Any): Unit = members(members.toList())

    override fun regionalConfigurations(regionalConfigurations: IResolvable) {
      cdkBuilder.regionalConfigurations(regionalConfigurations.let(IResolvable::unwrap))
    }

    override fun regionalConfigurations(regionalConfigurations: List<Any>) {
      cdkBuilder.regionalConfigurations(regionalConfigurations)
    }

    override fun regionalConfigurations(vararg regionalConfigurations: Any): Unit =
        regionalConfigurations(regionalConfigurations.toList())

    public fun build(): software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGlobalReplicationGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGlobalReplicationGroup(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup):
        CfnGlobalReplicationGroup = CfnGlobalReplicationGroup(cdkObject)

    internal fun unwrap(wrapped: CfnGlobalReplicationGroup):
        software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup = wrapped.cdkObject
  }

  public interface GlobalReplicationGroupMemberProperty {
    public fun replicationGroupId(): String? = unwrap(this).getReplicationGroupId()

    public fun replicationGroupRegion(): String? = unwrap(this).getReplicationGroupRegion()

    public fun role(): String? = unwrap(this).getRole()

    @CdkDslMarker
    public interface Builder {
      public fun replicationGroupId(replicationGroupId: String)

      public fun replicationGroupRegion(replicationGroupRegion: String)

      public fun role(role: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty.builder()

      override fun replicationGroupId(replicationGroupId: String) {
        cdkBuilder.replicationGroupId(replicationGroupId)
      }

      override fun replicationGroupRegion(replicationGroupRegion: String) {
        cdkBuilder.replicationGroupRegion(replicationGroupRegion)
      }

      override fun role(role: String) {
        cdkBuilder.role(role)
      }

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty,
    ) : CdkObject(cdkObject), GlobalReplicationGroupMemberProperty {
      override fun replicationGroupId(): String? = unwrap(this).getReplicationGroupId()

      override fun replicationGroupRegion(): String? = unwrap(this).getReplicationGroupRegion()

      override fun role(): String? = unwrap(this).getRole()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          GlobalReplicationGroupMemberProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty):
          GlobalReplicationGroupMemberProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlobalReplicationGroupMemberProperty):
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty
    }
  }

  public interface ReshardingConfigurationProperty {
    public fun nodeGroupId(): String? = unwrap(this).getNodeGroupId()

    public fun preferredAvailabilityZones(): List<String> =
        unwrap(this).getPreferredAvailabilityZones() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun nodeGroupId(nodeGroupId: String)

      public fun preferredAvailabilityZones(preferredAvailabilityZones: List<String>)

      public fun preferredAvailabilityZones(vararg preferredAvailabilityZones: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.ReshardingConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.ReshardingConfigurationProperty.builder()

      override fun nodeGroupId(nodeGroupId: String) {
        cdkBuilder.nodeGroupId(nodeGroupId)
      }

      override fun preferredAvailabilityZones(preferredAvailabilityZones: List<String>) {
        cdkBuilder.preferredAvailabilityZones(preferredAvailabilityZones)
      }

      override fun preferredAvailabilityZones(vararg preferredAvailabilityZones: String): Unit =
          preferredAvailabilityZones(preferredAvailabilityZones.toList())

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.ReshardingConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.ReshardingConfigurationProperty,
    ) : CdkObject(cdkObject), ReshardingConfigurationProperty {
      override fun nodeGroupId(): String? = unwrap(this).getNodeGroupId()

      override fun preferredAvailabilityZones(): List<String> =
          unwrap(this).getPreferredAvailabilityZones() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReshardingConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.ReshardingConfigurationProperty):
          ReshardingConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReshardingConfigurationProperty):
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.ReshardingConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.ReshardingConfigurationProperty
    }
  }

  public interface RegionalConfigurationProperty {
    public fun replicationGroupId(): String? = unwrap(this).getReplicationGroupId()

    public fun replicationGroupRegion(): String? = unwrap(this).getReplicationGroupRegion()

    public fun reshardingConfigurations(): Any? = unwrap(this).getReshardingConfigurations()

    @CdkDslMarker
    public interface Builder {
      public fun replicationGroupId(replicationGroupId: String)

      public fun replicationGroupRegion(replicationGroupRegion: String)

      public fun reshardingConfigurations(reshardingConfigurations: IResolvable)

      public fun reshardingConfigurations(reshardingConfigurations: List<Any>)

      public fun reshardingConfigurations(vararg reshardingConfigurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.RegionalConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.RegionalConfigurationProperty.builder()

      override fun replicationGroupId(replicationGroupId: String) {
        cdkBuilder.replicationGroupId(replicationGroupId)
      }

      override fun replicationGroupRegion(replicationGroupRegion: String) {
        cdkBuilder.replicationGroupRegion(replicationGroupRegion)
      }

      override fun reshardingConfigurations(reshardingConfigurations: IResolvable) {
        cdkBuilder.reshardingConfigurations(reshardingConfigurations.let(IResolvable::unwrap))
      }

      override fun reshardingConfigurations(reshardingConfigurations: List<Any>) {
        cdkBuilder.reshardingConfigurations(reshardingConfigurations)
      }

      override fun reshardingConfigurations(vararg reshardingConfigurations: Any): Unit =
          reshardingConfigurations(reshardingConfigurations.toList())

      public fun build():
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.RegionalConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.RegionalConfigurationProperty,
    ) : CdkObject(cdkObject), RegionalConfigurationProperty {
      override fun replicationGroupId(): String? = unwrap(this).getReplicationGroupId()

      override fun replicationGroupRegion(): String? = unwrap(this).getReplicationGroupRegion()

      override fun reshardingConfigurations(): Any? = unwrap(this).getReshardingConfigurations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RegionalConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.RegionalConfigurationProperty):
          RegionalConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RegionalConfigurationProperty):
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.RegionalConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup.RegionalConfigurationProperty
    }
  }
}

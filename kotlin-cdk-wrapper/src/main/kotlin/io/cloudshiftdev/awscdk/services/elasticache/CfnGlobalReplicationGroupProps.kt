@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticache

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnGlobalReplicationGroupProps {
  public fun automaticFailoverEnabled(): Any? = unwrap(this).getAutomaticFailoverEnabled()

  public fun cacheNodeType(): String? = unwrap(this).getCacheNodeType()

  public fun cacheParameterGroupName(): String? = unwrap(this).getCacheParameterGroupName()

  public fun engineVersion(): String? = unwrap(this).getEngineVersion()

  public fun globalNodeGroupCount(): Number? = unwrap(this).getGlobalNodeGroupCount()

  public fun globalReplicationGroupDescription(): String? =
      unwrap(this).getGlobalReplicationGroupDescription()

  public fun globalReplicationGroupIdSuffix(): String? =
      unwrap(this).getGlobalReplicationGroupIdSuffix()

  public fun members(): Any

  public fun regionalConfigurations(): Any? = unwrap(this).getRegionalConfigurations()

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

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroupProps.Builder =
        software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroupProps.builder()

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

    public fun build(): software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroupProps,
  ) : CdkObject(cdkObject), CfnGlobalReplicationGroupProps {
    override fun automaticFailoverEnabled(): Any? = unwrap(this).getAutomaticFailoverEnabled()

    override fun cacheNodeType(): String? = unwrap(this).getCacheNodeType()

    override fun cacheParameterGroupName(): String? = unwrap(this).getCacheParameterGroupName()

    override fun engineVersion(): String? = unwrap(this).getEngineVersion()

    override fun globalNodeGroupCount(): Number? = unwrap(this).getGlobalNodeGroupCount()

    override fun globalReplicationGroupDescription(): String? =
        unwrap(this).getGlobalReplicationGroupDescription()

    override fun globalReplicationGroupIdSuffix(): String? =
        unwrap(this).getGlobalReplicationGroupIdSuffix()

    override fun members(): Any = unwrap(this).getMembers()

    override fun regionalConfigurations(): Any? = unwrap(this).getRegionalConfigurations()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGlobalReplicationGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroupProps):
        CfnGlobalReplicationGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGlobalReplicationGroupProps):
        software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroupProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroupProps
  }
}

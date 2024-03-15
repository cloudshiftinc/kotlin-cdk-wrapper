@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.emrcontainers

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnVirtualClusterProps {
  public fun containerProvider(): Any

  public fun name(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun containerProvider(containerProvider: IResolvable)

    public fun containerProvider(containerProvider: CfnVirtualCluster.ContainerProviderProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21f006f7212bf2fdda58e625ec41c39bdd61ebd027ec6834340284ffcac8263d")
    public
        fun containerProvider(containerProvider: CfnVirtualCluster.ContainerProviderProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps.Builder =
        software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps.builder()

    override fun containerProvider(containerProvider: IResolvable) {
      cdkBuilder.containerProvider(containerProvider.let(IResolvable::unwrap))
    }

    override fun containerProvider(containerProvider: CfnVirtualCluster.ContainerProviderProperty) {
      cdkBuilder.containerProvider(containerProvider.let(CfnVirtualCluster.ContainerProviderProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21f006f7212bf2fdda58e625ec41c39bdd61ebd027ec6834340284ffcac8263d")
    override
        fun containerProvider(containerProvider: CfnVirtualCluster.ContainerProviderProperty.Builder.() -> Unit):
        Unit = containerProvider(CfnVirtualCluster.ContainerProviderProperty(containerProvider))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps,
  ) : CdkObject(cdkObject), CfnVirtualClusterProps {
    override fun containerProvider(): Any = unwrap(this).getContainerProvider()

    override fun name(): String = unwrap(this).getName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVirtualClusterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps):
        CfnVirtualClusterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVirtualClusterProps):
        software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.emrcontainers.CfnVirtualClusterProps
  }
}

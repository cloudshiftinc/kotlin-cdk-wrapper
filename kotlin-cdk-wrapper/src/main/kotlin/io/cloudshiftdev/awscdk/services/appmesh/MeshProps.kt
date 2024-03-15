@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface MeshProps {
  public fun egressFilter(): MeshFilterType? =
      unwrap(this).getEgressFilter()?.let(MeshFilterType::wrap)

  public fun meshName(): String? = unwrap(this).getMeshName()

  public fun serviceDiscovery(): MeshServiceDiscovery? =
      unwrap(this).getServiceDiscovery()?.let(MeshServiceDiscovery::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun egressFilter(egressFilter: MeshFilterType)

    public fun meshName(meshName: String)

    public fun serviceDiscovery(serviceDiscovery: MeshServiceDiscovery)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5242b4ab83abca62119e35875958f2a0bc4fe308084a0dc64751ecd779380d30")
    public fun serviceDiscovery(serviceDiscovery: MeshServiceDiscovery.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.MeshProps.Builder =
        software.amazon.awscdk.services.appmesh.MeshProps.builder()

    override fun egressFilter(egressFilter: MeshFilterType) {
      cdkBuilder.egressFilter(egressFilter.let(MeshFilterType::unwrap))
    }

    override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    override fun serviceDiscovery(serviceDiscovery: MeshServiceDiscovery) {
      cdkBuilder.serviceDiscovery(serviceDiscovery.let(MeshServiceDiscovery::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5242b4ab83abca62119e35875958f2a0bc4fe308084a0dc64751ecd779380d30")
    override fun serviceDiscovery(serviceDiscovery: MeshServiceDiscovery.Builder.() -> Unit): Unit =
        serviceDiscovery(MeshServiceDiscovery(serviceDiscovery))

    public fun build(): software.amazon.awscdk.services.appmesh.MeshProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.MeshProps,
  ) : CdkObject(cdkObject), MeshProps {
    override fun egressFilter(): MeshFilterType? =
        unwrap(this).getEgressFilter()?.let(MeshFilterType::wrap)

    override fun meshName(): String? = unwrap(this).getMeshName()

    override fun serviceDiscovery(): MeshServiceDiscovery? =
        unwrap(this).getServiceDiscovery()?.let(MeshServiceDiscovery::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MeshProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.MeshProps): MeshProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MeshProps): software.amazon.awscdk.services.appmesh.MeshProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.MeshProps
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface VirtualRouterProps : VirtualRouterBaseProps {
  public fun mesh(): IMesh

  @CdkDslMarker
  public interface Builder {
    public fun listeners(listeners: List<VirtualRouterListener>)

    public fun listeners(vararg listeners: VirtualRouterListener)

    public fun mesh(mesh: IMesh)

    public fun virtualRouterName(virtualRouterName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualRouterProps.Builder =
        software.amazon.awscdk.services.appmesh.VirtualRouterProps.builder()

    override fun listeners(listeners: List<VirtualRouterListener>) {
      cdkBuilder.listeners(listeners.map(VirtualRouterListener::unwrap))
    }

    override fun listeners(vararg listeners: VirtualRouterListener): Unit =
        listeners(listeners.toList())

    override fun mesh(mesh: IMesh) {
      cdkBuilder.mesh(mesh.let(IMesh::unwrap))
    }

    override fun virtualRouterName(virtualRouterName: String) {
      cdkBuilder.virtualRouterName(virtualRouterName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualRouterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualRouterProps,
  ) : CdkObject(cdkObject), VirtualRouterProps {
    override fun listeners(): List<VirtualRouterListener> =
        unwrap(this).getListeners()?.map(VirtualRouterListener::wrap) ?: emptyList()

    override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    override fun virtualRouterName(): String? = unwrap(this).getVirtualRouterName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualRouterProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualRouterProps):
        VirtualRouterProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualRouterProps):
        software.amazon.awscdk.services.appmesh.VirtualRouterProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.VirtualRouterProps
  }
}

package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.String
import kotlin.Unit

public interface VirtualRouterAttributes {
  public fun mesh(): IMesh

  public fun virtualRouterName(): String

  public interface Builder {
    public fun mesh(mesh: IMesh) {
    }

    public fun virtualRouterName(virtualRouterName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualRouterAttributes.Builder
        = software.amazon.awscdk.services.appmesh.VirtualRouterAttributes.builder()

    public override fun mesh(mesh: IMesh) {
      cdkBuilder.mesh(mesh.let(IMesh::unwrap))
    }

    public override fun virtualRouterName(virtualRouterName: String) {
      cdkBuilder.virtualRouterName(virtualRouterName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualRouterAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.VirtualRouterAttributes,
  ) : VirtualRouterAttributes {
    public override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    public override fun virtualRouterName(): String = unwrap(this).getVirtualRouterName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualRouterAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualRouterAttributes):
        VirtualRouterAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualRouterAttributes):
        software.amazon.awscdk.services.appmesh.VirtualRouterAttributes = (wrapped as
        Wrapper).cdkObject
  }
}

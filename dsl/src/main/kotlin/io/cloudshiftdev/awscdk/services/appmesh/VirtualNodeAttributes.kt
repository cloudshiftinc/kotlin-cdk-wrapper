package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.String
import kotlin.Unit

public interface VirtualNodeAttributes {
  public fun mesh(): IMesh

  public fun virtualNodeName(): String

  public interface Builder {
    public fun mesh(mesh: IMesh)

    public fun virtualNodeName(virtualNodeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualNodeAttributes.Builder =
        software.amazon.awscdk.services.appmesh.VirtualNodeAttributes.builder()

    override fun mesh(mesh: IMesh) {
      cdkBuilder.mesh(mesh.let(IMesh::unwrap))
    }

    override fun virtualNodeName(virtualNodeName: String) {
      cdkBuilder.virtualNodeName(virtualNodeName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualNodeAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.VirtualNodeAttributes,
  ) : VirtualNodeAttributes {
    override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    override fun virtualNodeName(): String = unwrap(this).getVirtualNodeName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualNodeAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualNodeAttributes):
        VirtualNodeAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualNodeAttributes):
        software.amazon.awscdk.services.appmesh.VirtualNodeAttributes = (wrapped as
        Wrapper).cdkObject
  }
}

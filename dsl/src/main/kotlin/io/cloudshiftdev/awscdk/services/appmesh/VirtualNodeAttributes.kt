package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface VirtualNodeAttributes {
  /**
   * The Mesh that the VirtualNode belongs to.
   */
  public fun mesh(): IMesh

  /**
   * The name of the VirtualNode.
   */
  public fun virtualNodeName(): String

  /**
   * A builder for [VirtualNodeAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param mesh The Mesh that the VirtualNode belongs to. 
     */
    public fun mesh(mesh: IMesh)

    /**
     * @param virtualNodeName The name of the VirtualNode. 
     */
    public fun virtualNodeName(virtualNodeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualNodeAttributes.Builder =
        software.amazon.awscdk.services.appmesh.VirtualNodeAttributes.builder()

    /**
     * @param mesh The Mesh that the VirtualNode belongs to. 
     */
    override fun mesh(mesh: IMesh) {
      cdkBuilder.mesh(mesh.let(IMesh::unwrap))
    }

    /**
     * @param virtualNodeName The name of the VirtualNode. 
     */
    override fun virtualNodeName(virtualNodeName: String) {
      cdkBuilder.virtualNodeName(virtualNodeName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualNodeAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.VirtualNodeAttributes,
  ) : VirtualNodeAttributes {
    /**
     * The Mesh that the VirtualNode belongs to.
     */
    override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    /**
     * The name of the VirtualNode.
     */
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

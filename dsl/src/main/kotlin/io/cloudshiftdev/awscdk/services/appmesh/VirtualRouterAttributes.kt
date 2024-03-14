package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface VirtualRouterAttributes {
  /**
   * The Mesh which the VirtualRouter belongs to.
   */
  public fun mesh(): IMesh

  /**
   * The name of the VirtualRouter.
   */
  public fun virtualRouterName(): String

  /**
   * A builder for [VirtualRouterAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param mesh The Mesh which the VirtualRouter belongs to. 
     */
    public fun mesh(mesh: IMesh)

    /**
     * @param virtualRouterName The name of the VirtualRouter. 
     */
    public fun virtualRouterName(virtualRouterName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualRouterAttributes.Builder
        = software.amazon.awscdk.services.appmesh.VirtualRouterAttributes.builder()

    /**
     * @param mesh The Mesh which the VirtualRouter belongs to. 
     */
    override fun mesh(mesh: IMesh) {
      cdkBuilder.mesh(mesh.let(IMesh::unwrap))
    }

    /**
     * @param virtualRouterName The name of the VirtualRouter. 
     */
    override fun virtualRouterName(virtualRouterName: String) {
      cdkBuilder.virtualRouterName(virtualRouterName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualRouterAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualRouterAttributes,
  ) : CdkObject(cdkObject), VirtualRouterAttributes {
    /**
     * The Mesh which the VirtualRouter belongs to.
     */
    override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    /**
     * The name of the VirtualRouter.
     */
    override fun virtualRouterName(): String = unwrap(this).getVirtualRouterName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualRouterAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualRouterAttributes):
        VirtualRouterAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualRouterAttributes):
        software.amazon.awscdk.services.appmesh.VirtualRouterAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.VirtualRouterAttributes
  }
}

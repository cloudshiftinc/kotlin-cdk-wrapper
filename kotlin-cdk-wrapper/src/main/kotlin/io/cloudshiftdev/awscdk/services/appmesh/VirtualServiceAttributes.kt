@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Interface with properties ncecessary to import a reusable VirtualService.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * Mesh mesh;
 * VirtualServiceAttributes virtualServiceAttributes = VirtualServiceAttributes.builder()
 * .mesh(mesh)
 * .virtualServiceName("virtualServiceName")
 * .build();
 * ```
 */
public interface VirtualServiceAttributes {
  /**
   * The Mesh which the VirtualService belongs to.
   */
  public fun mesh(): IMesh

  /**
   * The name of the VirtualService, it is recommended this follows the fully-qualified domain name
   * format.
   */
  public fun virtualServiceName(): String

  /**
   * A builder for [VirtualServiceAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param mesh The Mesh which the VirtualService belongs to. 
     */
    public fun mesh(mesh: IMesh)

    /**
     * @param virtualServiceName The name of the VirtualService, it is recommended this follows the
     * fully-qualified domain name format. 
     */
    public fun virtualServiceName(virtualServiceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualServiceAttributes.Builder
        = software.amazon.awscdk.services.appmesh.VirtualServiceAttributes.builder()

    /**
     * @param mesh The Mesh which the VirtualService belongs to. 
     */
    override fun mesh(mesh: IMesh) {
      cdkBuilder.mesh(mesh.let(IMesh::unwrap))
    }

    /**
     * @param virtualServiceName The name of the VirtualService, it is recommended this follows the
     * fully-qualified domain name format. 
     */
    override fun virtualServiceName(virtualServiceName: String) {
      cdkBuilder.virtualServiceName(virtualServiceName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualServiceAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualServiceAttributes,
  ) : CdkObject(cdkObject), VirtualServiceAttributes {
    /**
     * The Mesh which the VirtualService belongs to.
     */
    override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    /**
     * The name of the VirtualService, it is recommended this follows the fully-qualified domain
     * name format.
     */
    override fun virtualServiceName(): String = unwrap(this).getVirtualServiceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualServiceAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualServiceAttributes):
        VirtualServiceAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualServiceAttributes):
        software.amazon.awscdk.services.appmesh.VirtualServiceAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.VirtualServiceAttributes
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Unterface with properties necessary to import a reusable VirtualGateway.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * Mesh mesh;
 * VirtualGatewayAttributes virtualGatewayAttributes = VirtualGatewayAttributes.builder()
 * .mesh(mesh)
 * .virtualGatewayName("virtualGatewayName")
 * .build();
 * ```
 */
public interface VirtualGatewayAttributes {
  /**
   * The Mesh that the VirtualGateway belongs to.
   */
  public fun mesh(): IMesh

  /**
   * The name of the VirtualGateway.
   */
  public fun virtualGatewayName(): String

  /**
   * A builder for [VirtualGatewayAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param mesh The Mesh that the VirtualGateway belongs to. 
     */
    public fun mesh(mesh: IMesh)

    /**
     * @param virtualGatewayName The name of the VirtualGateway. 
     */
    public fun virtualGatewayName(virtualGatewayName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualGatewayAttributes.Builder
        = software.amazon.awscdk.services.appmesh.VirtualGatewayAttributes.builder()

    /**
     * @param mesh The Mesh that the VirtualGateway belongs to. 
     */
    override fun mesh(mesh: IMesh) {
      cdkBuilder.mesh(mesh.let(IMesh.Companion::unwrap))
    }

    /**
     * @param virtualGatewayName The name of the VirtualGateway. 
     */
    override fun virtualGatewayName(virtualGatewayName: String) {
      cdkBuilder.virtualGatewayName(virtualGatewayName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualGatewayAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.VirtualGatewayAttributes,
  ) : CdkObject(cdkObject), VirtualGatewayAttributes {
    /**
     * The Mesh that the VirtualGateway belongs to.
     */
    override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    /**
     * The name of the VirtualGateway.
     */
    override fun virtualGatewayName(): String = unwrap(this).getVirtualGatewayName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualGatewayAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualGatewayAttributes):
        VirtualGatewayAttributes = CdkObjectWrappers.wrap(cdkObject) as? VirtualGatewayAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualGatewayAttributes):
        software.amazon.awscdk.services.appmesh.VirtualGatewayAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.VirtualGatewayAttributes
  }
}

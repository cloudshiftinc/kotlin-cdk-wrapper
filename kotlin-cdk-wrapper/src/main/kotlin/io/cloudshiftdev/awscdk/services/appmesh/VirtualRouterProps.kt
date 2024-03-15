@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * The properties used when creating a new VirtualRouter.
 *
 * Example:
 *
 * ```
 * Stack infraStack;
 * Stack appStack;
 * Mesh mesh = Mesh.Builder.create(infraStack, "AppMesh")
 * .meshName("myAwsMesh")
 * .egressFilter(MeshFilterType.ALLOW_ALL)
 * .build();
 * // the VirtualRouter will belong to 'appStack',
 * // even though the Mesh belongs to 'infraStack'
 * VirtualRouter router = VirtualRouter.Builder.create(appStack, "router")
 * .mesh(mesh) // notice that mesh is a required property when creating a router with the 'new'
 * statement
 * .listeners(List.of(VirtualRouterListener.http(8081)))
 * .build();
 * ```
 */
public interface VirtualRouterProps : VirtualRouterBaseProps {
  /**
   * The Mesh which the VirtualRouter belongs to.
   */
  public fun mesh(): IMesh

  /**
   * A builder for [VirtualRouterProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param listeners Listener specification for the VirtualRouter.
     */
    public fun listeners(listeners: List<VirtualRouterListener>)

    /**
     * @param listeners Listener specification for the VirtualRouter.
     */
    public fun listeners(vararg listeners: VirtualRouterListener)

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
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualRouterProps.Builder =
        software.amazon.awscdk.services.appmesh.VirtualRouterProps.builder()

    /**
     * @param listeners Listener specification for the VirtualRouter.
     */
    override fun listeners(listeners: List<VirtualRouterListener>) {
      cdkBuilder.listeners(listeners.map(VirtualRouterListener::unwrap))
    }

    /**
     * @param listeners Listener specification for the VirtualRouter.
     */
    override fun listeners(vararg listeners: VirtualRouterListener): Unit =
        listeners(listeners.toList())

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

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualRouterProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualRouterProps,
  ) : CdkObject(cdkObject), VirtualRouterProps {
    /**
     * Listener specification for the VirtualRouter.
     *
     * Default: - A listener on HTTP port 8080
     */
    override fun listeners(): List<VirtualRouterListener> =
        unwrap(this).getListeners()?.map(VirtualRouterListener::wrap) ?: emptyList()

    /**
     * The Mesh which the VirtualRouter belongs to.
     */
    override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    /**
     * The name of the VirtualRouter.
     *
     * Default: - A name is automatically determined
     */
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

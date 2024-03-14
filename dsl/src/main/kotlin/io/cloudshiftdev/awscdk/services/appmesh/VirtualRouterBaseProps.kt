package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface VirtualRouterBaseProps {
  /**
   * Listener specification for the VirtualRouter.
   *
   * Default: - A listener on HTTP port 8080
   */
  public fun listeners(): List<VirtualRouterListener> =
      unwrap(this).getListeners()?.map(VirtualRouterListener::wrap) ?: emptyList()

  /**
   * The name of the VirtualRouter.
   *
   * Default: - A name is automatically determined
   */
  public fun virtualRouterName(): String? = unwrap(this).getVirtualRouterName()

  /**
   * A builder for [VirtualRouterBaseProps]
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
     * @param virtualRouterName The name of the VirtualRouter.
     */
    public fun virtualRouterName(virtualRouterName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualRouterBaseProps.Builder =
        software.amazon.awscdk.services.appmesh.VirtualRouterBaseProps.builder()

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
     * @param virtualRouterName The name of the VirtualRouter.
     */
    override fun virtualRouterName(virtualRouterName: String) {
      cdkBuilder.virtualRouterName(virtualRouterName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualRouterBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.VirtualRouterBaseProps,
  ) : VirtualRouterBaseProps {
    /**
     * Listener specification for the VirtualRouter.
     *
     * Default: - A listener on HTTP port 8080
     */
    override fun listeners(): List<VirtualRouterListener> =
        unwrap(this).getListeners()?.map(VirtualRouterListener::wrap) ?: emptyList()

    /**
     * The name of the VirtualRouter.
     *
     * Default: - A name is automatically determined
     */
    override fun virtualRouterName(): String? = unwrap(this).getVirtualRouterName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualRouterBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualRouterBaseProps):
        VirtualRouterBaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualRouterBaseProps):
        software.amazon.awscdk.services.appmesh.VirtualRouterBaseProps = (wrapped as
        Wrapper).cdkObject
  }
}

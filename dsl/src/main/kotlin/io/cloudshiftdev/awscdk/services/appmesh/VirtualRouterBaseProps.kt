package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface VirtualRouterBaseProps {
  public fun listeners(): List<VirtualRouterListener> =
      unwrap(this).getListeners()?.map(VirtualRouterListener::wrap) ?: emptyList()

  public fun virtualRouterName(): String? = unwrap(this).getVirtualRouterName()

  public interface Builder {
    public fun listeners(listeners: List<VirtualRouterListener>)

    public fun listeners(vararg listeners: VirtualRouterListener)

    public fun virtualRouterName(virtualRouterName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualRouterBaseProps.Builder =
        software.amazon.awscdk.services.appmesh.VirtualRouterBaseProps.builder()

    override fun listeners(listeners: List<VirtualRouterListener>) {
      cdkBuilder.listeners(listeners.map(VirtualRouterListener::unwrap))
    }

    override fun listeners(vararg listeners: VirtualRouterListener): Unit =
        listeners(listeners.toList())

    override fun virtualRouterName(virtualRouterName: String) {
      cdkBuilder.virtualRouterName(virtualRouterName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualRouterBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.VirtualRouterBaseProps,
  ) : VirtualRouterBaseProps {
    override fun listeners(): List<VirtualRouterListener> =
        unwrap(this).getListeners()?.map(VirtualRouterListener::wrap) ?: emptyList()

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

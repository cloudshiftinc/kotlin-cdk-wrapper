package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface VirtualRouterListenerConfig {
  public fun listener(): CfnVirtualRouter.VirtualRouterListenerProperty

  public interface Builder {
    public fun listener(listener: CfnVirtualRouter.VirtualRouterListenerProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("768c71cb501fee1746f047f0faf378c8014752ce2588a0572bac13d01e23f6b9")
    public
        fun listener(listener: CfnVirtualRouter.VirtualRouterListenerProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.VirtualRouterListenerConfig.Builder =
        software.amazon.awscdk.services.appmesh.VirtualRouterListenerConfig.builder()

    public override fun listener(listener: CfnVirtualRouter.VirtualRouterListenerProperty) {
      cdkBuilder.listener(listener.let(CfnVirtualRouter.VirtualRouterListenerProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("768c71cb501fee1746f047f0faf378c8014752ce2588a0572bac13d01e23f6b9")
    public override
        fun listener(listener: CfnVirtualRouter.VirtualRouterListenerProperty.Builder.() -> Unit):
        Unit = listener(CfnVirtualRouter.VirtualRouterListenerProperty(listener))

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualRouterListenerConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.VirtualRouterListenerConfig,
  ) : VirtualRouterListenerConfig {
    public override fun listener(): CfnVirtualRouter.VirtualRouterListenerProperty =
        unwrap(this).getListener().let(CfnVirtualRouter.VirtualRouterListenerProperty::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualRouterListenerConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualRouterListenerConfig):
        VirtualRouterListenerConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualRouterListenerConfig):
        software.amazon.awscdk.services.appmesh.VirtualRouterListenerConfig = (wrapped as
        Wrapper).cdkObject
  }
}

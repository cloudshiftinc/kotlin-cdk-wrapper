package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface VirtualNodeListenerConfig {
  public fun listener(): CfnVirtualNode.ListenerProperty

  public interface Builder {
    public fun listener(listener: CfnVirtualNode.ListenerProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a3f8b2f835cee2bab65592bbbe7a640bd1efacf36487c07f3a471b288d59450")
    public fun listener(listener: CfnVirtualNode.ListenerProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig.Builder =
        software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig.builder()

    override fun listener(listener: CfnVirtualNode.ListenerProperty) {
      cdkBuilder.listener(listener.let(CfnVirtualNode.ListenerProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a3f8b2f835cee2bab65592bbbe7a640bd1efacf36487c07f3a471b288d59450")
    override fun listener(listener: CfnVirtualNode.ListenerProperty.Builder.() -> Unit): Unit =
        listener(CfnVirtualNode.ListenerProperty(listener))

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig,
  ) : VirtualNodeListenerConfig {
    override fun listener(): CfnVirtualNode.ListenerProperty =
        unwrap(this).getListener().let(CfnVirtualNode.ListenerProperty::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualNodeListenerConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig):
        VirtualNodeListenerConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualNodeListenerConfig):
        software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig = (wrapped as
        Wrapper).cdkObject
  }
}

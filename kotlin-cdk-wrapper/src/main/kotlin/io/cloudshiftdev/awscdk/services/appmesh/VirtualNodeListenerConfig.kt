@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface VirtualNodeListenerConfig {
  public fun listener(): CfnVirtualNode.ListenerProperty

  @CdkDslMarker
  public interface Builder {
    public fun listener(listener: CfnVirtualNode.ListenerProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0a3f8b2f835cee2bab65592bbbe7a640bd1efacf36487c07f3a471b288d59450")
    override fun listener(listener: CfnVirtualNode.ListenerProperty.Builder.() -> Unit): Unit =
        listener(CfnVirtualNode.ListenerProperty(listener))

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig,
  ) : CdkObject(cdkObject), VirtualNodeListenerConfig {
    override fun listener(): CfnVirtualNode.ListenerProperty =
        unwrap(this).getListener().let(CfnVirtualNode.ListenerProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualNodeListenerConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig):
        VirtualNodeListenerConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualNodeListenerConfig):
        software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.VirtualNodeListenerConfig
  }
}

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface VirtualGatewayListenerConfig {
  /**
   * Single listener config for a VirtualGateway.
   */
  public fun listener(): CfnVirtualGateway.VirtualGatewayListenerProperty

  /**
   * A builder for [VirtualGatewayListenerConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param listener Single listener config for a VirtualGateway. 
     */
    public fun listener(listener: CfnVirtualGateway.VirtualGatewayListenerProperty)

    /**
     * @param listener Single listener config for a VirtualGateway. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4ae19caa59030aae0ac021b242b35f65b707171c469e9b1b6ea6443eaad8a0e5")
    public
        fun listener(listener: CfnVirtualGateway.VirtualGatewayListenerProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.VirtualGatewayListenerConfig.Builder =
        software.amazon.awscdk.services.appmesh.VirtualGatewayListenerConfig.builder()

    /**
     * @param listener Single listener config for a VirtualGateway. 
     */
    override fun listener(listener: CfnVirtualGateway.VirtualGatewayListenerProperty) {
      cdkBuilder.listener(listener.let(CfnVirtualGateway.VirtualGatewayListenerProperty::unwrap))
    }

    /**
     * @param listener Single listener config for a VirtualGateway. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4ae19caa59030aae0ac021b242b35f65b707171c469e9b1b6ea6443eaad8a0e5")
    override
        fun listener(listener: CfnVirtualGateway.VirtualGatewayListenerProperty.Builder.() -> Unit):
        Unit = listener(CfnVirtualGateway.VirtualGatewayListenerProperty(listener))

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualGatewayListenerConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.VirtualGatewayListenerConfig,
  ) : VirtualGatewayListenerConfig {
    /**
     * Single listener config for a VirtualGateway.
     */
    override fun listener(): CfnVirtualGateway.VirtualGatewayListenerProperty =
        unwrap(this).getListener().let(CfnVirtualGateway.VirtualGatewayListenerProperty::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualGatewayListenerConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualGatewayListenerConfig):
        VirtualGatewayListenerConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualGatewayListenerConfig):
        software.amazon.awscdk.services.appmesh.VirtualGatewayListenerConfig = (wrapped as
        Wrapper).cdkObject
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for a VirtualRouter listener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * VirtualRouterListenerConfig virtualRouterListenerConfig = VirtualRouterListenerConfig.builder()
 * .listener(VirtualRouterListenerProperty.builder()
 * .portMapping(PortMappingProperty.builder()
 * .port(123)
 * .protocol("protocol")
 * .build())
 * .build())
 * .build();
 * ```
 */
public interface VirtualRouterListenerConfig {
  /**
   * Single listener config for a VirtualRouter.
   */
  public fun listener(): CfnVirtualRouter.VirtualRouterListenerProperty

  /**
   * A builder for [VirtualRouterListenerConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param listener Single listener config for a VirtualRouter. 
     */
    public fun listener(listener: CfnVirtualRouter.VirtualRouterListenerProperty)

    /**
     * @param listener Single listener config for a VirtualRouter. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("768c71cb501fee1746f047f0faf378c8014752ce2588a0572bac13d01e23f6b9")
    public fun listener(listener: CfnVirtualRouter.VirtualRouterListenerProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.VirtualRouterListenerConfig.Builder =
        software.amazon.awscdk.services.appmesh.VirtualRouterListenerConfig.builder()

    /**
     * @param listener Single listener config for a VirtualRouter. 
     */
    override fun listener(listener: CfnVirtualRouter.VirtualRouterListenerProperty) {
      cdkBuilder.listener(listener.let(CfnVirtualRouter.VirtualRouterListenerProperty.Companion::unwrap))
    }

    /**
     * @param listener Single listener config for a VirtualRouter. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("768c71cb501fee1746f047f0faf378c8014752ce2588a0572bac13d01e23f6b9")
    override
        fun listener(listener: CfnVirtualRouter.VirtualRouterListenerProperty.Builder.() -> Unit):
        Unit = listener(CfnVirtualRouter.VirtualRouterListenerProperty(listener))

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualRouterListenerConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.VirtualRouterListenerConfig,
  ) : CdkObject(cdkObject), VirtualRouterListenerConfig {
    /**
     * Single listener config for a VirtualRouter.
     */
    override fun listener(): CfnVirtualRouter.VirtualRouterListenerProperty =
        unwrap(this).getListener().let(CfnVirtualRouter.VirtualRouterListenerProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualRouterListenerConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualRouterListenerConfig):
        VirtualRouterListenerConfig = CdkObjectWrappers.wrap(cdkObject) as?
        VirtualRouterListenerConfig ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualRouterListenerConfig):
        software.amazon.awscdk.services.appmesh.VirtualRouterListenerConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.VirtualRouterListenerConfig
  }
}

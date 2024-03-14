package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface VirtualServiceProviderConfig {
  /**
   * Mesh the Provider is using.
   *
   * Default: - none
   */
  public fun mesh(): IMesh

  /**
   * Virtual Node based provider.
   *
   * Default: - none
   */
  public fun virtualNodeProvider(): CfnVirtualService.VirtualNodeServiceProviderProperty? =
      unwrap(this).getVirtualNodeProvider()?.let(CfnVirtualService.VirtualNodeServiceProviderProperty::wrap)

  /**
   * Virtual Router based provider.
   *
   * Default: - none
   */
  public fun virtualRouterProvider(): CfnVirtualService.VirtualRouterServiceProviderProperty? =
      unwrap(this).getVirtualRouterProvider()?.let(CfnVirtualService.VirtualRouterServiceProviderProperty::wrap)

  /**
   * A builder for [VirtualServiceProviderConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param mesh Mesh the Provider is using. 
     */
    public fun mesh(mesh: IMesh)

    /**
     * @param virtualNodeProvider Virtual Node based provider.
     */
    public
        fun virtualNodeProvider(virtualNodeProvider: CfnVirtualService.VirtualNodeServiceProviderProperty)

    /**
     * @param virtualNodeProvider Virtual Node based provider.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c00b53dec9177cbcf9f1ba1697485c0fce397296747f40401077874542aa5b85")
    public
        fun virtualNodeProvider(virtualNodeProvider: CfnVirtualService.VirtualNodeServiceProviderProperty.Builder.() -> Unit)

    /**
     * @param virtualRouterProvider Virtual Router based provider.
     */
    public
        fun virtualRouterProvider(virtualRouterProvider: CfnVirtualService.VirtualRouterServiceProviderProperty)

    /**
     * @param virtualRouterProvider Virtual Router based provider.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c1d67054138560b169cf3e498777aeee7451e48ab598dd33aef6b116d6b66df")
    public
        fun virtualRouterProvider(virtualRouterProvider: CfnVirtualService.VirtualRouterServiceProviderProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.VirtualServiceProviderConfig.Builder =
        software.amazon.awscdk.services.appmesh.VirtualServiceProviderConfig.builder()

    /**
     * @param mesh Mesh the Provider is using. 
     */
    override fun mesh(mesh: IMesh) {
      cdkBuilder.mesh(mesh.let(IMesh::unwrap))
    }

    /**
     * @param virtualNodeProvider Virtual Node based provider.
     */
    override
        fun virtualNodeProvider(virtualNodeProvider: CfnVirtualService.VirtualNodeServiceProviderProperty) {
      cdkBuilder.virtualNodeProvider(virtualNodeProvider.let(CfnVirtualService.VirtualNodeServiceProviderProperty::unwrap))
    }

    /**
     * @param virtualNodeProvider Virtual Node based provider.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c00b53dec9177cbcf9f1ba1697485c0fce397296747f40401077874542aa5b85")
    override
        fun virtualNodeProvider(virtualNodeProvider: CfnVirtualService.VirtualNodeServiceProviderProperty.Builder.() -> Unit):
        Unit =
        virtualNodeProvider(CfnVirtualService.VirtualNodeServiceProviderProperty(virtualNodeProvider))

    /**
     * @param virtualRouterProvider Virtual Router based provider.
     */
    override
        fun virtualRouterProvider(virtualRouterProvider: CfnVirtualService.VirtualRouterServiceProviderProperty) {
      cdkBuilder.virtualRouterProvider(virtualRouterProvider.let(CfnVirtualService.VirtualRouterServiceProviderProperty::unwrap))
    }

    /**
     * @param virtualRouterProvider Virtual Router based provider.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c1d67054138560b169cf3e498777aeee7451e48ab598dd33aef6b116d6b66df")
    override
        fun virtualRouterProvider(virtualRouterProvider: CfnVirtualService.VirtualRouterServiceProviderProperty.Builder.() -> Unit):
        Unit =
        virtualRouterProvider(CfnVirtualService.VirtualRouterServiceProviderProperty(virtualRouterProvider))

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualServiceProviderConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.VirtualServiceProviderConfig,
  ) : VirtualServiceProviderConfig {
    /**
     * Mesh the Provider is using.
     *
     * Default: - none
     */
    override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    /**
     * Virtual Node based provider.
     *
     * Default: - none
     */
    override fun virtualNodeProvider(): CfnVirtualService.VirtualNodeServiceProviderProperty? =
        unwrap(this).getVirtualNodeProvider()?.let(CfnVirtualService.VirtualNodeServiceProviderProperty::wrap)

    /**
     * Virtual Router based provider.
     *
     * Default: - none
     */
    override fun virtualRouterProvider(): CfnVirtualService.VirtualRouterServiceProviderProperty? =
        unwrap(this).getVirtualRouterProvider()?.let(CfnVirtualService.VirtualRouterServiceProviderProperty::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualServiceProviderConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualServiceProviderConfig):
        VirtualServiceProviderConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualServiceProviderConfig):
        software.amazon.awscdk.services.appmesh.VirtualServiceProviderConfig = (wrapped as
        Wrapper).cdkObject
  }
}

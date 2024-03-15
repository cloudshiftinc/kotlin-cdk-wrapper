@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface VirtualServiceProviderConfig {
  public fun mesh(): IMesh

  public fun virtualNodeProvider(): CfnVirtualService.VirtualNodeServiceProviderProperty? =
      unwrap(this).getVirtualNodeProvider()?.let(CfnVirtualService.VirtualNodeServiceProviderProperty::wrap)

  public fun virtualRouterProvider(): CfnVirtualService.VirtualRouterServiceProviderProperty? =
      unwrap(this).getVirtualRouterProvider()?.let(CfnVirtualService.VirtualRouterServiceProviderProperty::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun mesh(mesh: IMesh)

    public
        fun virtualNodeProvider(virtualNodeProvider: CfnVirtualService.VirtualNodeServiceProviderProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c00b53dec9177cbcf9f1ba1697485c0fce397296747f40401077874542aa5b85")
    public
        fun virtualNodeProvider(virtualNodeProvider: CfnVirtualService.VirtualNodeServiceProviderProperty.Builder.() -> Unit)

    public
        fun virtualRouterProvider(virtualRouterProvider: CfnVirtualService.VirtualRouterServiceProviderProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c1d67054138560b169cf3e498777aeee7451e48ab598dd33aef6b116d6b66df")
    public
        fun virtualRouterProvider(virtualRouterProvider: CfnVirtualService.VirtualRouterServiceProviderProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.VirtualServiceProviderConfig.Builder =
        software.amazon.awscdk.services.appmesh.VirtualServiceProviderConfig.builder()

    override fun mesh(mesh: IMesh) {
      cdkBuilder.mesh(mesh.let(IMesh::unwrap))
    }

    override
        fun virtualNodeProvider(virtualNodeProvider: CfnVirtualService.VirtualNodeServiceProviderProperty) {
      cdkBuilder.virtualNodeProvider(virtualNodeProvider.let(CfnVirtualService.VirtualNodeServiceProviderProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c00b53dec9177cbcf9f1ba1697485c0fce397296747f40401077874542aa5b85")
    override
        fun virtualNodeProvider(virtualNodeProvider: CfnVirtualService.VirtualNodeServiceProviderProperty.Builder.() -> Unit):
        Unit =
        virtualNodeProvider(CfnVirtualService.VirtualNodeServiceProviderProperty(virtualNodeProvider))

    override
        fun virtualRouterProvider(virtualRouterProvider: CfnVirtualService.VirtualRouterServiceProviderProperty) {
      cdkBuilder.virtualRouterProvider(virtualRouterProvider.let(CfnVirtualService.VirtualRouterServiceProviderProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c1d67054138560b169cf3e498777aeee7451e48ab598dd33aef6b116d6b66df")
    override
        fun virtualRouterProvider(virtualRouterProvider: CfnVirtualService.VirtualRouterServiceProviderProperty.Builder.() -> Unit):
        Unit =
        virtualRouterProvider(CfnVirtualService.VirtualRouterServiceProviderProperty(virtualRouterProvider))

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualServiceProviderConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualServiceProviderConfig,
  ) : CdkObject(cdkObject), VirtualServiceProviderConfig {
    override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    override fun virtualNodeProvider(): CfnVirtualService.VirtualNodeServiceProviderProperty? =
        unwrap(this).getVirtualNodeProvider()?.let(CfnVirtualService.VirtualNodeServiceProviderProperty::wrap)

    override fun virtualRouterProvider(): CfnVirtualService.VirtualRouterServiceProviderProperty? =
        unwrap(this).getVirtualRouterProvider()?.let(CfnVirtualService.VirtualRouterServiceProviderProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualServiceProviderConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualServiceProviderConfig):
        VirtualServiceProviderConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualServiceProviderConfig):
        software.amazon.awscdk.services.appmesh.VirtualServiceProviderConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.VirtualServiceProviderConfig
  }
}

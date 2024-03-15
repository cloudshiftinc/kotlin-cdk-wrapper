@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface VirtualServiceProps {
  public fun virtualServiceName(): String? = unwrap(this).getVirtualServiceName()

  public fun virtualServiceProvider(): VirtualServiceProvider

  @CdkDslMarker
  public interface Builder {
    public fun virtualServiceName(virtualServiceName: String)

    public fun virtualServiceProvider(virtualServiceProvider: VirtualServiceProvider)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualServiceProps.Builder =
        software.amazon.awscdk.services.appmesh.VirtualServiceProps.builder()

    override fun virtualServiceName(virtualServiceName: String) {
      cdkBuilder.virtualServiceName(virtualServiceName)
    }

    override fun virtualServiceProvider(virtualServiceProvider: VirtualServiceProvider) {
      cdkBuilder.virtualServiceProvider(virtualServiceProvider.let(VirtualServiceProvider::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualServiceProps,
  ) : CdkObject(cdkObject), VirtualServiceProps {
    override fun virtualServiceName(): String? = unwrap(this).getVirtualServiceName()

    override fun virtualServiceProvider(): VirtualServiceProvider =
        unwrap(this).getVirtualServiceProvider().let(VirtualServiceProvider::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualServiceProps):
        VirtualServiceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualServiceProps):
        software.amazon.awscdk.services.appmesh.VirtualServiceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.VirtualServiceProps
  }
}

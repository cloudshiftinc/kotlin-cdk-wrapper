@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface VirtualServiceAttributes {
  public fun mesh(): IMesh

  public fun virtualServiceName(): String

  @CdkDslMarker
  public interface Builder {
    public fun mesh(mesh: IMesh)

    public fun virtualServiceName(virtualServiceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualServiceAttributes.Builder
        = software.amazon.awscdk.services.appmesh.VirtualServiceAttributes.builder()

    override fun mesh(mesh: IMesh) {
      cdkBuilder.mesh(mesh.let(IMesh::unwrap))
    }

    override fun virtualServiceName(virtualServiceName: String) {
      cdkBuilder.virtualServiceName(virtualServiceName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualServiceAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualServiceAttributes,
  ) : CdkObject(cdkObject), VirtualServiceAttributes {
    override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    override fun virtualServiceName(): String = unwrap(this).getVirtualServiceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualServiceAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualServiceAttributes):
        VirtualServiceAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualServiceAttributes):
        software.amazon.awscdk.services.appmesh.VirtualServiceAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.VirtualServiceAttributes
  }
}

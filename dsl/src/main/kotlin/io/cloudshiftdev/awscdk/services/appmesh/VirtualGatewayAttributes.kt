package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.String
import kotlin.Unit

public interface VirtualGatewayAttributes {
  public fun mesh(): IMesh

  public fun virtualGatewayName(): String

  public interface Builder {
    public fun mesh(mesh: IMesh) {
    }

    public fun virtualGatewayName(virtualGatewayName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualGatewayAttributes.Builder
        = software.amazon.awscdk.services.appmesh.VirtualGatewayAttributes.builder()

    public override fun mesh(mesh: IMesh) {
      cdkBuilder.mesh(mesh.let(IMesh::unwrap))
    }

    public override fun virtualGatewayName(virtualGatewayName: String) {
      cdkBuilder.virtualGatewayName(virtualGatewayName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualGatewayAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.VirtualGatewayAttributes,
  ) : VirtualGatewayAttributes {
    public override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    public override fun virtualGatewayName(): String = unwrap(this).getVirtualGatewayName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualGatewayAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualGatewayAttributes):
        VirtualGatewayAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualGatewayAttributes):
        software.amazon.awscdk.services.appmesh.VirtualGatewayAttributes = (wrapped as
        Wrapper).cdkObject
  }
}

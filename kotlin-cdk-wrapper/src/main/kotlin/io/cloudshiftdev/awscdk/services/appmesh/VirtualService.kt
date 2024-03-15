@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class VirtualService internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.VirtualService,
) : Resource(cdkObject), IVirtualService {
  public override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

  public override fun virtualServiceArn(): String = unwrap(this).getVirtualServiceArn()

  public override fun virtualServiceName(): String = unwrap(this).getVirtualServiceName()

  @CdkDslMarker
  public interface Builder {
    public fun virtualServiceName(virtualServiceName: String)

    public fun virtualServiceProvider(virtualServiceProvider: VirtualServiceProvider)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualService.Builder =
        software.amazon.awscdk.services.appmesh.VirtualService.Builder.create(scope, id)

    override fun virtualServiceName(virtualServiceName: String) {
      cdkBuilder.virtualServiceName(virtualServiceName)
    }

    override fun virtualServiceProvider(virtualServiceProvider: VirtualServiceProvider) {
      cdkBuilder.virtualServiceProvider(virtualServiceProvider.let(VirtualServiceProvider::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualService = cdkBuilder.build()
  }

  public companion object {
    public fun fromVirtualServiceArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      virtualServiceArn: String,
    ): IVirtualService =
        software.amazon.awscdk.services.appmesh.VirtualService.fromVirtualServiceArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, virtualServiceArn).let(IVirtualService::wrap)

    public fun fromVirtualServiceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VirtualServiceAttributes,
    ): IVirtualService =
        software.amazon.awscdk.services.appmesh.VirtualService.fromVirtualServiceAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(VirtualServiceAttributes::unwrap)).let(IVirtualService::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e44e83423747896d1527f34cf795fa3dd9a184057172c64cd142a5e0717c08e8")
    public fun fromVirtualServiceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VirtualServiceAttributes.Builder.() -> Unit,
    ): IVirtualService = fromVirtualServiceAttributes(scope, id, VirtualServiceAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): VirtualService {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return VirtualService(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualService):
        VirtualService = VirtualService(cdkObject)

    internal fun unwrap(wrapped: VirtualService):
        software.amazon.awscdk.services.appmesh.VirtualService = wrapped.cdkObject
  }
}
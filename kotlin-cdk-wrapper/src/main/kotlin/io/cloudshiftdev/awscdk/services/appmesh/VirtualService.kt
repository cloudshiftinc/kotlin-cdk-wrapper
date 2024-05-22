@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * VirtualService represents a service inside an AppMesh.
 *
 * It routes traffic either to a Virtual Node or to a Virtual Router.
 *
 * Example:
 *
 * ```
 * Mesh mesh;
 * VirtualNode node = VirtualNode.Builder.create(this, "node")
 * .mesh(mesh)
 * .serviceDiscovery(ServiceDiscovery.dns("node"))
 * .build();
 * VirtualService virtualService = VirtualService.Builder.create(this, "service-1")
 * .virtualServiceProvider(VirtualServiceProvider.virtualNode(node))
 * .virtualServiceName("service1.domain.local")
 * .build();
 * node.addBackend(Backend.virtualService(virtualService));
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/app-mesh/latest/userguide/virtual_services.html)
 */
public open class VirtualService(
  cdkObject: software.amazon.awscdk.services.appmesh.VirtualService,
) : Resource(cdkObject), IVirtualService {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: VirtualServiceProps,
  ) :
      this(software.amazon.awscdk.services.appmesh.VirtualService(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(VirtualServiceProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: VirtualServiceProps.Builder.() -> Unit,
  ) : this(scope, id, VirtualServiceProps(props)
  )

  /**
   * The Mesh which the VirtualService belongs to.
   */
  public override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

  /**
   * The Amazon Resource Name (ARN) for the virtual service.
   */
  public override fun virtualServiceArn(): String = unwrap(this).getVirtualServiceArn()

  /**
   * The name of the VirtualService, it is recommended this follows the fully-qualified domain name
   * format.
   */
  public override fun virtualServiceName(): String = unwrap(this).getVirtualServiceName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.appmesh.VirtualService].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the VirtualService.
     *
     * It is recommended this follows the fully-qualified domain name format,
     * such as "my-service.default.svc.cluster.local".
     *
     * Example value: `service.domain.local`
     *
     * Default: - A name is automatically generated
     *
     * @param virtualServiceName The name of the VirtualService. 
     */
    public fun virtualServiceName(virtualServiceName: String)

    /**
     * The VirtualNode or VirtualRouter which the VirtualService uses as its provider.
     *
     * @param virtualServiceProvider The VirtualNode or VirtualRouter which the VirtualService uses
     * as its provider. 
     */
    public fun virtualServiceProvider(virtualServiceProvider: VirtualServiceProvider)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualService.Builder =
        software.amazon.awscdk.services.appmesh.VirtualService.Builder.create(scope, id)

    /**
     * The name of the VirtualService.
     *
     * It is recommended this follows the fully-qualified domain name format,
     * such as "my-service.default.svc.cluster.local".
     *
     * Example value: `service.domain.local`
     *
     * Default: - A name is automatically generated
     *
     * @param virtualServiceName The name of the VirtualService. 
     */
    override fun virtualServiceName(virtualServiceName: String) {
      cdkBuilder.virtualServiceName(virtualServiceName)
    }

    /**
     * The VirtualNode or VirtualRouter which the VirtualService uses as its provider.
     *
     * @param virtualServiceProvider The VirtualNode or VirtualRouter which the VirtualService uses
     * as its provider. 
     */
    override fun virtualServiceProvider(virtualServiceProvider: VirtualServiceProvider) {
      cdkBuilder.virtualServiceProvider(virtualServiceProvider.let(VirtualServiceProvider.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualService = cdkBuilder.build()
  }

  public companion object {
    public fun fromVirtualServiceArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      virtualServiceArn: String,
    ): IVirtualService =
        software.amazon.awscdk.services.appmesh.VirtualService.fromVirtualServiceArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, virtualServiceArn).let(IVirtualService::wrap)

    public fun fromVirtualServiceAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: VirtualServiceAttributes,
    ): IVirtualService =
        software.amazon.awscdk.services.appmesh.VirtualService.fromVirtualServiceAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(VirtualServiceAttributes.Companion::unwrap)).let(IVirtualService::wrap)

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
        software.amazon.awscdk.services.appmesh.VirtualService = wrapped.cdkObject as
        software.amazon.awscdk.services.appmesh.VirtualService
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The properties applied to the VirtualService being defined.
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
 */
public interface VirtualServiceProps {
  /**
   * The name of the VirtualService.
   *
   * It is recommended this follows the fully-qualified domain name format,
   * such as "my-service.default.svc.cluster.local".
   *
   * Example value: `service.domain.local`
   *
   * Default: - A name is automatically generated
   */
  public fun virtualServiceName(): String? = unwrap(this).getVirtualServiceName()

  /**
   * The VirtualNode or VirtualRouter which the VirtualService uses as its provider.
   */
  public fun virtualServiceProvider(): VirtualServiceProvider

  /**
   * A builder for [VirtualServiceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param virtualServiceName The name of the VirtualService.
     * It is recommended this follows the fully-qualified domain name format,
     * such as "my-service.default.svc.cluster.local".
     *
     * Example value: `service.domain.local`
     */
    public fun virtualServiceName(virtualServiceName: String)

    /**
     * @param virtualServiceProvider The VirtualNode or VirtualRouter which the VirtualService uses
     * as its provider. 
     */
    public fun virtualServiceProvider(virtualServiceProvider: VirtualServiceProvider)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.VirtualServiceProps.Builder =
        software.amazon.awscdk.services.appmesh.VirtualServiceProps.builder()

    /**
     * @param virtualServiceName The name of the VirtualService.
     * It is recommended this follows the fully-qualified domain name format,
     * such as "my-service.default.svc.cluster.local".
     *
     * Example value: `service.domain.local`
     */
    override fun virtualServiceName(virtualServiceName: String) {
      cdkBuilder.virtualServiceName(virtualServiceName)
    }

    /**
     * @param virtualServiceProvider The VirtualNode or VirtualRouter which the VirtualService uses
     * as its provider. 
     */
    override fun virtualServiceProvider(virtualServiceProvider: VirtualServiceProvider) {
      cdkBuilder.virtualServiceProvider(virtualServiceProvider.let(VirtualServiceProvider.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.VirtualServiceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.VirtualServiceProps,
  ) : CdkObject(cdkObject),
      VirtualServiceProps {
    /**
     * The name of the VirtualService.
     *
     * It is recommended this follows the fully-qualified domain name format,
     * such as "my-service.default.svc.cluster.local".
     *
     * Example value: `service.domain.local`
     *
     * Default: - A name is automatically generated
     */
    override fun virtualServiceName(): String? = unwrap(this).getVirtualServiceName()

    /**
     * The VirtualNode or VirtualRouter which the VirtualService uses as its provider.
     */
    override fun virtualServiceProvider(): VirtualServiceProvider =
        unwrap(this).getVirtualServiceProvider().let(VirtualServiceProvider::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VirtualServiceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.VirtualServiceProps):
        VirtualServiceProps = CdkObjectWrappers.wrap(cdkObject) as? VirtualServiceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: VirtualServiceProps):
        software.amazon.awscdk.services.appmesh.VirtualServiceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.VirtualServiceProps
  }
}

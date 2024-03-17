@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The set of properties used when creating a Mesh.
 *
 * Example:
 *
 * ```
 * Stack infraStack;
 * Stack appStack;
 * Mesh mesh = Mesh.Builder.create(infraStack, "AppMesh")
 * .meshName("myAwsMesh")
 * .egressFilter(MeshFilterType.ALLOW_ALL)
 * .build();
 * // the VirtualRouter will belong to 'appStack',
 * // even though the Mesh belongs to 'infraStack'
 * VirtualRouter router = VirtualRouter.Builder.create(appStack, "router")
 * .mesh(mesh) // notice that mesh is a required property when creating a router with the 'new'
 * statement
 * .listeners(List.of(VirtualRouterListener.http(8081)))
 * .build();
 * ```
 */
public interface MeshProps {
  /**
   * Egress filter to be applied to the Mesh.
   *
   * Default: DROP_ALL
   */
  public fun egressFilter(): MeshFilterType? =
      unwrap(this).getEgressFilter()?.let(MeshFilterType::wrap)

  /**
   * The name of the Mesh being defined.
   *
   * Default: - A name is automatically generated
   */
  public fun meshName(): String? = unwrap(this).getMeshName()

  /**
   * Defines how upstream clients will discover VirtualNodes in the Mesh.
   *
   * Default: - No Service Discovery
   */
  public fun serviceDiscovery(): MeshServiceDiscovery? =
      unwrap(this).getServiceDiscovery()?.let(MeshServiceDiscovery::wrap)

  /**
   * A builder for [MeshProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param egressFilter Egress filter to be applied to the Mesh.
     */
    public fun egressFilter(egressFilter: MeshFilterType)

    /**
     * @param meshName The name of the Mesh being defined.
     */
    public fun meshName(meshName: String)

    /**
     * @param serviceDiscovery Defines how upstream clients will discover VirtualNodes in the Mesh.
     */
    public fun serviceDiscovery(serviceDiscovery: MeshServiceDiscovery)

    /**
     * @param serviceDiscovery Defines how upstream clients will discover VirtualNodes in the Mesh.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5242b4ab83abca62119e35875958f2a0bc4fe308084a0dc64751ecd779380d30")
    public fun serviceDiscovery(serviceDiscovery: MeshServiceDiscovery.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.MeshProps.Builder =
        software.amazon.awscdk.services.appmesh.MeshProps.builder()

    /**
     * @param egressFilter Egress filter to be applied to the Mesh.
     */
    override fun egressFilter(egressFilter: MeshFilterType) {
      cdkBuilder.egressFilter(egressFilter.let(MeshFilterType::unwrap))
    }

    /**
     * @param meshName The name of the Mesh being defined.
     */
    override fun meshName(meshName: String) {
      cdkBuilder.meshName(meshName)
    }

    /**
     * @param serviceDiscovery Defines how upstream clients will discover VirtualNodes in the Mesh.
     */
    override fun serviceDiscovery(serviceDiscovery: MeshServiceDiscovery) {
      cdkBuilder.serviceDiscovery(serviceDiscovery.let(MeshServiceDiscovery::unwrap))
    }

    /**
     * @param serviceDiscovery Defines how upstream clients will discover VirtualNodes in the Mesh.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5242b4ab83abca62119e35875958f2a0bc4fe308084a0dc64751ecd779380d30")
    override fun serviceDiscovery(serviceDiscovery: MeshServiceDiscovery.Builder.() -> Unit): Unit =
        serviceDiscovery(MeshServiceDiscovery(serviceDiscovery))

    public fun build(): software.amazon.awscdk.services.appmesh.MeshProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.MeshProps,
  ) : CdkObject(cdkObject), MeshProps {
    /**
     * Egress filter to be applied to the Mesh.
     *
     * Default: DROP_ALL
     */
    override fun egressFilter(): MeshFilterType? =
        unwrap(this).getEgressFilter()?.let(MeshFilterType::wrap)

    /**
     * The name of the Mesh being defined.
     *
     * Default: - A name is automatically generated
     */
    override fun meshName(): String? = unwrap(this).getMeshName()

    /**
     * Defines how upstream clients will discover VirtualNodes in the Mesh.
     *
     * Default: - No Service Discovery
     */
    override fun serviceDiscovery(): MeshServiceDiscovery? =
        unwrap(this).getServiceDiscovery()?.let(MeshServiceDiscovery::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MeshProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.MeshProps): MeshProps =
        CdkObjectWrappers.wrap(cdkObject) as? MeshProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: MeshProps): software.amazon.awscdk.services.appmesh.MeshProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.MeshProps
  }
}

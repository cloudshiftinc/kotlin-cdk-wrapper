@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualService
import software.amazon.awscdk.services.appmesh.IMesh
import software.amazon.awscdk.services.appmesh.VirtualServiceProviderConfig

/**
 * Properties for a VirtualService provider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * Mesh mesh;
 * VirtualServiceProviderConfig virtualServiceProviderConfig =
 * VirtualServiceProviderConfig.builder()
 * .mesh(mesh)
 * // the properties below are optional
 * .virtualNodeProvider(VirtualNodeServiceProviderProperty.builder()
 * .virtualNodeName("virtualNodeName")
 * .build())
 * .virtualRouterProvider(VirtualRouterServiceProviderProperty.builder()
 * .virtualRouterName("virtualRouterName")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class VirtualServiceProviderConfigDsl {
  private val cdkBuilder: VirtualServiceProviderConfig.Builder =
      VirtualServiceProviderConfig.builder()

  /**
   * @param mesh Mesh the Provider is using. 
   */
  public fun mesh(mesh: IMesh) {
    cdkBuilder.mesh(mesh)
  }

  /**
   * @param virtualNodeProvider Virtual Node based provider.
   */
  public
      fun virtualNodeProvider(virtualNodeProvider: CfnVirtualServiceVirtualNodeServiceProviderPropertyDsl.() -> Unit
      = {}) {
    val builder = CfnVirtualServiceVirtualNodeServiceProviderPropertyDsl()
    builder.apply(virtualNodeProvider)
    cdkBuilder.virtualNodeProvider(builder.build())
  }

  /**
   * @param virtualNodeProvider Virtual Node based provider.
   */
  public
      fun virtualNodeProvider(virtualNodeProvider: CfnVirtualService.VirtualNodeServiceProviderProperty) {
    cdkBuilder.virtualNodeProvider(virtualNodeProvider)
  }

  /**
   * @param virtualRouterProvider Virtual Router based provider.
   */
  public
      fun virtualRouterProvider(virtualRouterProvider: CfnVirtualServiceVirtualRouterServiceProviderPropertyDsl.() -> Unit
      = {}) {
    val builder = CfnVirtualServiceVirtualRouterServiceProviderPropertyDsl()
    builder.apply(virtualRouterProvider)
    cdkBuilder.virtualRouterProvider(builder.build())
  }

  /**
   * @param virtualRouterProvider Virtual Router based provider.
   */
  public
      fun virtualRouterProvider(virtualRouterProvider: CfnVirtualService.VirtualRouterServiceProviderProperty) {
    cdkBuilder.virtualRouterProvider(virtualRouterProvider)
  }

  public fun build(): VirtualServiceProviderConfig = cdkBuilder.build()
}

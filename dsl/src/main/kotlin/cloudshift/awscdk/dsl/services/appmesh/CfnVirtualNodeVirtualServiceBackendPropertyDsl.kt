@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeVirtualServiceBackendPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.VirtualServiceBackendProperty.Builder =
      CfnVirtualNode.VirtualServiceBackendProperty.builder()

  /**
   * @param clientPolicy A reference to an object that represents the client policy for a backend.
   */
  public fun clientPolicy(clientPolicy: IResolvable) {
    cdkBuilder.clientPolicy(clientPolicy)
  }

  /**
   * @param clientPolicy A reference to an object that represents the client policy for a backend.
   */
  public fun clientPolicy(clientPolicy: CfnVirtualNode.ClientPolicyProperty) {
    cdkBuilder.clientPolicy(clientPolicy)
  }

  /**
   * @param virtualServiceName The name of the virtual service that is acting as a virtual node
   * backend. 
   *
   * App Mesh doesn't validate the existence of those virtual services specified in backends. This
   * is to prevent a cyclic dependency between virtual nodes and virtual services creation. Make sure
   * the virtual service name is correct. The virtual service can be created afterwards if it doesn't
   * already exist.
   */
  public fun virtualServiceName(virtualServiceName: String) {
    cdkBuilder.virtualServiceName(virtualServiceName)
  }

  public fun build(): CfnVirtualNode.VirtualServiceBackendProperty = cdkBuilder.build()
}

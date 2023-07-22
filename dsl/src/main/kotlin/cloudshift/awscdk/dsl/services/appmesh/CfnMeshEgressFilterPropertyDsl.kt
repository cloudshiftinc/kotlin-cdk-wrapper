@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnMesh

@CdkDslMarker
public class CfnMeshEgressFilterPropertyDsl {
  private val cdkBuilder: CfnMesh.EgressFilterProperty.Builder =
      CfnMesh.EgressFilterProperty.builder()

  /**
   * @param type The egress filter type. 
   * By default, the type is `DROP_ALL` , which allows egress only from virtual nodes to other
   * defined resources in the service mesh (and any traffic to `*.amazonaws.com` for AWS API calls).
   * You can set the egress filter type to `ALLOW_ALL` to allow egress to any endpoint inside or
   * outside of the service mesh.
   *
   *
   * If you specify any backends on a virtual node when using `ALLOW_ALL` , you must specifiy all
   * egress for that virtual node as backends. Otherwise, `ALLOW_ALL` will no longer work for that
   * virtual node.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnMesh.EgressFilterProperty = cdkBuilder.build()
}

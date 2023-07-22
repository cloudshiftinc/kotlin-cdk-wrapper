@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway
import software.amazon.awscdk.services.appmesh.CfnVirtualGatewayProps

@CdkDslMarker
public class CfnVirtualGatewayPropsDsl {
  private val cdkBuilder: CfnVirtualGatewayProps.Builder = CfnVirtualGatewayProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param meshName The name of the service mesh that the virtual gateway resides in. 
   */
  public fun meshName(meshName: String) {
    cdkBuilder.meshName(meshName)
  }

  /**
   * @param meshOwner The AWS IAM account ID of the service mesh owner.
   * If the account ID is not your own, then it's the ID of the account that shared the mesh with
   * your account. For more information about mesh sharing, see [Working with shared
   * meshes](https://docs.aws.amazon.com/app-mesh/latest/userguide/sharing.html) .
   */
  public fun meshOwner(meshOwner: String) {
    cdkBuilder.meshOwner(meshOwner)
  }

  /**
   * @param spec The specifications of the virtual gateway. 
   */
  public fun spec(spec: IResolvable) {
    cdkBuilder.spec(spec)
  }

  /**
   * @param spec The specifications of the virtual gateway. 
   */
  public fun spec(spec: CfnVirtualGateway.VirtualGatewaySpecProperty) {
    cdkBuilder.spec(spec)
  }

  /**
   * @param tags Optional metadata that you can apply to the virtual gateway to assist with
   * categorization and organization.
   * Each tag consists of a key and an optional value, both of which you define. Tag keys can have a
   * maximum character length of 128 characters, and tag values can have a maximum length of 256
   * characters.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Optional metadata that you can apply to the virtual gateway to assist with
   * categorization and organization.
   * Each tag consists of a key and an optional value, both of which you define. Tag keys can have a
   * maximum character length of 128 characters, and tag values can have a maximum length of 256
   * characters.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param virtualGatewayName The name of the virtual gateway.
   */
  public fun virtualGatewayName(virtualGatewayName: String) {
    cdkBuilder.virtualGatewayName(virtualGatewayName)
  }

  public fun build(): CfnVirtualGatewayProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}

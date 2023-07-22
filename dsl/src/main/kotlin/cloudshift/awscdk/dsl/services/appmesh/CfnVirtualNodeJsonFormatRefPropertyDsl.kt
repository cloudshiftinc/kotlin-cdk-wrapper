@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeJsonFormatRefPropertyDsl {
  private val cdkBuilder: CfnVirtualNode.JsonFormatRefProperty.Builder =
      CfnVirtualNode.JsonFormatRefProperty.builder()

  /**
   * @param key The specified key for the JSON. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The specified value for the JSON. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnVirtualNode.JsonFormatRefProperty = cdkBuilder.build()
}

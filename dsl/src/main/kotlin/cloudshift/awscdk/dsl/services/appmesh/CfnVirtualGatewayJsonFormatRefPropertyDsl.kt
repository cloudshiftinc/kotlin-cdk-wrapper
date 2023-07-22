@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway

@CdkDslMarker
public class CfnVirtualGatewayJsonFormatRefPropertyDsl {
  private val cdkBuilder: CfnVirtualGateway.JsonFormatRefProperty.Builder =
      CfnVirtualGateway.JsonFormatRefProperty.builder()

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

  public fun build(): CfnVirtualGateway.JsonFormatRefProperty = cdkBuilder.build()
}

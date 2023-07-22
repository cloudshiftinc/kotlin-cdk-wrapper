@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents the key value pairs for the JSON.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * JsonFormatRefProperty jsonFormatRefProperty = JsonFormatRefProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-jsonformatref.html)
 */
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

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

@CdkDslMarker
public class CfnVirtualNodeAwsCloudMapInstanceAttributePropertyDsl {
  private val cdkBuilder: CfnVirtualNode.AwsCloudMapInstanceAttributeProperty.Builder =
      CfnVirtualNode.AwsCloudMapInstanceAttributeProperty.builder()

  /**
   * @param key The name of an AWS Cloud Map service instance attribute key. 
   * Any AWS Cloud Map service instance that contains the specified key and value is returned.
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value of an AWS Cloud Map service instance attribute key. 
   * Any AWS Cloud Map service instance that contains the specified key and value is returned.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnVirtualNode.AwsCloudMapInstanceAttributeProperty = cdkBuilder.build()
}

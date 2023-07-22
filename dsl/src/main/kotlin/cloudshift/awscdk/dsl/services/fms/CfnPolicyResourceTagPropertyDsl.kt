@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.fms.CfnPolicy

@CdkDslMarker
public class CfnPolicyResourceTagPropertyDsl {
  private val cdkBuilder: CfnPolicy.ResourceTagProperty.Builder =
      CfnPolicy.ResourceTagProperty.builder()

  /**
   * @param key The resource tag key. 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The resource tag value.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnPolicy.ResourceTagProperty = cdkBuilder.build()
}

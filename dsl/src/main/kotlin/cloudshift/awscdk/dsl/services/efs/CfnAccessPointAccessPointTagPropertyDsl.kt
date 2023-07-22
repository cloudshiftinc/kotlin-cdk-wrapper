@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.efs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.efs.CfnAccessPoint

@CdkDslMarker
public class CfnAccessPointAccessPointTagPropertyDsl {
  private val cdkBuilder: CfnAccessPoint.AccessPointTagProperty.Builder =
      CfnAccessPoint.AccessPointTagProperty.builder()

  /**
   * @param key The tag key (String).
   * The key can't start with `aws:` .
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param value The value of the tag key.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnAccessPoint.AccessPointTagProperty = cdkBuilder.build()
}

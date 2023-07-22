@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPool

@CdkDslMarker
public class CfnUserPoolStringAttributeConstraintsPropertyDsl {
  private val cdkBuilder: CfnUserPool.StringAttributeConstraintsProperty.Builder =
      CfnUserPool.StringAttributeConstraintsProperty.builder()

  /**
   * @param maxLength The maximum length.
   */
  public fun maxLength(maxLength: String) {
    cdkBuilder.maxLength(maxLength)
  }

  /**
   * @param minLength The minimum length.
   */
  public fun minLength(minLength: String) {
    cdkBuilder.minLength(minLength)
  }

  public fun build(): CfnUserPool.StringAttributeConstraintsProperty = cdkBuilder.build()
}

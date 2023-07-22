@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPool

@CdkDslMarker
public class CfnUserPoolNumberAttributeConstraintsPropertyDsl {
  private val cdkBuilder: CfnUserPool.NumberAttributeConstraintsProperty.Builder =
      CfnUserPool.NumberAttributeConstraintsProperty.builder()

  /**
   * @param maxValue The maximum value of an attribute that is of the number data type.
   */
  public fun maxValue(maxValue: String) {
    cdkBuilder.maxValue(maxValue)
  }

  /**
   * @param minValue The minimum value of an attribute that is of the number data type.
   */
  public fun minValue(minValue: String) {
    cdkBuilder.minValue(minValue)
  }

  public fun build(): CfnUserPool.NumberAttributeConstraintsProperty = cdkBuilder.build()
}

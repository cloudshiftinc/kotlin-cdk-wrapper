@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPool

/**
 * The minimum and maximum values of an attribute that is of the number data type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * NumberAttributeConstraintsProperty numberAttributeConstraintsProperty =
 * NumberAttributeConstraintsProperty.builder()
 * .maxValue("maxValue")
 * .minValue("minValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-numberattributeconstraints.html)
 */
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

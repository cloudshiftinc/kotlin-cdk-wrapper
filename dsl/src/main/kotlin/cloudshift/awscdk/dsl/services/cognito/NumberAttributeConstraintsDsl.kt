@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.cognito.NumberAttributeConstraints

@CdkDslMarker
public class NumberAttributeConstraintsDsl {
  private val cdkBuilder: NumberAttributeConstraints.Builder = NumberAttributeConstraints.builder()

  /**
   * @param max Maximum value of this attribute.
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * @param min Minimum value of this attribute.
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun build(): NumberAttributeConstraints = cdkBuilder.build()
}

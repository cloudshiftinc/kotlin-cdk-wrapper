@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.services.cognito.NumberAttributeProps

@CdkDslMarker
public class NumberAttributePropsDsl {
  private val cdkBuilder: NumberAttributeProps.Builder = NumberAttributeProps.builder()

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

  /**
   * @param mutable Specifies whether the value of the attribute can be changed.
   * For any user pool attribute that's mapped to an identity provider attribute, you must set this
   * parameter to true.
   * Amazon Cognito updates mapped attributes when users sign in to your application through an
   * identity provider.
   * If an attribute is immutable, Amazon Cognito throws an error when it attempts to update the
   * attribute.
   */
  public fun mutable(mutable: Boolean) {
    cdkBuilder.mutable(mutable)
  }

  public fun build(): NumberAttributeProps = cdkBuilder.build()
}

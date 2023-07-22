@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.services.cognito.NumberAttribute

@CdkDslMarker
public class NumberAttributeDsl {
  private val cdkBuilder: NumberAttribute.Builder = NumberAttribute.Builder.create()

  /**
   * Maximum value of this attribute.
   *
   * Default: - no maximum value
   *
   * @param max Maximum value of this attribute. 
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * Minimum value of this attribute.
   *
   * Default: - no minimum value
   *
   * @param min Minimum value of this attribute. 
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  /**
   * Specifies whether the value of the attribute can be changed.
   *
   * For any user pool attribute that's mapped to an identity provider attribute, you must set this
   * parameter to true.
   * Amazon Cognito updates mapped attributes when users sign in to your application through an
   * identity provider.
   * If an attribute is immutable, Amazon Cognito throws an error when it attempts to update the
   * attribute.
   *
   * Default: false
   *
   * @param mutable Specifies whether the value of the attribute can be changed. 
   */
  public fun mutable(mutable: Boolean) {
    cdkBuilder.mutable(mutable)
  }

  public fun build(): NumberAttribute = cdkBuilder.build()
}

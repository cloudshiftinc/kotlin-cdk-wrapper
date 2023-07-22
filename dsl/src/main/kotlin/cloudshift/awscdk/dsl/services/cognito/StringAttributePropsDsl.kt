@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.services.cognito.StringAttributeProps

@CdkDslMarker
public class StringAttributePropsDsl {
  private val cdkBuilder: StringAttributeProps.Builder = StringAttributeProps.builder()

  /**
   * @param maxLen Maximum length of this attribute.
   */
  public fun maxLen(maxLen: Number) {
    cdkBuilder.maxLen(maxLen)
  }

  /**
   * @param minLen Minimum length of this attribute.
   */
  public fun minLen(minLen: Number) {
    cdkBuilder.minLen(minLen)
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

  public fun build(): StringAttributeProps = cdkBuilder.build()
}

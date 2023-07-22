@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cognito.StandardAttribute

@CdkDslMarker
public class StandardAttributeDsl {
  private val cdkBuilder: StandardAttribute.Builder = StandardAttribute.builder()

  /**
   * @param mutable Specifies whether the value of the attribute can be changed.
   * For any user pool attribute that's mapped to an identity provider attribute, this must be set
   * to `true`.
   * Amazon Cognito updates mapped attributes when users sign in to your application through an
   * identity provider.
   * If an attribute is immutable, Amazon Cognito throws an error when it attempts to update the
   * attribute.
   */
  public fun mutable(mutable: Boolean) {
    cdkBuilder.mutable(mutable)
  }

  /**
   * @param required Specifies whether the attribute is required upon user registration.
   * If the attribute is required and the user does not provide a value, registration or sign-in
   * will fail.
   */
  public fun required(required: Boolean) {
    cdkBuilder.required(required)
  }

  public fun build(): StandardAttribute = cdkBuilder.build()
}

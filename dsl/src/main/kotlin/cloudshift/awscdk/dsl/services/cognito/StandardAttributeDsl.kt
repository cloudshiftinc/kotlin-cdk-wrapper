@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cognito.StandardAttribute

/**
 * Standard attribute that can be marked as required or mutable.
 *
 * Example:
 *
 * ```
 * UserPool.Builder.create(this, "myuserpool")
 * // ...
 * .standardAttributes(StandardAttributes.builder()
 * .fullname(StandardAttribute.builder()
 * .required(true)
 * .mutable(false)
 * .build())
 * .address(StandardAttribute.builder()
 * .required(false)
 * .mutable(true)
 * .build())
 * .build())
 * .customAttributes(Map.of(
 * "myappid", StringAttribute.Builder.create().minLen(5).maxLen(15).mutable(false).build(),
 * "callingcode", NumberAttribute.Builder.create().min(1).max(3).mutable(true).build(),
 * "isEmployee", BooleanAttribute.Builder.create().mutable(true).build(),
 * "joinedOn", new DateTimeAttribute()))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-attributes.html#cognito-user-pools-standard-attributes)
 */
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

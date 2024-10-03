@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Unit

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
public interface StandardAttribute {
  /**
   * Specifies whether the value of the attribute can be changed.
   *
   * For any user pool attribute that's mapped to an identity provider attribute, this must be set
   * to `true`.
   * Amazon Cognito updates mapped attributes when users sign in to your application through an
   * identity provider.
   * If an attribute is immutable, Amazon Cognito throws an error when it attempts to update the
   * attribute.
   *
   * Default: true
   */
  public fun mutable(): Boolean? = unwrap(this).getMutable()

  /**
   * Specifies whether the attribute is required upon user registration.
   *
   * If the attribute is required and the user does not provide a value, registration or sign-in
   * will fail.
   *
   * Default: false
   */
  public fun required(): Boolean? = unwrap(this).getRequired()

  /**
   * A builder for [StandardAttribute]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param mutable Specifies whether the value of the attribute can be changed.
     * For any user pool attribute that's mapped to an identity provider attribute, this must be set
     * to `true`.
     * Amazon Cognito updates mapped attributes when users sign in to your application through an
     * identity provider.
     * If an attribute is immutable, Amazon Cognito throws an error when it attempts to update the
     * attribute.
     */
    public fun mutable(mutable: Boolean)

    /**
     * @param required Specifies whether the attribute is required upon user registration.
     * If the attribute is required and the user does not provide a value, registration or sign-in
     * will fail.
     */
    public fun required(required: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.StandardAttribute.Builder =
        software.amazon.awscdk.services.cognito.StandardAttribute.builder()

    /**
     * @param mutable Specifies whether the value of the attribute can be changed.
     * For any user pool attribute that's mapped to an identity provider attribute, this must be set
     * to `true`.
     * Amazon Cognito updates mapped attributes when users sign in to your application through an
     * identity provider.
     * If an attribute is immutable, Amazon Cognito throws an error when it attempts to update the
     * attribute.
     */
    override fun mutable(mutable: Boolean) {
      cdkBuilder.mutable(mutable)
    }

    /**
     * @param required Specifies whether the attribute is required upon user registration.
     * If the attribute is required and the user does not provide a value, registration or sign-in
     * will fail.
     */
    override fun required(required: Boolean) {
      cdkBuilder.required(required)
    }

    public fun build(): software.amazon.awscdk.services.cognito.StandardAttribute =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.StandardAttribute,
  ) : CdkObject(cdkObject),
      StandardAttribute {
    /**
     * Specifies whether the value of the attribute can be changed.
     *
     * For any user pool attribute that's mapped to an identity provider attribute, this must be set
     * to `true`.
     * Amazon Cognito updates mapped attributes when users sign in to your application through an
     * identity provider.
     * If an attribute is immutable, Amazon Cognito throws an error when it attempts to update the
     * attribute.
     *
     * Default: true
     */
    override fun mutable(): Boolean? = unwrap(this).getMutable()

    /**
     * Specifies whether the attribute is required upon user registration.
     *
     * If the attribute is required and the user does not provide a value, registration or sign-in
     * will fail.
     *
     * Default: false
     */
    override fun required(): Boolean? = unwrap(this).getRequired()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StandardAttribute {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.StandardAttribute):
        StandardAttribute = CdkObjectWrappers.wrap(cdkObject) as? StandardAttribute ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StandardAttribute):
        software.amazon.awscdk.services.cognito.StandardAttribute = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cognito.StandardAttribute
  }
}

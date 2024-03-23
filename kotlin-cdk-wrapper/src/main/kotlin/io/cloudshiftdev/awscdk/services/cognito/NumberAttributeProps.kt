@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

/**
 * Props for NumberAttr.
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
 */
public interface NumberAttributeProps : NumberAttributeConstraints, CustomAttributeProps {
  /**
   * A builder for [NumberAttributeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param max Maximum value of this attribute.
     */
    public fun max(max: Number)

    /**
     * @param min Minimum value of this attribute.
     */
    public fun min(min: Number)

    /**
     * @param mutable Specifies whether the value of the attribute can be changed.
     * For any user pool attribute that's mapped to an identity provider attribute, you must set
     * this parameter to true.
     * Amazon Cognito updates mapped attributes when users sign in to your application through an
     * identity provider.
     * If an attribute is immutable, Amazon Cognito throws an error when it attempts to update the
     * attribute.
     */
    public fun mutable(mutable: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.NumberAttributeProps.Builder =
        software.amazon.awscdk.services.cognito.NumberAttributeProps.builder()

    /**
     * @param max Maximum value of this attribute.
     */
    override fun max(max: Number) {
      cdkBuilder.max(max)
    }

    /**
     * @param min Minimum value of this attribute.
     */
    override fun min(min: Number) {
      cdkBuilder.min(min)
    }

    /**
     * @param mutable Specifies whether the value of the attribute can be changed.
     * For any user pool attribute that's mapped to an identity provider attribute, you must set
     * this parameter to true.
     * Amazon Cognito updates mapped attributes when users sign in to your application through an
     * identity provider.
     * If an attribute is immutable, Amazon Cognito throws an error when it attempts to update the
     * attribute.
     */
    override fun mutable(mutable: Boolean) {
      cdkBuilder.mutable(mutable)
    }

    public fun build(): software.amazon.awscdk.services.cognito.NumberAttributeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cognito.NumberAttributeProps,
  ) : CdkObject(cdkObject), NumberAttributeProps {
    /**
     * Maximum value of this attribute.
     *
     * Default: - no maximum value
     */
    override fun max(): Number? = unwrap(this).getMax()

    /**
     * Minimum value of this attribute.
     *
     * Default: - no minimum value
     */
    override fun min(): Number? = unwrap(this).getMin()

    /**
     * Specifies whether the value of the attribute can be changed.
     *
     * For any user pool attribute that's mapped to an identity provider attribute, you must set
     * this parameter to true.
     * Amazon Cognito updates mapped attributes when users sign in to your application through an
     * identity provider.
     * If an attribute is immutable, Amazon Cognito throws an error when it attempts to update the
     * attribute.
     *
     * Default: false
     */
    override fun mutable(): Boolean? = unwrap(this).getMutable()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NumberAttributeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.NumberAttributeProps):
        NumberAttributeProps = CdkObjectWrappers.wrap(cdkObject) as? NumberAttributeProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: NumberAttributeProps):
        software.amazon.awscdk.services.cognito.NumberAttributeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.NumberAttributeProps
  }
}

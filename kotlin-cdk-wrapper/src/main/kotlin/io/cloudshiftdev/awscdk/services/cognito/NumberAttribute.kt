@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

/**
 * The Number custom attribute type.
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
public open class NumberAttribute(
  cdkObject: software.amazon.awscdk.services.cognito.NumberAttribute,
) : CdkObject(cdkObject), ICustomAttribute {
  public constructor() : this(software.amazon.awscdk.services.cognito.NumberAttribute()
  )

  public constructor(props: NumberAttributeProps) :
      this(software.amazon.awscdk.services.cognito.NumberAttribute(props.let(NumberAttributeProps::unwrap))
  )

  public constructor(props: NumberAttributeProps.Builder.() -> Unit) :
      this(NumberAttributeProps(props)
  )

  /**
   * Bind this custom attribute type to the values as expected by CloudFormation.
   */
  public override fun bind(): CustomAttributeConfig =
      unwrap(this).bind().let(CustomAttributeConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.NumberAttribute].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Maximum value of this attribute.
     *
     * Default: - no maximum value
     *
     * @param max Maximum value of this attribute. 
     */
    public fun max(max: Number)

    /**
     * Minimum value of this attribute.
     *
     * Default: - no minimum value
     *
     * @param min Minimum value of this attribute. 
     */
    public fun min(min: Number)

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
     *
     * @param mutable Specifies whether the value of the attribute can be changed. 
     */
    public fun mutable(mutable: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.NumberAttribute.Builder =
        software.amazon.awscdk.services.cognito.NumberAttribute.Builder.create()

    /**
     * Maximum value of this attribute.
     *
     * Default: - no maximum value
     *
     * @param max Maximum value of this attribute. 
     */
    override fun max(max: Number) {
      cdkBuilder.max(max)
    }

    /**
     * Minimum value of this attribute.
     *
     * Default: - no minimum value
     *
     * @param min Minimum value of this attribute. 
     */
    override fun min(min: Number) {
      cdkBuilder.min(min)
    }

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
     *
     * @param mutable Specifies whether the value of the attribute can be changed. 
     */
    override fun mutable(mutable: Boolean) {
      cdkBuilder.mutable(mutable)
    }

    public fun build(): software.amazon.awscdk.services.cognito.NumberAttribute = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NumberAttribute {
      val builderImpl = BuilderImpl()
      return NumberAttribute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.NumberAttribute):
        NumberAttribute = NumberAttribute(cdkObject)

    internal fun unwrap(wrapped: NumberAttribute):
        software.amazon.awscdk.services.cognito.NumberAttribute = wrapped.cdkObject as
        software.amazon.awscdk.services.cognito.NumberAttribute
  }
}

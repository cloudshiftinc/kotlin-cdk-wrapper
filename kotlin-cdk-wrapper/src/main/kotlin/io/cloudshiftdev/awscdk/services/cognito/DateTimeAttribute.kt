@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

/**
 * The DateTime custom attribute type.
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
public open class DateTimeAttribute(
  cdkObject: software.amazon.awscdk.services.cognito.DateTimeAttribute,
) : CdkObject(cdkObject),
    ICustomAttribute {
  public constructor() : this(software.amazon.awscdk.services.cognito.DateTimeAttribute()
  )

  public constructor(props: CustomAttributeProps) :
      this(software.amazon.awscdk.services.cognito.DateTimeAttribute(props.let(CustomAttributeProps.Companion::unwrap))
  )

  public constructor(props: CustomAttributeProps.Builder.() -> Unit) :
      this(CustomAttributeProps(props)
  )

  /**
   * Bind this custom attribute type to the values as expected by CloudFormation.
   */
  public override fun bind(): CustomAttributeConfig =
      unwrap(this).bind().let(CustomAttributeConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.DateTimeAttribute].
   */
  @CdkDslMarker
  public interface Builder {
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
    private val cdkBuilder: software.amazon.awscdk.services.cognito.DateTimeAttribute.Builder =
        software.amazon.awscdk.services.cognito.DateTimeAttribute.Builder.create()

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

    public fun build(): software.amazon.awscdk.services.cognito.DateTimeAttribute =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DateTimeAttribute {
      val builderImpl = BuilderImpl()
      return DateTimeAttribute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.DateTimeAttribute):
        DateTimeAttribute = DateTimeAttribute(cdkObject)

    internal fun unwrap(wrapped: DateTimeAttribute):
        software.amazon.awscdk.services.cognito.DateTimeAttribute = wrapped.cdkObject as
        software.amazon.awscdk.services.cognito.DateTimeAttribute
  }
}

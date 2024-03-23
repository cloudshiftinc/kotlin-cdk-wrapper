@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

/**
 * The String custom attribute type.
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
public open class StringAttribute(
  cdkObject: software.amazon.awscdk.services.cognito.StringAttribute,
) : CdkObject(cdkObject), ICustomAttribute {
  public constructor() : this(software.amazon.awscdk.services.cognito.StringAttribute()
  )

  public constructor(props: StringAttributeProps) :
      this(software.amazon.awscdk.services.cognito.StringAttribute(props.let(StringAttributeProps::unwrap))
  )

  public constructor(props: StringAttributeProps.Builder.() -> Unit) :
      this(StringAttributeProps(props)
  )

  /**
   * Bind this custom attribute type to the values as expected by CloudFormation.
   */
  public override fun bind(): CustomAttributeConfig =
      unwrap(this).bind().let(CustomAttributeConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.StringAttribute].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Maximum length of this attribute.
     *
     * Default: 2048
     *
     * @param maxLen Maximum length of this attribute. 
     */
    public fun maxLen(maxLen: Number)

    /**
     * Minimum length of this attribute.
     *
     * Default: 0
     *
     * @param minLen Minimum length of this attribute. 
     */
    public fun minLen(minLen: Number)

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
    private val cdkBuilder: software.amazon.awscdk.services.cognito.StringAttribute.Builder =
        software.amazon.awscdk.services.cognito.StringAttribute.Builder.create()

    /**
     * Maximum length of this attribute.
     *
     * Default: 2048
     *
     * @param maxLen Maximum length of this attribute. 
     */
    override fun maxLen(maxLen: Number) {
      cdkBuilder.maxLen(maxLen)
    }

    /**
     * Minimum length of this attribute.
     *
     * Default: 0
     *
     * @param minLen Minimum length of this attribute. 
     */
    override fun minLen(minLen: Number) {
      cdkBuilder.minLen(minLen)
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

    public fun build(): software.amazon.awscdk.services.cognito.StringAttribute = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StringAttribute {
      val builderImpl = BuilderImpl()
      return StringAttribute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.StringAttribute):
        StringAttribute = StringAttribute(cdkObject)

    internal fun unwrap(wrapped: StringAttribute):
        software.amazon.awscdk.services.cognito.StringAttribute = wrapped.cdkObject as
        software.amazon.awscdk.services.cognito.StringAttribute
  }
}

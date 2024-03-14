package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public open class StringAttribute internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cognito.StringAttribute,
) : CdkObject(cdkObject), ICustomAttribute {
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
        software.amazon.awscdk.services.cognito.StringAttribute = wrapped.cdkObject
  }
}

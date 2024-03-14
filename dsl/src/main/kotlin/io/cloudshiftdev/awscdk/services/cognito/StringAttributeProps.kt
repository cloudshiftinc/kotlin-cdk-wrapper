package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface StringAttributeProps : StringAttributeConstraints, CustomAttributeProps {
  /**
   * A builder for [StringAttributeProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxLen Maximum length of this attribute.
     */
    public fun maxLen(maxLen: Number)

    /**
     * @param minLen Minimum length of this attribute.
     */
    public fun minLen(minLen: Number)

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
    private val cdkBuilder: software.amazon.awscdk.services.cognito.StringAttributeProps.Builder =
        software.amazon.awscdk.services.cognito.StringAttributeProps.builder()

    /**
     * @param maxLen Maximum length of this attribute.
     */
    override fun maxLen(maxLen: Number) {
      cdkBuilder.maxLen(maxLen)
    }

    /**
     * @param minLen Minimum length of this attribute.
     */
    override fun minLen(minLen: Number) {
      cdkBuilder.minLen(minLen)
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

    public fun build(): software.amazon.awscdk.services.cognito.StringAttributeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.StringAttributeProps,
  ) : CdkObject(cdkObject), StringAttributeProps {
    /**
     * Maximum length of this attribute.
     *
     * Default: 2048
     */
    override fun maxLen(): Number? = unwrap(this).getMaxLen()

    /**
     * Minimum length of this attribute.
     *
     * Default: 0
     */
    override fun minLen(): Number? = unwrap(this).getMinLen()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): StringAttributeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.StringAttributeProps):
        StringAttributeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StringAttributeProps):
        software.amazon.awscdk.services.cognito.StringAttributeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.StringAttributeProps
  }
}

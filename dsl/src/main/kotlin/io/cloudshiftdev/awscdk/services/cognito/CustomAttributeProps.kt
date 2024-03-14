package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface CustomAttributeProps {
  /**
   * Specifies whether the value of the attribute can be changed.
   *
   * For any user pool attribute that's mapped to an identity provider attribute, you must set this
   * parameter to true.
   * Amazon Cognito updates mapped attributes when users sign in to your application through an
   * identity provider.
   * If an attribute is immutable, Amazon Cognito throws an error when it attempts to update the
   * attribute.
   *
   * Default: false
   */
  public fun mutable(): Boolean? = unwrap(this).getMutable()

  /**
   * A builder for [CustomAttributeProps]
   */
  @CdkDslMarker
  public interface Builder {
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
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CustomAttributeProps.Builder =
        software.amazon.awscdk.services.cognito.CustomAttributeProps.builder()

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

    public fun build(): software.amazon.awscdk.services.cognito.CustomAttributeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.CustomAttributeProps,
  ) : CdkObject(cdkObject), CustomAttributeProps {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomAttributeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CustomAttributeProps):
        CustomAttributeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomAttributeProps):
        software.amazon.awscdk.services.cognito.CustomAttributeProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.CustomAttributeProps
  }
}

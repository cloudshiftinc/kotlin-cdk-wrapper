@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Configuration that will be fed into CloudFormation for any custom attribute type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * CustomAttributeConfig customAttributeConfig = CustomAttributeConfig.builder()
 * .dataType("dataType")
 * // the properties below are optional
 * .mutable(false)
 * .numberConstraints(NumberAttributeConstraints.builder()
 * .max(123)
 * .min(123)
 * .build())
 * .stringConstraints(StringAttributeConstraints.builder()
 * .maxLen(123)
 * .minLen(123)
 * .build())
 * .build();
 * ```
 */
public interface CustomAttributeConfig {
  /**
   * The data type of the custom attribute.
   *
   * [Documentation](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SchemaAttributeType.html#CognitoUserPools-Type-SchemaAttributeType-AttributeDataType)
   */
  public fun dataType(): String

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
   * The constraints for a custom attribute of the 'Number' data type.
   *
   * Default: - None.
   */
  public fun numberConstraints(): NumberAttributeConstraints? =
      unwrap(this).getNumberConstraints()?.let(NumberAttributeConstraints::wrap)

  /**
   * The constraints for a custom attribute of 'String' data type.
   *
   * Default: - None.
   */
  public fun stringConstraints(): StringAttributeConstraints? =
      unwrap(this).getStringConstraints()?.let(StringAttributeConstraints::wrap)

  /**
   * A builder for [CustomAttributeConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataType The data type of the custom attribute. 
     */
    public fun dataType(dataType: String)

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

    /**
     * @param numberConstraints The constraints for a custom attribute of the 'Number' data type.
     */
    public fun numberConstraints(numberConstraints: NumberAttributeConstraints)

    /**
     * @param numberConstraints The constraints for a custom attribute of the 'Number' data type.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc1d50c4781e442cfecd0909e70e85a1efb3a024525c42b606ff1cb3dd1d5dab")
    public fun numberConstraints(numberConstraints: NumberAttributeConstraints.Builder.() -> Unit)

    /**
     * @param stringConstraints The constraints for a custom attribute of 'String' data type.
     */
    public fun stringConstraints(stringConstraints: StringAttributeConstraints)

    /**
     * @param stringConstraints The constraints for a custom attribute of 'String' data type.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d05d82bd96940c511d159e415cfc197cce046c20e3eb09a0eb49924b42c36577")
    public fun stringConstraints(stringConstraints: StringAttributeConstraints.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.CustomAttributeConfig.Builder =
        software.amazon.awscdk.services.cognito.CustomAttributeConfig.builder()

    /**
     * @param dataType The data type of the custom attribute. 
     */
    override fun dataType(dataType: String) {
      cdkBuilder.dataType(dataType)
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

    /**
     * @param numberConstraints The constraints for a custom attribute of the 'Number' data type.
     */
    override fun numberConstraints(numberConstraints: NumberAttributeConstraints) {
      cdkBuilder.numberConstraints(numberConstraints.let(NumberAttributeConstraints::unwrap))
    }

    /**
     * @param numberConstraints The constraints for a custom attribute of the 'Number' data type.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc1d50c4781e442cfecd0909e70e85a1efb3a024525c42b606ff1cb3dd1d5dab")
    override
        fun numberConstraints(numberConstraints: NumberAttributeConstraints.Builder.() -> Unit):
        Unit = numberConstraints(NumberAttributeConstraints(numberConstraints))

    /**
     * @param stringConstraints The constraints for a custom attribute of 'String' data type.
     */
    override fun stringConstraints(stringConstraints: StringAttributeConstraints) {
      cdkBuilder.stringConstraints(stringConstraints.let(StringAttributeConstraints::unwrap))
    }

    /**
     * @param stringConstraints The constraints for a custom attribute of 'String' data type.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d05d82bd96940c511d159e415cfc197cce046c20e3eb09a0eb49924b42c36577")
    override
        fun stringConstraints(stringConstraints: StringAttributeConstraints.Builder.() -> Unit):
        Unit = stringConstraints(StringAttributeConstraints(stringConstraints))

    public fun build(): software.amazon.awscdk.services.cognito.CustomAttributeConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.CustomAttributeConfig,
  ) : CdkObject(cdkObject), CustomAttributeConfig {
    /**
     * The data type of the custom attribute.
     *
     * [Documentation](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_SchemaAttributeType.html#CognitoUserPools-Type-SchemaAttributeType-AttributeDataType)
     */
    override fun dataType(): String = unwrap(this).getDataType()

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

    /**
     * The constraints for a custom attribute of the 'Number' data type.
     *
     * Default: - None.
     */
    override fun numberConstraints(): NumberAttributeConstraints? =
        unwrap(this).getNumberConstraints()?.let(NumberAttributeConstraints::wrap)

    /**
     * The constraints for a custom attribute of 'String' data type.
     *
     * Default: - None.
     */
    override fun stringConstraints(): StringAttributeConstraints? =
        unwrap(this).getStringConstraints()?.let(StringAttributeConstraints::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomAttributeConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CustomAttributeConfig):
        CustomAttributeConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomAttributeConfig):
        software.amazon.awscdk.services.cognito.CustomAttributeConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.CustomAttributeConfig
  }
}

@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties to create a new instance of UserPoolIdentityProvider.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * ProviderAttribute providerAttribute;
 * UserPool userPool;
 * UserPoolIdentityProviderProps userPoolIdentityProviderProps =
 * UserPoolIdentityProviderProps.builder()
 * .userPool(userPool)
 * // the properties below are optional
 * .attributeMapping(AttributeMapping.builder()
 * .address(providerAttribute)
 * .birthdate(providerAttribute)
 * .custom(Map.of(
 * "customKey", providerAttribute))
 * .email(providerAttribute)
 * .familyName(providerAttribute)
 * .fullname(providerAttribute)
 * .gender(providerAttribute)
 * .givenName(providerAttribute)
 * .lastUpdateTime(providerAttribute)
 * .locale(providerAttribute)
 * .middleName(providerAttribute)
 * .nickname(providerAttribute)
 * .phoneNumber(providerAttribute)
 * .preferredUsername(providerAttribute)
 * .profilePage(providerAttribute)
 * .profilePicture(providerAttribute)
 * .timezone(providerAttribute)
 * .website(providerAttribute)
 * .build())
 * .build();
 * ```
 */
public interface UserPoolIdentityProviderProps {
  /**
   * Mapping attributes from the identity provider to standard and custom attributes of the user
   * pool.
   *
   * Default: - no attribute mapping
   */
  public fun attributeMapping(): AttributeMapping? =
      unwrap(this).getAttributeMapping()?.let(AttributeMapping::wrap)

  /**
   * The user pool to which this construct provides identities.
   */
  public fun userPool(): IUserPool

  /**
   * A builder for [UserPoolIdentityProviderProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param attributeMapping Mapping attributes from the identity provider to standard and custom
     * attributes of the user pool.
     */
    public fun attributeMapping(attributeMapping: AttributeMapping)

    /**
     * @param attributeMapping Mapping attributes from the identity provider to standard and custom
     * attributes of the user pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("baff8138f8305e8a47263b889da4a96de14710dd4466ae16ac639a0b3a1f3fcb")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    /**
     * @param userPool The user pool to which this construct provides identities. 
     */
    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderProps.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderProps.builder()

    /**
     * @param attributeMapping Mapping attributes from the identity provider to standard and custom
     * attributes of the user pool.
     */
    override fun attributeMapping(attributeMapping: AttributeMapping) {
      cdkBuilder.attributeMapping(attributeMapping.let(AttributeMapping::unwrap))
    }

    /**
     * @param attributeMapping Mapping attributes from the identity provider to standard and custom
     * attributes of the user pool.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("baff8138f8305e8a47263b889da4a96de14710dd4466ae16ac639a0b3a1f3fcb")
    override fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit): Unit =
        attributeMapping(AttributeMapping(attributeMapping))

    /**
     * @param userPool The user pool to which this construct provides identities. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderProps,
  ) : CdkObject(cdkObject), UserPoolIdentityProviderProps {
    /**
     * Mapping attributes from the identity provider to standard and custom attributes of the user
     * pool.
     *
     * Default: - no attribute mapping
     */
    override fun attributeMapping(): AttributeMapping? =
        unwrap(this).getAttributeMapping()?.let(AttributeMapping::wrap)

    /**
     * The user pool to which this construct provides identities.
     */
    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolIdentityProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderProps):
        UserPoolIdentityProviderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderProps):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderProps
  }
}

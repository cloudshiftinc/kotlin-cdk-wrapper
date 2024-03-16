@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties to initialize UserPoolGoogleIdentityProvider.
 *
 * Example:
 *
 * ```
 * UserPool userpool = new UserPool(this, "Pool");
 * SecretValue secret = Secret.fromSecretAttributes(this, "CognitoClientSecret",
 * SecretAttributes.builder()
 * .secretCompleteArn("arn:aws:secretsmanager:xxx:xxx:secret:xxx-xxx")
 * .build()).getSecretValue();
 * UserPoolIdentityProviderGoogle provider = UserPoolIdentityProviderGoogle.Builder.create(this,
 * "Google")
 * .clientId("amzn-client-id")
 * .clientSecretValue(secret)
 * .userPool(userpool)
 * .build();
 * ```
 */
public interface UserPoolIdentityProviderGoogleProps : UserPoolIdentityProviderProps {
  /**
   * The client id recognized by Google APIs.
   *
   * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in#specify_your_apps_client_id)
   */
  public fun clientId(): String

  /**
   * (deprecated) The client secret to be accompanied with clientId for Google APIs to authenticate
   * the client.
   *
   * Default: none
   *
   * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in)
   * @deprecated use clientSecretValue instead
   */
  @Deprecated(message = "deprecated in CDK")
  public fun clientSecret(): String? = unwrap(this).getClientSecret()

  /**
   * The client secret to be accompanied with clientId for Google APIs to authenticate the client as
   * SecretValue.
   *
   * Default: none
   *
   * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in)
   */
  public fun clientSecretValue(): SecretValue? =
      unwrap(this).getClientSecretValue()?.let(SecretValue::wrap)

  /**
   * The list of Google permissions to obtain for getting access to the Google profile.
   *
   * Default: [ profile ]
   *
   * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in)
   */
  public fun scopes(): List<String> = unwrap(this).getScopes() ?: emptyList()

  /**
   * A builder for [UserPoolIdentityProviderGoogleProps]
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
    @JvmName("b1da86c12f46872187c50110a014cb2a623c0499083e533242aac9e0daeb0373")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    /**
     * @param clientId The client id recognized by Google APIs. 
     */
    public fun clientId(clientId: String)

    /**
     * @param clientSecret The client secret to be accompanied with clientId for Google APIs to
     * authenticate the client.
     * @deprecated use clientSecretValue instead
     */
    @Deprecated(message = "deprecated in CDK")
    public fun clientSecret(clientSecret: String)

    /**
     * @param clientSecretValue The client secret to be accompanied with clientId for Google APIs to
     * authenticate the client as SecretValue.
     */
    public fun clientSecretValue(clientSecretValue: SecretValue)

    /**
     * @param scopes The list of Google permissions to obtain for getting access to the Google
     * profile.
     */
    public fun scopes(scopes: List<String>)

    /**
     * @param scopes The list of Google permissions to obtain for getting access to the Google
     * profile.
     */
    public fun scopes(vararg scopes: String)

    /**
     * @param userPool The user pool to which this construct provides identities. 
     */
    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogleProps.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogleProps.builder()

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
    @JvmName("b1da86c12f46872187c50110a014cb2a623c0499083e533242aac9e0daeb0373")
    override fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit): Unit =
        attributeMapping(AttributeMapping(attributeMapping))

    /**
     * @param clientId The client id recognized by Google APIs. 
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * @param clientSecret The client secret to be accompanied with clientId for Google APIs to
     * authenticate the client.
     * @deprecated use clientSecretValue instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun clientSecret(clientSecret: String) {
      cdkBuilder.clientSecret(clientSecret)
    }

    /**
     * @param clientSecretValue The client secret to be accompanied with clientId for Google APIs to
     * authenticate the client as SecretValue.
     */
    override fun clientSecretValue(clientSecretValue: SecretValue) {
      cdkBuilder.clientSecretValue(clientSecretValue.let(SecretValue::unwrap))
    }

    /**
     * @param scopes The list of Google permissions to obtain for getting access to the Google
     * profile.
     */
    override fun scopes(scopes: List<String>) {
      cdkBuilder.scopes(scopes)
    }

    /**
     * @param scopes The list of Google permissions to obtain for getting access to the Google
     * profile.
     */
    override fun scopes(vararg scopes: String): Unit = scopes(scopes.toList())

    /**
     * @param userPool The user pool to which this construct provides identities. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogleProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogleProps,
  ) : CdkObject(cdkObject), UserPoolIdentityProviderGoogleProps {
    /**
     * Mapping attributes from the identity provider to standard and custom attributes of the user
     * pool.
     *
     * Default: - no attribute mapping
     */
    override fun attributeMapping(): AttributeMapping? =
        unwrap(this).getAttributeMapping()?.let(AttributeMapping::wrap)

    /**
     * The client id recognized by Google APIs.
     *
     * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in#specify_your_apps_client_id)
     */
    override fun clientId(): String = unwrap(this).getClientId()

    /**
     * (deprecated) The client secret to be accompanied with clientId for Google APIs to
     * authenticate the client.
     *
     * Default: none
     *
     * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in)
     * @deprecated use clientSecretValue instead
     */
    @Deprecated(message = "deprecated in CDK")
    override fun clientSecret(): String? = unwrap(this).getClientSecret()

    /**
     * The client secret to be accompanied with clientId for Google APIs to authenticate the client
     * as SecretValue.
     *
     * Default: none
     *
     * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in)
     */
    override fun clientSecretValue(): SecretValue? =
        unwrap(this).getClientSecretValue()?.let(SecretValue::wrap)

    /**
     * The list of Google permissions to obtain for getting access to the Google profile.
     *
     * Default: [ profile ]
     *
     * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in)
     */
    override fun scopes(): List<String> = unwrap(this).getScopes() ?: emptyList()

    /**
     * The user pool to which this construct provides identities.
     */
    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        UserPoolIdentityProviderGoogleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogleProps):
        UserPoolIdentityProviderGoogleProps = CdkObjectWrappers.wrap(cdkObject) as
        UserPoolIdentityProviderGoogleProps

    internal fun unwrap(wrapped: UserPoolIdentityProviderGoogleProps):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogleProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogleProps
  }
}

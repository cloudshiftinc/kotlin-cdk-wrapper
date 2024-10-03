@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Represents an identity provider that integrates with Google.
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
public open class UserPoolIdentityProviderGoogle(
  cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogle,
) : Resource(cdkObject),
    IUserPoolIdentityProvider {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: UserPoolIdentityProviderGoogleProps,
  ) :
      this(software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogle(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(UserPoolIdentityProviderGoogleProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: UserPoolIdentityProviderGoogleProps.Builder.() -> Unit,
  ) : this(scope, id, UserPoolIdentityProviderGoogleProps(props)
  )

  /**
   * The primary identifier of this identity provider.
   */
  public override fun providerName(): String = unwrap(this).getProviderName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.UserPoolIdentityProviderGoogle].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Mapping attributes from the identity provider to standard and custom attributes of the user
     * pool.
     *
     * Default: - no attribute mapping
     *
     * @param attributeMapping Mapping attributes from the identity provider to standard and custom
     * attributes of the user pool. 
     */
    public fun attributeMapping(attributeMapping: AttributeMapping)

    /**
     * Mapping attributes from the identity provider to standard and custom attributes of the user
     * pool.
     *
     * Default: - no attribute mapping
     *
     * @param attributeMapping Mapping attributes from the identity provider to standard and custom
     * attributes of the user pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b299248357b6ace644c21afff62e9dcb1eba6fe23e8a4f4d91ce66316ccf9d0a")
    public fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit)

    /**
     * The client id recognized by Google APIs.
     *
     * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in#specify_your_apps_client_id)
     * @param clientId The client id recognized by Google APIs. 
     */
    public fun clientId(clientId: String)

    /**
     * (deprecated) The client secret to be accompanied with clientId for Google APIs to
     * authenticate the client.
     *
     * Default: none
     *
     * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in)
     * @deprecated use clientSecretValue instead
     * @param clientSecret The client secret to be accompanied with clientId for Google APIs to
     * authenticate the client. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun clientSecret(clientSecret: String)

    /**
     * The client secret to be accompanied with clientId for Google APIs to authenticate the client
     * as SecretValue.
     *
     * Default: none
     *
     * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in)
     * @param clientSecretValue The client secret to be accompanied with clientId for Google APIs to
     * authenticate the client as SecretValue. 
     */
    public fun clientSecretValue(clientSecretValue: SecretValue)

    /**
     * The list of Google permissions to obtain for getting access to the Google profile.
     *
     * Default: [ profile ]
     *
     * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in)
     * @param scopes The list of Google permissions to obtain for getting access to the Google
     * profile. 
     */
    public fun scopes(scopes: List<String>)

    /**
     * The list of Google permissions to obtain for getting access to the Google profile.
     *
     * Default: [ profile ]
     *
     * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in)
     * @param scopes The list of Google permissions to obtain for getting access to the Google
     * profile. 
     */
    public fun scopes(vararg scopes: String)

    /**
     * The user pool to which this construct provides identities.
     *
     * @param userPool The user pool to which this construct provides identities. 
     */
    public fun userPool(userPool: IUserPool)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogle.Builder =
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogle.Builder.create(scope,
        id)

    /**
     * Mapping attributes from the identity provider to standard and custom attributes of the user
     * pool.
     *
     * Default: - no attribute mapping
     *
     * @param attributeMapping Mapping attributes from the identity provider to standard and custom
     * attributes of the user pool. 
     */
    override fun attributeMapping(attributeMapping: AttributeMapping) {
      cdkBuilder.attributeMapping(attributeMapping.let(AttributeMapping.Companion::unwrap))
    }

    /**
     * Mapping attributes from the identity provider to standard and custom attributes of the user
     * pool.
     *
     * Default: - no attribute mapping
     *
     * @param attributeMapping Mapping attributes from the identity provider to standard and custom
     * attributes of the user pool. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b299248357b6ace644c21afff62e9dcb1eba6fe23e8a4f4d91ce66316ccf9d0a")
    override fun attributeMapping(attributeMapping: AttributeMapping.Builder.() -> Unit): Unit =
        attributeMapping(AttributeMapping(attributeMapping))

    /**
     * The client id recognized by Google APIs.
     *
     * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in#specify_your_apps_client_id)
     * @param clientId The client id recognized by Google APIs. 
     */
    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    /**
     * (deprecated) The client secret to be accompanied with clientId for Google APIs to
     * authenticate the client.
     *
     * Default: none
     *
     * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in)
     * @deprecated use clientSecretValue instead
     * @param clientSecret The client secret to be accompanied with clientId for Google APIs to
     * authenticate the client. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun clientSecret(clientSecret: String) {
      cdkBuilder.clientSecret(clientSecret)
    }

    /**
     * The client secret to be accompanied with clientId for Google APIs to authenticate the client
     * as SecretValue.
     *
     * Default: none
     *
     * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in)
     * @param clientSecretValue The client secret to be accompanied with clientId for Google APIs to
     * authenticate the client as SecretValue. 
     */
    override fun clientSecretValue(clientSecretValue: SecretValue) {
      cdkBuilder.clientSecretValue(clientSecretValue.let(SecretValue.Companion::unwrap))
    }

    /**
     * The list of Google permissions to obtain for getting access to the Google profile.
     *
     * Default: [ profile ]
     *
     * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in)
     * @param scopes The list of Google permissions to obtain for getting access to the Google
     * profile. 
     */
    override fun scopes(scopes: List<String>) {
      cdkBuilder.scopes(scopes)
    }

    /**
     * The list of Google permissions to obtain for getting access to the Google profile.
     *
     * Default: [ profile ]
     *
     * [Documentation](https://developers.google.com/identity/sign-in/web/sign-in)
     * @param scopes The list of Google permissions to obtain for getting access to the Google
     * profile. 
     */
    override fun scopes(vararg scopes: String): Unit = scopes(scopes.toList())

    /**
     * The user pool to which this construct provides identities.
     *
     * @param userPool The user pool to which this construct provides identities. 
     */
    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogle =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UserPoolIdentityProviderGoogle {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UserPoolIdentityProviderGoogle(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogle):
        UserPoolIdentityProviderGoogle = UserPoolIdentityProviderGoogle(cdkObject)

    internal fun unwrap(wrapped: UserPoolIdentityProviderGoogle):
        software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogle = wrapped.cdkObject
        as software.amazon.awscdk.services.cognito.UserPoolIdentityProviderGoogle
  }
}

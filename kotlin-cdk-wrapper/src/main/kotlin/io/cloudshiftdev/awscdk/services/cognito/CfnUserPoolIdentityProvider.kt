@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Cognito::UserPoolIdentityProvider` resource creates an identity provider for a user
 * pool.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cognito.*;
 * Object attributeMapping;
 * Object providerDetails;
 * CfnUserPoolIdentityProvider cfnUserPoolIdentityProvider =
 * CfnUserPoolIdentityProvider.Builder.create(this, "MyCfnUserPoolIdentityProvider")
 * .providerName("providerName")
 * .providerType("providerType")
 * .userPoolId("userPoolId")
 * // the properties below are optional
 * .attributeMapping(attributeMapping)
 * .idpIdentifiers(List.of("idpIdentifiers"))
 * .providerDetails(providerDetails)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html)
 */
public open class CfnUserPoolIdentityProvider(
  cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserPoolIdentityProviderProps,
  ) :
      this(software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnUserPoolIdentityProviderProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnUserPoolIdentityProviderProps.Builder.() -> Unit,
  ) : this(scope, id, CfnUserPoolIdentityProviderProps(props)
  )

  /**
   * The resource ID.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A mapping of IdP attributes to standard and custom user pool attributes.
   */
  public open fun attributeMapping(): Any? = unwrap(this).getAttributeMapping()

  /**
   * A mapping of IdP attributes to standard and custom user pool attributes.
   */
  public open fun attributeMapping(`value`: Any) {
    unwrap(this).setAttributeMapping(`value`)
  }

  /**
   * A list of IdP identifiers.
   */
  public open fun idpIdentifiers(): List<String> = unwrap(this).getIdpIdentifiers() ?: emptyList()

  /**
   * A list of IdP identifiers.
   */
  public open fun idpIdentifiers(`value`: List<String>) {
    unwrap(this).setIdpIdentifiers(`value`)
  }

  /**
   * A list of IdP identifiers.
   */
  public open fun idpIdentifiers(vararg `value`: String): Unit = idpIdentifiers(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The scopes, URLs, and identifiers for your external identity provider.
   */
  public open fun providerDetails(): Any? = unwrap(this).getProviderDetails()

  /**
   * The scopes, URLs, and identifiers for your external identity provider.
   */
  public open fun providerDetails(`value`: Any) {
    unwrap(this).setProviderDetails(`value`)
  }

  /**
   * The IdP name.
   */
  public open fun providerName(): String = unwrap(this).getProviderName()

  /**
   * The IdP name.
   */
  public open fun providerName(`value`: String) {
    unwrap(this).setProviderName(`value`)
  }

  /**
   * The IdP type.
   */
  public open fun providerType(): String = unwrap(this).getProviderType()

  /**
   * The IdP type.
   */
  public open fun providerType(`value`: String) {
    unwrap(this).setProviderType(`value`)
  }

  /**
   * The user pool ID.
   */
  public open fun userPoolId(): String = unwrap(this).getUserPoolId()

  /**
   * The user pool ID.
   */
  public open fun userPoolId(`value`: String) {
    unwrap(this).setUserPoolId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cognito.CfnUserPoolIdentityProvider].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A mapping of IdP attributes to standard and custom user pool attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-attributemapping)
     * @param attributeMapping A mapping of IdP attributes to standard and custom user pool
     * attributes. 
     */
    public fun attributeMapping(attributeMapping: Any)

    /**
     * A list of IdP identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-idpidentifiers)
     * @param idpIdentifiers A list of IdP identifiers. 
     */
    public fun idpIdentifiers(idpIdentifiers: List<String>)

    /**
     * A list of IdP identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-idpidentifiers)
     * @param idpIdentifiers A list of IdP identifiers. 
     */
    public fun idpIdentifiers(vararg idpIdentifiers: String)

    /**
     * The scopes, URLs, and identifiers for your external identity provider.
     *
     * The following
     * examples describe the provider detail keys for each IdP type. These values and their
     * schema are subject to change. Social IdP `authorize_scopes` values must match
     * the values listed here.
     *
     * * **OpenID Connect (OIDC)** - Amazon Cognito accepts the following elements when it can't
     * discover endpoint URLs from `oidc_issuer` : `attributes_url` , `authorize_url` , `jwks_uri` ,
     * `token_url` .
     *
     * Create or update request: `"ProviderDetails": { "attributes_request_method": "GET",
     * "attributes_url": "https://auth.example.com/userInfo", "authorize_scopes": "openid profile
     * email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789",
     * "client_secret": "provider-app-client-secret", "jwks_uri":
     * "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com",
     * "token_url": "https://example.com/token" }`
     *
     * Describe response: `"ProviderDetails": { "attributes_request_method": "GET",
     * "attributes_url": "https://auth.example.com/userInfo", "attributes_url_add_attributes": "false",
     * "authorize_scopes": "openid profile email", "authorize_url":
     * "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret":
     * "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json",
     * "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }`
     *
     * * **SAML** - Create or update request with Metadata URL: `"ProviderDetails": { "IDPInit":
     * "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataURL":
     * "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256" }`
     *
     * Create or update request with Metadata file: `"ProviderDetails": { "IDPInit": "true",
     * "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataFile": "[metadata XML]",
     * "RequestSigningAlgorithm": "rsa-sha256" }`
     *
     * The value of `MetadataFile` must be the plaintext metadata document with all quote (")
     * characters escaped by backslashes.
     *
     * Describe response: `"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true",
     * "EncryptedResponses" : "true", "ActiveEncryptionCertificate": "[certificate]", "MetadataURL":
     * "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256",
     * "SLORedirectBindingURI": "https://auth.example.com/slo/saml", "SSORedirectBindingURI":
     * "https://auth.example.com/sso/saml" }`
     *
     * * **LoginWithAmazon** - Create or update request: `"ProviderDetails": { "authorize_scopes":
     * "profile postal_code", "client_id": "amzn1.application-oa2-client.1example23456789",
     * "client_secret": "provider-app-client-secret"`
     *
     * Describe response: `"ProviderDetails": { "attributes_url":
     * "https://api.amazon.com/user/profile", "attributes_url_add_attributes": "false",
     * "authorize_scopes": "profile postal_code", "authorize_url": "https://www.amazon.com/ap/oa",
     * "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret":
     * "provider-app-client-secret", "token_request_method": "POST", "token_url":
     * "https://api.amazon.com/auth/o2/token" }`
     *
     * * **Google** - Create or update request: `"ProviderDetails": { "authorize_scopes": "email
     * profile openid", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret":
     * "provider-app-client-secret" }`
     *
     * Describe response: `"ProviderDetails": { "attributes_url":
     * "https://people.googleapis.com/v1/people/me?personFields=", "attributes_url_add_attributes":
     * "true", "authorize_scopes": "email profile openid", "authorize_url":
     * "https://accounts.google.com/o/oauth2/v2/auth", "client_id":
     * "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret",
     * "oidc_issuer": "https://accounts.google.com", "token_request_method": "POST", "token_url":
     * "https://www.googleapis.com/oauth2/v4/token" }`
     *
     * * **SignInWithApple** - Create or update request: `"ProviderDetails": { "authorize_scopes":
     * "email name", "client_id": "com.example.cognito", "private_key": "1EXAMPLE", "key_id":
     * "2EXAMPLE", "team_id": "3EXAMPLE" }`
     *
     * Describe response: `"ProviderDetails": { "attributes_url_add_attributes": "false",
     * "authorize_scopes": "email name", "authorize_url": "https://appleid.apple.com/auth/authorize",
     * "client_id": "com.example.cognito", "key_id": "1EXAMPLE", "oidc_issuer":
     * "https://appleid.apple.com", "team_id": "2EXAMPLE", "token_request_method": "POST", "token_url":
     * "https://appleid.apple.com/auth/token" }`
     *
     * * **Facebook** - Create or update request: `"ProviderDetails": { "api_version": "v17.0",
     * "authorize_scopes": "public_profile, email", "client_id": "1example23456789", "client_secret":
     * "provider-app-client-secret" }`
     *
     * Describe response: `"ProviderDetails": { "api_version": "v17.0", "attributes_url":
     * "https://graph.facebook.com/v17.0/me?fields=", "attributes_url_add_attributes": "true",
     * "authorize_scopes": "public_profile, email", "authorize_url":
     * "https://www.facebook.com/v17.0/dialog/oauth", "client_id": "1example23456789", "client_secret":
     * "provider-app-client-secret", "token_request_method": "GET", "token_url":
     * "https://graph.facebook.com/v17.0/oauth/access_token" }`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providerdetails)
     * @param providerDetails The scopes, URLs, and identifiers for your external identity provider.
     * 
     */
    public fun providerDetails(providerDetails: Any)

    /**
     * The IdP name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providername)
     * @param providerName The IdP name. 
     */
    public fun providerName(providerName: String)

    /**
     * The IdP type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providertype)
     * @param providerType The IdP type. 
     */
    public fun providerType(providerType: String)

    /**
     * The user pool ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-userpoolid)
     * @param userPoolId The user pool ID. 
     */
    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider.Builder.create(scope,
        id)

    /**
     * A mapping of IdP attributes to standard and custom user pool attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-attributemapping)
     * @param attributeMapping A mapping of IdP attributes to standard and custom user pool
     * attributes. 
     */
    override fun attributeMapping(attributeMapping: Any) {
      cdkBuilder.attributeMapping(attributeMapping)
    }

    /**
     * A list of IdP identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-idpidentifiers)
     * @param idpIdentifiers A list of IdP identifiers. 
     */
    override fun idpIdentifiers(idpIdentifiers: List<String>) {
      cdkBuilder.idpIdentifiers(idpIdentifiers)
    }

    /**
     * A list of IdP identifiers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-idpidentifiers)
     * @param idpIdentifiers A list of IdP identifiers. 
     */
    override fun idpIdentifiers(vararg idpIdentifiers: String): Unit =
        idpIdentifiers(idpIdentifiers.toList())

    /**
     * The scopes, URLs, and identifiers for your external identity provider.
     *
     * The following
     * examples describe the provider detail keys for each IdP type. These values and their
     * schema are subject to change. Social IdP `authorize_scopes` values must match
     * the values listed here.
     *
     * * **OpenID Connect (OIDC)** - Amazon Cognito accepts the following elements when it can't
     * discover endpoint URLs from `oidc_issuer` : `attributes_url` , `authorize_url` , `jwks_uri` ,
     * `token_url` .
     *
     * Create or update request: `"ProviderDetails": { "attributes_request_method": "GET",
     * "attributes_url": "https://auth.example.com/userInfo", "authorize_scopes": "openid profile
     * email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789",
     * "client_secret": "provider-app-client-secret", "jwks_uri":
     * "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com",
     * "token_url": "https://example.com/token" }`
     *
     * Describe response: `"ProviderDetails": { "attributes_request_method": "GET",
     * "attributes_url": "https://auth.example.com/userInfo", "attributes_url_add_attributes": "false",
     * "authorize_scopes": "openid profile email", "authorize_url":
     * "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret":
     * "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json",
     * "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }`
     *
     * * **SAML** - Create or update request with Metadata URL: `"ProviderDetails": { "IDPInit":
     * "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataURL":
     * "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256" }`
     *
     * Create or update request with Metadata file: `"ProviderDetails": { "IDPInit": "true",
     * "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataFile": "[metadata XML]",
     * "RequestSigningAlgorithm": "rsa-sha256" }`
     *
     * The value of `MetadataFile` must be the plaintext metadata document with all quote (")
     * characters escaped by backslashes.
     *
     * Describe response: `"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true",
     * "EncryptedResponses" : "true", "ActiveEncryptionCertificate": "[certificate]", "MetadataURL":
     * "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256",
     * "SLORedirectBindingURI": "https://auth.example.com/slo/saml", "SSORedirectBindingURI":
     * "https://auth.example.com/sso/saml" }`
     *
     * * **LoginWithAmazon** - Create or update request: `"ProviderDetails": { "authorize_scopes":
     * "profile postal_code", "client_id": "amzn1.application-oa2-client.1example23456789",
     * "client_secret": "provider-app-client-secret"`
     *
     * Describe response: `"ProviderDetails": { "attributes_url":
     * "https://api.amazon.com/user/profile", "attributes_url_add_attributes": "false",
     * "authorize_scopes": "profile postal_code", "authorize_url": "https://www.amazon.com/ap/oa",
     * "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret":
     * "provider-app-client-secret", "token_request_method": "POST", "token_url":
     * "https://api.amazon.com/auth/o2/token" }`
     *
     * * **Google** - Create or update request: `"ProviderDetails": { "authorize_scopes": "email
     * profile openid", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret":
     * "provider-app-client-secret" }`
     *
     * Describe response: `"ProviderDetails": { "attributes_url":
     * "https://people.googleapis.com/v1/people/me?personFields=", "attributes_url_add_attributes":
     * "true", "authorize_scopes": "email profile openid", "authorize_url":
     * "https://accounts.google.com/o/oauth2/v2/auth", "client_id":
     * "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret",
     * "oidc_issuer": "https://accounts.google.com", "token_request_method": "POST", "token_url":
     * "https://www.googleapis.com/oauth2/v4/token" }`
     *
     * * **SignInWithApple** - Create or update request: `"ProviderDetails": { "authorize_scopes":
     * "email name", "client_id": "com.example.cognito", "private_key": "1EXAMPLE", "key_id":
     * "2EXAMPLE", "team_id": "3EXAMPLE" }`
     *
     * Describe response: `"ProviderDetails": { "attributes_url_add_attributes": "false",
     * "authorize_scopes": "email name", "authorize_url": "https://appleid.apple.com/auth/authorize",
     * "client_id": "com.example.cognito", "key_id": "1EXAMPLE", "oidc_issuer":
     * "https://appleid.apple.com", "team_id": "2EXAMPLE", "token_request_method": "POST", "token_url":
     * "https://appleid.apple.com/auth/token" }`
     *
     * * **Facebook** - Create or update request: `"ProviderDetails": { "api_version": "v17.0",
     * "authorize_scopes": "public_profile, email", "client_id": "1example23456789", "client_secret":
     * "provider-app-client-secret" }`
     *
     * Describe response: `"ProviderDetails": { "api_version": "v17.0", "attributes_url":
     * "https://graph.facebook.com/v17.0/me?fields=", "attributes_url_add_attributes": "true",
     * "authorize_scopes": "public_profile, email", "authorize_url":
     * "https://www.facebook.com/v17.0/dialog/oauth", "client_id": "1example23456789", "client_secret":
     * "provider-app-client-secret", "token_request_method": "GET", "token_url":
     * "https://graph.facebook.com/v17.0/oauth/access_token" }`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providerdetails)
     * @param providerDetails The scopes, URLs, and identifiers for your external identity provider.
     * 
     */
    override fun providerDetails(providerDetails: Any) {
      cdkBuilder.providerDetails(providerDetails)
    }

    /**
     * The IdP name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providername)
     * @param providerName The IdP name. 
     */
    override fun providerName(providerName: String) {
      cdkBuilder.providerName(providerName)
    }

    /**
     * The IdP type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-providertype)
     * @param providerType The IdP type. 
     */
    override fun providerType(providerType: String) {
      cdkBuilder.providerType(providerType)
    }

    /**
     * The user pool ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpoolidentityprovider.html#cfn-cognito-userpoolidentityprovider-userpoolid)
     * @param userPoolId The user pool ID. 
     */
    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build(): software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUserPoolIdentityProvider {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUserPoolIdentityProvider(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider):
        CfnUserPoolIdentityProvider = CfnUserPoolIdentityProvider(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolIdentityProvider):
        software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider = wrapped.cdkObject as
        software.amazon.awscdk.services.cognito.CfnUserPoolIdentityProvider
  }
}
